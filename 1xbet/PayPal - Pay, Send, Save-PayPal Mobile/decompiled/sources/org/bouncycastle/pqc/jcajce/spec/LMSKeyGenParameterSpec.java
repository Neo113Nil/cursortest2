package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class LMSKeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap;
    private final org.bouncycastle.pqc.crypto.lms.LMOtsParameters getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.pqc.crypto.lms.LMSigParameters getSigParams() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsParameters getOtsParams() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public LMSKeyGenParameterSpec(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters) {
        this.Camera2StreamConfigurationMap = lMSigParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = lMOtsParameters;
    }
}
