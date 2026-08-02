package com.payair.hce;

/* loaded from: classes4.dex */
public final class onGetCertOperationUnsuccessful {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;
    private static int writeReplace;
    private android.content.Context AlternateContactlessPaymentDataJson;
    private com.payair.hce.getDetailedMessage DigitizedCardProfile;
    private com.payair.hce.setLvtAllowed valueOf;
    private com.payair.hce.getStatusMessage values;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
        if (i7 != 1) {
            return i7 != 2 ? values(objArr) : writeReplace(objArr);
        }
        com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful = (com.payair.hce.onGetCertOperationUnsuccessful) objArr[0];
        int i8 = SdkCoreAlternateContactlessPaymentDataImpl;
        writeReplace = (i8 + 93) % 128;
        com.payair.hce.setLvtAllowed setlvtallowed = ongetcertoperationunsuccessful.valueOf;
        writeReplace = ((-2) - (~(i8 + 44))) % 128;
        return setlvtallowed;
    }

    public onGetCertOperationUnsuccessful(android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage, com.payair.hce.setLvtAllowed setlvtallowed, com.payair.hce.getStatusMessage getstatusmessage) {
        this.AlternateContactlessPaymentDataJson = context;
        this.DigitizedCardProfile = getdetailedmessage;
        this.valueOf = setlvtallowed;
        this.values = getstatusmessage;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful = (com.payair.hce.onGetCertOperationUnsuccessful) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 1;
        writeReplace = i % 128;
        com.payair.hce.getDetailedMessage getdetailedmessage = ongetcertoperationunsuccessful.DigitizedCardProfile;
        if (i % 2 == 0) {
            return getdetailedmessage;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful = (com.payair.hce.onGetCertOperationUnsuccessful) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        writeReplace = ((((i | 50) << 1) - (i ^ 50)) - 1) % 128;
        com.payair.hce.getStatusMessage getstatusmessage = ongetcertoperationunsuccessful.values;
        int i2 = i + 85;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return getstatusmessage;
        }
        throw null;
    }

    public final com.payair.hce.getStatusMessage DigitizedCardProfile() {
        return (com.payair.hce.getStatusMessage) writeReplace(new java.lang.Object[]{this}, 535122107, -535122105, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setLvtAllowed writeReplace() {
        return (com.payair.hce.setLvtAllowed) writeReplace(new java.lang.Object[]{this}, 259530221, -259530220, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.getDetailedMessage values() {
        return (com.payair.hce.getDetailedMessage) writeReplace(new java.lang.Object[]{this}, 298765468, -298765468, java.lang.System.identityHashCode(this));
    }
}
