package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class h3 extends l3 implements u1 {
    private final AtomicBoolean A;
    private final AtomicBoolean B;

    public h3(e3 e3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(e3Var, jSONObject, jSONObject2, null, lVar);
        this.A = new AtomicBoolean();
        this.B = new AtomicBoolean();
    }

    private long u0() {
        long a2 = a("ad_expiration_ms", -1L);
        return a2 < 0 ? b("ad_expiration_ms", ((Long) this.f4356a.a(v3.e8)).longValue()) : a2;
    }

    public boolean A0() {
        return this.o == null;
    }

    @Override // com.applovin.impl.c3
    public c3 a(com.applovin.impl.mediation.h hVar) {
        return new h3(this, hVar);
    }

    @Override // com.applovin.impl.u1
    public long getTimeToLiveMillis() {
        return u0() - (SystemClock.elapsedRealtime() - L());
    }

    @Override // com.applovin.impl.u1
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public MaxNativeAdView v0() {
        return this.o.f();
    }

    public ViewGroup w0() {
        return this.o.h();
    }

    public AtomicBoolean x0() {
        return this.A;
    }

    public AtomicBoolean y0() {
        return this.B;
    }

    public boolean z0() {
        return a("inacc", (Boolean) this.f4356a.a(v3.z8)).booleanValue();
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.o.a(maxNativeAdView);
    }

    public void a(ViewGroup viewGroup) {
        this.o.a(viewGroup);
    }

    private h3(h3 h3Var, com.applovin.impl.mediation.h hVar) {
        super(h3Var.Q(), h3Var.a(), h3Var.g(), hVar, h3Var.f4356a);
        this.A = new AtomicBoolean();
        this.B = new AtomicBoolean();
    }
}
