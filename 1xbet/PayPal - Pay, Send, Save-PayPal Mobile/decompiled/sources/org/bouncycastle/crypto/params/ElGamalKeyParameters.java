package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ElGamalKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.crypto.params.ElGamalParameters getHighResolutionOutputSizeshNQ4ISI;

    public int hashCode() {
        org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        if (elGamalParameters != null) {
            return elGamalParameters.hashCode();
        }
        return 0;
    }

    public org.bouncycastle.crypto.params.ElGamalParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.ElGamalKeyParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.crypto.params.ElGamalParameters parameters = ((org.bouncycastle.crypto.params.ElGamalKeyParameters) obj).getParameters();
        return elGamalParameters == null ? parameters == null : elGamalParameters.equals(parameters);
    }

    protected ElGamalKeyParameters(boolean z, org.bouncycastle.crypto.params.ElGamalParameters elGamalParameters) {
        super(z);
        this.getHighResolutionOutputSizeshNQ4ISI = elGamalParameters;
    }
}
