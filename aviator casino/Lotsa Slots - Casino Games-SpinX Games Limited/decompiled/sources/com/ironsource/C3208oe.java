package com.ironsource;

/* renamed from: com.ironsource.oe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3208oe implements com.ironsource.H8, com.ironsource.H8.a {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C3190ne f6545a;
    private boolean b;

    @Override // com.ironsource.H8
    public com.ironsource.Ua a() {
        com.ironsource.C3190ne c3190ne = this.f6545a;
        if (c3190ne != null) {
            return new com.ironsource.Ua(c3190ne);
        }
        return null;
    }

    @Override // com.ironsource.H8
    public com.ironsource.L9 b() {
        com.ironsource.C3190ne c3190ne = this.f6545a;
        if (c3190ne != null) {
            return new com.ironsource.L9(c3190ne);
        }
        return null;
    }

    @Override // com.ironsource.H8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.H8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.H8.a
    public void a(com.ironsource.C3190ne sdkConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f6545a = sdkConfig;
    }
}
