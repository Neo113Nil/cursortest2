package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410KeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.crypto.params.GOST3410Parameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.crypto.params.GOST3410Parameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public GOST3410KeyParameters(boolean z, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        super(z);
        this.getHighSpeedVideoFpsRanges = gOST3410Parameters;
    }
}
