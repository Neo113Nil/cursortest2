package com.payair.hce;

/* loaded from: classes4.dex */
public final class isMagstripeDataValid extends com.payair.hce.setMobilePinInitialConfiguration {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private com.payair.hce.transactionCanBeResumed values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (i * (-209)) + (i2 * (-209)) + ((~(i4 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i6)) | (~(i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4 | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
        return i7 != 1 ? i7 != 2 ? DigitizedCardProfile(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    public isMagstripeDataValid(byte[] bArr) throws com.payair.hce.digitize {
        super(bArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.isMagstripeDataValid ismagstripedatavalid = (com.payair.hce.isMagstripeDataValid) objArr[0];
        int i = valueOf;
        int i2 = (i & 57) + (i | 57);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            ismagstripedatavalid.values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(ismagstripedatavalid.getCvrMaskAnd());
            return null;
        }
        ismagstripedatavalid.values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(ismagstripedatavalid.getCvrMaskAnd());
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.isMagstripeDataValid ismagstripedatavalid = (com.payair.hce.isMagstripeDataValid) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (((i | 79) << 1) - (i ^ 79)) % 128;
        valueOf = i2;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = ismagstripedatavalid.values;
        int i3 = i2 + 83;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isMagstripeDataValid ismagstripedatavalid = (com.payair.hce.isMagstripeDataValid) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 25;
        int i3 = -(-((i ^ 25) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            super.values();
            com.payair.hce.onAuthenticationFailed.values(ismagstripedatavalid.values);
            return null;
        }
        super.values();
        com.payair.hce.onAuthenticationFailed.values(ismagstripedatavalid.values);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration, com.payair.hce.onIdentify
    public final void values() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1846243780, 1846243781, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        return (com.payair.hce.transactionCanBeResumed) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 272675787, -272675785, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration
    public final void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1537075615, -1537075615, java.lang.System.identityHashCode(this));
    }
}
