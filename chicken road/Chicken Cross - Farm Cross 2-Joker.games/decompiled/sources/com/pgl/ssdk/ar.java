package com.pgl.ssdk;

import android.os.Handler;

/* loaded from: classes7.dex */
public class ar {
    private static Handler a() {
        return az.a().b();
    }

    public static void a(Runnable runnable) {
        Handler a2;
        if (runnable == null || (a2 = a()) == null) {
            return;
        }
        a2.post(runnable);
    }

    public static void a(Runnable runnable, long j) {
        Handler b;
        if (runnable == null || (b = b()) == null) {
            return;
        }
        b.postDelayed(runnable, j);
    }

    public static Handler b() {
        return az.a().c();
    }

    public static void b(Runnable runnable) {
        a(runnable, 0L);
    }
}
