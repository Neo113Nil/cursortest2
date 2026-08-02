package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class CertificateRequestMessageBuilder {
    private final java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.crmf.PKMACValue getHighResolutionOutputSizeshNQ4ISI;
    private char[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.crmf.POPOPrivKey getHighSpeedVideoSizesFor;
    private org.bouncycastle.cert.crmf.PKMACBuilder getInputFormats;
    private org.bouncycastle.asn1.ASN1Null getInputSizeshNQ4ISI;
    private org.bouncycastle.operator.ContentSigner getOutputMinFrameDuration;
    private org.bouncycastle.asn1.x509.GeneralName getOutputStallDuration;
    private int getOutputFormats = 2;
    private org.bouncycastle.asn1.x509.ExtensionsGenerator getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
    private org.bouncycastle.asn1.crmf.CertTemplateBuilder getOutputSizes = new org.bouncycastle.asn1.crmf.CertTemplateBuilder();
    private java.util.List getHighSpeedVideoSizes = new java.util.ArrayList();

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setValidity(java.util.Date date, java.util.Date date2) {
        this.getOutputSizes.setValidity(new org.bouncycastle.asn1.crmf.OptionalValidity(date != null ? new org.bouncycastle.asn1.x509.Time(date) : null, date2 != null ? new org.bouncycastle.asn1.x509.Time(date2) : null));
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (x500Name != null) {
            this.getOutputSizes.setSubject(x500Name);
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setSerialNumber(java.math.BigInteger bigInteger) {
        if (bigInteger != null) {
            this.getOutputSizes.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        if (subjectPublicKeyInfo != null) {
            this.getOutputSizes.setPublicKey(subjectPublicKeyInfo);
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setProofOfPossessionSubsequentMessage(org.bouncycastle.asn1.crmf.SubsequentMessage subsequentMessage) {
        if (this.getOutputMinFrameDuration != null || this.getInputSizeshNQ4ISI != null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("only one proof of possession allowed");
        }
        this.getOutputFormats = 2;
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.crmf.POPOPrivKey(subsequentMessage);
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setProofOfPossessionSubsequentMessage(int i, org.bouncycastle.asn1.crmf.SubsequentMessage subsequentMessage) {
        if (this.getOutputMinFrameDuration != null || this.getInputSizeshNQ4ISI != null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("only one proof of possession allowed");
        }
        if (i != 2 && i != 3) {
            throw new java.lang.IllegalArgumentException("type must be ProofOfPossession.TYPE_KEY_ENCIPHERMENT || ProofOfPossession.TYPE_KEY_AGREEMENT");
        }
        this.getOutputFormats = i;
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.crmf.POPOPrivKey(subsequentMessage);
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setProofOfPossessionSigningKeySigner(org.bouncycastle.operator.ContentSigner contentSigner) {
        if (this.getHighSpeedVideoSizesFor != null || this.getInputSizeshNQ4ISI != null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
            throw new java.lang.IllegalStateException("only one proof of possession allowed");
        }
        this.getOutputMinFrameDuration = contentSigner;
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setProofOfPossessionRaVerified() {
        if (this.getOutputMinFrameDuration != null || this.getHighSpeedVideoSizesFor != null) {
            throw new java.lang.IllegalStateException("only one proof of possession allowed");
        }
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.DERNull.INSTANCE;
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setProofOfPossessionAgreeMAC(org.bouncycastle.asn1.crmf.PKMACValue pKMACValue) {
        if (this.getOutputMinFrameDuration != null || this.getInputSizeshNQ4ISI != null || this.getHighSpeedVideoSizesFor != null) {
            throw new java.lang.IllegalStateException("only one proof of possession allowed");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = pKMACValue;
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (x500Name != null) {
            this.getOutputSizes.setIssuer(x500Name);
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setAuthInfoSender(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getOutputStallDuration = generalName;
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setAuthInfoSender(org.bouncycastle.asn1.x500.X500Name x500Name) {
        return setAuthInfoSender(new org.bouncycastle.asn1.x509.GeneralName(x500Name));
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder setAuthInfoPKMAC(org.bouncycastle.cert.crmf.PKMACBuilder pKMACBuilder, char[] cArr) {
        this.getInputFormats = pKMACBuilder;
        this.getHighSpeedVideoFpsRanges = cArr;
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessage build() throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.asn1.crmf.ProofOfPossession proofOfPossession;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            this.getOutputSizes.setExtensions(this.getHighSpeedVideoFpsRangesFor.generate());
        }
        aSN1EncodableVector.add(this.getOutputSizes.build());
        if (!this.getHighSpeedVideoSizes.isEmpty()) {
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
            for (org.bouncycastle.cert.crmf.Control control : this.getHighSpeedVideoSizes) {
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.crmf.AttributeTypeAndValue(control.getType(), control.getValue()));
            }
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        }
        org.bouncycastle.asn1.crmf.CertRequest certRequest = org.bouncycastle.asn1.crmf.CertRequest.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector3 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector3.add(certRequest);
        if (this.getOutputMinFrameDuration != null) {
            org.bouncycastle.asn1.crmf.CertTemplate certTemplate = certRequest.getCertTemplate();
            if (certTemplate.getSubject() == null || certTemplate.getPublicKey() == null) {
                org.bouncycastle.cert.crmf.ProofOfPossessionSigningKeyBuilder proofOfPossessionSigningKeyBuilder = new org.bouncycastle.cert.crmf.ProofOfPossessionSigningKeyBuilder(certRequest.getCertTemplate().getPublicKey());
                org.bouncycastle.asn1.x509.GeneralName generalName = this.getOutputStallDuration;
                if (generalName != null) {
                    proofOfPossessionSigningKeyBuilder.setSender(generalName);
                } else {
                    proofOfPossessionSigningKeyBuilder.setPublicKeyMac(new org.bouncycastle.cert.crmf.PKMACValueGenerator(this.getInputFormats), this.getHighSpeedVideoFpsRanges);
                }
                proofOfPossession = new org.bouncycastle.asn1.crmf.ProofOfPossession(proofOfPossessionSigningKeyBuilder.build(this.getOutputMinFrameDuration));
            } else {
                proofOfPossession = new org.bouncycastle.asn1.crmf.ProofOfPossession(new org.bouncycastle.cert.crmf.ProofOfPossessionSigningKeyBuilder(certRequest).build(this.getOutputMinFrameDuration));
            }
        } else {
            org.bouncycastle.asn1.crmf.POPOPrivKey pOPOPrivKey = this.getHighSpeedVideoSizesFor;
            if (pOPOPrivKey != null) {
                proofOfPossession = new org.bouncycastle.asn1.crmf.ProofOfPossession(this.getOutputFormats, pOPOPrivKey);
            } else {
                org.bouncycastle.asn1.crmf.PKMACValue pKMACValue = this.getHighResolutionOutputSizeshNQ4ISI;
                if (pKMACValue == null) {
                    if (this.getInputSizeshNQ4ISI != null) {
                        proofOfPossession = new org.bouncycastle.asn1.crmf.ProofOfPossession();
                    }
                    return new org.bouncycastle.cert.crmf.CertificateRequestMessage(org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3)));
                }
                proofOfPossession = new org.bouncycastle.asn1.crmf.ProofOfPossession(3, org.bouncycastle.asn1.crmf.POPOPrivKey.getInstance(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) pKMACValue)));
            }
        }
        aSN1EncodableVector3.add(proofOfPossession);
        return new org.bouncycastle.cert.crmf.CertificateRequestMessage(org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector3)));
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor.addExtension(aSN1ObjectIdentifier, z, bArr);
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder addExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws org.bouncycastle.cert.CertIOException {
        org.bouncycastle.cert.crmf.CRMFUtil.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, aSN1ObjectIdentifier, z, aSN1Encodable);
        return this;
    }

    public org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder addControl(org.bouncycastle.cert.crmf.Control control) {
        this.getHighSpeedVideoSizes.add(control);
        return this;
    }

    public CertificateRequestMessageBuilder(java.math.BigInteger bigInteger) {
        this.Camera2StreamConfigurationMap = bigInteger;
    }
}
