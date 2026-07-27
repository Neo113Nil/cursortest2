package io.appmetrica.analytics.impl;

import android.os.Bundle;
import d2.C0274d;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510g4 {

    /* renamed from: c, reason: collision with root package name */
    public O5 f7327c;

    /* renamed from: a, reason: collision with root package name */
    public final C0484f4 f7325a = new C0484f4();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7326b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f7328d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        Vj vj = AbstractC0861tj.f8372a;
        Map k02 = e2.s.k0(new C0274d(str, e2.s.k0(new C0274d(str2, F2.b.F(th)))));
        vj.getClass();
        vj.a(new Uj("client_module_errors", k02));
    }

    public final ModuleAdRevenueProcessor b() {
        R5 r5;
        O5 o5 = this.f7327c;
        if (o5 == null || (r5 = ((S3) o5).f6545b) == null) {
            return null;
        }
        return r5.f6494a;
    }

    public final void c() {
        Iterator it = this.f7326b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7328d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f7326b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0294i.U(arrayList2));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    public final List<String> a() {
        return this.f7328d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f7326b.add(moduleClientEntryPoint);
    }

    public final void a(O5 o5) {
        this.f7327c = o5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7326b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(o5);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f7326b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f7326b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C0484f4 c0484f4 = this.f7325a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c0484f4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C0458e4 c0458e4 = bundle2 != null ? new C0458e4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c0458e4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c0458e4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
