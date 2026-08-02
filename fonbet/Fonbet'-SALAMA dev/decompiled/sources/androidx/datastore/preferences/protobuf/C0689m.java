package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0689m f9223a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0689m f9224b;

    static {
        C0689m c0689m = new C0689m();
        Collections.emptyMap();
        f9224b = c0689m;
    }

    public static C0689m a() {
        Q q7 = Q.f9136c;
        C0689m c0689m = f9223a;
        if (c0689m == null) {
            synchronized (C0689m.class) {
                try {
                    c0689m = f9223a;
                    if (c0689m == null) {
                        Class cls = AbstractC0688l.f9222a;
                        C0689m c0689m2 = null;
                        if (cls != null) {
                            try {
                                c0689m2 = (C0689m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0689m2 == null) {
                            c0689m2 = f9224b;
                        }
                        f9223a = c0689m2;
                        c0689m = c0689m2;
                    }
                } finally {
                }
            }
        }
        return c0689m;
    }
}
