package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAckAlwaysRequiredIfCurrencyProvided extends com.payair.hce.setMobilePinInitialConfiguration {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (((i4 ^ 78) + ((i4 & 78) << 1)) - 1) % 128;
        return null;
    }

    static {
        com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -125);
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 83) | (i & 83)) << 1;
        int i3 = -((i & (-84)) | ((~i) & 83));
        AlternateContactlessPaymentDataJson = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }

    public setAckAlwaysRequiredIfCurrencyProvided(byte[] bArr) throws com.payair.hce.digitize {
        super(bArr);
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration
    public final void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile(new java.lang.Object[]{this}, -1427042879, 1427042879, java.lang.System.identityHashCode(this));
    }
}
