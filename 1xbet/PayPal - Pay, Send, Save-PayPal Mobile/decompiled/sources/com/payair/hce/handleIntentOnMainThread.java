package com.payair.hce;

/* loaded from: classes4.dex */
public final class handleIntentOnMainThread {
    private static int AlternateContactlessPaymentDataJson = 4096;
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + (i2 * (-987)) + (((~(i4 | i5 | i)) | (~(i | i2 | i3))) * 988) + ((i | i4) * (-988)) + (((~((~i) | i4)) | (~(i3 | i4)) | (~(i2 | i5 | i))) * 988);
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? valueOf(objArr) : DigitizedCardProfile(objArr) : values(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, byteArrayOutputStream}, 1640709036, -1640709034, (int) java.lang.System.currentTimeMillis());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = writeReplace;
        int i2 = i & 91;
        int i3 = ((i | 91) & (~i2)) + (i2 << 1);
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return byteArray;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i = valueOf + 95;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            int length = bArr.length;
            throw null;
        }
        int length2 = bArr.length;
        int intValue = ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, bArr, java.lang.Integer.valueOf(length2)}, -1684194604, 1684194604, length2)).intValue();
        writeReplace = (valueOf + 49) % 128;
        return java.lang.Integer.valueOf(intValue);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = 0;
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i2 = (valueOf + 73) % 128;
        writeReplace = i2;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = i3 << 1;
        valueOf = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
        while (i < intValue) {
            int i6 = valueOf;
            writeReplace = (((i6 | 65) << 1) - ((i6 & (-66)) | ((~i6) & 65))) % 128;
            int i7 = -i;
            int i8 = intValue & i7;
            int read = inputStream.read(bArr, i, ((((i7 ^ intValue) | i8) << 1) - (~(-((i7 | intValue) & (~i8))))) - 1);
            if (read < 0) {
                break;
            }
            int i9 = valueOf;
            int i10 = (((i9 & (-64)) | ((~i9) & 63)) + ((i9 & 63) << 1)) % 128;
            writeReplace = i10;
            int i11 = i & read;
            int i12 = (i | read) & (~i11);
            int i13 = -(-(i11 << 1));
            i = (i12 ^ i13) + ((i12 & i13) << 1);
            valueOf = (i10 + 43) % 128;
        }
        int i14 = writeReplace;
        int i15 = (i14 & (-52)) | ((~i14) & 51);
        int i16 = (i14 & 51) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        valueOf = i17 % 128;
        if (i17 % 2 == 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        java.io.OutputStream outputStream = (java.io.OutputStream) objArr[1];
        int i = valueOf;
        int i2 = (i ^ 69) + ((i & 69) << 1);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = AlternateContactlessPaymentDataJson;
            byte[] bArr = new byte[i3];
            writeReplace = ((((i | 62) << 1) - (i ^ 62)) - 1) % 128;
            while (true) {
                int read = inputStream.read(bArr, 0, i3);
                if (read < 0) {
                    int i4 = writeReplace;
                    int i5 = i4 & 117;
                    int i6 = -(-(i4 | 117));
                    valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                    return null;
                }
                int i7 = writeReplace;
                int i8 = i7 & 79;
                int i9 = (i7 | 79) & (~i8);
                int i10 = -(-(i8 << 1));
                int i11 = (i9 & i10) + (i9 | i10);
                valueOf = i11 % 128;
                if (i11 % 2 != 0) {
                    outputStream.write(bArr, 1, read);
                } else {
                    outputStream.write(bArr, 0, read);
                }
                int i12 = writeReplace;
                int i13 = (i12 & 27) + (i12 | 27);
                valueOf = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 5;
                }
            }
        } else {
            byte[] bArr2 = new byte[AlternateContactlessPaymentDataJson];
            throw null;
        }
    }

    private static void writeReplace(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, outputStream}, 1640709036, -1640709034, (int) java.lang.System.currentTimeMillis());
    }

    private static int valueOf(java.io.InputStream inputStream, byte[] bArr, int i) throws java.io.IOException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, bArr, java.lang.Integer.valueOf(i)}, -1684194604, 1684194604, i)).intValue();
    }

    public static int values(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream, bArr}, -2008715526, 2008715529, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    public static byte[] DigitizedCardProfile(java.io.InputStream inputStream) throws java.io.IOException {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{inputStream}, -2019374468, 2019374469, (int) java.lang.System.currentTimeMillis());
    }
}
