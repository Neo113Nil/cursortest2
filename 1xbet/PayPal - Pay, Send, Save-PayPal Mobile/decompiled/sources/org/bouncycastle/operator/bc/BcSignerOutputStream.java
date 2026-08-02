package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcSignerOutputStream extends java.io.OutputStream {
    org.bouncycastle.crypto.Signer getHighSpeedVideoFpsRangesFor;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor.update((byte) i);
    }

    BcSignerOutputStream(org.bouncycastle.crypto.Signer signer) {
        this.getHighSpeedVideoFpsRangesFor = signer;
    }
}
