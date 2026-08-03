package com.iab.omid.library.vungle.messagelistener;

/* loaded from: classes5.dex */
public interface b {
    java.lang.String getListenerName();

    void onMessageReceived(java.lang.String str, org.json.JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
