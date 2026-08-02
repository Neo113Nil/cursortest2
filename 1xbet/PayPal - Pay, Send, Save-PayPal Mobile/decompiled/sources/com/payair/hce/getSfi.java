package com.payair.hce;

/* loaded from: classes4.dex */
public class getSfi implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    private com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl[] AlternateContactlessPaymentDataJson = new com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl[15];

    public getSfi() {
        for (int i = 0; i < 15; i++) {
            this.AlternateContactlessPaymentDataJson[i] = new com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl();
        }
    }

    public final com.payair.hce.getRecordNumber valueOf(com.payair.hce.getRecordNumber[] getrecordnumberArr) {
        com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl[] sdkCoreMagstripeCvmIssuerOptionsImplArr = this.AlternateContactlessPaymentDataJson;
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 1 << (3 - i2);
            int i4 = 1 << i2;
            for (int i5 = 0; i5 < i3; i5++) {
                com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl sdkCoreMagstripeCvmIssuerOptionsImpl = sdkCoreMagstripeCvmIssuerOptionsImplArr[i + i5];
                int i6 = i5 * 2 * i4;
                com.payair.hce.getRecordNumber getrecordnumber = getrecordnumberArr[i6];
                com.payair.hce.getRecordNumber getrecordnumber2 = getrecordnumberArr[i6 + i4];
                byte[][] bArr = sdkCoreMagstripeCvmIssuerOptionsImpl.values;
                byte[] bArr2 = getrecordnumber.DigitizedCardProfile;
                byte[] bArr3 = getrecordnumber2.DigitizedCardProfile;
                for (int i7 = 0; i7 < 16; i7++) {
                    int i8 = i7 * 2;
                    byte[] bArr4 = bArr[i8];
                    byte b = bArr2[i7];
                    byte b2 = bArr3[i7];
                    bArr2[i7] = (byte) (bArr4[((b & com.google.common.base.Ascii.SI) << 4) | (b2 & com.google.common.base.Ascii.SI)] | (bArr[i8 + 1][(((b >>> 4) & 15) << 4) | ((b2 >>> 4) & 15)] << 4));
                }
                getrecordnumber.DigitizedCardProfile = bArr2;
            }
            i += i3;
        }
        return getrecordnumberArr[0];
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(this.AlternateContactlessPaymentDataJson) + 201;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            return java.util.Arrays.deepEquals(this.AlternateContactlessPaymentDataJson, ((com.payair.hce.getSfi) obj).AlternateContactlessPaymentDataJson);
        }
        return false;
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.AlternateContactlessPaymentDataJson = (com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl[]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl[].class);
    }
}
