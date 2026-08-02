package Oj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Oj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3709b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3709b[] $VALUES;
    public static final EnumC3709b PADDING_200;
    public static final EnumC3709b PADDING_250;
    public static final EnumC3709b PADDING_300;
    public static final EnumC3709b PADDING_350;
    public static final EnumC3709b PADDING_400;
    public static final EnumC3709b PADDING_500;
    public static final EnumC3709b PADDING_700;
    public static final EnumC3709b PADDING_800;
    public static final EnumC3709b PADDING_NONE;
    private final int padding;

    static {
        EnumC3709b enumC3709b = new EnumC3709b("PADDING_NONE", 0, 0);
        PADDING_NONE = enumC3709b;
        EnumC3709b enumC3709b2 = new EnumC3709b("PADDING_200", 1, 4);
        PADDING_200 = enumC3709b2;
        EnumC3709b enumC3709b3 = new EnumC3709b("PADDING_250", 2, 6);
        PADDING_250 = enumC3709b3;
        EnumC3709b enumC3709b4 = new EnumC3709b("PADDING_300", 3, 8);
        PADDING_300 = enumC3709b4;
        EnumC3709b enumC3709b5 = new EnumC3709b("PADDING_350", 4, 10);
        PADDING_350 = enumC3709b5;
        EnumC3709b enumC3709b6 = new EnumC3709b("PADDING_400", 5, 12);
        PADDING_400 = enumC3709b6;
        EnumC3709b enumC3709b7 = new EnumC3709b("PADDING_500", 6, 16);
        PADDING_500 = enumC3709b7;
        EnumC3709b enumC3709b8 = new EnumC3709b("PADDING_700", 7, 24);
        PADDING_700 = enumC3709b8;
        EnumC3709b enumC3709b9 = new EnumC3709b("PADDING_800", 8, 32);
        PADDING_800 = enumC3709b9;
        EnumC3709b[] enumC3709bArr = {enumC3709b, enumC3709b2, enumC3709b3, enumC3709b4, enumC3709b5, enumC3709b6, enumC3709b7, enumC3709b8, enumC3709b9};
        $VALUES = enumC3709bArr;
        $ENTRIES = Xc.b.a(enumC3709bArr);
    }

    private EnumC3709b(String str, int i11, int i12) {
        this.padding = i12;
    }

    public static EnumC3709b valueOf(String str) {
        return (EnumC3709b) Enum.valueOf(EnumC3709b.class, str);
    }

    public static EnumC3709b[] values() {
        return (EnumC3709b[]) $VALUES.clone();
    }
}
