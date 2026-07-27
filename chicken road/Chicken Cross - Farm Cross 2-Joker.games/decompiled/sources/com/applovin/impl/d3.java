package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class d3 extends i2 {
    public d3(com.applovin.impl.sdk.l lVar) {
        super(lVar, h2.b.MEDIATED_AD);
    }

    public void a(h2 h2Var, c3 c3Var) {
        a(h2Var, c3Var, new HashMap());
    }

    public void a(h2 h2Var, c3 c3Var, Map map) {
        a(h2Var, c3Var.getFormat(), c3Var.getAdUnitId(), c3Var, null, map);
    }

    public void a(h2 h2Var, c3 c3Var, MaxError maxError) {
        a(h2Var, c3Var, maxError, new HashMap());
    }

    public void a(h2 h2Var, c3 c3Var, MaxError maxError, Map map) {
        a(h2Var, c3Var.getFormat(), c3Var.getAdUnitId(), c3Var, maxError, map);
    }

    public void a(h2 h2Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(h2Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    private void a(h2 h2Var, MaxAdFormat maxAdFormat, String str, c3 c3Var, MaxError maxError, Map map) {
        if (c3Var != null) {
            map.putAll(j2.a(c3Var));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(j2.a(maxError));
        }
        d(h2Var, map);
    }
}
