package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Db implements io.appmetrica.analytics.impl.InterfaceC0265c {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0369g0 f4205a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dn f4206b = new io.appmetrica.analytics.impl.Dn();

    public Db(io.appmetrica.analytics.impl.InterfaceC0369g0 interfaceC0369g0) {
        this.f4205a = interfaceC0369g0;
    }

    public static final void a(io.appmetrica.analytics.impl.Db db, io.appmetrica.analytics.impl.V v2) {
        db.f4205a.a(v2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0265c
    public final void onAppNotResponding() {
        java.lang.StackTraceElement[] stackTraceElementArr;
        io.appmetrica.analytics.impl.Dn dn = this.f4206b;
        java.lang.Thread a2 = dn.f4236a.a();
        try {
            stackTraceElementArr = dn.f4236a.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (java.lang.SecurityException unused) {
                }
            }
        } catch (java.lang.SecurityException unused2) {
            stackTraceElementArr = null;
        }
        io.appmetrica.analytics.impl.V v2 = new io.appmetrica.analytics.impl.V((io.appmetrica.analytics.impl.C0806wn) dn.f4237b.apply(a2, stackTraceElementArr), dn.a(a2, null), dn.f4238c.a());
        ((io.appmetrica.analytics.impl.C0870z9) io.appmetrica.analytics.impl.C0244b4.l().f5493c.a()).f7180b.post(new F0.c(4, this, v2));
    }
}
