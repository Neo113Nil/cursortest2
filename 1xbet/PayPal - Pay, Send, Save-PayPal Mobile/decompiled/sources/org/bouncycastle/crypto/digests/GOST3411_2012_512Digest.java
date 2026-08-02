package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class GOST3411_2012_512Digest extends org.bouncycastle.crypto.digests.GOST3411_2012Digest {
    private static final byte[] getHighSpeedVideoFpsRanges = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // org.bouncycastle.crypto.digests.GOST3411_2012Digest, org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.digests.GOST3411_2012_512Digest(this);
    }

    public GOST3411_2012_512Digest(org.bouncycastle.crypto.digests.GOST3411_2012_512Digest gOST3411_2012_512Digest) {
        super(getHighSpeedVideoFpsRanges);
        reset(gOST3411_2012_512Digest);
    }

    public GOST3411_2012_512Digest() {
        super(getHighSpeedVideoFpsRanges);
    }
}
