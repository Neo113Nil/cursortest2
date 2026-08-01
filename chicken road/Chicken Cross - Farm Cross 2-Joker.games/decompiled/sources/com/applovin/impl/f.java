package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class f extends i2 {
    public f(com.applovin.impl.sdk.l lVar) {
        super(lVar, h2.b.AD);
    }

    public void a(h2 h2Var, com.applovin.impl.sdk.ad.b bVar) {
        a(h2Var, bVar, new HashMap());
    }

    public void a(h2 h2Var, com.applovin.impl.sdk.ad.b bVar, Map map) {
        a(h2Var, bVar != null ? bVar.getAdZone() : null, bVar, null, map);
    }

    public void a(h2 h2Var, u uVar, AppLovinError appLovinError) {
        a(h2Var, uVar, null, appLovinError, new HashMap());
    }

    private void a(h2 h2Var, u uVar, com.applovin.impl.sdk.ad.b bVar, AppLovinError appLovinError, Map map) {
        if (((Boolean) this.f4236a.a(c5.J)).booleanValue() && this.f4236a.I0()) {
            return;
        }
        if (bVar != null) {
            map.putAll(j2.a((AppLovinAdImpl) bVar));
        } else if (uVar != null) {
            CollectionUtils.putStringIfValid("ad_zone_id", uVar.e(), map);
            MaxAdFormat d = uVar.d();
            if (d != null) {
                CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, d.getLabel(), map);
            }
        }
        AppLovinAdSize a2 = a(uVar, bVar);
        if (a2 != null) {
            CollectionUtils.putStringIfValid("ad_size", a2.getLabel(), map);
        }
        if (appLovinError != null) {
            CollectionUtils.putStringIfValid("error_message", appLovinError.getMessage(), map);
            CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinError.getCode()), map);
        }
        d(h2Var, map);
    }

    private AppLovinAdSize a(u uVar, com.applovin.impl.sdk.ad.b bVar) {
        AppLovinAdSize f = uVar != null ? uVar.f() : null;
        if (f != null) {
            return f;
        }
        if (bVar != null) {
            return bVar.getSize();
        }
        return null;
    }
}
