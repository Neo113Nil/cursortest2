package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampResponse {
    org.bouncycastle.asn1.tsp.TimeStampResp Camera2StreamConfigurationMap;
    org.bouncycastle.tsp.TimeStampToken getHighSpeedVideoFpsRangesFor;

    public void validate(org.bouncycastle.tsp.TimeStampRequest timeStampRequest) throws org.bouncycastle.tsp.TSPException {
        org.bouncycastle.tsp.TimeStampToken timeStampToken = getTimeStampToken();
        if (timeStampToken == null) {
            if (getStatus() == 0 || getStatus() == 1) {
                throw new org.bouncycastle.tsp.TSPValidationException("no time stamp token found and one expected.");
            }
            return;
        }
        org.bouncycastle.tsp.TimeStampTokenInfo timeStampInfo = timeStampToken.getTimeStampInfo();
        if (timeStampRequest.getNonce() != null && !timeStampRequest.getNonce().equals(timeStampInfo.getNonce())) {
            throw new org.bouncycastle.tsp.TSPValidationException("response contains wrong nonce value.");
        }
        if (getStatus() != 0 && getStatus() != 1) {
            throw new org.bouncycastle.tsp.TSPValidationException("time stamp token found in failed request.");
        }
        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(timeStampRequest.getMessageImprintDigest(), timeStampInfo.getMessageImprintDigest())) {
            throw new org.bouncycastle.tsp.TSPValidationException("response for different message imprint digest.");
        }
        if (!timeStampInfo.getMessageImprintAlgOID().equals((org.bouncycastle.asn1.ASN1Primitive) timeStampRequest.getMessageImprintAlgOID())) {
            throw new org.bouncycastle.tsp.TSPValidationException("response for different message imprint algorithm.");
        }
        org.bouncycastle.asn1.cms.Attribute attribute = timeStampToken.getSignedAttributes().get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificate);
        org.bouncycastle.asn1.cms.Attribute attribute2 = timeStampToken.getSignedAttributes().get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificateV2);
        if (attribute == null && attribute2 == null) {
            throw new org.bouncycastle.tsp.TSPValidationException("no signing certificate attribute present.");
        }
        if (timeStampRequest.getReqPolicy() != null && !timeStampRequest.getReqPolicy().equals((org.bouncycastle.asn1.ASN1Primitive) timeStampInfo.getPolicy())) {
            throw new org.bouncycastle.tsp.TSPValidationException("TSA policy wrong for request.");
        }
    }

    public org.bouncycastle.tsp.TimeStampToken getTimeStampToken() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getStatusString() {
        if (this.Camera2StreamConfigurationMap.getStatus().getStatusString() == null) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        org.bouncycastle.asn1.cmp.PKIFreeText statusString = this.Camera2StreamConfigurationMap.getStatus().getStatusString();
        for (int i = 0; i != statusString.size(); i++) {
            stringBuffer.append(statusString.getStringAtUTF8(i).getString());
        }
        return stringBuffer.toString();
    }

    public int getStatus() {
        return this.Camera2StreamConfigurationMap.getStatus().getStatus().intValue();
    }

    public org.bouncycastle.asn1.cmp.PKIFailureInfo getFailInfo() {
        if (this.Camera2StreamConfigurationMap.getStatus().getFailInfo() != null) {
            return new org.bouncycastle.asn1.cmp.PKIFailureInfo(this.Camera2StreamConfigurationMap.getStatus().getFailInfo());
        }
        return null;
    }

    public byte[] getEncoded(java.lang.String str) throws java.io.IOException {
        return org.bouncycastle.asn1.ASN1Encoding.DL.equals(str) ? this.getHighSpeedVideoFpsRangesFor == null ? new org.bouncycastle.asn1.DLSequence(this.Camera2StreamConfigurationMap.getStatus()).getEncoded(str) : new org.bouncycastle.asn1.DLSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.Camera2StreamConfigurationMap.getStatus(), this.getHighSpeedVideoFpsRangesFor.toCMSSignedData().toASN1Structure()}).getEncoded(str) : this.Camera2StreamConfigurationMap.getEncoded(str);
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getEncoded();
    }

    private static org.bouncycastle.asn1.tsp.TimeStampResp Camera2StreamConfigurationMap(java.io.InputStream inputStream) throws java.io.IOException, org.bouncycastle.tsp.TSPException {
        try {
            return org.bouncycastle.asn1.tsp.TimeStampResp.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject());
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.tsp.TSPException("malformed timestamp response: ".concat(java.lang.String.valueOf(e)), e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.tsp.TSPException("malformed timestamp response: ".concat(java.lang.String.valueOf(e2)), e2);
        }
    }

    public TimeStampResponse(byte[] bArr) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    public TimeStampResponse(org.bouncycastle.asn1.tsp.TimeStampResp timeStampResp) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        this.Camera2StreamConfigurationMap = timeStampResp;
        if (timeStampResp.getTimeStampToken() != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.tsp.TimeStampToken(timeStampResp.getTimeStampToken());
        }
    }

    TimeStampResponse(org.bouncycastle.asn1.DLSequence dLSequence) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        try {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.tsp.TimeStampResp.getInstance(dLSequence);
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.tsp.TimeStampToken(org.bouncycastle.asn1.cms.ContentInfo.getInstance(dLSequence.getObjectAt(1)));
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.tsp.TSPException("malformed timestamp response: ".concat(java.lang.String.valueOf(e)), e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.tsp.TSPException("malformed timestamp response: ".concat(java.lang.String.valueOf(e2)), e2);
        }
    }

    public TimeStampResponse(java.io.InputStream inputStream) throws org.bouncycastle.tsp.TSPException, java.io.IOException {
        this(Camera2StreamConfigurationMap(inputStream));
    }
}
