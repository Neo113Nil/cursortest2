package com.helpshift.faq;

/* loaded from: classes2.dex */
public class HSHelpcenterWebViewClient extends android.webkit.WebViewClient {
    private static final java.lang.String TAG = "HelpcntrWebClient";
    private final com.helpshift.faq.HSHelpcenterEventsHandler eventsHandler;
    private final com.helpshift.cache.HelpshiftResourceCacheManager helpcenterResourceCacheManager;
    private boolean resourceCacheManagerInitialized;

    public HSHelpcenterWebViewClient(com.helpshift.cache.HelpshiftResourceCacheManager helpshiftResourceCacheManager, com.helpshift.faq.HSHelpcenterEventsHandler hSHelpcenterEventsHandler) {
        this.helpcenterResourceCacheManager = helpshiftResourceCacheManager;
        this.eventsHandler = hSHelpcenterEventsHandler;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        if (str.startsWith("https://") || str.startsWith("http://")) {
            webView.loadUrl(str);
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 21) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        if (!"GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        initResourceCacheManager();
        if (!this.helpcenterResourceCacheManager.shouldCacheUrl(webResourceRequest.getUrl().getPath())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        android.webkit.WebResourceResponse webResourceResponse = com.helpshift.util.ResourceCacheUtil.getWebResourceResponse(this.helpcenterResourceCacheManager, webResourceRequest);
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        android.webkit.WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        if (shouldInterceptRequest != null) {
            com.helpshift.log.HSLogger.d(TAG, "Webview response received for request-" + webResourceRequest + " status:" + shouldInterceptRequest.getStatusCode() + " MimeType:" + shouldInterceptRequest.getMimeType());
        } else {
            com.helpshift.log.HSLogger.e(TAG, "Webview response error for request-" + webResourceRequest.getUrl());
        }
        return shouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        com.helpshift.log.HSLogger.e(TAG, "HelpCenter load failed.Failed Status " + webResourceError.getErrorCode());
        if (com.helpshift.core.HSContext.getInstance().getDevice().isOnline()) {
            return;
        }
        com.helpshift.log.HSLogger.e(TAG, "No Internet Connection.Showing Retry UI");
        this.eventsHandler.onHelpcenterError();
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        super.onPageCommitVisible(webView, str);
        com.helpshift.log.HSLogger.d(TAG, "onPageCommitVisible called for HC");
        this.eventsHandler.onHCPageCommitVisible();
    }

    private void initResourceCacheManager() {
        if (this.resourceCacheManagerInitialized) {
            return;
        }
        this.helpcenterResourceCacheManager.ensureCacheURLsListAvailable();
        this.resourceCacheManagerInitialized = true;
    }
}
