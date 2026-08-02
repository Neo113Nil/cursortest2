package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class SM2ParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    private byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getID() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public SM2ParameterSpec(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("id string cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
