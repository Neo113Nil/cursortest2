package com.ironsource;

/* loaded from: classes5.dex */
public final class Sg implements com.ironsource.Vg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Og f5967a;

    public Sg(com.ironsource.Og waterfallOperations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f5967a = waterfallOperations;
    }

    @Override // com.ironsource.Vg
    public void a() {
    }

    @Override // com.ironsource.Vg
    public void a(com.ironsource.B it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.f5967a.a(it);
        this.f5967a.a();
    }

    @Override // com.ironsource.Vg
    public com.ironsource.Nd b() {
        return com.ironsource.Nd.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Vg
    public com.ironsource.B c() {
        return this.f5967a.a(0);
    }
}
