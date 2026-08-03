package com.ironsource;

/* loaded from: classes5.dex */
public final class Ka implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5803a;
    private final com.ironsource.L2 b;
    private final com.ironsource.L2 c;
    private final long d;
    private final boolean e;

    public Ka(com.ironsource.Ba strategy, com.ironsource.L2 currentAdUnit, com.ironsource.L2 reloadingAdUnit, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.f5803a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5803a.a(adUnitCallback, this.c, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.c(this.f5803a.p().a() - this.d, com.ironsource.AbstractC3036f3.d.C0149d.f6245a), false, java.lang.Long.valueOf(this.d));
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5803a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        this.b.a(true);
        this.c.a(true);
        com.ironsource.Ba ba = this.f5803a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        com.ironsource.Ba ba = this.f5803a;
        ba.a((com.ironsource.La) new com.ironsource.Ha(ba, this.b));
    }

    @Override // com.ironsource.La
    public void f() {
    }

    public /* synthetic */ Ka(com.ironsource.Ba ba, com.ironsource.L2 l2, com.ironsource.L2 l22, long j, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5803a.a(ironSourceError, this.b, (com.ironsource.AbstractC3036f3) new com.ironsource.AbstractC3036f3.c(this.f5803a.p().a() - this.d, com.ironsource.AbstractC3036f3.d.c.f6244a), this.e, false, java.lang.Long.valueOf(this.d));
    }
}
