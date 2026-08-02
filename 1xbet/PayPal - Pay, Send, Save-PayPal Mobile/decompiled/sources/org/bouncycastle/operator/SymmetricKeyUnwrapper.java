package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public abstract class SymmetricKeyUnwrapper implements org.bouncycastle.operator.KeyUnwrapper {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.Camera2StreamConfigurationMap;
    }

    public SymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
    }
}
