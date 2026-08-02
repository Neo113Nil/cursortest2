package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dx0 {

    /* JADX INFO: renamed from: j */
    public static final dx0 f1868j;

    /* JADX INFO: renamed from: k */
    public static final dx0 f1869k;

    /* JADX INFO: renamed from: l */
    public static final dx0 f1870l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ dx0[] f1871m;

    static {
        dx0 dx0Var = new dx0("DEFAULT", 0);
        f1868j = dx0Var;
        dx0 dx0Var2 = new dx0("VERY_LOW", 1);
        f1869k = dx0Var2;
        dx0 dx0Var3 = new dx0("HIGHEST", 2);
        f1870l = dx0Var3;
        f1871m = new dx0[]{dx0Var, dx0Var2, dx0Var3};
    }

    public static dx0 valueOf(String str) {
        return (dx0) Enum.valueOf(dx0.class, str);
    }

    public static dx0[] values() {
        return (dx0[]) f1871m.clone();
    }
}
