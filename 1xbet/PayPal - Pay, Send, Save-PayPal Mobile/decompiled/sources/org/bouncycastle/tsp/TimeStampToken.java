package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampToken {
    org.bouncycastle.tsp.TimeStampToken.CertID Camera2StreamConfigurationMap;
    org.bouncycastle.tsp.TimeStampTokenInfo getHighSpeedVideoFpsRanges;
    org.bouncycastle.cms.CMSSignedData getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.cms.SignerInformation getHighSpeedVideoSizes;

    public void validate(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.tsp.TSPException, org.bouncycastle.tsp.TSPValidationException {
        if (!signerInformationVerifier.hasAssociatedCertificate()) {
            throw new java.lang.IllegalArgumentException("verifier provider needs an associated certificate");
        }
        try {
            org.bouncycastle.cert.X509CertificateHolder associatedCertificate = signerInformationVerifier.getAssociatedCertificate();
            org.bouncycastle.tsp.TimeStampToken.CertID certID = this.Camera2StreamConfigurationMap;
            org.bouncycastle.operator.DigestCalculator digestCalculator = signerInformationVerifier.getDigestCalculator(certID.getHighSpeedVideoSizes != null ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1) : certID.getHighSpeedVideoFpsRanges.getHashAlgorithm());
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            org.bouncycastle.tsp.TimeStampToken.CertID certID2 = this.Camera2StreamConfigurationMap;
            org.bouncycastle.asn1.ess.ESSCertID eSSCertID = certID2.getHighSpeedVideoSizes;
            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(eSSCertID != null ? eSSCertID.getCertHash() : certID2.getHighSpeedVideoFpsRanges.getCertHash(), digestCalculator.getDigest())) {
                throw new org.bouncycastle.tsp.TSPValidationException("certificate hash does not match certID hash.");
            }
            org.bouncycastle.tsp.TimeStampToken.CertID certID3 = this.Camera2StreamConfigurationMap;
            org.bouncycastle.asn1.ess.ESSCertID eSSCertID2 = certID3.getHighSpeedVideoSizes;
            if ((eSSCertID2 != null ? eSSCertID2.getIssuerSerial() : certID3.getHighSpeedVideoFpsRanges.getIssuerSerial()) != null) {
                org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(associatedCertificate.toASN1Structure());
                org.bouncycastle.tsp.TimeStampToken.CertID certID4 = this.Camera2StreamConfigurationMap;
                org.bouncycastle.asn1.ess.ESSCertID eSSCertID3 = certID4.getHighSpeedVideoSizes;
                if (!(eSSCertID3 != null ? eSSCertID3.getIssuerSerial() : certID4.getHighSpeedVideoFpsRanges.getIssuerSerial()).getSerial().equals((org.bouncycastle.asn1.ASN1Primitive) issuerAndSerialNumber.getSerialNumber())) {
                    throw new org.bouncycastle.tsp.TSPValidationException("certificate serial number does not match certID for signature.");
                }
                org.bouncycastle.tsp.TimeStampToken.CertID certID5 = this.Camera2StreamConfigurationMap;
                org.bouncycastle.asn1.ess.ESSCertID eSSCertID4 = certID5.getHighSpeedVideoSizes;
                org.bouncycastle.asn1.x509.GeneralName[] names = (eSSCertID4 != null ? eSSCertID4.getIssuerSerial() : certID5.getHighSpeedVideoFpsRanges.getIssuerSerial()).getIssuer().getNames();
                for (int i = 0; i != names.length; i++) {
                    if (names[i].getTagNo() != 4 || !org.bouncycastle.asn1.x500.X500Name.getInstance(names[i].getName()).equals(org.bouncycastle.asn1.x500.X500Name.getInstance(issuerAndSerialNumber.getName()))) {
                    }
                }
                throw new org.bouncycastle.tsp.TSPValidationException("certificate name does not match certID for signature. ");
            }
            org.bouncycastle.tsp.TSPUtil.validateCertificate(associatedCertificate);
            if (!associatedCertificate.isValidOn(this.getHighSpeedVideoFpsRanges.getGenTime())) {
                throw new org.bouncycastle.tsp.TSPValidationException("certificate not valid when time stamp created.");
            }
            if (!this.getHighSpeedVideoSizes.verify(signerInformationVerifier)) {
                throw new org.bouncycastle.tsp.TSPValidationException("signature not created by certificate.");
            }
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.tsp.TSPException("problem processing certificate: ".concat(java.lang.String.valueOf(e)), e);
        } catch (org.bouncycastle.cms.CMSException e2) {
            if (e2.getUnderlyingException() == null) {
                throw new org.bouncycastle.tsp.TSPException("CMS exception: ".concat(java.lang.String.valueOf(e2)), e2);
            }
            throw new org.bouncycastle.tsp.TSPException(e2.getMessage(), e2.getUnderlyingException());
        } catch (org.bouncycastle.operator.OperatorCreationException e3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digest: ");
            sb.append(e3.getMessage());
            throw new org.bouncycastle.tsp.TSPException(sb.toString(), e3);
        }
    }

    public org.bouncycastle.cms.CMSSignedData toCMSSignedData() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isSignatureValid(org.bouncycastle.cms.SignerInformationVerifier signerInformationVerifier) throws org.bouncycastle.tsp.TSPException {
        try {
            return this.getHighSpeedVideoSizes.verify(signerInformationVerifier);
        } catch (org.bouncycastle.cms.CMSException e) {
            if (e.getUnderlyingException() != null) {
                throw new org.bouncycastle.tsp.TSPException(e.getMessage(), e.getUnderlyingException());
            }
            throw new org.bouncycastle.tsp.TSPException("CMS exception: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public org.bouncycastle.asn1.cms.AttributeTable getUnsignedAttributes() {
        return this.getHighSpeedVideoSizes.getUnsignedAttributes();
    }

    public org.bouncycastle.tsp.TimeStampTokenInfo getTimeStampInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cms.AttributeTable getSignedAttributes() {
        return this.getHighSpeedVideoSizes.getSignedAttributes();
    }

    public org.bouncycastle.cms.SignerId getSID() {
        return this.getHighSpeedVideoSizes.getSID();
    }

    public byte[] getEncoded(java.lang.String str) throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.getEncoded(str);
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DL);
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getCertificates() {
        return this.getHighSpeedVideoFpsRangesFor.getCertificates();
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> getCRLs() {
        return this.getHighSpeedVideoFpsRangesFor.getCRLs();
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509AttributeCertificateHolder> getAttributeCertificates() {
        return this.getHighSpeedVideoFpsRangesFor.getAttributeCertificates();
    }

    class CertID {
        org.bouncycastle.asn1.ess.ESSCertIDv2 getHighSpeedVideoFpsRanges;
        org.bouncycastle.asn1.ess.ESSCertID getHighSpeedVideoSizes;

        CertID(org.bouncycastle.asn1.ess.ESSCertIDv2 eSSCertIDv2) {
            this.getHighSpeedVideoFpsRanges = eSSCertIDv2;
            this.getHighSpeedVideoSizes = null;
        }

        CertID(org.bouncycastle.asn1.ess.ESSCertID eSSCertID) {
            this.getHighSpeedVideoSizes = eSSCertID;
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    private static org.bouncycastle.cms.CMSSignedData Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.tsp.TSPException {
        try {
            return new org.bouncycastle.cms.CMSSignedData(contentInfo);
        } catch (org.bouncycastle.cms.CMSException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TSP parsing error: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.tsp.TSPException(sb.toString(), e.getCause());
        }
    }

    public TimeStampToken(org.bouncycastle.cms.CMSSignedData cMSSignedData) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        org.bouncycastle.tsp.TimeStampToken.CertID certID;
        this.getHighSpeedVideoFpsRangesFor = cMSSignedData;
        if (!cMSSignedData.getSignedContentTypeOID().equals(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_TSTInfo.getId())) {
            throw new org.bouncycastle.tsp.TSPValidationException("ContentInfo object not for a time stamp.");
        }
        java.util.Collection<org.bouncycastle.cms.SignerInformation> signers = this.getHighSpeedVideoFpsRangesFor.getSignerInfos().getSigners();
        if (signers.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Time-stamp token signed by ");
            sb.append(signers.size());
            sb.append(" signers, but it must contain just the TSA signature.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoSizes = signers.iterator().next();
        try {
            org.bouncycastle.cms.CMSTypedData signedContent = this.getHighSpeedVideoFpsRangesFor.getSignedContent();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            signedContent.write(byteArrayOutputStream);
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.tsp.TimeStampTokenInfo(org.bouncycastle.asn1.tsp.TSTInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(byteArrayOutputStream.toByteArray())));
            org.bouncycastle.asn1.cms.Attribute attribute = this.getHighSpeedVideoSizes.getSignedAttributes().get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificate);
            if (attribute != null) {
                certID = new org.bouncycastle.tsp.TimeStampToken.CertID(org.bouncycastle.asn1.ess.ESSCertID.getInstance(org.bouncycastle.asn1.ess.SigningCertificate.getInstance(attribute.getAttrValues().getObjectAt(0)).getCerts()[0]));
            } else {
                org.bouncycastle.asn1.cms.Attribute attribute2 = this.getHighSpeedVideoSizes.getSignedAttributes().get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificateV2);
                if (attribute2 == null) {
                    throw new org.bouncycastle.tsp.TSPValidationException("no signing certificate attribute found, time stamp invalid.");
                }
                certID = new org.bouncycastle.tsp.TimeStampToken.CertID(org.bouncycastle.asn1.ess.ESSCertIDv2.getInstance(org.bouncycastle.asn1.ess.SigningCertificateV2.getInstance(attribute2.getAttrValues().getObjectAt(0)).getCerts()[0]));
            }
            this.Camera2StreamConfigurationMap = certID;
        } catch (org.bouncycastle.cms.CMSException e) {
            throw new org.bouncycastle.tsp.TSPException(e.getMessage(), e.getUnderlyingException());
        }
    }

    public TimeStampToken(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        this(Camera2StreamConfigurationMap(contentInfo));
    }
}
