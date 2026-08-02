package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class t3 {
    private static final /* synthetic */ t3[] $VALUES;
    public static final t3 Filled;
    public static final t3 Outlined;

    static {
        t3 t3Var = new t3("Filled", 0);
        Filled = t3Var;
        t3 t3Var2 = new t3("Outlined", 1);
        Outlined = t3Var2;
        $VALUES = new t3[]{t3Var, t3Var2};
    }

    private t3() {
        throw null;
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) $VALUES.clone();
    }
}
