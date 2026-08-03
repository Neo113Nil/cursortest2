package com.ironsource;

/* loaded from: classes5.dex */
public final class Da implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5671a;
    private boolean b;

    public Da(com.ironsource.Ba strategy, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f5671a = strategy;
        this.b = z;
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5671a.a("Received load success before load");
    }

    @Override // com.ironsource.La
    public void b() {
        com.ironsource.L2 a2 = this.f5671a.j().a(true);
        this.f5671a.a((com.ironsource.La) new com.ironsource.Ga(this.f5671a, a2, this.b));
        a2.a(this.f5671a.g());
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        com.ironsource.Ba ba = this.f5671a;
        ba.a((com.ironsource.La) new com.ironsource.Ea(ba));
    }

    @Override // com.ironsource.La
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.La
    public void f() {
        this.b = false;
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5671a.a("Received load failed before load");
    }

    public /* synthetic */ Da(com.ironsource.Ba ba, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, (i & 2) != 0 ? false : z);
    }
}
