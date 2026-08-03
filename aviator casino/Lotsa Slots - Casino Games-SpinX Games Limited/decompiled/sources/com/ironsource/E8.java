package com.ironsource;

/* loaded from: classes5.dex */
public interface E8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(java.lang.String str);

        void onNativeAdLoadSuccess(com.ironsource.C8 c8);

        void onNativeAdShown();
    }

    void a();

    void a(android.app.Activity activity, org.json.JSONObject jSONObject);

    void a(com.ironsource.E8.a aVar);

    void a(com.ironsource.F8 f8);

    com.ironsource.E8.a b();

    com.ironsource.C8 c();
}
