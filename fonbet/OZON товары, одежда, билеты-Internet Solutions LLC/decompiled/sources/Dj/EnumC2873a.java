package Dj;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Dj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC2873a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC2873a[] $VALUES;
    public static final EnumC2873a ALERT;
    public static final EnumC2873a CRITICAL;

    @NotNull
    public static final C0145a Companion;
    public static final EnumC2873a DEBUG;
    public static final EnumC2873a ERROR;
    public static final EnumC2873a INFO;
    public static final EnumC2873a NOTICE;
    public static final EnumC2873a WARNING;

    @NotNull
    private final String fullLabel = name();
    private final int intLevel;

    @NotNull
    private final String shortLabel;

    /* renamed from: Dj.a$a, reason: collision with other inner class name */
    public static final class C0145a {
    }

    static {
        EnumC2873a enumC2873a = new EnumC2873a("ALERT", 0, 1, "A");
        ALERT = enumC2873a;
        EnumC2873a enumC2873a2 = new EnumC2873a("CRITICAL", 1, 2, "C");
        CRITICAL = enumC2873a2;
        EnumC2873a enumC2873a3 = new EnumC2873a("ERROR", 2, 3, "E");
        ERROR = enumC2873a3;
        EnumC2873a enumC2873a4 = new EnumC2873a("WARNING", 3, 4, "W");
        WARNING = enumC2873a4;
        EnumC2873a enumC2873a5 = new EnumC2873a("NOTICE", 4, 5, "N");
        NOTICE = enumC2873a5;
        EnumC2873a enumC2873a6 = new EnumC2873a("INFO", 5, 6, "I");
        INFO = enumC2873a6;
        EnumC2873a enumC2873a7 = new EnumC2873a("DEBUG", 6, 7, "D");
        DEBUG = enumC2873a7;
        EnumC2873a[] enumC2873aArr = {enumC2873a, enumC2873a2, enumC2873a3, enumC2873a4, enumC2873a5, enumC2873a6, enumC2873a7};
        $VALUES = enumC2873aArr;
        $ENTRIES = Xc.b.a(enumC2873aArr);
        Companion = new C0145a();
    }

    private EnumC2873a(String str, int i11, int i12, String str2) {
        this.intLevel = i12;
        this.shortLabel = str2;
    }

    public static EnumC2873a valueOf(String str) {
        return (EnumC2873a) Enum.valueOf(EnumC2873a.class, str);
    }

    public static EnumC2873a[] values() {
        return (EnumC2873a[]) $VALUES.clone();
    }

    public final int a() {
        return this.intLevel;
    }
}
