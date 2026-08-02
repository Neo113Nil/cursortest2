package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class Blake3Parameters implements org.bouncycastle.crypto.CipherParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoSizes;

    public byte[] getKey() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getContext() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public void clearKey() {
        org.bouncycastle.util.Arrays.fill(this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
    }

    public static org.bouncycastle.crypto.params.Blake3Parameters key(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("Invalid keyLength");
        }
        org.bouncycastle.crypto.params.Blake3Parameters blake3Parameters = new org.bouncycastle.crypto.params.Blake3Parameters();
        blake3Parameters.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
        return blake3Parameters;
    }

    public static org.bouncycastle.crypto.params.Blake3Parameters context(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("Invalid context");
        }
        org.bouncycastle.crypto.params.Blake3Parameters blake3Parameters = new org.bouncycastle.crypto.params.Blake3Parameters();
        blake3Parameters.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        return blake3Parameters;
    }
}
