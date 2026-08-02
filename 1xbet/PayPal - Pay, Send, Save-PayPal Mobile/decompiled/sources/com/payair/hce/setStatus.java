package com.payair.hce;

/* loaded from: classes10.dex */
public final class setStatus {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int getAid = 1;

    @com.payair.hce.setSelectionFromTop(valueOf = "businessLogicModule")
    private com.payair.hce.DeleteCardRequestEncrypted AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardMetadata")
    private java.lang.String RecordsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "digitizedCardId")
    private java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "mppLiteModule")
    private com.payair.hce.GetTaskStatusRequestEncrypted writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "maximumPinTry")
    private int SdkCoreAlternateContactlessPaymentDataImpl = 0;

    @com.payair.hce.setSelectionFromTop(AlternateContactlessPaymentDataJson = false)
    private boolean getProfileVersion = true;

    @com.payair.hce.setSelectionFromTop(valueOf = "contactlessSupported")
    private boolean DigitizedCardProfile = false;

    @com.payair.hce.setSelectionFromTop(valueOf = "remoteSupported")
    private boolean valueOf = false;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (~(i4 | i5)) | (~(i4 | i)) | (~(i5 | i));
        int i7 = ~i;
        switch ((i * (-589)) + (i2 * 591) + (((~(i3 | i7 | i2)) | i6) * 590) + (i6 * (-1180)) + (((~(i2 | i5)) | (~(i7 | i5))) * 590)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
                int i8 = IccPrivateKeyCrtComponentsJson;
                int i9 = ((i8 & 85) + (i8 | 85)) % 128;
                getAid = i9;
                boolean z = setstatus.valueOf;
                int i10 = i9 & 29;
                int i11 = -(-((i9 ^ 29) | i10));
                IccPrivateKeyCrtComponentsJson = ((i10 & i11) + (i10 | i11)) % 128;
                return java.lang.Boolean.valueOf(z);
            case 3:
                com.payair.hce.setStatus setstatus2 = (com.payair.hce.setStatus) objArr[0];
                boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
                int i12 = getAid;
                IccPrivateKeyCrtComponentsJson = ((-2) - (~((i12 & 56) + (i12 | 56)))) % 128;
                setstatus2.valueOf = booleanValue;
                int i13 = (i12 & (-60)) | ((~i12) & 59);
                int i14 = -(-((i12 & 59) << 1));
                IccPrivateKeyCrtComponentsJson = ((i13 & i14) + (i13 | i14)) % 128;
                return null;
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                com.payair.hce.setStatus setstatus3 = (com.payair.hce.setStatus) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i15 = IccPrivateKeyCrtComponentsJson;
                getAid = (((i15 & (-14)) | ((~i15) & 13)) + ((i15 & 13) << 1)) % 128;
                setstatus3.RecordsJson = str;
                getAid = ((-2) - (~(i15 + 86))) % 128;
                return null;
            case 7:
                com.payair.hce.setStatus setstatus4 = (com.payair.hce.setStatus) objArr[0];
                boolean booleanValue2 = ((java.lang.Boolean) objArr[1]).booleanValue();
                int i16 = getAid;
                IccPrivateKeyCrtComponentsJson = (i16 + 125) % 128;
                setstatus4.DigitizedCardProfile = booleanValue2;
                IccPrivateKeyCrtComponentsJson = (i16 + 13) % 128;
                return null;
            case 8:
                com.payair.hce.setStatus setstatus5 = (com.payair.hce.setStatus) objArr[0];
                int i17 = IccPrivateKeyCrtComponentsJson;
                int i18 = i17 & 17;
                int i19 = (~i18) & (i17 | 17);
                int i20 = -(-(i18 << 1));
                getAid = ((i19 ^ i20) + ((i20 & i19) << 1)) % 128;
                int i21 = setstatus5.SdkCoreAlternateContactlessPaymentDataImpl;
                int i22 = i17 ^ 117;
                int i23 = -(-((i17 & 117) << 1));
                getAid = (((i22 | i23) << 1) - (i23 ^ i22)) % 128;
                return java.lang.Integer.valueOf(i21);
            case 9:
                return values(objArr);
            case 10:
                return RecordsJson(objArr);
            case 11:
                com.payair.hce.setStatus setstatus6 = (com.payair.hce.setStatus) objArr[0];
                int i24 = IccPrivateKeyCrtComponentsJson;
                getAid = (((i24 ^ 80) + ((i24 & 80) << 1)) - 1) % 128;
                java.lang.String str2 = setstatus6.values;
                int i25 = i24 & 121;
                getAid = ((((i24 | 121) & (~i25)) - (~(i25 << 1))) - 1) % 128;
                return str2;
            case 12:
                return getAid(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 77;
        int i3 = (i2 - (~(-(-((i ^ 77) | i2))))) - 1;
        getAid = i3 % 128;
        boolean z = setstatus.DigitizedCardProfile;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i + 85;
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        int i = getAid;
        int i2 = i & 21;
        int i3 = (i | 21) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = setstatus.writeReplace;
        if (i5 % 2 == 0) {
            return getTaskStatusRequestEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted = (com.payair.hce.GetTaskStatusRequestEncrypted) objArr[1];
        int i = getAid;
        int i2 = i & 79;
        int i3 = i2 + ((i ^ 79) | i2);
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            setstatus.writeReplace = getTaskStatusRequestEncrypted;
            return null;
        }
        setstatus.writeReplace = getTaskStatusRequestEncrypted;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
        int i2 = (~i) + (i << 1);
        int i3 = i2 % 128;
        getAid = i3;
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = setstatus.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw null;
        }
        IccPrivateKeyCrtComponentsJson = (i3 + 21) % 128;
        return deleteCardRequestEncrypted;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = (com.payair.hce.DeleteCardRequestEncrypted) objArr[1];
        int i = getAid;
        int i2 = i & 5;
        int i3 = (i ^ 5) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        if (i4 % 2 == 0) {
            setstatus.AlternateContactlessPaymentDataJson = deleteCardRequestEncrypted;
            return null;
        }
        setstatus.AlternateContactlessPaymentDataJson = deleteCardRequestEncrypted;
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        getAid = (((i ^ 13) - (~(-(-((i & 13) << 1))))) - 1) % 128;
        setstatus.values = str.toUpperCase();
        int i2 = IccPrivateKeyCrtComponentsJson;
        int i3 = (i2 & 63) + (i2 | 63);
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setStatus setstatus = (com.payair.hce.setStatus) objArr[0];
        int i = getAid;
        int i2 = i & 91;
        int i3 = -(-((i ^ 91) | i2));
        IccPrivateKeyCrtComponentsJson = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        java.lang.String str = setstatus.RecordsJson;
        int i4 = (i | 81) << 1;
        int i5 = -((i & (-82)) | ((~i) & 81));
        int i6 = (i4 & i5) + (i5 | i4);
        IccPrivateKeyCrtComponentsJson = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void values(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -1602669232, 1602669238, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1488605262, 1488605263, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        values(new java.lang.Object[]{this, str}, -441834918, 441834918, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -230306547, 230306558, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted) {
        values(new java.lang.Object[]{this, deleteCardRequestEncrypted}, 254892728, -254892719, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.DeleteCardRequestEncrypted values() {
        return (com.payair.hce.DeleteCardRequestEncrypted) values(new java.lang.Object[]{this}, -141514679, 141514689, java.lang.System.identityHashCode(this));
    }

    public final void values(com.payair.hce.GetTaskStatusRequestEncrypted getTaskStatusRequestEncrypted) {
        values(new java.lang.Object[]{this, getTaskStatusRequestEncrypted}, -1412922979, 1412922991, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.GetTaskStatusRequestEncrypted valueOf() {
        return (com.payair.hce.GetTaskStatusRequestEncrypted) values(new java.lang.Object[]{this}, -282851225, 282851230, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(boolean z) {
        values(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 1341419562, -1341419555, java.lang.System.identityHashCode(this));
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1056070073, 1056070077, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final void writeReplace(boolean z) {
        values(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -907266543, 907266546, java.lang.System.identityHashCode(this));
    }

    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 138618745, -138618743, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -316702788, 316702796, java.lang.System.identityHashCode(this))).intValue();
    }
}
