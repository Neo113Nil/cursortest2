package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.H5 f5322c;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X3 f5320a = new io.appmetrica.analytics.impl.X3();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f5321b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f5323d = new java.util.concurrent.CopyOnWriteArrayList();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
        java.util.Map F2 = i1.AbstractC0203v.F(new h1.C0172d(str, i1.AbstractC0203v.F(new h1.C0172d(str2, Q1.d.A(th)))));
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Pj("client_module_errors", F2));
    }

    public final io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor b() {
        io.appmetrica.analytics.impl.K5 k5;
        io.appmetrica.analytics.impl.H5 h5 = this.f5322c;
        if (h5 == null || (k5 = ((io.appmetrica.analytics.impl.K3) h5).f4525b) == null) {
            return null;
        }
        return k5.f4534a;
    }

    public final void c() {
        java.util.Iterator it = this.f5321b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint moduleClientEntryPoint = (io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (java.lang.Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f5323d;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f5321b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector adRevenueCollector = ((io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            java.lang.Object next = it3.next();
            if (((io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList2));
        java.util.Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(i1.AbstractC0190i.X(i1.AbstractC0190i.a0(arrayList3)));
    }

    public final java.util.List<java.lang.String> a() {
        return this.f5323d;
    }

    public final void a(io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint<java.lang.Object> moduleClientEntryPoint) {
        this.f5321b.add(moduleClientEntryPoint);
    }

    public final void a(io.appmetrica.analytics.impl.H5 h5) {
        this.f5322c = h5;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f5321b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint moduleClientEntryPoint = (io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(h5);
            } catch (java.lang.Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.f5321b.removeAll(hashSet);
    }

    public final void a(android.os.Bundle bundle, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        java.util.Iterator it = this.f5321b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint moduleClientEntryPoint = (io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint) it.next();
            try {
                io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    io.appmetrica.analytics.impl.X3 x3 = this.f5320a;
                    java.lang.String identifier = moduleClientEntryPoint.getIdentifier();
                    x3.getClass();
                    android.os.Bundle bundle2 = bundle.getBundle(identifier);
                    io.appmetrica.analytics.impl.W3 w3 = bundle2 != null ? new io.appmetrica.analytics.impl.W3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (w3 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(w3);
                    }
                }
            } catch (java.lang.Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
