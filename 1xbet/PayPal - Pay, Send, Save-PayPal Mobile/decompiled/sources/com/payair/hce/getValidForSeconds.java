package com.payair.hce;

/* loaded from: classes10.dex */
public final class getValidForSeconds {
    private static int getAid = 0;
    private static int getProfileVersion = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFci")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private java.lang.String valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "gpoResponse")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID)
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i | i2);
        switch ((i * 471) + (i2 * 471) + ((i2 | i) * (-470)) + (((~((~i) | i4)) | (~(i4 | i3)) | i5) * (-470)) + (((~(i | i4 | i3)) | i5) * 470)) {
            case 1:
                return writeReplace(objArr);
            case 2:
                com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
                int i6 = getProfileVersion;
                getAid = ((i6 & 77) + (i6 | 77)) % 128;
                java.lang.String str = getvalidforseconds.values;
                int i7 = (i6 ^ 104) + ((i6 & 104) << 1);
                getAid = ((~i7) + (i7 << 1)) % 128;
                return str;
            case 3:
                return valueOf(objArr);
            case 4:
                com.payair.hce.getValidForSeconds getvalidforseconds2 = (com.payair.hce.getValidForSeconds) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i8 = getAid;
                int i9 = i8 & 33;
                getProfileVersion = ((i9 - (~(-(-((i8 ^ 33) | i9))))) - 1) % 128;
                getvalidforseconds2.AlternateContactlessPaymentDataJson = str2.toUpperCase();
                int i10 = getProfileVersion;
                int i11 = i10 ^ 115;
                int i12 = ((i10 & 115) | i11) << 1;
                int i13 = -i11;
                getAid = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
                return null;
            case 5:
                com.payair.hce.getValidForSeconds getvalidforseconds3 = (com.payair.hce.getValidForSeconds) objArr[0];
                int i14 = ((-2) - (~(getAid + 34))) % 128;
                getProfileVersion = i14;
                java.lang.String str3 = getvalidforseconds3.AlternateContactlessPaymentDataJson;
                getAid = (((i14 ^ 18) + ((i14 & 18) << 1)) - 1) % 128;
                return str3;
            case 6:
                return values(objArr);
            case 7:
                return DigitizedCardProfile(objArr);
            case 8:
                com.payair.hce.getValidForSeconds getvalidforseconds4 = (com.payair.hce.getValidForSeconds) objArr[0];
                java.lang.String str4 = (java.lang.String) objArr[1];
                int i15 = getProfileVersion;
                getAid = ((i15 & 17) + (i15 | 17)) % 128;
                getvalidforseconds4.valueOf = str4.toUpperCase();
                int i16 = getAid;
                getProfileVersion = (((i16 | 23) << 1) - (i16 ^ 23)) % 128;
                return null;
            case 9:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getProfileVersion + 55;
        getAid = i % 128;
        if (i % 2 == 0) {
            getvalidforseconds.values = str.toUpperCase();
            int i2 = getProfileVersion + 21;
            getAid = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        getvalidforseconds.values = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        int i = getProfileVersion;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        getAid = i2 % 128;
        java.lang.String str = getvalidforseconds.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = i & 35;
        int i3 = (((i | 35) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            getvalidforseconds.DigitizedCardProfile = str.toUpperCase();
            return null;
        }
        getvalidforseconds.DigitizedCardProfile = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        int i = getAid;
        int i2 = i + 115;
        getProfileVersion = i2 % 128;
        java.lang.String str = getvalidforseconds.writeReplace;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = (((i & (-106)) | ((~i) & 105)) - (~(-(-((i & 105) << 1))))) - 1;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid;
        int i2 = i | 23;
        int i3 = i2 << 1;
        int i4 = -((~(i & 23)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        getProfileVersion = i5 % 128;
        if (i5 % 2 != 0) {
            getvalidforseconds.writeReplace = str.toUpperCase();
            int i6 = getProfileVersion;
            int i7 = i6 ^ 59;
            int i8 = -(-((i6 & 59) << 1));
            getAid = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            return null;
        }
        getvalidforseconds.writeReplace = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getValidForSeconds getvalidforseconds = (com.payair.hce.getValidForSeconds) objArr[0];
        int i = getAid + 11;
        int i2 = i % 128;
        getProfileVersion = i2;
        java.lang.String str = getvalidforseconds.valueOf;
        if (i % 2 == 0) {
            throw null;
        }
        int i3 = (i2 & 1) + (i2 | 1);
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void values(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1457570646, 1457570654, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 785315415, -785315409, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -1318830400, 1318830403, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1194271620, 1194271620, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -673145889, 673145898, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1924062730, 1924062731, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 1434234943, -1434234936, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1762342771, -1762342769, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, -939102575, 939102579, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1523518471, 1523518476, java.lang.System.identityHashCode(this));
    }
}
