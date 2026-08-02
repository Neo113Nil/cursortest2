package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class ShortenedDigest implements org.bouncycastle.crypto.ExtendedDigest {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.ExtendedDigest getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.getHighSpeedVideoSizes.update(b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighSpeedVideoSizes.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getHighSpeedVideoSizes.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes.getAlgorithmName());
        sb.append("(");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI * 8);
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[this.getHighSpeedVideoSizes.getDigestSize()];
        this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
        java.lang.System.arraycopy(bArr2, 0, bArr, i, this.getHighResolutionOutputSizeshNQ4ISI);
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ShortenedDigest(org.bouncycastle.crypto.ExtendedDigest extendedDigest, int i) {
        if (extendedDigest == null) {
            throw new java.lang.IllegalArgumentException("baseDigest must not be null");
        }
        if (i > extendedDigest.getDigestSize()) {
            throw new java.lang.IllegalArgumentException("baseDigest output not large enough to support length");
        }
        this.getHighSpeedVideoSizes = extendedDigest;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
