package com.payair.hce;

/* loaded from: classes4.dex */
public final class sendOrderedBroadcast {
    private static int IccPrivateKeyCrtComponentsJson = 0;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private com.payair.hce.ExpirationDate AlternateContactlessPaymentDataJson;
    private com.payair.hce.setStatusMessage DigitizedCardProfile;
    private com.payair.hce.copydefault getAid;
    private com.payair.hce.hashCode valueOf;
    private com.payair.hce.updateRNSInformation values;
    private com.payair.hce.onNewToken writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-432)) + (i2 * 434) + ((~((~i3) | i4 | i2)) * 433) + (((~((~i2) | i3)) | i4) * (-433)) + (((~(i | i2)) | (~(i3 | i4))) * 433);
        if (i5 == 1) {
            return valueOf(objArr);
        }
        if (i5 == 2) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 == 3) {
            return writeReplace(objArr);
        }
        if (i5 == 4) {
            return values(objArr);
        }
        if (i5 == 5) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i6 = IccPrivateKeyCrtComponentsJson;
        int i7 = i6 & 89;
        int i8 = ((i7 - (~(-(-((i6 ^ 89) | i7))))) - 1) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i8;
        com.payair.hce.hashCode hashcode = sendorderedbroadcast.valueOf;
        int i9 = i8 & 103;
        IccPrivateKeyCrtComponentsJson = ((((i8 ^ 103) | i9) << 1) - ((~i9) & (i8 | 103))) % 128;
        return hashcode;
    }

    public sendOrderedBroadcast(com.payair.hce.onNewToken onnewtoken, com.payair.hce.hashCode hashcode, com.payair.hce.ExpirationDate expirationDate, com.payair.hce.setStatusMessage setstatusmessage, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.copydefault copydefaultVar) {
        this.writeReplace = onnewtoken;
        this.valueOf = hashcode;
        this.AlternateContactlessPaymentDataJson = expirationDate;
        this.DigitizedCardProfile = setstatusmessage;
        this.values = updaternsinformation;
        this.getAid = copydefaultVar;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 119) % 128;
        com.payair.hce.updateRNSInformation updaternsinformation = sendorderedbroadcast.values;
        int i2 = (i & 1) + (i | 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return updaternsinformation;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 69;
        int i3 = ((~i2) & (i | 69)) + (i2 << 1);
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        com.payair.hce.onNewToken onnewtoken = sendorderedbroadcast.writeReplace;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = ((i ^ 79) | (i & 79)) << 1;
        int i5 = -((i & (-80)) | ((~i) & 79));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return onnewtoken;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ 63) | (i & 63)) << 1;
        int i3 = -((i & (-64)) | ((~i) & 63));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        IccPrivateKeyCrtComponentsJson = i4 % 128;
        com.payair.hce.ExpirationDate expirationDate = sendorderedbroadcast.AlternateContactlessPaymentDataJson;
        if (i4 % 2 != 0) {
            throw null;
        }
        IccPrivateKeyCrtComponentsJson = ((i & 85) + (i | 85)) % 128;
        return expirationDate;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 75;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.setStatusMessage setstatusmessage = sendorderedbroadcast.DigitizedCardProfile;
        if (i % 2 == 0) {
            return setstatusmessage;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = (com.payair.hce.sendOrderedBroadcast) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = ((i ^ 115) | (i & 115)) << 1;
        int i3 = -((i & (-116)) | ((~i) & 115));
        int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i4;
        com.payair.hce.copydefault copydefaultVar = sendorderedbroadcast.getAid;
        int i5 = i4 + 111;
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 == 0) {
            return copydefaultVar;
        }
        throw null;
    }

    public final com.payair.hce.copydefault getProfileVersion() {
        return (com.payair.hce.copydefault) DigitizedCardProfile(new java.lang.Object[]{this}, -291991814, 291991815, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setStatusMessage writeReplace() {
        return (com.payair.hce.setStatusMessage) DigitizedCardProfile(new java.lang.Object[]{this}, -633422505, 633422510, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.ExpirationDate DigitizedCardProfile() {
        return (com.payair.hce.ExpirationDate) DigitizedCardProfile(new java.lang.Object[]{this}, 1414273022, -1414273018, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.hashCode values() {
        return (com.payair.hce.hashCode) DigitizedCardProfile(new java.lang.Object[]{this}, 905350733, -905350733, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.onNewToken AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.onNewToken) DigitizedCardProfile(new java.lang.Object[]{this}, 1288350908, -1288350905, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.updateRNSInformation valueOf() {
        return (com.payair.hce.updateRNSInformation) DigitizedCardProfile(new java.lang.Object[]{this}, 389581613, -389581611, java.lang.System.identityHashCode(this));
    }
}
