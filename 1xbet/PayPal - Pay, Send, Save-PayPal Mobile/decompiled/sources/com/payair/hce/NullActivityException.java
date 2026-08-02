package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class NullActivityException {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;
    private byte[] AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public NullActivityException(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = bArr;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.NullActivityException nullActivityException = (com.payair.hce.NullActivityException) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = ((i | 59) << 1) - (i ^ 59);
        valueOf = i2 % 128;
        byte[] bArr = nullActivityException.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    protected final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, int i) {
        boolean z = getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL;
        if (i != 19) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
        } else if (z) {
            this.AlternateContactlessPaymentDataJson = (byte[]) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(byte[].class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
        } else {
            this.AlternateContactlessPaymentDataJson = null;
            getackautomaticallyresetbyapplication.RecordsJson();
        }
    }

    public /* synthetic */ NullActivityException() {
    }

    protected final /* synthetic */ void writeReplace(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        gettrack2equivalent.writeReplace(getremotepaymentdata, 74);
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, byte[].class, bArr).writeReplace(getremotepaymentdata, bArr);
    }

    public final byte[] writeReplace() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1877837077, 1877837077, java.lang.System.identityHashCode(this));
    }
}
