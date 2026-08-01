package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.c6;
import com.applovin.impl.i6;
import com.applovin.impl.k;
import com.applovin.impl.m6;
import com.applovin.impl.n5;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.x2;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final p logger;
    private final l sdk;

    public AppLovinNativeAdService(l lVar) {
        this.sdk = lVar;
        this.logger = lVar.Q();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            p.h(TAG, "Empty ad token");
            x2.b(appLovinNativeAdLoadListener, new AppLovinError(-8, "Empty ad token"));
            return;
        }
        k kVar = new k(trim, this.sdk);
        if (kVar.c() == k.a.REGULAR) {
            if (p.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + kVar);
            }
            this.sdk.s0().a((n5) new c6(kVar, appLovinNativeAdLoadListener, this.sdk), i6.b.CORE);
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            p.h(TAG, "Invalid token type");
            x2.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        JSONObject a2 = kVar.a();
        if (a2 == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            p.h(TAG, str2);
            x2.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        s0.c(a2, this.sdk);
        s0.b(a2, this.sdk);
        s0.a(a2, this.sdk);
        if (JsonUtils.getJSONArray(a2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()).length() > 0) {
            if (p.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + kVar);
            }
            this.sdk.s0().a((n5) new m6(a2, appLovinNativeAdLoadListener, this.sdk), i6.b.CORE);
        } else {
            if (p.a()) {
                this.logger.b(TAG, "No ad returned from the server for token: " + kVar);
            }
            x2.b(appLovinNativeAdLoadListener, AppLovinError.NO_FILL);
        }
    }
}
