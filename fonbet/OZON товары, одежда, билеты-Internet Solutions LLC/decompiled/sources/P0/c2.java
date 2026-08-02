package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c2 {
    private static final /* synthetic */ c2[] $VALUES;
    public static final c2 ActionPerformed;
    public static final c2 Dismissed;

    static {
        c2 c2Var = new c2("Dismissed", 0);
        Dismissed = c2Var;
        c2 c2Var2 = new c2("ActionPerformed", 1);
        ActionPerformed = c2Var2;
        $VALUES = new c2[]{c2Var, c2Var2};
    }

    private c2() {
        throw null;
    }

    public static c2 valueOf(String str) {
        return (c2) Enum.valueOf(c2.class, str);
    }

    public static c2[] values() {
        return (c2[]) $VALUES.clone();
    }
}
