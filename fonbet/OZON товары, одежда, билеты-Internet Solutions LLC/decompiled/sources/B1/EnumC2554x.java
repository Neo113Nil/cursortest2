package B1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2554x {
    private static final /* synthetic */ EnumC2554x[] $VALUES;
    public static final EnumC2554x Max;
    public static final EnumC2554x Min;

    static {
        EnumC2554x enumC2554x = new EnumC2554x("Min", 0);
        Min = enumC2554x;
        EnumC2554x enumC2554x2 = new EnumC2554x("Max", 1);
        Max = enumC2554x2;
        $VALUES = new EnumC2554x[]{enumC2554x, enumC2554x2};
    }

    private EnumC2554x() {
        throw null;
    }

    public static EnumC2554x valueOf(String str) {
        return (EnumC2554x) Enum.valueOf(EnumC2554x.class, str);
    }

    public static EnumC2554x[] values() {
        return (EnumC2554x[]) $VALUES.clone();
    }
}
