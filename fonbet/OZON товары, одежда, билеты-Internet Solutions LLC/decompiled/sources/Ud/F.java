package Ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ F[] $VALUES;
    public static final F DEBUG;
    public static final F NONE;
    public static final F PRETTY;

    static {
        F f7 = new F("PRETTY", 0);
        PRETTY = f7;
        F f11 = new F("DEBUG", 1);
        DEBUG = f11;
        F f12 = new F("NONE", 2);
        NONE = f12;
        F[] fArr = {f7, f11, f12};
        $VALUES = fArr;
        $ENTRIES = Xc.b.a(fArr);
    }

    private F() {
        throw null;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }
}
