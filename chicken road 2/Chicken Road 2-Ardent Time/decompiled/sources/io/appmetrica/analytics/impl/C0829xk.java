package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829xk implements io.appmetrica.analytics.impl.Pc, io.appmetrica.analytics.impl.InterfaceC0494km, io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7119a = "rp";

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f7120b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public volatile io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider f7121c = new io.appmetrica.analytics.impl.A7();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
        java.util.Map F2 = i1.AbstractC0203v.F(new h1.C0172d(str, i1.AbstractC0203v.F(new h1.C0172d(str2, Q1.d.A(th)))));
        qj.getClass();
        qj.a(new io.appmetrica.analytics.impl.Pj("service_module_errors", F2));
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final java.util.List<io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase> b() {
        java.lang.Object obj;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f7120b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                obj = moduleServicesDatabase != null ? java.lang.Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (java.lang.Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th);
                obj = h1.C0177i.f3302a;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final java.util.Map<java.lang.String, io.appmetrica.analytics.impl.Yc> c() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f7120b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            h1.C0172d c0172d = null;
            try {
                io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    c0172d = new h1.C0172d(moduleServiceEntryPoint.getIdentifier(), new io.appmetrica.analytics.impl.Yc(remoteConfigExtensionConfiguration));
                }
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (c0172d != null) {
                arrayList.add(c0172d);
            }
        }
        java.util.Map<java.lang.String, io.appmetrica.analytics.impl.Yc> J2 = i1.AbstractC0202u.J(arrayList);
        a(hashSet);
        return J2;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final java.util.Map<java.lang.String, java.lang.Integer> d() {
        java.util.List list;
        io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        java.util.Map<java.lang.String, java.lang.Integer> blocks;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f7120b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null) {
                list = i1.AbstractC0202u.I(blocks);
                arrayList.addAll(list);
            }
            list = c0199r;
            arrayList.addAll(list);
        }
        java.util.Map<java.lang.String, java.lang.Integer> J2 = i1.AbstractC0202u.J(arrayList);
        a(hashSet);
        return J2;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final java.util.List<io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.location.Location>> e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f7120b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            io.appmetrica.analytics.coreapi.internal.backport.Consumer<android.location.Location> consumer = null;
            try {
                io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    consumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (java.lang.Throwable th) {
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

    @Override // io.appmetrica.analytics.impl.Pc
    public final io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController f() {
        io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f7120b.iterator();
        do {
            moduleLocationSourcesServiceController = null;
            if (!it.hasNext()) {
                break;
            }
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (moduleLocationSourcesServiceController == null);
        a(hashSet);
        return moduleLocationSourcesServiceController;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final io.appmetrica.analytics.coreapi.internal.control.Toggle g() {
        io.appmetrica.analytics.coreapi.internal.control.Toggle toggle;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f7120b.iterator();
        do {
            toggle = null;
            if (!it.hasNext()) {
                break;
            }
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    toggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (toggle == null);
        a(hashSet);
        return toggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy getAskForPermissionStrategy() {
        return this.f7121c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final java.util.List<java.lang.String> h() {
        io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f7120b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (r4 = remoteConfigExtensionConfiguration.getFeatures()) != null) {
                arrayList.addAll(r4);
            }
            java.util.List<java.lang.String> list = c0199r;
            arrayList.addAll(list);
        }
        a(hashSet);
        return arrayList;
    }

    public final android.os.Bundle i() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f7120b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            android.os.Bundle bundle2 = null;
            try {
                io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    bundle2 = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (java.lang.Throwable th) {
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
    public final void a(io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<java.lang.Object> moduleServiceEntryPoint) {
        this.f7120b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.i.a(this.f7119a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider)) {
            this.f7121c = (io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0494km
    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        java.util.HashSet hashSet = new java.util.HashSet();
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = new io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers(c0365fm.f5914d, c0365fm.f5911a, c0365fm.f5912b);
        io.appmetrica.analytics.impl.Kg kg = new io.appmetrica.analytics.impl.Kg(c0365fm.f5931v, c0365fm.f5930u);
        java.util.Iterator it = this.f7120b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new io.appmetrica.analytics.impl.C0751uk(sdkIdentifiers, kg, c0365fm.f5909A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (java.lang.Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th);
            }
        }
        a(hashSet);
    }

    public final void a(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.impl.C0365fm c0365fm) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f7120b.iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint moduleServiceEntryPoint = (io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new io.appmetrica.analytics.impl.C0751uk(new io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers(c0365fm.f5914d, c0365fm.f5911a, c0365fm.f5912b), new io.appmetrica.analytics.impl.Kg(c0365fm.f5931v, c0365fm.f5930u), c0365fm.f5909A.get(moduleServiceEntryPoint.getIdentifier())));
                io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    io.appmetrica.analytics.impl.Uc uc = io.appmetrica.analytics.impl.C0560na.f6484I.t;
                    java.lang.String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (uc) {
                        uc.f5071a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (java.lang.Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "init", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(java.util.HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f7120b.removeAll(hashSet);
    }
}
