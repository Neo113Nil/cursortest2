package org.bouncycastle.its.bc;

/* loaded from: classes17.dex */
public class BcITSExplicitCertificateBuilder extends org.bouncycastle.its.ITSExplicitCertificateBuilder {
    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters2) {
        return super.build(certificateId, new org.bouncycastle.its.bc.BcITSPublicVerificationKey(eCPublicKeyParameters), eCPublicKeyParameters2 != null ? new org.bouncycastle.its.bc.BcITSPublicEncryptionKey(eCPublicKeyParameters2) : null);
    }

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters) {
        return build(certificateId, eCPublicKeyParameters, (org.bouncycastle.crypto.params.ECPublicKeyParameters) null);
    }

    public BcITSExplicitCertificateBuilder(org.bouncycastle.its.operator.ITSContentSigner iTSContentSigner, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        super(iTSContentSigner, builder);
    }
}
