package com.knotapi.knot.ui.fragments;

/* loaded from: classes9.dex */
public class MerchantWebViewListenerFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.knotapi.knot.interfaces.MerchantViewListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final java.lang.String ARG_BOT = "bot";
    public static com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment INSTANCE = null;
    public static final java.lang.String TAG = "Knot:MerchantWebViewListenerFragment";
    public com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    public android.webkit.WebView errorWebView;
    java.lang.String exitConfirmationTitle;
    java.lang.String exitNoButton;
    java.lang.String exitOverlayCloseButton;
    java.lang.String exitYesButton;
    java.lang.String knotBottomSheetDialog;
    public android.widget.ImageView mBackIcon;
    public com.knotapi.knot.models.Bot mBot;
    public android.widget.ImageView mImgCloseWeb;
    public android.widget.ImageView mKnotIcon;
    android.widget.ProgressBar mLoader;
    public android.widget.RelativeLayout mLoaderContainer;
    android.widget.TextView mTvRefresh;
    private android.widget.RelativeLayout mainContentView;
    private int[] merchantIds;
    public com.knotapi.knot.webview.KnotView merchantWebView;
    java.lang.String metaBackButton;
    java.lang.String metaClose;
    private android.widget.LinearLayout noInternetView;
    private java.util.Map<java.lang.String, java.lang.String> pendingAssets;
    java.lang.String pressedBackInitial;
    java.lang.String pressedExitInitial;
    public java.util.List<com.knotapi.knot.utilities.Cookie> transactionCookies;
    public android.webkit.WebView transactionWebView;
    public com.knotapi.knot.interfaces.MerchantWebViewDelegate webViewDelegate;
    public java.lang.Boolean shouldStartBot = java.lang.Boolean.FALSE;
    private java.lang.String lastLoadedUrl = "";
    private final android.view.View.OnClickListener onBackIconClick = new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda1
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10827x7067dd7c(view);
        }
    };
    public com.knotapi.knot.models.ExtraInfo mExtraInfo = new com.knotapi.knot.models.ExtraInfo();

    /* renamed from: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$1, reason: invalid class name */
    public class AnonymousClass1 extends android.net.ConnectivityManager.NetworkCallback {
        final /* synthetic */ java.lang.Boolean[] val$isFirstLoad;

        public AnonymousClass1(java.lang.Boolean[] boolArr) {
            this.val$isFirstLoad = boolArr;
        }

        /* renamed from: lambda$onAvailable$0$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment$1, reason: not valid java name */
        /* synthetic */ void m10838x29cedb92(java.lang.Boolean[] boolArr) {
            if (!com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.lastLoadedUrl.isEmpty() && !boolArr[0].booleanValue()) {
                java.lang.String str = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.TAG;
                java.lang.String unused = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.lastLoadedUrl;
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.merchantWebView.loadUrl(merchantWebViewListenerFragment.lastLoadedUrl);
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.lastLoadedUrl = "";
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.manageNoInternetView(java.lang.Boolean.FALSE);
            }
            boolArr[0] = java.lang.Boolean.FALSE;
        }

        /* renamed from: lambda$onLost$1$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment$1, reason: not valid java name */
        /* synthetic */ void m10839x5214ada6() {
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
            com.knotapi.knot.webview.KnotView knotView = merchantWebViewListenerFragment.merchantWebView;
            merchantWebViewListenerFragment.lastLoadedUrl = knotView != null ? knotView.getUrl() : "";
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.manageNoInternetView(java.lang.Boolean.TRUE);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            super.onAvailable(network);
            try {
                if (com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.getActivity() != null) {
                    androidx.fragment.app.FragmentActivity activity = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.getActivity();
                    final java.lang.Boolean[] boolArr = this.val$isFirstLoad;
                    activity.runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass1.this.m10838x29cedb92(boolArr);
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            super.onLost(network);
            try {
                if (com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.getActivity() != null) {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass1.this.m10839x5214ada6();
                        }
                    });
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* renamed from: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$4, reason: invalid class name */
    public class AnonymousClass4 {
        public AnonymousClass4() {
        }

        /* renamed from: lambda$onErrorViewContinue$1$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment$4, reason: not valid java name */
        /* synthetic */ void m10840x8d1996a1() {
            try {
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.merchantWebView.clear();
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.webViewDelegate.removeFragment(merchantWebViewListenerFragment.mBot.getBotId(), false);
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment2 = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment2.webViewDelegate.userCloseMerchantView(merchantWebViewListenerFragment2.mBot.getBotId(), com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.mBot.getMerchantId());
            } catch (java.lang.Exception unused) {
                java.lang.String str = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.TAG;
            }
        }

        /* renamed from: lambda$onTryAgain$0$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment$4, reason: not valid java name */
        /* synthetic */ void m10841xd4f69aa9() {
            try {
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.merchantWebView.clear();
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment.webViewDelegate.removeFragment(merchantWebViewListenerFragment.mBot.getBotId(), false);
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment2 = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                merchantWebViewListenerFragment2.webViewDelegate.onTryAgain(merchantWebViewListenerFragment2.mBot);
            } catch (java.lang.Exception unused) {
                java.lang.String str = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.TAG;
            }
        }

        @android.webkit.JavascriptInterface
        public void onErrorViewContinue(java.lang.String str) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass4.this.m10840x8d1996a1();
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void onTryAgain(java.lang.String str) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass4.this.m10841xd4f69aa9();
                }
            });
        }
    }

    private void addWebViewToContainer(android.view.View view) {
        try {
            com.knotapi.knot.webview.KnotView knotView = this.merchantWebView;
            if (knotView != null) {
                if (knotView.getParent() != null) {
                    ((android.view.ViewGroup) this.merchantWebView.getParent()).removeView(this.merchantWebView);
                }
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view.findViewById(com.knotapi.knot.R.id.webView_container);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(3, com.knotapi.knot.R.id.error_webview);
                relativeLayout.addView(this.merchantWebView, layoutParams);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void checkNetworkConnectivity() {
        java.lang.Boolean[] boolArr = {java.lang.Boolean.TRUE};
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass1 anonymousClass1 = new com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass1(boolArr);
        android.net.ConnectivityManager connectivityManager = getActivity() != null ? (android.net.ConnectivityManager) getActivity().getSystemService(android.net.ConnectivityManager.class) : null;
        if (connectivityManager != null) {
            connectivityManager.requestNetwork(build, anonymousClass1);
        }
    }

    private void errorWebViewSetup() {
        try {
            this.errorWebView.getSettings().setJavaScriptEnabled(true);
            this.errorWebView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.3
                @Override // android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                    super.onPageFinished(webView, str);
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.mLoaderContainer.setVisibility(8);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
                    webView.loadUrl(str);
                    return true;
                }
            });
            this.errorWebView.addJavascriptInterface(new com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.AnonymousClass4(), "JSInterface");
        } catch (java.lang.Exception unused) {
        }
    }

    public static com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment getInstance() {
        return INSTANCE;
    }

    private void handleBackPressed() {
        if (this.merchantWebView == null || this.mBackIcon.getVisibility() != 0) {
            return;
        }
        com.knotapi.knot.webview.KnotView knotView = this.merchantWebView;
        java.lang.String url = knotView != null ? knotView.getUrl() : "";
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
        if (merchantWebViewDelegate != null) {
            merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, this.metaBackButton, url);
        }
        if (this.merchantWebView.canGoBack()) {
            this.merchantWebView.goBack();
            return;
        }
        this.merchantWebView.clear();
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate2 = this.webViewDelegate;
        if (merchantWebViewDelegate2 != null) {
            merchantWebViewDelegate2.sendNativeLogEvent(java.lang.Integer.valueOf(this.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, this.pressedBackInitial, url);
            this.webViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        }
    }

    static /* synthetic */ void lambda$onStart$10(android.view.View view) {
        try {
            android.view.View view2 = (android.view.View) view.getParent();
            if (view2 != null) {
                androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
                if (behavior instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
                    com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = (com.google.android.material.bottomsheet.BottomSheetBehavior) behavior;
                    bottomSheetBehavior.setPeekHeight(view.getMeasuredHeight());
                    bottomSheetBehavior.setDraggable(false);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    static /* synthetic */ androidx.core.view.WindowInsetsCompat lambda$onViewCreated$2(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars()).top, view.getPaddingRight(), view.getPaddingBottom());
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void manageNoInternetView(java.lang.Boolean bool) {
        try {
            if (bool.booleanValue()) {
                this.noInternetView.setVisibility(0);
                this.mainContentView.setVisibility(8);
                this.mBackIcon.setVisibility(8);
                this.mKnotIcon.setVisibility(8);
                return;
            }
            this.mainContentView.setVisibility(0);
            this.noInternetView.setVisibility(8);
            this.mBackIcon.setVisibility(0);
            this.mKnotIcon.setVisibility(0);
        } catch (java.lang.Exception unused) {
        }
    }

    public static com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment newInstance(com.knotapi.knot.models.Bot bot) {
        com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = new com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(ARG_BOT, bot);
        merchantWebViewListenerFragment.setArguments(bundle);
        return merchantWebViewListenerFragment;
    }

    private void transactionWebViewSetup() {
        try {
            android.webkit.WebSettings settings = this.transactionWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setTextZoom(100);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            settings.setSupportZoom(true);
            settings.setCacheMode(this.mBot.isLoadNoCacheMode() ? 2 : -1);
            settings.setUseWideViewPort(true);
            settings.setSaveFormData(true);
            this.transactionWebView.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.2
                @Override // android.webkit.WebViewClient
                public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this;
                    merchantWebViewListenerFragment.transactionCookies = merchantWebViewListenerFragment.getTransactionCookies(str);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    private void webViewSetup() {
        try {
            this.shouldStartBot = java.lang.Boolean.FALSE;
            if (this.merchantWebView == null || getActivity() == null) {
                return;
            }
            this.merchantWebView.init(getActivity(), this).setBot(this.mBot).setDefaultSettings().setInjectedAssets(this.pendingAssets).start();
            com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.getInstance();
            popupChromeClient.init(getActivity(), this.merchantWebView, this.webViewDelegate, this.mBot);
            this.merchantWebView.setWebChromeClient(popupChromeClient);
        } catch (java.lang.Exception unused) {
        }
    }

    public com.knotapi.knot.utilities.Cookie buildTransactionCookie(java.lang.String str, java.lang.String str2) {
        try {
            return com.knotapi.knot.utilities.Cookie.buildCookie(str, str2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getTransactionCookies(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.String cookie = android.webkit.CookieManager.getInstance().getCookie(str);
            if (cookie != null && !cookie.isEmpty()) {
                for (java.lang.String str2 : cookie.split(";")) {
                    com.knotapi.knot.utilities.Cookie buildTransactionCookie = buildTransactionCookie(str2, str);
                    if (buildTransactionCookie != null) {
                        arrayList.add(buildTransactionCookie);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void hideBottomFragment() {
        try {
            dismiss();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public boolean isErrorViewVisible() {
        try {
            android.webkit.WebView webView = this.errorWebView;
            if (webView != null) {
                return webView.getVisibility() == 0;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public boolean isLoaderVisible() {
        return this.mLoaderContainer.getVisibility() == 0;
    }

    /* renamed from: lambda$new$1$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10827x7067dd7c(android.view.View view) {
        handleBackPressed();
    }

    /* renamed from: lambda$onCreateDialog$0$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ boolean m10828x9dd8f158(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate;
        if (i != 4 || (merchantWebViewDelegate = this.webViewDelegate) == null) {
            return false;
        }
        merchantWebViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        this.webViewDelegate = null;
        return false;
    }

    /* renamed from: lambda$onCreateView$3$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10829x176cf978() {
        this.mLoader.setVisibility(8);
        this.mTvRefresh.setVisibility(0);
    }

    /* renamed from: lambda$onCreateView$4$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10830xafc7db9(android.view.View view) {
        try {
            this.mTvRefresh.setVisibility(8);
            this.mLoader.setVisibility(0);
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10829x176cf978();
                }
            }, 2000L);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: lambda$onCreateView$5$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10831xfe8c01fa(java.lang.String str, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
        int botId = this.mBot.getBotId();
        merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(botId), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, this.exitNoButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
    }

    /* renamed from: lambda$onCreateView$6$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10832xf21b863b(java.lang.String str, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
        int botId = this.mBot.getBotId();
        merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(botId), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, this.exitYesButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
        com.knotapi.knot.webview.KnotView knotView = this.merchantWebView;
        if (knotView != null) {
            knotView.clear();
        }
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate2 = this.webViewDelegate;
        int botId2 = this.mBot.getBotId();
        merchantWebViewDelegate2.sendNativeLogEvent(java.lang.Integer.valueOf(botId2), com.knotapi.knot.utilities.Constants.META_FLOW, this.pressedExitInitial, str);
        com.knotapi.knot.models.Bot bot = this.mBot;
        if (bot != null) {
            this.webViewDelegate.userCloseMerchantView(bot.getBotId(), this.mBot.getMerchantId());
        }
    }

    /* renamed from: lambda$onCreateView$7$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10833xe5ab0a7c(java.lang.String str, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
        int botId = this.mBot.getBotId();
        merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(botId), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, this.exitOverlayCloseButton, str);
        if (knotBottomSheetDialog.isAdded()) {
            knotBottomSheetDialog.closeSheet();
        }
    }

    /* renamed from: lambda$onCreateView$8$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10834xd93a8ebd(final java.lang.String str, android.view.View view) {
        try {
            if (this.noInternetView.getVisibility() == 0 && getActivity() != null) {
                getActivity().finish();
                return;
            }
            com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            if (merchantWebViewDelegate != null) {
                int botId = this.mBot.getBotId();
                merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(botId), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, this.metaClose, str);
                java.lang.String str2 = this.knotBottomSheetDialog;
                if (getActivity() != null) {
                    androidx.fragment.app.FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
                    com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog = (com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog) supportFragmentManager.findFragmentByTag(str2);
                    if (knotBottomSheetDialog == null || !knotBottomSheetDialog.isVisible()) {
                        final com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog2 = new com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog(this.webViewDelegate);
                        knotBottomSheetDialog2.setDialogOptions(new com.knotapi.knot.models.DialogOptions(this.exitConfirmationTitle, "", this.exitNoButton, this.exitYesButton, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda8
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view2) {
                                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10831xfe8c01fa(str, knotBottomSheetDialog2, view2);
                            }
                        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda9
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view2) {
                                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10832xf21b863b(str, knotBottomSheetDialog2, view2);
                            }
                        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view2) {
                                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10833xe5ab0a7c(str, knotBottomSheetDialog2, view2);
                            }
                        }, ""));
                        knotBottomSheetDialog2.show(supportFragmentManager, str2);
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "MerchantWebViewListenerFragment.onBackIconClick");
        }
    }

    /* renamed from: lambda$onResume$9$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ boolean m10835x6228e76a(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && getActivity() != null && this.noInternetView.getVisibility() == 0) {
            getActivity().finish();
        }
        return true;
    }

    /* renamed from: lambda$setLoaderVisibility$11$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10836x86b52e46() {
        this.mLoaderContainer.setVisibility(8);
    }

    /* renamed from: lambda$setLoaderVisibility$12$com-knotapi-knot-ui-fragments-MerchantWebViewListenerFragment, reason: not valid java name */
    /* synthetic */ void m10837x7a44b287(int i) {
        this.mLoaderContainer.setVisibility(i);
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void loadTransactionUrl(java.lang.String str) {
        try {
            android.webkit.WebView webView = this.transactionWebView;
            if (webView != null) {
                webView.loadUrl(str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        try {
            this.webViewDelegate = (com.knotapi.knot.interfaces.MerchantWebViewDelegate) getActivity();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, com.knotapi.knot.R.style.BottomSheetDialogThemeNoFloating);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        try {
            this.dialog = new com.google.android.material.bottomsheet.BottomSheetDialog(requireContext(), getTheme());
            if (getArguments() != null) {
                this.mBot = (com.knotapi.knot.models.Bot) getArguments().getParcelable(ARG_BOT);
            }
            if (this.dialog.getWindow() != null) {
                this.dialog.getWindow().getAttributes().windowAnimations = com.knotapi.knot.R.style.BottomSheetDialogAnimation;
            }
            this.dialog.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                    return com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10828x9dd8f158(dialogInterface, i, keyEvent);
                }
            });
            return this.dialog;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "MerchantWebViewListenerFragment");
            return new com.google.android.material.bottomsheet.BottomSheetDialog(requireContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.Exception e;
        android.view.View inflate;
        android.view.View view = null;
        try {
            inflate = layoutInflater.inflate(com.knotapi.knot.R.layout.fragment_merchant_web_view, viewGroup, false);
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        try {
            this.mLoaderContainer = (android.widget.RelativeLayout) inflate.findViewById(com.knotapi.knot.R.id.loader_container);
            this.errorWebView = (android.webkit.WebView) inflate.findViewById(com.knotapi.knot.R.id.error_webview);
            android.webkit.WebView webView = (android.webkit.WebView) inflate.findViewById(com.knotapi.knot.R.id.transaction_webview);
            this.transactionWebView = webView;
            webView.setVisibility(8);
            this.mBackIcon = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.back_icon);
            this.mKnotIcon = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.img_knot);
            this.noInternetView = (android.widget.LinearLayout) inflate.findViewById(com.knotapi.knot.R.id.llNoInternet);
            this.mainContentView = (android.widget.RelativeLayout) inflate.findViewById(com.knotapi.knot.R.id.rlWebView);
            this.mImgCloseWeb = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.imgCloseWeb);
            this.mTvRefresh = (android.widget.TextView) inflate.findViewById(com.knotapi.knot.R.id.tvRefresh);
            this.mLoader = (android.widget.ProgressBar) inflate.findViewById(com.knotapi.knot.R.id.progressBar);
            if (this.merchantWebView != null) {
                addWebViewToContainer(inflate);
            }
            if (this.mBot.getDetached().booleanValue()) {
                this.mLoaderContainer.setVisibility(8);
            }
            this.mBackIcon.setOnClickListener(this.onBackIconClick);
            this.errorWebView.setVisibility(8);
            this.mBackIcon.setVisibility(0);
            if (!this.mBot.getDetached().booleanValue()) {
                webViewSetup();
            }
            errorWebViewSetup();
            transactionWebViewSetup();
            if (this.webViewDelegate != null) {
                com.knotapi.knot.webview.KnotView knotView = this.merchantWebView;
                this.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, knotView != null ? knotView.getUrl() : "");
            }
            this.mLoaderContainer.setOnClickListener(null);
            com.knotapi.knot.webview.KnotView knotView2 = this.merchantWebView;
            final java.lang.String url = knotView2 != null ? knotView2.getUrl() : "";
            this.mTvRefresh.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10830xafc7db9(view2);
                }
            });
            this.mImgCloseWeb.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda6
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10834xd93a8ebd(url, view2);
                }
            });
            INSTANCE = this;
            checkNetworkConnectivity();
            return inflate;
        } catch (java.lang.Exception e3) {
            e = e3;
            view = inflate;
            com.knotapi.knot.services.ErrorReporter.report(e, "MerchantWebViewListenerFragment.onCreateView");
            return view;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.webViewDelegate != null) {
                com.knotapi.knot.webview.KnotView knotView = this.merchantWebView;
                this.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, knotView != null ? knotView.getUrl() : "");
                this.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, getString(com.knotapi.knot.R.string.webView_closed), "");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getDialog() != null) {
            getDialog().setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda4
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                    return com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10835x6228e76a(dialogInterface, i, keyEvent);
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.View findViewById;
        super.onStart();
        try {
            android.app.Dialog dialog = getDialog();
            if (dialog != null && (findViewById = dialog.findViewById(com.google.android.material.R.id.design_bottom_sheet)) != null) {
                findViewById.getLayoutParams().height = -1;
            }
            final android.view.View view = getView();
            if (view != null) {
                view.post(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.lambda$onStart$10(view);
                    }
                });
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(view.findViewById(com.knotapi.knot.R.id.fragment_root_layout), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view2, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                    return com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.lambda$onViewCreated$2(view2, windowInsetsCompat);
                }
            });
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "MerchantWebViewListenerFragment.onViewCreated");
        }
        this.metaClose = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.meta_close, com.knotapi.knot.utilities.Constants.META_CLOSE, this);
        this.exitConfirmationTitle = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.exit_confirmation_title, com.knotapi.knot.utilities.Constants.EXIT_CONFIRMATION_TITLE, this);
        this.exitNoButton = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.exit_no_button, com.knotapi.knot.utilities.Constants.EXIT_NO_BUTTON, this);
        this.exitYesButton = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.exit_yes_button, com.knotapi.knot.utilities.Constants.EXIT_YES_BUTTON, this);
        this.exitOverlayCloseButton = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.exit_overlay_close_button, com.knotapi.knot.utilities.Constants.EXIT_OVERLAY_CLOSE_BUTTON, this);
        this.pressedExitInitial = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.pressed_exit_initial, com.knotapi.knot.utilities.Constants.PRESSED_EXIT_INITIAL, this);
        this.pressedBackInitial = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.pressed_back_initial, com.knotapi.knot.utilities.Constants.PRESSED_BACK_INITIAL, this);
        this.metaBackButton = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.meta_back_button, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, this);
        this.knotBottomSheetDialog = com.knotapi.knot.utilities.Helper.safeGetString(com.knotapi.knot.R.string.knot_bottom_sheet_dialog, com.knotapi.knot.utilities.Constants.KNOT_BOTTOM_SHEET_DIALOG, this);
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void sendPageUrl(java.lang.String str) {
        try {
            com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            if (merchantWebViewDelegate != null) {
                int botId = this.mBot.getBotId();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("URL change: ");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(botId);
                sb.append(str);
                merchantWebViewDelegate.sendNativeLogEvent(valueOf, com.knotapi.knot.utilities.Constants.META_FLOW, sb.toString(), str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void sendRunningEvent(java.lang.String str, java.lang.String str2) {
        try {
            if (this.mBot.isTransactionsUrlSet()) {
                this.webViewDelegate.sendRunningEvent(this.mBot.getBotId(), com.knotapi.knot.utilities.Helper.formatCookiesForPuppeteer(this.merchantWebView.getCookies()), com.knotapi.knot.utilities.Helper.formatCookiesForPuppeteer(this.transactionCookies), this.merchantWebView.mExtraInfo, java.lang.Boolean.valueOf(!this.shouldStartBot.booleanValue()), str, str2);
            } else {
                this.webViewDelegate.sendRunningEvent(this.mBot.getBotId(), com.knotapi.knot.utilities.Helper.formatCookiesForPuppeteer(this.merchantWebView.getCookies()), "", this.merchantWebView.mExtraInfo, java.lang.Boolean.valueOf(!this.shouldStartBot.booleanValue()), str, str2);
            }
        } catch (java.lang.Exception unused) {
        }
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("paymentURL: ");
        sb.append(this.mBot.getPaymentUrl());
        printStream.println(sb.toString());
        this.merchantWebView.evaluateJavascript(this.mBot.getScript(), null);
        if (this.mBot.getDetached().booleanValue()) {
            return;
        }
        dismiss();
    }

    public void setBot(com.knotapi.knot.models.Bot bot) {
        this.mBot = bot;
    }

    public void setInjectedAssets(java.util.Map<java.lang.String, java.lang.String> map) {
        this.pendingAssets = map;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void setLoaderVisibility(final int i) {
        try {
            android.widget.RelativeLayout relativeLayout = this.mLoaderContainer;
            if (relativeLayout != null) {
                com.knotapi.knot.webview.KnotViewClient knotViewClient = this.merchantWebView.viewClient;
                if (knotViewClient.isLoaderShownForRedirection) {
                    return;
                }
                if (knotViewClient.delayLoader && i == 8) {
                    relativeLayout.postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda11
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10836x86b52e46();
                        }
                    }, 1000L);
                } else if (getActivity() != null) {
                    getActivity().runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment$$ExternalSyntheticLambda12
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.this.m10837x7a44b287(i);
                        }
                    });
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void setMerchantIds(int[] iArr) {
        this.merchantIds = iArr;
    }

    public void setMerchantWebView(com.knotapi.knot.webview.KnotView knotView) {
        this.merchantWebView = knotView;
    }

    public void setWebViewDelegate(com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate) {
        this.webViewDelegate = merchantWebViewDelegate;
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void showErrorView(java.lang.String str) {
        try {
            android.webkit.WebView webView = this.errorWebView;
            if (webView != null) {
                webView.setVisibility(0);
                this.mBackIcon.setVisibility(8);
                this.errorWebView.loadUrl(str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantViewListener
    public void toggleBackButton(boolean z) {
        if (!z) {
            try {
                android.widget.ImageView imageView = this.mBackIcon;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        android.widget.ImageView imageView2 = this.mBackIcon;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }
}
