package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ud implements InterfaceC4532m9 {

    /* renamed from: a, reason: collision with root package name */
    private final C4345c1 f7951a;
    private final C4376de b;

    public Ud(C4345c1 adapterConfig, C4376de adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f7951a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4683v
    public long b() {
        return this.b.i();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String c() {
        String f = this.f7951a.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean d() {
        return !this.f7951a.j();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String e() {
        String a2 = this.f7951a.a();
        Intrinsics.checkNotNullExpressionValue(a2, "adapterConfig.adSourceNameForEvents");
        return a2;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public EnumC4586p9 f() {
        return EnumC4586p9.b.a(this.f7951a.d());
    }
}
