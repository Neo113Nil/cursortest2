package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2529z0 {
    private static final /* synthetic */ EnumC2529z0[] $VALUES;
    public static final EnumC2529z0 Cursor;
    public static final EnumC2529z0 None;
    public static final EnumC2529z0 Selection;

    static {
        EnumC2529z0 enumC2529z0 = new EnumC2529z0("None", 0);
        None = enumC2529z0;
        EnumC2529z0 enumC2529z02 = new EnumC2529z0("Selection", 1);
        Selection = enumC2529z02;
        EnumC2529z0 enumC2529z03 = new EnumC2529z0("Cursor", 2);
        Cursor = enumC2529z03;
        $VALUES = new EnumC2529z0[]{enumC2529z0, enumC2529z02, enumC2529z03};
    }

    private EnumC2529z0() {
        throw null;
    }

    public static EnumC2529z0 valueOf(String str) {
        return (EnumC2529z0) Enum.valueOf(EnumC2529z0.class, str);
    }

    public static EnumC2529z0[] values() {
        return (EnumC2529z0[]) $VALUES.clone();
    }
}
