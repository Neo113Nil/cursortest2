package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class O1 implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4753e = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fa f4754a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0659r6 f4755b = io.appmetrica.analytics.impl.C0244b4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0582o6 f4756c = new io.appmetrica.analytics.impl.C0582o6();

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dn f4757d = new io.appmetrica.analytics.impl.Dn();

    public O1(io.appmetrica.analytics.impl.C0478k6 c0478k6) {
        this.f4754a = c0478k6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        java.lang.StackTraceElement[] stackTraceElementArr;
        try {
            f4753e.set(true);
            io.appmetrica.analytics.impl.Fa fa = this.f4754a;
            io.appmetrica.analytics.impl.C0806wn apply = this.f4756c.apply(thread);
            io.appmetrica.analytics.impl.Dn dn = this.f4757d;
            java.lang.Thread a2 = dn.f4236a.a();
            java.util.ArrayList a3 = dn.a(a2, thread);
            if (thread != a2) {
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
                a3.add(0, (io.appmetrica.analytics.impl.C0806wn) dn.f4237b.apply(a2, stackTraceElementArr));
            }
            fa.a(th, new io.appmetrica.analytics.impl.V(apply, a3, this.f4755b.f6720a.a()));
        } catch (java.lang.Throwable th2) {
            io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new java.lang.Object[0]);
        }
    }
}
