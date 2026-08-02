package I0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC3195m {
    private static final /* synthetic */ EnumC3195m[] $VALUES;
    public static final EnumC3195m COLLAPSED;
    public static final EnumC3195m CROSSED;
    public static final EnumC3195m NOT_CROSSED;

    static {
        EnumC3195m enumC3195m = new EnumC3195m("CROSSED", 0);
        CROSSED = enumC3195m;
        EnumC3195m enumC3195m2 = new EnumC3195m("NOT_CROSSED", 1);
        NOT_CROSSED = enumC3195m2;
        EnumC3195m enumC3195m3 = new EnumC3195m("COLLAPSED", 2);
        COLLAPSED = enumC3195m3;
        $VALUES = new EnumC3195m[]{enumC3195m, enumC3195m2, enumC3195m3};
    }

    private EnumC3195m() {
        throw null;
    }

    public static EnumC3195m valueOf(String str) {
        return (EnumC3195m) Enum.valueOf(EnumC3195m.class, str);
    }

    public static EnumC3195m[] values() {
        return (EnumC3195m[]) $VALUES.clone();
    }
}
