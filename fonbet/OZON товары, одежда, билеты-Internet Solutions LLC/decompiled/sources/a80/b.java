package a80;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ONE_C;
    public static final b PDF;
    public static final b TXT;
    public static final b XLS;
    public static final b XML;
    public static final b ZIP;

    static {
        b bVar = new b("PDF", 0);
        PDF = bVar;
        b bVar2 = new b("XLS", 1);
        XLS = bVar2;
        b bVar3 = new b("ONE_C", 2);
        ONE_C = bVar3;
        b bVar4 = new b("TXT", 3);
        TXT = bVar4;
        b bVar5 = new b("XML", 4);
        XML = bVar5;
        b bVar6 = new b("ZIP", 5);
        ZIP = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
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
