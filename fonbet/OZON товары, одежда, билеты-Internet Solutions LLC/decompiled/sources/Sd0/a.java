package Sd0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PROD_BUILDS_ALL_USERS;
    public static final a PROD_BUILDS_OZON_EMPLOYEE;
    public static final a PROD_BUILDS_OZON_QA;
    public static final a QA_BUILDS_OR_AUTOTEST;

    static {
        a aVar = new a("QA_BUILDS_OR_AUTOTEST", 0);
        QA_BUILDS_OR_AUTOTEST = aVar;
        a aVar2 = new a("PROD_BUILDS_OZON_QA", 1);
        PROD_BUILDS_OZON_QA = aVar2;
        a aVar3 = new a("PROD_BUILDS_OZON_EMPLOYEE", 2);
        PROD_BUILDS_OZON_EMPLOYEE = aVar3;
        a aVar4 = new a("PROD_BUILDS_ALL_USERS", 3);
        PROD_BUILDS_ALL_USERS = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
