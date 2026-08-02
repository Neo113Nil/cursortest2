package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public final class GOST3411_2012_256Digest extends org.bouncycastle.crypto.digests.GOST3411_2012Digest {
    private static final byte[] getHighSpeedVideoFpsRanges = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public final int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public final java.lang.String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        java.lang.System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.util.Memoable
    public final org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest(this);
    }

    public GOST3411_2012_256Digest(org.bouncycastle.crypto.digests.GOST3411_2012_256Digest gOST3411_2012_256Digest) {
        super(getHighSpeedVideoFpsRanges);
        reset(gOST3411_2012_256Digest);
    }

    public GOST3411_2012_256Digest() {
        super(getHighSpeedVideoFpsRanges);
    }
}
