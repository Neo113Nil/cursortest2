package com.google.protobuf;

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
/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0933x {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0933x f12288b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0933x f12289c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0933x[] f12290d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0933x[] f12291e;

    /* renamed from: a, reason: collision with root package name */
    public final int f12292a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0933x EF0;

    static {
        O o7 = O.DOUBLE;
        EnumC0933x enumC0933x = new EnumC0933x("DOUBLE", 0, 0, 1, o7);
        O o8 = O.FLOAT;
        EnumC0933x enumC0933x2 = new EnumC0933x("FLOAT", 1, 1, 1, o8);
        O o9 = O.LONG;
        EnumC0933x enumC0933x3 = new EnumC0933x("INT64", 2, 2, 1, o9);
        EnumC0933x enumC0933x4 = new EnumC0933x("UINT64", 3, 3, 1, o9);
        O o10 = O.INT;
        EnumC0933x enumC0933x5 = new EnumC0933x("INT32", 4, 4, 1, o10);
        EnumC0933x enumC0933x6 = new EnumC0933x("FIXED64", 5, 5, 1, o9);
        EnumC0933x enumC0933x7 = new EnumC0933x("FIXED32", 6, 6, 1, o10);
        O o11 = O.BOOLEAN;
        EnumC0933x enumC0933x8 = new EnumC0933x("BOOL", 7, 7, 1, o11);
        O o12 = O.STRING;
        EnumC0933x enumC0933x9 = new EnumC0933x("STRING", 8, 8, 1, o12);
        O o13 = O.MESSAGE;
        EnumC0933x enumC0933x10 = new EnumC0933x("MESSAGE", 9, 9, 1, o13);
        O o14 = O.BYTE_STRING;
        EnumC0933x enumC0933x11 = new EnumC0933x("BYTES", 10, 10, 1, o14);
        EnumC0933x enumC0933x12 = new EnumC0933x("UINT32", 11, 11, 1, o10);
        O o15 = O.ENUM;
        EnumC0933x enumC0933x13 = new EnumC0933x("ENUM", 12, 12, 1, o15);
        EnumC0933x enumC0933x14 = new EnumC0933x("SFIXED32", 13, 13, 1, o10);
        EnumC0933x enumC0933x15 = new EnumC0933x("SFIXED64", 14, 14, 1, o9);
        EnumC0933x enumC0933x16 = new EnumC0933x("SINT32", 15, 15, 1, o10);
        EnumC0933x enumC0933x17 = new EnumC0933x("SINT64", 16, 16, 1, o9);
        EnumC0933x enumC0933x18 = new EnumC0933x("GROUP", 17, 17, 1, o13);
        EnumC0933x enumC0933x19 = new EnumC0933x("DOUBLE_LIST", 18, 18, 2, o7);
        EnumC0933x enumC0933x20 = new EnumC0933x("FLOAT_LIST", 19, 19, 2, o8);
        EnumC0933x enumC0933x21 = new EnumC0933x("INT64_LIST", 20, 20, 2, o9);
        EnumC0933x enumC0933x22 = new EnumC0933x("UINT64_LIST", 21, 21, 2, o9);
        EnumC0933x enumC0933x23 = new EnumC0933x("INT32_LIST", 22, 22, 2, o10);
        EnumC0933x enumC0933x24 = new EnumC0933x("FIXED64_LIST", 23, 23, 2, o9);
        EnumC0933x enumC0933x25 = new EnumC0933x("FIXED32_LIST", 24, 24, 2, o10);
        EnumC0933x enumC0933x26 = new EnumC0933x("BOOL_LIST", 25, 25, 2, o11);
        EnumC0933x enumC0933x27 = new EnumC0933x("STRING_LIST", 26, 26, 2, o12);
        EnumC0933x enumC0933x28 = new EnumC0933x("MESSAGE_LIST", 27, 27, 2, o13);
        EnumC0933x enumC0933x29 = new EnumC0933x("BYTES_LIST", 28, 28, 2, o14);
        EnumC0933x enumC0933x30 = new EnumC0933x("UINT32_LIST", 29, 29, 2, o10);
        EnumC0933x enumC0933x31 = new EnumC0933x("ENUM_LIST", 30, 30, 2, o15);
        EnumC0933x enumC0933x32 = new EnumC0933x("SFIXED32_LIST", 31, 31, 2, o10);
        EnumC0933x enumC0933x33 = new EnumC0933x("SFIXED64_LIST", 32, 32, 2, o9);
        EnumC0933x enumC0933x34 = new EnumC0933x("SINT32_LIST", 33, 33, 2, o10);
        EnumC0933x enumC0933x35 = new EnumC0933x("SINT64_LIST", 34, 34, 2, o9);
        EnumC0933x enumC0933x36 = new EnumC0933x("DOUBLE_LIST_PACKED", 35, 35, 3, o7);
        f12288b = enumC0933x36;
        EnumC0933x enumC0933x37 = new EnumC0933x("FLOAT_LIST_PACKED", 36, 36, 3, o8);
        EnumC0933x enumC0933x38 = new EnumC0933x("INT64_LIST_PACKED", 37, 37, 3, o9);
        EnumC0933x enumC0933x39 = new EnumC0933x("UINT64_LIST_PACKED", 38, 38, 3, o9);
        EnumC0933x enumC0933x40 = new EnumC0933x("INT32_LIST_PACKED", 39, 39, 3, o10);
        EnumC0933x enumC0933x41 = new EnumC0933x("FIXED64_LIST_PACKED", 40, 40, 3, o9);
        EnumC0933x enumC0933x42 = new EnumC0933x("FIXED32_LIST_PACKED", 41, 41, 3, o10);
        EnumC0933x enumC0933x43 = new EnumC0933x("BOOL_LIST_PACKED", 42, 42, 3, o11);
        EnumC0933x enumC0933x44 = new EnumC0933x("UINT32_LIST_PACKED", 43, 43, 3, o10);
        EnumC0933x enumC0933x45 = new EnumC0933x("ENUM_LIST_PACKED", 44, 44, 3, o15);
        EnumC0933x enumC0933x46 = new EnumC0933x("SFIXED32_LIST_PACKED", 45, 45, 3, o10);
        EnumC0933x enumC0933x47 = new EnumC0933x("SFIXED64_LIST_PACKED", 46, 46, 3, o9);
        EnumC0933x enumC0933x48 = new EnumC0933x("SINT32_LIST_PACKED", 47, 47, 3, o10);
        EnumC0933x enumC0933x49 = new EnumC0933x("SINT64_LIST_PACKED", 48, 48, 3, o9);
        f12289c = enumC0933x49;
        f12291e = new EnumC0933x[]{enumC0933x, enumC0933x2, enumC0933x3, enumC0933x4, enumC0933x5, enumC0933x6, enumC0933x7, enumC0933x8, enumC0933x9, enumC0933x10, enumC0933x11, enumC0933x12, enumC0933x13, enumC0933x14, enumC0933x15, enumC0933x16, enumC0933x17, enumC0933x18, enumC0933x19, enumC0933x20, enumC0933x21, enumC0933x22, enumC0933x23, enumC0933x24, enumC0933x25, enumC0933x26, enumC0933x27, enumC0933x28, enumC0933x29, enumC0933x30, enumC0933x31, enumC0933x32, enumC0933x33, enumC0933x34, enumC0933x35, enumC0933x36, enumC0933x37, enumC0933x38, enumC0933x39, enumC0933x40, enumC0933x41, enumC0933x42, enumC0933x43, enumC0933x44, enumC0933x45, enumC0933x46, enumC0933x47, enumC0933x48, enumC0933x49, new EnumC0933x("GROUP_LIST", 49, 49, 2, o13), new EnumC0933x("MAP", 50, 50, 4, O.VOID)};
        EnumC0933x[] values = values();
        f12290d = new EnumC0933x[values.length];
        for (EnumC0933x enumC0933x50 : values) {
            f12290d[enumC0933x50.f12292a] = enumC0933x50;
        }
    }

    public EnumC0933x(String str, int i7, int i8, int i9, O o7) {
        this.f12292a = i8;
        int e7 = t.e.e(i9);
        if (e7 == 1) {
            o7.getClass();
        } else if (e7 == 3) {
            o7.getClass();
        }
        if (i9 == 1) {
            o7.ordinal();
        }
    }

    public static EnumC0933x valueOf(String str) {
        return (EnumC0933x) Enum.valueOf(EnumC0933x.class, str);
    }

    public static EnumC0933x[] values() {
        return (EnumC0933x[]) f12291e.clone();
    }

    public final int a() {
        return this.f12292a;
    }
}
