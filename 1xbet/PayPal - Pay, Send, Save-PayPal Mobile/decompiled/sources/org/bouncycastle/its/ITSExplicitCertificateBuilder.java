package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSExplicitCertificateBuilder extends org.bouncycastle.its.ITSCertificateBuilder {
    private final org.bouncycastle.its.operator.ITSContentSigner getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, org.bouncycastle.its.ITSPublicVerificationKey iTSPublicVerificationKey, org.bouncycastle.its.ITSPublicEncryptionKey iTSPublicEncryptionKey) {
        org.bouncycastle.oer.its.Signature its;
        org.bouncycastle.oer.its.HashAlgorithm hashAlgorithm;
        org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder = new org.bouncycastle.oer.its.ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
        builder.setCertificateId(certificateId);
        if (iTSPublicEncryptionKey != null) {
            builder.setEncryptionKey(iTSPublicEncryptionKey.toASN1Structure());
        }
        builder.setVerificationKeyIndicator(org.bouncycastle.oer.its.VerificationKeyIndicator.builder().publicVerificationKey(iTSPublicVerificationKey.toASN1Structure()).createVerificationKeyIndicator());
        org.bouncycastle.oer.its.ToBeSignedCertificate createToBeSignedCertificate = builder.createToBeSignedCertificate();
        org.bouncycastle.oer.its.VerificationKeyIndicator verificationKeyIndicator = this.getHighSpeedVideoFpsRangesFor.isForSelfSigning() ? createToBeSignedCertificate.getVerificationKeyIndicator() : this.getHighSpeedVideoFpsRangesFor.getAssociatedCertificate().toASN1Structure().getCertificateBase().getToBeSignedCertificate().getVerificationKeyIndicator();
        java.io.OutputStream outputStream = this.getHighSpeedVideoFpsRangesFor.getOutputStream();
        try {
            outputStream.write(org.bouncycastle.oer.OEREncoder.toByteArray(createToBeSignedCertificate, org.bouncycastle.oer.its.template.IEEE1609dot2.tbsCertificate));
            outputStream.close();
            int choice = verificationKeyIndicator.getChoice();
            if (choice == 0) {
                its = org.bouncycastle.its.operator.ECDSAEncoder.toITS(org.bouncycastle.asn1.sec.SECObjectIdentifiers.secp256r1, this.getHighSpeedVideoFpsRangesFor.getSignature());
            } else if (choice == 1) {
                its = org.bouncycastle.its.operator.ECDSAEncoder.toITS(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP256r1, this.getHighSpeedVideoFpsRangesFor.getSignature());
            } else {
                if (choice != 3) {
                    throw new java.lang.IllegalStateException("unknown key type");
                }
                its = org.bouncycastle.its.operator.ECDSAEncoder.toITS(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.brainpoolP384r1, this.getHighSpeedVideoFpsRangesFor.getSignature());
            }
            org.bouncycastle.oer.its.CertificateBase.Builder builder2 = new org.bouncycastle.oer.its.CertificateBase.Builder();
            org.bouncycastle.oer.its.IssuerIdentifier.Builder builder3 = org.bouncycastle.oer.its.IssuerIdentifier.builder();
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = this.getHighSpeedVideoFpsRangesFor.getDigestAlgorithm().getAlgorithm();
            if (this.getHighSpeedVideoFpsRangesFor.isForSelfSigning()) {
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
                    hashAlgorithm = org.bouncycastle.oer.its.HashAlgorithm.sha256;
                } else {
                    if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384)) {
                        throw new java.lang.IllegalStateException("unknown digest");
                    }
                    hashAlgorithm = org.bouncycastle.oer.its.HashAlgorithm.sha384;
                }
                builder3.self(hashAlgorithm);
            } else {
                byte[] associatedCertificateDigest = this.getHighSpeedVideoFpsRangesFor.getAssociatedCertificateDigest();
                org.bouncycastle.oer.its.HashedId.HashedId8 hashedId8 = new org.bouncycastle.oer.its.HashedId.HashedId8(org.bouncycastle.util.Arrays.copyOfRange(associatedCertificateDigest, associatedCertificateDigest.length - 8, associatedCertificateDigest.length));
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
                    builder3.sha256AndDigest(hashedId8);
                } else {
                    if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384)) {
                        throw new java.lang.IllegalStateException("unknown digest");
                    }
                    builder3.sha384AndDigest(hashedId8);
                }
            }
            builder2.setVersion(this.version);
            builder2.setType(org.bouncycastle.oer.its.CertificateType.Explicit);
            builder2.setIssuer(builder3.createIssuerIdentifier());
            builder2.setToBeSignedCertificate(createToBeSignedCertificate);
            builder2.setSignature(its);
            org.bouncycastle.oer.its.Certificate.Builder builder4 = new org.bouncycastle.oer.its.Certificate.Builder();
            builder4.setCertificateBase(builder2.createCertificateBase());
            return new org.bouncycastle.its.ITSCertificate(builder4.createCertificate());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("cannot produce certificate signature");
        }
    }

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, org.bouncycastle.its.ITSPublicVerificationKey iTSPublicVerificationKey) {
        return build(certificateId, iTSPublicVerificationKey, null);
    }

    public ITSExplicitCertificateBuilder(org.bouncycastle.its.operator.ITSContentSigner iTSContentSigner, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        super(builder);
        this.getHighSpeedVideoFpsRangesFor = iTSContentSigner;
    }
}
