package org.bouncycastle.crypto.commitments;

/* loaded from: classes17.dex */
public class HashCommitter implements org.bouncycastle.crypto.Committer {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private final java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(org.bouncycastle.crypto.Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new org.bouncycastle.crypto.DataLengthException("Message and witness secret lengths do not match.");
        }
        return org.bouncycastle.util.Arrays.constantTimeAreEqual(commitment.getCommitment(), Camera2StreamConfigurationMap(commitment.getSecret(), bArr));
    }

    @Override // org.bouncycastle.crypto.Committer
    public org.bouncycastle.crypto.Commitment commit(byte[] bArr) {
        int length = bArr.length;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (length > i / 2) {
            throw new org.bouncycastle.crypto.DataLengthException("Message to be committed to too large for digest.");
        }
        byte[] bArr2 = new byte[i - bArr.length];
        this.getHighSpeedVideoSizes.nextBytes(bArr2);
        return new org.bouncycastle.crypto.Commitment(bArr2, Camera2StreamConfigurationMap(bArr2, bArr));
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.getHighSpeedVideoFpsRangesFor.getDigestSize()];
        this.getHighSpeedVideoFpsRangesFor.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoFpsRangesFor.update(bArr2, 0, bArr2.length);
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr3, 0);
        return bArr3;
    }

    public HashCommitter(org.bouncycastle.crypto.ExtendedDigest extendedDigest, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = extendedDigest;
        this.getHighResolutionOutputSizeshNQ4ISI = extendedDigest.getByteLength();
        this.getHighSpeedVideoSizes = secureRandom;
    }
}
