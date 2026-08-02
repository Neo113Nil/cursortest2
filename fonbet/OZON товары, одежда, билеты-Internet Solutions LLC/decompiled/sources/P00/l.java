package P00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l MAP;
    public static final l PARSE;

    static {
        l lVar = new l("PARSE", 0);
        PARSE = lVar;
        l lVar2 = new l("MAP", 1);
        MAP = lVar2;
        l[] lVarArr = {lVar, lVar2};
        $VALUES = lVarArr;
        $ENTRIES = Xc.b.a(lVarArr);
    }

    private l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
