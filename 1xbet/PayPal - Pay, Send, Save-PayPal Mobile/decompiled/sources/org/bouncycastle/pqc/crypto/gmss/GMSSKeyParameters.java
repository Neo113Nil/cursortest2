package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pqc.crypto.gmss.GMSSParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public GMSSKeyParameters(boolean z, org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters) {
        super(z);
        this.getHighSpeedVideoFpsRanges = gMSSParameters;
    }
}
