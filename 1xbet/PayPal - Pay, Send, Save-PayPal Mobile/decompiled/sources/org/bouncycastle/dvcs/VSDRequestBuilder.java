package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class VSDRequestBuilder extends org.bouncycastle.dvcs.DVCSRequestBuilder {
    public void setRequestTime(java.util.Date date) {
        this.requestInformationBuilder.setRequestTime(new org.bouncycastle.asn1.dvcs.DVCSTime(date));
    }

    public org.bouncycastle.dvcs.DVCSRequest build(org.bouncycastle.cms.CMSSignedData cMSSignedData) throws org.bouncycastle.dvcs.DVCSException {
        try {
            return createDVCRequest(new org.bouncycastle.asn1.dvcs.Data(cMSSignedData.getEncoded()));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.dvcs.DVCSException("Failed to encode CMS signed data", e);
        }
    }

    public VSDRequestBuilder() {
        super(new org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.ServiceType.VSD));
    }
}
