package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class OCSPReqBuilder {
    private java.util.List Camera2StreamConfigurationMap = new java.util.ArrayList();
    private org.bouncycastle.asn1.x509.GeneralName getHighResolutionOutputSizeshNQ4ISI = null;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges = null;

    private org.bouncycastle.cert.ocsp.OCSPReq getHighSpeedVideoSizes(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr) throws org.bouncycastle.cert.ocsp.OCSPException {
        org.bouncycastle.asn1.ocsp.Signature signature;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (org.bouncycastle.cert.ocsp.OCSPReqBuilder.RequestObject requestObject : this.Camera2StreamConfigurationMap) {
            try {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ocsp.Request(requestObject.Camera2StreamConfigurationMap.toASN1Primitive(), requestObject.getHighSpeedVideoFpsRanges));
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.cert.ocsp.OCSPException("exception creating Request", e);
            }
        }
        org.bouncycastle.asn1.ocsp.TBSRequest tBSRequest = new org.bouncycastle.asn1.ocsp.TBSRequest(this.getHighResolutionOutputSizeshNQ4ISI, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector), this.getHighSpeedVideoFpsRanges);
        if (contentSigner == null) {
            signature = null;
        } else {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                throw new org.bouncycastle.cert.ocsp.OCSPException("requestorName must be specified if request is signed.");
            }
            try {
                java.io.OutputStream outputStream = contentSigner.getOutputStream();
                outputStream.write(tBSRequest.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                outputStream.close();
                org.bouncycastle.asn1.DERBitString dERBitString = new org.bouncycastle.asn1.DERBitString(contentSigner.getSignature());
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
                if (x509CertificateHolderArr == null || x509CertificateHolderArr.length <= 0) {
                    signature = new org.bouncycastle.asn1.ocsp.Signature(algorithmIdentifier, dERBitString);
                } else {
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                    for (int i = 0; i != x509CertificateHolderArr.length; i++) {
                        aSN1EncodableVector2.add(x509CertificateHolderArr[i].toASN1Structure());
                    }
                    signature = new org.bouncycastle.asn1.ocsp.Signature(algorithmIdentifier, dERBitString, new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
                }
            } catch (java.lang.Exception e2) {
                throw new org.bouncycastle.cert.ocsp.OCSPException("exception processing TBSRequest: ".concat(java.lang.String.valueOf(e2)), e2);
            }
        }
        return new org.bouncycastle.cert.ocsp.OCSPReq(new org.bouncycastle.asn1.ocsp.OCSPRequest(tBSRequest, signature));
    }

    public org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestorName(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighResolutionOutputSizeshNQ4ISI = generalName;
        return this;
    }

    public org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestorName(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.GeneralName(4, x500Name);
        return this;
    }

    public org.bouncycastle.cert.ocsp.OCSPReqBuilder setRequestExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = extensions;
        return this;
    }

    public org.bouncycastle.cert.ocsp.OCSPReq build(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr) throws org.bouncycastle.cert.ocsp.OCSPException, java.lang.IllegalArgumentException {
        if (contentSigner != null) {
            return getHighSpeedVideoSizes(contentSigner, x509CertificateHolderArr);
        }
        throw new java.lang.IllegalArgumentException("no signer specified");
    }

    public org.bouncycastle.cert.ocsp.OCSPReq build() throws org.bouncycastle.cert.ocsp.OCSPException {
        return getHighSpeedVideoSizes(null, null);
    }

    public org.bouncycastle.cert.ocsp.OCSPReqBuilder addRequest(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.Camera2StreamConfigurationMap.add(new org.bouncycastle.cert.ocsp.OCSPReqBuilder.RequestObject(certificateID, extensions));
        return this;
    }

    class RequestObject {
        org.bouncycastle.cert.ocsp.CertificateID Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges;

        public RequestObject(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.asn1.x509.Extensions extensions) {
            this.Camera2StreamConfigurationMap = certificateID;
            this.getHighSpeedVideoFpsRanges = extensions;
        }
    }

    public org.bouncycastle.cert.ocsp.OCSPReqBuilder addRequest(org.bouncycastle.cert.ocsp.CertificateID certificateID) {
        this.Camera2StreamConfigurationMap.add(new org.bouncycastle.cert.ocsp.OCSPReqBuilder.RequestObject(certificateID, null));
        return this;
    }
}
