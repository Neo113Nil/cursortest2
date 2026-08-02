package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qh0 {

    /* JADX INFO: renamed from: j */
    public static final qh0 f6497j;

    /* JADX INFO: renamed from: k */
    public static final qh0 f6498k;

    /* JADX INFO: renamed from: l */
    public static final qh0 f6499l;

    /* JADX INFO: renamed from: m */
    public static final qh0 f6500m;

    /* JADX INFO: renamed from: n */
    public static final qh0 f6501n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ qh0[] f6502o;

    static {
        qh0 qh0Var = new qh0("DESTROYED", 0);
        f6497j = qh0Var;
        qh0 qh0Var2 = new qh0("INITIALIZED", 1);
        f6498k = qh0Var2;
        qh0 qh0Var3 = new qh0("CREATED", 2);
        f6499l = qh0Var3;
        qh0 qh0Var4 = new qh0("STARTED", 3);
        f6500m = qh0Var4;
        qh0 qh0Var5 = new qh0("RESUMED", 4);
        f6501n = qh0Var5;
        f6502o = new qh0[]{qh0Var, qh0Var2, qh0Var3, qh0Var4, qh0Var5};
    }

    public static qh0 valueOf(String str) {
        return (qh0) Enum.valueOf(qh0.class, str);
    }

    public static qh0[] values() {
        return (qh0[]) f6502o.clone();
    }
}
