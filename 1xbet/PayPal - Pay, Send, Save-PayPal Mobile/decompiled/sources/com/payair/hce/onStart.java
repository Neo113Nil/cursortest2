package com.payair.hce;

/* loaded from: classes4.dex */
final class onStart extends java.lang.Enum<com.payair.hce.onStart> {
    public static final int AlternateContactlessPaymentDataJson = 3;
    private static int IccPrivateKeyCrtComponentsJson = 0;
    public static final int valueOf = 4;
    public static final int values = 1;
    public static final int writeReplace = 2;
    private static final /* synthetic */ int[] DigitizedCardProfile = {1, 2, 3, 4};
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 51;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = IccPrivateKeyCrtComponentsJson ^ 49;
        SdkCoreAlternateContactlessPaymentDataImpl = (((((r0 & 49) | i4) << 1) - (~(-i4))) - 1) % 128;
        int[] iArr = (int[]) DigitizedCardProfile.clone();
        int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i6 = i5 ^ 93;
        int i7 = ((i5 & 93) | i6) << 1;
        int i8 = -i6;
        IccPrivateKeyCrtComponentsJson = ((i7 & i8) + (i7 | i8)) % 128;
        return iArr;
    }

    public static int[] valueOf() {
        return (int[]) DigitizedCardProfile(new java.lang.Object[0], -1223881772, 1223881772, (int) java.lang.System.currentTimeMillis());
    }
}
