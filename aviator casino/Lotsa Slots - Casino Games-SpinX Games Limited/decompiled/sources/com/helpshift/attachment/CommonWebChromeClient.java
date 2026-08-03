package com.helpshift.attachment;

/* loaded from: classes4.dex */
public class CommonWebChromeClient extends android.webkit.WebChromeClient {
    private final java.lang.String TAG;
    private final com.helpshift.attachment.WebviewAttachmentCallbackProxy attachmentCallbackProxy;
    private android.webkit.ValueCallback<android.net.Uri[]> filePathCallback;

    public void setFilePathCallback(android.webkit.ValueCallback<android.net.Uri[]> valueCallback) {
        this.filePathCallback = valueCallback;
    }

    public CommonWebChromeClient(java.lang.String str, com.helpshift.attachment.WebviewAttachmentCallbackProxy webviewAttachmentCallbackProxy) {
        this.TAG = str;
        this.attachmentCallbackProxy = webviewAttachmentCallbackProxy;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        com.helpshift.log.WebviewConsoleLogger.log(consoleMessage.messageLevel(), this.TAG, consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        if (!z2) {
            return false;
        }
        android.webkit.WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        java.lang.String createUriForSystemAppLaunch = createUriForSystemAppLaunch(hitTestResult.getType(), hitTestResult.getExtra());
        if (com.helpshift.util.Utils.isNotEmpty(createUriForSystemAppLaunch)) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(createUriForSystemAppLaunch));
            this.attachmentCallbackProxy.sendIntentToSystemApp(intent);
            return true;
        }
        android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
        this.attachmentCallbackProxy.addWebviewToCurrentUI(webView2);
        ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    private java.lang.String createUriForSystemAppLaunch(int i, java.lang.String str) {
        if (i != 2) {
            return i != 7 ? "" : str;
        }
        return "tel:" + str;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 21) {
            this.filePathCallback.onReceiveValue(null);
            return false;
        }
        if (this.filePathCallback != null) {
            com.helpshift.log.HSLogger.d(this.TAG, "filePathCallback is not null, returning false.");
            this.filePathCallback.onReceiveValue(null);
            this.filePathCallback = null;
            return false;
        }
        this.filePathCallback = valueCallback;
        this.attachmentCallbackProxy.setAttachmentFilePathCallback(valueCallback);
        try {
            android.content.Intent createIntent = fileChooserParams.createIntent();
            createIntent.setType("*/*");
            java.lang.String[] acceptTypes = fileChooserParams.getAcceptTypes();
            if (acceptTypes.length != 0) {
                createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
            }
            createIntent.setAction("android.intent.action.OPEN_DOCUMENT");
            createIntent.addCategory("android.intent.category.OPENABLE");
            com.helpshift.log.HSLogger.d(this.TAG, "Starting open file chooser request.");
            this.attachmentCallbackProxy.openFileChooser(createIntent, 1001);
            com.helpshift.log.HSLogger.d(this.TAG, "onShowFileChooser success, returning true");
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            com.helpshift.log.HSLogger.e(this.TAG, "ActivityNotFoundException error in opening the attachment file chooser.", e);
            this.filePathCallback = null;
            return true;
        } catch (java.lang.Exception e2) {
            com.helpshift.log.HSLogger.e(this.TAG, "error in opening the attachment in browser window, returning false", e2);
            this.filePathCallback = null;
            return false;
        }
    }
}
