package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class IAlog {

    /* renamed from: a, reason: collision with root package name */
    public static int f4283a = 4;
    public static final com.fyber.inneractive.sdk.logger.a b = new com.fyber.inneractive.sdk.logger.a();
    public static final com.fyber.inneractive.sdk.util.x0 c = new com.fyber.inneractive.sdk.util.x0();

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static void b(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).log(1, null, str, objArr);
        }
    }

    public static void e(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void f(java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        java.util.Iterator it = c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.logger.FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    public static java.lang.String a(java.lang.Object obj) {
        return "(" + java.lang.Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + com.ironsource.X3.j.d + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)) + "] ";
    }

    public static java.lang.String a(java.lang.Class cls) {
        return "(" + java.lang.Thread.currentThread().getName() + "): " + cls.getSimpleName() + com.ironsource.X3.j.d + java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)) + "] ";
    }
}
