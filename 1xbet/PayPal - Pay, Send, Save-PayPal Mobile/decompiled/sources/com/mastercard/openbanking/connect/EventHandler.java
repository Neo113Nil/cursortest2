package com.mastercard.openbanking.connect;

/* loaded from: classes9.dex */
public interface EventHandler {
    void onCancel(org.json.JSONObject jSONObject);

    void onDone(org.json.JSONObject jSONObject);

    void onError(org.json.JSONObject jSONObject);

    void onLoad();

    void onRoute(org.json.JSONObject jSONObject);

    void onUser(org.json.JSONObject jSONObject);
}
