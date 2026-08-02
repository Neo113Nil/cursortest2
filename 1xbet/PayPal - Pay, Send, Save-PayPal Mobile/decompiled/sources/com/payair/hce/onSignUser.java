package com.payair.hce;

/* loaded from: classes4.dex */
public enum onSignUser {
    ;

    private static int valueOf = 61;
    private static int writeReplace;

    static {
        int i = 61 % 2;
    }

    public static com.payair.hce.onSignUser valueOf(java.lang.String str) {
        writeReplace = (valueOf + 105) % 128;
        com.payair.hce.onSignUser onsignuser = (com.payair.hce.onSignUser) java.lang.Enum.valueOf(com.payair.hce.onSignUser.class, str);
        int i = valueOf;
        int i2 = i | 11;
        int i3 = i2 << 1;
        int i4 = -((~(i & 11)) & i2);
        writeReplace = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        return onsignuser;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.payair.hce.onSignUser[] valuesCustom() {
        int i = writeReplace;
        int i2 = (-2) - (~(((i | 84) << 1) - (i ^ 84)));
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.onSignUser[] onsignuserArr = (com.payair.hce.onSignUser[]) values().clone();
        int i3 = writeReplace;
        int i4 = ((i3 ^ 70) + ((i3 & 70) << 1)) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return onsignuserArr;
        }
        throw null;
    }

    public static long AlternateContactlessPaymentDataJson(byte[] bArr) {
        int i = valueOf;
        int i2 = ((i & 39) - (~(-(-(i | 39))))) - 1;
        writeReplace = i2 % 128;
        java.lang.String writeReplace2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr).writeReplace();
        if (i2 % 2 != 0) {
            java.lang.Long.parseLong(writeReplace2);
            throw new java.lang.ArithmeticException();
        }
        long parseLong = java.lang.Long.parseLong(writeReplace2);
        int i3 = writeReplace;
        int i4 = i3 & 37;
        int i5 = i4 + ((i3 ^ 37) | i4);
        valueOf = i5 % 128;
        if (i5 % 2 != 0) {
            return parseLong;
        }
        throw null;
    }
}
