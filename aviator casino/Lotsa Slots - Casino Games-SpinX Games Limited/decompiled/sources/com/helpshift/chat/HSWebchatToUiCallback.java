package com.helpshift.chat;

/* loaded from: classes.dex */
public interface HSWebchatToUiCallback {
    void onUiConfigChange(java.lang.String str);

    void onUserAuthenticationFailure();

    void onWebchatClosed();

    void onWebchatError(java.lang.String str);

    void onWebchatLoaded();

    void requestConversationMetadata(java.lang.String str);

    void setHelpcenterData();

    void webchatJsFileLoaded();
}
