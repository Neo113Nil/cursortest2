package com.onesignal.common.services;

import g4.AbstractC0465j;
import g4.AbstractC0466k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final Companion Companion = new Companion(null);
    private static String indent = "";
    private final Map<Class<?>, List<ServiceRegistration<?>>> serviceMap;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final String getIndent() {
            return ServiceProvider.indent;
        }

        public final void setIndent(String str) {
            i.e(str, "<set-?>");
            ServiceProvider.indent = str;
        }

        private Companion() {
        }
    }

    public ServiceProvider(List<? extends ServiceRegistration<?>> registrations) {
        i.e(registrations, "registrations");
        this.serviceMap = new LinkedHashMap();
        for (ServiceRegistration<?> serviceRegistration : registrations) {
            for (Class<?> cls : serviceRegistration.getServices()) {
                if (this.serviceMap.containsKey(cls)) {
                    List<ServiceRegistration<?>> list = this.serviceMap.get(cls);
                    i.b(list);
                    list.add(serviceRegistration);
                } else {
                    this.serviceMap.put(cls, AbstractC0466k.B0(serviceRegistration));
                }
            }
        }
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> List<T> getAllServices(Class<T> c2) {
        ArrayList arrayList;
        i.e(c2, "c");
        synchronized (this.serviceMap) {
            try {
                arrayList = new ArrayList();
                if (this.serviceMap.containsKey(c2)) {
                    Map<Class<?>, List<ServiceRegistration<?>>> map = this.serviceMap;
                    i.b(map);
                    List<ServiceRegistration<?>> list = map.get(c2);
                    i.b(list);
                    for (ServiceRegistration<?> serviceRegistration : list) {
                        Object resolve = serviceRegistration.resolve(this);
                        if (resolve == null) {
                            throw new Exception("Could not instantiate service: " + serviceRegistration);
                        }
                        arrayList.add(resolve);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final /* synthetic */ <T> List<T> getAllServices$com_onesignal_core() {
        i.i();
        throw null;
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getService(Class<T> c2) {
        i.e(c2, "c");
        T t5 = (T) getServiceOrNull(c2);
        if (t5 != null) {
            return t5;
        }
        throw new Exception("Service " + c2 + " could not be instantiated");
    }

    public final /* synthetic */ <T> T getService$com_onesignal_core() {
        i.i();
        throw null;
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> T getServiceOrNull(Class<T> c2) {
        T t5;
        ServiceRegistration serviceRegistration;
        i.e(c2, "c");
        synchronized (this.serviceMap) {
            List<ServiceRegistration<?>> list = this.serviceMap.get(c2);
            t5 = (list == null || (serviceRegistration = (ServiceRegistration) AbstractC0465j.L0(list)) == null) ? null : (T) serviceRegistration.resolve(this);
        }
        return t5;
    }

    public final /* synthetic */ <T> T getServiceOrNull$com_onesignal_core() {
        i.i();
        throw null;
    }

    @Override // com.onesignal.common.services.IServiceProvider
    public <T> boolean hasService(Class<T> c2) {
        boolean containsKey;
        i.e(c2, "c");
        synchronized (this.serviceMap) {
            containsKey = this.serviceMap.containsKey(c2);
        }
        return containsKey;
    }

    public final /* synthetic */ <T> boolean hasService$com_onesignal_core() {
        i.i();
        throw null;
    }
}
