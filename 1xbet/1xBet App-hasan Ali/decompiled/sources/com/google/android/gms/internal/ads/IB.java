package com.google.android.gms.internal.ads;

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
/* loaded from: classes.dex */
public final class IB {

    /* renamed from: l, reason: collision with root package name */
    public static final IB f9529l;

    /* renamed from: m, reason: collision with root package name */
    public static final IB f9530m;

    /* renamed from: n, reason: collision with root package name */
    public static final IB[] f9531n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ IB[] f9532o;

    /* renamed from: k, reason: collision with root package name */
    public final int f9533k;

    /* JADX INFO: Fake field, exist only in values array */
    IB EF0;

    static {
        ZB zb = ZB.f12462o;
        IB ib = new IB("DOUBLE", 0, 0, 1, zb);
        ZB zb2 = ZB.f12461n;
        IB ib2 = new IB("FLOAT", 1, 1, 1, zb2);
        ZB zb3 = ZB.f12460m;
        IB ib3 = new IB("INT64", 2, 2, 1, zb3);
        IB ib4 = new IB("UINT64", 3, 3, 1, zb3);
        ZB zb4 = ZB.f12459l;
        IB ib5 = new IB("INT32", 4, 4, 1, zb4);
        IB ib6 = new IB("FIXED64", 5, 5, 1, zb3);
        IB ib7 = new IB("FIXED32", 6, 6, 1, zb4);
        ZB zb5 = ZB.f12463p;
        IB ib8 = new IB("BOOL", 7, 7, 1, zb5);
        ZB zb6 = ZB.f12464q;
        IB ib9 = new IB("STRING", 8, 8, 1, zb6);
        ZB zb7 = ZB.f12467t;
        IB ib10 = new IB("MESSAGE", 9, 9, 1, zb7);
        ZB zb8 = ZB.f12465r;
        IB ib11 = new IB("BYTES", 10, 10, 1, zb8);
        IB ib12 = new IB("UINT32", 11, 11, 1, zb4);
        ZB zb9 = ZB.f12466s;
        IB ib13 = new IB("ENUM", 12, 12, 1, zb9);
        IB ib14 = new IB("SFIXED32", 13, 13, 1, zb4);
        IB ib15 = new IB("SFIXED64", 14, 14, 1, zb3);
        IB ib16 = new IB("SINT32", 15, 15, 1, zb4);
        IB ib17 = new IB("SINT64", 16, 16, 1, zb3);
        IB ib18 = new IB("GROUP", 17, 17, 1, zb7);
        IB ib19 = new IB("DOUBLE_LIST", 18, 18, 2, zb);
        IB ib20 = new IB("FLOAT_LIST", 19, 19, 2, zb2);
        IB ib21 = new IB("INT64_LIST", 20, 20, 2, zb3);
        IB ib22 = new IB("UINT64_LIST", 21, 21, 2, zb3);
        IB ib23 = new IB("INT32_LIST", 22, 22, 2, zb4);
        IB ib24 = new IB("FIXED64_LIST", 23, 23, 2, zb3);
        IB ib25 = new IB("FIXED32_LIST", 24, 24, 2, zb4);
        IB ib26 = new IB("BOOL_LIST", 25, 25, 2, zb5);
        IB ib27 = new IB("STRING_LIST", 26, 26, 2, zb6);
        IB ib28 = new IB("MESSAGE_LIST", 27, 27, 2, zb7);
        IB ib29 = new IB("BYTES_LIST", 28, 28, 2, zb8);
        IB ib30 = new IB("UINT32_LIST", 29, 29, 2, zb4);
        IB ib31 = new IB("ENUM_LIST", 30, 30, 2, zb9);
        IB ib32 = new IB("SFIXED32_LIST", 31, 31, 2, zb4);
        IB ib33 = new IB("SFIXED64_LIST", 32, 32, 2, zb3);
        IB ib34 = new IB("SINT32_LIST", 33, 33, 2, zb4);
        IB ib35 = new IB("SINT64_LIST", 34, 34, 2, zb3);
        IB ib36 = new IB("DOUBLE_LIST_PACKED", 35, 35, 3, zb);
        f9529l = ib36;
        IB ib37 = new IB("FLOAT_LIST_PACKED", 36, 36, 3, zb2);
        IB ib38 = new IB("INT64_LIST_PACKED", 37, 37, 3, zb3);
        IB ib39 = new IB("UINT64_LIST_PACKED", 38, 38, 3, zb3);
        IB ib40 = new IB("INT32_LIST_PACKED", 39, 39, 3, zb4);
        IB ib41 = new IB("FIXED64_LIST_PACKED", 40, 40, 3, zb3);
        IB ib42 = new IB("FIXED32_LIST_PACKED", 41, 41, 3, zb4);
        IB ib43 = new IB("BOOL_LIST_PACKED", 42, 42, 3, zb5);
        IB ib44 = new IB("UINT32_LIST_PACKED", 43, 43, 3, zb4);
        IB ib45 = new IB("ENUM_LIST_PACKED", 44, 44, 3, zb9);
        IB ib46 = new IB("SFIXED32_LIST_PACKED", 45, 45, 3, zb4);
        IB ib47 = new IB("SFIXED64_LIST_PACKED", 46, 46, 3, zb3);
        IB ib48 = new IB("SINT32_LIST_PACKED", 47, 47, 3, zb4);
        IB ib49 = new IB("SINT64_LIST_PACKED", 48, 48, 3, zb3);
        f9530m = ib49;
        f9532o = new IB[]{ib, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12, ib13, ib14, ib15, ib16, ib17, ib18, ib19, ib20, ib21, ib22, ib23, ib24, ib25, ib26, ib27, ib28, ib29, ib30, ib31, ib32, ib33, ib34, ib35, ib36, ib37, ib38, ib39, ib40, ib41, ib42, ib43, ib44, ib45, ib46, ib47, ib48, ib49, new IB("GROUP_LIST", 49, 49, 2, zb7), new IB("MAP", 50, 50, 4, ZB.f12458k)};
        IB[] values = values();
        f9531n = new IB[values.length];
        for (IB ib50 : values) {
            f9531n[ib50.f9533k] = ib50;
        }
    }

    public IB(String str, int i, int i5, int i6, ZB zb) {
        this.f9533k = i5;
        int i7 = i6 - 1;
        if (i7 == 1) {
            zb.getClass();
        } else if (i7 == 3) {
            zb.getClass();
        }
        if (i6 == 1) {
            ZB zb2 = ZB.f12458k;
            zb.ordinal();
        }
    }

    public static IB[] values() {
        return (IB[]) f9532o.clone();
    }
}
