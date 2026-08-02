package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSImplicitCertificateBuilder extends org.bouncycastle.its.ITSCertificateBuilder {
    private final org.bouncycastle.oer.its.IssuerIdentifier getHighSpeedVideoSizes;

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey) {
        org.bouncycastle.oer.its.EccP256CurvePoint createUncompressedP256 = org.bouncycastle.oer.its.EccP256CurvePoint.builder().createUncompressedP256(bigInteger, bigInteger2);
        org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder = new org.bouncycastle.oer.its.ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
        builder.setCertificateId(certificateId);
        if (publicEncryptionKey != null) {
            builder.setEncryptionKey(publicEncryptionKey);
        }
        builder.setVerificationKeyIndicator(org.bouncycastle.oer.its.VerificationKeyIndicator.builder().reconstructionValue(createUncompressedP256).createVerificationKeyIndicator());
        org.bouncycastle.oer.its.CertificateBase.Builder builder2 = new org.bouncycastle.oer.its.CertificateBase.Builder();
        builder2.setVersion(this.version);
        builder2.setType(org.bouncycastle.oer.its.CertificateType.Implicit);
        builder2.setIssuer(this.getHighSpeedVideoSizes);
        builder2.setToBeSignedCertificate(builder.createToBeSignedCertificate());
        org.bouncycastle.oer.its.Certificate.Builder builder3 = new org.bouncycastle.oer.its.Certificate.Builder();
        builder3.setCertificateBase(builder2.createCertificateBase());
        return new org.bouncycastle.its.ITSCertificate(builder3.createCertificate());
    }

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        return build(certificateId, bigInteger, bigInteger2, null);
    }

    public ITSImplicitCertificateBuilder(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        super(iTSCertificate, builder);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
            org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(algorithmIdentifier);
            try {
                java.io.OutputStream outputStream = digestCalculator.getOutputStream();
                outputStream.write(iTSCertificate.getEncoded());
                outputStream.close();
                byte[] digest = digestCalculator.getDigest();
                org.bouncycastle.oer.its.IssuerIdentifier.Builder builder2 = org.bouncycastle.oer.its.IssuerIdentifier.builder();
                org.bouncycastle.oer.its.HashedId.HashedId8 hashedId8 = new org.bouncycastle.oer.its.HashedId.HashedId8(org.bouncycastle.util.Arrays.copyOfRange(digest, digest.length - 8, digest.length));
                if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
                    builder2.sha256AndDigest(hashedId8);
                } else {
                    if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384)) {
                        throw new java.lang.IllegalStateException("unknown digest");
                    }
                    builder2.sha384AndDigest(hashedId8);
                }
                this.getHighSpeedVideoSizes = builder2.createIssuerIdentifier();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e.getMessage(), e);
            }
        } catch (org.bouncycastle.operator.OperatorCreationException e2) {
            throw new java.lang.IllegalStateException(e2.getMessage(), e2);
        }
    }
}
