package Wc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COROUTINE_SUSPENDED;
    public static final a RESUMED;
    public static final a UNDECIDED;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        UNDECIDED = aVar2;
        a aVar3 = new a("RESUMED", 2);
        RESUMED = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
