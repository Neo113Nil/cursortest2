package p000;

/* JADX INFO: renamed from: kq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0405kq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4497a = 0;

    static {
        String property;
        int i = lc1.f4761a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0368jq runnableC0368jq = RunnableC0368jq.f4062u;
            return;
        }
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        ha0 ha0Var = uk0.f7838a;
        ha0 ha0Var2 = ha0Var.f3139n;
        if (ha0Var == null) {
            RunnableC0368jq runnableC0368jq2 = RunnableC0368jq.f4062u;
        }
    }
}
