package com.payair.hce;

/* loaded from: classes4.dex */
public final class getExternalFilesDir extends com.payair.hce.deleteFile {
    private static int valueOf = 1;
    private static int values;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorCode")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "errorDescription")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "result")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = ~(i3 | i);
        int i8 = (i * (-519)) + (i2 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i2 | i3)) | (~(i4 | i5 | i6))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + (((~(i5 | i6)) | i7) * (-1040)) + (((~(i | i5)) | (~(i4 | i6)) | i7) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL);
        if (i8 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i8 == 2) {
            return valueOf(objArr);
        }
        if (i8 == 3) {
            return writeReplace(objArr);
        }
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) objArr[0];
        int i9 = valueOf;
        values = (((((i9 ^ 105) | (i9 & 105)) << 1) - (~(-((i9 & (-106)) | ((~i9) & 105))))) - 1) % 128;
        java.lang.String simpleName = getexternalfilesdir.getClass().getSimpleName();
        int i10 = values;
        int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
        int i12 = -((i10 & (-38)) | ((~i10) & 37));
        valueOf = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
        return simpleName;
    }

    public getExternalFilesDir(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str);
        this.writeReplace = str2;
        this.AlternateContactlessPaymentDataJson = str3;
        this.DigitizedCardProfile = str4;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) objArr[0];
        int i = values;
        int i2 = (((i | 59) << 1) - (i ^ 59)) % 128;
        valueOf = i2;
        java.lang.String str = getexternalfilesdir.writeReplace;
        int i3 = (i2 ^ 53) + ((i2 & 53) << 1);
        values = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) objArr[0];
        int i = valueOf;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        values = i2 % 128;
        java.lang.String str = getexternalfilesdir.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) objArr[0];
        int i = values;
        int i2 = (i ^ 21) + ((i & 21) << 1);
        valueOf = i2 % 128;
        java.lang.String str = getexternalfilesdir.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i & 47;
        int i4 = i3 + ((i ^ 47) | i3);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1216792447, 1216792447, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -25517625, 25517628, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 39538689, -39538688, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -2079477858, 2079477860, java.lang.System.identityHashCode(this));
    }
}
