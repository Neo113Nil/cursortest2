package com.payair.hce;

/* loaded from: classes4.dex */
final class setTop implements com.payair.hce.updateRNSInformation {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i5 | i;
        int i7 = (i * 1773) + (i2 * (-885)) + (((~(i3 | i4)) | (~((~i) | i4)) | (~(i6 | i2))) * 886) + ((i | (~(i2 | i5))) * (-1772)) + ((~i6) * 886);
        return i7 != 1 ? i7 != 2 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr) : values(objArr);
    }

    setTop() {
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 37) << 1) - (i ^ 37);
        DigitizedCardProfile = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr2 = new java.lang.Object[0];
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i3 == 0) {
            throw null;
        }
        byte[] bArr = (byte[]) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(objArr2, -707962006, 707962028, (int) currentTimeMillis);
        int i4 = DigitizedCardProfile;
        int i5 = (i4 ^ 92) + ((i4 & 92) << 1);
        AlternateContactlessPaymentDataJson = ((~i5) + (i5 << 1)) % 128;
        return bArr;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (((i & (-22)) | ((~i) & 21)) - (~((i & 21) << 1))) - 1;
        DigitizedCardProfile = i2 % 128;
        java.lang.Object[] objArr2 = new java.lang.Object[0];
        int i3 = i2 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i3 != 0) {
            return (byte[]) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(objArr2, 897594783, -897594768, (int) currentTimeMillis);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 81;
        int i3 = (i | 81) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        DigitizedCardProfile = i5 % 128;
        java.lang.Object[] objArr2 = new java.lang.Object[0];
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.accessperformEnroll accessperformenroll = (com.payair.hce.accessperformEnroll) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(objArr2, 650354721, -650354718, (int) java.lang.System.currentTimeMillis());
        int i6 = AlternateContactlessPaymentDataJson;
        int i7 = (i6 & (-106)) | ((~i6) & 105);
        int i8 = (i6 & 105) << 1;
        DigitizedCardProfile = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        return accessperformenroll;
    }

    @Override // com.payair.hce.updateRNSInformation
    public final com.payair.hce.accessperformEnroll values() {
        return (com.payair.hce.accessperformEnroll) DigitizedCardProfile(new java.lang.Object[]{this}, 27704725, -27704725, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.updateRNSInformation
    public final byte[] writeReplace() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -88270805, 88270806, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.updateRNSInformation
    public final byte[] AlternateContactlessPaymentDataJson() {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -340290008, 340290010, java.lang.System.identityHashCode(this));
    }
}
