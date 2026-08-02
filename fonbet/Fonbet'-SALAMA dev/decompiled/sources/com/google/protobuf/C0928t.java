package com.google.protobuf;

import java.util.Collections;

/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0928t {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0928t f12272a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928t f12273b;

    static {
        C0928t c0928t = new C0928t();
        Collections.emptyMap();
        f12273b = c0928t;
    }

    public static C0928t a() {
        C0928t c0928t = f12272a;
        if (c0928t == null) {
            synchronized (C0928t.class) {
                try {
                    c0928t = f12272a;
                    if (c0928t == null) {
                        Class cls = AbstractC0926s.f12268a;
                        C0928t c0928t2 = null;
                        if (cls != null) {
                            try {
                                c0928t2 = (C0928t) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0928t2 == null) {
                            c0928t2 = f12273b;
                        }
                        f12272a = c0928t2;
                        c0928t = c0928t2;
                    }
                } finally {
                }
            }
        }
        return c0928t;
    }
}
