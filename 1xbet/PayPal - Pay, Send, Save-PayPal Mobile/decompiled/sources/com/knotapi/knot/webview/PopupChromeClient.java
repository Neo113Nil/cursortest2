package com.knotapi.knot.webview;

/* loaded from: classes9.dex */
public class PopupChromeClient extends android.webkit.WebChromeClient implements com.knotapi.knot.interfaces.LoaderHandler {
    private static com.knotapi.knot.webview.PopupChromeClient INSTANCE = null;
    private static final java.lang.String TAG = "Knot:PopupChromeClient";
    public androidx.fragment.app.FragmentActivity activity;
    public android.widget.ImageView backButton;
    public com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog bottomSheet;
    public android.app.AlertDialog builder;
    public android.widget.ImageView closeButton;
    public com.knotapi.knot.webview.KnotView knotView;
    android.widget.RelativeLayout loaderContainer;
    public android.widget.RelativeLayout loader_container;
    public com.knotapi.knot.models.Bot mBot;
    public com.knotapi.knot.interfaces.MerchantWebViewDelegate webViewDelegate;
    public android.webkit.WebView webViewPopUp;
    com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper = new com.knotapi.knot.utilities.SsoCookieHelper();
    private boolean isLoaderVisible = false;

    public static com.knotapi.knot.webview.PopupChromeClient getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new com.knotapi.knot.webview.PopupChromeClient();
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performCustomActions() {
        this.knotView.performAllBulkActions(this.webViewPopUp, true);
        this.knotView.defaultAction(this.webViewPopUp);
    }

    public void handleBackPress() {
        com.knotapi.knot.models.Bot bot;
        if (this.knotView != null && (bot = this.mBot) != null && bot.getMerchantId() == 2325) {
            this.webViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        }
        this.webViewPopUp.destroy();
        this.builder.dismiss();
        com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper = this.ssoCookieHelper;
        ssoCookieHelper.ssoSessionActive = false;
        ssoCookieHelper.dialogShown = false;
        ssoCookieHelper.proceedWithoutCookies = false;
    }

    public void init(androidx.fragment.app.FragmentActivity fragmentActivity, com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate, com.knotapi.knot.models.Bot bot) {
        this.activity = fragmentActivity;
        this.knotView = knotView;
        this.webViewDelegate = merchantWebViewDelegate;
        this.mBot = bot;
    }

