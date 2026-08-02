package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class DHKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private org.bouncycastle.crypto.params.DHParameters getHighResolutionOutputSizeshNQ4ISI;

    public int hashCode() {
        int i = !isPrivate() ? 1 : 0;
        org.bouncycastle.crypto.params.DHParameters dHParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        return dHParameters != null ? i ^ dHParameters.hashCode() : i;
    }

    public org.bouncycastle.crypto.params.DHParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.crypto.params.DHKeyParameters)) {
            return false;
        }
        org.bouncycastle.crypto.params.DHParameters dHParameters = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.crypto.params.DHParameters parameters = ((org.bouncycastle.crypto.params.DHKeyParameters) obj).getParameters();
        return dHParameters == null ? parameters == null : dHParameters.equals(parameters);
    }

    protected DHKeyParameters(boolean z, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        super(z);
        this.getHighResolutionOutputSizeshNQ4ISI = dHParameters;
    }
}
