package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B0.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC2526y0 {
    private static final /* synthetic */ EnumC2526y0[] $VALUES;
    public static final EnumC2526y0 Cursor;
    public static final EnumC2526y0 SelectionEnd;
    public static final EnumC2526y0 SelectionStart;

    static {
        EnumC2526y0 enumC2526y0 = new EnumC2526y0("Cursor", 0);
        Cursor = enumC2526y0;
        EnumC2526y0 enumC2526y02 = new EnumC2526y0("SelectionStart", 1);
        SelectionStart = enumC2526y02;
        EnumC2526y0 enumC2526y03 = new EnumC2526y0("SelectionEnd", 2);
        SelectionEnd = enumC2526y03;
        $VALUES = new EnumC2526y0[]{enumC2526y0, enumC2526y02, enumC2526y03};
    }

    private EnumC2526y0() {
        throw null;
    }

    public static EnumC2526y0 valueOf(String str) {
        return (EnumC2526y0) Enum.valueOf(EnumC2526y0.class, str);
    }

    public static EnumC2526y0[] values() {
        return (EnumC2526y0[]) $VALUES.clone();
    }
}
