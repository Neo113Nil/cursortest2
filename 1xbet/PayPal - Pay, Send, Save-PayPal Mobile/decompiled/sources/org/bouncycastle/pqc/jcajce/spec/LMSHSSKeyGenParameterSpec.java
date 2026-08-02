package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class LMSHSSKeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private final org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec[] getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec[] getLMSSpecs() {
        return (org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec[]) this.getHighSpeedVideoFpsRanges.clone();
    }

    public LMSHSSKeyGenParameterSpec(org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec... lMSKeyGenParameterSpecArr) {
        if (lMSKeyGenParameterSpecArr.length == 0) {
            throw new java.lang.IllegalArgumentException("at least one LMSKeyGenParameterSpec required");
        }
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.jcajce.spec.LMSKeyGenParameterSpec[]) lMSKeyGenParameterSpecArr.clone();
    }
}
