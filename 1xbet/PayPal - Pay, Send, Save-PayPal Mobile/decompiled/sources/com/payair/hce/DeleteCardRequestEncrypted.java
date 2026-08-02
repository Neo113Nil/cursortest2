package com.payair.hce;

/* loaded from: classes10.dex */
public final class DeleteCardRequestEncrypted {
    private static int RecordsJson = 0;
    private static int getAid = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationLifeCycleData")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvmResetTimeout")
    private int DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardholderValidators")
    private com.payair.hce.setIsRedigitization IccPrivateKeyCrtComponentsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "dualTapResetTimeout")
    private int valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "securityWord")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "magstripeCvmIssuerOptions")
    private com.payair.hce.NotifyProvisionRequestEncrypted writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = i6 | i4;
        switch ((i * 193) + (i2 * 193) + ((i4 | (~(i5 | i2))) * (-192)) + (((~i8) | (~i7)) * (-384)) + (((~(i | i8)) | (~(i3 | i7)) | (~(i2 | i | i3))) * 192)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
                int i9 = (getAid + 85) % 128;
                RecordsJson = i9;
                com.payair.hce.setIsRedigitization setisredigitization = deleteCardRequestEncrypted.IccPrivateKeyCrtComponentsJson;
                int i10 = i9 & 115;
                int i11 = (i9 | 115) & (~i10);
                int i12 = i10 << 1;
                getAid = ((i11 & i12) + (i11 | i12)) % 128;
                return setisredigitization;
            case 4:
                return writeReplace(objArr);
            case 5:
                return AlternateContactlessPaymentDataJson(objArr);
            case 6:
                return values(objArr);
            case 7:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 8:
                return getAid(objArr);
            case 9:
                com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted2 = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
                int intValue = ((java.lang.Number) objArr[1]).intValue();
                int i13 = RecordsJson;
                int i14 = i13 ^ 75;
                getAid = ((((i13 & 75) | i14) << 1) - i14) % 128;
                deleteCardRequestEncrypted2.valueOf = intValue;
                getAid = (((i13 & (-102)) | ((~i13) & 101)) + ((i13 & 101) << 1)) % 128;
                return null;
            case 10:
                com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted3 = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
                int intValue2 = ((java.lang.Number) objArr[1]).intValue();
                int i15 = getAid;
                RecordsJson = ((i15 & 19) + (i15 | 19)) % 128;
                deleteCardRequestEncrypted3.DigitizedCardProfile = intValue2;
                int i16 = i15 & 25;
                RecordsJson = (i16 + ((i15 ^ 25) | i16)) % 128;
                return null;
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            default:
                com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted4 = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
                int i17 = getAid;
                RecordsJson = (i17 + 119) % 128;
                int i18 = deleteCardRequestEncrypted4.valueOf;
                int i19 = i17 ^ 103;
                int i20 = (i17 & 103) << 1;
                RecordsJson = (((i19 | i20) << 1) - (i20 ^ i19)) % 128;
                return java.lang.Integer.valueOf(i18);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        int i = RecordsJson;
        int i2 = i & 21;
        getAid = (i2 + ((i ^ 21) | i2)) % 128;
        java.lang.String str = deleteCardRequestEncrypted.values;
        int i3 = (i | 55) << 1;
        int i4 = -((i & (-56)) | ((~i) & 55));
        int i5 = (i3 & i4) + (i4 | i3);
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson + 43;
        getAid = i % 128;
        if (i % 2 != 0) {
            deleteCardRequestEncrypted.values = str.toUpperCase();
            int i2 = RecordsJson;
            int i3 = (i2 & (-92)) | ((~i2) & 91);
            int i4 = -(-((i2 & 91) << 1));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            getAid = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        deleteCardRequestEncrypted.values = str.toUpperCase();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        int i = getAid;
        int i2 = (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1;
        int i3 = -(i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        RecordsJson = i4;
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = deleteCardRequestEncrypted.writeReplace;
        int i5 = i4 + 71;
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return notifyProvisionRequestEncrypted;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[1];
        int i = getAid;
        int i2 = ((i & 96) + (i | 96)) - 1;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            deleteCardRequestEncrypted.writeReplace = notifyProvisionRequestEncrypted;
            return null;
        }
        deleteCardRequestEncrypted.writeReplace = notifyProvisionRequestEncrypted;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        int i = getAid;
        int i2 = i + 115;
        RecordsJson = i2 % 128;
        java.lang.String str = deleteCardRequestEncrypted.AlternateContactlessPaymentDataJson;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i & 93;
        int i4 = (i3 - (~(-(-((i ^ 93) | i3))))) - 1;
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = RecordsJson + 126;
        int i2 = (~i) + (i << 1);
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            deleteCardRequestEncrypted.AlternateContactlessPaymentDataJson = str;
            return null;
        }
        deleteCardRequestEncrypted.AlternateContactlessPaymentDataJson = str;
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        com.payair.hce.setIsRedigitization setisredigitization = (com.payair.hce.setIsRedigitization) objArr[1];
        int i = getAid;
        int i2 = i ^ 111;
        int i3 = -(-((i & 111) << 1));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        RecordsJson = i4;
        deleteCardRequestEncrypted.IccPrivateKeyCrtComponentsJson = setisredigitization;
        int i5 = i4 & 57;
        int i6 = (((~i5) & (i4 | 57)) - (~(-(-(i5 << 1))))) - 1;
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[0];
        int i = getAid;
        int i2 = i & 13;
        int i3 = i2 + ((i ^ 13) | i2);
        RecordsJson = i3 % 128;
        int i4 = deleteCardRequestEncrypted.DigitizedCardProfile;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(i4);
        }
        throw new java.lang.ArithmeticException();
    }

    public final void DigitizedCardProfile(int i) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 913702488, -913702478, i);
    }

    public final int RecordsJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1807702463, -1807702461, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void writeReplace(com.payair.hce.setIsRedigitization setisredigitization) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setisredigitization}, 1512922139, -1512922135, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setIsRedigitization DigitizedCardProfile() {
        return (com.payair.hce.setIsRedigitization) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1278248481, 1278248484, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 1625219159, -1625219148, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -608653999, 608654006, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, notifyProvisionRequestEncrypted}, 548804967, -548804962, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.NotifyProvisionRequestEncrypted writeReplace() {
        return (com.payair.hce.NotifyProvisionRequestEncrypted) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1773827389, 1773827397, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(int i) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1617780165, -1617780156, i);
    }

    public final int values() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2038443170, -2038443170, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str}, 79710895, -79710889, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -222679591, 222679592, java.lang.System.identityHashCode(this));
    }
}
