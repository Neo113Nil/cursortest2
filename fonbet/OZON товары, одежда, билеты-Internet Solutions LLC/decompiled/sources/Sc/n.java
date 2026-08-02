package Sc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n NONE;
    public static final n PUBLICATION;
    public static final n SYNCHRONIZED;

    static {
        n nVar = new n("SYNCHRONIZED", 0);
        SYNCHRONIZED = nVar;
        n nVar2 = new n("PUBLICATION", 1);
        PUBLICATION = nVar2;
        n nVar3 = new n("NONE", 2);
        NONE = nVar3;
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
