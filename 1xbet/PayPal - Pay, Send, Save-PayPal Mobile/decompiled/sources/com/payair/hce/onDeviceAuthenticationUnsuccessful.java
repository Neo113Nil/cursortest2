package com.payair.hce;

/* loaded from: classes4.dex */
public final class onDeviceAuthenticationUnsuccessful {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;
    private byte[] DigitizedCardProfile;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = i | i2;
        int i8 = ~(i2 | i6);
        int i9 = (i * 85) + (i2 * 85) + (((~(i4 | i6)) | (~(i4 | i5)) | (~(i5 | i6)) | (~(i7 | i3))) * (-84)) + ((i | (~(i3 | i5)) | i8) * (-84)) + (((~i7) | i8) * 84);
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? values(objArr) : DigitizedCardProfile(objArr) : valueOf(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = (com.payair.hce.onDeviceAuthenticationUnsuccessful) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (((i ^ 78) + ((i & 78) << 1)) - 1) % 128;
        values = i2;
        byte[] bArr = ondeviceauthenticationunsuccessful.writeReplace;
        int i3 = i2 & 101;
        int i4 = (i3 - (~((i2 ^ 101) | i3))) - 1;
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = (com.payair.hce.onDeviceAuthenticationUnsuccessful) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 103;
        int i3 = ((i2 << 1) - (~(-((~(i & 103)) & i2)))) - 1;
        int i4 = i3 % 128;
        values = i4;
        if (i3 % 2 != 0) {
            ondeviceauthenticationunsuccessful.writeReplace = bArr;
            int i5 = i4 & 47;
            int i6 = -(-((i4 ^ 47) | i5));
            int i7 = (i5 & i6) + (i5 | i6);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }
        ondeviceauthenticationunsuccessful.writeReplace = bArr;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = (com.payair.hce.onDeviceAuthenticationUnsuccessful) objArr[0];
        int i = values;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        AlternateContactlessPaymentDataJson = i2 % 128;
        byte[] bArr = ondeviceauthenticationunsuccessful.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = (com.payair.hce.onDeviceAuthenticationUnsuccessful) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 49;
        int i3 = -(-((i ^ 49) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        values = i4 % 128;
        if (i4 % 2 != 0) {
            ondeviceauthenticationunsuccessful.DigitizedCardProfile = bArr;
            return null;
        }
        ondeviceauthenticationunsuccessful.DigitizedCardProfile = bArr;
        throw new java.lang.ArithmeticException();
    }

    public final void values(byte[] bArr) {
        writeReplace(new java.lang.Object[]{this, bArr}, 318470703, -318470702, java.lang.System.identityHashCode(this));
    }

    public final byte[] writeReplace() {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, 113848216, -113848214, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(byte[] bArr) {
        writeReplace(new java.lang.Object[]{this, bArr}, 1804796914, -1804796911, java.lang.System.identityHashCode(this));
    }

    public final byte[] valueOf() {
        return (byte[]) writeReplace(new java.lang.Object[]{this}, -830821527, 830821527, java.lang.System.identityHashCode(this));
    }
}
