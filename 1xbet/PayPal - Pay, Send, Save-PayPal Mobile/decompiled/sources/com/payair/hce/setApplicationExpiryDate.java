package com.payair.hce;

/* loaded from: classes4.dex */
public final class setApplicationExpiryDate extends java.lang.Enum<com.payair.hce.setApplicationExpiryDate> {
    public static final int AlternateContactlessPaymentDataJson = 4;
    public static final int DigitizedCardProfile = 2;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    public static final int getProfileVersion = 6;
    public static final int valueOf = 1;
    public static final int values = 3;
    public static final int writeReplace = 5;
    private static final /* synthetic */ int[] RecordsJson = {1, 2, 3, 4, 5, 6};
    private static int IccPrivateKeyCrtComponentsJson = 119;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = IccPrivateKeyCrtComponentsJson + 66;
        int i2 = (~i) + (i << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = (int[]) RecordsJson.clone();
        if (i3 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 101;
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            return iArr;
        }
        throw null;
    }

    public static int[] DigitizedCardProfile() {
        return (int[]) AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1972704579, -1972704579, (int) java.lang.System.currentTimeMillis());
    }
}
