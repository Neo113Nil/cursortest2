package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0835o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0835o f11806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0835o f11807b;

    static {
        C0835o c0835o = new C0835o();
        Collections.emptyMap();
        f11807b = c0835o;
    }

    public static C0835o a() {
        C0835o c0835o = f11806a;
        if (c0835o == null) {
            synchronized (C0835o.class) {
                try {
                    c0835o = f11806a;
                    if (c0835o == null) {
                        Class cls = AbstractC0834n.f11804a;
                        C0835o c0835o2 = null;
                        if (cls != null) {
                            try {
                                c0835o2 = (C0835o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0835o2 == null) {
                            c0835o2 = f11807b;
                        }
                        f11806a = c0835o2;
                        c0835o = c0835o2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c0835o;
    }
}
