package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSPublicKeyParameters extends org.bouncycastle.pqc.crypto.lms.LMSKeyParameters implements org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext(byte[] bArr) {
        try {
            org.bouncycastle.pqc.crypto.lms.HSSSignature hSSSignature = org.bouncycastle.pqc.crypto.lms.HSSSignature.getInstance(bArr, getL());
            org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] signedPubKey = hSSSignature.getSignedPubKey();
            org.bouncycastle.pqc.crypto.lms.LMSContext highSpeedVideoSizes = signedPubKey[signedPubKey.length - 1].getHighSpeedVideoSizes.getHighSpeedVideoSizes(hSSSignature.getSignature());
            highSpeedVideoSizes.getInputFormats = signedPubKey;
            return highSpeedVideoSizes;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot parse signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = lMSContext.getInputFormats;
        if (lMSSignedPubKeyArr.length != getL() - 1) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKey = getLMSPublicKey();
        boolean z = false;
        for (int i = 0; i < lMSSignedPubKeyArr.length; i++) {
            if (!org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(lMSPublicKey, lMSSignedPubKeyArr[i].getHighSpeedVideoFpsRanges, lMSSignedPubKeyArr[i].getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI())) {
                z = true;
            }
            lMSPublicKey = lMSSignedPubKeyArr[i].getHighSpeedVideoSizes;
        }
        return lMSPublicKey.verify(lMSContext) & (!z);
    }

    public int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getLMSPublicKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getL() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(this.getHighResolutionOutputSizeshNQ4ISI).bytes(this.getHighSpeedVideoFpsRanges.getEncoded()).build();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) obj;
        if (this.getHighResolutionOutputSizeshNQ4ISI != hSSPublicKeyParameters.getHighResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges.equals(hSSPublicKeyParameters.getHighSpeedVideoFpsRanges);
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters getInstance(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters)) {
            if (obj instanceof java.io.DataInputStream) {
                return new org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters(((java.io.DataInputStream) obj).readInt(), org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters.getInstance(obj));
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream);
                        dataInputStream.close();
                        return hSSPublicKeyParameters;
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
        return (org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters) obj;
    }

    public HSSPublicKeyParameters(int i, org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = lMSPublicKeyParameters;
    }
}
