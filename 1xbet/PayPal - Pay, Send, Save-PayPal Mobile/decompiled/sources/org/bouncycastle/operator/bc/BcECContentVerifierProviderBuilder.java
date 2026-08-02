package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcECContentVerifierProviderBuilder extends org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder {
    private org.bouncycastle.operator.DigestAlgorithmIdentifierFinder Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.params.AsymmetricKeyParameter extractKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return org.bouncycastle.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.crypto.signers.DSADigestSigner(new org.bouncycastle.crypto.signers.ECDSASigner(), this.digestProvider.get(this.Camera2StreamConfigurationMap.find(algorithmIdentifier)));
    }

    public BcECContentVerifierProviderBuilder(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.Camera2StreamConfigurationMap = digestAlgorithmIdentifierFinder;
    }
}
