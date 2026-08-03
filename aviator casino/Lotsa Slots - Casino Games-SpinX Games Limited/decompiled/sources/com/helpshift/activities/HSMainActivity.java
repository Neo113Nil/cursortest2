package com.helpshift.activities;

/* loaded from: classes4.dex */
public class HSMainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, com.helpshift.activities.FragmentTransactionListener, com.helpshift.HSActivityEventHandler {
    private static final java.lang.String TAG = "chatActvty";
    private com.helpshift.config.HSConfigManager configManager;
    private android.widget.ImageView errorImageView;
    private androidx.fragment.app.FragmentManager fragmentManager;
    private boolean isHelpcenterOpenedBefore;
    android.view.View parentView;
    private android.view.View retryView;
    android.view.View topBar;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        try {
            if (!com.helpshift.core.HSContext.installCallSuccessful.get()) {
                bundle = null;
            }
            super.onCreate(bundle);
            if (!com.helpshift.core.HSContext.installCallSuccessful.get()) {
                android.util.Log.e(TAG, "Install call not successful, falling back to launcher activity");
                com.helpshift.util.ActivityUtil.startLauncherActivityAndFinish(this);
                return;
            }
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onCreate after install call check");
            setContentView(com.helpshift.R.layout.hs__chat_activity_layout);
            this.parentView = findViewById(com.helpshift.R.id.parent_view);
            android.view.View findViewById = findViewById(com.helpshift.R.id.view_top_bar);
            this.topBar = findViewById;
            com.helpshift.util.ViewUtil.handleEdgeToEdgeLayout(this.parentView, findViewById);
            try {
                setRequestedOrientation(com.helpshift.core.HSContext.getInstance().getPersistentStorage().getRequestedScreenOrientation());
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error setting orientation.", e);
            }
            if (!com.helpshift.util.ApplicationUtil.isWebViewAvailable(this)) {
                android.widget.Toast.makeText(getApplicationContext(), "Webview is not installed on your device!", 1).show();
                finish();
                return;
            }
            initViews();
            saveWebViewVersion();
            com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            com.helpshift.core.HSContext.getInstance().getAnalyticsEventDM().sendAllEvents();
            this.fragmentManager = getSupportFragmentManager();
            this.configManager = hSContext.getConfigManager();
            initService(getIntent(), false);
            initStatusBarColorOnServiceChange();
            com.helpshift.core.HSContext.getInstance().setHSActivityHandler(java.lang.Integer.valueOf(hashCode()), this);
        } catch (java.lang.Exception e2) {
            android.util.Log.e(TAG, "Caught exception in HSMainActivity.onCreate()", e2);
            if (com.helpshift.core.HSContext.installCallSuccessful.get()) {
                return;
            }
            com.helpshift.util.ActivityUtil.startLauncherActivityAndFinish(this);
        }
    }

    private void saveWebViewVersion() {
        android.content.pm.PackageInfo currentWebViewPackage;
        if (android.os.Build.VERSION.SDK_INT < 26 || (currentWebViewPackage = android.webkit.WebView.getCurrentWebViewPackage()) == null || com.helpshift.util.Utils.isEmpty(currentWebViewPackage.versionName)) {
            return;
        }
        com.helpshift.core.HSContext.getInstance().getConfigManager().saveWebViewVersion(currentWebViewPackage.versionName);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onStart");
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.setSdkIsOpen(true);
        hSContext.getHsEventProxy().sendEvent(com.helpshift.HelpshiftEvent.SDK_SESSION_STARTED, null);
        hSContext.getUserManager().stopIdentityDataSyncPoller("sdk_open");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onStop");
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.setSdkIsOpen(false);
        hSContext.getHsEventProxy().sendEvent(com.helpshift.HelpshiftEvent.SDK_SESSION_ENDED, null);
        hSContext.getUserManager().startIdentityDataSyncPoller("sdk_close");
    }

    private void initViews() {
        this.retryView = findViewById(com.helpshift.R.id.hs__retry_view);
        this.errorImageView = (android.widget.ImageView) findViewById(com.helpshift.R.id.hs__error_image);
        findViewById(com.helpshift.R.id.hs__retry_button).setOnClickListener(this);
        findViewById(com.helpshift.R.id.hs__retry_view_close_btn).setOnClickListener(this);
    }

    private void initService(android.content.Intent intent, boolean z) {
        if (!areConditionsValidToStartService(intent)) {
            showError();
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (isWebchatServiceRequested(extras)) {
            startWebchatFlow(z, sourceRequestingWebchat(extras));
        } else {
            startHelpcenterFlow(intent, z);
        }
        hideError();
    }

    private void showError() {
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, true);
    }

    private void hideError() {
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, false);
    }

    private boolean isWebchatServiceRequested(android.os.Bundle bundle) {
        return com.helpshift.util.ConfigValues.WEBCHAT_SERVICE.equalsIgnoreCase(bundle.getString(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY));
    }

    private java.lang.String sourceRequestingWebchat(android.os.Bundle bundle) {
        return bundle.getString("source");
    }

    private boolean isHelpcenterServiceRequested(android.os.Bundle bundle) {
        return com.helpshift.util.ConfigValues.HELP_CENTER_SERVICE.equalsIgnoreCase(bundle.getString(com.helpshift.util.ConfigValues.SERVICE_MODE_KEY));
    }

    private boolean areConditionsValidToStartService(android.content.Intent intent) {
        if (intent.getExtras() == null) {
            return false;
        }
        if (com.helpshift.core.HSContext.getInstance().getDevice().isOnline()) {
            return true;
        }
        this.errorImageView.setImageResource(com.helpshift.R.drawable.hs__no_internet_icon);
        return false;
    }

    public boolean isWebchatFragmentInStack() {
        boolean z = getSupportFragmentManager().findFragmentByTag(com.helpshift.chat.HSChatFragment.TAG) != null;
        com.helpshift.log.HSLogger.d(TAG, "isWebchatFragmentInStack: " + z);
        return z;
    }

    private void startWebchatFlow(boolean z, java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Trying to start webchat flow");
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.Fragment findFragmentById = supportFragmentManager.findFragmentById(com.helpshift.R.id.hs__container);
        java.util.List<androidx.fragment.app.Fragment> fragments = supportFragmentManager.getFragments();
        if (findFragmentById instanceof com.helpshift.chat.HSChatFragment) {
            com.helpshift.log.HSLogger.d(TAG, "HSChatFragment is at top of stack, resuming");
            if (com.helpshift.util.ConfigValues.SOURCE_PROACTIVE.equals(str)) {
                com.helpshift.log.HSLogger.d(TAG, "Update config with proactive outbound config in same webchat session");
                ((com.helpshift.chat.HSChatFragment) findFragmentById).setWebchatSourceChanged(com.helpshift.util.ConfigValues.SOURCE_PROACTIVE);
            }
            ((com.helpshift.chat.HSChatFragment) findFragmentById).setTransactionListener(this);
            return;
        }
        if ((findFragmentById instanceof com.helpshift.faq.HSHelpcenterFragment) && com.helpshift.util.Utils.isNotEmpty(fragments)) {
            com.helpshift.log.HSLogger.d(TAG, "HSHelpcenterFragment at top and HSChatFragment in stack, removing chat fragment");
            androidx.fragment.app.FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            androidx.fragment.app.Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.helpshift.chat.HSChatFragment.TAG);
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            beginTransaction.commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
        com.helpshift.log.HSLogger.d(TAG, "Creating new HSChatFragment: " + str + ", add to backstack: " + z);
        if (com.helpshift.core.HSContext.getInstance().isIsWebchatOpenedFromHelpcenter()) {
            com.helpshift.util.HSTimer.setStartTime("helpcenter");
        }
        if (com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION.equalsIgnoreCase(str)) {
            com.helpshift.util.HSTimer.setStartTime(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("source", str.toLowerCase());
        com.helpshift.chat.HSChatFragment hSChatFragment = new com.helpshift.chat.HSChatFragment();
        hSChatFragment.setArguments(bundle);
        hSChatFragment.setTransactionListener(this);
        androidx.fragment.app.FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
        if (z) {
            this.isHelpcenterOpenedBefore = true;
            beginTransaction2.setCustomAnimations(com.helpshift.R.anim.hs__slide_up, com.helpshift.R.anim.hs__slide_down, com.helpshift.R.anim.hs__slide_up, com.helpshift.R.anim.hs__slide_down);
        }
        beginTransaction2.add(com.helpshift.R.id.hs__container, hSChatFragment, com.helpshift.chat.HSChatFragment.TAG);
        if (z) {
            beginTransaction2.addToBackStack(null);
        }
        beginTransaction2.commitAllowingStateLoss();
    }

    private void startHelpcenterFlow(android.content.Intent intent, boolean z) {
        com.helpshift.faq.HSHelpcenterFragment newInstance = com.helpshift.faq.HSHelpcenterFragment.newInstance(intent.getExtras());
        newInstance.setFragmentTransactionListener(this);
        androidx.fragment.app.FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        beginTransaction.add(com.helpshift.R.id.hs__container, newInstance, com.helpshift.faq.HSHelpcenterFragment.TAG);
        if (z) {
            beginTransaction.addToBackStack(null);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onNewIntent");
        if (areConditionsValidToStartService(intent)) {
            android.os.Bundle extras = intent.getExtras();
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onNewIntent source: " + extras.getString("source"));
            com.helpshift.faq.HSHelpcenterFragment helpcenterFragment = getHelpcenterFragment();
            if (helpcenterFragment != null && isHelpcenterServiceRequested(extras)) {
                helpcenterFragment.reloadIframe(extras);
            } else {
                initService(intent, true);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == com.helpshift.R.id.hs__retry_view_close_btn) {
            finish();
        } else if (id == com.helpshift.R.id.hs__retry_button) {
            initService(getIntent(), false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.helpshift.log.HSLogger.d(TAG, "HSMainActivity back press");
        java.util.List<androidx.fragment.app.Fragment> fragments = this.fragmentManager.getFragments();
        androidx.fragment.app.Fragment topFragment = getTopFragment();
        if (topFragment == null) {
            com.helpshift.faq.HSHelpcenterFragment hSHelpcenterFragment = (com.helpshift.faq.HSHelpcenterFragment) this.fragmentManager.findFragmentByTag(com.helpshift.faq.HSHelpcenterFragment.TAG);
            if (hSHelpcenterFragment != null && hSHelpcenterFragment.canHelpCenterNavigateBack()) {
                com.helpshift.log.HSLogger.d(TAG, "HSMainActivity topFragment null, handle back from Helpcenter");
                hSHelpcenterFragment.helpcenterWebviewGoBack();
                return;
            }
            com.helpshift.chat.HSChatFragment hSChatFragment = (com.helpshift.chat.HSChatFragment) this.fragmentManager.findFragmentByTag(com.helpshift.chat.HSChatFragment.TAG);
            if (hSChatFragment != null) {
                com.helpshift.log.HSLogger.d(TAG, "HSMainActivity topFragment null, handle back from Webchat");
                hSChatFragment.handleBackPress();
                return;
            }
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity topFragment null, back press delegated to super");
        }
        if (topFragment instanceof com.helpshift.faq.HSHelpcenterFragment) {
            com.helpshift.faq.HSHelpcenterFragment hSHelpcenterFragment2 = (com.helpshift.faq.HSHelpcenterFragment) topFragment;
            if (hSHelpcenterFragment2.canHelpCenterNavigateBack()) {
                com.helpshift.log.HSLogger.d(TAG, "HSMainActivity topFragment not null, handle back press with Helpcenter");
                hSHelpcenterFragment2.helpcenterWebviewGoBack();
                return;
            }
        }
        if (topFragment instanceof com.helpshift.chat.HSChatFragment) {
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity topFragment not null, handle back press from Webchat");
            ((com.helpshift.chat.HSChatFragment) topFragment).handleBackPress();
            return;
        }
        if (this.fragmentManager.getBackStackEntryCount() == 1 && com.helpshift.util.Utils.isNotEmpty(fragments) && fragments.size() == 1) {
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity only one fragment left, finishing activity");
            finish();
        } else if (this.fragmentManager.getBackStackEntryCount() > 0) {
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity all check failed, popping backstack");
            this.fragmentManager.popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.helpshift.activities.FragmentTransactionListener
    public void handleBackPress(boolean z) {
        if (z) {
            return;
        }
        if (getTopFragment() == null) {
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity handleBackPress, back press delegated to super");
            super.onBackPressed();
        } else if (this.fragmentManager.getBackStackEntryCount() > 0) {
            com.helpshift.log.HSLogger.d(TAG, "HSMainActivity handleBackPress, popping backstack");
            this.fragmentManager.popBackStack();
        }
    }

    private androidx.fragment.app.Fragment getTopFragment() {
        if (this.fragmentManager.getBackStackEntryCount() == 0) {
            return null;
        }
        return this.fragmentManager.findFragmentById(com.helpshift.R.id.hs__container);
    }

    private com.helpshift.faq.HSHelpcenterFragment getHelpcenterFragment() {
        androidx.fragment.app.Fragment topFragment = getTopFragment();
        if (topFragment == null) {
            return (com.helpshift.faq.HSHelpcenterFragment) this.fragmentManager.findFragmentByTag(com.helpshift.faq.HSHelpcenterFragment.TAG);
        }
        if (topFragment instanceof com.helpshift.faq.HSHelpcenterFragment) {
            return (com.helpshift.faq.HSHelpcenterFragment) topFragment;
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.helpshift.log.HSLogger.d(TAG, "HSMainActivity onDestroy");
        if (com.helpshift.core.HSContext.installCallSuccessful.get()) {
            com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.clearHSActivityHandler(java.lang.Integer.valueOf(hashCode()));
            hSContext.getAnalyticsEventDM().sendQuitEvent();
            hSContext.getNotificationManager().showProactiveInAppNotificationIfPresent(false);
        }
    }

    @Override // com.helpshift.activities.FragmentTransactionListener
    public void openWebchat() {
        startWebchatFlow(true, "helpcenter");
    }

    @Override // com.helpshift.activities.FragmentTransactionListener
    public void closeWebchat() {
        onBackPressed();
    }

    @Override // com.helpshift.activities.FragmentTransactionListener
    public void closeHelpcenter() {
        onBackPressed();
    }

    private void initStatusBarColorOnServiceChange() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.addOnBackStackChangedListener(new androidx.fragment.app.FragmentManager.OnBackStackChangedListener() { // from class: com.helpshift.activities.HSMainActivity$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                com.helpshift.activities.HSMainActivity.this.m5625x2b3aef3a();
            }
        });
    }

    /* renamed from: lambda$initStatusBarColorOnServiceChange$0$com-helpshift-activities-HSMainActivity, reason: not valid java name */
    /* synthetic */ void m5625x2b3aef3a() {
        androidx.fragment.app.Fragment topFragment = getTopFragment();
        if (topFragment == null) {
            updateStatusBarColor(false, true);
        } else if (topFragment instanceof com.helpshift.chat.HSChatFragment) {
            updateStatusBarColor(false, false);
        } else if (topFragment instanceof com.helpshift.faq.HSHelpcenterFragment) {
            updateStatusBarColor(true, false);
        }
    }

    private void updateStatusBarColor(boolean z, boolean z2) {
        changeStatusBarColor(((z2 && this.isHelpcenterOpenedBefore) || z) ? this.configManager.getUiConfigDataOfHelpcenter() : this.configManager.getUiConfigDataOfWebchat());
    }

    @Override // com.helpshift.activities.FragmentTransactionListener
    public void changeStatusBarColor(java.lang.String str) {
        com.helpshift.util.ViewUtil.setStatusBarColor(this, str, this.topBar);
    }

    @Override // com.helpshift.HSActivityEventHandler
    public void closeActivity() {
        finish();
    }
}
