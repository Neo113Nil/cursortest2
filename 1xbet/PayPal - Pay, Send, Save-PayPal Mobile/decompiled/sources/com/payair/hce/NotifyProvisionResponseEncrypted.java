package com.payair.hce;

/* loaded from: classes10.dex */
public final class NotifyProvisionResponseEncrypted {
    private static int RecordsJson = 0;
    private static int getAid = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "pan")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvrMaskAnd")
    private java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "ciacDecline")
    private java.lang.String IccPrivateKeyCrtComponentsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "aip")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.setSelectionFromTop(valueOf = "panSequenceNumber")
    private java.lang.String getProfileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = "track2Equivalent")
    private java.lang.String valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationExpiryDate")
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        switch ((i * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i2 * (-215)) + ((~(i3 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + (((~i2) | i | i4) * (-216)) + (((~(i | i4)) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)) {
            case 1:
                ((com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0]).SdkCoreAlternateContactlessPaymentDataImpl = ((java.lang.String) objArr[1]).toUpperCase();
                return null;
            case 2:
                com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i5 = RecordsJson;
                int i6 = i5 & 63;
                int i7 = ((i5 ^ 63) | i6) << 1;
                int i8 = -((i5 | 63) & (~i6));
                getAid = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                notifyProvisionResponseEncrypted.getProfileVersion = str.toUpperCase();
                int i9 = RecordsJson;
                getAid = ((i9 ^ 61) + ((i9 & 61) << 1)) % 128;
                return null;
            case 3:
                return writeReplace(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return valueOf(objArr);
            case 6:
                com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted2 = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
                java.lang.String str2 = (java.lang.String) objArr[1];
                int i10 = RecordsJson;
                getAid = ((i10 ^ 63) + ((i10 & 63) << 1)) % 128;
                notifyProvisionResponseEncrypted2.IccPrivateKeyCrtComponentsJson = str2.toUpperCase();
                int i11 = RecordsJson;
                int i12 = i11 & 101;
                int i13 = (i11 | 101) & (~i12);
                int i14 = -(-(i12 << 1));
                getAid = ((i13 & i14) + (i13 | i14)) % 128;
                return null;
            case 7:
                return values(objArr);
            case 8:
                com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted3 = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
                java.lang.String str3 = (java.lang.String) objArr[1];
                int i15 = getAid;
                RecordsJson = ((i15 & 77) + (i15 | 77)) % 128;
                notifyProvisionResponseEncrypted3.valueOf = str3.toUpperCase();
                int i16 = getAid;
                RecordsJson = ((i16 & 47) + (i16 | 47)) % 128;
                return null;
            case 9:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 10:
                return RecordsJson(objArr);
            case 11:
                return getProfileVersion(objArr);
            case 12:
                return getAid(objArr);
            case 13:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 14:
                return getPaymentFci(objArr);
            case 15:
                com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted4 = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
                int i17 = RecordsJson;
                int i18 = i17 & 9;
                int i19 = -(-((i17 ^ 9) | i18));
                int i20 = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                getAid = i20;
                java.lang.String str4 = notifyProvisionResponseEncrypted4.values;
                RecordsJson = (i20 + 107) % 128;
                return str4;
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = RecordsJson;
        int i2 = (i & 86) + (i | 86);
        int i3 = (~i2) + (i2 << 1);
        getAid = i3 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.AlternateContactlessPaymentDataJson;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson;
        int i2 = (((i | 66) << 1) - (i ^ 66)) - 1;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            notifyProvisionResponseEncrypted.AlternateContactlessPaymentDataJson = str;
            return null;
        }
        notifyProvisionResponseEncrypted.AlternateContactlessPaymentDataJson = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson;
        int i2 = i & 101;
        int i3 = -(-((i ^ 101) | i2));
        getAid = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        notifyProvisionResponseEncrypted.values = str.toUpperCase();
        int i4 = getAid;
        int i5 = i4 & 21;
        int i6 = -(-(i4 | 21));
        int i7 = (i5 & i6) + (i6 | i5);
        RecordsJson = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = RecordsJson;
        int i2 = ((i & (-66)) | ((~i) & 65)) + ((i & 65) << 1);
        getAid = i2 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.DigitizedCardProfile;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson + 94;
        int i2 = (~i) + (i << 1);
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            notifyProvisionResponseEncrypted.DigitizedCardProfile = str.toUpperCase();
            int i3 = getAid;
            int i4 = ((i3 ^ 30) + ((i3 & 30) << 1)) - 1;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        notifyProvisionResponseEncrypted.DigitizedCardProfile = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = getAid;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        RecordsJson = i2 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.writeReplace;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        RecordsJson = (((i | 33) << 1) - (i ^ 33)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson;
        int i2 = ((i ^ 18) + ((i & 18) << 1)) - 1;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            notifyProvisionResponseEncrypted.writeReplace = str.toUpperCase();
            int i3 = getAid;
            int i4 = ((i3 & 15) - (~(i3 | 15))) - 1;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        notifyProvisionResponseEncrypted.writeReplace = str.toUpperCase();
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = getAid;
        RecordsJson = (i + 75) % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.valueOf;
        int i2 = ((i ^ 23) | (i & 23)) << 1;
        int i3 = -((i & (-24)) | ((~i) & 23));
        int i4 = (i2 & i3) + (i3 | i2);
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = getAid;
        int i2 = (i & 45) + (i | 45);
        RecordsJson = i2 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.getProfileVersion;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = RecordsJson;
        int i2 = (((i ^ 33) | (i & 33)) << 1) - ((i & (-34)) | ((~i) & 33));
        getAid = i2 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.IccPrivateKeyCrtComponentsJson;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionResponseEncrypted notifyProvisionResponseEncrypted = (com.payair.hce.NotifyProvisionResponseEncrypted) objArr[0];
        int i = RecordsJson;
        int i2 = (((i & (-56)) | ((~i) & 55)) - (~(-(-((i & 55) << 1))))) - 1;
        getAid = i2 % 128;
        java.lang.String str = notifyProvisionResponseEncrypted.SdkCoreAlternateContactlessPaymentDataImpl;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -673827104, 673827105, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -278058035, 278058049, java.lang.System.identityHashCode(this));
    }

    public final void SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 777446572, -777446566, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1428191881, -1428191872, java.lang.System.identityHashCode(this));
    }

    public final void RecordsJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -182336031, 182336033, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -212957071, 212957082, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1279660799, -1279660791, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1696219132, 1696219144, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 482572675, -482572670, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1761789453, 1761789453, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 615811210, -615811206, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1279486589, 1279486596, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 2101966976, -2101966973, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -931277398, 931277413, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -908160720, 908160730, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -312516605, 312516618, java.lang.System.identityHashCode(this));
    }
}
