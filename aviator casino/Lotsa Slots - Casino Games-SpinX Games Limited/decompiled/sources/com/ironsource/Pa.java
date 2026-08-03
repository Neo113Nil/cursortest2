package com.ironsource;

/* loaded from: classes5.dex */
public final class Pa implements com.ironsource.Sa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Na f5923a;

    public Pa(com.ironsource.Na strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f5923a = strategy;
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5923a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void b() {
        this.f5923a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void c() {
        this.f5923a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5923a.a("Received load failed on a destroyed ad");
    }
}
