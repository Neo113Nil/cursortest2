package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public abstract class AsymmetricKeyUnwrapper implements org.bouncycastle.operator.KeyUnwrapper {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public AsymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
    }
}
