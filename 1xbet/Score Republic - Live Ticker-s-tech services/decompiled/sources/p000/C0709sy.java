package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0709sy {

    /* JADX INFO: renamed from: a */
    public static volatile C0709sy f7225a;

    /* JADX INFO: renamed from: b */
    public static final C0709sy f7226b;

    static {
        C0709sy c0709sy = new C0709sy();
        Map map = Collections.EMPTY_MAP;
        f7226b = c0709sy;
    }

    /* JADX INFO: renamed from: a */
    public static C0709sy m4607a() {
        C0709sy c0709sy;
        C0709sy c0709sy2 = f7225a;
        if (c0709sy2 != null) {
            return c0709sy2;
        }
        synchronized (C0709sy.class) {
            try {
                c0709sy = f7225a;
                if (c0709sy == null) {
                    Class cls = AbstractC0635qy.f6630a;
                    C0709sy c0709sy3 = null;
                    if (cls != null) {
                        try {
                            c0709sy3 = (C0709sy) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0709sy = c0709sy3 != null ? c0709sy3 : f7226b;
                    f7225a = c0709sy;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0709sy;
    }
}
