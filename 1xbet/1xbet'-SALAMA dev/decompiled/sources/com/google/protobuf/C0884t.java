package com.google.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0884t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0884t f12272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0884t f12273b;

    static {
        C0884t c0884t = new C0884t();
        Collections.emptyMap();
        f12273b = c0884t;
    }

    public static C0884t a() {
        C0884t c0884t = f12272a;
        if (c0884t == null) {
            synchronized (C0884t.class) {
                try {
                    c0884t = f12272a;
                    if (c0884t == null) {
                        Class cls = AbstractC0882s.f12268a;
                        C0884t c0884t2 = null;
                        if (cls != null) {
                            try {
                                c0884t2 = (C0884t) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0884t2 == null) {
                            c0884t2 = f12273b;
                        }
                        f12272a = c0884t2;
                        c0884t = c0884t2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c0884t;
    }
}
