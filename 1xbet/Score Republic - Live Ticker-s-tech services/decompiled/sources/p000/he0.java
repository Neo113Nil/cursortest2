package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 {

    /* JADX INFO: renamed from: j */
    public static final he0 f3184j;

    /* JADX INFO: renamed from: k */
    public static final he0 f3185k;

    /* JADX INFO: renamed from: l */
    public static final he0 f3186l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ he0[] f3187m;

    /* JADX INFO: Fake field, exist only in values array */
    he0 EF0;

    static {
        he0 he0Var = new he0("CT_UNKNOWN", 0);
        he0 he0Var2 = new he0("CT_INFO", 1);
        f3184j = he0Var2;
        he0 he0Var3 = new he0("CT_WARNING", 2);
        f3185k = he0Var3;
        he0 he0Var4 = new he0("CT_ERROR", 3);
        f3186l = he0Var4;
        f3187m = new he0[]{he0Var, he0Var2, he0Var3, he0Var4};
    }

    public static he0 valueOf(String str) {
        return (he0) Enum.valueOf(he0.class, str);
    }

    public static he0[] values() {
        return (he0[]) f3187m.clone();
    }
}
