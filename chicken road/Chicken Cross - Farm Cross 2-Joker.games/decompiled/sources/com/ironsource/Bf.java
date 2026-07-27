package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes6.dex */
public class Bf extends Thread {
    private static Bf b;

    /* renamed from: a, reason: collision with root package name */
    private a f7576a;

    private class a extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f7577a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        Handler a() {
            return this.f7577a;
        }

        void b() {
            this.f7577a = new Handler(getLooper());
        }
    }

    private Bf() {
        a aVar = new a(getClass().getSimpleName());
        this.f7576a = aVar;
        aVar.start();
        this.f7576a.b();
    }

    public static synchronized Bf a() {
        Bf bf;
        synchronized (Bf.class) {
            if (b == null) {
                b = new Bf();
            }
            bf = b;
        }
        return bf;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f7576a;
        if (aVar == null) {
            return;
        }
        Handler a2 = aVar.a();
        if (a2 != null) {
            a2.post(runnable);
        }
    }
}
