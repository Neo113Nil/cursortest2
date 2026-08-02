package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA512Digest extends org.bouncycastle.crypto.digests.LongDigest {
    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        copyIn((org.bouncycastle.crypto.digests.SHA512Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 7640891576956012808L;
        this.H2 = -4942790177534073029L;
        this.H3 = 4354685564936845355L;
        this.H4 = -6534734903238641935L;
        this.H5 = 5840696475078001361L;
        this.H6 = -7276294671716946913L;
        this.H7 = 2270897969802886507L;
        this.H8 = 6620516959819538809L;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        org.bouncycastle.util.Pack.longToBigEndian(this.H1, bArr, i);
        org.bouncycastle.util.Pack.longToBigEndian(this.H2, bArr, i + 8);
        org.bouncycastle.util.Pack.longToBigEndian(this.H3, bArr, i + 16);
        org.bouncycastle.util.Pack.longToBigEndian(this.H4, bArr, i + 24);
        org.bouncycastle.util.Pack.longToBigEndian(this.H5, bArr, i + 32);
        org.bouncycastle.util.Pack.longToBigEndian(this.H6, bArr, i + 40);
        org.bouncycastle.util.Pack.longToBigEndian(this.H7, bArr, i + 48);
        org.bouncycastle.util.Pack.longToBigEndian(this.H8, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA512Digest(this);
    }

    public SHA512Digest(byte[] bArr) {
        restoreState(bArr);
    }

    public SHA512Digest(org.bouncycastle.crypto.digests.SHA512Digest sHA512Digest) {
        super(sHA512Digest);
    }

    public SHA512Digest() {
    }
}
