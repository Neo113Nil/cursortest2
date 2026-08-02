package com.payair.hce;

/* loaded from: classes4.dex */
public final class sign {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getAid = 1;
    private com.payair.hce.MDESInstanceIDListenerService AlternateContactlessPaymentDataJson;
    private com.payair.hce.MDESInstanceIDListenerService DigitizedCardProfile;
    private byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private byte[] valueOf;
    private byte[] values;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (~i3) | i4;
        int i7 = (i * 483) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE) + (((~(i4 | i5)) | (~i6)) * (-241)) + ((i | i2) * (-482)) + (((~(i | i5)) | (~(i2 | i6))) * 241);
        if (i7 == 1) {
            com.payair.hce.sign signVar = (com.payair.hce.sign) objArr[0];
            int i8 = IccPrivateKeyCrtComponentsJson;
            getAid = (i8 + 105) % 128;
            byte[] bArr = signVar.values;
            int i9 = i8 & 27;
            int i10 = (i8 ^ 27) | i9;
            getAid = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            return bArr;
        }
        if (i7 == 2) {
            return values(objArr);
        }
        if (i7 != 3) {
            return valueOf(objArr);
        }
        com.payair.hce.sign signVar2 = (com.payair.hce.sign) objArr[0];
        int i11 = getAid;
        int i12 = i11 ^ 53;
        int i13 = ((i11 & 53) | i12) << 1;
        int i14 = -i12;
        IccPrivateKeyCrtComponentsJson = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        com.payair.hce.MDESInstanceIDListenerService mDESInstanceIDListenerService = signVar2.AlternateContactlessPaymentDataJson;
        int i15 = (i11 & 60) + (i11 | 60);
        IccPrivateKeyCrtComponentsJson = ((~i15) + (i15 << 1)) % 128;
        return mDESInstanceIDListenerService;
    }

    public sign(com.payair.hce.MDESInstanceIDListenerService mDESInstanceIDListenerService, com.payair.hce.MDESInstanceIDListenerService mDESInstanceIDListenerService2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.AlternateContactlessPaymentDataJson = mDESInstanceIDListenerService;
        this.DigitizedCardProfile = mDESInstanceIDListenerService2;
        this.valueOf = bArr;
        this.values = bArr2;
        this.writeReplace = bArr3;
        this.SdkCoreAlternateContactlessPaymentDataImpl = bArr4;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.sign signVar = (com.payair.hce.sign) objArr[0];
        int i = getAid + 97;
        IccPrivateKeyCrtComponentsJson = i % 128;
        byte[] bArr = signVar.valueOf;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.sign signVar = (com.payair.hce.sign) objArr[0];
        int i = getAid;
        int i2 = i & 73;
        int i3 = i2 + ((i ^ 73) | i2);
        int i4 = i3 % 128;
        IccPrivateKeyCrtComponentsJson = i4;
        byte[] bArr = signVar.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = i4 & 109;
        int i6 = (i4 ^ 109) | i5;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        getAid = i7 % 128;
        if (i7 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] DigitizedCardProfile() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 985989721, -985989721, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 89227428, -89227427, java.lang.System.identityHashCode(this));
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -918818020, 918818022, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.MDESInstanceIDListenerService writeReplace() {
        return (com.payair.hce.MDESInstanceIDListenerService) DigitizedCardProfile(new java.lang.Object[]{this}, 1749273454, -1749273451, java.lang.System.identityHashCode(this));
    }
}
