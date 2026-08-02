package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMSSignedPubKey implements org.bouncycastle.util.Encodable {
    final org.bouncycastle.pqc.crypto.lms.LMSSignature getHighSpeedVideoFpsRanges;
    final org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getHighSpeedVideoSizes;

    public int hashCode() {
        org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = this.getHighSpeedVideoFpsRanges;
        int hashCode = lMSSignature != null ? lMSSignature.hashCode() : 0;
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters = this.getHighSpeedVideoSizes;
        return (hashCode * 31) + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().bytes(this.getHighSpeedVideoFpsRanges.getEncoded()).bytes(this.getHighSpeedVideoSizes.getEncoded()).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey lMSSignedPubKey = (org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey) obj;
            org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = this.getHighSpeedVideoFpsRanges;
            if (lMSSignature == null ? lMSSignedPubKey.getHighSpeedVideoFpsRanges != null : !lMSSignature.equals(lMSSignedPubKey.getHighSpeedVideoFpsRanges)) {
                return false;
            }
            org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters = this.getHighSpeedVideoSizes;
            org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters2 = lMSSignedPubKey.getHighSpeedVideoSizes;
            if (lMSPublicKeyParameters != null) {
                return lMSPublicKeyParameters.equals(lMSPublicKeyParameters2);
            }
            if (lMSPublicKeyParameters2 == null) {
                return true;
            }
        }
        return false;
    }

    public LMSSignedPubKey(org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature, org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters) {
        this.getHighSpeedVideoFpsRanges = lMSSignature;
        this.getHighSpeedVideoSizes = lMSPublicKeyParameters;
    }
}
