package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class CertificateConfirmationContentBuilder {
    private org.bouncycastle.operator.DigestAlgorithmIdentifierFinder getHighSpeedVideoFpsRanges;
    private java.util.List getHighSpeedVideoFpsRangesFor;
    private java.util.List getHighSpeedVideoSizes;

    public org.bouncycastle.cert.cmp.CertificateConfirmationContent build(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cert.cmp.CMPException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != this.getHighSpeedVideoSizes.size(); i++) {
            org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder = (org.bouncycastle.cert.X509CertificateHolder) this.getHighSpeedVideoSizes.get(i);
            java.math.BigInteger bigInteger = (java.math.BigInteger) this.getHighSpeedVideoFpsRangesFor.get(i);
            org.bouncycastle.asn1.x509.AlgorithmIdentifier find = this.getHighSpeedVideoFpsRanges.find(x509CertificateHolder.toASN1Structure().getSignatureAlgorithm());
            if (find == null) {
                throw new org.bouncycastle.cert.cmp.CMPException("cannot find algorithm for digest from signature");
            }
            try {
                org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(find);
                org.bouncycastle.cert.cmp.CMPUtil.getHighSpeedVideoSizes(x509CertificateHolder.toASN1Structure(), digestCalculator.getOutputStream());
                aSN1EncodableVector.add(new org.bouncycastle.asn1.cmp.CertStatus(digestCalculator.getDigest(), bigInteger));
            } catch (org.bouncycastle.operator.OperatorCreationException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digest: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cert.cmp.CMPException(sb.toString(), e);
            }
        }
        return new org.bouncycastle.cert.cmp.CertificateConfirmationContent(org.bouncycastle.asn1.cmp.CertConfirmContent.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)), this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.cert.cmp.CertificateConfirmationContentBuilder addAcceptedCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes.add(x509CertificateHolder);
        this.getHighSpeedVideoFpsRangesFor.add(bigInteger);
        return this;
    }

    public CertificateConfirmationContentBuilder(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = digestAlgorithmIdentifierFinder;
    }

    public CertificateConfirmationContentBuilder() {
        this(new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder());
    }
}
