package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class S0 {

    /* renamed from: c, reason: collision with root package name */
    public static final O0 f12148c;

    /* renamed from: d, reason: collision with root package name */
    public static final P0 f12149d;

    /* renamed from: e, reason: collision with root package name */
    public static final Q0 f12150e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ S0[] f12151f;

    /* renamed from: a, reason: collision with root package name */
    public final T0 f12152a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12153b;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    S0 EF12;

    static {
        S0 s02 = new S0("DOUBLE", 0, T0.DOUBLE, 1);
        S0 s03 = new S0("FLOAT", 1, T0.FLOAT, 5);
        T0 t02 = T0.LONG;
        S0 s04 = new S0("INT64", 2, t02, 0);
        S0 s05 = new S0("UINT64", 3, t02, 0);
        T0 t03 = T0.INT;
        S0 s06 = new S0("INT32", 4, t03, 0);
        S0 s07 = new S0("FIXED64", 5, t02, 1);
        S0 s08 = new S0("FIXED32", 6, t03, 5);
        S0 s09 = new S0("BOOL", 7, T0.BOOLEAN, 0);
        O0 o02 = new O0("STRING", 8, T0.STRING, 2);
        f12148c = o02;
        T0 t04 = T0.MESSAGE;
        P0 p02 = new P0("GROUP", 9, t04, 3);
        f12149d = p02;
        Q0 q02 = new Q0("MESSAGE", 10, t04, 2);
        f12150e = q02;
        f12151f = new S0[]{s02, s03, s04, s05, s06, s07, s08, s09, o02, p02, q02, new R0("BYTES", 11, T0.BYTE_STRING, 2), new S0("UINT32", 12, t03, 0), new S0("ENUM", 13, T0.ENUM, 0), new S0("SFIXED32", 14, t03, 5), new S0("SFIXED64", 15, t02, 1), new S0("SINT32", 16, t03, 0), new S0("SINT64", 17, t02, 0)};
    }

    public S0(String str, int i7, T0 t02, int i8) {
        this.f12152a = t02;
        this.f12153b = i8;
    }

    public static S0 valueOf(String str) {
        return (S0) Enum.valueOf(S0.class, str);
    }

    public static S0[] values() {
        return (S0[]) f12151f.clone();
    }
}
