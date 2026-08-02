package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class Blake3Mac implements org.bouncycastle.crypto.Mac {
    private final org.bouncycastle.crypto.digests.Blake3Digest getHighSpeedVideoFpsRangesFor;

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
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.crypto.CipherParameters key = cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter ? org.bouncycastle.crypto.params.Blake3Parameters.key(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey()) : cipherParameters;
        if (!(key instanceof org.bouncycastle.crypto.params.Blake3Parameters)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter passed to Blake3Mac init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.crypto.params.Blake3Parameters blake3Parameters = (org.bouncycastle.crypto.params.Blake3Parameters) key;
        if (blake3Parameters.getKey() == null) {
            throw new java.lang.IllegalArgumentException("Blake3Mac requires a key parameter.");
        }
        this.getHighSpeedVideoFpsRangesFor.init(blake3Parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoFpsRangesFor.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
        sb.append("Mac");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i);
    }

    public Blake3Mac(org.bouncycastle.crypto.digests.Blake3Digest blake3Digest) {
        this.getHighSpeedVideoFpsRangesFor = blake3Digest;
    }
}
