package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: J0.h2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3299h2 {
    private static final /* synthetic */ EnumC3299h2[] $VALUES;
    public static final EnumC3299h2 Indefinite;
    public static final EnumC3299h2 Long;
    public static final EnumC3299h2 Short;

    static {
        EnumC3299h2 enumC3299h2 = new EnumC3299h2("Short", 0);
        Short = enumC3299h2;
        EnumC3299h2 enumC3299h22 = new EnumC3299h2("Long", 1);
        Long = enumC3299h22;
        EnumC3299h2 enumC3299h23 = new EnumC3299h2("Indefinite", 2);
        Indefinite = enumC3299h23;
        $VALUES = new EnumC3299h2[]{enumC3299h2, enumC3299h22, enumC3299h23};
    }

    private EnumC3299h2() {
        throw null;
    }

    public static EnumC3299h2 valueOf(String str) {
        return (EnumC3299h2) Enum.valueOf(EnumC3299h2.class, str);
    }

    public static EnumC3299h2[] values() {
        return (EnumC3299h2[]) $VALUES.clone();
    }
}
