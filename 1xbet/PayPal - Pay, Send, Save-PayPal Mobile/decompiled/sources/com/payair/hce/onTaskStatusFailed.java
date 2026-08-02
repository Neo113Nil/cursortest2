package com.payair.hce;

/* loaded from: classes4.dex */
public final class onTaskStatusFailed {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int getAid;
    private final int values = 3;
    private final int DigitizedCardProfile = 3;
    private final int AlternateContactlessPaymentDataJson = 300000;
    private final int writeReplace = 300000;
    private com.payair.hce.onSystemHealthFailure valueOf = new com.payair.hce.onSystemHealthFailure();

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onTaskStatusFailed ontaskstatusfailed = (com.payair.hce.onTaskStatusFailed) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        getAid = i2 % 128;
        com.payair.hce.onSystemHealthFailure onsystemhealthfailure = ontaskstatusfailed.valueOf;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i & 51;
        int i4 = (((i | 51) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        getAid = i4 % 128;
        if (i4 % 2 == 0) {
            return onsystemhealthfailure;
        }
        throw null;
    }

    public final com.payair.hce.onSystemHealthFailure DigitizedCardProfile() {
        return (com.payair.hce.onSystemHealthFailure) valueOf(new java.lang.Object[]{this}, 98491756, -98491756, java.lang.System.identityHashCode(this));
    }
}
