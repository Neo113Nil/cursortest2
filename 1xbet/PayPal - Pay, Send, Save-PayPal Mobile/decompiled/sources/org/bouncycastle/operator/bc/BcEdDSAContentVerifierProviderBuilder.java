package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcEdDSAContentVerifierProviderBuilder extends org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder {
    public static final byte[] DEFAULT_CONTEXT = new byte[0];

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.params.AsymmetricKeyParameter extractKeyParameters(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        return org.bouncycastle.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.operator.bc.BcContentVerifierProviderBuilder
    protected org.bouncycastle.crypto.Signer createSigner(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        return algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448) ? new org.bouncycastle.crypto.signers.Ed448Signer(DEFAULT_CONTEXT) : new org.bouncycastle.crypto.signers.Ed25519Signer();
    }
}
