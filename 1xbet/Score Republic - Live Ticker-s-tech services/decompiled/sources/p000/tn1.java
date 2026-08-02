package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tn1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f7536a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b */
    public static final vn1 f7537b;

    static {
        vn1 vn1Var;
        for (int i = 0; i < 2; i++) {
            vn1Var = null;
            try {
                vn1Var = (vn1) Class.forName(f7536a[i]).asSubclass(vn1.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (vn1Var != null) {
                f7537b = vn1Var;
            }
        }
        vn1Var = new vn1();
        f7537b = vn1Var;
    }
}
