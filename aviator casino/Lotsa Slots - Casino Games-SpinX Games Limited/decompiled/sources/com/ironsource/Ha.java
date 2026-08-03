package com.ironsource;

/* loaded from: classes5.dex */
public final class Ha implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5740a;
    private final com.ironsource.L2 b;

    public Ha(com.ironsource.Ba strategy, com.ironsource.L2 currentAdUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f5740a = strategy;
        this.b = currentAdUnit;
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5740a.a("Received load success while paused");
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5740a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        com.ironsource.Ba ba = this.f5740a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
    }

    @Override // com.ironsource.La
    public void f() {
        com.ironsource.Ba.a(this.f5740a, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.a(com.ironsource.AbstractC3036f3.b.c.f6240a), false, 4, (java.lang.Object) null);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5740a.a("Received load failed while paused");
    }
}
