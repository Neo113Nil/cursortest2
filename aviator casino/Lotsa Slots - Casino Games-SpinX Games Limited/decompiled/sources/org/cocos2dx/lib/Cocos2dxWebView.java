package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxWebView extends android.webkit.WebView {
    private static final java.lang.String TAG = "Cocos2dxWebViewHelper";
    private java.lang.String mJSScheme;
    private int mViewTag;

    public Cocos2dxWebView(android.content.Context context) {
        this(context, -1);
    }

    public Cocos2dxWebView(android.content.Context context, int i) {
        super(context);
        this.mViewTag = i;
        this.mJSScheme = "";
        setFocusable(true);
        setFocusableInTouchMode(true);
        getSettings().setSupportZoom(false);
        getSettings().setJavaScriptEnabled(true);
        try {
            getClass().getMethod("removeJavascriptInterface", java.lang.String.class).invoke(this, "searchBoxJavaBridge_");
        } catch (java.lang.Exception unused) {
            android.util.Log.d(TAG, "This API level do not support `removeJavascriptInterface`");
        }
        setWebViewClient(new org.cocos2dx.lib.Cocos2dxWebView.Cocos2dxWebViewClient());
        setWebChromeClient(new android.webkit.WebChromeClient());
    }

    public void setJavascriptInterfaceScheme(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.mJSScheme = str;
    }

    public void setScalesPageToFit(boolean z) {
        getSettings().setSupportZoom(z);
    }

    class Cocos2dxWebViewClient extends android.webkit.WebViewClient {
        Cocos2dxWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            java.net.URI create = java.net.URI.create(str);
            if (create == null || !create.getScheme().equals(org.cocos2dx.lib.Cocos2dxWebView.this.mJSScheme)) {
                return org.cocos2dx.lib.Cocos2dxWebViewHelper._shouldStartLoading(org.cocos2dx.lib.Cocos2dxWebView.this.mViewTag, str);
            }
            org.cocos2dx.lib.Cocos2dxWebViewHelper._onJsCallback(org.cocos2dx.lib.Cocos2dxWebView.this.mViewTag, str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            org.cocos2dx.lib.Cocos2dxWebViewHelper._didFinishLoading(org.cocos2dx.lib.Cocos2dxWebView.this.mViewTag, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i, str, str2);
            org.cocos2dx.lib.Cocos2dxWebViewHelper._didFailLoading(org.cocos2dx.lib.Cocos2dxWebView.this.mViewTag, str2);
        }
    }

    public void setWebViewRect(int i, int i2, int i3, int i4) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.width = i3;
        layoutParams.height = i4;
        layoutParams.gravity = 51;
        setLayoutParams(layoutParams);
    }
}
