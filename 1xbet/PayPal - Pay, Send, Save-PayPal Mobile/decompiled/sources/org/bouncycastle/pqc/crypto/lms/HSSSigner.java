package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSSigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    private org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters = this.getHighSpeedVideoSizes;
            return org.bouncycastle.pqc.crypto.lms.HSS.getHighSpeedVideoFpsRangesFor(hSSPublicKeyParameters, org.bouncycastle.pqc.crypto.lms.HSSSignature.getInstance(bArr2, hSSPublicKeyParameters.getL()), bArr);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to decode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (z) {
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) cipherParameters;
        } else {
            this.getHighSpeedVideoSizes = (org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return org.bouncycastle.pqc.crypto.lms.HSS.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, bArr).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }
}
