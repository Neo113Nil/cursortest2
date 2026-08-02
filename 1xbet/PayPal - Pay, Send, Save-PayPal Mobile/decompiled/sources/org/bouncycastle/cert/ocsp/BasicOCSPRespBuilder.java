package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class BasicOCSPRespBuilder {
    private org.bouncycastle.cert.ocsp.RespID Camera2StreamConfigurationMap;
    private java.util.List getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges = null;

    public org.bouncycastle.cert.ocsp.BasicOCSPResp build(org.bouncycastle.operator.ContentSigner contentSigner, org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr, java.util.Date date) throws org.bouncycastle.cert.ocsp.OCSPException {
        org.bouncycastle.asn1.DERSequence dERSequence;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder.ResponseObject responseObject : this.getHighSpeedVideoFpsRangesFor) {
            try {
                aSN1EncodableVector.add(new org.bouncycastle.asn1.ocsp.SingleResponse(responseObject.getHighSpeedVideoFpsRangesFor.toASN1Primitive(), responseObject.getHighResolutionOutputSizeshNQ4ISI, responseObject.getHighSpeedVideoSizesFor, responseObject.Camera2StreamConfigurationMap, responseObject.getHighSpeedVideoSizes));
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.cert.ocsp.OCSPException("exception creating Request", e);
            }
        }
        org.bouncycastle.asn1.ocsp.ResponseData responseData = new org.bouncycastle.asn1.ocsp.ResponseData(this.Camera2StreamConfigurationMap.toASN1Primitive(), new org.bouncycastle.asn1.ASN1GeneralizedTime(date), new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector), this.getHighSpeedVideoFpsRanges);
        try {
            java.io.OutputStream outputStream = contentSigner.getOutputStream();
            outputStream.write(responseData.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            org.bouncycastle.asn1.DERBitString dERBitString = new org.bouncycastle.asn1.DERBitString(contentSigner.getSignature());
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = contentSigner.getAlgorithmIdentifier();
            if (x509CertificateHolderArr == null || x509CertificateHolderArr.length <= 0) {
                dERSequence = null;
            } else {
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                for (int i = 0; i != x509CertificateHolderArr.length; i++) {
                    aSN1EncodableVector2.add(x509CertificateHolderArr[i].toASN1Structure());
                }
                dERSequence = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2);
            }
            return new org.bouncycastle.cert.ocsp.BasicOCSPResp(new org.bouncycastle.asn1.ocsp.BasicOCSPResponse(responseData, algorithmIdentifier, dERBitString, dERSequence));
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception processing TBSRequest: ");
            sb.append(e2.getMessage());
            throw new org.bouncycastle.cert.ocsp.OCSPException(sb.toString(), e2);
        }
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder setResponseExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = extensions;
        return this;
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus, org.bouncycastle.asn1.x509.Extensions extensions) {
        addResponse(certificateID, certificateStatus, new java.util.Date(), null, extensions);
        return this;
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus, java.util.Date date, org.bouncycastle.asn1.x509.Extensions extensions) {
        addResponse(certificateID, certificateStatus, new java.util.Date(), date, extensions);
        return this;
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRangesFor.add(new org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder.ResponseObject(certificateID, certificateStatus, date, date2, extensions));
        return this;
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus, java.util.Date date, java.util.Date date2) {
        addResponse(certificateID, certificateStatus, date, date2, null);
        return this;
    }

    public org.bouncycastle.cert.ocsp.BasicOCSPRespBuilder addResponse(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus) {
        addResponse(certificateID, certificateStatus, new java.util.Date(), null, null);
        return this;
    }

    class ResponseObject {
        org.bouncycastle.asn1.ASN1GeneralizedTime Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.ocsp.CertStatus getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.cert.ocsp.CertificateID getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
        org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoSizesFor;

        public ResponseObject(org.bouncycastle.cert.ocsp.CertificateID certificateID, org.bouncycastle.cert.ocsp.CertificateStatus certificateStatus, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x509.Extensions extensions) {
            org.bouncycastle.asn1.ocsp.CertStatus certStatus;
            this.getHighSpeedVideoFpsRangesFor = certificateID;
            if (certificateStatus == null) {
                certStatus = new org.bouncycastle.asn1.ocsp.CertStatus();
            } else if (certificateStatus instanceof org.bouncycastle.cert.ocsp.UnknownStatus) {
                certStatus = new org.bouncycastle.asn1.ocsp.CertStatus(2, org.bouncycastle.asn1.DERNull.INSTANCE);
            } else {
                org.bouncycastle.cert.ocsp.RevokedStatus revokedStatus = (org.bouncycastle.cert.ocsp.RevokedStatus) certificateStatus;
                certStatus = revokedStatus.hasRevocationReason() ? new org.bouncycastle.asn1.ocsp.CertStatus(new org.bouncycastle.asn1.ocsp.RevokedInfo(new org.bouncycastle.asn1.ASN1GeneralizedTime(revokedStatus.getRevocationTime()), org.bouncycastle.asn1.x509.CRLReason.lookup(revokedStatus.getRevocationReason()))) : new org.bouncycastle.asn1.ocsp.CertStatus(new org.bouncycastle.asn1.ocsp.RevokedInfo(new org.bouncycastle.asn1.ASN1GeneralizedTime(revokedStatus.getRevocationTime()), null));
            }
            this.getHighResolutionOutputSizeshNQ4ISI = certStatus;
            this.getHighSpeedVideoSizesFor = new org.bouncycastle.asn1.DERGeneralizedTime(date);
            this.Camera2StreamConfigurationMap = date2 != null ? new org.bouncycastle.asn1.DERGeneralizedTime(date2) : null;
            this.getHighSpeedVideoSizes = extensions;
        }
    }

    public BasicOCSPRespBuilder(org.bouncycastle.cert.ocsp.RespID respID) {
        this.Camera2StreamConfigurationMap = respID;
    }

    public BasicOCSPRespBuilder(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cert.ocsp.OCSPException {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.ocsp.RespID(subjectPublicKeyInfo, digestCalculator);
    }
}
