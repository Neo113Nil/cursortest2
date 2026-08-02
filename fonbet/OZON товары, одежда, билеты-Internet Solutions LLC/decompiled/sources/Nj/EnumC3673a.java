package Nj;

import Sc.InterfaceC3999a;
import Xc.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Nj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3673a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3673a[] $VALUES;
    public static final EnumC3673a DISABLED;
    public static final EnumC3673a ENABLED;
    public static final EnumC3673a PRESSED;
    public static final EnumC3673a SELECTED;

    static {
        EnumC3673a enumC3673a = new EnumC3673a("ENABLED", 0);
        ENABLED = enumC3673a;
        EnumC3673a enumC3673a2 = new EnumC3673a("DISABLED", 1);
        DISABLED = enumC3673a2;
        EnumC3673a enumC3673a3 = new EnumC3673a("PRESSED", 2);
        PRESSED = enumC3673a3;
        EnumC3673a enumC3673a4 = new EnumC3673a("SELECTED", 3);
        SELECTED = enumC3673a4;
        EnumC3673a[] enumC3673aArr = {enumC3673a, enumC3673a2, enumC3673a3, enumC3673a4};
        $VALUES = enumC3673aArr;
        $ENTRIES = b.a(enumC3673aArr);
    }

    private EnumC3673a() {
        throw null;
    }

    public static EnumC3673a valueOf(String str) {
        return (EnumC3673a) Enum.valueOf(EnumC3673a.class, str);
    }

    public static EnumC3673a[] values() {
        return (EnumC3673a[]) $VALUES.clone();
    }
}
