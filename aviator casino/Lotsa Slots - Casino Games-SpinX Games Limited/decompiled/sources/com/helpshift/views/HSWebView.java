package com.helpshift.views;

/* loaded from: classes5.dex */
public class HSWebView extends android.webkit.WebView {
    public HSWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HSWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public HSWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        init();
    }

    public HSWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        init();
    }

    public HSWebView(android.content.Context context) {
        super(context);
        init();
    }

    private void init() {
        if (isInEditMode()) {
            return;
        }
        configureWebView();
    }

    private void configureWebView() {
        android.webkit.WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(1);
        settings.setCacheMode(2);
        settings.setAllowFileAccess(true);
        setLayerType(2, null);
    }

    public void destroyCustomWebview() {
        removeAllViews();
        destroy();
    }
}
