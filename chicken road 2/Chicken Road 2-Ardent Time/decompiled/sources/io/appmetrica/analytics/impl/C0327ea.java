package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327ea {

    /* renamed from: d, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0327ea f5833d = new io.appmetrica.analytics.impl.C0327ea();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0692sd f5834a = new io.appmetrica.analytics.impl.C0692sd();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer f5835b = io.appmetrica.analytics.impl.AbstractC0260bk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5836c = false;

    public final void a(android.content.Context context) {
        io.appmetrica.analytics.impl.C0253bd c0253bd;
        io.appmetrica.analytics.impl.C0560na.a(context);
        this.f5835b.onCreate(context);
        this.f5834a.getClass();
        java.util.List<java.lang.String> a2 = io.appmetrica.analytics.impl.C0560na.f6484I.f6510s.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(a2));
        for (java.lang.String str : a2) {
            java.lang.Object loadAndInstantiateClassWithDefaultConstructor = io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0253bd = new io.appmetrica.analytics.impl.C0253bd(str, false);
            } else {
                io.appmetrica.analytics.impl.C0560na.f6484I.p().a((io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint<java.lang.Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0253bd = new io.appmetrica.analytics.impl.C0253bd(str, true);
            }
            arrayList.add(c0253bd);
        }
        new io.appmetrica.analytics.impl.C0570nk(io.appmetrica.analytics.impl.C0560na.f6484I.D().f4077d).a(context);
        io.appmetrica.analytics.impl.C0807wo c0807wo = io.appmetrica.analytics.impl.C0560na.f6484I.D().f4076c;
        synchronized (c0807wo) {
            c0807wo.f7070a.a();
        }
        io.appmetrica.analytics.impl.C0560na.f6484I.q().a();
        a().a(arrayList);
    }

    public final void b(android.content.Context context) {
        if (this.f5836c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f5836c) {
                    a(context);
                    this.f5836c = true;
                }
            } finally {
            }
        }
    }

    public static io.appmetrica.analytics.impl.C0279cd a() {
        io.appmetrica.analytics.impl.C0492kk c0492kk = io.appmetrica.analytics.impl.C0560na.f6484I.f6495d;
        if (c0492kk.f6309b == null) {
            synchronized (c0492kk) {
                try {
                    if (c0492kk.f6309b == null) {
                        c0492kk.f6308a.getClass();
                        io.appmetrica.analytics.impl.HandlerThreadC0277cb a2 = io.appmetrica.analytics.impl.C0870z9.a("IAA-SC");
                        c0492kk.f6309b = new io.appmetrica.analytics.impl.C0870z9(a2, a2.getLooper(), new android.os.Handler(a2.getLooper()));
                    }
                } finally {
                }
            }
        }
        return new io.appmetrica.analytics.impl.C0279cd(c0492kk.f6309b, io.appmetrica.analytics.impl.C0560na.f6484I.y(), "service_modules", new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }
}
