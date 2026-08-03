package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public final class a implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3422a;

    public a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f3422a = arrayList;
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.d(bVar, clientContext));
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.f(bVar, clientContext));
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.g(bVar, clientContext));
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.h(bVar, clientContext));
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.i(bVar, clientContext));
        arrayList.add(new io.appmetrica.analytics.adrevenue.admob.v23.impl.c(bVar, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final java.lang.String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        java.util.Iterator it = this.f3422a.iterator();
        while (it.hasNext()) {
            if (((io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor) it.next()).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
