package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class SipHash128 extends org.bouncycastle.crypto.macs.SipHash {
    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.v1 ^= 238;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SipHash128-");
        sb.append(this.c);
        sb.append("-");
        sb.append(this.d);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        throw new java.lang.UnsupportedOperationException("doFinal() is not supported");
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.m >>>= (7 - this.wordPos) << 3;
        this.m >>>= 8;
        this.m |= (((this.wordCount << 3) + this.wordPos) & 255) << 56;
        processMessageWord();
        this.v2 ^= 238;
        applySipRounds(this.d);
        long j = this.v0;
        long j2 = this.v1;
        long j3 = this.v2;
        long j4 = this.v3;
        this.v1 ^= 221;
        applySipRounds(this.d);
        long j5 = this.v0;
        long j6 = this.v1;
        long j7 = this.v2;
        long j8 = this.v3;
        reset();
        org.bouncycastle.util.Pack.longToLittleEndian(((j ^ j2) ^ j3) ^ j4, bArr, i);
        org.bouncycastle.util.Pack.longToLittleEndian(((j5 ^ j6) ^ j7) ^ j8, bArr, i + 8);
        return 16;
    }

    public SipHash128(int i, int i2) {
        super(i, i2);
    }

    public SipHash128() {
    }
}
