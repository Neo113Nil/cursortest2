package com.payair.hce;

/* loaded from: classes4.dex */
final class setScrollX implements android.content.ComponentCallbacks2 {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = (i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 == 2) {
            return null;
        }
        int i8 = values;
        int i9 = i8 & 51;
        int i10 = ((i8 ^ 51) | i9) << 1;
        int i11 = -((i8 | 51) & (~i9));
        DigitizedCardProfile = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
        return null;
    }

    setScrollX() {
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = values;
        int i2 = i & 53;
        int i3 = i2 + ((i ^ 53) | i2);
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        if (i3 % 2 == 0 ? intValue == 20 : intValue == 72) {
            values = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1425763148, -1425763113, (int) java.lang.System.currentTimeMillis());
            com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -357522574, 357522603, (int) java.lang.System.currentTimeMillis());
            int i5 = DigitizedCardProfile;
            int i6 = i5 & 93;
            int i7 = -(-((i5 ^ 93) | i6));
            values = ((i6 & i7) + (i7 | i6)) % 128;
        }
        int i8 = DigitizedCardProfile + 81;
        values = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        DigitizedCardProfile(new java.lang.Object[]{this}, 2048012245, -2048012245, java.lang.System.identityHashCode(this));
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        DigitizedCardProfile(new java.lang.Object[]{this, configuration}, 871446117, -871446115, java.lang.System.identityHashCode(this));
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1991605356, -1991605355, i);
    }
}
