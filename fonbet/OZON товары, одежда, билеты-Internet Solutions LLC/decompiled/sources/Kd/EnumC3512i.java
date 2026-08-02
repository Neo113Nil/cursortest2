package Kd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Kd.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3512i {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3512i[] $VALUES;
    public static final EnumC3512i MUTABLE;
    public static final EnumC3512i READ_ONLY;

    static {
        EnumC3512i enumC3512i = new EnumC3512i("READ_ONLY", 0);
        READ_ONLY = enumC3512i;
        EnumC3512i enumC3512i2 = new EnumC3512i("MUTABLE", 1);
        MUTABLE = enumC3512i2;
        EnumC3512i[] enumC3512iArr = {enumC3512i, enumC3512i2};
        $VALUES = enumC3512iArr;
        $ENTRIES = Xc.b.a(enumC3512iArr);
    }

    private EnumC3512i() {
        throw null;
    }

    public static EnumC3512i valueOf(String str) {
        return (EnumC3512i) Enum.valueOf(EnumC3512i.class, str);
    }

    public static EnumC3512i[] values() {
        return (EnumC3512i[]) $VALUES.clone();
    }
}
