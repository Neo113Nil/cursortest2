package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public abstract class SymmetricKeyWrapper implements org.bouncycastle.operator.KeyWrapper {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.operator.KeyWrapper
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public SymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }
}
