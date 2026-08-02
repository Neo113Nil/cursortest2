package Pj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Pj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3824b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3824b[] $VALUES;
    public static final EnumC3824b CENTER;
    public static final EnumC3824b FIRST_BASELINE;
    public static final EnumC3824b LAST_BASELINE;
    public static final EnumC3824b LEADING;
    public static final EnumC3824b NONE;
    public static final EnumC3824b TRAILING;

    static {
        EnumC3824b enumC3824b = new EnumC3824b("NONE", 0);
        NONE = enumC3824b;
        EnumC3824b enumC3824b2 = new EnumC3824b("LEADING", 1);
        LEADING = enumC3824b2;
        EnumC3824b enumC3824b3 = new EnumC3824b("TRAILING", 2);
        TRAILING = enumC3824b3;
        EnumC3824b enumC3824b4 = new EnumC3824b("CENTER", 3);
        CENTER = enumC3824b4;
        EnumC3824b enumC3824b5 = new EnumC3824b("FIRST_BASELINE", 4);
        FIRST_BASELINE = enumC3824b5;
        EnumC3824b enumC3824b6 = new EnumC3824b("LAST_BASELINE", 5);
        LAST_BASELINE = enumC3824b6;
        EnumC3824b[] enumC3824bArr = {enumC3824b, enumC3824b2, enumC3824b3, enumC3824b4, enumC3824b5, enumC3824b6};
        $VALUES = enumC3824bArr;
        $ENTRIES = Xc.b.a(enumC3824bArr);
    }

    private EnumC3824b() {
        throw null;
    }

    public static EnumC3824b valueOf(String str) {
        return (EnumC3824b) Enum.valueOf(EnumC3824b.class, str);
    }

    public static EnumC3824b[] values() {
        return (EnumC3824b[]) $VALUES.clone();
    }
}
