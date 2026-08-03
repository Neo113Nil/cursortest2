package com.ironsource;

/* loaded from: classes5.dex */
public final class Cb implements com.ironsource.Q5<com.ironsource.Bb> {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5658a;
    private final com.ironsource.Ed b;
    private final com.ironsource.InterfaceC3052g1 c;
    private final boolean d;

    public Cb(java.lang.String adm, com.ironsource.Ed providerName, com.ironsource.InterfaceC3052g1 adapterConfigs, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f5658a = adm;
        this.b = providerName;
        this.c = adapterConfigs;
        this.d = z;
    }

    @Override // com.ironsource.Q5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.ironsource.Bb a() throws com.ironsource.C3261re, java.lang.Exception {
        com.ironsource.InterfaceC3149l9 a2 = this.c.a(this.b);
        new com.ironsource.U(this.f5658a, a2, this.d).a();
        if (a2 != null) {
            return new com.ironsource.Bb(a2.f(), a2.e(), a2.b(), a2.d(), false, 16, null);
        }
        return null;
    }
}
