package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.h3;
import com.applovin.impl.k8;
import com.applovin.impl.l8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* loaded from: classes5.dex */
public class b implements l8.a {

    /* renamed from: a, reason: collision with root package name */
    private final l f4322a;
    private final h3 b;
    private final l8 c;
    private final k8 d;
    private final a.InterfaceC0077a e;

    public b(h3 h3Var, ViewGroup viewGroup, a.InterfaceC0077a interfaceC0077a, l lVar) {
        this.f4322a = lVar;
        this.b = h3Var;
        this.e = interfaceC0077a;
        this.d = new k8(viewGroup, lVar);
        l8 l8Var = new l8(viewGroup, lVar, this);
        this.c = l8Var;
        l8Var.a(h3Var);
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.c.b();
    }

    public h3 b() {
        return this.b;
    }

    public void c() {
        this.f4322a.Q();
        if (p.a()) {
            this.f4322a.Q().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.x0().compareAndSet(false, true)) {
            this.f4322a.Q();
            if (p.a()) {
                this.f4322a.Q().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                p.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f4322a.f().a(this.b);
            }
            this.f4322a.Z().processRawAdImpression(this.b, this.e);
        }
    }

    @Override // com.applovin.impl.l8.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.y0().compareAndSet(false, true)) {
            this.f4322a.Q();
            if (p.a()) {
                this.f4322a.Q().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f4322a.Z().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }
}
