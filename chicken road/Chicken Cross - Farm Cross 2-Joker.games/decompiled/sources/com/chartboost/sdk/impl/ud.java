package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ud implements vh {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5032a;
    public final ae b;

    public ud(AtomicReference sdkConfigRef, ae openMeasurementManager) {
        Intrinsics.checkNotNullParameter(sdkConfigRef, "sdkConfigRef");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        this.f5032a = sdkConfigRef;
        this.b = openMeasurementManager;
    }

    @Override // com.chartboost.sdk.impl.vh
    public JSONObject a() {
        com.chartboost.sdk.internal.Model.a aVar = (com.chartboost.sdk.internal.Model.a) this.f5032a.get();
        if (aVar == null) {
            return new JSONObject();
        }
        vd d = aVar.d();
        if (d == null || !d.g()) {
            return new JSONObject();
        }
        Partner c = this.b.c();
        JSONObject jSONObject = new JSONObject();
        if (c != null) {
            jSONObject.put("omidpn", c.getName());
            jSONObject.put("omidpv", c.getVersion());
        }
        jSONObject.put("omidv", Omid.getVersion());
        return jSONObject;
    }
}
