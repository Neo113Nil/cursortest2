package F5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class n {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n Immediately;
    public static final n OnIterationFinish;

    static {
        n nVar = new n("Immediately", 0);
        Immediately = nVar;
        n nVar2 = new n("OnIterationFinish", 1);
        OnIterationFinish = nVar2;
        n[] nVarArr = {nVar, nVar2};
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
