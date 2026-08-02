package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class LMSParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.pqc.crypto.lms.LMSigParameters getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.pqc.crypto.lms.LMOtsParameters getHighSpeedVideoSizes;

    public org.bouncycastle.pqc.crypto.lms.LMSigParameters getSigParams() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsParameters getOtsParams() {
        return this.getHighSpeedVideoSizes;
    }

    public LMSParameterSpec(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters) {
        this.getHighSpeedVideoFpsRanges = lMSigParameters;
        this.getHighSpeedVideoSizes = lMOtsParameters;
    }
}
