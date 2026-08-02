package com.payair.hce;

/* loaded from: classes4.dex */
public final class ignoreFailedTransaction {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private final com.payair.hce.setPinIvCvc3Track2 AlternateContactlessPaymentDataJson = com.payair.hce.setMaximumPinTry.valueOf();
    private int DigitizedCardProfile;
    private final long getAid;
    private java.util.Timer getProfileVersion;
    private final com.payair.hce.ignoreFailedTransaction.values valueOf;
    private int values;
    private final java.lang.String writeReplace;

    public interface values {
        void writeReplace();
    }

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        int i6 = (i * 624) + (i2 * (-622)) + ((~(i5 | i3)) * 623) + (((~(i2 | (~i))) | (~i3)) * (-623)) + (((~(i | i3)) | (~i5) | (~(i3 | i4))) * 623);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 == 2) {
            return values(objArr);
        }
        if (i6 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 4) {
            return valueOf(objArr);
        }
        if (i6 != 5) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int i7 = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i7 & (-112)) | ((~i7) & 111)) + ((i7 & 111) << 1)) % 128;
        com.payair.hce.ignoreFailedTransaction.values valuesVar = ignorefailedtransaction.valueOf;
        SdkCoreAlternateContactlessPaymentDataImpl = (((i7 ^ 39) - (~(-(-((i7 & 39) << 1))))) - 1) % 128;
        return valuesVar;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 33) | (i & 33)) << 1;
        int i3 = -((i & (-34)) | ((~i) & 33));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        ignorefailedtransaction.values = intValue;
        if (i4 % 2 == 0) {
            return java.lang.Integer.valueOf(intValue);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 1) + ((i & 1) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        int i3 = ignorefailedtransaction.values;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson + 25;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return java.lang.Long.valueOf(ignorefailedtransaction.getAid);
        }
        long j = ignorefailedtransaction.getAid;
        throw null;
    }

    public ignoreFailedTransaction(java.lang.String str, int i, long j, com.payair.hce.ignoreFailedTransaction.values valuesVar) {
        this.writeReplace = str;
        this.DigitizedCardProfile = i;
        this.valueOf = valuesVar;
        this.getAid = j;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 111;
        int i3 = ((i ^ 111) | i2) << 1;
        int i4 = -((~i2) & (i | 111));
        SdkCoreAlternateContactlessPaymentDataImpl = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        java.util.Timer timer = ignorefailedtransaction.getProfileVersion;
        if (timer != null) {
            int i5 = ((i | 9) << 1) - (i ^ 9);
            SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
            if (i5 % 2 == 0) {
                timer.cancel();
            } else {
                timer.cancel();
                throw null;
            }
        }
        java.util.Timer timer2 = new java.util.Timer();
        ignorefailedtransaction.getProfileVersion = timer2;
        ignorefailedtransaction.values = ignorefailedtransaction.DigitizedCardProfile;
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.payair.hce.ignoreFailedTransaction.2
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i6, int i7, int i8) {
                com.payair.hce.ignoreFailedTransaction.AnonymousClass2 anonymousClass2 = (com.payair.hce.ignoreFailedTransaction.AnonymousClass2) objArr2[0];
                int i9 = AlternateContactlessPaymentDataJson;
                values = (((i9 & (-24)) | ((~i9) & 23)) + ((i9 & 23) << 1)) % 128;
                com.payair.hce.ignoreFailedTransaction ignorefailedtransaction2 = com.payair.hce.ignoreFailedTransaction.this;
                int intValue = (int) (((java.lang.Integer) com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction2}, -1483443037, 1483443041, (int) java.lang.System.currentTimeMillis())).intValue() - ((java.lang.Long) com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{com.payair.hce.ignoreFailedTransaction.this}, -597512414, 597512416, (int) java.lang.System.currentTimeMillis())).longValue());
                if (((java.lang.Integer) com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{com.payair.hce.ignoreFailedTransaction.this}, -1483443037, 1483443041, (int) java.lang.System.currentTimeMillis())).intValue() <= 0) {
                    int i10 = AlternateContactlessPaymentDataJson;
                    int i11 = i10 & 81;
                    int i12 = -(-((i10 ^ 81) | i11));
                    values = ((i11 & i12) + (i12 | i11)) % 128;
                    if (((com.payair.hce.ignoreFailedTransaction.values) com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{com.payair.hce.ignoreFailedTransaction.this}, -1494086044, 1494086049, (int) java.lang.System.currentTimeMillis())) != null) {
                        int i13 = AlternateContactlessPaymentDataJson;
                        int i14 = i13 & 21;
                        int i15 = (i13 | 21) & (~i14);
                        int i16 = i14 << 1;
                        values = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
                        ((com.payair.hce.ignoreFailedTransaction.values) com.payair.hce.ignoreFailedTransaction.AlternateContactlessPaymentDataJson(new java.lang.Object[]{com.payair.hce.ignoreFailedTransaction.this}, -1494086044, 1494086049, (int) java.lang.System.currentTimeMillis())).writeReplace();
                        anonymousClass2.cancel();
                        int i17 = AlternateContactlessPaymentDataJson;
                        int i18 = i17 & 99;
                        int i19 = i18 + ((i17 ^ 99) | i18);
                        values = i19 % 128;
                        if (i19 % 2 == 0) {
                            int i20 = 5 / 3;
                        }
                    }
                }
                int i21 = values;
                int i22 = i21 & 113;
                int i23 = (i21 ^ 113) | i22;
                AlternateContactlessPaymentDataJson = ((i22 & i23) + (i23 | i22)) % 128;
                return null;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                valueOf(new java.lang.Object[]{this}, -1900210308, 1900210308, java.lang.System.identityHashCode(this));
            }
        };
        long j = ignorefailedtransaction.getAid;
        timer2.scheduleAtFixedRate(timerTask, j, j);
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 83) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.ignoreFailedTransaction ignorefailedtransaction = (com.payair.hce.ignoreFailedTransaction) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 71) | (i & 71)) << 1;
        int i3 = -((i & (-72)) | ((~i) & 71));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        java.util.Timer timer = ignorefailedtransaction.getProfileVersion;
        if (timer != null) {
            int i5 = (i4 & (-70)) | ((~i4) & 69);
            int i6 = -(-((i4 & 69) << 1));
            IccPrivateKeyCrtComponentsJson = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
            timer.cancel();
            int i7 = SdkCoreAlternateContactlessPaymentDataImpl;
            IccPrivateKeyCrtComponentsJson = (((i7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) - (~(-(-((i7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1))))) - 1) % 128;
        }
        int i8 = SdkCoreAlternateContactlessPaymentDataImpl + 9;
        IccPrivateKeyCrtComponentsJson = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static /* synthetic */ com.payair.hce.ignoreFailedTransaction.values AlternateContactlessPaymentDataJson(com.payair.hce.ignoreFailedTransaction ignorefailedtransaction) {
        return (com.payair.hce.ignoreFailedTransaction.values) AlternateContactlessPaymentDataJson(new java.lang.Object[]{ignorefailedtransaction}, -1494086044, 1494086049, (int) java.lang.System.currentTimeMillis());
    }

    public final void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1658163184, -1658163183, java.lang.System.identityHashCode(this));
    }

    public final void values() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1024361596, -1024361596, java.lang.System.identityHashCode(this));
    }
}
