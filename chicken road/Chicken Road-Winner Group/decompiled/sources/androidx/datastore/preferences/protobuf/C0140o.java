package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0140o f2270a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0140o f2271b;

    static {
        C0140o c0140o = new C0140o();
        Map map = Collections.EMPTY_MAP;
        f2271b = c0140o;
    }

    public static C0140o a() {
        C0140o c0140o;
        T t3 = T.f2190c;
        C0140o c0140o2 = f2270a;
        if (c0140o2 != null) {
            return c0140o2;
        }
        synchronized (C0140o.class) {
            try {
                c0140o = f2270a;
                if (c0140o == null) {
                    Class cls = AbstractC0139n.f2269a;
                    C0140o c0140o3 = null;
                    if (cls != null) {
                        try {
                            c0140o3 = (C0140o) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c0140o = c0140o3 != null ? c0140o3 : f2271b;
                    f2270a = c0140o;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0140o;
    }
}
