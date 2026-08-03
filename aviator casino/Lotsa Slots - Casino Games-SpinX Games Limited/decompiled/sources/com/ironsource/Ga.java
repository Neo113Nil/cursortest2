package com.ironsource;

/* loaded from: classes5.dex */
public final class Ga implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5724a;
    private final com.ironsource.L2 b;
    private boolean c;

    public Ga(com.ironsource.Ba strategy, com.ironsource.L2 currentAdUnit, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f5724a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5724a.a(adUnitCallback, this.b, (com.ironsource.L2) null, new com.ironsource.AbstractC3036f3.a(com.ironsource.AbstractC3036f3.b.C0148b.f6239a), this.c, (java.lang.Long) null);
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5724a.a("Loading an ad while loading");
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        com.ironsource.Ba ba = this.f5724a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        this.c = true;
    }

    @Override // com.ironsource.La
    public void f() {
        this.c = false;
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5724a.a(ironSourceError, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.a(com.ironsource.AbstractC3036f3.b.a.f6238a), false, this.c, (java.lang.Long) null);
    }
}
