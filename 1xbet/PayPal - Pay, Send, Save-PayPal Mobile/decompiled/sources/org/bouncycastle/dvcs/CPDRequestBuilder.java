package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class CPDRequestBuilder extends org.bouncycastle.dvcs.DVCSRequestBuilder {
    public org.bouncycastle.dvcs.DVCSRequest build(byte[] bArr) throws org.bouncycastle.dvcs.DVCSException {
        return createDVCRequest(new org.bouncycastle.asn1.dvcs.Data(bArr));
    }

    public CPDRequestBuilder() {
        super(new org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder(org.bouncycastle.asn1.dvcs.ServiceType.CPD));
    }
}
