package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class EnumC3199o {
    private static final /* synthetic */ EnumC3199o[] $VALUES;
    public static final EnumC3199o Cancel;
    public static final EnumC3199o Drag;
    public static final EnumC3199o Timeout;
    public static final EnumC3199o Up;

    static {
        EnumC3199o enumC3199o = new EnumC3199o("Up", 0);
        Up = enumC3199o;
        EnumC3199o enumC3199o2 = new EnumC3199o("Drag", 1);
        Drag = enumC3199o2;
        EnumC3199o enumC3199o3 = new EnumC3199o("Timeout", 2);
        Timeout = enumC3199o3;
        EnumC3199o enumC3199o4 = new EnumC3199o("Cancel", 3);
        Cancel = enumC3199o4;
        $VALUES = new EnumC3199o[]{enumC3199o, enumC3199o2, enumC3199o3, enumC3199o4};
    }

    private EnumC3199o() {
        throw null;
    }

    public static EnumC3199o valueOf(String str) {
        return (EnumC3199o) Enum.valueOf(EnumC3199o.class, str);
    }

    public static EnumC3199o[] values() {
        return (EnumC3199o[]) $VALUES.clone();
    }
}
