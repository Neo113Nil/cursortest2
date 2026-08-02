package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SkeinDigest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private org.bouncycastle.crypto.digests.SkeinEngine getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI.update(b);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        this.getHighResolutionOutputSizeshNQ4ISI.reset(((org.bouncycastle.crypto.digests.SkeinDigest) memoable).getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    public void init(org.bouncycastle.crypto.params.SkeinParameters skeinParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI.init(skeinParameters);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOutputSize();
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Skein-");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getBlockSize() * 8);
        sb.append("-");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getOutputSize() * 8);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SkeinDigest(this);
    }

    public SkeinDigest(org.bouncycastle.crypto.digests.SkeinDigest skeinDigest) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.digests.SkeinEngine(skeinDigest.getHighResolutionOutputSizeshNQ4ISI);
    }

    public SkeinDigest(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.digests.SkeinEngine(i, i2);
        init(null);
    }
}
