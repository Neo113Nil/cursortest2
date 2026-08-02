package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 {

    /* JADX INFO: renamed from: j */
    public static final bx0 f1039j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ bx0[] f1040k;

    /* JADX INFO: Fake field, exist only in values array */
    bx0 EF0;

    static {
        bx0 bx0Var = new bx0("SRGB", 0);
        bx0 bx0Var2 = new bx0("DISPLAY_P3", 1);
        f1039j = bx0Var2;
        f1040k = new bx0[]{bx0Var, bx0Var2};
    }

    public static bx0 valueOf(String str) {
        return (bx0) Enum.valueOf(bx0.class, str);
    }

    public static bx0[] values() {
        return (bx0[]) f1040k.clone();
    }
}
