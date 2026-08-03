package com.ironsource;

/* loaded from: classes5.dex */
public class Df extends java.lang.Thread {
    private static com.ironsource.Df b;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.Df.a f5675a;

    private class a extends android.os.HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private android.os.Handler f5676a;

        a(java.lang.String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        android.os.Handler a() {
            return this.f5676a;
        }

        void b() {
            this.f5676a = new android.os.Handler(getLooper());
        }
    }

    private Df() {
        com.ironsource.Df.a aVar = new com.ironsource.Df.a(getClass().getSimpleName());
        this.f5675a = aVar;
        aVar.start();
        this.f5675a.b();
    }

    public static synchronized com.ironsource.Df a() {
        com.ironsource.Df df;
        synchronized (com.ironsource.Df.class) {
            if (b == null) {
                b = new com.ironsource.Df();
            }
            df = b;
        }
        return df;
    }

    public synchronized void a(java.lang.Runnable runnable) {
        com.ironsource.Df.a aVar = this.f5675a;
        if (aVar == null) {
            return;
        }
        android.os.Handler a2 = aVar.a();
        if (a2 != null) {
            a2.post(runnable);
        }
    }
}
