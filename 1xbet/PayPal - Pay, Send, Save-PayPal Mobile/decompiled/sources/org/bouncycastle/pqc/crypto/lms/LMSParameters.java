package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSParameters {
    private final org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap;
    private final org.bouncycastle.pqc.crypto.lms.LMOtsParameters getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.pqc.crypto.lms.LMSigParameters getLMSigParam() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsParameters getLMOTSParam() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public LMSParameters(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters) {
        this.Camera2StreamConfigurationMap = lMSigParameters;
        this.getHighSpeedVideoFpsRangesFor = lMOtsParameters;
    }
}
