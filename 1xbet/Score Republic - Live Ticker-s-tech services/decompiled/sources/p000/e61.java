package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e61 {

    /* JADX INFO: renamed from: j */
    public static final e61 f1970j;

    /* JADX INFO: renamed from: k */
    public static final e61 f1971k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ e61[] f1972l;

    static {
        e61 e61Var = new e61("NONE", 0);
        f1970j = e61Var;
        e61 e61Var2 = new e61("INTEGRITY", 1);
        e61 e61Var3 = new e61("PRIVACY_AND_INTEGRITY", 2);
        f1971k = e61Var3;
        f1972l = new e61[]{e61Var, e61Var2, e61Var3};
    }

    public static e61 valueOf(String str) {
        return (e61) Enum.valueOf(e61.class, str);
    }

    public static e61[] values() {
        return (e61[]) f1972l.clone();
    }
}
