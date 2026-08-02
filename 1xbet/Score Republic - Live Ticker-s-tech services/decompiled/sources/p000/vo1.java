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
public final class vo1 {

    /* JADX INFO: renamed from: k */
    public static final vo1 f8232k;

    /* JADX INFO: renamed from: l */
    public static final vo1 f8233l;

    /* JADX INFO: renamed from: m */
    public static final vo1[] f8234m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ vo1[] f8235n;

    /* JADX INFO: renamed from: j */
    public final int f8236j;

    /* JADX INFO: Fake field, exist only in values array */
    vo1 EF0;

    static {
        np1 np1Var = np1.f5493n;
        vo1 vo1Var = new vo1("DOUBLE", 0, 0, 1, np1Var);
        np1 np1Var2 = np1.f5492m;
        vo1 vo1Var2 = new vo1("FLOAT", 1, 1, 1, np1Var2);
        np1 np1Var3 = np1.f5491l;
        vo1 vo1Var3 = new vo1("INT64", 2, 2, 1, np1Var3);
        vo1 vo1Var4 = new vo1("UINT64", 3, 3, 1, np1Var3);
        np1 np1Var4 = np1.f5490k;
        vo1 vo1Var5 = new vo1("INT32", 4, 4, 1, np1Var4);
        vo1 vo1Var6 = new vo1("FIXED64", 5, 5, 1, np1Var3);
        vo1 vo1Var7 = new vo1("FIXED32", 6, 6, 1, np1Var4);
        np1 np1Var5 = np1.f5494o;
        vo1 vo1Var8 = new vo1("BOOL", 7, 7, 1, np1Var5);
        np1 np1Var6 = np1.f5495p;
        vo1 vo1Var9 = new vo1("STRING", 8, 8, 1, np1Var6);
        np1 np1Var7 = np1.f5498s;
        vo1 vo1Var10 = new vo1("MESSAGE", 9, 9, 1, np1Var7);
        np1 np1Var8 = np1.f5496q;
        vo1 vo1Var11 = new vo1("BYTES", 10, 10, 1, np1Var8);
        vo1 vo1Var12 = new vo1("UINT32", 11, 11, 1, np1Var4);
        np1 np1Var9 = np1.f5497r;
        vo1 vo1Var13 = new vo1("ENUM", 12, 12, 1, np1Var9);
        vo1 vo1Var14 = new vo1("SFIXED32", 13, 13, 1, np1Var4);
        vo1 vo1Var15 = new vo1("SFIXED64", 14, 14, 1, np1Var3);
        vo1 vo1Var16 = new vo1("SINT32", 15, 15, 1, np1Var4);
        vo1 vo1Var17 = new vo1("SINT64", 16, 16, 1, np1Var3);
        vo1 vo1Var18 = new vo1("GROUP", 17, 17, 1, np1Var7);
        vo1 vo1Var19 = new vo1("DOUBLE_LIST", 18, 18, 2, np1Var);
        vo1 vo1Var20 = new vo1("FLOAT_LIST", 19, 19, 2, np1Var2);
        vo1 vo1Var21 = new vo1("INT64_LIST", 20, 20, 2, np1Var3);
        vo1 vo1Var22 = new vo1("UINT64_LIST", 21, 21, 2, np1Var3);
        vo1 vo1Var23 = new vo1("INT32_LIST", 22, 22, 2, np1Var4);
        vo1 vo1Var24 = new vo1("FIXED64_LIST", 23, 23, 2, np1Var3);
        vo1 vo1Var25 = new vo1("FIXED32_LIST", 24, 24, 2, np1Var4);
        vo1 vo1Var26 = new vo1("BOOL_LIST", 25, 25, 2, np1Var5);
        vo1 vo1Var27 = new vo1("STRING_LIST", 26, 26, 2, np1Var6);
        vo1 vo1Var28 = new vo1("MESSAGE_LIST", 27, 27, 2, np1Var7);
        vo1 vo1Var29 = new vo1("BYTES_LIST", 28, 28, 2, np1Var8);
        vo1 vo1Var30 = new vo1("UINT32_LIST", 29, 29, 2, np1Var4);
        vo1 vo1Var31 = new vo1("ENUM_LIST", 30, 30, 2, np1Var9);
        vo1 vo1Var32 = new vo1("SFIXED32_LIST", 31, 31, 2, np1Var4);
        vo1 vo1Var33 = new vo1("SFIXED64_LIST", 32, 32, 2, np1Var3);
        vo1 vo1Var34 = new vo1("SINT32_LIST", 33, 33, 2, np1Var4);
        vo1 vo1Var35 = new vo1("SINT64_LIST", 34, 34, 2, np1Var3);
        vo1 vo1Var36 = new vo1("DOUBLE_LIST_PACKED", 35, 35, 3, np1Var);
        f8232k = vo1Var36;
        vo1 vo1Var37 = new vo1("FLOAT_LIST_PACKED", 36, 36, 3, np1Var2);
        vo1 vo1Var38 = new vo1("INT64_LIST_PACKED", 37, 37, 3, np1Var3);
        vo1 vo1Var39 = new vo1("UINT64_LIST_PACKED", 38, 38, 3, np1Var3);
        vo1 vo1Var40 = new vo1("INT32_LIST_PACKED", 39, 39, 3, np1Var4);
        vo1 vo1Var41 = new vo1("FIXED64_LIST_PACKED", 40, 40, 3, np1Var3);
        vo1 vo1Var42 = new vo1("FIXED32_LIST_PACKED", 41, 41, 3, np1Var4);
        vo1 vo1Var43 = new vo1("BOOL_LIST_PACKED", 42, 42, 3, np1Var5);
        vo1 vo1Var44 = new vo1("UINT32_LIST_PACKED", 43, 43, 3, np1Var4);
        vo1 vo1Var45 = new vo1("ENUM_LIST_PACKED", 44, 44, 3, np1Var9);
        vo1 vo1Var46 = new vo1("SFIXED32_LIST_PACKED", 45, 45, 3, np1Var4);
        vo1 vo1Var47 = new vo1("SFIXED64_LIST_PACKED", 46, 46, 3, np1Var3);
        vo1 vo1Var48 = new vo1("SINT32_LIST_PACKED", 47, 47, 3, np1Var4);
        vo1 vo1Var49 = new vo1("SINT64_LIST_PACKED", 48, 48, 3, np1Var3);
        f8233l = vo1Var49;
        f8235n = new vo1[]{vo1Var, vo1Var2, vo1Var3, vo1Var4, vo1Var5, vo1Var6, vo1Var7, vo1Var8, vo1Var9, vo1Var10, vo1Var11, vo1Var12, vo1Var13, vo1Var14, vo1Var15, vo1Var16, vo1Var17, vo1Var18, vo1Var19, vo1Var20, vo1Var21, vo1Var22, vo1Var23, vo1Var24, vo1Var25, vo1Var26, vo1Var27, vo1Var28, vo1Var29, vo1Var30, vo1Var31, vo1Var32, vo1Var33, vo1Var34, vo1Var35, vo1Var36, vo1Var37, vo1Var38, vo1Var39, vo1Var40, vo1Var41, vo1Var42, vo1Var43, vo1Var44, vo1Var45, vo1Var46, vo1Var47, vo1Var48, vo1Var49, new vo1("GROUP_LIST", 49, 49, 2, np1Var7), new vo1("MAP", 50, 50, 4, np1.f5489j)};
        vo1[] vo1VarArrValues = values();
        f8234m = new vo1[vo1VarArrValues.length];
        for (vo1 vo1Var50 : vo1VarArrValues) {
            f8234m[vo1Var50.f8236j] = vo1Var50;
        }
    }

    public vo1(String str, int i, int i2, int i3, np1 np1Var) {
        super(str, i);
        this.f8236j = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            np1Var.getClass();
        }
        if (i3 == 1) {
            np1 np1Var2 = np1.f5489j;
            np1Var.ordinal();
        }
    }

    public static vo1[] values() {
        return (vo1[]) f8235n.clone();
    }
}
