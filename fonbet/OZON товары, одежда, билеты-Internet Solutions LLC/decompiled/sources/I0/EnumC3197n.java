package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3197n {
    private static final /* synthetic */ EnumC3197n[] $VALUES;
    public static final EnumC3197n AFTER;
    public static final EnumC3197n BEFORE;
    public static final EnumC3197n ON;

    static {
        EnumC3197n enumC3197n = new EnumC3197n("BEFORE", 0);
        BEFORE = enumC3197n;
        EnumC3197n enumC3197n2 = new EnumC3197n("ON", 1);
        ON = enumC3197n2;
        EnumC3197n enumC3197n3 = new EnumC3197n("AFTER", 2);
        AFTER = enumC3197n3;
        $VALUES = new EnumC3197n[]{enumC3197n, enumC3197n2, enumC3197n3};
    }

    private EnumC3197n() {
        throw null;
    }

    public static EnumC3197n valueOf(String str) {
        return (EnumC3197n) Enum.valueOf(EnumC3197n.class, str);
    }

    public static EnumC3197n[] values() {
        return (EnumC3197n[]) $VALUES.clone();
    }
}
