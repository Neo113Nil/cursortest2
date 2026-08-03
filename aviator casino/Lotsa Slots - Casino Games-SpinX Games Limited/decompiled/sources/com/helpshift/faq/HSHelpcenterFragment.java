package com.helpshift.faq;

/* loaded from: classes2.dex */
public class HSHelpcenterFragment extends androidx.fragment.app.Fragment implements com.helpshift.faq.HelpcenterToUiCallback, com.helpshift.notification.NotificationReceivedCallback, android.view.View.OnClickListener, com.helpshift.attachment.WebviewAttachmentCallback, com.helpshift.user_lifecyle.UserLifecycleListener {
    public static final java.lang.String LOCAL_HOST_URL = "https://localhost/";
    public static final java.lang.String TAG = "HelpCenter";
    private com.helpshift.attachment.CommonWebChromeClient chromeClient;
    private android.widget.ImageView errorImageView;
    private com.helpshift.faq.HSHelpcenterEventsHandler eventsHandler;
    private android.webkit.ValueCallback<android.net.Uri[]> filePathCallback;
    private com.helpshift.views.HSWebView helpCenterWebview;
    private android.widget.LinearLayout helpcenterLayout;
    private android.view.View loadingView;
    private android.view.View retryView;
    private com.helpshift.activities.FragmentTransactionListener transactionListener;

    public static com.helpshift.faq.HSHelpcenterFragment newInstance(android.os.Bundle bundle) {
        com.helpshift.faq.HSHelpcenterFragment hSHelpcenterFragment = new com.helpshift.faq.HSHelpcenterFragment();
        hSHelpcenterFragment.setArguments(bundle);
        return hSHelpcenterFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.helpshift.log.HSLogger.d(TAG, "onCreateView - " + hashCode());
        return layoutInflater.inflate(com.helpshift.R.layout.hs__helpcenter_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.helpshift.log.HSLogger.d(TAG, "onViewCreated - " + hashCode());
        android.os.Bundle arguments = getArguments();
        com.helpshift.core.HSContext.getInstance().getUserManager().addUserLifecycleListener(TAG, this);
        initViews(view);
        startHelpcenter(arguments);
    }

    private void initViews(android.view.View view) {
        this.helpCenterWebview = (com.helpshift.views.HSWebView) view.findViewById(com.helpshift.R.id.hs__helpcenter_view);
        this.loadingView = view.findViewById(com.helpshift.R.id.hs__loading_view);
        this.errorImageView = (android.widget.ImageView) view.findViewById(com.helpshift.R.id.hs__error_image);
        ((android.widget.ImageView) view.findViewById(com.helpshift.R.id.hs__chat_image)).setVisibility(8);
        this.retryView = view.findViewById(com.helpshift.R.id.hs__retry_view);
        this.helpcenterLayout = (android.widget.LinearLayout) view.findViewById(com.helpshift.R.id.hs__helpcenter_layout);
        view.findViewById(com.helpshift.R.id.hs__retry_view_close_btn).setOnClickListener(this);
        view.findViewById(com.helpshift.R.id.hs__loading_view_close_btn).setOnClickListener(this);
        view.findViewById(com.helpshift.R.id.hs__retry_button).setOnClickListener(this);
    }

    private void startHelpcenter(android.os.Bundle bundle) {
        if (bundle == null) {
            com.helpshift.log.HSLogger.e(TAG, "Bundle received in Helpcenter fragment is null.");
            onHelpcenterError();
            return;
        }
        final java.lang.String sourceCode = getSourceCode(bundle);
        if (com.helpshift.util.Utils.isEmpty(sourceCode)) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading the source code from assets folder.");
            onHelpcenterError();
        } else {
            showLoading();
            com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getUserManager().delayForDataSync(new java.lang.ref.WeakReference<>(new com.helpshift.util.ConsumeOnceListener<java.lang.Boolean>(hSContext.getHsThreadingService()) { // from class: com.helpshift.faq.HSHelpcenterFragment.1
                @Override // com.helpshift.util.ConsumeOnceListener
                public void consume(java.lang.Boolean bool) {
                    com.helpshift.faq.HSHelpcenterFragment.this.initWebviewWithHelpcenter(sourceCode);
                }
            }));
        }
    }

