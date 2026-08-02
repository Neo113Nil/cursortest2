package com.payair.hce;

/* loaded from: classes10.dex */
public final class NotifyProvisionRequestEncrypted {
    private static int IccPrivateKeyCrtComponentsJson = 1;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAlwaysRequiredIfCurrencyNotProvided")
    private boolean AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAlwaysRequiredIfCurrencyProvided")
    private boolean DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAutomaticallyResetByApplication")
    private boolean RecordsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAlwaysRequiredIfCurrencyProvided")
    private boolean getAid;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinPreEntryAllowed")
    private boolean getProfileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackAutomaticallyResetByApplication")
    private boolean valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "pinAlwaysRequiredIfCurrencyNotProvided")
    private boolean values;

    @com.payair.hce.setSelectionFromTop(valueOf = "ackPreEntryAllowed")
    private boolean writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = i4 | i6;
        switch ((i * 868) + (i2 * 868) + (((~(i4 | i5)) | (~(i6 | i5))) * (-867)) + (((~i7) | (~(i4 | i3)) | (~(i6 | i3))) * (-1734)) + (((~(i | i6 | i3)) | (~(i2 | i4 | i3)) | (~(i5 | i7))) * 867)) {
            case 1:
                com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
                boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
                int i8 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i9 = ((((i8 | 120) << 1) - (i8 ^ 120)) - 1) % 128;
                IccPrivateKeyCrtComponentsJson = i9;
                notifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson = booleanValue;
                int i10 = i9 & 93;
                int i11 = (i9 ^ 93) | i10;
                SdkCoreAlternateContactlessPaymentDataImpl = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
                return null;
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                return AlternateContactlessPaymentDataJson(objArr);
            case 5:
                return values(objArr);
            case 6:
                return valueOf(objArr);
            case 7:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 8:
                return RecordsJson(objArr);
            case 9:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 10:
                com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted2 = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
                int i12 = SdkCoreAlternateContactlessPaymentDataImpl;
                IccPrivateKeyCrtComponentsJson = (i12 + 33) % 128;
                boolean z = notifyProvisionRequestEncrypted2.valueOf;
                int i13 = i12 ^ 63;
                IccPrivateKeyCrtComponentsJson = (((((i12 & 63) | i13) << 1) - (~(-i13))) - 1) % 128;
                return java.lang.Boolean.valueOf(z);
            case 11:
                return getProfileVersion(objArr);
            case 12:
                return getAid(objArr);
            case 13:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 14:
                com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted3 = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
                int i14 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i15 = (((i14 & (-36)) | ((~i14) & 35)) + ((i14 & 35) << 1)) % 128;
                IccPrivateKeyCrtComponentsJson = i15;
                boolean z2 = notifyProvisionRequestEncrypted3.values;
                SdkCoreAlternateContactlessPaymentDataImpl = ((((i15 | 11) << 1) - (~(-((i15 & (-12)) | ((~i15) & 11))))) - 1) % 128;
                return java.lang.Boolean.valueOf(z2);
            case 15:
                return getCvrMaskAnd(objArr);
            default:
                com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted4 = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
                int i16 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i17 = i16 & 43;
                int i18 = -(-(i16 | 43));
                IccPrivateKeyCrtComponentsJson = ((i17 & i18) + (i17 | i18)) % 128;
                boolean z3 = notifyProvisionRequestEncrypted4.AlternateContactlessPaymentDataJson;
                int i19 = i16 & 125;
                int i20 = i16 | 125;
                IccPrivateKeyCrtComponentsJson = ((i19 & i20) + (i20 | i19)) % 128;
                return java.lang.Boolean.valueOf(z3);
        }
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i | 29) << 1) - (i ^ 29);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        boolean z = notifyProvisionRequestEncrypted.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 75;
        int i3 = (i2 - (~((i ^ 75) | i2))) - 1;
        int i4 = i3 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        if (i3 % 2 == 0) {
            notifyProvisionRequestEncrypted.DigitizedCardProfile = booleanValue;
            int i5 = (((i4 | 26) << 1) - (i4 ^ 26)) - 1;
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        notifyProvisionRequestEncrypted.DigitizedCardProfile = booleanValue;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i ^ 43;
        int i3 = ((i & 43) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i4 | i3);
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        boolean z = notifyProvisionRequestEncrypted.getProfileVersion;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i6 = (((i ^ 91) | (i & 91)) << 1) - ((i & (-92)) | ((~i) & 91));
        SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
        if (i6 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 71;
        int i3 = i | 71;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            notifyProvisionRequestEncrypted.getProfileVersion = booleanValue;
            return null;
        }
        notifyProvisionRequestEncrypted.getProfileVersion = booleanValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            notifyProvisionRequestEncrypted.values = booleanValue;
            return null;
        }
        notifyProvisionRequestEncrypted.values = booleanValue;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i ^ 13;
        int i3 = ((((i & 13) | i2) << 1) - (~(-i2))) - 1;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        boolean z = notifyProvisionRequestEncrypted.writeReplace;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ~i;
        int i3 = (i & (-28)) | (i2 & 27);
        int i4 = -(-((i & 27) << 1));
        SdkCoreAlternateContactlessPaymentDataImpl = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        notifyProvisionRequestEncrypted.writeReplace = booleanValue;
        int i5 = (((i & (-6)) | (i2 & 5)) - (~((i & 5) << 1))) - 1;
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = IccPrivateKeyCrtComponentsJson + 37;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            notifyProvisionRequestEncrypted.valueOf = booleanValue;
            return null;
        }
        notifyProvisionRequestEncrypted.valueOf = booleanValue;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 125;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        boolean z = notifyProvisionRequestEncrypted.RecordsJson;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = (i ^ 50) + ((i & 50) << 1);
        int i4 = (~i3) + (i3 << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 93;
        int i3 = (i ^ 93) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 != 0) {
            notifyProvisionRequestEncrypted.RecordsJson = booleanValue;
            int i5 = -(-(i | 93));
            IccPrivateKeyCrtComponentsJson = ((i2 ^ i5) + ((i5 & i2) << 1)) % 128;
            return null;
        }
        notifyProvisionRequestEncrypted.RecordsJson = booleanValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 125;
        int i3 = (i2 + ((i ^ 125) | i2)) % 128;
        IccPrivateKeyCrtComponentsJson = i3;
        boolean z = notifyProvisionRequestEncrypted.getAid;
        int i4 = i3 & 41;
        int i5 = (i3 | 41) & (~i4);
        int i6 = -(-(i4 << 1));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i7 % 128;
        if (i7 % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = (com.payair.hce.NotifyProvisionRequestEncrypted) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i ^ 119;
        int i3 = ((i & 119) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 & i4) + (i3 | i4)) % 128;
        IccPrivateKeyCrtComponentsJson = i5;
        notifyProvisionRequestEncrypted.getAid = booleanValue;
        int i6 = i5 + 17;
        SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void IccPrivateKeyCrtComponentsJson(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1064580591, 1064580600, java.lang.System.identityHashCode(this));
    }

    public final boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 233240415, -233240409, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void RecordsJson(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1711745080, 1711745095, java.lang.System.identityHashCode(this));
    }

    public final boolean RecordsJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1418409609, -1418409605, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void getProfileVersion(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 601004559, -601004552, java.lang.System.identityHashCode(this));
    }

    public final boolean IccPrivateKeyCrtComponentsJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -823562565, 823562575, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void values(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1277116510, 1277116513, java.lang.System.identityHashCode(this));
    }

    public final boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1220726242, 1220726250, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void AlternateContactlessPaymentDataJson(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 1452208372, -1452208371, java.lang.System.identityHashCode(this));
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -994099733, 994099733, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void writeReplace(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1019184917, 1019184928, java.lang.System.identityHashCode(this));
    }

    public final boolean values() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 528678814, -528678800, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void DigitizedCardProfile(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -1594786204, 1594786216, java.lang.System.identityHashCode(this));
    }

    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 95577821, -95577816, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void valueOf(boolean z) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 1151331013, -1151331011, java.lang.System.identityHashCode(this));
    }

    public final boolean valueOf() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 944639813, -944639800, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
