package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a60 {

    /* JADX INFO: renamed from: a */
    public static final z50 f42a = z50.f9608a;

    /* JADX INFO: renamed from: a */
    public static z50 m31a(c50 c50Var) {
        while (c50Var != null) {
            if (c50Var.f1100D != null && c50Var.f1137t) {
                c50Var.m868j();
            }
            c50Var = c50Var.f1102F;
        }
        return f42a;
    }

    /* JADX INFO: renamed from: b */
    public static void m32b(x50 x50Var) {
        if (t50.m4691J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(x50Var.f8792j.getClass().getName()), x50Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m33c(c50 c50Var, String str) {
        str.getClass();
        m32b(new x50(c50Var, "Attempting to reuse fragment " + c50Var + " with previous ID " + str));
        m31a(c50Var).getClass();
    }
}
