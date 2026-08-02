package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private final org.bouncycastle.pqc.crypto.lms.LMSParameters[] getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.pqc.crypto.lms.LMSParameters[] getLmsParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getDepth() {
        return this.getHighSpeedVideoFpsRangesFor.length;
    }

    public HSSKeyGenerationParameters(org.bouncycastle.pqc.crypto.lms.LMSParameters[] lMSParametersArr, java.security.SecureRandom secureRandom) {
        super(secureRandom, org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI(lMSParametersArr[0]));
        if (lMSParametersArr.length == 0 || lMSParametersArr.length > 8) {
            throw new java.lang.IllegalArgumentException("lmsParameters length should be between 1 and 8 inclusive");
        }
        this.getHighSpeedVideoFpsRangesFor = lMSParametersArr;
    }
}
