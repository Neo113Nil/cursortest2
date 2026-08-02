package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class DVCSResponse extends org.bouncycastle.dvcs.DVCSMessage {
    private org.bouncycastle.asn1.dvcs.DVCSResponse getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.dvcs.DVCSMessage
    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public DVCSResponse(org.bouncycastle.cms.CMSSignedData cMSSignedData) throws org.bouncycastle.dvcs.DVCSConstructionException {
        this(org.bouncycastle.asn1.cms.SignedData.getInstance(cMSSignedData.toASN1Structure().getContent()).getEncapContentInfo());
    }

    public DVCSResponse(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(contentInfo);
        if (!org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers.id_ct_DVCSResponseData.equals((org.bouncycastle.asn1.ASN1Primitive) contentInfo.getContentType())) {
            throw new org.bouncycastle.dvcs.DVCSConstructionException("ContentInfo not a DVCS Response");
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.dvcs.DVCSResponse.getInstance(contentInfo.getContent().toASN1Primitive() instanceof org.bouncycastle.asn1.ASN1Sequence ? contentInfo.getContent() : org.bouncycastle.asn1.ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse content: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.dvcs.DVCSConstructionException(sb.toString(), e);
        }
    }
}
