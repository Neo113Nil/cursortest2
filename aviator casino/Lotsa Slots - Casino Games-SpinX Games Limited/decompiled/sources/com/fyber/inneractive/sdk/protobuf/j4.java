package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public class j4 {
    private static final /* synthetic */ com.fyber.inneractive.sdk.protobuf.j4[] $VALUES;
    public static final com.fyber.inneractive.sdk.protobuf.j4 BOOL;
    public static final com.fyber.inneractive.sdk.protobuf.j4 BYTES;
    public static final com.fyber.inneractive.sdk.protobuf.j4 DOUBLE;
    public static final com.fyber.inneractive.sdk.protobuf.j4 ENUM;
    public static final com.fyber.inneractive.sdk.protobuf.j4 FIXED32;
    public static final com.fyber.inneractive.sdk.protobuf.j4 FIXED64;
    public static final com.fyber.inneractive.sdk.protobuf.j4 FLOAT;
    public static final com.fyber.inneractive.sdk.protobuf.j4 GROUP;
    public static final com.fyber.inneractive.sdk.protobuf.j4 INT32;
    public static final com.fyber.inneractive.sdk.protobuf.j4 INT64;
    public static final com.fyber.inneractive.sdk.protobuf.j4 MESSAGE;
    public static final com.fyber.inneractive.sdk.protobuf.j4 SFIXED32;
    public static final com.fyber.inneractive.sdk.protobuf.j4 SFIXED64;
    public static final com.fyber.inneractive.sdk.protobuf.j4 SINT32;
    public static final com.fyber.inneractive.sdk.protobuf.j4 SINT64;
    public static final com.fyber.inneractive.sdk.protobuf.j4 STRING;
    public static final com.fyber.inneractive.sdk.protobuf.j4 UINT32;
    public static final com.fyber.inneractive.sdk.protobuf.j4 UINT64;
    private final com.fyber.inneractive.sdk.protobuf.k4 javaType;
    private final int wireType;

    static {
        com.fyber.inneractive.sdk.protobuf.j4 j4Var = new com.fyber.inneractive.sdk.protobuf.j4("DOUBLE", 0, com.fyber.inneractive.sdk.protobuf.k4.DOUBLE, 1);
        DOUBLE = j4Var;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var2 = new com.fyber.inneractive.sdk.protobuf.j4("FLOAT", 1, com.fyber.inneractive.sdk.protobuf.k4.FLOAT, 5);
        FLOAT = j4Var2;
        com.fyber.inneractive.sdk.protobuf.k4 k4Var = com.fyber.inneractive.sdk.protobuf.k4.LONG;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var3 = new com.fyber.inneractive.sdk.protobuf.j4("INT64", 2, k4Var, 0);
        INT64 = j4Var3;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var4 = new com.fyber.inneractive.sdk.protobuf.j4("UINT64", 3, k4Var, 0);
        UINT64 = j4Var4;
        com.fyber.inneractive.sdk.protobuf.k4 k4Var2 = com.fyber.inneractive.sdk.protobuf.k4.INT;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var5 = new com.fyber.inneractive.sdk.protobuf.j4("INT32", 4, k4Var2, 0);
        INT32 = j4Var5;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var6 = new com.fyber.inneractive.sdk.protobuf.j4("FIXED64", 5, k4Var, 1);
        FIXED64 = j4Var6;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var7 = new com.fyber.inneractive.sdk.protobuf.j4("FIXED32", 6, k4Var2, 5);
        FIXED32 = j4Var7;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var8 = new com.fyber.inneractive.sdk.protobuf.j4("BOOL", 7, com.fyber.inneractive.sdk.protobuf.k4.BOOLEAN, 0);
        BOOL = j4Var8;
        com.fyber.inneractive.sdk.protobuf.f4 f4Var = new com.fyber.inneractive.sdk.protobuf.f4(com.fyber.inneractive.sdk.protobuf.k4.STRING);
        STRING = f4Var;
        final com.fyber.inneractive.sdk.protobuf.k4 k4Var3 = com.fyber.inneractive.sdk.protobuf.k4.MESSAGE;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var9 = new com.fyber.inneractive.sdk.protobuf.j4(k4Var3) { // from class: com.fyber.inneractive.sdk.protobuf.g4
            @Override // com.fyber.inneractive.sdk.protobuf.j4
            public final boolean c() {
                return false;
            }
        };
        GROUP = j4Var9;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var10 = new com.fyber.inneractive.sdk.protobuf.j4(k4Var3) { // from class: com.fyber.inneractive.sdk.protobuf.h4
            @Override // com.fyber.inneractive.sdk.protobuf.j4
            public final boolean c() {
                return false;
            }
        };
        MESSAGE = j4Var10;
        final com.fyber.inneractive.sdk.protobuf.k4 k4Var4 = com.fyber.inneractive.sdk.protobuf.k4.BYTE_STRING;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var11 = new com.fyber.inneractive.sdk.protobuf.j4(k4Var4) { // from class: com.fyber.inneractive.sdk.protobuf.i4
            @Override // com.fyber.inneractive.sdk.protobuf.j4
            public final boolean c() {
                return false;
            }
        };
        BYTES = j4Var11;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var12 = new com.fyber.inneractive.sdk.protobuf.j4("UINT32", 12, k4Var2, 0);
        UINT32 = j4Var12;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var13 = new com.fyber.inneractive.sdk.protobuf.j4("ENUM", 13, com.fyber.inneractive.sdk.protobuf.k4.ENUM, 0);
        ENUM = j4Var13;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var14 = new com.fyber.inneractive.sdk.protobuf.j4("SFIXED32", 14, k4Var2, 5);
        SFIXED32 = j4Var14;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var15 = new com.fyber.inneractive.sdk.protobuf.j4("SFIXED64", 15, k4Var, 1);
        SFIXED64 = j4Var15;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var16 = new com.fyber.inneractive.sdk.protobuf.j4("SINT32", 16, k4Var2, 0);
        SINT32 = j4Var16;
        com.fyber.inneractive.sdk.protobuf.j4 j4Var17 = new com.fyber.inneractive.sdk.protobuf.j4("SINT64", 17, k4Var, 0);
        SINT64 = j4Var17;
        $VALUES = new com.fyber.inneractive.sdk.protobuf.j4[]{j4Var, j4Var2, j4Var3, j4Var4, j4Var5, j4Var6, j4Var7, j4Var8, f4Var, j4Var9, j4Var10, j4Var11, j4Var12, j4Var13, j4Var14, j4Var15, j4Var16, j4Var17};
    }

    public j4(java.lang.String str, int i, com.fyber.inneractive.sdk.protobuf.k4 k4Var, int i2) {
        this.javaType = k4Var;
        this.wireType = i2;
    }

    public static com.fyber.inneractive.sdk.protobuf.j4 valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.protobuf.j4) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.protobuf.j4.class, str);
    }

    public static com.fyber.inneractive.sdk.protobuf.j4[] values() {
        return (com.fyber.inneractive.sdk.protobuf.j4[]) $VALUES.clone();
    }

    public final com.fyber.inneractive.sdk.protobuf.k4 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }

    public boolean c() {
        return !(this instanceof com.fyber.inneractive.sdk.protobuf.f4);
    }

    public j4(java.lang.String str, int i, com.fyber.inneractive.sdk.protobuf.k4 k4Var, int i2, int i3) {
        this.javaType = k4Var;
        this.wireType = i2;
    }
}
