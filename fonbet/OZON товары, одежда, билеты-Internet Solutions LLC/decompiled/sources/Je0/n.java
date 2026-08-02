package Je0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n FALLBACK;
    public static final n PRE_CACHED;
    public static final n REAL;

    static {
        n nVar = new n("FALLBACK", 0);
        FALLBACK = nVar;
        n nVar2 = new n("PRE_CACHED", 1);
        PRE_CACHED = nVar2;
        n nVar3 = new n("REAL", 2);
        REAL = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = Xc.b.a(nVarArr);
    }

    private n() {
        throw null;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
