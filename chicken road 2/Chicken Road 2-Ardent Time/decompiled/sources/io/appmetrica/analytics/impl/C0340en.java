package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340en extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0366fn f5864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340en(io.appmetrica.analytics.impl.C0366fn c0366fn) {
        super(0);
        this.f5864a = c0366fn;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        io.appmetrica.analytics.impl.C0366fn c0366fn = this.f5864a;
        java.lang.String a2 = c0366fn.f5936a.a();
        if (a2 != null) {
        }
        java.lang.String a3 = c0366fn.f5937b.a();
        if (a3 != null) {
            hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a3);
        }
        return hashMap;
    }
}
