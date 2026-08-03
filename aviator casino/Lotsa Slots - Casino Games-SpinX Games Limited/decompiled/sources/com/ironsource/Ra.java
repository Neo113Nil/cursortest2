package com.ironsource;

/* loaded from: classes5.dex */
public final class Ra implements com.ironsource.Sa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Na f5949a;
    private final com.ironsource.L2 b;

    public Ra(com.ironsource.Na strategy, com.ironsource.L2 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f5949a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5949a.a(adUnitCallback, this.b);
        com.ironsource.Na na = this.f5949a;
        na.a(new com.ironsource.Qa(na, this.b));
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.f5949a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.b.a(true);
        this.f5949a.a((com.ironsource.L2) null);
        com.ironsource.Na na = this.f5949a;
        na.a(new com.ironsource.Pa(na));
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5949a.a(ironSourceError);
        this.b.a(false);
        this.f5949a.a((com.ironsource.L2) null);
        com.ironsource.Na na = this.f5949a;
        na.a(new com.ironsource.Pa(na));
    }
}
