package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class LMSHSSParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[] getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[] getLMSSpecs() {
        return (org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[]) this.getHighSpeedVideoFpsRanges.clone();
    }

    public LMSHSSParameterSpec(org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[] lMSParameterSpecArr) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec[]) lMSParameterSpecArr.clone();
    }
}
