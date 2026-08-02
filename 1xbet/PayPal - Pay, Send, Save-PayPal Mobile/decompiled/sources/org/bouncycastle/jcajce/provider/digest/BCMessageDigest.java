package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class BCMessageDigest extends java.security.MessageDigest {
    protected org.bouncycastle.crypto.Digest digest;
    protected int digestSize;

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.digest.reset();
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        byte[] bArr = new byte[this.digestSize];
        this.digest.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i, int i2) throws java.security.DigestException {
        int i3 = this.digestSize;
        if (i2 < i3) {
            throw new java.security.DigestException("partial digests not returned");
        }
        if (bArr.length - i < i3) {
            throw new java.security.DigestException("insufficient space in the output buffer to store the digest");
        }
        this.digest.doFinal(bArr, i);
        return this.digestSize;
    }

    protected BCMessageDigest(org.bouncycastle.crypto.Digest digest) {
        super(digest.getAlgorithmName());
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
    }
}
