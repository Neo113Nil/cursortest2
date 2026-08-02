package com.payair.hce;

/* loaded from: classes4.dex */
public class deleteFile {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY)
    private java.lang.String values;
    private com.payair.hce.checkPermission writeReplace = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    public deleteFile() {
    }

    public deleteFile(java.lang.String str) {
        this.values = str;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.deleteFile deletefile = (com.payair.hce.deleteFile) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = -(-(i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
        DigitizedCardProfile = ((i2 & i3) + (i2 | i3)) % 128;
        java.lang.String str = deletefile.values;
        int i4 = i & 51;
        int i5 = ((i ^ 51) | i4) << 1;
        int i6 = -((i | 51) & (~i4));
        int i7 = (i5 & i6) + (i6 | i5);
        DigitizedCardProfile = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, -350567645, 350567645, java.lang.System.identityHashCode(this));
    }
}
