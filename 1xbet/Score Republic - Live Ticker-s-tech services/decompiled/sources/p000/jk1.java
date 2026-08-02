package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class jk1 {

    /* JADX INFO: renamed from: l */
    public static final bk1 f3953l;

    /* JADX INFO: renamed from: m */
    public static final dk1 f3954m;

    /* JADX INFO: renamed from: n */
    public static final fk1 f3955n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ jk1[] f3956o;

    /* JADX INFO: renamed from: j */
    public final lk1 f3957j;

    /* JADX INFO: renamed from: k */
    public final int f3958k;

    /* JADX INFO: Fake field, exist only in values array */
    jk1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    jk1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    jk1 EF2;

    static {
        jk1 jk1Var = new jk1("DOUBLE", 0, lk1.f4822m, 1);
        jk1 jk1Var2 = new jk1("FLOAT", 1, lk1.f4821l, 5);
        lk1 lk1Var = lk1.f4820k;
        jk1 jk1Var3 = new jk1("INT64", 2, lk1Var, 0);
        jk1 jk1Var4 = new jk1("UINT64", 3, lk1Var, 0);
        lk1 lk1Var2 = lk1.f4819j;
        jk1 jk1Var5 = new jk1("INT32", 4, lk1Var2, 0);
        jk1 jk1Var6 = new jk1("FIXED64", 5, lk1Var, 1);
        jk1 jk1Var7 = new jk1("FIXED32", 6, lk1Var2, 5);
        jk1 jk1Var8 = new jk1("BOOL", 7, lk1.f4823n, 0);
        bk1 bk1Var = new bk1("STRING", 8, lk1.f4824o, 2);
        f3953l = bk1Var;
        lk1 lk1Var3 = lk1.f4827r;
        dk1 dk1Var = new dk1("GROUP", 9, lk1Var3, 3);
        f3954m = dk1Var;
        fk1 fk1Var = new fk1("MESSAGE", 10, lk1Var3, 2);
        f3955n = fk1Var;
        f3956o = new jk1[]{jk1Var, jk1Var2, jk1Var3, jk1Var4, jk1Var5, jk1Var6, jk1Var7, jk1Var8, bk1Var, dk1Var, fk1Var, new hk1("BYTES", 11, lk1.f4825p, 2), new jk1("UINT32", 12, lk1Var2, 0), new jk1("ENUM", 13, lk1.f4826q, 0), new jk1("SFIXED32", 14, lk1Var2, 5), new jk1("SFIXED64", 15, lk1Var, 1), new jk1("SINT32", 16, lk1Var2, 0), new jk1("SINT64", 17, lk1Var, 0)};
    }

    public jk1(String str, int i, lk1 lk1Var, int i2) {
        super(str, i);
        this.f3957j = lk1Var;
        this.f3958k = i2;
    }

    public static jk1 valueOf(String str) {
        return (jk1) Enum.valueOf(jk1.class, str);
    }

    public static jk1[] values() {
        return (jk1[]) f3956o.clone();
    }
}
