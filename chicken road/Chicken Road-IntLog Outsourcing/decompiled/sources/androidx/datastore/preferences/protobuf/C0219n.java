package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0219n f4476a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0219n f4477b;

    static {
        C0219n c0219n = new C0219n();
        Collections.emptyMap();
        f4477b = c0219n;
    }

    public static C0219n a() {
        S s2 = S.f4392c;
        C0219n c0219n = f4476a;
        if (c0219n == null) {
            synchronized (C0219n.class) {
                try {
                    c0219n = f4476a;
                    if (c0219n == null) {
                        Class cls = AbstractC0218m.f4475a;
                        C0219n c0219n2 = null;
                        if (cls != null) {
                            try {
                                c0219n2 = (C0219n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0219n2 == null) {
                            c0219n2 = f4477b;
                        }
                        f4476a = c0219n2;
                        c0219n = c0219n2;
                    }
                } finally {
                }
            }
        }
        return c0219n;
    }
}
