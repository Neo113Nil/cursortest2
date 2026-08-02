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
public class kk1 {

    /* JADX INFO: renamed from: l */
    public static final ck1 f4404l;

    /* JADX INFO: renamed from: m */
    public static final ek1 f4405m;

    /* JADX INFO: renamed from: n */
    public static final gk1 f4406n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ kk1[] f4407o;

    /* JADX INFO: renamed from: j */
    public final mk1 f4408j;

    /* JADX INFO: renamed from: k */
    public final int f4409k;

    /* JADX INFO: Fake field, exist only in values array */
    kk1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    kk1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    kk1 EF2;

    static {
        kk1 kk1Var = new kk1("DOUBLE", 0, mk1.f5064m, 1);
        kk1 kk1Var2 = new kk1("FLOAT", 1, mk1.f5063l, 5);
        mk1 mk1Var = mk1.f5062k;
        kk1 kk1Var3 = new kk1("INT64", 2, mk1Var, 0);
        kk1 kk1Var4 = new kk1("UINT64", 3, mk1Var, 0);
        mk1 mk1Var2 = mk1.f5061j;
        kk1 kk1Var5 = new kk1("INT32", 4, mk1Var2, 0);
        kk1 kk1Var6 = new kk1("FIXED64", 5, mk1Var, 1);
        kk1 kk1Var7 = new kk1("FIXED32", 6, mk1Var2, 5);
        kk1 kk1Var8 = new kk1("BOOL", 7, mk1.f5065n, 0);
        ck1 ck1Var = new ck1("STRING", 8, mk1.f5066o, 2);
        f4404l = ck1Var;
        mk1 mk1Var3 = mk1.f5069r;
        ek1 ek1Var = new ek1("GROUP", 9, mk1Var3, 3);
        f4405m = ek1Var;
        gk1 gk1Var = new gk1("MESSAGE", 10, mk1Var3, 2);
        f4406n = gk1Var;
        f4407o = new kk1[]{kk1Var, kk1Var2, kk1Var3, kk1Var4, kk1Var5, kk1Var6, kk1Var7, kk1Var8, ck1Var, ek1Var, gk1Var, new ik1("BYTES", 11, mk1.f5067p, 2), new kk1("UINT32", 12, mk1Var2, 0), new kk1("ENUM", 13, mk1.f5068q, 0), new kk1("SFIXED32", 14, mk1Var2, 5), new kk1("SFIXED64", 15, mk1Var, 1), new kk1("SINT32", 16, mk1Var2, 0), new kk1("SINT64", 17, mk1Var, 0)};
    }

    public kk1(String str, int i, mk1 mk1Var, int i2) {
        super(str, i);
        this.f4408j = mk1Var;
        this.f4409k = i2;
    }

    public static kk1 valueOf(String str) {
        return (kk1) Enum.valueOf(kk1.class, str);
    }

    public static kk1[] values() {
        return (kk1[]) f4407o.clone();
    }
}
