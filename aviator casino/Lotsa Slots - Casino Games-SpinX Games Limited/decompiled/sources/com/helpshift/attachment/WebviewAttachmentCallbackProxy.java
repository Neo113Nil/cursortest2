package com.helpshift.attachment;

/* loaded from: classes4.dex */
public class WebviewAttachmentCallbackProxy {
    private final java.lang.ref.WeakReference<com.helpshift.attachment.WebviewAttachmentCallback> callbackRef;
    private final com.helpshift.concurrency.HSThreadingService threadingService;

    public WebviewAttachmentCallbackProxy(com.helpshift.attachment.WebviewAttachmentCallback webviewAttachmentCallback, com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.callbackRef = new java.lang.ref.WeakReference<>(webviewAttachmentCallback);
        this.threadingService = hSThreadingService;
    }

    public void addWebviewToCurrentUI(final android.webkit.WebView webView) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.attachment.WebviewAttachmentCallbackProxy$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.attachment.WebviewAttachmentCallbackProxy.this.m5630xb6e67e44(webView);
            }
        });
    }

    /* renamed from: lambda$addWebviewToCurrentUI$0$com-helpshift-attachment-WebviewAttachmentCallbackProxy, reason: not valid java name */
    /* synthetic */ void m5630xb6e67e44(android.webkit.WebView webView) {
        com.helpshift.attachment.WebviewAttachmentCallback webviewAttachmentCallback = this.callbackRef.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.addWebviewToCurrentUI(webView);
        }
    }

    public void setAttachmentFilePathCallback(android.webkit.ValueCallback<android.net.Uri[]> valueCallback) {
        com.helpshift.attachment.WebviewAttachmentCallback webviewAttachmentCallback = this.callbackRef.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.setAttachmentFilePathCallback(valueCallback);
        }
    }

    public void openFileChooser(android.content.Intent intent, int i) {
        com.helpshift.attachment.WebviewAttachmentCallback webviewAttachmentCallback = this.callbackRef.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.openFileChooser(intent, i);
        }
    }

    public void sendIntentToSystemApp(android.content.Intent intent) {
        com.helpshift.attachment.WebviewAttachmentCallback webviewAttachmentCallback = this.callbackRef.get();
        if (webviewAttachmentCallback != null) {
            webviewAttachmentCallback.sendIntentToSystemApp(intent);
        }
    }
}
