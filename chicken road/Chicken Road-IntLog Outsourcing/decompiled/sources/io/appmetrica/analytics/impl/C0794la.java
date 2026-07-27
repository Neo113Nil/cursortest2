package io.appmetrica.analytics.impl;

import android.content.Context;
import g4.AbstractC0467l;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794la {

    /* renamed from: d, reason: collision with root package name */
    public static final C0794la f8723d = new C0794la();

    /* renamed from: a, reason: collision with root package name */
    public final C1158zd f8724a = new C1158zd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f8725b = AbstractC0675gk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8726c = false;

    public final void a(Context context) {
        C0720id c0720id;
        C1027ua.a(context);
        this.f8725b.onCreate(context);
        this.f8724a.getClass();
        List<String> a6 = C1027ua.f9366H.f9392s.a();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(a6, 10));
        for (String str : a6) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0720id = new C0720id(str, false);
            } else {
                C1027ua.f9366H.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0720id = new C0720id(str, true);
            }
            arrayList.add(c0720id);
        }
        new C0959rk(C1027ua.f9366H.D().f6655d).a(context);
        C1027ua.f9366H.q().a();
        new C0745jd(C1027ua.f9366H.f9377d.a(), C1027ua.f9366H.z(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.f8726c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f8726c) {
                    a(context);
                    this.f8726c = true;
                }
            } finally {
            }
        }
    }
}
