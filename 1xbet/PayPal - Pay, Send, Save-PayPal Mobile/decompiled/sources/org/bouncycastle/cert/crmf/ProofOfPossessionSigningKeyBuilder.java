package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public class ProofOfPossessionSigningKeyBuilder {
    private org.bouncycastle.asn1.x509.GeneralName Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.crmf.CertRequest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.crmf.PKMACValue getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cert.crmf.ProofOfPossessionSigningKeyBuilder setSender(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.Camera2StreamConfigurationMap = generalName;
        return this;
    }

    public org.bouncycastle.cert.crmf.ProofOfPossessionSigningKeyBuilder setPublicKeyMac(org.bouncycastle.cert.crmf.PKMACValueGenerator pKMACValueGenerator, char[] cArr) throws org.bouncycastle.cert.crmf.CRMFException {
        this.getHighSpeedVideoFpsRangesFor = pKMACValueGenerator.getHighSpeedVideoFpsRangesFor(cArr, this.getHighSpeedVideoFpsRanges);
        return this;
    }

    public org.bouncycastle.asn1.crmf.POPOSigningKey build(org.bouncycastle.operator.ContentSigner contentSigner) {
        org.bouncycastle.asn1.crmf.POPOSigningKeyInput pOPOSigningKeyInput;
        org.bouncycastle.asn1.x509.GeneralName generalName = this.Camera2StreamConfigurationMap;
        if (generalName != null && this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.lang.IllegalStateException("name and publicKeyMAC cannot both be set.");
        }
        org.bouncycastle.asn1.crmf.CertRequest certRequest = this.getHighResolutionOutputSizeshNQ4ISI;
        if (certRequest != null) {
            org.bouncycastle.cert.crmf.CRMFUtil.Camera2StreamConfigurationMap(certRequest, contentSigner.getOutputStream());
            pOPOSigningKeyInput = null;
        } else {
            pOPOSigningKeyInput = generalName != null ? new org.bouncycastle.asn1.crmf.POPOSigningKeyInput(generalName, this.getHighSpeedVideoFpsRanges) : new org.bouncycastle.asn1.crmf.POPOSigningKeyInput(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            org.bouncycastle.cert.crmf.CRMFUtil.Camera2StreamConfigurationMap(pOPOSigningKeyInput, contentSigner.getOutputStream());
        }
        return new org.bouncycastle.asn1.crmf.POPOSigningKey(pOPOSigningKeyInput, contentSigner.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DERBitString(contentSigner.getSignature()));
    }

    public ProofOfPossessionSigningKeyBuilder(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRanges = subjectPublicKeyInfo;
    }

    public ProofOfPossessionSigningKeyBuilder(org.bouncycastle.asn1.crmf.CertRequest certRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI = certRequest;
    }
}
