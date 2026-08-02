package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I0.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3192k0 {
    private static final /* synthetic */ EnumC3192k0[] $VALUES;
    public static final EnumC3192k0 Left;
    public static final EnumC3192k0 Middle;
    public static final EnumC3192k0 Right;

    static {
        EnumC3192k0 enumC3192k0 = new EnumC3192k0("Left", 0);
        Left = enumC3192k0;
        EnumC3192k0 enumC3192k02 = new EnumC3192k0("Middle", 1);
        Middle = enumC3192k02;
        EnumC3192k0 enumC3192k03 = new EnumC3192k0("Right", 2);
        Right = enumC3192k03;
        $VALUES = new EnumC3192k0[]{enumC3192k0, enumC3192k02, enumC3192k03};
    }

    private EnumC3192k0() {
        throw null;
    }

    public static EnumC3192k0 valueOf(String str) {
        return (EnumC3192k0) Enum.valueOf(EnumC3192k0.class, str);
    }

    public static EnumC3192k0[] values() {
        return (EnumC3192k0[]) $VALUES.clone();
    }
}
