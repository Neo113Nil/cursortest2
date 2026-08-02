package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class UserKeyingMaterialSpec implements java.security.spec.AlgorithmParameterSpec {
    private final byte[] getHighSpeedVideoFpsRangesFor;

    public byte[] getUserKeyingMaterial() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    public UserKeyingMaterialSpec(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
