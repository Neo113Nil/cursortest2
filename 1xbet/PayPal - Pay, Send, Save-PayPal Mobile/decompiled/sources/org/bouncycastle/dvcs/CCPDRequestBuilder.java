package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class CCPDRequestBuilder extends org.bouncycastle.dvcs.DVCSRequestBuilder {
    public org.bouncycastle.dvcs.DVCSRequest build(org.bouncycastle.dvcs.MessageImprint messageImprint) throws org.bouncycastle.dvcs.DVCSException {
        return createDVCRequest(new org.bouncycastle.asn1.dvcs.Data(messageImprint.toASN1Structure()));
    }

    public CCPDRequestBuilder() {
        super(new org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.ServiceType.CCPD));
    }
}
