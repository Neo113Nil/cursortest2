package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class g1 {
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 End;
    public static final g1 Start;

    static {
        g1 g1Var = new g1("Start", 0);
        Start = g1Var;
        g1 g1Var2 = new g1("End", 1);
        End = g1Var2;
        $VALUES = new g1[]{g1Var, g1Var2};
    }

    private g1() {
        throw null;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}
