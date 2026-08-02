package org.bouncycastle.crypto.commitments;

/* loaded from: classes17.dex */
public class GeneralHashCommitter implements org.bouncycastle.crypto.Committer {
    private final int Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(org.bouncycastle.crypto.Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.Camera2StreamConfigurationMap) {
            throw new org.bouncycastle.crypto.DataLengthException("Message and witness secret lengths do not match.");
        }
        return org.bouncycastle.util.Arrays.constantTimeAreEqual(commitment.getCommitment(), getHighSpeedVideoFpsRangesFor(commitment.getSecret(), bArr));
    }

    @Override // org.bouncycastle.crypto.Committer
    public org.bouncycastle.crypto.Commitment commit(byte[] bArr) {
        int length = bArr.length;
        int i = this.Camera2StreamConfigurationMap;
        if (length > i / 2) {
            throw new org.bouncycastle.crypto.DataLengthException("Message to be committed to too large for digest.");
        }
        byte[] bArr2 = new byte[i - bArr.length];
        this.getHighSpeedVideoSizes.nextBytes(bArr2);
        return new org.bouncycastle.crypto.Commitment(bArr2, getHighSpeedVideoFpsRangesFor(bArr2, bArr));
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.getHighResolutionOutputSizeshNQ4ISI.getDigestSize()];
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr, 0, bArr.length);
        this.getHighResolutionOutputSizeshNQ4ISI.update(bArr2, 0, bArr2.length);
        this.getHighResolutionOutputSizeshNQ4ISI.update((byte) (bArr2.length >>> 8));
        this.getHighResolutionOutputSizeshNQ4ISI.update((byte) bArr2.length);
        this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr3, 0);
        return bArr3;
    }

    public GeneralHashCommitter(org.bouncycastle.crypto.ExtendedDigest extendedDigest, java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = extendedDigest;
        this.Camera2StreamConfigurationMap = extendedDigest.getByteLength();
        this.getHighSpeedVideoSizes = secureRandom;
    }
}
