package B5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2597a {
    private static final /* synthetic */ EnumC2597a[] $VALUES;
    public static final EnumC2597a AUTOMATIC;
    public static final EnumC2597a DISABLED;
    public static final EnumC2597a ENABLED;

    static {
        EnumC2597a enumC2597a = new EnumC2597a("AUTOMATIC", 0);
        AUTOMATIC = enumC2597a;
        EnumC2597a enumC2597a2 = new EnumC2597a("ENABLED", 1);
        ENABLED = enumC2597a2;
        EnumC2597a enumC2597a3 = new EnumC2597a("DISABLED", 2);
        DISABLED = enumC2597a3;
        $VALUES = new EnumC2597a[]{enumC2597a, enumC2597a2, enumC2597a3};
    }

    private EnumC2597a() {
        throw null;
    }

    public static EnumC2597a valueOf(String str) {
        return (EnumC2597a) Enum.valueOf(EnumC2597a.class, str);
    }

    public static EnumC2597a[] values() {
        return (EnumC2597a[]) $VALUES.clone();
    }
}
