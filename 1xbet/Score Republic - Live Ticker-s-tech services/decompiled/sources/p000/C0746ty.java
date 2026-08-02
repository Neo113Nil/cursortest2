package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ty */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0746ty {

    /* JADX INFO: renamed from: a */
    public static volatile C0746ty f7623a;

    /* JADX INFO: renamed from: b */
    public static final C0746ty f7624b;

    static {
        C0746ty c0746ty = new C0746ty();
        Map map = Collections.EMPTY_MAP;
        f7624b = c0746ty;
    }

    /* JADX INFO: renamed from: a */
    public static C0746ty m4866a() {
        C0746ty c0746ty;
        fy0 fy0Var = fy0.f2536c;
        C0746ty c0746ty2 = f7623a;
        if (c0746ty2 != null) {
            return c0746ty2;
        }
        synchronized (C0746ty.class) {
            try {
                c0746ty = f7623a;
                if (c0746ty == null) {
                    Class cls = AbstractC0672ry.f6988a;
                    C0746ty c0746ty3 = null;
                    if (cls != null) {
                        try {
                            c0746ty3 = (C0746ty) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0746ty = c0746ty3 != null ? c0746ty3 : f7624b;
                    f7623a = c0746ty;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0746ty;
    }
}
