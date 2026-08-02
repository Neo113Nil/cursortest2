package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class SkeinMac implements org.bouncycastle.crypto.Mac {
    public static final int SKEIN_1024 = 1024;
    public static final int SKEIN_256 = 256;
    public static final int SKEIN_512 = 512;
    private org.bouncycastle.crypto.digests.SkeinEngine getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.params.SkeinParameters build;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.SkeinParameters) {
            build = (org.bouncycastle.crypto.params.SkeinParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to Skein MAC init - ");
                sb.append(cipherParameters.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            build = new org.bouncycastle.crypto.params.SkeinParameters.Builder().setKey(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey()).build();
        }
        if (build.getKey() == null) {
            throw new java.lang.IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.getHighSpeedVideoFpsRangesFor.init(build);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoFpsRangesFor.getOutputSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Skein-MAC-");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getBlockSize() * 8);
        sb.append("-");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getOutputSize() * 8);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i);
    }

    public SkeinMac(org.bouncycastle.crypto.macs.SkeinMac skeinMac) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.digests.SkeinEngine(skeinMac.getHighSpeedVideoFpsRangesFor);
    }

    public SkeinMac(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.digests.SkeinEngine(i, i2);
    }
}
