package com.helpshift.attachment;

/* loaded from: classes4.dex */
public interface WebviewAttachmentCallback {
    void addWebviewToCurrentUI(android.webkit.WebView webView);

    void openFileChooser(android.content.Intent intent, int i);

    void sendIntentToSystemApp(android.content.Intent intent);

    void setAttachmentFilePathCallback(android.webkit.ValueCallback<android.net.Uri[]> valueCallback);
}
