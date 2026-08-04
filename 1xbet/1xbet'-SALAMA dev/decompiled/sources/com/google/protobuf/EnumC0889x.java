package com.google.protobuf;

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
/* JADX INFO: renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC0889x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC0889x f12288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC0889x f12289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0889x[] f12290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0889x[] f12291e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12292a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0889x EF0;

    static {
        O o7 = O.DOUBLE;
        EnumC0889x enumC0889x = new EnumC0889x("DOUBLE", 0, 0, 1, o7);
        O o8 = O.FLOAT;
        EnumC0889x enumC0889x2 = new EnumC0889x("FLOAT", 1, 1, 1, o8);
        O o9 = O.LONG;
        EnumC0889x enumC0889x3 = new EnumC0889x("INT64", 2, 2, 1, o9);
        EnumC0889x enumC0889x4 = new EnumC0889x("UINT64", 3, 3, 1, o9);
        O o10 = O.INT;
        EnumC0889x enumC0889x5 = new EnumC0889x("INT32", 4, 4, 1, o10);
        EnumC0889x enumC0889x6 = new EnumC0889x("FIXED64", 5, 5, 1, o9);
        EnumC0889x enumC0889x7 = new EnumC0889x("FIXED32", 6, 6, 1, o10);
        O o11 = O.BOOLEAN;
        EnumC0889x enumC0889x8 = new EnumC0889x("BOOL", 7, 7, 1, o11);
        O o12 = O.STRING;
        EnumC0889x enumC0889x9 = new EnumC0889x("STRING", 8, 8, 1, o12);
        O o13 = O.MESSAGE;
        EnumC0889x enumC0889x10 = new EnumC0889x("MESSAGE", 9, 9, 1, o13);
        O o14 = O.BYTE_STRING;
        EnumC0889x enumC0889x11 = new EnumC0889x("BYTES", 10, 10, 1, o14);
        EnumC0889x enumC0889x12 = new EnumC0889x("UINT32", 11, 11, 1, o10);
        O o15 = O.ENUM;
        EnumC0889x enumC0889x13 = new EnumC0889x("ENUM", 12, 12, 1, o15);
        EnumC0889x enumC0889x14 = new EnumC0889x("SFIXED32", 13, 13, 1, o10);
        EnumC0889x enumC0889x15 = new EnumC0889x("SFIXED64", 14, 14, 1, o9);
        EnumC0889x enumC0889x16 = new EnumC0889x("SINT32", 15, 15, 1, o10);
        EnumC0889x enumC0889x17 = new EnumC0889x("SINT64", 16, 16, 1, o9);
        EnumC0889x enumC0889x18 = new EnumC0889x("GROUP", 17, 17, 1, o13);
        EnumC0889x enumC0889x19 = new EnumC0889x("DOUBLE_LIST", 18, 18, 2, o7);
        EnumC0889x enumC0889x20 = new EnumC0889x("FLOAT_LIST", 19, 19, 2, o8);
        EnumC0889x enumC0889x21 = new EnumC0889x("INT64_LIST", 20, 20, 2, o9);
        EnumC0889x enumC0889x22 = new EnumC0889x("UINT64_LIST", 21, 21, 2, o9);
        EnumC0889x enumC0889x23 = new EnumC0889x("INT32_LIST", 22, 22, 2, o10);
        EnumC0889x enumC0889x24 = new EnumC0889x("FIXED64_LIST", 23, 23, 2, o9);
        EnumC0889x enumC0889x25 = new EnumC0889x("FIXED32_LIST", 24, 24, 2, o10);
        EnumC0889x enumC0889x26 = new EnumC0889x("BOOL_LIST", 25, 25, 2, o11);
        EnumC0889x enumC0889x27 = new EnumC0889x("STRING_LIST", 26, 26, 2, o12);
        EnumC0889x enumC0889x28 = new EnumC0889x("MESSAGE_LIST", 27, 27, 2, o13);
        EnumC0889x enumC0889x29 = new EnumC0889x("BYTES_LIST", 28, 28, 2, o14);
        EnumC0889x enumC0889x30 = new EnumC0889x("UINT32_LIST", 29, 29, 2, o10);
        EnumC0889x enumC0889x31 = new EnumC0889x("ENUM_LIST", 30, 30, 2, o15);
        EnumC0889x enumC0889x32 = new EnumC0889x("SFIXED32_LIST", 31, 31, 2, o10);
        EnumC0889x enumC0889x33 = new EnumC0889x("SFIXED64_LIST", 32, 32, 2, o9);
        EnumC0889x enumC0889x34 = new EnumC0889x("SINT32_LIST", 33, 33, 2, o10);
        EnumC0889x enumC0889x35 = new EnumC0889x("SINT64_LIST", 34, 34, 2, o9);
        EnumC0889x enumC0889x36 = new EnumC0889x("DOUBLE_LIST_PACKED", 35, 35, 3, o7);
        f12288b = enumC0889x36;
        EnumC0889x enumC0889x37 = new EnumC0889x("FLOAT_LIST_PACKED", 36, 36, 3, o8);
        EnumC0889x enumC0889x38 = new EnumC0889x("INT64_LIST_PACKED", 37, 37, 3, o9);
        EnumC0889x enumC0889x39 = new EnumC0889x("UINT64_LIST_PACKED", 38, 38, 3, o9);
        EnumC0889x enumC0889x40 = new EnumC0889x("INT32_LIST_PACKED", 39, 39, 3, o10);
        EnumC0889x enumC0889x41 = new EnumC0889x("FIXED64_LIST_PACKED", 40, 40, 3, o9);
        EnumC0889x enumC0889x42 = new EnumC0889x("FIXED32_LIST_PACKED", 41, 41, 3, o10);
        EnumC0889x enumC0889x43 = new EnumC0889x("BOOL_LIST_PACKED", 42, 42, 3, o11);
        EnumC0889x enumC0889x44 = new EnumC0889x("UINT32_LIST_PACKED", 43, 43, 3, o10);
        EnumC0889x enumC0889x45 = new EnumC0889x("ENUM_LIST_PACKED", 44, 44, 3, o15);
        EnumC0889x enumC0889x46 = new EnumC0889x("SFIXED32_LIST_PACKED", 45, 45, 3, o10);
        EnumC0889x enumC0889x47 = new EnumC0889x("SFIXED64_LIST_PACKED", 46, 46, 3, o9);
        EnumC0889x enumC0889x48 = new EnumC0889x("SINT32_LIST_PACKED", 47, 47, 3, o10);
        EnumC0889x enumC0889x49 = new EnumC0889x("SINT64_LIST_PACKED", 48, 48, 3, o9);
        f12289c = enumC0889x49;
        f12291e = new EnumC0889x[]{enumC0889x, enumC0889x2, enumC0889x3, enumC0889x4, enumC0889x5, enumC0889x6, enumC0889x7, enumC0889x8, enumC0889x9, enumC0889x10, enumC0889x11, enumC0889x12, enumC0889x13, enumC0889x14, enumC0889x15, enumC0889x16, enumC0889x17, enumC0889x18, enumC0889x19, enumC0889x20, enumC0889x21, enumC0889x22, enumC0889x23, enumC0889x24, enumC0889x25, enumC0889x26, enumC0889x27, enumC0889x28, enumC0889x29, enumC0889x30, enumC0889x31, enumC0889x32, enumC0889x33, enumC0889x34, enumC0889x35, enumC0889x36, enumC0889x37, enumC0889x38, enumC0889x39, enumC0889x40, enumC0889x41, enumC0889x42, enumC0889x43, enumC0889x44, enumC0889x45, enumC0889x46, enumC0889x47, enumC0889x48, enumC0889x49, new EnumC0889x("GROUP_LIST", 49, 49, 2, o13), new EnumC0889x("MAP", 50, 50, 4, O.VOID)};
        EnumC0889x[] enumC0889xArrValues = values();
        f12290d = new EnumC0889x[enumC0889xArrValues.length];
        for (EnumC0889x enumC0889x50 : enumC0889xArrValues) {
            f12290d[enumC0889x50.f12292a] = enumC0889x50;
        }
    }

    public EnumC0889x(String str, int i7, int i8, int i9, O o7) {
        super(str, i7);
        this.f12292a = i8;
        int iE = p136t.e.e(i9);
        if (iE == 1 || iE == 3) {
            o7.getClass();
        }
        if (i9 == 1) {
            o7.ordinal();
        }
    }

    public static EnumC0889x valueOf(String str) {
        return (EnumC0889x) Enum.valueOf(EnumC0889x.class, str);
    }

    public static EnumC0889x[] values() {
        return (EnumC0889x[]) f12291e.clone();
    }

    public final int a() {
        return this.f12292a;
    }
}
