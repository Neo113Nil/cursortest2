package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e10 {

    /* JADX INFO: renamed from: j */
    public static final e10 f1897j;

    /* JADX INFO: renamed from: k */
    public static final e10 f1898k;

    /* JADX INFO: renamed from: l */
    public static final e10 f1899l;

    /* JADX INFO: renamed from: m */
    public static final e10 f1900m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ e10[] f1901n;

    static {
        e10 e10Var = new e10("UNKNOWN_DISMISS_TYPE", 0);
        f1897j = e10Var;
        e10 e10Var2 = new e10("AUTO", 1);
        f1898k = e10Var2;
        e10 e10Var3 = new e10("CLICK", 2);
        f1899l = e10Var3;
        e10 e10Var4 = new e10("SWIPE", 3);
        f1900m = e10Var4;
        f1901n = new e10[]{e10Var, e10Var2, e10Var3, e10Var4};
    }

    public static e10 valueOf(String str) {
        return (e10) Enum.valueOf(e10.class, str);
    }

    public static e10[] values() {
        return (e10[]) f1901n.clone();
    }
}
