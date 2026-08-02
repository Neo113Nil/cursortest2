package Kd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class h0 {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 FLEXIBLE_LOWER;
    public static final h0 FLEXIBLE_UPPER;
    public static final h0 INFLEXIBLE;

    static {
        h0 h0Var = new h0("FLEXIBLE_LOWER", 0);
        FLEXIBLE_LOWER = h0Var;
        h0 h0Var2 = new h0("FLEXIBLE_UPPER", 1);
        FLEXIBLE_UPPER = h0Var2;
        h0 h0Var3 = new h0("INFLEXIBLE", 2);
        INFLEXIBLE = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        $VALUES = h0VarArr;
        $ENTRIES = Xc.b.a(h0VarArr);
    }

    private h0() {
        throw null;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
