package Jd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ C[] $VALUES;
    public static final C BINARY;
    public static final C SOURCE;

    static {
        C c11 = new C("SOURCE", 0);
        SOURCE = c11;
        C c12 = new C("BINARY", 1);
        BINARY = c12;
        C[] cArr = {c11, c12};
        $VALUES = cArr;
        $ENTRIES = Xc.b.a(cArr);
    }

    private C() {
        throw null;
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
