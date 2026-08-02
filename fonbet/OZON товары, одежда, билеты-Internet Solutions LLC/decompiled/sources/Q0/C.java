package Q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class C {
    private static final /* synthetic */ C[] $VALUES;
    public static final C Filled;
    public static final C Outlined;

    static {
        C c11 = new C("Filled", 0);
        Filled = c11;
        C c12 = new C("Outlined", 1);
        Outlined = c12;
        $VALUES = new C[]{c11, c12};
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
