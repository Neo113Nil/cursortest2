package com.payair.hce;

/* loaded from: classes4.dex */
public class SdkCoreRecordsImpl implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    private com.payair.hce.getRecordValue[] AlternateContactlessPaymentDataJson = new com.payair.hce.getRecordValue[3];

    public SdkCoreRecordsImpl() {
        for (int i = 0; i < 3; i++) {
            this.AlternateContactlessPaymentDataJson[i] = new com.payair.hce.getRecordValue();
        }
    }

    public final long writeReplace(long j, long j2, long j3, long j4) {
        com.payair.hce.getRecordValue[] getrecordvalueArr = this.AlternateContactlessPaymentDataJson;
        return getrecordvalueArr[2].AlternateContactlessPaymentDataJson(getrecordvalueArr[0].AlternateContactlessPaymentDataJson(j, j2), getrecordvalueArr[1].AlternateContactlessPaymentDataJson(j3, j4));
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(this.AlternateContactlessPaymentDataJson) + 581;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.deepEquals(this.AlternateContactlessPaymentDataJson, ((com.payair.hce.SdkCoreRecordsImpl) obj).AlternateContactlessPaymentDataJson);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.AlternateContactlessPaymentDataJson = (com.payair.hce.getRecordValue[]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getRecordValue[].class);
    }
}
