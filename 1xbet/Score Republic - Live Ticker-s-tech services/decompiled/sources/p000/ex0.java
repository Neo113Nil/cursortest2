package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 {

    /* JADX INFO: renamed from: j */
    public static final ex0 f2198j;

    /* JADX INFO: renamed from: k */
    public static final ex0 f2199k;

    /* JADX INFO: renamed from: l */
    public static final ex0 f2200l;

    /* JADX INFO: renamed from: m */
    public static final ex0 f2201m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ ex0[] f2202n;

    static {
        ex0 ex0Var = new ex0("IMMEDIATE", 0);
        f2198j = ex0Var;
        ex0 ex0Var2 = new ex0("HIGH", 1);
        f2199k = ex0Var2;
        ex0 ex0Var3 = new ex0("NORMAL", 2);
        f2200l = ex0Var3;
        ex0 ex0Var4 = new ex0("LOW", 3);
        f2201m = ex0Var4;
        f2202n = new ex0[]{ex0Var, ex0Var2, ex0Var3, ex0Var4};
    }

    public static ex0 valueOf(String str) {
        return (ex0) Enum.valueOf(ex0.class, str);
    }

    public static ex0[] values() {
        return (ex0[]) f2202n.clone();
    }
}
