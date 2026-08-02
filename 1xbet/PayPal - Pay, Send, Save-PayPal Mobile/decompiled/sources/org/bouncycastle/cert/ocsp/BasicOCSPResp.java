package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class BasicOCSPResp implements org.bouncycastle.util.Encodable {
    private org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ocsp.BasicOCSPResponse getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ocsp.ResponseData getHighSpeedVideoSizes;

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.ocsp.OCSPException {
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            outputStream.write(this.getHighSpeedVideoFpsRanges.getTbsResponseData().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("exception processing sig: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public boolean hasExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizes.getVersion().intValueExact() + 1;
    }

    public byte[] getTBSResponseData() {
        try {
            return this.getHighSpeedVideoFpsRanges.getTbsResponseData().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithmID() {
        return this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getSignatureAlgOID() {
        return this.getHighSpeedVideoFpsRanges.getSignatureAlgorithm().getAlgorithm();
    }

    public byte[] getSignature() {
        return this.getHighSpeedVideoFpsRanges.getSignature().getOctets();
    }

    public org.bouncycastle.cert.ocsp.SingleResp[] getResponses() {
        org.bouncycastle.asn1.ASN1Sequence responses = this.getHighSpeedVideoSizes.getResponses();
        int size = responses.size();
        org.bouncycastle.cert.ocsp.SingleResp[] singleRespArr = new org.bouncycastle.cert.ocsp.SingleResp[size];
        for (int i = 0; i != size; i++) {
            singleRespArr[i] = new org.bouncycastle.cert.ocsp.SingleResp(org.bouncycastle.asn1.ocsp.SingleResponse.getInstance(responses.getObjectAt(i)));
        }
        return singleRespArr;
    }

    public org.bouncycastle.cert.ocsp.RespID getResponderId() {
        return new org.bouncycastle.cert.ocsp.RespID(this.getHighSpeedVideoSizes.getResponderID());
    }

    public java.util.Date getProducedAt() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getProducedAt());
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getEncoded();
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.cert.X509CertificateHolder[] getCerts() {
        org.bouncycastle.asn1.ASN1Sequence certs;
        if (this.getHighSpeedVideoFpsRanges.getCerts() != null && (certs = this.getHighSpeedVideoFpsRanges.getCerts()) != null) {
            int size = certs.size();
            org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = new org.bouncycastle.cert.X509CertificateHolder[size];
            for (int i = 0; i != size; i++) {
                x509CertificateHolderArr[i] = new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(certs.getObjectAt(i)));
            }
            return x509CertificateHolderArr;
        }
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.ocsp.BasicOCSPResp) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.cert.ocsp.BasicOCSPResp) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public BasicOCSPResp(org.bouncycastle.asn1.ocsp.BasicOCSPResponse basicOCSPResponse) {
        this.getHighSpeedVideoFpsRanges = basicOCSPResponse;
        this.getHighSpeedVideoSizes = basicOCSPResponse.getTbsResponseData();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.Extensions.getInstance(basicOCSPResponse.getTbsResponseData().getResponseExtensions());
    }
}
