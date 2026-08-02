package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class OCSPReq {
    private static final org.bouncycastle.cert.X509CertificateHolder[] getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cert.X509CertificateHolder[0];
    private org.bouncycastle.asn1.ocsp.OCSPRequest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges;

    public boolean isSigned() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature() != null;
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.ocsp.OCSPException {
        if (!isSigned()) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("attempt to verify signature on unsigned object");
        }
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature().getSignatureAlgorithm());
            contentVerifier.getOutputStream().write(this.getHighResolutionOutputSizeshNQ4ISI.getTbsRequest().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            return contentVerifier.verify(getSignature());
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("exception processing signature: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public boolean hasExtensions() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public int getVersionNumber() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getTbsRequest().getVersion().intValueExact() + 1;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getSignatureAlgOID() {
        if (isSigned()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature().getSignatureAlgorithm().getAlgorithm();
        }
        return null;
    }

    public byte[] getSignature() {
        if (isSigned()) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature().getSignature().getOctets();
        }
        return null;
    }

    public org.bouncycastle.asn1.x509.GeneralName getRequestorName() {
        return org.bouncycastle.asn1.x509.GeneralName.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getTbsRequest().getRequestorName());
    }

    public org.bouncycastle.cert.ocsp.Req[] getRequestList() {
        org.bouncycastle.asn1.ASN1Sequence requestList = this.getHighResolutionOutputSizeshNQ4ISI.getTbsRequest().getRequestList();
        int size = requestList.size();
        org.bouncycastle.cert.ocsp.Req[] reqArr = new org.bouncycastle.cert.ocsp.Req[size];
        for (int i = 0; i != size; i++) {
            reqArr[i] = new org.bouncycastle.cert.ocsp.Req(org.bouncycastle.asn1.ocsp.Request.getInstance(requestList.getObjectAt(i)));
        }
        return reqArr;
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded();
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.ocsp.OCSPUtils.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.cert.X509CertificateHolder[] getCerts() {
        org.bouncycastle.asn1.ASN1Sequence certs;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature() != null && (certs = this.getHighResolutionOutputSizeshNQ4ISI.getOptionalSignature().getCerts()) != null) {
            int size = certs.size();
            org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = new org.bouncycastle.cert.X509CertificateHolder[size];
            for (int i = 0; i != size; i++) {
                x509CertificateHolderArr[i] = new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(certs.getObjectAt(i)));
            }
            return x509CertificateHolderArr;
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    public OCSPReq(byte[] bArr) throws java.io.IOException {
        this(new org.bouncycastle.asn1.ASN1InputStream(bArr));
    }

    public OCSPReq(org.bouncycastle.asn1.ocsp.OCSPRequest oCSPRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI = oCSPRequest;
        this.getHighSpeedVideoFpsRanges = oCSPRequest.getTbsRequest().getRequestExtensions();
    }

    private OCSPReq(org.bouncycastle.asn1.ASN1InputStream aSN1InputStream) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.ocsp.OCSPRequest oCSPRequest = org.bouncycastle.asn1.ocsp.OCSPRequest.getInstance(aSN1InputStream.readObject());
            this.getHighResolutionOutputSizeshNQ4ISI = oCSPRequest;
            if (oCSPRequest == null) {
                throw new org.bouncycastle.cert.CertIOException("malformed request: no request data found");
            }
            this.getHighSpeedVideoFpsRanges = oCSPRequest.getTbsRequest().getRequestExtensions();
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed request: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed request: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb2.toString(), e2);
        } catch (org.bouncycastle.asn1.ASN1Exception e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("malformed request: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb3.toString(), e3);
        }
    }
}
