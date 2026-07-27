package com.google.android.gms.internal.play_billing;

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
/* renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0178c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0178c1 f2731b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0178c1 f2732c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0178c1[] f2733d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0178c1[] f2734e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2735a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0178c1 EF0;

    static {
        EnumC0214o1 enumC0214o1 = EnumC0214o1.f2791e;
        EnumC0178c1 enumC0178c1 = new EnumC0178c1("DOUBLE", 0, 0, 1, enumC0214o1);
        EnumC0214o1 enumC0214o12 = EnumC0214o1.f2790d;
        EnumC0178c1 enumC0178c12 = new EnumC0178c1("FLOAT", 1, 1, 1, enumC0214o12);
        EnumC0214o1 enumC0214o13 = EnumC0214o1.f2789c;
        EnumC0178c1 enumC0178c13 = new EnumC0178c1("INT64", 2, 2, 1, enumC0214o13);
        EnumC0178c1 enumC0178c14 = new EnumC0178c1("UINT64", 3, 3, 1, enumC0214o13);
        EnumC0214o1 enumC0214o14 = EnumC0214o1.f2788b;
        EnumC0178c1 enumC0178c15 = new EnumC0178c1("INT32", 4, 4, 1, enumC0214o14);
        EnumC0178c1 enumC0178c16 = new EnumC0178c1("FIXED64", 5, 5, 1, enumC0214o13);
        EnumC0178c1 enumC0178c17 = new EnumC0178c1("FIXED32", 6, 6, 1, enumC0214o14);
        EnumC0214o1 enumC0214o15 = EnumC0214o1.f;
        EnumC0178c1 enumC0178c18 = new EnumC0178c1("BOOL", 7, 7, 1, enumC0214o15);
        EnumC0214o1 enumC0214o16 = EnumC0214o1.f2792g;
        EnumC0178c1 enumC0178c19 = new EnumC0178c1("STRING", 8, 8, 1, enumC0214o16);
        EnumC0214o1 enumC0214o17 = EnumC0214o1.f2795j;
        EnumC0178c1 enumC0178c110 = new EnumC0178c1("MESSAGE", 9, 9, 1, enumC0214o17);
        EnumC0214o1 enumC0214o18 = EnumC0214o1.f2793h;
        EnumC0178c1 enumC0178c111 = new EnumC0178c1("BYTES", 10, 10, 1, enumC0214o18);
        EnumC0178c1 enumC0178c112 = new EnumC0178c1("UINT32", 11, 11, 1, enumC0214o14);
        EnumC0214o1 enumC0214o19 = EnumC0214o1.f2794i;
        EnumC0178c1 enumC0178c113 = new EnumC0178c1("ENUM", 12, 12, 1, enumC0214o19);
        EnumC0178c1 enumC0178c114 = new EnumC0178c1("SFIXED32", 13, 13, 1, enumC0214o14);
        EnumC0178c1 enumC0178c115 = new EnumC0178c1("SFIXED64", 14, 14, 1, enumC0214o13);
        EnumC0178c1 enumC0178c116 = new EnumC0178c1("SINT32", 15, 15, 1, enumC0214o14);
        EnumC0178c1 enumC0178c117 = new EnumC0178c1("SINT64", 16, 16, 1, enumC0214o13);
        EnumC0178c1 enumC0178c118 = new EnumC0178c1("GROUP", 17, 17, 1, enumC0214o17);
        EnumC0178c1 enumC0178c119 = new EnumC0178c1("DOUBLE_LIST", 18, 18, 2, enumC0214o1);
        EnumC0178c1 enumC0178c120 = new EnumC0178c1("FLOAT_LIST", 19, 19, 2, enumC0214o12);
        EnumC0178c1 enumC0178c121 = new EnumC0178c1("INT64_LIST", 20, 20, 2, enumC0214o13);
        EnumC0178c1 enumC0178c122 = new EnumC0178c1("UINT64_LIST", 21, 21, 2, enumC0214o13);
        EnumC0178c1 enumC0178c123 = new EnumC0178c1("INT32_LIST", 22, 22, 2, enumC0214o14);
        EnumC0178c1 enumC0178c124 = new EnumC0178c1("FIXED64_LIST", 23, 23, 2, enumC0214o13);
        EnumC0178c1 enumC0178c125 = new EnumC0178c1("FIXED32_LIST", 24, 24, 2, enumC0214o14);
        EnumC0178c1 enumC0178c126 = new EnumC0178c1("BOOL_LIST", 25, 25, 2, enumC0214o15);
        EnumC0178c1 enumC0178c127 = new EnumC0178c1("STRING_LIST", 26, 26, 2, enumC0214o16);
        EnumC0178c1 enumC0178c128 = new EnumC0178c1("MESSAGE_LIST", 27, 27, 2, enumC0214o17);
        EnumC0178c1 enumC0178c129 = new EnumC0178c1("BYTES_LIST", 28, 28, 2, enumC0214o18);
        EnumC0178c1 enumC0178c130 = new EnumC0178c1("UINT32_LIST", 29, 29, 2, enumC0214o14);
        EnumC0178c1 enumC0178c131 = new EnumC0178c1("ENUM_LIST", 30, 30, 2, enumC0214o19);
        EnumC0178c1 enumC0178c132 = new EnumC0178c1("SFIXED32_LIST", 31, 31, 2, enumC0214o14);
        EnumC0178c1 enumC0178c133 = new EnumC0178c1("SFIXED64_LIST", 32, 32, 2, enumC0214o13);
        EnumC0178c1 enumC0178c134 = new EnumC0178c1("SINT32_LIST", 33, 33, 2, enumC0214o14);
        EnumC0178c1 enumC0178c135 = new EnumC0178c1("SINT64_LIST", 34, 34, 2, enumC0214o13);
        EnumC0178c1 enumC0178c136 = new EnumC0178c1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0214o1);
        f2731b = enumC0178c136;
        EnumC0178c1 enumC0178c137 = new EnumC0178c1("FLOAT_LIST_PACKED", 36, 36, 3, enumC0214o12);
        EnumC0178c1 enumC0178c138 = new EnumC0178c1("INT64_LIST_PACKED", 37, 37, 3, enumC0214o13);
        EnumC0178c1 enumC0178c139 = new EnumC0178c1("UINT64_LIST_PACKED", 38, 38, 3, enumC0214o13);
        EnumC0178c1 enumC0178c140 = new EnumC0178c1("INT32_LIST_PACKED", 39, 39, 3, enumC0214o14);
        EnumC0178c1 enumC0178c141 = new EnumC0178c1("FIXED64_LIST_PACKED", 40, 40, 3, enumC0214o13);
        EnumC0178c1 enumC0178c142 = new EnumC0178c1("FIXED32_LIST_PACKED", 41, 41, 3, enumC0214o14);
        EnumC0178c1 enumC0178c143 = new EnumC0178c1("BOOL_LIST_PACKED", 42, 42, 3, enumC0214o15);
        EnumC0178c1 enumC0178c144 = new EnumC0178c1("UINT32_LIST_PACKED", 43, 43, 3, enumC0214o14);
        EnumC0178c1 enumC0178c145 = new EnumC0178c1("ENUM_LIST_PACKED", 44, 44, 3, enumC0214o19);
        EnumC0178c1 enumC0178c146 = new EnumC0178c1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0214o14);
        EnumC0178c1 enumC0178c147 = new EnumC0178c1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0214o13);
        EnumC0178c1 enumC0178c148 = new EnumC0178c1("SINT32_LIST_PACKED", 47, 47, 3, enumC0214o14);
        EnumC0178c1 enumC0178c149 = new EnumC0178c1("SINT64_LIST_PACKED", 48, 48, 3, enumC0214o13);
        f2732c = enumC0178c149;
        f2734e = new EnumC0178c1[]{enumC0178c1, enumC0178c12, enumC0178c13, enumC0178c14, enumC0178c15, enumC0178c16, enumC0178c17, enumC0178c18, enumC0178c19, enumC0178c110, enumC0178c111, enumC0178c112, enumC0178c113, enumC0178c114, enumC0178c115, enumC0178c116, enumC0178c117, enumC0178c118, enumC0178c119, enumC0178c120, enumC0178c121, enumC0178c122, enumC0178c123, enumC0178c124, enumC0178c125, enumC0178c126, enumC0178c127, enumC0178c128, enumC0178c129, enumC0178c130, enumC0178c131, enumC0178c132, enumC0178c133, enumC0178c134, enumC0178c135, enumC0178c136, enumC0178c137, enumC0178c138, enumC0178c139, enumC0178c140, enumC0178c141, enumC0178c142, enumC0178c143, enumC0178c144, enumC0178c145, enumC0178c146, enumC0178c147, enumC0178c148, enumC0178c149, new EnumC0178c1("GROUP_LIST", 49, 49, 2, enumC0214o17), new EnumC0178c1("MAP", 50, 50, 4, EnumC0214o1.f2787a)};
        EnumC0178c1[] values = values();
        f2733d = new EnumC0178c1[values.length];
        for (EnumC0178c1 enumC0178c150 : values) {
            f2733d[enumC0178c150.f2735a] = enumC0178c150;
        }
    }

    public EnumC0178c1(String str, int i3, int i4, int i5, EnumC0214o1 enumC0214o1) {
        this.f2735a = i4;
        int i6 = i5 - 1;
        if (i6 == 1) {
            enumC0214o1.getClass();
        } else if (i6 == 3) {
            enumC0214o1.getClass();
        }
        if (i5 == 1) {
            EnumC0214o1 enumC0214o12 = EnumC0214o1.f2787a;
            enumC0214o1.ordinal();
        }
    }

    public static EnumC0178c1[] values() {
        return (EnumC0178c1[]) f2734e.clone();
    }
}
