package com.ironsource;

/* loaded from: classes5.dex */
public final class Z2 implements com.ironsource.InterfaceC3149l9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3016e1 f6109a;
    private final com.ironsource.U2 b;

    public Z2(com.ironsource.C3016e1 adapterConfig, com.ironsource.U2 adFormatConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f6109a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC3034f1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC3318v
    public long b() {
        return this.b.b();
    }

    @Override // com.ironsource.InterfaceC3034f1
    public java.lang.String c() {
        java.lang.String f = this.f6109a.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC3034f1
    public boolean d() {
        return !this.f6109a.j();
    }

    @Override // com.ironsource.InterfaceC3034f1
    public java.lang.String e() {
        java.lang.String a2 = this.f6109a.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "adapterConfig.adSourceNameForEvents");
        return a2;
    }

    @Override // com.ironsource.InterfaceC3034f1
    public com.ironsource.EnumC3203o9 f() {
        return com.ironsource.EnumC3203o9.b.a(this.f6109a.d());
    }
}
