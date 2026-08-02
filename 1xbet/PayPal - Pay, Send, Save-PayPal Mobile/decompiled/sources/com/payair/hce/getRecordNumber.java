package com.payair.hce;

/* loaded from: classes4.dex */
public class getRecordNumber implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    private boolean AlternateContactlessPaymentDataJson = false;
    public byte[] DigitizedCardProfile = new byte[16];

    public final com.payair.hce.getRecordNumber DigitizedCardProfile() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = this.DigitizedCardProfile[((i % 4) << 2) + (i / 4)];
        }
        this.DigitizedCardProfile = bArr;
        return this;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.DigitizedCardProfile) + com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.equals(this.DigitizedCardProfile, ((com.payair.hce.getRecordNumber) obj).DigitizedCardProfile);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.DigitizedCardProfile = (byte[]) getstartcommandintent.DigitizedCardProfile(byte[].class);
        this.AlternateContactlessPaymentDataJson = getstartcommandintent.AlternateContactlessPaymentDataJson();
    }
}
