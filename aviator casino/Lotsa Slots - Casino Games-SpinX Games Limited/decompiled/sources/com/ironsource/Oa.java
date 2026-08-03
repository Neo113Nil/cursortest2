package com.ironsource;

/* loaded from: classes5.dex */
public final class Oa implements com.ironsource.Sa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Na f5880a;

    public Oa(com.ironsource.Na strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f5880a = strategy;
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.f5880a.a("Received load success before load called");
    }

    @Override // com.ironsource.Sa
    public void b() {
        com.ironsource.L2 a2 = this.f5880a.i().a(true);
        this.f5880a.a(a2);
        com.ironsource.Na na = this.f5880a;
        na.a(new com.ironsource.Ra(na, a2));
        a2.a(this.f5880a.g());
    }

    @Override // com.ironsource.Sa
    public void c() {
        com.ironsource.L2 k = this.f5880a.k();
        if (k != null) {
            k.a(false);
        }
        this.f5880a.a((com.ironsource.L2) null);
        com.ironsource.Na na = this.f5880a;
        na.a(new com.ironsource.Pa(na));
    }

    @Override // com.ironsource.Sa
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5880a.a("Received load failed before load called");
    }
}
