package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Bb implements P5<Ab> {

    /* renamed from: a, reason: collision with root package name */
    private final String f7574a;
    private final Dd b;
    private final InterfaceC4381e1 c;
    private final boolean d;

    public Bb(String adm, Dd providerName, InterfaceC4381e1 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f7574a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.P5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Ab a() throws C4591pe, Exception {
        InterfaceC4532m9 a2 = this.c.a(this.b);
        new U(this.f7574a, a2, this.d).a();
        if (a2 != null) {
            return new Ab(a2.f(), a2.e(), a2.b(), a2.d(), false, 16, null);
        }
        return null;
    }
}
