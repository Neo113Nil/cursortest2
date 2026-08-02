package J0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: J0.r1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3337r1 {
    private static final /* synthetic */ EnumC3337r1[] $VALUES;
    public static final EnumC3337r1 Expanded;
    public static final EnumC3337r1 HalfExpanded;
    public static final EnumC3337r1 Hidden;

    static {
        EnumC3337r1 enumC3337r1 = new EnumC3337r1("Hidden", 0);
        Hidden = enumC3337r1;
        EnumC3337r1 enumC3337r12 = new EnumC3337r1("Expanded", 1);
        Expanded = enumC3337r12;
        EnumC3337r1 enumC3337r13 = new EnumC3337r1("HalfExpanded", 2);
        HalfExpanded = enumC3337r13;
        $VALUES = new EnumC3337r1[]{enumC3337r1, enumC3337r12, enumC3337r13};
    }

    private EnumC3337r1() {
        throw null;
    }

    public static EnumC3337r1 valueOf(String str) {
        return (EnumC3337r1) Enum.valueOf(EnumC3337r1.class, str);
    }

    public static EnumC3337r1[] values() {
        return (EnumC3337r1[]) $VALUES.clone();
    }
}
