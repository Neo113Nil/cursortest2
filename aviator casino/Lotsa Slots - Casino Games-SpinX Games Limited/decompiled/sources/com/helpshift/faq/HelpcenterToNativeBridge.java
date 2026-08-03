package com.helpshift.faq;

/* loaded from: classes2.dex */
public class HelpcenterToNativeBridge {
    private static final java.lang.String TAG = "HelpcnterToNatve";
    private final com.helpshift.faq.HSHelpcenterEventsHandler eventsHandler;

    public HelpcenterToNativeBridge(com.helpshift.faq.HSHelpcenterEventsHandler hSHelpcenterEventsHandler) {
        this.eventsHandler = hSHelpcenterEventsHandler;
    }

    @android.webkit.JavascriptInterface
    public void closeHelpcenter() {
        com.helpshift.log.HSLogger.d(TAG, "Received event to close Helpcenter");
        this.eventsHandler.closeHelpcenter();
    }

    @android.webkit.JavascriptInterface
    public void openWebchat() {
        com.helpshift.log.HSLogger.d(TAG, "Received event to open Webchat");
        this.eventsHandler.openWebchat();
    }

    @android.webkit.JavascriptInterface
    public void helpcenterLoaded(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event helpcenter loaded");
        this.eventsHandler.onHelpcenterLoaded(str);
    }

    @android.webkit.JavascriptInterface
    public void onHelpcenterError() {
        com.helpshift.log.HSLogger.d(TAG, "Received event helpcenter error");
        this.eventsHandler.onHelpcenterError();
    }

    @android.webkit.JavascriptInterface
    public void setAdditionalInfo(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to set additional Helpcenter data from HC WebView.");
        this.eventsHandler.onSetAdditionalHelpcenterData(str);
    }

    @android.webkit.JavascriptInterface
    public void removeAdditionalInfo(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to remove additional Helpcenter data from HC WebView.");
        this.eventsHandler.onRemoveAdditionalHelpcenterData(str);
    }

    @android.webkit.JavascriptInterface
    public void getWebchatData() {
        com.helpshift.log.HSLogger.d(TAG, "Received event to getWCLocalStorageData from HC WebView.");
        this.eventsHandler.getWebchatData();
    }

    @android.webkit.JavascriptInterface
    public void hcActionSync(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "Received event to ActionSync from HC WebView.");
        this.eventsHandler.hcActionSync(str);
    }
}
