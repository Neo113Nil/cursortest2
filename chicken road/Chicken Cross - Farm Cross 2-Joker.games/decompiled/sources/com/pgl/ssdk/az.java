package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a3;

/* loaded from: classes7.dex */
public class az {

    /* renamed from: a, reason: collision with root package name */
    private final a2<a0> f11625a;
    private a3 b;
    private a3 c;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final az f11626a = new az();
    }

    private az() {
        this.f11625a = a2.a(2);
    }

    private a0 a(a3.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static az a() {
        return b.f11626a;
    }

    public a3 a(String str) {
        return b(null, str);
    }

    public a3 b() {
        if (this.c == null) {
            synchronized (az.class) {
                if (this.c == null) {
                    this.c = a("pags_net_handler");
                }
            }
        }
        return this.c;
    }

    public a3 b(a3.a aVar, String str) {
        a0 a2 = this.f11625a.a();
        if (a2 == null) {
            return a(aVar, str);
        }
        a2.a(aVar);
        a2.a(str);
        return a2;
    }

    public a3 c() {
        if (this.b == null) {
            synchronized (az.class) {
                if (this.b == null) {
                    this.b = a("pags_ssdk_handler");
                }
            }
        }
        return this.b;
    }
}
