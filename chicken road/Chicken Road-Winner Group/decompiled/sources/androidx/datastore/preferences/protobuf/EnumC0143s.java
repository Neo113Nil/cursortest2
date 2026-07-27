package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0143s {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0143s f2282b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0143s f2283c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0143s[] f2284d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0143s[] f2285e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2286a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0143s EF0;

    static {
        B b3 = B.DOUBLE;
        EnumC0143s enumC0143s = new EnumC0143s("DOUBLE", 0, 0, 1, b3);
        B b4 = B.FLOAT;
        EnumC0143s enumC0143s2 = new EnumC0143s("FLOAT", 1, 1, 1, b4);
        B b5 = B.LONG;
        EnumC0143s enumC0143s3 = new EnumC0143s("INT64", 2, 2, 1, b5);
        EnumC0143s enumC0143s4 = new EnumC0143s("UINT64", 3, 3, 1, b5);
        B b6 = B.INT;
        EnumC0143s enumC0143s5 = new EnumC0143s("INT32", 4, 4, 1, b6);
        EnumC0143s enumC0143s6 = new EnumC0143s("FIXED64", 5, 5, 1, b5);
        EnumC0143s enumC0143s7 = new EnumC0143s("FIXED32", 6, 6, 1, b6);
        B b7 = B.BOOLEAN;
        EnumC0143s enumC0143s8 = new EnumC0143s("BOOL", 7, 7, 1, b7);
        B b8 = B.STRING;
        EnumC0143s enumC0143s9 = new EnumC0143s("STRING", 8, 8, 1, b8);
        B b9 = B.MESSAGE;
        EnumC0143s enumC0143s10 = new EnumC0143s("MESSAGE", 9, 9, 1, b9);
        B b10 = B.BYTE_STRING;
        EnumC0143s enumC0143s11 = new EnumC0143s("BYTES", 10, 10, 1, b10);
        EnumC0143s enumC0143s12 = new EnumC0143s("UINT32", 11, 11, 1, b6);
        B b11 = B.ENUM;
        EnumC0143s enumC0143s13 = new EnumC0143s("ENUM", 12, 12, 1, b11);
        EnumC0143s enumC0143s14 = new EnumC0143s("SFIXED32", 13, 13, 1, b6);
        EnumC0143s enumC0143s15 = new EnumC0143s("SFIXED64", 14, 14, 1, b5);
        EnumC0143s enumC0143s16 = new EnumC0143s("SINT32", 15, 15, 1, b6);
        EnumC0143s enumC0143s17 = new EnumC0143s("SINT64", 16, 16, 1, b5);
        EnumC0143s enumC0143s18 = new EnumC0143s("GROUP", 17, 17, 1, b9);
        EnumC0143s enumC0143s19 = new EnumC0143s("DOUBLE_LIST", 18, 18, 2, b3);
        EnumC0143s enumC0143s20 = new EnumC0143s("FLOAT_LIST", 19, 19, 2, b4);
        EnumC0143s enumC0143s21 = new EnumC0143s("INT64_LIST", 20, 20, 2, b5);
        EnumC0143s enumC0143s22 = new EnumC0143s("UINT64_LIST", 21, 21, 2, b5);
        EnumC0143s enumC0143s23 = new EnumC0143s("INT32_LIST", 22, 22, 2, b6);
        EnumC0143s enumC0143s24 = new EnumC0143s("FIXED64_LIST", 23, 23, 2, b5);
        EnumC0143s enumC0143s25 = new EnumC0143s("FIXED32_LIST", 24, 24, 2, b6);
        EnumC0143s enumC0143s26 = new EnumC0143s("BOOL_LIST", 25, 25, 2, b7);
        EnumC0143s enumC0143s27 = new EnumC0143s("STRING_LIST", 26, 26, 2, b8);
        EnumC0143s enumC0143s28 = new EnumC0143s("MESSAGE_LIST", 27, 27, 2, b9);
        EnumC0143s enumC0143s29 = new EnumC0143s("BYTES_LIST", 28, 28, 2, b10);
        EnumC0143s enumC0143s30 = new EnumC0143s("UINT32_LIST", 29, 29, 2, b6);
        EnumC0143s enumC0143s31 = new EnumC0143s("ENUM_LIST", 30, 30, 2, b11);
        EnumC0143s enumC0143s32 = new EnumC0143s("SFIXED32_LIST", 31, 31, 2, b6);
        EnumC0143s enumC0143s33 = new EnumC0143s("SFIXED64_LIST", 32, 32, 2, b5);
        EnumC0143s enumC0143s34 = new EnumC0143s("SINT32_LIST", 33, 33, 2, b6);
        EnumC0143s enumC0143s35 = new EnumC0143s("SINT64_LIST", 34, 34, 2, b5);
        EnumC0143s enumC0143s36 = new EnumC0143s("DOUBLE_LIST_PACKED", 35, 35, 3, b3);
        f2282b = enumC0143s36;
        EnumC0143s enumC0143s37 = new EnumC0143s("FLOAT_LIST_PACKED", 36, 36, 3, b4);
        EnumC0143s enumC0143s38 = new EnumC0143s("INT64_LIST_PACKED", 37, 37, 3, b5);
        EnumC0143s enumC0143s39 = new EnumC0143s("UINT64_LIST_PACKED", 38, 38, 3, b5);
        EnumC0143s enumC0143s40 = new EnumC0143s("INT32_LIST_PACKED", 39, 39, 3, b6);
        EnumC0143s enumC0143s41 = new EnumC0143s("FIXED64_LIST_PACKED", 40, 40, 3, b5);
        EnumC0143s enumC0143s42 = new EnumC0143s("FIXED32_LIST_PACKED", 41, 41, 3, b6);
        EnumC0143s enumC0143s43 = new EnumC0143s("BOOL_LIST_PACKED", 42, 42, 3, b7);
        EnumC0143s enumC0143s44 = new EnumC0143s("UINT32_LIST_PACKED", 43, 43, 3, b6);
        EnumC0143s enumC0143s45 = new EnumC0143s("ENUM_LIST_PACKED", 44, 44, 3, b11);
        EnumC0143s enumC0143s46 = new EnumC0143s("SFIXED32_LIST_PACKED", 45, 45, 3, b6);
        EnumC0143s enumC0143s47 = new EnumC0143s("SFIXED64_LIST_PACKED", 46, 46, 3, b5);
        EnumC0143s enumC0143s48 = new EnumC0143s("SINT32_LIST_PACKED", 47, 47, 3, b6);
        EnumC0143s enumC0143s49 = new EnumC0143s("SINT64_LIST_PACKED", 48, 48, 3, b5);
        f2283c = enumC0143s49;
        f2285e = new EnumC0143s[]{enumC0143s, enumC0143s2, enumC0143s3, enumC0143s4, enumC0143s5, enumC0143s6, enumC0143s7, enumC0143s8, enumC0143s9, enumC0143s10, enumC0143s11, enumC0143s12, enumC0143s13, enumC0143s14, enumC0143s15, enumC0143s16, enumC0143s17, enumC0143s18, enumC0143s19, enumC0143s20, enumC0143s21, enumC0143s22, enumC0143s23, enumC0143s24, enumC0143s25, enumC0143s26, enumC0143s27, enumC0143s28, enumC0143s29, enumC0143s30, enumC0143s31, enumC0143s32, enumC0143s33, enumC0143s34, enumC0143s35, enumC0143s36, enumC0143s37, enumC0143s38, enumC0143s39, enumC0143s40, enumC0143s41, enumC0143s42, enumC0143s43, enumC0143s44, enumC0143s45, enumC0143s46, enumC0143s47, enumC0143s48, enumC0143s49, new EnumC0143s("GROUP_LIST", 49, 49, 2, b9), new EnumC0143s("MAP", 50, 50, 4, B.VOID)};
        EnumC0143s[] values = values();
        f2284d = new EnumC0143s[values.length];
        for (EnumC0143s enumC0143s50 : values) {
            f2284d[enumC0143s50.f2286a] = enumC0143s50;
        }
    }

    public EnumC0143s(String str, int i3, int i4, int i5, B b3) {
        this.f2286a = i4;
        int b4 = M.j.b(i5);
        if (b4 == 1) {
            b3.getClass();
        } else if (b4 == 3) {
            b3.getClass();
        }
        if (i5 == 1) {
            b3.ordinal();
        }
    }

    public static EnumC0143s valueOf(String str) {
        return (EnumC0143s) Enum.valueOf(EnumC0143s.class, str);
    }

    public static EnumC0143s[] values() {
        return (EnumC0143s[]) f2285e.clone();
    }
}
