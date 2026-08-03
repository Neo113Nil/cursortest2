package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: d, reason: collision with root package name */
    public static io.appmetrica.analytics.impl.A1 f4571d;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4572a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0862z1 f4573b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.BinderC0836y1 f4574c;

    public L1(android.content.Context context, io.appmetrica.analytics.impl.InterfaceC0862z1 interfaceC0862z1) {
        this.f4572a = context;
        this.f4573b = interfaceC0862z1;
    }

    public final void b() {
        io.appmetrica.analytics.impl.C0560na.a(this.f4572a);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion.init(this.f4572a);
        android.content.Context context = this.f4572a;
        io.appmetrica.analytics.impl.InterfaceC0862z1 interfaceC0862z1 = this.f4573b;
        if (f4571d == null) {
            io.appmetrica.analytics.impl.B1 b12 = new io.appmetrica.analytics.impl.B1(context, interfaceC0862z1, new io.appmetrica.analytics.impl.C0297d5(context));
            io.appmetrica.analytics.impl.C0337ek c0337ek = io.appmetrica.analytics.impl.C0560na.f6484I.f6512v;
            io.appmetrica.analytics.impl.E1 e1 = new io.appmetrica.analytics.impl.E1(b12);
            java.util.LinkedHashMap linkedHashMap = c0337ek.f5859a;
            java.lang.Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((java.util.List) obj).add(e1);
            f4571d = b12;
        }
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            this.f4574c = new io.appmetrica.analytics.impl.BinderC0836y1(a12);
            io.appmetrica.analytics.impl.C0560na c0560na = io.appmetrica.analytics.impl.C0560na.f6484I;
            c0560na.f6497f = new io.appmetrica.analytics.impl.C0543mj(c0560na.f6492a, new io.appmetrica.analytics.impl.C0569nj(a12));
            ((io.appmetrica.analytics.impl.B1) a12).onCreate();
        }
    }

    public final boolean c(android.content.Intent intent) {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            ((io.appmetrica.analytics.impl.B1) a12).b(intent);
        }
        java.lang.String action = intent.getAction();
        return (action == null || !y1.o.K(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        f4571d = null;
    }

    public final void a(android.content.Intent intent, int i2) {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            ((io.appmetrica.analytics.impl.C0731u0) ((io.appmetrica.analytics.impl.B1) a12).f4084c).f6869a.stopSelf(i2);
        }
    }

    public final void c() {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            ((io.appmetrica.analytics.impl.B1) a12).onDestroy();
        }
    }

    public final int a(android.content.Intent intent, int i2, int i3) {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 == null) {
            return 2;
        }
        ((io.appmetrica.analytics.impl.C0731u0) ((io.appmetrica.analytics.impl.B1) a12).f4084c).f6869a.stopSelf(i3);
        return 2;
    }

    public final android.os.IBinder a(android.content.Intent intent) {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            ((io.appmetrica.analytics.impl.B1) a12).a(intent);
        }
        java.lang.String action = intent.getAction();
        if (action != null && y1.o.K(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new io.appmetrica.analytics.impl.Co();
        }
        io.appmetrica.analytics.impl.BinderC0836y1 binderC0836y1 = this.f4574c;
        if (binderC0836y1 != null) {
            return binderC0836y1;
        }
        kotlin.jvm.internal.i.i("coreBinder");
        throw null;
    }

    public final void a(android.content.res.Configuration configuration) {
        if (f4571d != null) {
            io.appmetrica.analytics.impl.C0560na.f6484I.v().a(configuration);
        }
    }

    public final void b(android.content.Intent intent) {
        io.appmetrica.analytics.impl.A1 a12 = f4571d;
        if (a12 != null) {
            ((io.appmetrica.analytics.impl.B1) a12).c(intent);
        }
    }
}
