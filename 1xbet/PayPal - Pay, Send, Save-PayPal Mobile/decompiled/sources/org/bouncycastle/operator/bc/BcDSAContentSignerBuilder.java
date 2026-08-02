package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcDSAContentSignerBuilder extends org.bouncycastle.operator.bc.BcContentSignerBuilder {
    @Override // org.bouncycastle.operator.bc.BcContentSignerBuilder
    protected org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.crypto.signers.DSADigestSigner(new org.bouncycastle.crypto.signers.DSASigner(), this.digestProvider.get(algorithmIdentifier2));
    }

    public BcDSAContentSignerBuilder(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        super(algorithmIdentifier, algorithmIdentifier2);
    }
}
