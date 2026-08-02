package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
final class U0 {
    private static final /* synthetic */ U0[] $VALUES;
    public static final U0 Focused;
    public static final U0 UnfocusedEmpty;
    public static final U0 UnfocusedNotEmpty;

    static {
        U0 u02 = new U0("Focused", 0);
        Focused = u02;
        U0 u03 = new U0("UnfocusedEmpty", 1);
        UnfocusedEmpty = u03;
        U0 u04 = new U0("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = u04;
        $VALUES = new U0[]{u02, u03, u04};
    }

    private U0() {
        throw null;
    }

    public static U0 valueOf(String str) {
        return (U0) Enum.valueOf(U0.class, str);
    }

    public static U0[] values() {
        return (U0[]) $VALUES.clone();
    }
}
