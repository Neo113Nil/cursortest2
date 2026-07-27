package io.appmetrica.analytics.billingv6.impl;

import d2.C0279i;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f5264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f5265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f5266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f5264a = linkedHashMap;
        this.f5265b = map;
        this.f5266c = iVar;
    }

    @Override // o2.a
    public final Object invoke() {
        Map map = this.f5264a;
        Map map2 = this.f5265b;
        i iVar = this.f5266c;
        m.a(map, map2, iVar.f5270d, iVar.f5269c.getBillingInfoManager());
        return C0279i.f4852a;
    }
}
