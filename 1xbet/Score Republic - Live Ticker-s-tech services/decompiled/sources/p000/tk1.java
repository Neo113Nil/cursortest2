package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tk1 {

    /* JADX INFO: renamed from: b */
    public static final tk1 f7459b;

    /* JADX INFO: renamed from: a */
    public C0186et f7460a;

    static {
        tk1 tk1Var = new tk1();
        tk1Var.f7460a = null;
        f7459b = tk1Var;
    }

    /* JADX INFO: renamed from: a */
    public static C0186et m4792a(Context context) {
        C0186et c0186et;
        tk1 tk1Var = f7459b;
        synchronized (tk1Var) {
            try {
                if (tk1Var.f7460a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    tk1Var.f7460a = new C0186et(context, 3, false);
                }
                c0186et = tk1Var.f7460a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0186et;
    }
}
