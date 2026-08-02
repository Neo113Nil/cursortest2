package Cd;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Cd.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2741b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC2741b[] $VALUES;
    public static final EnumC2741b FIELD;
    public static final EnumC2741b METHOD_RETURN_TYPE;
    public static final EnumC2741b TYPE_PARAMETER;
    public static final EnumC2741b TYPE_PARAMETER_BOUNDS;
    public static final EnumC2741b TYPE_USE;
    public static final EnumC2741b VALUE_PARAMETER;

    @NotNull
    private final String javaTarget;

    static {
        EnumC2741b enumC2741b = new EnumC2741b("METHOD_RETURN_TYPE", 0, "METHOD");
        METHOD_RETURN_TYPE = enumC2741b;
        EnumC2741b enumC2741b2 = new EnumC2741b("VALUE_PARAMETER", 1, "PARAMETER");
        VALUE_PARAMETER = enumC2741b2;
        EnumC2741b enumC2741b3 = new EnumC2741b("FIELD", 2, "FIELD");
        FIELD = enumC2741b3;
        EnumC2741b enumC2741b4 = new EnumC2741b("TYPE_USE", 3, "TYPE_USE");
        TYPE_USE = enumC2741b4;
        EnumC2741b enumC2741b5 = new EnumC2741b("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
        TYPE_PARAMETER_BOUNDS = enumC2741b5;
        EnumC2741b enumC2741b6 = new EnumC2741b("TYPE_PARAMETER", 5, "TYPE_PARAMETER");
        TYPE_PARAMETER = enumC2741b6;
        EnumC2741b[] enumC2741bArr = {enumC2741b, enumC2741b2, enumC2741b3, enumC2741b4, enumC2741b5, enumC2741b6};
        $VALUES = enumC2741bArr;
        $ENTRIES = Xc.b.a(enumC2741bArr);
    }

    private EnumC2741b(String str, int i11, String str2) {
        this.javaTarget = str2;
    }

    public static EnumC2741b valueOf(String str) {
        return (EnumC2741b) Enum.valueOf(EnumC2741b.class, str);
    }

    public static EnumC2741b[] values() {
        return (EnumC2741b[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.javaTarget;
    }
}
