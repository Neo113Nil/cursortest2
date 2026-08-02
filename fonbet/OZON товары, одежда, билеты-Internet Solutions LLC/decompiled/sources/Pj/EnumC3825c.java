package Pj;

import Sc.InterfaceC3999a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
/* renamed from: Pj.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3825c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3825c[] $VALUES;
    public static final EnumC3825c HORIZONTAL;
    public static final EnumC3825c VERTICAL;

    static {
        EnumC3825c enumC3825c = new EnumC3825c("HORIZONTAL", 0);
        HORIZONTAL = enumC3825c;
        EnumC3825c enumC3825c2 = new EnumC3825c("VERTICAL", 1);
        VERTICAL = enumC3825c2;
        EnumC3825c[] enumC3825cArr = {enumC3825c, enumC3825c2};
        $VALUES = enumC3825cArr;
        $ENTRIES = Xc.b.a(enumC3825cArr);
    }

    private EnumC3825c() {
        throw null;
    }

    public static EnumC3825c valueOf(String str) {
        return (EnumC3825c) Enum.valueOf(EnumC3825c.class, str);
    }

    public static EnumC3825c[] values() {
        return (EnumC3825c[]) $VALUES.clone();
    }
}
