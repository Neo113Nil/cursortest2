package com.knotapi.knot.webview;

/* loaded from: classes9.dex */
public class WebViewManager {
    private final android.content.Context context;
    private final java.util.Map<java.lang.String, com.knotapi.knot.webview.KnotView> webViewMap = new java.util.HashMap();

    public interface WebViewCreationCallback {
        void onWebViewCreated(com.knotapi.knot.webview.KnotView knotView);
    }

    public WebViewManager(android.content.Context context) {
        this.context = context;
    }

    private void setupWebView(com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.models.Bot bot, com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate, com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener) {
        knotView.init((android.app.Activity) this.context, merchantViewListener).setBot(bot).setDefaultSettings().start();
        com.knotapi.knot.webview.PopupChromeClient popupChromeClient = com.knotapi.knot.webview.PopupChromeClient.getInstance();
        popupChromeClient.init((androidx.fragment.app.FragmentActivity) this.context, knotView, merchantWebViewDelegate, bot);
        knotView.setWebChromeClient(popupChromeClient);
    }

    public void createWebView(final java.lang.String str, final com.knotapi.knot.models.Bot bot, final com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate, final com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener, final com.knotapi.knot.webview.WebViewManager.WebViewCreationCallback webViewCreationCallback) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.WebViewManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.WebViewManager.this.m10865lambda$createWebView$0$comknotapiknotwebviewWebViewManager(bot, merchantWebViewDelegate, merchantViewListener, str, webViewCreationCallback);
            }
        });
    }

    public void destroyWebView(java.lang.String str) {
        com.knotapi.knot.webview.KnotView knotView = this.webViewMap.get(str);
        if (knotView != null) {
            knotView.destroy();
            this.webViewMap.remove(str);
        }
    }

    public com.knotapi.knot.webview.KnotView getWebView(java.lang.String str) {
        return this.webViewMap.get(str);
    }

    /* renamed from: lambda$createWebView$0$com-knotapi-knot-webview-WebViewManager, reason: not valid java name */
    /* synthetic */ void m10865lambda$createWebView$0$comknotapiknotwebviewWebViewManager(com.knotapi.knot.models.Bot bot, com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate, com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener, java.lang.String str, com.knotapi.knot.webview.WebViewManager.WebViewCreationCallback webViewCreationCallback) {
        com.knotapi.knot.webview.KnotView knotView = new com.knotapi.knot.webview.KnotView(this.context);
        knotView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setupWebView(knotView, bot, merchantWebViewDelegate, merchantViewListener);
        this.webViewMap.put(str, knotView);
        webViewCreationCallback.onWebViewCreated(knotView);
    }
}
