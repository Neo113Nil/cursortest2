package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class HSS {
    public static org.bouncycastle.pqc.crypto.lms.HSSSignature getHighSpeedVideoFpsRangesFor(int i, org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        return new org.bouncycastle.pqc.crypto.lms.HSSSignature(i - 1, lMSContext.getInputFormats, org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(lMSContext));
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSSignature getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        int l = hSSPrivateKeyParameters.getL();
        synchronized (hSSPrivateKeyParameters) {
            getHighSpeedVideoFpsRanges(hSSPrivateKeyParameters);
            java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> highResolutionOutputSizeshNQ4ISI = hSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI();
            java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> Camera2StreamConfigurationMap = hSSPrivateKeyParameters.Camera2StreamConfigurationMap();
            int i = l - 1;
            org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = hSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI().get(i);
            org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                lMSSignedPubKeyArr[i2] = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey(Camera2StreamConfigurationMap.get(i2), highResolutionOutputSizeshNQ4ISI.get(i3).getPublicKey());
                i2 = i3;
            }
            synchronized (hSSPrivateKeyParameters) {
                hSSPrivateKeyParameters.getHighSpeedVideoFpsRanges++;
            }
            org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext = lMSPrivateKeyParameters.generateLMSContext();
            generateLMSContext.getInputFormats = lMSSignedPubKeyArr;
            generateLMSContext.update(bArr, 0, bArr.length);
            return new org.bouncycastle.pqc.crypto.lms.HSSSignature(i, generateLMSContext.getInputFormats, org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(generateLMSContext));
        }
        org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext2 = lMSPrivateKeyParameters.generateLMSContext();
        generateLMSContext2.getInputFormats = lMSSignedPubKeyArr;
        generateLMSContext2.update(bArr, 0, bArr.length);
        return new org.bouncycastle.pqc.crypto.lms.HSSSignature(i, generateLMSContext2.getInputFormats, org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(generateLMSContext2));
    }

    static void getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("hss private key");
                sb.append(hSSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor ? " shard" : "");
                sb.append(" is exhausted");
                throw new org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException(sb.toString());
            }
            int l = hSSPrivateKeyParameters.getL();
            java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> highResolutionOutputSizeshNQ4ISI = hSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI();
            int i = l;
            while (true) {
                int i2 = i - 1;
                if (highResolutionOutputSizeshNQ4ISI.get(i2).getIndex() != (1 << highResolutionOutputSizeshNQ4ISI.get(i2).getSigParameters().getH())) {
                    while (i < l) {
                        hSSPrivateKeyParameters.Camera2StreamConfigurationMap(i);
                        i++;
                    }
                } else {
                    if (i2 == 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("hss private key");
                        sb2.append(hSSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor ? " shard" : "");
                        sb2.append(" is exhausted the maximum limit for this HSS private key");
                        throw new org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException(sb2.toString());
                    }
                    i = i2;
                }
            }
        }
    }

    public static boolean getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters, org.bouncycastle.pqc.crypto.lms.HSSSignature hSSSignature, byte[] bArr) {
        int i = hSSSignature.getlMinus1();
        int i2 = i + 1;
        if (i2 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSSignature[] lMSSignatureArr = new org.bouncycastle.pqc.crypto.lms.LMSSignature[i2];
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters[i];
        for (int i3 = 0; i3 < i; i3++) {
            lMSSignatureArr[i3] = hSSSignature.getSignedPubKey()[i3].getHighSpeedVideoFpsRanges;
            lMSPublicKeyParametersArr[i3] = hSSSignature.getSignedPubKey()[i3].getHighSpeedVideoSizes;
        }
        lMSSignatureArr[i] = hSSSignature.getSignature();
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i4 = 0; i4 < i; i4++) {
            if (!org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(lMSPublicKey, lMSSignatureArr[i4], lMSPublicKeyParametersArr[i4].getHighResolutionOutputSizeshNQ4ISI())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i4];
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        }
        return org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(lMSPublicKey, lMSSignatureArr[i], bArr);
    }

    static class PlaceholderLMSPrivateKey extends org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters {
        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getPublicKey() {
            throw new java.lang.RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        final org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey getHighSpeedVideoSizes() {
            throw new java.lang.RuntimeException("placeholder only");
        }

        public PlaceholderLMSPrivateKey(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, -1, bArr, i, bArr2);
        }
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters hSSKeyGenerationParameters) {
        int depth = hSSKeyGenerationParameters.getDepth();
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[depth];
        org.bouncycastle.pqc.crypto.lms.LMSSignature[] lMSSignatureArr = new org.bouncycastle.pqc.crypto.lms.LMSSignature[hSSKeyGenerationParameters.getDepth() - 1];
        byte[] bArr = new byte[32];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[0];
        long j = 1;
        for (int i = 0; i < depth; i++) {
            if (i == 0) {
                lMSPrivateKeyParametersArr[i] = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i].getLMOTSParam(), 0, bArr2, 1 << hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam().getH(), bArr);
            } else {
                lMSPrivateKeyParametersArr[i] = new org.bouncycastle.pqc.crypto.lms.HSS.PlaceholderLMSPrivateKey(hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i].getLMOTSParam(), bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam().getH(), bArr3);
            }
            j *= 1 << hSSKeyGenerationParameters.getLmsParameters()[i].getLMSigParam().getH();
        }
        if (j == 0) {
            j = Long.MAX_VALUE;
        }
        return new org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), java.util.Arrays.asList(lMSPrivateKeyParametersArr), java.util.Arrays.asList(lMSSignatureArr), 0L, j);
    }

    HSS() {
    }
}
