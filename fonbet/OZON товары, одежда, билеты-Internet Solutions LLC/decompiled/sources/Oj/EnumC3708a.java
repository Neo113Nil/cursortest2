package Oj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Oj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3708a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3708a[] $VALUES;
    public static final EnumC3708a MARGIN_350;
    public static final EnumC3708a MARGIN_400;
    public static final EnumC3708a MARGIN_500;
    public static final EnumC3708a MARGIN_NONE;
    private final int margin;

    static {
        EnumC3708a enumC3708a = new EnumC3708a("MARGIN_NONE", 0, 0);
        MARGIN_NONE = enumC3708a;
        EnumC3708a enumC3708a2 = new EnumC3708a("MARGIN_350", 1, 8);
        MARGIN_350 = enumC3708a2;
        EnumC3708a enumC3708a3 = new EnumC3708a("MARGIN_400", 2, 12);
        MARGIN_400 = enumC3708a3;
        EnumC3708a enumC3708a4 = new EnumC3708a("MARGIN_500", 3, 16);
        MARGIN_500 = enumC3708a4;
        EnumC3708a[] enumC3708aArr = {enumC3708a, enumC3708a2, enumC3708a3, enumC3708a4};
        $VALUES = enumC3708aArr;
        $ENTRIES = Xc.b.a(enumC3708aArr);
    }

    private EnumC3708a(String str, int i11, int i12) {
        this.margin = i12;
    }

    public static EnumC3708a valueOf(String str) {
        return (EnumC3708a) Enum.valueOf(EnumC3708a.class, str);
    }

    public static EnumC3708a[] values() {
        return (EnumC3708a[]) $VALUES.clone();
    }
}
