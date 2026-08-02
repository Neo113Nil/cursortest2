package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class KeyedHashFunctions {
    final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    protected final byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return getHighResolutionOutputSizeshNQ4ISI(3, bArr, bArr2);
        }
        throw new java.lang.IllegalArgumentException("wrong address length");
    }

    protected final byte[] getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (length != i) {
            throw new java.lang.IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i * 2) {
            return getHighResolutionOutputSizeshNQ4ISI(1, bArr, bArr2);
        }
        throw new java.lang.IllegalArgumentException("wrong in length");
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, byte[] bArr2) {
        byte[] bytesBigEndian = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.toBytesBigEndian(i, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.update(bytesBigEndian, 0, bytesBigEndian.length);
        this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoSizes.update(bArr2, 0, bArr2.length);
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr3 = new byte[i2];
        org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoSizes;
        if (digest instanceof org.bouncycastle.crypto.Xof) {
            ((org.bouncycastle.crypto.Xof) digest).doFinal(bArr3, 0, i2);
            return bArr3;
        }
        digest.doFinal(bArr3, 0);
        return bArr3;
    }

    protected KeyedHashFunctions(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.NullPointerException("digest == null");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
