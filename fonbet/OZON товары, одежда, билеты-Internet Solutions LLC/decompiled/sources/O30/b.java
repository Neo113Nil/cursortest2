package O30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b APVZ;
    public static final b FINANCE;
    public static final b PAY;
    public static final b RKO;

    static {
        b bVar = new b("FINANCE", 0);
        FINANCE = bVar;
        b bVar2 = new b("RKO", 1);
        RKO = bVar2;
        b bVar3 = new b("PAY", 2);
        PAY = bVar3;
        b bVar4 = new b("APVZ", 3);
        APVZ = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