    private java.lang.String getSourceCode(android.os.Bundle bundle) {
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        com.helpshift.util.ValuePair<java.lang.String, java.lang.String> helpcenterModes = getHelpcenterModes(bundle);
        java.lang.String string = bundle.getString("source");
        return hSContext.getJsGenerator().getHelpcenterEmbeddedCodeString(com.helpshift.util.SdkURLs.HELPCENTER_MIDDLEWARE_JS, hSContext.getAssetStore().getAssetContent("helpshift/Helpcenter.js"), helpcenterModes.first, helpcenterModes.second, isWebchatInStackAlready(), string);
    }

    private com.helpshift.util.ValuePair<java.lang.String, java.lang.String> getHelpcenterModes(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2 = bundle.getString(com.helpshift.util.ConfigValues.HELPCENTER_MODE_KEY);
        string2.hashCode();
        java.lang.String str = "";
        if (string2.equals(com.helpshift.util.ConfigValues.HELPCENTER_MODE_FAQ_SECTION)) {
            string = bundle.getString(com.helpshift.util.ConfigValues.FAQ_SECTION_ID_KEY);
        } else if (string2.equals(com.helpshift.util.ConfigValues.HELPCENTER_MODE_SINGLE_FAQ)) {
            str = bundle.getString(com.helpshift.util.ConfigValues.SINGLE_FAQ_PUBLISH_ID_KEY);
            string = "";
        } else {
            string = "";
        }
        return new com.helpshift.util.ValuePair<>(str, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initWebviewWithHelpcenter(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Webview is launched");
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        com.helpshift.cache.HelpshiftResourceCacheManager helpcenterResourceCacheManager = hSContext.getHelpcenterResourceCacheManager();
        com.helpshift.faq.HSHelpcenterEventsHandler hSHelpcenterEventsHandler = new com.helpshift.faq.HSHelpcenterEventsHandler(hSContext.getUserManager(), hSContext.getConfigManager(), hSContext.getHsThreadingService(), helpcenterResourceCacheManager);
        this.eventsHandler = hSHelpcenterEventsHandler;
        hSHelpcenterEventsHandler.setHelpcenterUiCallback(this);
        com.helpshift.attachment.CommonWebChromeClient commonWebChromeClient = new com.helpshift.attachment.CommonWebChromeClient("HCWVClient", new com.helpshift.attachment.WebviewAttachmentCallbackProxy(this, hSContext.getHsThreadingService()));
        this.chromeClient = commonWebChromeClient;
        commonWebChromeClient.setFilePathCallback(this.filePathCallback);
        this.helpCenterWebview.setWebChromeClient(this.chromeClient);
        this.helpCenterWebview.setWebViewClient(new com.helpshift.faq.HSHelpcenterWebViewClient(helpcenterResourceCacheManager, this.eventsHandler));
        this.helpCenterWebview.addJavascriptInterface(new com.helpshift.faq.HelpcenterToNativeBridge(this.eventsHandler), "HCInterface");
        this.helpCenterWebview.loadDataWithBaseURL("https://localhost/", str, "text/html", com.ironsource.B5.O, null);
    }

    public boolean canHelpCenterNavigateBack() {
        if (this.retryView.getVisibility() == 0 || this.loadingView.getVisibility() == 0) {
            return false;
        }
        return canHelpcenterWebviewGoBack();
    }

    public boolean canHelpcenterWebviewGoBack() {
        return this.helpCenterWebview.canGoBack();
    }

    public void helpcenterWebviewGoBack() {
        callHelpcenterApi(com.helpshift.config.HSJSGenerator.backBtnClickJs);
        this.helpCenterWebview.goBack();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.helpshift.log.HSLogger.d(TAG, "onStart - " + hashCode());
        com.helpshift.core.HSContext.getInstance().getNotificationManager().setNotificationReceivedCallback(this);
        sendLifecycleEventToHelpCenter(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        sendLifecycleEventToHelpCenter(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.helpshift.log.HSLogger.d(TAG, "onDestroy - " + hashCode());
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getNotificationManager().setNotificationReceivedCallback(null);
        hSContext.getUserManager().removeUserLifeCycleListener(TAG);
        com.helpshift.faq.HSHelpcenterEventsHandler hSHelpcenterEventsHandler = this.eventsHandler;
        if (hSHelpcenterEventsHandler != null) {
            hSHelpcenterEventsHandler.setHelpcenterUiCallback(null);
        }
        hSContext.setIsWebchatOpenedFromHelpcenter(false);
        this.helpcenterLayout.removeView(this.helpCenterWebview);
        this.helpCenterWebview.destroyCustomWebview();
        this.helpCenterWebview = null;
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void closeHelpcenter() {
        com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener = this.transactionListener;
        if (fragmentTransactionListener != null) {
            fragmentTransactionListener.closeHelpcenter();
        }
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void openWebchat() {
        if (this.transactionListener != null) {
            com.helpshift.core.HSContext.getInstance().setIsWebchatOpenedFromHelpcenter(true);
            this.transactionListener.openWebchat();
        }
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void onHelpcenterLoaded() {
        showHelpcenter();
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void setNativeUiColors(java.lang.String str) {
        com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener = this.transactionListener;
        if (fragmentTransactionListener != null) {
            fragmentTransactionListener.changeStatusBarColor(str);
        }
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void addWebviewToCurrentUI(android.webkit.WebView webView) {
        this.helpcenterLayout.addView(webView);
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void sendIntentToSystemApp(android.content.Intent intent) {
        try {
            startActivity(intent);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Unable to resolve the activity for this intent", e);
        }
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void showNotificationBadgeOnHCLoad() {
        onNotificationReceived();
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void getWebchatData() {
        setWebChatLocalStorageData();
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void setAttachmentFilePathCallback(android.webkit.ValueCallback<android.net.Uri[]> valueCallback) {
        this.filePathCallback = valueCallback;
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void openFileChooser(android.content.Intent intent, int i) {
        startActivityForResult(intent, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.helpshift.log.HSLogger.d(TAG, "onActivityResult, request code: " + i + " , resultCode: " + i2);
        if (i == 0) {
            this.filePathCallback.onReceiveValue(null);
            return;
        }
        if (i == 1001) {
            if (this.filePathCallback == null) {
                com.helpshift.log.HSLogger.d(TAG, "filePathCallback is null, return");
                return;
            }
            if (intent == null) {
                com.helpshift.log.HSLogger.d(TAG, "intent is null");
            }
            this.filePathCallback.onReceiveValue(com.helpshift.util.ViewUtil.parseResultForFileFromWebView(intent, i2));
            this.filePathCallback = null;
            this.chromeClient.setFilePathCallback(null);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == com.helpshift.R.id.hs__loading_view_close_btn || id == com.helpshift.R.id.hs__retry_view_close_btn) {
            closeHelpcenter();
        } else if (id == com.helpshift.R.id.hs__retry_button) {
            showLoading();
            this.helpCenterWebview.reload();
        }
    }

    public void sendLifecycleEventToHelpCenter(boolean z) {
        if (this.loadingView.getVisibility() != 0) {
            callHelpcenterApi(com.helpshift.config.HSJSGenerator.sendForegroundEvent.replace("%foreground", "" + z));
        }
    }

    private void showLoading() {
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, true);
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, false);
    }

    private void showHelpcenter() {
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, false);
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, false);
    }

    private void showError() {
        if (com.helpshift.core.HSContext.getInstance().getDevice().isOnline()) {
            this.errorImageView.setImageResource(com.helpshift.R.drawable.hs__error_icon);
        } else {
            this.errorImageView.setImageResource(com.helpshift.R.drawable.hs__no_internet_icon);
        }
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, true);
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, false);
    }

    @Override // com.helpshift.faq.HelpcenterToUiCallback
    public void onHelpcenterError() {
        showError();
    }

    public void setFragmentTransactionListener(com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener) {
        this.transactionListener = fragmentTransactionListener;
    }

    @Override // com.helpshift.notification.NotificationReceivedCallback
    public void onNotificationReceived() {
        com.helpshift.user.UserManager userManager = com.helpshift.core.HSContext.getInstance().getUserManager();
        int unreadNotificationCount = userManager.getUnreadNotificationCount();
        int pushUnreadNotificationCount = userManager.getPushUnreadNotificationCount();
        if (unreadNotificationCount > 0 || pushUnreadNotificationCount > 0) {
            callHelpcenterApi(com.helpshift.config.HSJSGenerator.showNotificationBadgeJS.replace("%count", java.lang.String.valueOf(java.lang.Math.max(unreadNotificationCount, pushUnreadNotificationCount))));
        }
    }

    public void setWebChatLocalStorageData() {
        callHelpcenterApi(com.helpshift.config.HSJSGenerator.sendWebchatData.replace("%data", com.helpshift.core.HSContext.getInstance().getConfigManager().getLocalStorageData()));
    }

    public void reloadIframe(android.os.Bundle bundle) {
        com.helpshift.util.ValuePair<java.lang.String, java.lang.String> helpcenterModes = getHelpcenterModes(bundle);
        callHelpcenterApi(com.helpshift.config.HSJSGenerator.reloadIframeJS.replace("%helpshiftConfig", com.helpshift.core.HSContext.getInstance().getConfigManager().getHelpcenterConfigJs(helpcenterModes.first, helpcenterModes.second, isWebchatInStackAlready(), bundle.getString("source"))));
    }

    public void callHelpcenterApi(final java.lang.String str) {
        com.helpshift.core.HSContext.getInstance().getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterFragment.this.m5664x2d69076f(str);
            }
        });
    }

    /* renamed from: lambda$callHelpcenterApi$0$com-helpshift-faq-HSHelpcenterFragment, reason: not valid java name */
    /* synthetic */ void m5664x2d69076f(java.lang.String str) {
        if (this.helpCenterWebview == null) {
            com.helpshift.log.HSLogger.d(TAG, "error callHelpcenterApi, webview is null");
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Executing command: " + str);
        com.helpshift.util.ViewUtil.callJavascriptCode(this.helpCenterWebview, str, null);
    }

    private boolean isWebchatInStackAlready() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity instanceof com.helpshift.activities.HSMainActivity) {
            return ((com.helpshift.activities.HSMainActivity) activity).isWebchatFragmentInStack();
        }
        return false;
    }

    @Override // com.helpshift.user_lifecyle.UserLifecycleListener
    public void onUserDidLogout() {
        com.helpshift.log.HSLogger.d(TAG, "user logged out. Updating HC config");
        updateHelpcenterConfig();
    }

    @Override // com.helpshift.user_lifecyle.UserLifecycleListener
    public void onUserDidLogin() {
        com.helpshift.log.HSLogger.d(TAG, "user logged in. Updating HC config");
        updateHelpcenterConfig();
    }

    private void updateHelpcenterConfig() {
        com.helpshift.log.HSLogger.d(TAG, "Sending update helpshift config event to helpcenter");
        android.os.Bundle arguments = getArguments();
        callHelpcenterApi(com.helpshift.config.HSJSGenerator.updateHelpCenterConfig.replace("%helpshiftConfig", com.helpshift.core.HSContext.getInstance().getConfigManager().getHelpcenterConfigJs("", "", isWebchatInStackAlready(), arguments != null ? arguments.getString("source", "") : "api")));
    }
}
