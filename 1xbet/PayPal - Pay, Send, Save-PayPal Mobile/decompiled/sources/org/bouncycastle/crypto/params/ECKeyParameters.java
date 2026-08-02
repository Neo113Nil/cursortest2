package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter {
    private final org.bouncycastle.crypto.params.ECDomainParameters getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.crypto.params.ECDomainParameters getParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected ECKeyParameters(boolean z, org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        super(z);
        if (eCDomainParameters == null) {
            throw new java.lang.NullPointerException("'parameters' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = eCDomainParameters;
    }
}
