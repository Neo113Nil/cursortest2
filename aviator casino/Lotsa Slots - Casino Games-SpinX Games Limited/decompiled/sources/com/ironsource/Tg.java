package com.ironsource;

/* loaded from: classes5.dex */
public final class Tg implements com.ironsource.Vg {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Og f5987a;
    private int b;

    public Tg(com.ironsource.Og waterfallOperations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallOperations, "waterfallOperations");
        this.f5987a = waterfallOperations;
    }

    @Override // com.ironsource.Vg
    public void a(com.ironsource.B it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this.b++;
        this.f5987a.a(it);
    }

    @Override // com.ironsource.Vg
    public com.ironsource.Nd b() {
        return this.b >= 2 ? com.ironsource.Nd.MAX_ATTEMPTS_REACHED : !this.f5987a.b() ? com.ironsource.Nd.NO_LOADED_ADS : com.ironsource.Nd.CAN_RECOVER;
    }

    @Override // com.ironsource.Vg
    public com.ironsource.B c() {
        return this.f5987a.a(this.b);
    }

    @Override // com.ironsource.Vg
    public void a() {
        this.f5987a.a();
    }
}
