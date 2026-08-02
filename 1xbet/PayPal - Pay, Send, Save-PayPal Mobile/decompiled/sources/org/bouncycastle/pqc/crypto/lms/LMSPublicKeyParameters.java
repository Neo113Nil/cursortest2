package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSPublicKeyParameters extends org.bouncycastle.pqc.crypto.lms.LMSKeyParameters implements org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier {
    private final org.bouncycastle.pqc.crypto.lms.LMOtsParameters Camera2StreamConfigurationMap;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.pqc.crypto.lms.LMSigParameters getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    final org.bouncycastle.pqc.crypto.lms.LMSContext getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature) {
        int type = getOtsParameters().getType();
        if (lMSSignature.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.getType() == type) {
            return new org.bouncycastle.pqc.crypto.lms.LMOtsPublicKey(org.bouncycastle.pqc.crypto.lms.LMOtsParameters.getParametersForType(type), this.getHighSpeedVideoFpsRangesFor, lMSSignature.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI(lMSSignature);
        }
        throw new java.lang.IllegalArgumentException("ots type from lsm signature does not match ots signature type from embedded ots signature");
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        return org.bouncycastle.pqc.crypto.lms.LMS.getHighResolutionOutputSizeshNQ4ISI(this, lMSContext);
    }

    final byte[] getHighResolutionOutputSizeshNQ4ISI() {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(this.getHighSpeedVideoFpsRanges.getType()).u32str(this.Camera2StreamConfigurationMap.getType()).bytes(this.getHighSpeedVideoFpsRangesFor).bytes(this.getHighResolutionOutputSizeshNQ4ISI).build();
    }

    public int hashCode() {
        return (((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 31) + org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public byte[] getT1() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.pqc.crypto.lms.LMSigParameters getSigParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsParameters getOtsParameters() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSParameters getLMSParameters() {
        return new org.bouncycastle.pqc.crypto.lms.LMSParameters(getSigParameters(), getOtsParameters());
    }

    public byte[] getI() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext(byte[] bArr) {
        try {
            return getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.lms.LMSSignature.getHighSpeedVideoFpsRanges(bArr));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot parse signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters = (org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) obj;
        if (this.getHighSpeedVideoFpsRanges.equals(lMSPublicKeyParameters.getHighSpeedVideoFpsRanges) && this.Camera2StreamConfigurationMap.equals(lMSPublicKeyParameters.Camera2StreamConfigurationMap) && org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, lMSPublicKeyParameters.getHighSpeedVideoFpsRangesFor)) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, lMSPublicKeyParameters.getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getInstance(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters)) {
            if (obj instanceof java.io.DataInputStream) {
                java.io.DataInputStream dataInputStream2 = (java.io.DataInputStream) obj;
                org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.lms.LMSigParameters.Camera2StreamConfigurationMap(dataInputStream2.readInt());
                org.bouncycastle.pqc.crypto.lms.LMOtsParameters parametersForType = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.getParametersForType(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                byte[] bArr2 = new byte[Camera2StreamConfigurationMap.getM()];
                dataInputStream2.readFully(bArr2);
                return new org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters(Camera2StreamConfigurationMap, parametersForType, bArr2, bArr);
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters = getInstance(dataInputStream);
                        dataInputStream.close();
                        return lMSPublicKeyParameters;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof java.io.InputStream)) {
                    throw new java.lang.IllegalArgumentException("cannot parse ".concat(java.lang.String.valueOf(obj)));
                }
                obj = org.bouncycastle.util.io.Streams.readAll((java.io.InputStream) obj);
            }
        }
        return (org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters) obj;
    }

    public LMSPublicKeyParameters(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.getHighSpeedVideoFpsRanges = lMSigParameters;
        this.Camera2StreamConfigurationMap = lMOtsParameters;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
