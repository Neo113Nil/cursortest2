package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public abstract class AsymmetricKeyWrapper implements org.bouncycastle.operator.KeyWrapper {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.operator.KeyWrapper
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public AsymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
    }
}
