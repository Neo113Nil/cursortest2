package Ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ud.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4058a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC4058a[] $VALUES;
    public static final EnumC4058a ALWAYS_PARENTHESIZED;
    public static final EnumC4058a NO_ARGUMENTS;
    public static final EnumC4058a UNLESS_EMPTY;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    static {
        EnumC4058a enumC4058a = new EnumC4058a("NO_ARGUMENTS", 0, 3);
        NO_ARGUMENTS = enumC4058a;
        EnumC4058a enumC4058a2 = new EnumC4058a("UNLESS_EMPTY", 1, 2);
        UNLESS_EMPTY = enumC4058a2;
        EnumC4058a enumC4058a3 = new EnumC4058a(true, true, "ALWAYS_PARENTHESIZED", 2);
        ALWAYS_PARENTHESIZED = enumC4058a3;
        EnumC4058a[] enumC4058aArr = {enumC4058a, enumC4058a2, enumC4058a3};
        $VALUES = enumC4058aArr;
        $ENTRIES = Xc.b.a(enumC4058aArr);
    }

    /* synthetic */ EnumC4058a(String str, int i11, int i12) {
        this((i12 & 1) == 0, false, str, i11);
    }

    public static EnumC4058a valueOf(String str) {
        return (EnumC4058a) Enum.valueOf(EnumC4058a.class, str);
    }

    public static EnumC4058a[] values() {
        return (EnumC4058a[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.includeAnnotationArguments;
    }

    public final boolean b() {
        return this.includeEmptyAnnotationArguments;
    }

    private EnumC4058a(boolean z11, boolean z12, String str, int i11) {
        this.includeAnnotationArguments = z11;
        this.includeEmptyAnnotationArguments = z12;
    }
}
