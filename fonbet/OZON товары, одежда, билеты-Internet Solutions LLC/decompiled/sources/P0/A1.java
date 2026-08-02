package P0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class A1 {
    private static final /* synthetic */ A1[] $VALUES;
    public static final A1 Indefinite;
    public static final A1 Long;
    public static final A1 Short;

    static {
        A1 a12 = new A1("Short", 0);
        Short = a12;
        A1 a13 = new A1("Long", 1);
        Long = a13;
        A1 a14 = new A1("Indefinite", 2);
        Indefinite = a14;
        $VALUES = new A1[]{a12, a13, a14};
    }

    private A1() {
        throw null;
    }

    public static A1 valueOf(String str) {
        return (A1) Enum.valueOf(A1.class, str);
    }

    public static A1[] values() {
        return (A1[]) $VALUES.clone();
    }
}