    /* renamed from: lambda$onCreateWindow$0$com-knotapi-knot-webview-PopupChromeClient, reason: not valid java name */
    /* synthetic */ void m10863x3798282f(final java.lang.String str, android.view.View view) {
        this.bottomSheet = new com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog(this.webViewDelegate);
        this.bottomSheet.setDialogOptions(new com.knotapi.knot.models.DialogOptions(com.knotapi.knot.utilities.Constants.EXIT_CONFIRMATION_TITLE, "", com.knotapi.knot.utilities.Constants.EXIT_NO_BUTTON, com.knotapi.knot.utilities.Constants.EXIT_YES_BUTTON, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.knotapi.knot.webview.PopupChromeClient.this.bottomSheet.closeSheet();
            }
        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.6
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                if (popupChromeClient.webViewDelegate != null) {
                    popupChromeClient.bottomSheet.closeSheet();
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.destroy();
                    com.knotapi.knot.webview.PopupChromeClient popupChromeClient2 = com.knotapi.knot.webview.PopupChromeClient.this;
                    popupChromeClient2.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(popupChromeClient2.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, "Pressed exit button on SSO page", str);
                    com.knotapi.knot.webview.PopupChromeClient popupChromeClient3 = com.knotapi.knot.webview.PopupChromeClient.this;
                    popupChromeClient3.webViewDelegate.userCloseMerchantView(popupChromeClient3.mBot.getBotId(), com.knotapi.knot.webview.PopupChromeClient.this.mBot.getMerchantId());
                    com.knotapi.knot.webview.PopupChromeClient.this.builder.dismiss();
                }
            }
        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.7
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                popupChromeClient.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(popupChromeClient.mBot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, com.knotapi.knot.utilities.Constants.EXIT_OVERLAY_CLOSE_BUTTON, str);
                com.knotapi.knot.webview.PopupChromeClient.this.bottomSheet.closeSheet();
            }
        }, ""));
        this.bottomSheet.show(this.activity.getSupportFragmentManager(), this.bottomSheet.getTag());
    }

    /* renamed from: lambda$onCreateWindow$1$com-knotapi-knot-webview-PopupChromeClient, reason: not valid java name */
    /* synthetic */ void m10864xfa84918e(android.view.View view) {
        handleBackPress();
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(android.webkit.WebView webView) {
        android.webkit.WebView webView2 = this.webViewPopUp;
        java.lang.String url = webView2 != null ? webView2.getUrl() : "";
        try {
            this.webViewPopUp.destroy();
        } catch (java.lang.Exception e) {
            com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.webViewDelegate;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.mBot.getBotId());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Destroyed with Error ");
            sb.append(e.getMessage());
            merchantWebViewDelegate.sendNativeLogEvent(valueOf, com.knotapi.knot.utilities.Constants.META_CONSOLE_ERROR, sb.toString(), url);
        }
        try {
            this.builder.dismiss();
        } catch (java.lang.Exception e2) {
            com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate2 = this.webViewDelegate;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.mBot.getBotId());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Dismissed with Error: ");
            sb2.append(e2.getMessage());
            merchantWebViewDelegate2.sendNativeLogEvent(valueOf2, com.knotapi.knot.utilities.Constants.META_CONSOLE_ERROR, sb2.toString(), url);
        }
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        if (knotView != null) {
            knotView.viewClient.onLoadResource(knotView, knotView.getUrl());
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        android.view.View inflate = this.activity.getLayoutInflater().inflate(com.knotapi.knot.R.layout.dialog_sso_web_view, (android.view.ViewGroup) null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate.findViewById(com.knotapi.knot.R.id.loader_container);
        this.loaderContainer = relativeLayout;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = com.knotapi.knot.utilities.ScreenUtils.getScreenHeight(this.activity);
        this.loaderContainer.setLayoutParams(layoutParams);
        this.webViewPopUp = new android.webkit.WebView(this.activity);
        if (this.mBot.getMerchantId() == 15) {
            this.webViewPopUp.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        } else {
            this.webViewPopUp.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        }
        this.webViewPopUp.clearCache(true);
        this.webViewPopUp.clearHistory();
        this.webViewPopUp.setVerticalScrollBarEnabled(false);
        this.webViewPopUp.setHorizontalScrollBarEnabled(false);
        this.webViewPopUp.getSettings().setJavaScriptEnabled(true);
        this.webViewPopUp.getSettings().setDomStorageEnabled(true);
        this.webViewPopUp.getSettings().setSupportZoom(true);
        this.webViewPopUp.getSettings().setSaveFormData(true);
        this.webViewPopUp.getSettings().setTextZoom(100);
        this.webViewPopUp.getSettings().setEnableSmoothTransition(true);
        this.webViewPopUp.setWebChromeClient(getInstance());
        this.webViewPopUp.getSettings().setUserAgentString(this.mBot.getAndroidFbSSO().isEmpty() ? this.mBot.getAndroidSSOGlobal() : this.mBot.getAndroidFbSSO());
        this.webViewPopUp.getSettings().setSavePassword(true);
        android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this.webViewPopUp, true);
        this.webViewPopUp.setVisibility(8);
        this.webViewPopUp.addJavascriptInterface(new java.lang.Object() { // from class: com.knotapi.knot.webview.PopupChromeClient.2
            @android.webkit.JavascriptInterface
            public void domChanged(java.lang.String str) {
                if (str == null || str.isEmpty()) {
                    str = "{}";
                }
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                com.knotapi.knot.utilities.ScreenshotHelper.startScreenshotFlow(popupChromeClient.webViewPopUp, popupChromeClient.knotView, str);
            }
        }, "JSInterface");
        this.webViewPopUp.setWebViewClient(new android.webkit.WebViewClient() { // from class: com.knotapi.knot.webview.PopupChromeClient.3
            @Override // android.webkit.WebViewClient
            public void onLoadResource(android.webkit.WebView webView2, java.lang.String str) {
                super.onLoadResource(webView2, str);
                if (com.knotapi.knot.webview.PopupChromeClient.this.mBot.getMerchantId() == 80) {
                    android.webkit.WebSettings settings = com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.getSettings();
                    com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                    settings.setUserAgentString(popupChromeClient.mBot.getUserAgent(popupChromeClient.knotView));
                }
                com.knotapi.knot.webview.PopupChromeClient.this.performCustomActions();
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient2 = com.knotapi.knot.webview.PopupChromeClient.this;
                popupChromeClient2.ssoCookieHelper.fetchEmailFromWebView(webView2, popupChromeClient2.knotView, popupChromeClient2.activity);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView2, java.lang.String str) {
                super.onPageFinished(webView2, str);
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                popupChromeClient.ssoCookieHelper.saveCookiesForDomain(popupChromeClient.activity, str);
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient2 = com.knotapi.knot.webview.PopupChromeClient.this;
                com.knotapi.knot.utilities.RunCustomScript.runScriptInPopUpView(popupChromeClient2.mBot, popupChromeClient2.webViewPopUp, popupChromeClient2.activity, true);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(android.webkit.WebView webView2, java.lang.String str, android.graphics.Bitmap bitmap) {
                try {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.LISTEN_DOM_CHANGES, null);
                    com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                    com.knotapi.knot.utilities.SsoLoginHelper.processSSO(str, popupChromeClient.mBot, popupChromeClient.knotView, popupChromeClient.ssoCookieHelper, popupChromeClient, true);
                } catch (java.lang.Exception unused) {
                    java.lang.String unused2 = com.knotapi.knot.webview.PopupChromeClient.TAG;
                }
            }

            @Override // android.webkit.WebViewClient
            public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView2, android.webkit.WebResourceRequest webResourceRequest) {
                if (com.knotapi.knot.utilities.Helper.matchesAnyCondition(com.knotapi.knot.webview.PopupChromeClient.this.mBot.getBlockedUrls(), webResourceRequest.getUrl().toString())) {
                    return new android.webkit.WebResourceResponse("text/plain", "UTF-8", null);
                }
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                if (!popupChromeClient.ssoCookieHelper.checkShouldIntercept(webView2, webResourceRequest, popupChromeClient.activity, popupChromeClient.knotView)) {
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
                com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper = com.knotapi.knot.webview.PopupChromeClient.this.ssoCookieHelper;
                return new android.webkit.WebResourceResponse(ssoCookieHelper.mimeType, ssoCookieHelper.encoding, new java.io.ByteArrayInputStream(new byte[0]));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(android.webkit.WebView webView2, android.webkit.WebResourceRequest webResourceRequest) {
                com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.this;
                return popupChromeClient.knotView.viewClient.googlePasskeyLoader(webResourceRequest, true, popupChromeClient);
            }
        });
        android.app.AlertDialog create = new android.app.AlertDialog.Builder(this.activity, android.R.style.Theme.Material.Light.NoActionBar).create();
        this.builder = create;
        create.setTitle("");
        this.builder.setView(this.webViewPopUp);
        this.builder.setCancelable(false);
        this.builder.setCanceledOnTouchOutside(false);
        this.builder.setCustomTitle(inflate);
        this.builder.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.4
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                com.knotapi.knot.models.Bot bot;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                android.webkit.WebView webView2 = com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp;
                if (webView2 == null || !webView2.canGoBack() || (bot = com.knotapi.knot.webview.PopupChromeClient.this.mBot) == null || bot.getMerchantId() == 2325) {
                    com.knotapi.knot.webview.PopupChromeClient.this.handleBackPress();
                } else {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.goBack();
                }
                return true;
            }
        });
        this.closeButton = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.close_icon);
        android.webkit.WebView webView2 = this.webViewPopUp;
        final java.lang.String url = webView2 != null ? webView2.getUrl() : "";
        this.closeButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.webview.PopupChromeClient.this.m10863x3798282f(url, view);
            }
        });
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.knotapi.knot.R.id.back_icon);
        this.backButton = imageView;
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.webview.PopupChromeClient.this.m10864xfa84918e(view);
            }
        });
        this.loader_container = (android.widget.RelativeLayout) inflate.findViewById(com.knotapi.knot.R.id.loader_container);
        this.builder.show();
        this.builder.getWindow().clearFlags(131080);
        android.webkit.CookieManager.getInstance().setAcceptCookie(true);
        ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(this.webViewPopUp);
        message.sendToTarget();
        return true;
    }

    public void setLoaderVisibility(int i) {
        android.webkit.WebView webView;
        android.webkit.WebView webView2;
        com.knotapi.knot.webview.KnotViewClient knotViewClient = this.knotView.viewClient;
        if (knotViewClient.isLoaderShownForRedirection) {
            return;
        }
        if (knotViewClient.delayLoader && i == 8) {
            this.loader_container.postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.PopupChromeClient.8
                @Override // java.lang.Runnable
                public void run() {
                    com.knotapi.knot.webview.PopupChromeClient.this.loader_container.setVisibility(8);
                    com.knotapi.knot.webview.PopupChromeClient.this.isLoaderVisible = false;
                    android.webkit.WebView webView3 = com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp;
                    if (webView3 != null) {
                        webView3.setVisibility(0);
                    }
                }
            }, 1000L);
            return;
        }
        this.loader_container.setVisibility(i);
        boolean z = i == 0;
        this.isLoaderVisible = z;
        if (z && (webView2 = this.webViewPopUp) != null) {
            webView2.setVisibility(8);
        } else {
            if (z || (webView = this.webViewPopUp) == null) {
                return;
            }
            webView.setVisibility(0);
        }
    }

    public void setUserAgentAndVisibility(java.lang.String str, java.lang.String str2) {
        this.webViewPopUp.getSettings().setUserAgentString(str);
        updateWebViewPopUpVisibility(str2);
    }

    @Override // com.knotapi.knot.interfaces.LoaderHandler
    public void showLoader() {
        setLoaderVisibility(0);
    }

    public void updateWebViewPopUpVisibility(final java.lang.String str) {
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.PopupChromeClient.1
            /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
            
                if (r0.equals("spotify") != false) goto L22;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                com.knotapi.knot.webview.PopupChromeClient.this.setLoaderVisibility(8);
                char c = 0;
                if (!com.knotapi.knot.webview.PopupChromeClient.this.isLoaderVisible) {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.setVisibility(0);
                }
                java.lang.String str2 = str;
                str2.hashCode();
                int hashCode = str2.hashCode();
                if (hashCode != -1998723398) {
                    if (hashCode != -1240244679) {
                        if (hashCode == 497130182 && str2.equals("facebook")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (str2.equals(com.adjust.sdk.Constants.REFERRER_API_GOOGLE)) {
                            c = 1;
                        }
                        c = 65535;
                    }
                }
                if (c == 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.String.valueOf(com.knotapi.knot.utilities.ScreenUtils.getScreenHeight(com.knotapi.knot.webview.PopupChromeClient.this.activity)));
                    sb.append("px");
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.UPDATE_HEIGHT_COMBINED, sb.toString()), null);
                    return;
                }
                if (c == 1) {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.UPDATE_HEIGHT_COMBINED, ""), null);
                } else if (c != 2) {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.UPDATE_HEIGHT_COMBINED, kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO), null);
                } else {
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.REMOVE_ITEM, null);
                    com.knotapi.knot.webview.PopupChromeClient.this.webViewPopUp.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.REMOVE_FB_WARNING, null);
                }
            }
        }, 2000L);
    }
}
