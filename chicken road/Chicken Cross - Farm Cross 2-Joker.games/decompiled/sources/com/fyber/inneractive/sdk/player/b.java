package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.config.y0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f5518a;
    public n b;

    public b(t0 t0Var) {
        this.f5518a = t0Var;
    }

    public final a a() {
        com.fyber.inneractive.sdk.measurement.e eVar;
        y0 y0Var;
        UnitDisplayType unitDisplayType;
        if (this.b == null) {
            Application application = com.fyber.inneractive.sdk.util.o.f5960a;
            t0 t0Var = this.f5518a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.b;
            x0 x0Var = t0Var.d;
            InneractiveAdRequest inneractiveAdRequest = t0Var.f5418a;
            if (x0Var != null) {
                IAConfigManager iAConfigManager = IAConfigManager.R;
                Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.O.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.k);
                boolean booleanValue = c != null ? c.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(booleanValue));
                if (booleanValue && (y0Var = ((w0) this.f5518a.d).f) != null && ((unitDisplayType = y0Var.j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                    eVar = iAConfigManager.M;
                    this.b = new n(application, gVar, x0Var, inneractiveAdRequest, t0Var, eVar);
                }
            }
            eVar = null;
            this.b = new n(application, gVar, x0Var, inneractiveAdRequest, t0Var, eVar);
        }
        return this.b;
    }
}
