package com.apm.insight.b;

import android.content.Context;

/* compiled from: CrashANRHandler.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f3956a;
    private static g c;
    private final b b;

    public static f a(Context context) {
        if (f3956a == null) {
            synchronized (f.class) {
                if (f3956a == null) {
                    f3956a = new f(context);
                }
            }
        }
        return f3956a;
    }

    private f(Context context) {
        this.b = new b(context);
        g gVar = new g();
        c = gVar;
        gVar.a();
    }

    public final b a() {
        return this.b;
    }

    public static g b() {
        return c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }
}
