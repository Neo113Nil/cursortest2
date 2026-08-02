package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCiacDeclineOnPpms extends com.payair.hce.getRequiredTypeConverters<com.payair.hce.transactionCanBeResumed> implements com.payair.hce.onIdentify {
    private static int valueOf = 1;
    private static final com.payair.hce.transactionCanBeResumed values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 16});
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE) + (i2 * (-219)) + (((~((~i) | (~i2))) | (~(i4 | i | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i4 | i2)) | i) * (-440)) + ((i | i2 | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        return i5 != 1 ? i5 != 2 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr);
    }

    static {
        int i = valueOf;
        int i2 = i & 45;
        writeReplace = (i2 + ((i ^ 45) | i2)) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setCiacDeclineOnPpms(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        this.DigitizedCardProfile = transactioncanberesumed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setCiacDeclineOnPpms setciacdeclineonppms = (com.payair.hce.setCiacDeclineOnPpms) objArr[0];
        int i = writeReplace;
        int i2 = ((i & 38) + (i | 38)) - 1;
        valueOf = i2 % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) setciacdeclineonppms.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = writeReplace + 57;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(values, com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((com.payair.hce.transactionCanBeResumed) ((com.payair.hce.setCiacDeclineOnPpms) objArr[0]).DigitizedCardProfile));
        int i = writeReplace + 125;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return getwalletidentificationdataprovider;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i & 63;
        int i3 = -(-((i ^ 63) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.onIdentify
    public final void values() {
        DigitizedCardProfile(new java.lang.Object[]{this}, -989205188, 989205190, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getWalletIdentificationDataProvider writeReplace() throws com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate, com.payair.hce.createDemoTransactionCredentials {
        return (com.payair.hce.getWalletIdentificationDataProvider) DigitizedCardProfile(new java.lang.Object[]{this}, -493169071, 493169072, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson() throws com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate, com.payair.hce.createDemoTransactionCredentials {
        return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{this}, -1794069927, 1794069927, java.lang.System.identityHashCode(this));
    }
}
