package com.payair.hce;

/* loaded from: classes4.dex */
public class getRecordValue implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    private byte[][] valueOf;

    public getRecordValue() {
        this.valueOf = null;
        this.valueOf = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, 8, 256);
    }

    public final long AlternateContactlessPaymentDataJson(long j, long j2) {
        byte[][] bArr = this.valueOf;
        long j3 = 0;
        for (int i = 0; i < 8; i++) {
            j3 |= bArr[i][(int) ((((j >>> r6) & 15) << 4) | (15 & (j2 >>> r6)))] << (i << 2);
        }
        return j3;
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(this.valueOf) + 371;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.deepEquals(this.valueOf, ((com.payair.hce.getRecordValue) obj).valueOf);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.valueOf = (byte[][]) getstartcommandintent.DigitizedCardProfile(byte[][].class);
    }
}
