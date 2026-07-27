package com.onesignal.common.services;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class ServiceRegistration<T> {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> ServiceRegistration<T> provides() {
        i.i();
        throw null;
    }

    public abstract Object resolve(IServiceProvider iServiceProvider);

    public final <TService> ServiceRegistration<T> provides(Class<TService> c2) {
        i.e(c2, "c");
        this.services.add(c2);
        return this;
    }
}
