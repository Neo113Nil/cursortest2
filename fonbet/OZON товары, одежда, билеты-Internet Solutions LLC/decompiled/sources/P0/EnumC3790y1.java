package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P0.y1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3790y1 {
    private static final /* synthetic */ EnumC3790y1[] $VALUES;
    public static final EnumC3790y1 Expanded;
    public static final EnumC3790y1 Hidden;
    public static final EnumC3790y1 PartiallyExpanded;

    static {
        EnumC3790y1 enumC3790y1 = new EnumC3790y1("Hidden", 0);
        Hidden = enumC3790y1;
        EnumC3790y1 enumC3790y12 = new EnumC3790y1("Expanded", 1);
        Expanded = enumC3790y12;
        EnumC3790y1 enumC3790y13 = new EnumC3790y1("PartiallyExpanded", 2);
        PartiallyExpanded = enumC3790y13;
        $VALUES = new EnumC3790y1[]{enumC3790y1, enumC3790y12, enumC3790y13};
    }

    private EnumC3790y1() {
        throw null;
    }

    public static EnumC3790y1 valueOf(String str) {
        return (EnumC3790y1) Enum.valueOf(EnumC3790y1.class, str);
    }

    public static EnumC3790y1[] values() {
        return (EnumC3790y1[]) $VALUES.clone();
    }
}
