package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0672q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0672q f9236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0672q f9237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0672q[] f9238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0672q[] f9239e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9240a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0672q EF0;

    static {
        EnumC0680z enumC0680z = EnumC0680z.DOUBLE;
        EnumC0672q enumC0672q = new EnumC0672q("DOUBLE", 0, 0, 1, enumC0680z);
        EnumC0680z enumC0680z2 = EnumC0680z.FLOAT;
        EnumC0672q enumC0672q2 = new EnumC0672q("FLOAT", 1, 1, 1, enumC0680z2);
        EnumC0680z enumC0680z3 = EnumC0680z.LONG;
        EnumC0672q enumC0672q3 = new EnumC0672q("INT64", 2, 2, 1, enumC0680z3);
        EnumC0672q enumC0672q4 = new EnumC0672q("UINT64", 3, 3, 1, enumC0680z3);
        EnumC0680z enumC0680z4 = EnumC0680z.INT;
        EnumC0672q enumC0672q5 = new EnumC0672q("INT32", 4, 4, 1, enumC0680z4);
        EnumC0672q enumC0672q6 = new EnumC0672q("FIXED64", 5, 5, 1, enumC0680z3);
        EnumC0672q enumC0672q7 = new EnumC0672q("FIXED32", 6, 6, 1, enumC0680z4);
        EnumC0680z enumC0680z5 = EnumC0680z.BOOLEAN;
        EnumC0672q enumC0672q8 = new EnumC0672q("BOOL", 7, 7, 1, enumC0680z5);
        EnumC0680z enumC0680z6 = EnumC0680z.STRING;
        EnumC0672q enumC0672q9 = new EnumC0672q("STRING", 8, 8, 1, enumC0680z6);
        EnumC0680z enumC0680z7 = EnumC0680z.MESSAGE;
        EnumC0672q enumC0672q10 = new EnumC0672q("MESSAGE", 9, 9, 1, enumC0680z7);
        EnumC0680z enumC0680z8 = EnumC0680z.BYTE_STRING;
        EnumC0672q enumC0672q11 = new EnumC0672q("BYTES", 10, 10, 1, enumC0680z8);
        EnumC0672q enumC0672q12 = new EnumC0672q("UINT32", 11, 11, 1, enumC0680z4);
        EnumC0680z enumC0680z9 = EnumC0680z.ENUM;
        EnumC0672q enumC0672q13 = new EnumC0672q("ENUM", 12, 12, 1, enumC0680z9);
        EnumC0672q enumC0672q14 = new EnumC0672q("SFIXED32", 13, 13, 1, enumC0680z4);
        EnumC0672q enumC0672q15 = new EnumC0672q("SFIXED64", 14, 14, 1, enumC0680z3);
        EnumC0672q enumC0672q16 = new EnumC0672q("SINT32", 15, 15, 1, enumC0680z4);
        EnumC0672q enumC0672q17 = new EnumC0672q("SINT64", 16, 16, 1, enumC0680z3);
        EnumC0672q enumC0672q18 = new EnumC0672q("GROUP", 17, 17, 1, enumC0680z7);
        EnumC0672q enumC0672q19 = new EnumC0672q("DOUBLE_LIST", 18, 18, 2, enumC0680z);
        EnumC0672q enumC0672q20 = new EnumC0672q("FLOAT_LIST", 19, 19, 2, enumC0680z2);
        EnumC0672q enumC0672q21 = new EnumC0672q("INT64_LIST", 20, 20, 2, enumC0680z3);
        EnumC0672q enumC0672q22 = new EnumC0672q("UINT64_LIST", 21, 21, 2, enumC0680z3);
        EnumC0672q enumC0672q23 = new EnumC0672q("INT32_LIST", 22, 22, 2, enumC0680z4);
        EnumC0672q enumC0672q24 = new EnumC0672q("FIXED64_LIST", 23, 23, 2, enumC0680z3);
        EnumC0672q enumC0672q25 = new EnumC0672q("FIXED32_LIST", 24, 24, 2, enumC0680z4);
        EnumC0672q enumC0672q26 = new EnumC0672q("BOOL_LIST", 25, 25, 2, enumC0680z5);
        EnumC0672q enumC0672q27 = new EnumC0672q("STRING_LIST", 26, 26, 2, enumC0680z6);
        EnumC0672q enumC0672q28 = new EnumC0672q("MESSAGE_LIST", 27, 27, 2, enumC0680z7);
        EnumC0672q enumC0672q29 = new EnumC0672q("BYTES_LIST", 28, 28, 2, enumC0680z8);
        EnumC0672q enumC0672q30 = new EnumC0672q("UINT32_LIST", 29, 29, 2, enumC0680z4);
        EnumC0672q enumC0672q31 = new EnumC0672q("ENUM_LIST", 30, 30, 2, enumC0680z9);
        EnumC0672q enumC0672q32 = new EnumC0672q("SFIXED32_LIST", 31, 31, 2, enumC0680z4);
        EnumC0672q enumC0672q33 = new EnumC0672q("SFIXED64_LIST", 32, 32, 2, enumC0680z3);
        EnumC0672q enumC0672q34 = new EnumC0672q("SINT32_LIST", 33, 33, 2, enumC0680z4);
        EnumC0672q enumC0672q35 = new EnumC0672q("SINT64_LIST", 34, 34, 2, enumC0680z3);
        EnumC0672q enumC0672q36 = new EnumC0672q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0680z);
        f9236b = enumC0672q36;
        EnumC0672q enumC0672q37 = new EnumC0672q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0680z2);
        EnumC0672q enumC0672q38 = new EnumC0672q("INT64_LIST_PACKED", 37, 37, 3, enumC0680z3);
        EnumC0672q enumC0672q39 = new EnumC0672q("UINT64_LIST_PACKED", 38, 38, 3, enumC0680z3);
        EnumC0672q enumC0672q40 = new EnumC0672q("INT32_LIST_PACKED", 39, 39, 3, enumC0680z4);
        EnumC0672q enumC0672q41 = new EnumC0672q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0680z3);
        EnumC0672q enumC0672q42 = new EnumC0672q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0680z4);
        EnumC0672q enumC0672q43 = new EnumC0672q("BOOL_LIST_PACKED", 42, 42, 3, enumC0680z5);
        EnumC0672q enumC0672q44 = new EnumC0672q("UINT32_LIST_PACKED", 43, 43, 3, enumC0680z4);
        EnumC0672q enumC0672q45 = new EnumC0672q("ENUM_LIST_PACKED", 44, 44, 3, enumC0680z9);
        EnumC0672q enumC0672q46 = new EnumC0672q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0680z4);
        EnumC0672q enumC0672q47 = new EnumC0672q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0680z3);
        EnumC0672q enumC0672q48 = new EnumC0672q("SINT32_LIST_PACKED", 47, 47, 3, enumC0680z4);
        EnumC0672q enumC0672q49 = new EnumC0672q("SINT64_LIST_PACKED", 48, 48, 3, enumC0680z3);
        f9237c = enumC0672q49;
        f9239e = new EnumC0672q[]{enumC0672q, enumC0672q2, enumC0672q3, enumC0672q4, enumC0672q5, enumC0672q6, enumC0672q7, enumC0672q8, enumC0672q9, enumC0672q10, enumC0672q11, enumC0672q12, enumC0672q13, enumC0672q14, enumC0672q15, enumC0672q16, enumC0672q17, enumC0672q18, enumC0672q19, enumC0672q20, enumC0672q21, enumC0672q22, enumC0672q23, enumC0672q24, enumC0672q25, enumC0672q26, enumC0672q27, enumC0672q28, enumC0672q29, enumC0672q30, enumC0672q31, enumC0672q32, enumC0672q33, enumC0672q34, enumC0672q35, enumC0672q36, enumC0672q37, enumC0672q38, enumC0672q39, enumC0672q40, enumC0672q41, enumC0672q42, enumC0672q43, enumC0672q44, enumC0672q45, enumC0672q46, enumC0672q47, enumC0672q48, enumC0672q49, new EnumC0672q("GROUP_LIST", 49, 49, 2, enumC0680z7), new EnumC0672q("MAP", 50, 50, 4, EnumC0680z.VOID)};
        EnumC0672q[] enumC0672qArrValues = values();
        f9238d = new EnumC0672q[enumC0672qArrValues.length];
        for (EnumC0672q enumC0672q50 : enumC0672qArrValues) {
            f9238d[enumC0672q50.f9240a] = enumC0672q50;
        }
    }

    public EnumC0672q(String str, int i7, int i8, int i9, EnumC0680z enumC0680z) {
        super(str, i7);
        this.f9240a = i8;
        int iE = p136t.e.e(i9);
        if (iE == 1 || iE == 3) {
            enumC0680z.getClass();
        }
        if (i9 == 1) {
            enumC0680z.ordinal();
        }
    }

    public static EnumC0672q valueOf(String str) {
        return (EnumC0672q) Enum.valueOf(EnumC0672q.class, str);
    }

    public static EnumC0672q[] values() {
        return (EnumC0672q[]) f9239e.clone();
    }

    public final int a() {
        return this.f9240a;
    }
}
