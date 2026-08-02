package C70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b C2B_RECEIPT;
    public static final b OPERATION;
    public static final b RECEIPT;

    static {
        b bVar = new b("OPERATION", 0);
        OPERATION = bVar;
        b bVar2 = new b("RECEIPT", 1);
        RECEIPT = bVar2;
        b bVar3 = new b("C2B_RECEIPT", 2);
        C2B_RECEIPT = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
