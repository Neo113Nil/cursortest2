package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G9 implements InterfaceC4532m9 {

    /* renamed from: a, reason: collision with root package name */
    private final C4345c1 f7637a;
    private final D9 b;

    public G9(C4345c1 adapterConfig, D9 adFormatConfigurations) {
        Intrinsics.checkNotNullParameter(adapterConfig, "adapterConfig");
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        this.f7637a = adapterConfig;
        this.b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4683v
    public long b() {
        return this.b.e();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String c() {
        String f = this.f7637a.f();
        Intrinsics.checkNotNullExpressionValue(f, "adapterConfig.providerName");
        return f;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public boolean d() {
        return !this.f7637a.j();
    }

    @Override // com.ironsource.InterfaceC4363d1
    public String e() {
        String a2 = this.f7637a.a();
        Intrinsics.checkNotNullExpressionValue(a2, "adapterConfig.adSourceNameForEvents");
        return a2;
    }

    @Override // com.ironsource.InterfaceC4363d1
    public EnumC4586p9 f() {
        return EnumC4586p9.b.a(this.f7637a.d());
    }
}
