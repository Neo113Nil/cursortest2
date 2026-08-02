package J4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n ASC;
    public static final n DESC;

    static {
        n nVar = new n("ASC", 0);
        ASC = nVar;
        n nVar2 = new n("DESC", 1);
        DESC = nVar2;
        $VALUES = new n[]{nVar, nVar2};
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
