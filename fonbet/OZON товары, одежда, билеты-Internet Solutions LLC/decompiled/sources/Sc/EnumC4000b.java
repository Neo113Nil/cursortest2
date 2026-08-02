package Sc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Sc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4000b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC4000b[] $VALUES;
    public static final EnumC4000b ERROR;
    public static final EnumC4000b HIDDEN;
    public static final EnumC4000b WARNING;

    static {
        EnumC4000b enumC4000b = new EnumC4000b("WARNING", 0);
        WARNING = enumC4000b;
        EnumC4000b enumC4000b2 = new EnumC4000b("ERROR", 1);
        ERROR = enumC4000b2;
        EnumC4000b enumC4000b3 = new EnumC4000b("HIDDEN", 2);
        HIDDEN = enumC4000b3;
        EnumC4000b[] enumC4000bArr = {enumC4000b, enumC4000b2, enumC4000b3};
        $VALUES = enumC4000bArr;
        $ENTRIES = Xc.b.a(enumC4000bArr);
    }

    private EnumC4000b() {
        throw null;
    }

    public static EnumC4000b valueOf(String str) {
        return (EnumC4000b) Enum.valueOf(EnumC4000b.class, str);
    }

    public static EnumC4000b[] values() {
        return (EnumC4000b[]) $VALUES.clone();
    }
}
