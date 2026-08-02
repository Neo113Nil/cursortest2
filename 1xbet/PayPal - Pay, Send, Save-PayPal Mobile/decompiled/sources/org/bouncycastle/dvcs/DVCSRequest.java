package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class DVCSRequest extends org.bouncycastle.dvcs.DVCSMessage {
    private org.bouncycastle.dvcs.DVCSRequestData Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.dvcs.DVCSRequest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.dvcs.DVCSRequestInfo getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.GeneralName getTransactionIdentifier() {
        return this.getHighSpeedVideoFpsRanges.getTransactionIdentifier();
    }

    public org.bouncycastle.dvcs.DVCSRequestInfo getRequestInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.dvcs.DVCSRequestData getData() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.dvcs.DVCSMessage
    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public DVCSRequest(org.bouncycastle.cms.CMSSignedData cMSSignedData) throws org.bouncycastle.dvcs.DVCSConstructionException {
        this(org.bouncycastle.asn1.cms.SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }

    public DVCSRequest(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(contentInfo);
        org.bouncycastle.dvcs.DVCSRequestData cCPDRequestData;
        if (!org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers.id_ct_DVCSRequestData.equals((org.bouncycastle.asn1.ASN1Primitive) contentInfo.getContentType())) {
            throw new org.bouncycastle.dvcs.DVCSConstructionException("ContentInfo not a DVCS Request");
        }
        try {
            org.bouncycastle.asn1.dvcs.DVCSRequest dVCSRequest = org.bouncycastle.asn1.dvcs.DVCSRequest.getInstance(contentInfo.getContent().toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1Sequence ? contentInfo.getContent() : org.bouncycastle.asn1.ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
            this.getHighSpeedVideoFpsRanges = dVCSRequest;
            org.bouncycastle.dvcs.DVCSRequestInfo dVCSRequestInfo = new org.bouncycastle.dvcs.DVCSRequestInfo(dVCSRequest.getRequestInformation());
            this.getHighSpeedVideoFpsRangesFor = dVCSRequestInfo;
            int serviceType = dVCSRequestInfo.getServiceType();
            if (serviceType == org.bouncycastle.asn1.dvcs.ServiceType.CPD.getValue().intValue()) {
                cCPDRequestData = new org.bouncycastle.dvcs.CPDRequestData(this.getHighSpeedVideoFpsRanges.getData());
            } else if (serviceType == org.bouncycastle.asn1.dvcs.ServiceType.VSD.getValue().intValue()) {
                cCPDRequestData = new org.bouncycastle.dvcs.VSDRequestData(this.getHighSpeedVideoFpsRanges.getData());
            } else if (serviceType == org.bouncycastle.asn1.dvcs.ServiceType.VPKC.getValue().intValue()) {
                cCPDRequestData = new org.bouncycastle.dvcs.VPKCRequestData(this.getHighSpeedVideoFpsRanges.getData());
            } else {
                if (serviceType != org.bouncycastle.asn1.dvcs.ServiceType.CCPD.getValue().intValue()) {
                    throw new org.bouncycastle.dvcs.DVCSConstructionException("Unknown service type: ".concat(java.lang.String.valueOf(serviceType)));
                }
                cCPDRequestData = new org.bouncycastle.dvcs.CCPDRequestData(this.getHighSpeedVideoFpsRanges.getData());
            }
            this.Camera2StreamConfigurationMap = cCPDRequestData;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse content: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.dvcs.DVCSConstructionException(sb.toString(), e);
        }
    }
}
