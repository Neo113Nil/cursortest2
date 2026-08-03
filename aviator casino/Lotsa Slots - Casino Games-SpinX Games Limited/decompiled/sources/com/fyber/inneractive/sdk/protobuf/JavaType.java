package com.fyber.inneractive.sdk.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class JavaType {
    private static final /* synthetic */ com.fyber.inneractive.sdk.protobuf.JavaType[] $VALUES;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType BOOLEAN;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType BYTE_STRING;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType DOUBLE;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType ENUM;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType FLOAT;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType INT;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType LONG;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType MESSAGE;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType STRING;
    public static final com.fyber.inneractive.sdk.protobuf.JavaType VOID = new com.fyber.inneractive.sdk.protobuf.JavaType("VOID", 0, java.lang.Void.class, java.lang.Void.class, null);
    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    private static /* synthetic */ com.fyber.inneractive.sdk.protobuf.JavaType[] $values() {
        return new com.fyber.inneractive.sdk.protobuf.JavaType[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        INT = new com.fyber.inneractive.sdk.protobuf.JavaType("INT", 1, cls, java.lang.Integer.class, 0);
        LONG = new com.fyber.inneractive.sdk.protobuf.JavaType("LONG", 2, java.lang.Long.TYPE, java.lang.Long.class, 0L);
        FLOAT = new com.fyber.inneractive.sdk.protobuf.JavaType("FLOAT", 3, java.lang.Float.TYPE, java.lang.Float.class, java.lang.Float.valueOf(0.0f));
        DOUBLE = new com.fyber.inneractive.sdk.protobuf.JavaType("DOUBLE", 4, java.lang.Double.TYPE, java.lang.Double.class, java.lang.Double.valueOf(0.0d));
        BOOLEAN = new com.fyber.inneractive.sdk.protobuf.JavaType("BOOLEAN", 5, java.lang.Boolean.TYPE, java.lang.Boolean.class, java.lang.Boolean.FALSE);
        STRING = new com.fyber.inneractive.sdk.protobuf.JavaType("STRING", 6, java.lang.String.class, java.lang.String.class, "");
        BYTE_STRING = new com.fyber.inneractive.sdk.protobuf.JavaType("BYTE_STRING", 7, com.fyber.inneractive.sdk.protobuf.s.class, com.fyber.inneractive.sdk.protobuf.s.class, com.fyber.inneractive.sdk.protobuf.s.b);
        ENUM = new com.fyber.inneractive.sdk.protobuf.JavaType("ENUM", 8, cls, java.lang.Integer.class, null);
        MESSAGE = new com.fyber.inneractive.sdk.protobuf.JavaType("MESSAGE", 9, java.lang.Object.class, java.lang.Object.class, null);
        $VALUES = $values();
    }

    private JavaType(java.lang.String str, int i, java.lang.Class cls, java.lang.Class cls2, java.lang.Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static com.fyber.inneractive.sdk.protobuf.JavaType valueOf(java.lang.String str) {
        return (com.fyber.inneractive.sdk.protobuf.JavaType) java.lang.Enum.valueOf(com.fyber.inneractive.sdk.protobuf.JavaType.class, str);
    }

    public static com.fyber.inneractive.sdk.protobuf.JavaType[] values() {
        return (com.fyber.inneractive.sdk.protobuf.JavaType[]) $VALUES.clone();
    }

    public java.lang.Class<?> getBoxedType() {
        return this.boxedType;
    }

    public java.lang.Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public java.lang.Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(java.lang.Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
