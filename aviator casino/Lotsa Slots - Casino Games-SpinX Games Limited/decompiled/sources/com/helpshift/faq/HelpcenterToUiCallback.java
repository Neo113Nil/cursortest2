package com.helpshift.faq;

/* loaded from: classes2.dex */
public interface HelpcenterToUiCallback {
    void closeHelpcenter();

    void getWebchatData();

    void onHelpcenterError();

    void onHelpcenterLoaded();

    void openWebchat();

    void setNativeUiColors(java.lang.String str);

    void showNotificationBadgeOnHCLoad();
}
