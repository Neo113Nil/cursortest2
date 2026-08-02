package F4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F4.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3030j {
    private static final /* synthetic */ EnumC3030j[] $VALUES;
    public static final EnumC3030j ITEM_TO_PLACEHOLDER;
    public static final EnumC3030j PLACEHOLDER_POSITION_CHANGE;
    public static final EnumC3030j PLACEHOLDER_TO_ITEM;

    static {
        EnumC3030j enumC3030j = new EnumC3030j("ITEM_TO_PLACEHOLDER", 0);
        ITEM_TO_PLACEHOLDER = enumC3030j;
        EnumC3030j enumC3030j2 = new EnumC3030j("PLACEHOLDER_TO_ITEM", 1);
        PLACEHOLDER_TO_ITEM = enumC3030j2;
        EnumC3030j enumC3030j3 = new EnumC3030j("PLACEHOLDER_POSITION_CHANGE", 2);
        PLACEHOLDER_POSITION_CHANGE = enumC3030j3;
        $VALUES = new EnumC3030j[]{enumC3030j, enumC3030j2, enumC3030j3};
    }

    private EnumC3030j() {
        throw null;
    }

    public static EnumC3030j valueOf(String str) {
        return (EnumC3030j) Enum.valueOf(EnumC3030j.class, str);
    }

    public static EnumC3030j[] values() {
        return (EnumC3030j[]) $VALUES.clone();
    }
}
