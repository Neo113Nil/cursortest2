package com.payair.hce;

/* loaded from: classes4.dex */
public final class setVelocityScale {
    private static int valueOf = 0;
    private static final byte[] writeReplace = {105, -122};
    private static final byte[] DigitizedCardProfile = {111, 0};
    private static int values = 85;

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = (i ^ 78) + ((i & 78) << 1);
        int i3 = (~i2) + (i2 << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        byte[] bArr = DigitizedCardProfile;
        int i4 = ((i ^ 73) | (i & 73)) << 1;
        int i5 = -((i & (-74)) | ((~i) & 73));
        values = ((i4 & i5) + (i5 | i4)) % 128;
        return bArr;
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        if ((i * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + (i2 * (-987)) + (((~(i4 | i5 | i)) | (~(i | i2 | i3))) * 988) + ((i | i4) * (-988)) + (((~((~i) | i4)) | (~(i3 | i4)) | (~(i2 | i5 | i))) * 988) != 1) {
            return values(objArr);
        }
        int i6 = valueOf;
        int i7 = i6 ^ 21;
        int i8 = ((i6 & 21) | i7) << 1;
        int i9 = -i7;
        values = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        byte[] bArr = writeReplace;
        values = ((-2) - (~((i6 & 102) + (i6 | 102)))) % 128;
        return bArr;
    }

    public static final /* synthetic */ byte[] DigitizedCardProfile() {
        return (byte[]) writeReplace(new java.lang.Object[0], 1990872266, -1990872265, (int) java.lang.System.currentTimeMillis());
    }

    public static final /* synthetic */ byte[] values() {
        return (byte[]) writeReplace(new java.lang.Object[0], 1392842242, -1392842242, (int) java.lang.System.currentTimeMillis());
    }
}
