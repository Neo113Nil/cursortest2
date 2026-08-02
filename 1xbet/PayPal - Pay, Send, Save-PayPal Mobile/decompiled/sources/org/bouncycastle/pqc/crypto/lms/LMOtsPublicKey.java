package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMOtsPublicKey implements org.bouncycastle.util.Encodable {
    final org.bouncycastle.pqc.crypto.lms.LMOtsParameters Camera2StreamConfigurationMap;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor = null;

    final org.bouncycastle.pqc.crypto.lms.LMSContext getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature) {
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getDigestOID());
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -32383, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(lMSSignature.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor);
        return new org.bouncycastle.pqc.crypto.lms.LMSContext(this, lMSSignature, highSpeedVideoFpsRangesFor);
    }

    public int hashCode() {
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.Camera2StreamConfigurationMap;
        return ((((((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31) + java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoFpsRanges) * 31) + java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(this.Camera2StreamConfigurationMap.getType()).bytes(this.getHighResolutionOutputSizeshNQ4ISI).u32str(this.getHighSpeedVideoFpsRanges).bytes(this.getHighSpeedVideoFpsRangesFor).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey lMOtsPublicKey = (org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey) obj;
        if (this.getHighSpeedVideoFpsRanges != lMOtsPublicKey.getHighSpeedVideoFpsRanges) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.Camera2StreamConfigurationMap;
        if (lMOtsParameters == null ? lMOtsPublicKey.Camera2StreamConfigurationMap != null : !lMOtsParameters.equals(lMOtsPublicKey.Camera2StreamConfigurationMap)) {
            return false;
        }
        if (java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, lMOtsPublicKey.getHighResolutionOutputSizeshNQ4ISI)) {
            return java.util.Arrays.equals(this.getHighSpeedVideoFpsRangesFor, lMOtsPublicKey.getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public LMOtsPublicKey(org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap = lMOtsParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoFpsRanges = i;
    }
}
