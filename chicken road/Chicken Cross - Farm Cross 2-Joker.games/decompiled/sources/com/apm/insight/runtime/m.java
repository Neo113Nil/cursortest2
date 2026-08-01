package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: NpthHandlerThread.java */
/* loaded from: classes5.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f4077a;
    private static volatile Handler b;

    private static HandlerThread b() {
        if (f4077a == null) {
            synchronized (m.class) {
                if (f4077a == null) {
                    p pVar = new p("default_npth_thread");
                    f4077a = pVar;
                    pVar.b();
                }
            }
        }
        return f4077a.c();
    }

    public static p a() {
        if (f4077a == null) {
            b();
        }
        return f4077a;
    }
}
