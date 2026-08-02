package Ud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class E {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ E[] $VALUES;
    public static final E ALL;
    public static final E NONE;
    public static final E ONLY_NON_SYNTHESIZED;

    static {
        E e11 = new E("ALL", 0);
        ALL = e11;
        E e12 = new E("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = e12;
        E e13 = new E("NONE", 2);
        NONE = e13;
        E[] eArr = {e11, e12, e13};
        $VALUES = eArr;
        $ENTRIES = Xc.b.a(eArr);
    }

    private E() {
        throw null;
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) $VALUES.clone();
    }
}
