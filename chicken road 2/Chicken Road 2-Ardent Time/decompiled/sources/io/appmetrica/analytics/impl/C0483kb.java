package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483kb {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0345f2 f6276a = new io.appmetrica.analytics.impl.C0345f2();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0478k6 f6277b = new io.appmetrica.analytics.impl.C0478k6();

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0884zn f6278c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6279d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6280e;

    public final synchronized void a(android.content.Context context, io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.impl.Ta ta) {
        if (this.f6280e) {
            return;
        }
        i1.AbstractC0196o.L(this.f6277b.f6259a, new io.appmetrica.analytics.impl.Fa[]{this.f6276a.a(context, appMetricaConfig, ta)});
        this.f6280e = true;
    }

    public final synchronized void b() {
        if (this.f6279d) {
            return;
        }
        io.appmetrica.analytics.impl.C0478k6 c0478k6 = this.f6277b;
        java.util.ArrayList arrayList = io.appmetrica.analytics.impl.C0244b4.l().f5499i.f6448a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList));
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        c0478k6.f6259a.addAll(arrayList2);
        this.f6279d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f6278c != null) {
                return;
            }
            io.appmetrica.analytics.impl.O1 o12 = new io.appmetrica.analytics.impl.O1(this.f6277b);
            this.f6278c = new io.appmetrica.analytics.impl.C0884zn(o12);
            io.appmetrica.analytics.impl.C0858yn c0858yn = new io.appmetrica.analytics.impl.C0858yn();
            c0858yn.f7169a.add(o12);
            java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c0858yn.f7169a.add(defaultUncaughtExceptionHandler);
            }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(c0858yn);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f6277b.f6259a.clear();
        this.f6279d = false;
        this.f6280e = false;
    }
}
