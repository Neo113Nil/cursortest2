package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcRSAContentVerifierProviderBuilder extends org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder {
    private org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.params.AsymmetricKeyParameter extractKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return org.bouncycastle.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.crypto.signers.RSADigestSigner(this.digestProvider.get(this.getHighSpeedVideoFpsRanges.find(algorithmIdentifier)));
    }

    public BcRSAContentVerifierProviderBuilder(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.getHighSpeedVideoFpsRanges = digestAlgorithmIdentifierFinder;
    }
}
