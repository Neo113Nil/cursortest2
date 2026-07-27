package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface C8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(String str);

        void onNativeAdLoadSuccess(A8 a8);

        void onNativeAdShown();
    }

    void a();

    void a(Activity activity, JSONObject jSONObject);

    void a(a aVar);

    void a(D8 d8);

    a b();

    A8 c();
}
