package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class NonMemoableDigest implements org.bouncycastle.crypto.ExtendedDigest {
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
        return this.getHighSpeedVideoSizes.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getHighSpeedVideoSizes.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return this.getHighSpeedVideoSizes.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return this.getHighSpeedVideoSizes.doFinal(bArr, i);
    }

    public NonMemoableDigest(org.bouncycastle.crypto.ExtendedDigest extendedDigest) {
        if (extendedDigest == null) {
            throw new java.lang.IllegalArgumentException("baseDigest must not be null");
        }
        this.getHighSpeedVideoSizes = extendedDigest;
    }
}
