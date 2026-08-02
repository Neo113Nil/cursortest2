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
public final class a00 {

    /* JADX INFO: renamed from: k */
    public static final a00 f1k;

    /* JADX INFO: renamed from: l */
    public static final a00 f2l;

    /* JADX INFO: renamed from: m */
    public static final a00[] f3m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ a00[] f4n;

    /* JADX INFO: renamed from: j */
    public final int f5j;

    /* JADX INFO: Fake field, exist only in values array */
    a00 EF0;

    static {
        xf0 xf0Var = xf0.f8951n;
        a00 a00Var = new a00("DOUBLE", 0, 0, 1, xf0Var);
        xf0 xf0Var2 = xf0.f8950m;
        a00 a00Var2 = new a00("FLOAT", 1, 1, 1, xf0Var2);
        xf0 xf0Var3 = xf0.f8949l;
        a00 a00Var3 = new a00("INT64", 2, 2, 1, xf0Var3);
        a00 a00Var4 = new a00("UINT64", 3, 3, 1, xf0Var3);
        xf0 xf0Var4 = xf0.f8948k;
        a00 a00Var5 = new a00("INT32", 4, 4, 1, xf0Var4);
        a00 a00Var6 = new a00("FIXED64", 5, 5, 1, xf0Var3);
        a00 a00Var7 = new a00("FIXED32", 6, 6, 1, xf0Var4);
        xf0 xf0Var5 = xf0.f8952o;
        a00 a00Var8 = new a00("BOOL", 7, 7, 1, xf0Var5);
        xf0 xf0Var6 = xf0.f8953p;
        a00 a00Var9 = new a00("STRING", 8, 8, 1, xf0Var6);
        xf0 xf0Var7 = xf0.f8956s;
        a00 a00Var10 = new a00("MESSAGE", 9, 9, 1, xf0Var7);
        xf0 xf0Var8 = xf0.f8954q;
        a00 a00Var11 = new a00("BYTES", 10, 10, 1, xf0Var8);
        a00 a00Var12 = new a00("UINT32", 11, 11, 1, xf0Var4);
        xf0 xf0Var9 = xf0.f8955r;
        a00 a00Var13 = new a00("ENUM", 12, 12, 1, xf0Var9);
        a00 a00Var14 = new a00("SFIXED32", 13, 13, 1, xf0Var4);
        a00 a00Var15 = new a00("SFIXED64", 14, 14, 1, xf0Var3);
        a00 a00Var16 = new a00("SINT32", 15, 15, 1, xf0Var4);
        a00 a00Var17 = new a00("SINT64", 16, 16, 1, xf0Var3);
        a00 a00Var18 = new a00("GROUP", 17, 17, 1, xf0Var7);
        a00 a00Var19 = new a00("DOUBLE_LIST", 18, 18, 2, xf0Var);
        a00 a00Var20 = new a00("FLOAT_LIST", 19, 19, 2, xf0Var2);
        a00 a00Var21 = new a00("INT64_LIST", 20, 20, 2, xf0Var3);
        a00 a00Var22 = new a00("UINT64_LIST", 21, 21, 2, xf0Var3);
        a00 a00Var23 = new a00("INT32_LIST", 22, 22, 2, xf0Var4);
        a00 a00Var24 = new a00("FIXED64_LIST", 23, 23, 2, xf0Var3);
        a00 a00Var25 = new a00("FIXED32_LIST", 24, 24, 2, xf0Var4);
        a00 a00Var26 = new a00("BOOL_LIST", 25, 25, 2, xf0Var5);
        a00 a00Var27 = new a00("STRING_LIST", 26, 26, 2, xf0Var6);
        a00 a00Var28 = new a00("MESSAGE_LIST", 27, 27, 2, xf0Var7);
        a00 a00Var29 = new a00("BYTES_LIST", 28, 28, 2, xf0Var8);
        a00 a00Var30 = new a00("UINT32_LIST", 29, 29, 2, xf0Var4);
        a00 a00Var31 = new a00("ENUM_LIST", 30, 30, 2, xf0Var9);
        a00 a00Var32 = new a00("SFIXED32_LIST", 31, 31, 2, xf0Var4);
        a00 a00Var33 = new a00("SFIXED64_LIST", 32, 32, 2, xf0Var3);
        a00 a00Var34 = new a00("SINT32_LIST", 33, 33, 2, xf0Var4);
        a00 a00Var35 = new a00("SINT64_LIST", 34, 34, 2, xf0Var3);
        a00 a00Var36 = new a00("DOUBLE_LIST_PACKED", 35, 35, 3, xf0Var);
        f1k = a00Var36;
        a00 a00Var37 = new a00("FLOAT_LIST_PACKED", 36, 36, 3, xf0Var2);
        a00 a00Var38 = new a00("INT64_LIST_PACKED", 37, 37, 3, xf0Var3);
        a00 a00Var39 = new a00("UINT64_LIST_PACKED", 38, 38, 3, xf0Var3);
        a00 a00Var40 = new a00("INT32_LIST_PACKED", 39, 39, 3, xf0Var4);
        a00 a00Var41 = new a00("FIXED64_LIST_PACKED", 40, 40, 3, xf0Var3);
        a00 a00Var42 = new a00("FIXED32_LIST_PACKED", 41, 41, 3, xf0Var4);
        a00 a00Var43 = new a00("BOOL_LIST_PACKED", 42, 42, 3, xf0Var5);
        a00 a00Var44 = new a00("UINT32_LIST_PACKED", 43, 43, 3, xf0Var4);
        a00 a00Var45 = new a00("ENUM_LIST_PACKED", 44, 44, 3, xf0Var9);
        a00 a00Var46 = new a00("SFIXED32_LIST_PACKED", 45, 45, 3, xf0Var4);
        a00 a00Var47 = new a00("SFIXED64_LIST_PACKED", 46, 46, 3, xf0Var3);
        a00 a00Var48 = new a00("SINT32_LIST_PACKED", 47, 47, 3, xf0Var4);
        a00 a00Var49 = new a00("SINT64_LIST_PACKED", 48, 48, 3, xf0Var3);
        f2l = a00Var49;
        f4n = new a00[]{a00Var, a00Var2, a00Var3, a00Var4, a00Var5, a00Var6, a00Var7, a00Var8, a00Var9, a00Var10, a00Var11, a00Var12, a00Var13, a00Var14, a00Var15, a00Var16, a00Var17, a00Var18, a00Var19, a00Var20, a00Var21, a00Var22, a00Var23, a00Var24, a00Var25, a00Var26, a00Var27, a00Var28, a00Var29, a00Var30, a00Var31, a00Var32, a00Var33, a00Var34, a00Var35, a00Var36, a00Var37, a00Var38, a00Var39, a00Var40, a00Var41, a00Var42, a00Var43, a00Var44, a00Var45, a00Var46, a00Var47, a00Var48, a00Var49, new a00("GROUP_LIST", 49, 49, 2, xf0Var7), new a00("MAP", 50, 50, 4, xf0.f8947j)};
        a00[] a00VarArrValues = values();
        f3m = new a00[a00VarArrValues.length];
        for (a00 a00Var50 : a00VarArrValues) {
            f3m[a00Var50.f5j] = a00Var50;
        }
    }

    public a00(String str, int i, int i2, int i3, xf0 xf0Var) {
        super(str, i);
        this.f5j = i2;
        int iM292o = AbstractC0024an.m292o(i3);
        if (iM292o == 1 || iM292o == 3) {
            xf0Var.getClass();
        }
        if (i3 == 1) {
            xf0Var.ordinal();
        }
    }

    public static a00 valueOf(String str) {
        return (a00) Enum.valueOf(a00.class, str);
    }

    public static a00[] values() {
        return (a00[]) f4n.clone();
    }
}
