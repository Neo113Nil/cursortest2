package com.helpshift.chat;

/* loaded from: classes.dex */
public class HSChatWebViewClient extends android.webkit.WebViewClient {
    private static final java.lang.String TAG = "ChatWebClient";
    private final com.helpshift.attachment.WebviewAttachmentCallbackProxy attachmentCallbackProxy;
    private final com.helpshift.cache.HelpshiftResourceCacheManager chatResourceCacheManager;
    private final com.helpshift.chat.HSChatEventsHandler eventsHandler;
    private boolean resourceCacheManagerInitialized;

    HSChatWebViewClient(com.helpshift.cache.HelpshiftResourceCacheManager helpshiftResourceCacheManager, com.helpshift.attachment.WebviewAttachmentCallbackProxy webviewAttachmentCallbackProxy, com.helpshift.chat.HSChatEventsHandler hSChatEventsHandler) {
        this.chatResourceCacheManager = helpshiftResourceCacheManager;
        this.attachmentCallbackProxy = webviewAttachmentCallbackProxy;
        this.eventsHandler = hSChatEventsHandler;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        this.attachmentCallbackProxy.sendIntentToSystemApp(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        return true;
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
        if (!this.chatResourceCacheManager.shouldCacheUrl(webResourceRequest.getUrl().getPath())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        android.webkit.WebResourceResponse webResourceResponse = com.helpshift.util.ResourceCacheUtil.getWebResourceResponse(this.chatResourceCacheManager, webResourceRequest);
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
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        super.onPageCommitVisible(webView, str);
        this.eventsHandler.onWCPageCommitVisible();
        com.helpshift.log.HSLogger.d(TAG, "onPageCommitVisible called for url: " + str);
    }

    private void initResourceCacheManager() {
        if (this.resourceCacheManagerInitialized) {
            return;
        }
        this.chatResourceCacheManager.ensureCacheURLsListAvailable();
        this.resourceCacheManagerInitialized = true;
    }
}
