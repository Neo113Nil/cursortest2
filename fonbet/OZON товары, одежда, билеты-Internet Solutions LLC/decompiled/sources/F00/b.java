package F00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AS_FETCHED;
    public static final b PER_PROCESS;

    static {
        b bVar = new b("PER_PROCESS", 0);
        PER_PROCESS = bVar;
        b bVar2 = new b("AS_FETCHED", 1);
        AS_FETCHED = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
    }

    private b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
