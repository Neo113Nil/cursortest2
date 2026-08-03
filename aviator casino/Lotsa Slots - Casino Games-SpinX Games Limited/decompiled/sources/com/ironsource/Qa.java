package com.ironsource;

/* loaded from: classes5.dex */
public final class Qa implements com.ironsource.Sa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Na f5938a;
    private final com.ironsource.L2 b;

    public Qa(com.ironsource.Na strategy, com.ironsource.L2 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f5938a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5938a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.f5938a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.b.a(true);
        this.f5938a.a((com.ironsource.L2) null);
        com.ironsource.Na na = this.f5938a;
        na.a(new com.ironsource.Pa(na));
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5938a.a("Ad unit is already loaded");
    }
}
