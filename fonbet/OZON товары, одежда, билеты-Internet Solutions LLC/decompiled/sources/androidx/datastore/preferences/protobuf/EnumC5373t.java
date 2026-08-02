package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5373t {
    private static final /* synthetic */ EnumC5373t[] $VALUES;
    public static final EnumC5373t BOOL;
    public static final EnumC5373t BOOL_LIST;
    public static final EnumC5373t BOOL_LIST_PACKED;
    public static final EnumC5373t BYTES;
    public static final EnumC5373t BYTES_LIST;
    public static final EnumC5373t DOUBLE;
    public static final EnumC5373t DOUBLE_LIST;
    public static final EnumC5373t DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC5373t ENUM;
    public static final EnumC5373t ENUM_LIST;
    public static final EnumC5373t ENUM_LIST_PACKED;
    public static final EnumC5373t FIXED32;
    public static final EnumC5373t FIXED32_LIST;
    public static final EnumC5373t FIXED32_LIST_PACKED;
    public static final EnumC5373t FIXED64;
    public static final EnumC5373t FIXED64_LIST;
    public static final EnumC5373t FIXED64_LIST_PACKED;
    public static final EnumC5373t FLOAT;
    public static final EnumC5373t FLOAT_LIST;
    public static final EnumC5373t FLOAT_LIST_PACKED;
    public static final EnumC5373t GROUP;
    public static final EnumC5373t GROUP_LIST;
    public static final EnumC5373t INT32;
    public static final EnumC5373t INT32_LIST;
    public static final EnumC5373t INT32_LIST_PACKED;
    public static final EnumC5373t INT64;
    public static final EnumC5373t INT64_LIST;
    public static final EnumC5373t INT64_LIST_PACKED;
    public static final EnumC5373t MAP;
    public static final EnumC5373t MESSAGE;
    public static final EnumC5373t MESSAGE_LIST;
    public static final EnumC5373t SFIXED32;
    public static final EnumC5373t SFIXED32_LIST;
    public static final EnumC5373t SFIXED32_LIST_PACKED;
    public static final EnumC5373t SFIXED64;
    public static final EnumC5373t SFIXED64_LIST;
    public static final EnumC5373t SFIXED64_LIST_PACKED;
    public static final EnumC5373t SINT32;
    public static final EnumC5373t SINT32_LIST;
    public static final EnumC5373t SINT32_LIST_PACKED;
    public static final EnumC5373t SINT64;
    public static final EnumC5373t SINT64_LIST;
    public static final EnumC5373t SINT64_LIST_PACKED;
    public static final EnumC5373t STRING;
    public static final EnumC5373t STRING_LIST;
    public static final EnumC5373t UINT32;
    public static final EnumC5373t UINT32_LIST;
    public static final EnumC5373t UINT32_LIST_PACKED;
    public static final EnumC5373t UINT64;
    public static final EnumC5373t UINT64_LIST;
    public static final EnumC5373t UINT64_LIST_PACKED;
    private static final EnumC5373t[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f42618id;
    private final A javaType;
    private final boolean primitiveScalar;

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42619a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f42620b;

        static {
            int[] iArr = new int[A.values().length];
            f42620b = iArr;
            try {
                iArr[A.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42620b[A.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42620b[A.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f42619a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42619a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42619a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z11) {
            this.isList = z11;
        }
    }

    static {
        b bVar = b.SCALAR;
        A a11 = A.DOUBLE;
        EnumC5373t enumC5373t = new EnumC5373t("DOUBLE", 0, 0, bVar, a11);
        DOUBLE = enumC5373t;
        A a12 = A.FLOAT;
        EnumC5373t enumC5373t2 = new EnumC5373t("FLOAT", 1, 1, bVar, a12);
        FLOAT = enumC5373t2;
        A a13 = A.LONG;
        EnumC5373t enumC5373t3 = new EnumC5373t("INT64", 2, 2, bVar, a13);
        INT64 = enumC5373t3;
        EnumC5373t enumC5373t4 = new EnumC5373t("UINT64", 3, 3, bVar, a13);
        UINT64 = enumC5373t4;
        A a14 = A.INT;
        EnumC5373t enumC5373t5 = new EnumC5373t("INT32", 4, 4, bVar, a14);
        INT32 = enumC5373t5;
        EnumC5373t enumC5373t6 = new EnumC5373t("FIXED64", 5, 5, bVar, a13);
        FIXED64 = enumC5373t6;
        EnumC5373t enumC5373t7 = new EnumC5373t("FIXED32", 6, 6, bVar, a14);
        FIXED32 = enumC5373t7;
        A a15 = A.BOOLEAN;
        EnumC5373t enumC5373t8 = new EnumC5373t("BOOL", 7, 7, bVar, a15);
        BOOL = enumC5373t8;
        A a16 = A.STRING;
        EnumC5373t enumC5373t9 = new EnumC5373t("STRING", 8, 8, bVar, a16);
        STRING = enumC5373t9;
        A a17 = A.MESSAGE;
        EnumC5373t enumC5373t10 = new EnumC5373t("MESSAGE", 9, 9, bVar, a17);
        MESSAGE = enumC5373t10;
        A a18 = A.BYTE_STRING;
        EnumC5373t enumC5373t11 = new EnumC5373t("BYTES", 10, 10, bVar, a18);
        BYTES = enumC5373t11;
        EnumC5373t enumC5373t12 = new EnumC5373t("UINT32", 11, 11, bVar, a14);
        UINT32 = enumC5373t12;
        A a19 = A.ENUM;
        EnumC5373t enumC5373t13 = new EnumC5373t("ENUM", 12, 12, bVar, a19);
        ENUM = enumC5373t13;
        EnumC5373t enumC5373t14 = new EnumC5373t("SFIXED32", 13, 13, bVar, a14);
        SFIXED32 = enumC5373t14;
        EnumC5373t enumC5373t15 = new EnumC5373t("SFIXED64", 14, 14, bVar, a13);
        SFIXED64 = enumC5373t15;
        EnumC5373t enumC5373t16 = new EnumC5373t("SINT32", 15, 15, bVar, a14);
        SINT32 = enumC5373t16;
        EnumC5373t enumC5373t17 = new EnumC5373t("SINT64", 16, 16, bVar, a13);
        SINT64 = enumC5373t17;
        EnumC5373t enumC5373t18 = new EnumC5373t("GROUP", 17, 17, bVar, a17);
        GROUP = enumC5373t18;
        b bVar2 = b.VECTOR;
        EnumC5373t enumC5373t19 = new EnumC5373t("DOUBLE_LIST", 18, 18, bVar2, a11);
        DOUBLE_LIST = enumC5373t19;
        EnumC5373t enumC5373t20 = new EnumC5373t("FLOAT_LIST", 19, 19, bVar2, a12);
        FLOAT_LIST = enumC5373t20;
        EnumC5373t enumC5373t21 = new EnumC5373t("INT64_LIST", 20, 20, bVar2, a13);
        INT64_LIST = enumC5373t21;
        EnumC5373t enumC5373t22 = new EnumC5373t("UINT64_LIST", 21, 21, bVar2, a13);
        UINT64_LIST = enumC5373t22;
        EnumC5373t enumC5373t23 = new EnumC5373t("INT32_LIST", 22, 22, bVar2, a14);
        INT32_LIST = enumC5373t23;
        EnumC5373t enumC5373t24 = new EnumC5373t("FIXED64_LIST", 23, 23, bVar2, a13);
        FIXED64_LIST = enumC5373t24;
        EnumC5373t enumC5373t25 = new EnumC5373t("FIXED32_LIST", 24, 24, bVar2, a14);
        FIXED32_LIST = enumC5373t25;
        EnumC5373t enumC5373t26 = new EnumC5373t("BOOL_LIST", 25, 25, bVar2, a15);
        BOOL_LIST = enumC5373t26;
        EnumC5373t enumC5373t27 = new EnumC5373t("STRING_LIST", 26, 26, bVar2, a16);
        STRING_LIST = enumC5373t27;
        EnumC5373t enumC5373t28 = new EnumC5373t("MESSAGE_LIST", 27, 27, bVar2, a17);
        MESSAGE_LIST = enumC5373t28;
        EnumC5373t enumC5373t29 = new EnumC5373t("BYTES_LIST", 28, 28, bVar2, a18);
        BYTES_LIST = enumC5373t29;
        EnumC5373t enumC5373t30 = new EnumC5373t("UINT32_LIST", 29, 29, bVar2, a14);
        UINT32_LIST = enumC5373t30;
        EnumC5373t enumC5373t31 = new EnumC5373t("ENUM_LIST", 30, 30, bVar2, a19);
        ENUM_LIST = enumC5373t31;
        EnumC5373t enumC5373t32 = new EnumC5373t("SFIXED32_LIST", 31, 31, bVar2, a14);
        SFIXED32_LIST = enumC5373t32;
        EnumC5373t enumC5373t33 = new EnumC5373t("SFIXED64_LIST", 32, 32, bVar2, a13);
        SFIXED64_LIST = enumC5373t33;
        EnumC5373t enumC5373t34 = new EnumC5373t("SINT32_LIST", 33, 33, bVar2, a14);
        SINT32_LIST = enumC5373t34;
        EnumC5373t enumC5373t35 = new EnumC5373t("SINT64_LIST", 34, 34, bVar2, a13);
        SINT64_LIST = enumC5373t35;
        b bVar3 = b.PACKED_VECTOR;
        EnumC5373t enumC5373t36 = new EnumC5373t("DOUBLE_LIST_PACKED", 35, 35, bVar3, a11);
        DOUBLE_LIST_PACKED = enumC5373t36;
        EnumC5373t enumC5373t37 = new EnumC5373t("FLOAT_LIST_PACKED", 36, 36, bVar3, a12);
        FLOAT_LIST_PACKED = enumC5373t37;
        EnumC5373t enumC5373t38 = new EnumC5373t("INT64_LIST_PACKED", 37, 37, bVar3, a13);
        INT64_LIST_PACKED = enumC5373t38;
        EnumC5373t enumC5373t39 = new EnumC5373t("UINT64_LIST_PACKED", 38, 38, bVar3, a13);
        UINT64_LIST_PACKED = enumC5373t39;
        EnumC5373t enumC5373t40 = new EnumC5373t("INT32_LIST_PACKED", 39, 39, bVar3, a14);
        INT32_LIST_PACKED = enumC5373t40;
        EnumC5373t enumC5373t41 = new EnumC5373t("FIXED64_LIST_PACKED", 40, 40, bVar3, a13);
        FIXED64_LIST_PACKED = enumC5373t41;
        EnumC5373t enumC5373t42 = new EnumC5373t("FIXED32_LIST_PACKED", 41, 41, bVar3, a14);
        FIXED32_LIST_PACKED = enumC5373t42;
        EnumC5373t enumC5373t43 = new EnumC5373t("BOOL_LIST_PACKED", 42, 42, bVar3, a15);
        BOOL_LIST_PACKED = enumC5373t43;
        EnumC5373t enumC5373t44 = new EnumC5373t("UINT32_LIST_PACKED", 43, 43, bVar3, a14);
        UINT32_LIST_PACKED = enumC5373t44;
        EnumC5373t enumC5373t45 = new EnumC5373t("ENUM_LIST_PACKED", 44, 44, bVar3, a19);
        ENUM_LIST_PACKED = enumC5373t45;
        EnumC5373t enumC5373t46 = new EnumC5373t("SFIXED32_LIST_PACKED", 45, 45, bVar3, a14);
        SFIXED32_LIST_PACKED = enumC5373t46;
        EnumC5373t enumC5373t47 = new EnumC5373t("SFIXED64_LIST_PACKED", 46, 46, bVar3, a13);
        SFIXED64_LIST_PACKED = enumC5373t47;
        EnumC5373t enumC5373t48 = new EnumC5373t("SINT32_LIST_PACKED", 47, 47, bVar3, a14);
        SINT32_LIST_PACKED = enumC5373t48;
        EnumC5373t enumC5373t49 = new EnumC5373t("SINT64_LIST_PACKED", 48, 48, bVar3, a13);
        SINT64_LIST_PACKED = enumC5373t49;
        EnumC5373t enumC5373t50 = new EnumC5373t("GROUP_LIST", 49, 49, bVar2, a17);
        GROUP_LIST = enumC5373t50;
        EnumC5373t enumC5373t51 = new EnumC5373t("MAP", 50, 50, b.MAP, A.VOID);
        MAP = enumC5373t51;
        $VALUES = new EnumC5373t[]{enumC5373t, enumC5373t2, enumC5373t3, enumC5373t4, enumC5373t5, enumC5373t6, enumC5373t7, enumC5373t8, enumC5373t9, enumC5373t10, enumC5373t11, enumC5373t12, enumC5373t13, enumC5373t14, enumC5373t15, enumC5373t16, enumC5373t17, enumC5373t18, enumC5373t19, enumC5373t20, enumC5373t21, enumC5373t22, enumC5373t23, enumC5373t24, enumC5373t25, enumC5373t26, enumC5373t27, enumC5373t28, enumC5373t29, enumC5373t30, enumC5373t31, enumC5373t32, enumC5373t33, enumC5373t34, enumC5373t35, enumC5373t36, enumC5373t37, enumC5373t38, enumC5373t39, enumC5373t40, enumC5373t41, enumC5373t42, enumC5373t43, enumC5373t44, enumC5373t45, enumC5373t46, enumC5373t47, enumC5373t48, enumC5373t49, enumC5373t50, enumC5373t51};
        EMPTY_TYPES = new Type[0];
        EnumC5373t[] values = values();
        VALUES = new EnumC5373t[values.length];
        for (EnumC5373t enumC5373t52 : values) {
            VALUES[enumC5373t52.f42618id] = enumC5373t52;
        }
    }

    private EnumC5373t(String str, int i11, int i12, b bVar, A a11) {
        int i13;
        this.f42618id = i12;
        this.collection = bVar;
        this.javaType = a11;
        int i14 = a.f42619a[bVar.ordinal()];
        if (i14 == 1) {
            this.elementType = a11.a();
        } else if (i14 != 2) {
            this.elementType = null;
        } else {
            this.elementType = a11.a();
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i13 = a.f42620b[a11.ordinal()]) == 1 || i13 == 2 || i13 == 3) ? false : true;
    }

    public static EnumC5373t valueOf(String str) {
        return (EnumC5373t) Enum.valueOf(EnumC5373t.class, str);
    }

    public static EnumC5373t[] values() {
        return (EnumC5373t[]) $VALUES.clone();
    }

    public final int a() {
        return this.f42618id;
    }
}
