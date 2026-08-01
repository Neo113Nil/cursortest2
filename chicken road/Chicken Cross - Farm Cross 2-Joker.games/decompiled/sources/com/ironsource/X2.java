package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class X2 implements InterfaceC4532m9 {

    /* renamed from: a, reason: collision with root package name */
    private final C4345c1 f8002a;
    private final S2 b;

    public X2(C4345c1 adapterConfig, S2 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f8002a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4683v
    public long b() {
        return this.b.b();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String c() {
        String f = this.f8002a.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean d() {
        return !this.f8002a.j();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String e() {
        String a2 = this.f8002a.a();
        Intrinsics.checkNotNullExpressionValue(a2, "adapterConfig.adSourceNameForEvents");
        return a2;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public EnumC4586p9 f() {
        return EnumC4586p9.b.a(this.f8002a.d());
    }
}
