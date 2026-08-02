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
public final class b00 {

    /* JADX INFO: renamed from: k */
    public static final b00 f661k;

    /* JADX INFO: renamed from: l */
    public static final b00 f662l;

    /* JADX INFO: renamed from: m */
    public static final b00[] f663m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ b00[] f664n;

    /* JADX INFO: renamed from: j */
    public final int f665j;

    /* JADX INFO: Fake field, exist only in values array */
    b00 EF0;

    static {
        yf0 yf0Var = yf0.f9292n;
        b00 b00Var = new b00("DOUBLE", 0, 0, 1, yf0Var);
        yf0 yf0Var2 = yf0.f9291m;
        b00 b00Var2 = new b00("FLOAT", 1, 1, 1, yf0Var2);
        yf0 yf0Var3 = yf0.f9290l;
        b00 b00Var3 = new b00("INT64", 2, 2, 1, yf0Var3);
        b00 b00Var4 = new b00("UINT64", 3, 3, 1, yf0Var3);
        yf0 yf0Var4 = yf0.f9289k;
        b00 b00Var5 = new b00("INT32", 4, 4, 1, yf0Var4);
        b00 b00Var6 = new b00("FIXED64", 5, 5, 1, yf0Var3);
        b00 b00Var7 = new b00("FIXED32", 6, 6, 1, yf0Var4);
        yf0 yf0Var5 = yf0.f9293o;
        b00 b00Var8 = new b00("BOOL", 7, 7, 1, yf0Var5);
        yf0 yf0Var6 = yf0.f9294p;
        b00 b00Var9 = new b00("STRING", 8, 8, 1, yf0Var6);
        yf0 yf0Var7 = yf0.f9297s;
        b00 b00Var10 = new b00("MESSAGE", 9, 9, 1, yf0Var7);
        yf0 yf0Var8 = yf0.f9295q;
        b00 b00Var11 = new b00("BYTES", 10, 10, 1, yf0Var8);
        b00 b00Var12 = new b00("UINT32", 11, 11, 1, yf0Var4);
        yf0 yf0Var9 = yf0.f9296r;
        b00 b00Var13 = new b00("ENUM", 12, 12, 1, yf0Var9);
        b00 b00Var14 = new b00("SFIXED32", 13, 13, 1, yf0Var4);
        b00 b00Var15 = new b00("SFIXED64", 14, 14, 1, yf0Var3);
        b00 b00Var16 = new b00("SINT32", 15, 15, 1, yf0Var4);
        b00 b00Var17 = new b00("SINT64", 16, 16, 1, yf0Var3);
        b00 b00Var18 = new b00("GROUP", 17, 17, 1, yf0Var7);
        b00 b00Var19 = new b00("DOUBLE_LIST", 18, 18, 2, yf0Var);
        b00 b00Var20 = new b00("FLOAT_LIST", 19, 19, 2, yf0Var2);
        b00 b00Var21 = new b00("INT64_LIST", 20, 20, 2, yf0Var3);
        b00 b00Var22 = new b00("UINT64_LIST", 21, 21, 2, yf0Var3);
        b00 b00Var23 = new b00("INT32_LIST", 22, 22, 2, yf0Var4);
        b00 b00Var24 = new b00("FIXED64_LIST", 23, 23, 2, yf0Var3);
        b00 b00Var25 = new b00("FIXED32_LIST", 24, 24, 2, yf0Var4);
        b00 b00Var26 = new b00("BOOL_LIST", 25, 25, 2, yf0Var5);
        b00 b00Var27 = new b00("STRING_LIST", 26, 26, 2, yf0Var6);
        b00 b00Var28 = new b00("MESSAGE_LIST", 27, 27, 2, yf0Var7);
        b00 b00Var29 = new b00("BYTES_LIST", 28, 28, 2, yf0Var8);
        b00 b00Var30 = new b00("UINT32_LIST", 29, 29, 2, yf0Var4);
        b00 b00Var31 = new b00("ENUM_LIST", 30, 30, 2, yf0Var9);
        b00 b00Var32 = new b00("SFIXED32_LIST", 31, 31, 2, yf0Var4);
        b00 b00Var33 = new b00("SFIXED64_LIST", 32, 32, 2, yf0Var3);
        b00 b00Var34 = new b00("SINT32_LIST", 33, 33, 2, yf0Var4);
        b00 b00Var35 = new b00("SINT64_LIST", 34, 34, 2, yf0Var3);
        b00 b00Var36 = new b00("DOUBLE_LIST_PACKED", 35, 35, 3, yf0Var);
        f661k = b00Var36;
        b00 b00Var37 = new b00("FLOAT_LIST_PACKED", 36, 36, 3, yf0Var2);
        b00 b00Var38 = new b00("INT64_LIST_PACKED", 37, 37, 3, yf0Var3);
        b00 b00Var39 = new b00("UINT64_LIST_PACKED", 38, 38, 3, yf0Var3);
        b00 b00Var40 = new b00("INT32_LIST_PACKED", 39, 39, 3, yf0Var4);
        b00 b00Var41 = new b00("FIXED64_LIST_PACKED", 40, 40, 3, yf0Var3);
        b00 b00Var42 = new b00("FIXED32_LIST_PACKED", 41, 41, 3, yf0Var4);
        b00 b00Var43 = new b00("BOOL_LIST_PACKED", 42, 42, 3, yf0Var5);
        b00 b00Var44 = new b00("UINT32_LIST_PACKED", 43, 43, 3, yf0Var4);
        b00 b00Var45 = new b00("ENUM_LIST_PACKED", 44, 44, 3, yf0Var9);
        b00 b00Var46 = new b00("SFIXED32_LIST_PACKED", 45, 45, 3, yf0Var4);
        b00 b00Var47 = new b00("SFIXED64_LIST_PACKED", 46, 46, 3, yf0Var3);
        b00 b00Var48 = new b00("SINT32_LIST_PACKED", 47, 47, 3, yf0Var4);
        b00 b00Var49 = new b00("SINT64_LIST_PACKED", 48, 48, 3, yf0Var3);
        f662l = b00Var49;
        f664n = new b00[]{b00Var, b00Var2, b00Var3, b00Var4, b00Var5, b00Var6, b00Var7, b00Var8, b00Var9, b00Var10, b00Var11, b00Var12, b00Var13, b00Var14, b00Var15, b00Var16, b00Var17, b00Var18, b00Var19, b00Var20, b00Var21, b00Var22, b00Var23, b00Var24, b00Var25, b00Var26, b00Var27, b00Var28, b00Var29, b00Var30, b00Var31, b00Var32, b00Var33, b00Var34, b00Var35, b00Var36, b00Var37, b00Var38, b00Var39, b00Var40, b00Var41, b00Var42, b00Var43, b00Var44, b00Var45, b00Var46, b00Var47, b00Var48, b00Var49, new b00("GROUP_LIST", 49, 49, 2, yf0Var7), new b00("MAP", 50, 50, 4, yf0.f9288j)};
        b00[] b00VarArrValues = values();
        f663m = new b00[b00VarArrValues.length];
        for (b00 b00Var50 : b00VarArrValues) {
            f663m[b00Var50.f665j] = b00Var50;
        }
    }

    public b00(String str, int i, int i2, int i3, yf0 yf0Var) {
        super(str, i);
        this.f665j = i2;
        int iM292o = AbstractC0024an.m292o(i3);
        if (iM292o == 1 || iM292o == 3) {
            yf0Var.getClass();
        }
        if (i3 == 1) {
            yf0Var.ordinal();
        }
    }

    public static b00 valueOf(String str) {
        return (b00) Enum.valueOf(b00.class, str);
    }

    public static b00[] values() {
        return (b00[]) f664n.clone();
    }
}
