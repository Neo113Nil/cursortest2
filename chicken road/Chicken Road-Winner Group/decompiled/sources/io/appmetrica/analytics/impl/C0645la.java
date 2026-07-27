package io.appmetrica.analytics.impl;

import android.content.Context;
import e2.AbstractC0294i;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645la {

    /* renamed from: d, reason: collision with root package name */
    public static final C0645la f7800d = new C0645la();

    /* renamed from: a, reason: collision with root package name */
    public final C1009zd f7801a = new C1009zd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f7802b = AbstractC0526gk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f7803c = false;

    public final void a(Context context) {
        C0571id c0571id;
        C0878ua.a(context);
        this.f7802b.onCreate(context);
        this.f7801a.getClass();
        List<String> a3 = C0878ua.f8414H.f8439s.a();
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0571id = new C0571id(str, false);
            } else {
                C0878ua.f8414H.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0571id = new C0571id(str, true);
            }
            arrayList.add(c0571id);
        }
        new C0810rk(C0878ua.f8414H.D().f5819d).a(context);
        C0878ua.f8414H.q().a();
        new C0596jd(C0878ua.f8414H.f8425d.a(), C0878ua.f8414H.z(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.f7803c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f7803c) {
                    a(context);
                    this.f7803c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
