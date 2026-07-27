package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0946x0 {
    public static boolean a() {
        boolean z3;
        synchronized (C0920w0.class) {
            z3 = C0920w0.f;
        }
        return z3;
    }

    public static void b() {
        synchronized (C0920w0.class) {
            C0920w0.f = true;
        }
    }
}
