package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class CramerShoupKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.crypto.params.CramerShoupParameters getHighSpeedVideoFpsRanges;

    public int hashCode() {
        int i = !isPrivate() ? 1 : 0;
        org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters = this.getHighSpeedVideoFpsRanges;
        return cramerShoupParameters != null ? i ^ cramerShoupParameters.hashCode() : i;
    }

    public org.bouncycastle.crypto.params.CramerShoupParameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.CramerShoupKeyParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters = this.getHighSpeedVideoFpsRanges;
        org.bouncycastle.crypto.params.CramerShoupParameters parameters = ((org.bouncycastle.crypto.params.CramerShoupKeyParameters) obj).getParameters();
        return cramerShoupParameters == null ? parameters == null : cramerShoupParameters.equals(parameters);
    }

    protected CramerShoupKeyParameters(boolean z, org.bouncycastle.crypto.params.CramerShoupParameters cramerShoupParameters) {
        super(z);
        this.getHighSpeedVideoFpsRanges = cramerShoupParameters;
    }
}
