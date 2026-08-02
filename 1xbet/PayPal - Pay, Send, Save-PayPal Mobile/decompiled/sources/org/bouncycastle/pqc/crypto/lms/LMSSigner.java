package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSSigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    private org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            return org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, org.bouncycastle.pqc.crypto.lms.LMSSignature.getHighSpeedVideoFpsRanges(bArr2), bArr);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) cipherParameters;
        } else {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, bArr).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }
}
