package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 {

    /* JADX INFO: renamed from: j */
    public static final v52 f8098j;

    /* JADX INFO: renamed from: k */
    public static final v52 f8099k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ v52[] f8100l;

    static {
        v52 v52Var = new v52("CONSENT", 0);
        f8098j = v52Var;
        v52 v52Var2 = new v52("LEGITIMATE_INTEREST", 1);
        v52 v52Var3 = new v52("FLEXIBLE_CONSENT", 2);
        v52 v52Var4 = new v52("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f8099k = v52Var4;
        f8100l = new v52[]{v52Var, v52Var2, v52Var3, v52Var4};
    }

    public static v52[] values() {
        return (v52[]) f8100l.clone();
    }
}
