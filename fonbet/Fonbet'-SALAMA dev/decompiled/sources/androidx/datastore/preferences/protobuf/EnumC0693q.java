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
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0693q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0693q f9236b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0693q f9237c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0693q[] f9238d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0693q[] f9239e;

    /* renamed from: a, reason: collision with root package name */
    public final int f9240a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0693q EF0;

    static {
        EnumC0701z enumC0701z = EnumC0701z.DOUBLE;
        EnumC0693q enumC0693q = new EnumC0693q("DOUBLE", 0, 0, 1, enumC0701z);
        EnumC0701z enumC0701z2 = EnumC0701z.FLOAT;
        EnumC0693q enumC0693q2 = new EnumC0693q("FLOAT", 1, 1, 1, enumC0701z2);
        EnumC0701z enumC0701z3 = EnumC0701z.LONG;
        EnumC0693q enumC0693q3 = new EnumC0693q("INT64", 2, 2, 1, enumC0701z3);
        EnumC0693q enumC0693q4 = new EnumC0693q("UINT64", 3, 3, 1, enumC0701z3);
        EnumC0701z enumC0701z4 = EnumC0701z.INT;
        EnumC0693q enumC0693q5 = new EnumC0693q("INT32", 4, 4, 1, enumC0701z4);
        EnumC0693q enumC0693q6 = new EnumC0693q("FIXED64", 5, 5, 1, enumC0701z3);
        EnumC0693q enumC0693q7 = new EnumC0693q("FIXED32", 6, 6, 1, enumC0701z4);
        EnumC0701z enumC0701z5 = EnumC0701z.BOOLEAN;
        EnumC0693q enumC0693q8 = new EnumC0693q("BOOL", 7, 7, 1, enumC0701z5);
        EnumC0701z enumC0701z6 = EnumC0701z.STRING;
        EnumC0693q enumC0693q9 = new EnumC0693q("STRING", 8, 8, 1, enumC0701z6);
        EnumC0701z enumC0701z7 = EnumC0701z.MESSAGE;
        EnumC0693q enumC0693q10 = new EnumC0693q("MESSAGE", 9, 9, 1, enumC0701z7);
        EnumC0701z enumC0701z8 = EnumC0701z.BYTE_STRING;
        EnumC0693q enumC0693q11 = new EnumC0693q("BYTES", 10, 10, 1, enumC0701z8);
        EnumC0693q enumC0693q12 = new EnumC0693q("UINT32", 11, 11, 1, enumC0701z4);
        EnumC0701z enumC0701z9 = EnumC0701z.ENUM;
        EnumC0693q enumC0693q13 = new EnumC0693q("ENUM", 12, 12, 1, enumC0701z9);
        EnumC0693q enumC0693q14 = new EnumC0693q("SFIXED32", 13, 13, 1, enumC0701z4);
        EnumC0693q enumC0693q15 = new EnumC0693q("SFIXED64", 14, 14, 1, enumC0701z3);
        EnumC0693q enumC0693q16 = new EnumC0693q("SINT32", 15, 15, 1, enumC0701z4);
        EnumC0693q enumC0693q17 = new EnumC0693q("SINT64", 16, 16, 1, enumC0701z3);
        EnumC0693q enumC0693q18 = new EnumC0693q("GROUP", 17, 17, 1, enumC0701z7);
        EnumC0693q enumC0693q19 = new EnumC0693q("DOUBLE_LIST", 18, 18, 2, enumC0701z);
        EnumC0693q enumC0693q20 = new EnumC0693q("FLOAT_LIST", 19, 19, 2, enumC0701z2);
        EnumC0693q enumC0693q21 = new EnumC0693q("INT64_LIST", 20, 20, 2, enumC0701z3);
        EnumC0693q enumC0693q22 = new EnumC0693q("UINT64_LIST", 21, 21, 2, enumC0701z3);
        EnumC0693q enumC0693q23 = new EnumC0693q("INT32_LIST", 22, 22, 2, enumC0701z4);
        EnumC0693q enumC0693q24 = new EnumC0693q("FIXED64_LIST", 23, 23, 2, enumC0701z3);
        EnumC0693q enumC0693q25 = new EnumC0693q("FIXED32_LIST", 24, 24, 2, enumC0701z4);
        EnumC0693q enumC0693q26 = new EnumC0693q("BOOL_LIST", 25, 25, 2, enumC0701z5);
        EnumC0693q enumC0693q27 = new EnumC0693q("STRING_LIST", 26, 26, 2, enumC0701z6);
        EnumC0693q enumC0693q28 = new EnumC0693q("MESSAGE_LIST", 27, 27, 2, enumC0701z7);
        EnumC0693q enumC0693q29 = new EnumC0693q("BYTES_LIST", 28, 28, 2, enumC0701z8);
        EnumC0693q enumC0693q30 = new EnumC0693q("UINT32_LIST", 29, 29, 2, enumC0701z4);
        EnumC0693q enumC0693q31 = new EnumC0693q("ENUM_LIST", 30, 30, 2, enumC0701z9);
        EnumC0693q enumC0693q32 = new EnumC0693q("SFIXED32_LIST", 31, 31, 2, enumC0701z4);
        EnumC0693q enumC0693q33 = new EnumC0693q("SFIXED64_LIST", 32, 32, 2, enumC0701z3);
        EnumC0693q enumC0693q34 = new EnumC0693q("SINT32_LIST", 33, 33, 2, enumC0701z4);
        EnumC0693q enumC0693q35 = new EnumC0693q("SINT64_LIST", 34, 34, 2, enumC0701z3);
        EnumC0693q enumC0693q36 = new EnumC0693q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0701z);
        f9236b = enumC0693q36;
        EnumC0693q enumC0693q37 = new EnumC0693q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0701z2);
        EnumC0693q enumC0693q38 = new EnumC0693q("INT64_LIST_PACKED", 37, 37, 3, enumC0701z3);
        EnumC0693q enumC0693q39 = new EnumC0693q("UINT64_LIST_PACKED", 38, 38, 3, enumC0701z3);
        EnumC0693q enumC0693q40 = new EnumC0693q("INT32_LIST_PACKED", 39, 39, 3, enumC0701z4);
        EnumC0693q enumC0693q41 = new EnumC0693q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0701z3);
        EnumC0693q enumC0693q42 = new EnumC0693q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0701z4);
        EnumC0693q enumC0693q43 = new EnumC0693q("BOOL_LIST_PACKED", 42, 42, 3, enumC0701z5);
        EnumC0693q enumC0693q44 = new EnumC0693q("UINT32_LIST_PACKED", 43, 43, 3, enumC0701z4);
        EnumC0693q enumC0693q45 = new EnumC0693q("ENUM_LIST_PACKED", 44, 44, 3, enumC0701z9);
        EnumC0693q enumC0693q46 = new EnumC0693q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0701z4);
        EnumC0693q enumC0693q47 = new EnumC0693q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0701z3);
        EnumC0693q enumC0693q48 = new EnumC0693q("SINT32_LIST_PACKED", 47, 47, 3, enumC0701z4);
        EnumC0693q enumC0693q49 = new EnumC0693q("SINT64_LIST_PACKED", 48, 48, 3, enumC0701z3);
        f9237c = enumC0693q49;
        f9239e = new EnumC0693q[]{enumC0693q, enumC0693q2, enumC0693q3, enumC0693q4, enumC0693q5, enumC0693q6, enumC0693q7, enumC0693q8, enumC0693q9, enumC0693q10, enumC0693q11, enumC0693q12, enumC0693q13, enumC0693q14, enumC0693q15, enumC0693q16, enumC0693q17, enumC0693q18, enumC0693q19, enumC0693q20, enumC0693q21, enumC0693q22, enumC0693q23, enumC0693q24, enumC0693q25, enumC0693q26, enumC0693q27, enumC0693q28, enumC0693q29, enumC0693q30, enumC0693q31, enumC0693q32, enumC0693q33, enumC0693q34, enumC0693q35, enumC0693q36, enumC0693q37, enumC0693q38, enumC0693q39, enumC0693q40, enumC0693q41, enumC0693q42, enumC0693q43, enumC0693q44, enumC0693q45, enumC0693q46, enumC0693q47, enumC0693q48, enumC0693q49, new EnumC0693q("GROUP_LIST", 49, 49, 2, enumC0701z7), new EnumC0693q("MAP", 50, 50, 4, EnumC0701z.VOID)};
        EnumC0693q[] values = values();
        f9238d = new EnumC0693q[values.length];
        for (EnumC0693q enumC0693q50 : values) {
            f9238d[enumC0693q50.f9240a] = enumC0693q50;
        }
    }

    public EnumC0693q(String str, int i7, int i8, int i9, EnumC0701z enumC0701z) {
        this.f9240a = i8;
        int e7 = t.e.e(i9);
        if (e7 == 1) {
            enumC0701z.getClass();
        } else if (e7 == 3) {
            enumC0701z.getClass();
        }
        if (i9 == 1) {
            enumC0701z.ordinal();
        }
    }

    public static EnumC0693q valueOf(String str) {
        return (EnumC0693q) Enum.valueOf(EnumC0693q.class, str);
    }

    public static EnumC0693q[] values() {
        return (EnumC0693q[]) f9239e.clone();
    }

    public final int a() {
        return this.f9240a;
    }
}
