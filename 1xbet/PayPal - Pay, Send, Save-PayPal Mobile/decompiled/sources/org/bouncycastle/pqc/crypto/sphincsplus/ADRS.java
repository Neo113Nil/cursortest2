package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes17.dex */
class ADRS {
    final byte[] getHighSpeedVideoFpsRanges;

    ADRS(org.bouncycastle.pqc.crypto.sphincsplus.ADRS adrs) {
        byte[] bArr = new byte[32];
        this.getHighSpeedVideoFpsRanges = bArr;
        byte[] bArr2 = adrs.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    ADRS() {
        this.getHighSpeedVideoFpsRanges = new byte[32];
    }
}
