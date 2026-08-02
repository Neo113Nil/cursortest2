package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class SHAKEDigest extends org.bouncycastle.crypto.digests.KeccakDigest implements org.bouncycastle.crypto.Xof {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHAKEDigest(int i) {
        super(i);
        if (i == 128 || i == 256) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'bitLength' ");
        sb.append(i);
        sb.append(" not supported for SHAKE");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SHAKE");
        sb.append(this.fixedOutputLength);
        return sb.toString();
    }

    public int doOutput(byte[] bArr, int i, int i2) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i, i2 * 8);
        return i2;
    }

    protected int doFinal(byte[] bArr, int i, int i2, byte b, int i3) {
        if (i3 < 0 || i3 > 7) {
            throw new java.lang.IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i4 = (b & ((1 << i3) - 1)) | (15 << i3);
        int i5 = i3 + 4;
        if (i5 >= 8) {
            absorb((byte) i4);
            i5 = i3 - 4;
            i4 >>>= 8;
        }
        if (i5 > 0) {
            absorbBits(i4, i5);
        }
        squeeze(bArr, i, i2 * 8);
        reset();
        return i2;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        int doOutput = doOutput(bArr, i, i2);
        reset();
        return doOutput;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    protected int doFinal(byte[] bArr, int i, byte b, int i2) {
        return doFinal(bArr, i, getDigestSize(), b, i2);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }

    public SHAKEDigest(org.bouncycastle.crypto.digests.SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    public SHAKEDigest() {
        this(128);
    }
}
