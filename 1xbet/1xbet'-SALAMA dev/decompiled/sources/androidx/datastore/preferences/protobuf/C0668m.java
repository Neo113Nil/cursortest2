package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0668m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0668m f9223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0668m f9224b;

    static {
        C0668m c0668m = new C0668m();
        Collections.emptyMap();
        f9224b = c0668m;
    }

    public static C0668m a() {
        Q q7 = Q.f9136c;
        C0668m c0668m = f9223a;
        if (c0668m == null) {
            synchronized (C0668m.class) {
                try {
                    c0668m = f9223a;
                    if (c0668m == null) {
                        Class cls = AbstractC0667l.f9222a;
                        C0668m c0668m2 = null;
                        if (cls != null) {
                            try {
                                c0668m2 = (C0668m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0668m2 == null) {
                            c0668m2 = f9224b;
                        }
                        f9223a = c0668m2;
                        c0668m = c0668m2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c0668m;
    }
}
