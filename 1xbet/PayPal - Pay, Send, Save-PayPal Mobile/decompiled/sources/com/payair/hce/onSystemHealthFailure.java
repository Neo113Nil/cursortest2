package com.payair.hce;

/* loaded from: classes4.dex */
public final class onSystemHealthFailure {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int getAid = 1;
    private int valueOf = 3;
    private int DigitizedCardProfile = 3;
    private int writeReplace = 300000;
    private int values = 300000;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        return ((((i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) + (i2 * (-271))) + (((~(((~i2) | i4) | (~i3))) | (~((i | i2) | i3))) * (-272))) + (((~(i4 | i2)) | (~(i4 | i3))) * (-272))) + (((~(i | i3)) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE) != 1 ? writeReplace(objArr) : DigitizedCardProfile(objArr);
    }

    /* renamed from: com.payair.hce.onSystemHealthFailure$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] AlternateContactlessPaymentDataJson;
        private static int DigitizedCardProfile = 1;
        private static int values;

        static {
            int[] iArr = new int[com.payair.hce.setNewDefaultCardForContactlessPayments.values().length];
            AlternateContactlessPaymentDataJson = iArr;
            try {
                iArr[com.payair.hce.setNewDefaultCardForContactlessPayments.DigitizedCardProfile.ordinal()] = 1;
                int i = values;
                int i2 = i & 83;
                int i3 = -(-((i ^ 83) | i2));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                DigitizedCardProfile = i4 % 128;
                int i5 = i4 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                AlternateContactlessPaymentDataJson[com.payair.hce.setNewDefaultCardForContactlessPayments.values.ordinal()] = 2;
                int i6 = values;
                int i7 = ((i6 & (-72)) | ((~i6) & 71)) + ((i6 & 71) << 1);
                DigitizedCardProfile = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.onSystemHealthFailure onsystemhealthfailure = (com.payair.hce.onSystemHealthFailure) objArr[0];
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = (com.payair.hce.setNewDefaultCardForContactlessPayments) objArr[1];
        int i2 = getAid;
        int i3 = ((i2 | 105) << 1) - (i2 ^ 105);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = com.payair.hce.onSystemHealthFailure.AnonymousClass3.AlternateContactlessPaymentDataJson[setnewdefaultcardforcontactlesspayments.ordinal()];
            throw null;
        }
        int i5 = com.payair.hce.onSystemHealthFailure.AnonymousClass3.AlternateContactlessPaymentDataJson[setnewdefaultcardforcontactlesspayments.ordinal()];
        if (i5 == 1) {
            i = onsystemhealthfailure.valueOf;
            int i6 = getAid;
            int i7 = (i6 & 42) + (i6 | 42);
            AlternateContactlessPaymentDataJson = ((~i7) + (i7 << 1)) % 128;
        } else if (i5 != 2) {
            i = onsystemhealthfailure.valueOf;
            int i8 = AlternateContactlessPaymentDataJson;
            getAid = (((i8 | 15) << 1) - (i8 ^ 15)) % 128;
        } else {
            i = onsystemhealthfailure.DigitizedCardProfile;
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = (i9 & 106) + (i9 | 106);
            getAid = ((~i10) + (i10 << 1)) % 128;
        }
        return java.lang.Integer.valueOf(i);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        long currentTimeMillis;
        long j;
        com.payair.hce.onSystemHealthFailure onsystemhealthfailure = (com.payair.hce.onSystemHealthFailure) objArr[0];
        com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments = (com.payair.hce.setNewDefaultCardForContactlessPayments) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 9;
        int i3 = ((((i ^ 9) | i2) << 1) - (~(-((i | 9) & (~i2))))) - 1;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = com.payair.hce.onSystemHealthFailure.AnonymousClass3.AlternateContactlessPaymentDataJson[setnewdefaultcardforcontactlesspayments.ordinal()];
            throw null;
        }
        int i5 = com.payair.hce.onSystemHealthFailure.AnonymousClass3.AlternateContactlessPaymentDataJson[setnewdefaultcardforcontactlesspayments.ordinal()];
        if (i5 == 1) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - onsystemhealthfailure.values;
            int i6 = AlternateContactlessPaymentDataJson;
            int i7 = i6 & 79;
            int i8 = ((i6 ^ 79) | i7) << 1;
            int i9 = -((i6 | 79) & (~i7));
            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
            getAid = i10 % 128;
            if (i10 % 2 != 0) {
                return java.lang.Long.valueOf(currentTimeMillis2);
            }
            throw new java.lang.ArithmeticException();
        }
        if (i5 != 2) {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            j = onsystemhealthfailure.values;
            int i11 = getAid;
            int i12 = i11 ^ 53;
            int i13 = -(-((i11 & 53) << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            AlternateContactlessPaymentDataJson = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } else {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            j = onsystemhealthfailure.writeReplace;
            int i15 = AlternateContactlessPaymentDataJson;
            int i16 = i15 & 65;
            int i17 = ((i15 | 65) & (~i16)) + (i16 << 1);
            getAid = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        }
        return java.lang.Long.valueOf(currentTimeMillis - j);
    }

    public final long writeReplace(com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments) {
        return ((java.lang.Long) valueOf(new java.lang.Object[]{this, setnewdefaultcardforcontactlesspayments}, -99293849, 99293850, java.lang.System.identityHashCode(this))).longValue();
    }

    public final int AlternateContactlessPaymentDataJson(com.payair.hce.setNewDefaultCardForContactlessPayments setnewdefaultcardforcontactlesspayments) {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, setnewdefaultcardforcontactlesspayments}, -697877363, 697877363, java.lang.System.identityHashCode(this))).intValue();
    }
}
