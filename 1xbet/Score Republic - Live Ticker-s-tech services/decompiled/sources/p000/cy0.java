package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cy0 {

    /* JADX INFO: renamed from: j */
    public static final cy0 f1489j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cy0[] f1490k;

    static {
        cy0 cy0Var = new cy0("DEFAULT", 0);
        f1489j = cy0Var;
        f1490k = new cy0[]{cy0Var, new cy0("SIGNED", 1), new cy0("FIXED", 2)};
    }

    public static cy0 valueOf(String str) {
        return (cy0) Enum.valueOf(cy0.class, str);
    }

    public static cy0[] values() {
        return (cy0[]) f1490k.clone();
    }
}
