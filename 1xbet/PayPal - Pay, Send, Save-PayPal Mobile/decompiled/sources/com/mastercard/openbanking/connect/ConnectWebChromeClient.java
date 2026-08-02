package com.mastercard.openbanking.connect;

/* loaded from: classes9.dex */
class ConnectWebChromeClient extends android.webkit.WebChromeClient {
    public static boolean runningUnitTest = false;
    com.mastercard.openbanking.connect.ConnectWebViewClientHandler connectWebViewClientHandler;
    private com.mastercard.openbanking.connect.EventHandler eventHandler;
    protected boolean isWebViewLoaded = false;
    private com.mastercard.openbanking.connect.Connect mConnect;

    public ConnectWebChromeClient(com.mastercard.openbanking.connect.Connect connect, com.mastercard.openbanking.connect.EventHandler eventHandler, com.mastercard.openbanking.connect.ConnectWebViewClientHandler connectWebViewClientHandler) {
        this.mConnect = connect;
        this.eventHandler = eventHandler;
        this.connectWebViewClientHandler = connectWebViewClientHandler;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.mConnect.mFilePathCallback != null) {
            this.mConnect.mFilePathCallback.onReceiveValue(null);
        }
        this.mConnect.mFilePathCallback = valueCallback;
        try {
            this.mConnect.startActivityForResult(fileChooserParams.createIntent(), 100);
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            this.mConnect.mFilePathCallback = null;
            if (runningUnitTest) {
                return false;
            }
            com.mastercard.openbanking.connect.Connect connect = this.mConnect;
            android.widget.Toast.makeText(connect, connect.getString(com.mastercard.openbanking.connect.R.string.file_access_error_msg), 1).show();
            return false;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(android.webkit.WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (i < 20 || this.isWebViewLoaded) {
            return;
        }
        this.mConnect.pingConnect();
        this.mConnect.startPingTimer();
        this.eventHandler.onLoad();
        this.connectWebViewClientHandler.handleOnPageFinish();
        this.isWebViewLoaded = true;
    }
}
