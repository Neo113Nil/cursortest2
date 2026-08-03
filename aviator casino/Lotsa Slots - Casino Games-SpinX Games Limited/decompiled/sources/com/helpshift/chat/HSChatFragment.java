package com.helpshift.chat;

/* loaded from: classes.dex */
public class HSChatFragment extends androidx.fragment.app.Fragment implements com.helpshift.chat.HSWebchatToUiCallback, com.helpshift.user_lifecyle.UserLifecycleListener, android.view.View.OnClickListener, com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback, com.helpshift.attachment.WebviewAttachmentCallback {
    public static final java.lang.String LOCAL_HOST_URL = "https://localhost/";
    public static final java.lang.String TAG = "HSChatFragment";
    private com.helpshift.attachment.CommonWebChromeClient chromeClient;
    private android.widget.TextView errorMessageTextView;
    private com.helpshift.chat.HSChatEventsHandler eventsHandler;
    private android.webkit.ValueCallback<android.net.Uri[]> filePathCallback;
    private boolean isWebchatSourceChanged;
    private android.view.View loadingView;
    private android.view.View retryView;
    private com.helpshift.activities.FragmentTransactionListener transactionListener;
    private com.helpshift.views.HSWebView webView;
    private java.lang.String webchatJsFileLoadingTime;
    private java.lang.String webchatSource;
    private android.widget.LinearLayout webviewLayout;
    private boolean shouldSendPollerEvent = true;
    private boolean isKeyboardVisible = false;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.helpshift.chat.HSChatFragment$$ExternalSyntheticLambda0
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            com.helpshift.chat.HSChatFragment.this.m5648lambda$new$0$comhelpshiftchatHSChatFragment();
        }
    };

    /* renamed from: lambda$new$0$com-helpshift-chat-HSChatFragment, reason: not valid java name */
    /* synthetic */ void m5648lambda$new$0$comhelpshiftchatHSChatFragment() {
        if (this.webView == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        this.webView.getWindowVisibleDisplayFrame(rect);
        int height = this.webView.getRootView().getHeight();
        boolean z = ((double) (height - rect.bottom)) > ((double) height) * 0.15d;
        if (z != this.isKeyboardVisible) {
            sendKeyboardToggleEvent(z);
        }
        this.isKeyboardVisible = z;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.helpshift.log.HSLogger.d(TAG, "onCreateView() - " + hashCode());
        android.view.View inflate = layoutInflater.inflate(com.helpshift.R.layout.hs__webchat_fragment_layout, viewGroup, false);
        if (getArguments() != null) {
            this.webchatSource = getArguments().getString("source");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.helpshift.log.HSLogger.d(TAG, "onViewCreated() - " + hashCode());
        com.helpshift.core.HSContext.getInstance().getUserManager().addUserLifecycleListener(TAG, this);
        initViews(view);
        startChatView();
    }

    private void initViews(android.view.View view) {
        this.loadingView = view.findViewById(com.helpshift.R.id.hs__loading_view);
        this.retryView = view.findViewById(com.helpshift.R.id.hs__retry_view);
        this.errorMessageTextView = (android.widget.TextView) view.findViewById(com.helpshift.R.id.hs__error_message);
        this.webviewLayout = (android.widget.LinearLayout) view.findViewById(com.helpshift.R.id.hs__webview_layout);
        this.webView = (com.helpshift.views.HSWebView) view.findViewById(com.helpshift.R.id.hs__webchat_webview);
        view.findViewById(com.helpshift.R.id.hs__retry_view_close_btn).setOnClickListener(this);
        view.findViewById(com.helpshift.R.id.hs__loading_view_close_btn).setOnClickListener(this);
        view.findViewById(com.helpshift.R.id.hs__retry_button).setOnClickListener(this);
    }

    private void startChatView() {
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        final java.lang.String webchatEmbeddedCodeString = hSContext.getJsGenerator().getWebchatEmbeddedCodeString(com.helpshift.util.SdkURLs.AWS_WEBCHAT_JS, hSContext.getAssetStore().getAssetContent("helpshift/Webchat.js"), this.webchatSource, hSContext.isIsWebchatOpenedFromHelpcenter());
        if (com.helpshift.util.Utils.isEmpty(webchatEmbeddedCodeString)) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading the source code from assets folder");
            onWebchatError("");
        } else {
            showLoadingView();
            hSContext.getUserManager().delayForDataSync(new java.lang.ref.WeakReference<>(new com.helpshift.util.ConsumeOnceListener<java.lang.Boolean>(hSContext.getHsThreadingService()) { // from class: com.helpshift.chat.HSChatFragment.1
                @Override // com.helpshift.util.ConsumeOnceListener
                public void consume(java.lang.Boolean bool) {
                    com.helpshift.chat.HSChatFragment.this.initWebviewWithWebchat(webchatEmbeddedCodeString);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initWebviewWithWebchat(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Webview is launched");
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        com.helpshift.chat.HSChatEventsHandler hSChatEventsHandler = new com.helpshift.chat.HSChatEventsHandler(hSContext.getUserManager(), hSContext.getHsThreadingService(), hSContext.getConfigManager(), hSContext.getChatResourceCacheManager(), hSContext.getGenericDataManager(), hSContext.getNativeToSdkxMigrator());
        this.eventsHandler = hSChatEventsHandler;
        hSChatEventsHandler.setUiEventsListener(this);
        com.helpshift.attachment.WebviewAttachmentCallbackProxy webviewAttachmentCallbackProxy = new com.helpshift.attachment.WebviewAttachmentCallbackProxy(this, hSContext.getHsThreadingService());
        com.helpshift.attachment.CommonWebChromeClient commonWebChromeClient = new com.helpshift.attachment.CommonWebChromeClient("chatWVClient", webviewAttachmentCallbackProxy);
        this.chromeClient = commonWebChromeClient;
        commonWebChromeClient.setFilePathCallback(this.filePathCallback);
        this.webView.setWebChromeClient(this.chromeClient);
        this.webView.setWebViewClient(new com.helpshift.chat.HSChatWebViewClient(hSContext.getChatResourceCacheManager(), webviewAttachmentCallbackProxy, this.eventsHandler));
        this.webView.addJavascriptInterface(new com.helpshift.chat.HSChatToNativeBridge(hSContext.getHsEventProxy(), this.eventsHandler), "HSInterface");
        this.webView.loadDataWithBaseURL("https://localhost/", str, "text/html", com.ironsource.B5.O, null);
    }

    public void setTransactionListener(com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener) {
        this.transactionListener = fragmentTransactionListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        com.helpshift.log.HSLogger.d(TAG, "onStop() - " + hashCode());
        if (this.shouldSendPollerEvent) {
            sendLifecycleEventToWebchat(false);
        }
        com.helpshift.core.HSContext.getInstance().setWebchatUIIsOpen(false);
        this.webView.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.helpshift.log.HSLogger.d(TAG, "onStart() -" + hashCode());
        sendLifecycleEventToWebchat(true);
        com.helpshift.core.HSContext.getInstance().setWebchatUIIsOpen(true);
        this.webView.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.helpshift.log.HSLogger.d(TAG, "onPause() -" + hashCode());
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        if (activity != null && !activity.isChangingConfigurations()) {
            com.helpshift.core.HSContext.getInstance().getConversationPoller().startPoller();
        }
        hSContext.getHsConnectivityManager().unregisterNetworkConnectivityListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        com.helpshift.log.HSLogger.d(TAG, "onResume() -" + hashCode());
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null && !activity.isChangingConfigurations()) {
            hSContext.getConversationPoller().stopPoller();
        }
        hSContext.getHsConnectivityManager().registerNetworkConnectivityListener(getContext(), this);
        if (hSContext.isWebchatUIOpen() && this.isWebchatSourceChanged) {
            com.helpshift.log.HSLogger.d(TAG, "Updating config with latest config in same webchat session");
            try {
                callWebchatApi("window.helpshiftConfig = JSON.parse(JSON.stringify(" + hSContext.getConfigManager().getWebchatConfigJs(hSContext.isIsWebchatOpenedFromHelpcenter(), this.webchatSource) + "));Helpshift('updateClientConfigWithoutReload');", null);
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Failed to update webchat config with latest config ", e);
            }
        }
        clearNotifications();
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void sendIntentToSystemApp(android.content.Intent intent) {
        try {
            startActivity(intent);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in opening a link in system app", e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.helpshift.log.HSLogger.d(TAG, "onDestroy() -" + hashCode());
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getUserManager().removeUserLifeCycleListener(TAG);
        com.helpshift.chat.HSChatEventsHandler hSChatEventsHandler = this.eventsHandler;
        if (hSChatEventsHandler != null) {
            hSChatEventsHandler.setUiEventsListener(null);
        }
        this.webviewLayout.removeView(this.webView);
        this.webView.destroyCustomWebview();
        this.webView = null;
        hSContext.getPersistentStorage().setLastRequestUnreadCountApiAccess(0L);
        hSContext.getUserManager().markAllPushMessagesAsRead();
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void onWebchatClosed() {
        com.helpshift.log.HSLogger.d(TAG, "onWebchatClosed");
        com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener = this.transactionListener;
        if (fragmentTransactionListener != null) {
            fragmentTransactionListener.closeWebchat();
        }
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void onWebchatLoaded() {
        com.helpshift.log.HSLogger.d(TAG, "onWebchatLoaded");
        showWebchatView();
        clearNotifications();
        com.helpshift.core.HSContext.getInstance().getUserManager().markAllMessagesAsRead();
        com.helpshift.core.HSContext.getInstance().getUserManager().markAllPushMessagesAsRead();
        java.lang.String migrationErrorLogs = com.helpshift.core.HSContext.getInstance().getNativeToSdkxMigrator().getMigrationErrorLogs();
        if (com.helpshift.util.Utils.isNotEmpty(migrationErrorLogs)) {
            callWebchatApi("Helpshift('sdkxMigrationLog', '" + migrationErrorLogs + "' ) ", null);
        }
        sendKeyboardToggleEvent(this.isKeyboardVisible);
        sendOrientationChangeEventToWebchat(getResources().getConfiguration().orientation);
        sendNetworkConfigurationChangeEvent(com.helpshift.core.HSContext.getInstance().getDevice().isOnline() ? androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
        if (com.helpshift.util.Utils.isNotEmpty(this.webchatJsFileLoadingTime)) {
            sendTimeToLoadWebchatEvent(this.webchatJsFileLoadingTime);
        }
    }

    private void clearNotifications() {
        android.content.Context context = getContext();
        if (context != null) {
            com.helpshift.util.ApplicationUtil.cancelNotification(context);
        }
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void onWebchatError(java.lang.String str) {
        com.helpshift.log.HSLogger.e(TAG, "Received onWebchatError event with error message: " + str);
        showErrorView(str);
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void addWebviewToCurrentUI(android.webkit.WebView webView) {
        this.webviewLayout.addView(webView);
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void onUiConfigChange(java.lang.String str) {
        com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener = this.transactionListener;
        if (fragmentTransactionListener != null) {
            fragmentTransactionListener.changeStatusBarColor(str);
        }
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void onUserAuthenticationFailure() {
        com.helpshift.log.HSLogger.e(TAG, "Received onUserAuthenticationFailure event");
        showErrorView("");
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void webchatJsFileLoaded() {
        long endTimer = com.helpshift.util.HSTimer.endTimer(this.webchatSource);
        if (endTimer > 0) {
            this.webchatJsFileLoadingTime = getWebchatJsFileLoadingTime(java.lang.Long.valueOf(endTimer));
        }
        com.helpshift.log.HSLogger.d(TAG, "Webchat.js Loaded, Stopping loading timer");
    }

    private java.lang.String getWebchatJsFileLoadingTime(java.lang.Long l) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("source", this.webchatSource);
            jSONObject.put("time", l.toString());
            return jSONObject.toString();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Failed to calculate webchat.js loading time", e);
            return "";
        }
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void requestConversationMetadata(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i = jSONObject.getInt("bclConfig");
            int i2 = jSONObject.getInt("dbglConfig");
            com.helpshift.log.HSLogger.d(TAG, "Log limits: breadcrumb: " + i + ", debug logs: " + i2);
            com.helpshift.config.HSConfigManager configManager = com.helpshift.core.HSContext.getInstance().getConfigManager();
            org.json.JSONArray breadCrumbs = configManager.getBreadCrumbs(i);
            org.json.JSONArray debugLogs = configManager.getDebugLogs(i2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("bcl", breadCrumbs);
            jSONObject2.put("dbgl", debugLogs);
            java.lang.String jSONObject3 = jSONObject2.toString();
            com.helpshift.log.HSLogger.d(TAG, "Sending log/crumb data to webchat: " + jSONObject3);
            callWebchatApi("Helpshift('syncConversationMetadata',JSON.stringify(" + jSONObject3 + "));", null);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error with request conversation meta call", e);
        }
    }

    @Override // com.helpshift.chat.HSWebchatToUiCallback
    public void setHelpcenterData() {
        try {
            java.lang.String additionalInfo = com.helpshift.core.HSContext.getInstance().getConfigManager().getAdditionalInfo();
            if (com.helpshift.util.Utils.isEmpty(additionalInfo)) {
                additionalInfo = "{}";
            }
            callWebchatApi("Helpshift('setHelpcenterData',JSON.stringify(" + additionalInfo + "));", null);
            com.helpshift.log.HSLogger.d(TAG, "Called setHelpcenterData function on webchat");
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error with setHelpcenterData call", e);
        }
    }

    @Override // com.helpshift.user_lifecyle.UserLifecycleListener
    public void onUserDidLogout() {
        com.helpshift.log.HSLogger.d(TAG, "user logged out. Updating Webchat config");
        updateWebchatConfig();
    }

    @Override // com.helpshift.user_lifecyle.UserLifecycleListener
    public void onUserDidLogin() {
        com.helpshift.log.HSLogger.d(TAG, "user logged in. Updating Webchat config");
        updateWebchatConfig();
    }

    public void setWebchatSourceChanged(java.lang.String str) {
        this.isWebchatSourceChanged = true;
        com.helpshift.log.HSLogger.d(TAG, "Webchat source changed to " + str + " from " + this.webchatSource);
        this.webchatSource = str;
    }

    public void updateWebchatConfig() {
        com.helpshift.log.HSLogger.d(TAG, "Sending update helpshift config event to webchat");
        callWebchatApi(com.helpshift.config.HSJSGenerator.updateWebChatConfig.replace("%config", com.helpshift.core.HSContext.getInstance().getConfigManager().getWebchatConfigJs(false, this.webchatSource)), null);
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void setAttachmentFilePathCallback(android.webkit.ValueCallback<android.net.Uri[]> valueCallback) {
        this.filePathCallback = valueCallback;
    }

    @Override // com.helpshift.attachment.WebviewAttachmentCallback
    public void openFileChooser(android.content.Intent intent, int i) {
        this.shouldSendPollerEvent = false;
        startActivityForResult(intent, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.shouldSendPollerEvent = true;
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
            onWebchatClosed();
        } else if (id == com.helpshift.R.id.hs__retry_button) {
            startChatView();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sendOrientationChangeEventToWebchat(configuration.orientation);
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkAvailable() {
        sendNetworkConfigurationChangeEvent(androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY);
    }

    @Override // com.helpshift.util.network.connectivity.HSNetworkConnectivityCallback
    public void onNetworkUnavailable() {
        sendNetworkConfigurationChangeEvent("offline");
    }

    private void showErrorView(java.lang.String str) {
        setErrorMessage(str);
        hideKeyboard();
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, true);
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, false);
    }

    private void hideKeyboard() {
        android.view.View view = getView();
        android.content.Context context = getContext();
        if (view == null || context == null) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    private void setErrorMessage(java.lang.String str) {
        this.errorMessageTextView.setText(str);
        com.helpshift.util.ViewUtil.setVisibility(this.errorMessageTextView, !str.trim().isEmpty());
    }

    private void showWebchatView() {
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, false);
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, false);
        com.helpshift.util.ViewUtil.setVisibility(this.errorMessageTextView, false);
    }

    private void showLoadingView() {
        com.helpshift.util.ViewUtil.setVisibility(this.loadingView, true);
        com.helpshift.util.ViewUtil.setVisibility(this.retryView, false);
    }

    private void callWebchatApi(final java.lang.String str, final android.webkit.ValueCallback<java.lang.String> valueCallback) {
        com.helpshift.core.HSContext.getInstance().getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatFragment.this.m5646lambda$callWebchatApi$1$comhelpshiftchatHSChatFragment(str, valueCallback);
            }
        });
    }

    /* renamed from: lambda$callWebchatApi$1$com-helpshift-chat-HSChatFragment, reason: not valid java name */
    /* synthetic */ void m5646lambda$callWebchatApi$1$comhelpshiftchatHSChatFragment(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        if (this.webView == null) {
            com.helpshift.log.HSLogger.d(TAG, "error callWebchatApi, webview is null");
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Executing command: " + str);
        com.helpshift.util.ViewUtil.callJavascriptCode(this.webView, str, valueCallback);
    }

    public void sendLifecycleEventToWebchat(boolean z) {
        callWebchatApi("Helpshift('sdkxIsInForeground'," + z + ");", null);
    }

    public void sendOrientationChangeEventToWebchat(int i) {
        callWebchatApi("Helpshift('onOrientationChange','" + (i == 1 ? "portrait" : "landscape") + "');", null);
    }

    public void sendKeyboardToggleEvent(boolean z) {
        callWebchatApi("Helpshift('onKeyboardToggle','" + (!z ? "close" : "open") + "');", null);
    }

    public void sendTimeToLoadWebchatEvent(java.lang.String str) {
        callWebchatApi("Helpshift('nativeLoadTime','" + str + "');", null);
    }

    public void sendNetworkConfigurationChangeEvent(java.lang.String str) {
        callWebchatApi("Helpshift('onNetworkStatusChange','" + str + "');", null);
    }

    public void handleBackPress() {
        callWebchatApi("Helpshift('backBtnPress');", new android.webkit.ValueCallback() { // from class: com.helpshift.chat.HSChatFragment$$ExternalSyntheticLambda2
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.helpshift.chat.HSChatFragment.this.m5647lambda$handleBackPress$2$comhelpshiftchatHSChatFragment((java.lang.String) obj);
            }
        });
    }

    /* renamed from: lambda$handleBackPress$2$com-helpshift-chat-HSChatFragment, reason: not valid java name */
    /* synthetic */ void m5647lambda$handleBackPress$2$comhelpshiftchatHSChatFragment(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Back press handle from webchat" + str);
        com.helpshift.activities.FragmentTransactionListener fragmentTransactionListener = this.transactionListener;
        if (fragmentTransactionListener != null) {
            fragmentTransactionListener.handleBackPress(java.lang.Boolean.parseBoolean(str));
        }
    }
}
