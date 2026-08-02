package com.payair.hce;

/* loaded from: classes4.dex */
public enum onAuthenticationFailed {
    ;

    private static int DigitizedCardProfile = 1;
    private static int valueOf = 100;

    public static com.payair.hce.onAuthenticationFailed valueOf(java.lang.String str) {
        int i = DigitizedCardProfile & 89;
        valueOf = ((((r0 | 89) & (~i)) - (~(i << 1))) - 1) % 128;
        com.payair.hce.onAuthenticationFailed onauthenticationfailed = (com.payair.hce.onAuthenticationFailed) java.lang.Enum.valueOf(com.payair.hce.onAuthenticationFailed.class, str);
        int i2 = DigitizedCardProfile;
        valueOf = ((-2) - (~((i2 ^ 4) + ((i2 & 4) << 1)))) % 128;
        return onauthenticationfailed;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.payair.hce.onAuthenticationFailed[] valuesCustom() {
        int i = (-2) - (~(DigitizedCardProfile + 22));
        valueOf = i % 128;
        com.payair.hce.onAuthenticationFailed[] valuesCustom = values();
        if (i % 2 == 0) {
            return (com.payair.hce.onAuthenticationFailed[]) valuesCustom.clone();
        }
        throw new java.lang.ArithmeticException();
    }

    public static void writeReplace(byte[] bArr) {
        int i = valueOf;
        DigitizedCardProfile = (((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)) - 1) % 128;
        if (bArr == null) {
            DigitizedCardProfile = ((i & 11) + (i | 11)) % 128;
            return;
        }
        int length = bArr.length;
        int i2 = i & 25;
        DigitizedCardProfile = ((((i | 25) & (~i2)) - (~(i2 << 1))) - 1) % 128;
        int i3 = 0;
        while (i3 < length) {
            int i4 = valueOf;
            int i5 = i4 & 11;
            int i6 = -(-((i4 ^ 11) | i5));
            int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 == 0) {
                bArr[i3] = 0;
                i3 += 55;
            } else {
                bArr[i3] = 0;
                i3 = ((i3 | 1) << 1) - (i3 ^ 1);
            }
            DigitizedCardProfile = (i4 + 13) % 128;
        }
        int i8 = DigitizedCardProfile;
        int i9 = i8 & 57;
        int i10 = ((((i8 ^ 57) | i9) << 1) - (~(-((i8 | 57) & (~i9))))) - 1;
        valueOf = i10 % 128;
        if (i10 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public static void values(com.payair.hce.onIdentify onidentify) {
        int i = valueOf;
        int i2 = (((i | 24) << 1) - (i ^ 24)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (onidentify != null) {
            onidentify.values();
            int i3 = DigitizedCardProfile;
            int i4 = i3 & 91;
            valueOf = (((i3 | 91) & (~i4)) + (i4 << 1)) % 128;
        }
        valueOf = (DigitizedCardProfile + 105) % 128;
    }
}
