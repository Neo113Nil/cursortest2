package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
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
public final class wq1 {

    /* JADX INFO: renamed from: l */
    public static final wq1 f8639l;

    /* JADX INFO: renamed from: m */
    public static final wq1 f8640m;

    /* JADX INFO: renamed from: n */
    public static final wq1 f8641n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ wq1[] f8642o;

    /* JADX INFO: renamed from: j */
    public final xq1 f8643j;

    /* JADX INFO: renamed from: k */
    public final int f8644k;

    /* JADX INFO: Fake field, exist only in values array */
    wq1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    wq1 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    wq1 EF0;

    static {
        wq1 wq1Var = new wq1("DOUBLE", 0, xq1.f9034m, 1);
        wq1 wq1Var2 = new wq1("FLOAT", 1, xq1.f9033l, 5);
        xq1 xq1Var = xq1.f9032k;
        wq1 wq1Var3 = new wq1("INT64", 2, xq1Var, 0);
        wq1 wq1Var4 = new wq1("UINT64", 3, xq1Var, 0);
        xq1 xq1Var2 = xq1.f9031j;
        wq1 wq1Var5 = new wq1("INT32", 4, xq1Var2, 0);
        wq1 wq1Var6 = new wq1("FIXED64", 5, xq1Var, 1);
        wq1 wq1Var7 = new wq1("FIXED32", 6, xq1Var2, 5);
        wq1 wq1Var8 = new wq1("BOOL", 7, xq1.f9035n, 0);
        wq1 wq1Var9 = new wq1("STRING", 8, xq1.f9036o, 2);
        f8639l = wq1Var9;
        xq1 xq1Var3 = xq1.f9039r;
        wq1 wq1Var10 = new wq1("GROUP", 9, xq1Var3, 3);
        f8640m = wq1Var10;
        wq1 wq1Var11 = new wq1("MESSAGE", 10, xq1Var3, 2);
        f8641n = wq1Var11;
        f8642o = new wq1[]{wq1Var, wq1Var2, wq1Var3, wq1Var4, wq1Var5, wq1Var6, wq1Var7, wq1Var8, wq1Var9, wq1Var10, wq1Var11, new wq1("BYTES", 11, xq1.f9037p, 2), new wq1("UINT32", 12, xq1Var2, 0), new wq1("ENUM", 13, xq1.f9038q, 0), new wq1("SFIXED32", 14, xq1Var2, 5), new wq1("SFIXED64", 15, xq1Var, 1), new wq1("SINT32", 16, xq1Var2, 0), new wq1("SINT64", 17, xq1Var, 0)};
    }

    public wq1(String str, int i, xq1 xq1Var, int i2) {
        super(str, i);
        this.f8643j = xq1Var;
        this.f8644k = i2;
    }

    public static wq1[] values() {
        return (wq1[]) f8642o.clone();
    }
}
