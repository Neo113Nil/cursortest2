package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0612pa f4394a = new io.appmetrica.analytics.impl.C0612pa();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f4395b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0365fm f4396c = null;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fl f4397d = new io.appmetrica.analytics.impl.Fl(this);

    public static final io.appmetrica.analytics.impl.Hl a() {
        return io.appmetrica.analytics.impl.Gl.f4351a;
    }

    public final io.appmetrica.analytics.impl.Am a(android.content.Context context, io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.Zl zl) {
        io.appmetrica.analytics.impl.Am am = (io.appmetrica.analytics.impl.Am) this.f4395b.get(q4.f4859a);
        boolean z2 = true;
        if (am == null) {
            synchronized (this.f4395b) {
                try {
                    am = (io.appmetrica.analytics.impl.Am) this.f4395b.get(q4.f4859a);
                    if (am == null) {
                        am = new io.appmetrica.analytics.impl.Am(new io.appmetrica.analytics.impl.Bm(context, q4.f4859a, zl, this.f4397d));
                        am.f();
                        this.f4395b.put(q4.f4859a, am);
                        z2 = false;
                    }
                } finally {
                }
            }
        }
        if (z2) {
            am.a(zl);
        }
        return am;
    }

    public final void a(io.appmetrica.analytics.impl.Q4 q4, io.appmetrica.analytics.impl.Ql ql) {
        synchronized (this.f4395b) {
            try {
                this.f4394a.a(q4.f4859a, ql);
                io.appmetrica.analytics.impl.C0365fm c0365fm = this.f4396c;
                if (c0365fm != null) {
                    ql.a(c0365fm);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
