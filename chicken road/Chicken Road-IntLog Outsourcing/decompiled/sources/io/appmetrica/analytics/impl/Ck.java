package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import f4.C0430g;
import g4.AbstractC0476u;
import g4.C0471p;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Ck implements Wc, InterfaceC0884om, AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f6641a = "rp";

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6642b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f6643c = new I7();

    public static void a(String str, String str2, Throwable th) {
        Vj vj = AbstractC1010tj.f9323a;
        Map X5 = AbstractC0476u.X(new C0430g(str, AbstractC0476u.X(new C0430g(str2, K1.b.o0(th)))));
        vj.getClass();
        vj.a(new Uj("service_module_errors", X5));
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final List<ModuleServicesDatabase> b() {
        Object obj;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6642b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                obj = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th);
                obj = f4.v.f5689a;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final Map<String, C0642fd> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6642b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            C0430g c0430g = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    c0430g = new C0430g(moduleServiceEntryPoint.getIdentifier(), new C0642fd(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (c0430g != null) {
                arrayList.add(c0430g);
            }
        }
        Map<String, C0642fd> c02 = AbstractC0476u.c0(arrayList);
        a(hashSet);
        return c02;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final Map<String, Integer> d() {
        List list;
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        Map<String, Integer> blocks;
        C0471p c0471p = C0471p.f5750a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6642b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null) {
                list = AbstractC0476u.b0(blocks);
                arrayList.addAll(list);
            }
            list = c0471p;
            arrayList.addAll(list);
        }
        Map<String, Integer> c02 = AbstractC0476u.c0(arrayList);
        a(hashSet);
        return c02;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6642b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Consumer<Location> consumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    consumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (consumer != null) {
                arrayList.add(consumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6642b.iterator();
        do {
            moduleLocationSourcesServiceController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (moduleLocationSourcesServiceController == null);
        a(hashSet);
        return moduleLocationSourcesServiceController;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final Toggle g() {
        Toggle toggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f6642b.iterator();
        do {
            toggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    toggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (toggle == null);
        a(hashSet);
        return toggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f6643c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final List<String> h() {
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        C0471p c0471p = C0471p.f5750a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6642b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (r4 = remoteConfigExtensionConfiguration.getFeatures()) != null) {
                arrayList.addAll(r4);
            }
            List<String> list = c0471p;
            arrayList.addAll(list);
        }
        a(hashSet);
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        Iterator it = this.f6642b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Bundle bundle2 = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    bundle2 = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (bundle2 != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), bundle2);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f6642b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.i.a(this.f6641a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f6643c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0884om
    public final void a(C0754jm c0754jm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c0754jm.f8562d, c0754jm.f8559a, c0754jm.f8560b);
        Pg pg = new Pg(c0754jm.f8580v, c0754jm.f8579u);
        Iterator it = this.f6642b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C1165zk(sdkIdentifiers, pg, c0754jm.f8557A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th);
            }
        }
        a(hashSet);
    }

    public final void a(ServiceContext serviceContext, C0754jm c0754jm) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6642b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C1165zk(new SdkIdentifiers(c0754jm.f8562d, c0754jm.f8559a, c0754jm.f8560b), new Pg(c0754jm.f8580v, c0754jm.f8579u), c0754jm.f8557A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C0539bd c0539bd = C1027ua.f9366H.f9393t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c0539bd) {
                        c0539bd.f7927a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "init", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f6642b.removeAll(hashSet);
    }
}
