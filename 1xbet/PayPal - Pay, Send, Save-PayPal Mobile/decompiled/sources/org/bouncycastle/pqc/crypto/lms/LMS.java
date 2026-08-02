package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class LMS {
    public static org.bouncycastle.pqc.crypto.lms.LMSSignature getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey lMOtsPrivateKey = lMSContext.getHighSpeedVideoSizes;
        byte[] bArr = new byte[34];
        lMSContext.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, 0);
        lMSContext.getHighResolutionOutputSizeshNQ4ISI = null;
        return new org.bouncycastle.pqc.crypto.lms.LMSSignature(lMSContext.getHighSpeedVideoSizes.getHighSpeedVideoSizes, org.bouncycastle.pqc.crypto.lms.LM_OTS.Camera2StreamConfigurationMap(lMOtsPrivateKey, bArr, lMSContext.getHighSpeedVideoFpsRanges), lMSContext.Camera2StreamConfigurationMap, lMSContext.getHighSpeedVideoFpsRangesFor);
    }

    public static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters, org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature = (org.bouncycastle.pqc.crypto.lms.LMSSignature) lMSContext.getSignature();
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = lMSSignature.Camera2StreamConfigurationMap;
        int h = lMSigParameters.getH();
        byte[][] bArr = lMSSignature.getHighSpeedVideoSizes;
        byte[] highResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.lms.LM_OTS.getHighResolutionOutputSizeshNQ4ISI(lMSContext);
        int i = (1 << h) + lMSSignature.getHighSpeedVideoFpsRanges;
        byte[] i2 = lMSPublicKeyParameters.getI();
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMSigParameters.getDigestOID());
        int digestSize = highSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        highSpeedVideoFpsRangesFor.update(i2, 0, i2.length);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -32126, highSpeedVideoFpsRangesFor);
        highSpeedVideoFpsRangesFor.update(highResolutionOutputSizeshNQ4ISI, 0, highResolutionOutputSizeshNQ4ISI.length);
        highSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
        int i3 = 0;
        while (i > 1) {
            if ((i & 1) == 1) {
                highSpeedVideoFpsRangesFor.update(i2, 0, i2.length);
                org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i / 2, highSpeedVideoFpsRangesFor);
                org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -31869, highSpeedVideoFpsRangesFor);
                byte[] bArr3 = bArr[i3];
                highSpeedVideoFpsRangesFor.update(bArr3, 0, bArr3.length);
                highSpeedVideoFpsRangesFor.update(bArr2, 0, digestSize);
            } else {
                highSpeedVideoFpsRangesFor.update(i2, 0, i2.length);
                org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i / 2, highSpeedVideoFpsRangesFor);
                org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -31869, highSpeedVideoFpsRangesFor);
                highSpeedVideoFpsRangesFor.update(bArr2, 0, digestSize);
                byte[] bArr4 = bArr[i3];
                highSpeedVideoFpsRangesFor.update(bArr4, 0, bArr4.length);
            }
            highSpeedVideoFpsRangesFor.doFinal(bArr2, 0);
            i /= 2;
            i3++;
        }
        return org.bouncycastle.util.Arrays.constantTimeAreEqual(lMSPublicKeyParameters.getHighResolutionOutputSizeshNQ4ISI, bArr2);
    }

    public static boolean getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters, org.bouncycastle.pqc.crypto.lms.LMSSignature lMSSignature, byte[] bArr) {
        org.bouncycastle.pqc.crypto.lms.LMSContext highSpeedVideoSizes = lMSPublicKeyParameters.getHighSpeedVideoSizes(lMSSignature);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(bArr, highSpeedVideoSizes);
        return getHighResolutionOutputSizeshNQ4ISI(lMSPublicKeyParameters, highSpeedVideoSizes);
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSSignature getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters, byte[] bArr) {
        org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext = lMSPrivateKeyParameters.generateLMSContext();
        generateLMSContext.update(bArr, 0, bArr.length);
        return getHighSpeedVideoFpsRangesFor(generateLMSContext);
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, int i, byte[] bArr, byte[] bArr2) throws java.lang.IllegalArgumentException {
        if (bArr2 != null && bArr2.length >= lMSigParameters.getM()) {
            return new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters(lMSigParameters, lMOtsParameters, i, bArr, 1 << lMSigParameters.getH(), bArr2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("root seed is less than ");
        sb.append(lMSigParameters.getM());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    LMS() {
    }
}
