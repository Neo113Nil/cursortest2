package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public class S0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O0 f12148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P0 f12149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q0 f12150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ S0[] f12151f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f12152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12153b;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF12;

    static {
        S0 s7 = new S0("DOUBLE", 0, T0.DOUBLE, 1);
        S0 s8 = new S0("FLOAT", 1, T0.FLOAT, 5);
        T0 t7 = T0.LONG;
        S0 s9 = new S0("INT64", 2, t7, 0);
        S0 s10 = new S0("UINT64", 3, t7, 0);
        T0 t8 = T0.INT;
        S0 s11 = new S0("INT32", 4, t8, 0);
        S0 s12 = new S0("FIXED64", 5, t7, 1);
        S0 s13 = new S0("FIXED32", 6, t8, 5);
        S0 s14 = new S0("BOOL", 7, T0.BOOLEAN, 0);
        O0 o7 = new O0("STRING", 8, T0.STRING, 2);
        f12148c = o7;
        T0 t9 = T0.MESSAGE;
        P0 p5 = new P0("GROUP", 9, t9, 3);
        f12149d = p5;
        Q0 q1 = new Q0("MESSAGE", 10, t9, 2);
        f12150e = q1;
        f12151f = new S0[]{s7, s8, s9, s10, s11, s12, s13, s14, o7, p5, q1, new R0("BYTES", 11, T0.BYTE_STRING, 2), new S0("UINT32", 12, t8, 0), new S0("ENUM", 13, T0.ENUM, 0), new S0("SFIXED32", 14, t8, 5), new S0("SFIXED64", 15, t7, 1), new S0("SINT32", 16, t8, 0), new S0("SINT64", 17, t7, 0)};
    }

    public S0(String str, int i7, T0 t7, int i8) {
        super(str, i7);
        this.f12152a = t7;
        this.f12153b = i8;
    }

    public static S0 valueOf(String str) {
        return (S0) Enum.valueOf(S0.class, str);
    }

    public static S0[] values() {
        return (S0[]) f12151f.clone();
    }
}
