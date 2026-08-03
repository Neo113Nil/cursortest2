package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.billingv6.impl.i f3575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.LinkedHashMap linkedHashMap, java.util.Map map, io.appmetrica.analytics.billingv6.impl.i iVar) {
        super(0);
        this.f3573a = linkedHashMap;
        this.f3574b = map;
        this.f3575c = iVar;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        java.util.Map map = this.f3573a;
        java.util.Map map2 = this.f3574b;
        io.appmetrica.analytics.billingv6.impl.i iVar = this.f3575c;
        io.appmetrica.analytics.billingv6.impl.m.a(map, map2, iVar.f3579d, iVar.f3578c.getBillingInfoManager());
        return h1.C0177i.f3302a;
    }
}
