package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0879o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0879o f11806a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0879o f11807b;

    static {
        C0879o c0879o = new C0879o();
        Collections.emptyMap();
        f11807b = c0879o;
    }

    public static C0879o a() {
        C0879o c0879o = f11806a;
        if (c0879o == null) {
            synchronized (C0879o.class) {
                try {
                    c0879o = f11806a;
                    if (c0879o == null) {
                        Class cls = AbstractC0878n.f11804a;
                        C0879o c0879o2 = null;
                        if (cls != null) {
                            try {
                                c0879o2 = (C0879o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0879o2 == null) {
                            c0879o2 = f11807b;
                        }
                        f11806a = c0879o2;
                        c0879o = c0879o2;
                    }
                } finally {
                }
            }
        }
        return c0879o;
    }
}
