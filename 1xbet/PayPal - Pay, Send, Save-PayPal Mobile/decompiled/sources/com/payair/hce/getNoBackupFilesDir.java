package com.payair.hce;

/* loaded from: classes4.dex */
public final class getNoBackupFilesDir extends com.payair.hce.deleteFile {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionCredentialsStatus")
    private com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i4 | i3);
        int i6 = ~i2;
        int i7 = ~i3;
        if ((i * 141) + (i2 * (-139)) + (((~(i4 | i2)) | i5) * (-280)) + ((i5 | (~(i6 | i3))) * 140) + (((~(i | i7 | i6)) | (~(i2 | i4 | i7)) | (~(i3 | i4 | i6))) * 140) != 1) {
            com.payair.hce.getNoBackupFilesDir getnobackupfilesdir = (com.payair.hce.getNoBackupFilesDir) objArr[0];
            int i8 = AlternateContactlessPaymentDataJson;
            valueOf = (i8 + 85) % 128;
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr = getnobackupfilesdir.DigitizedCardProfile;
            valueOf = ((-2) - (~(i8 + 22))) % 128;
            return singleUseKeyStatusArr;
        }
        com.payair.hce.getNoBackupFilesDir getnobackupfilesdir2 = (com.payair.hce.getNoBackupFilesDir) objArr[0];
        int i9 = valueOf + 78;
        AlternateContactlessPaymentDataJson = ((~i9) + (i9 << 1)) % 128;
        java.lang.String simpleName = getnobackupfilesdir2.getClass().getSimpleName();
        int i10 = AlternateContactlessPaymentDataJson;
        int i11 = i10 | 5;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 5)) & i11);
        valueOf = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        return simpleName;
    }

    public getNoBackupFilesDir(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        super(str);
        this.DigitizedCardProfile = singleUseKeyStatusArr;
    }

    public final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] DigitizedCardProfile() {
        return (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[]) values(new java.lang.Object[]{this}, 744844685, -744844685, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String toString() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 1108241231, -1108241230, java.lang.System.identityHashCode(this));
    }
}
