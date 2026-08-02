package Pj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Pj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3823a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3823a[] $VALUES;
    public static final EnumC3823a END;
    public static final EnumC3823a START;

    static {
        EnumC3823a enumC3823a = new EnumC3823a("START", 0);
        START = enumC3823a;
        EnumC3823a enumC3823a2 = new EnumC3823a("END", 1);
        END = enumC3823a2;
        EnumC3823a[] enumC3823aArr = {enumC3823a, enumC3823a2};
        $VALUES = enumC3823aArr;
        $ENTRIES = Xc.b.a(enumC3823aArr);
    }

    private EnumC3823a() {
        throw null;
    }

    public static EnumC3823a valueOf(String str) {
        return (EnumC3823a) Enum.valueOf(EnumC3823a.class, str);
    }

    public static EnumC3823a[] values() {
        return (EnumC3823a[]) $VALUES.clone();
    }
}
