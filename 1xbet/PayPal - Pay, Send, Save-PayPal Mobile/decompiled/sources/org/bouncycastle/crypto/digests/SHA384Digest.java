package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA384Digest extends org.bouncycastle.crypto.digests.LongDigest {
    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 48;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        super.copyIn((org.bouncycastle.crypto.digests.SHA384Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = -3766243637369397544L;
        this.H2 = 7105036623409894663L;
        this.H3 = -7973340178411365097L;
        this.H4 = 1526699215303891257L;
        this.H5 = 7436329637833083697L;
        this.H6 = -8163818279084223215L;
        this.H7 = -2662702644619276377L;
        this.H8 = 5167115440072839076L;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "SHA-384";
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
        reset();
        return 48;
    }

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.SHA384Digest(this);
    }

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }

    public SHA384Digest(org.bouncycastle.crypto.digests.SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    public SHA384Digest() {
    }
}
