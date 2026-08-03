package com.ironsource;

/* loaded from: classes5.dex */
public final class Ea implements com.ironsource.La {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ba f5685a;

    public Ea(com.ironsource.Ba strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f5685a = strategy;
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5685a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.La
    public void b() {
        this.f5685a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.La
    public void c() {
        this.f5685a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.La
    public void d() {
        this.f5685a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.La
    public void f() {
        this.f5685a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5685a.a("Received load failed on a destroyed ad");
    }
}
