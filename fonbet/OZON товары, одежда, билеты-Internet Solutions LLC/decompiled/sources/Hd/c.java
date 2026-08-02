package Hd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FLEXIBLE_LOWER_BOUND;
    public static final c FLEXIBLE_UPPER_BOUND;
    public static final c INFLEXIBLE;

    static {
        c cVar = new c("INFLEXIBLE", 0);
        INFLEXIBLE = cVar;
        c cVar2 = new c("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = cVar2;
        c cVar3 = new c("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
