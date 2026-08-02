package Ci;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l LEGACY_ON_CLICK_CALLBACK;
    public static final l ON_RESULT_CALLBACK;
    public static final l RESULT_API_ONLY;

    static {
        l lVar = new l("LEGACY_ON_CLICK_CALLBACK", 0);
        LEGACY_ON_CLICK_CALLBACK = lVar;
        l lVar2 = new l("RESULT_API_ONLY", 1);
        RESULT_API_ONLY = lVar2;
        l lVar3 = new l("ON_RESULT_CALLBACK", 2);
        ON_RESULT_CALLBACK = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
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
