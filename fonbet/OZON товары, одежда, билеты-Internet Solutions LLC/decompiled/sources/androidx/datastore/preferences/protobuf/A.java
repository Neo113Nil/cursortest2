package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final A BOOLEAN;
    public static final A BYTE_STRING;
    public static final A DOUBLE;
    public static final A ENUM;
    public static final A FLOAT;
    public static final A INT;
    public static final A LONG;
    public static final A MESSAGE;
    public static final A STRING;
    public static final A VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        A a11 = new A("VOID", 0, Void.class, Void.class, null);
        VOID = a11;
        Class cls = Integer.TYPE;
        A a12 = new A("INT", 1, cls, Integer.class, 0);
        INT = a12;
        A a13 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = a13;
        A a14 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = a14;
        A a15 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = a15;
        A a16 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = a16;
        A a17 = new A("STRING", 6, String.class, String.class, "");
        STRING = a17;
        A a18 = new A("BYTE_STRING", 7, AbstractC5362h.class, AbstractC5362h.class, AbstractC5362h.f42524b);
        BYTE_STRING = a18;
        A a19 = new A("ENUM", 8, cls, Integer.class, null);
        ENUM = a19;
        A a21 = new A("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = a21;
        $VALUES = new A[]{a11, a12, a13, a14, a15, a16, a17, a18, a19, a21};
    }

    private A(String str, int i11, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }

    public final Class<?> a() {
        return this.boxedType;
    }
}
