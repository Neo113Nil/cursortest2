package C70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AUTHORIZATION;
    public static final c C2B;
    public static final c DEPOSIT;
    public static final c INSTALLMENTREPAYMENT;
    public static final c PURCHASE;
    public static final c SBP;

    static {
        c cVar = new c("SBP", 0);
        SBP = cVar;
        c cVar2 = new c("DEPOSIT", 1);
        DEPOSIT = cVar2;
        c cVar3 = new c("PURCHASE", 2);
        PURCHASE = cVar3;
        c cVar4 = new c("AUTHORIZATION", 3);
        AUTHORIZATION = cVar4;
        c cVar5 = new c("INSTALLMENTREPAYMENT", 4);
        INSTALLMENTREPAYMENT = cVar5;
        c cVar6 = new c("C2B", 5);
        C2B = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
