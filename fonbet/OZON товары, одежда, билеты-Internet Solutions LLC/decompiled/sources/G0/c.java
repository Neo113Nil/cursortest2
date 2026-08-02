package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ClearHistory;
    public static final c MergeIfPossible;
    public static final c NeverMerge;

    static {
        c cVar = new c("MergeIfPossible", 0);
        MergeIfPossible = cVar;
        c cVar2 = new c("ClearHistory", 1);
        ClearHistory = cVar2;
        c cVar3 = new c("NeverMerge", 2);
        NeverMerge = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
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
