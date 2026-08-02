package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class CSHAKEDigest extends org.bouncycastle.crypto.digests.SHAKEDigest {
    private static final byte[] getHighSpeedVideoFpsRanges = new byte[100];
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;

    public CSHAKEDigest(int i, byte[] bArr, byte[] bArr2) {
        super(i);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.digests.XofUtils.leftEncode(this.rate / 8), (bArr == null || bArr.length == 0) ? org.bouncycastle.crypto.digests.XofUtils.leftEncode(0L) : org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.digests.XofUtils.leftEncode(bArr.length * 8), bArr), (bArr2 == null || bArr2.length == 0) ? org.bouncycastle.crypto.digests.XofUtils.leftEncode(0L) : org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.digests.XofUtils.leftEncode(bArr2.length * 8), bArr2));
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CSHAKE");
        sb.append(this.fixedOutputLength);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return super.doOutput(bArr, i, i2);
        }
        if (!this.squeezing) {
            absorbBits(0, 2);
        }
        squeeze(bArr, i, i2 * 8);
        return i2;
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = this.rate / 8;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        absorb(bArr, 0, bArr.length);
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length % i;
        if (length == 0) {
            return;
        }
        while (true) {
            i -= length;
            byte[] bArr2 = getHighSpeedVideoFpsRanges;
            if (i <= bArr2.length) {
                absorb(bArr2, 0, i);
                return;
            } else {
                absorb(bArr2, 0, bArr2.length);
                length = bArr2.length;
            }
        }
    }

    CSHAKEDigest(org.bouncycastle.crypto.digests.CSHAKEDigest cSHAKEDigest) {
        super(cSHAKEDigest);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(cSHAKEDigest.getHighResolutionOutputSizeshNQ4ISI);
    }
}
