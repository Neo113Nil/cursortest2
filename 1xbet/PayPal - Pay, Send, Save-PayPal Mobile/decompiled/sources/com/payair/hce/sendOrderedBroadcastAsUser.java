package com.payair.hce;

/* loaded from: classes4.dex */
public final class sendOrderedBroadcastAsUser extends java.lang.Enum<com.payair.hce.sendOrderedBroadcastAsUser> {
    public static final int AlternateContactlessPaymentDataJson = 5;
    public static final int DigitizedCardProfile = 4;
    public static final int IccPrivateKeyCrtComponentsJson = 8;
    public static final int RecordsJson = 9;
    public static final int SdkCoreAlternateContactlessPaymentDataImpl = 10;
    public static final int getAid = 6;
    private static int getCvmResetTimeout = 1;
    public static final int getCvrMaskAnd = 12;
    public static final int getGpoResponse = 13;
    public static final int getPaymentFci = 11;
    public static final int getProfileVersion = 7;
    public static final int valueOf = 3;
    public static final int values = 2;
    public static final int writeReplace = 1;
    private static final /* synthetic */ int[] SdkCoreBusinessLogicModuleImpl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private static int getCiacDecline = 64;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    static {
        int i = 64 % 2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = getCvmResetTimeout;
        int i2 = ((i ^ 33) | (i & 33)) << 1;
        int i3 = -((i & (-34)) | ((~i) & 33));
        getCiacDecline = ((i2 & i3) + (i3 | i2)) % 128;
        int[] iArr = (int[]) SdkCoreBusinessLogicModuleImpl.clone();
        int i4 = getCiacDecline;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        getCvmResetTimeout = i5 % 128;
        if (i5 % 2 != 0) {
            return iArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public static int[] DigitizedCardProfile() {
        return (int[]) AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1427773450, -1427773450, (int) java.lang.System.currentTimeMillis());
    }
}
