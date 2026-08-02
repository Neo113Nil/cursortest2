package com.google.re2j;

/* loaded from: classes9.dex */
class CharGroup {
    static final java.util.HashMap<java.lang.String, com.google.re2j.CharGroup> PERL_GROUPS;
    static final java.util.HashMap<java.lang.String, com.google.re2j.CharGroup> POSIX_GROUPS;
    private static final int[] code1;
    private static final int[] code10;
    private static final int[] code11;
    private static final int[] code12;
    private static final int[] code13;
    private static final int[] code14;
    private static final int[] code15;
    private static final int[] code16;
    private static final int[] code17;
    private static final int[] code2;
    private static final int[] code3;
    private static final int[] code4;
    private static final int[] code5;
    private static final int[] code6;
    private static final int[] code7;
    private static final int[] code8;
    private static final int[] code9;
    final int[] cls;
    final int sign;

    private CharGroup(int i, int[] iArr) {
        this.sign = i;
        this.cls = iArr;
    }

    static {
        int[] iArr = {48, 57};
        code1 = iArr;
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        code2 = iArr2;
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE};
        code3 = iArr3;
        java.util.HashMap<java.lang.String, com.google.re2j.CharGroup> hashMap = new java.util.HashMap<>();
        PERL_GROUPS = hashMap;
        hashMap.put("\\d", new com.google.re2j.CharGroup(1, iArr));
        hashMap.put("\\D", new com.google.re2j.CharGroup(-1, iArr));
        hashMap.put("\\s", new com.google.re2j.CharGroup(1, iArr2));
        hashMap.put("\\S", new com.google.re2j.CharGroup(-1, iArr2));
        hashMap.put("\\w", new com.google.re2j.CharGroup(1, iArr3));
        hashMap.put("\\W", new com.google.re2j.CharGroup(-1, iArr3));
        int[] iArr4 = {48, 57, 65, 90, 97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE};
        code4 = iArr4;
        int[] iArr5 = {65, 90, 97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE};
        code5 = iArr5;
        int[] iArr6 = {0, 127};
        code6 = iArr6;
        int[] iArr7 = {9, 9, 32, 32};
        code7 = iArr7;
        int[] iArr8 = {0, 31, 127, 127};
        code8 = iArr8;
        int[] iArr9 = {48, 57};
        code9 = iArr9;
        int[] iArr10 = {33, 126};
        code10 = iArr10;
        int[] iArr11 = {97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE};
        code11 = iArr11;
        int[] iArr12 = {32, 126};
        code12 = iArr12;
        int[] iArr13 = {33, 47, 58, 64, 91, 96, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 126};
        code13 = iArr13;
        int[] iArr14 = {9, 13, 32, 32};
        code14 = iArr14;
        int[] iArr15 = {65, 90};
        code15 = iArr15;
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE};
        code16 = iArr16;
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        code17 = iArr17;
        java.util.HashMap<java.lang.String, com.google.re2j.CharGroup> hashMap2 = new java.util.HashMap<>();
        POSIX_GROUPS = hashMap2;
        hashMap2.put("[:alnum:]", new com.google.re2j.CharGroup(1, iArr4));
        hashMap2.put("[:^alnum:]", new com.google.re2j.CharGroup(-1, iArr4));
        hashMap2.put("[:alpha:]", new com.google.re2j.CharGroup(1, iArr5));
        hashMap2.put("[:^alpha:]", new com.google.re2j.CharGroup(-1, iArr5));
        hashMap2.put("[:ascii:]", new com.google.re2j.CharGroup(1, iArr6));
        hashMap2.put("[:^ascii:]", new com.google.re2j.CharGroup(-1, iArr6));
        hashMap2.put("[:blank:]", new com.google.re2j.CharGroup(1, iArr7));
        hashMap2.put("[:^blank:]", new com.google.re2j.CharGroup(-1, iArr7));
        hashMap2.put("[:cntrl:]", new com.google.re2j.CharGroup(1, iArr8));
        hashMap2.put("[:^cntrl:]", new com.google.re2j.CharGroup(-1, iArr8));
        hashMap2.put("[:digit:]", new com.google.re2j.CharGroup(1, iArr9));
        hashMap2.put("[:^digit:]", new com.google.re2j.CharGroup(-1, iArr9));
        hashMap2.put("[:graph:]", new com.google.re2j.CharGroup(1, iArr10));
        hashMap2.put("[:^graph:]", new com.google.re2j.CharGroup(-1, iArr10));
        hashMap2.put("[:lower:]", new com.google.re2j.CharGroup(1, iArr11));
        hashMap2.put("[:^lower:]", new com.google.re2j.CharGroup(-1, iArr11));
        hashMap2.put("[:print:]", new com.google.re2j.CharGroup(1, iArr12));
        hashMap2.put("[:^print:]", new com.google.re2j.CharGroup(-1, iArr12));
        hashMap2.put("[:punct:]", new com.google.re2j.CharGroup(1, iArr13));
        hashMap2.put("[:^punct:]", new com.google.re2j.CharGroup(-1, iArr13));
        hashMap2.put("[:space:]", new com.google.re2j.CharGroup(1, iArr14));
        hashMap2.put("[:^space:]", new com.google.re2j.CharGroup(-1, iArr14));
        hashMap2.put("[:upper:]", new com.google.re2j.CharGroup(1, iArr15));
        hashMap2.put("[:^upper:]", new com.google.re2j.CharGroup(-1, iArr15));
        hashMap2.put("[:word:]", new com.google.re2j.CharGroup(1, iArr16));
        hashMap2.put("[:^word:]", new com.google.re2j.CharGroup(-1, iArr16));
        hashMap2.put("[:xdigit:]", new com.google.re2j.CharGroup(1, iArr17));
        hashMap2.put("[:^xdigit:]", new com.google.re2j.CharGroup(-1, iArr17));
    }
}
