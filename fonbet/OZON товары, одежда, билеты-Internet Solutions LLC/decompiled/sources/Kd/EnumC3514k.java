package Kd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Kd.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC3514k {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3514k[] $VALUES;
    public static final EnumC3514k FORCE_FLEXIBILITY;
    public static final EnumC3514k NOT_NULL;
    public static final EnumC3514k NULLABLE;

    static {
        EnumC3514k enumC3514k = new EnumC3514k("FORCE_FLEXIBILITY", 0);
        FORCE_FLEXIBILITY = enumC3514k;
        EnumC3514k enumC3514k2 = new EnumC3514k("NULLABLE", 1);
        NULLABLE = enumC3514k2;
        EnumC3514k enumC3514k3 = new EnumC3514k("NOT_NULL", 2);
        NOT_NULL = enumC3514k3;
        EnumC3514k[] enumC3514kArr = {enumC3514k, enumC3514k2, enumC3514k3};
        $VALUES = enumC3514kArr;
        $ENTRIES = Xc.b.a(enumC3514kArr);
    }

    private EnumC3514k() {
        throw null;
    }

    public static EnumC3514k valueOf(String str) {
        return (EnumC3514k) Enum.valueOf(EnumC3514k.class, str);
    }

    public static EnumC3514k[] values() {
        return (EnumC3514k[]) $VALUES.clone();
    }
}
