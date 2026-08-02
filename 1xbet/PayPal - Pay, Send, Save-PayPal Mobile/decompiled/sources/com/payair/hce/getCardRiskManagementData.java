package com.payair.hce;

/* loaded from: classes10.dex */
public final class getCardRiskManagementData implements java.io.Serializable {
    public byte[] writeReplace = new byte[4];

    public final void AlternateContactlessPaymentDataJson(long j) {
        byte[] bArr = this.writeReplace;
        bArr[0] = (byte) (j & 255);
        bArr[1] = (byte) ((j >>> 8) & 255);
        bArr[2] = (byte) ((j >>> 16) & 255);
        bArr[3] = (byte) ((j >>> 24) & 255);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.writeReplace) + 205;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.equals(this.writeReplace, ((com.payair.hce.getCardRiskManagementData) obj).writeReplace);
    }

    public final long AlternateContactlessPaymentDataJson() {
        byte[] bArr = this.writeReplace;
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((255 & bArr[3]) << 24);
    }
}
