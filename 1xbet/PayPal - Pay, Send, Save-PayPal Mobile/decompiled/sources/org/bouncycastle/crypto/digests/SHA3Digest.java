package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHA3Digest extends org.bouncycastle.crypto.digests.KeccakDigest {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHA3Digest(int i) {
        super(i);
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'bitLength' ");
        sb.append(i);
        sb.append(" not supported for SHA-3");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SHA3-");
        sb.append(this.fixedOutputLength);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i, byte b, int i2) {
        if (i2 < 0 || i2 > 7) {
            throw new java.lang.IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i3 = (b & ((1 << i2) - 1)) | (2 << i2);
        int i4 = i2 + 2;
        if (i4 >= 8) {
            absorb((byte) i3);
            i4 = i2 - 6;
            i3 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i3, i4);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i);
    }

    public SHA3Digest(org.bouncycastle.crypto.digests.SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }

    public SHA3Digest() {
        this(256);
    }
}
