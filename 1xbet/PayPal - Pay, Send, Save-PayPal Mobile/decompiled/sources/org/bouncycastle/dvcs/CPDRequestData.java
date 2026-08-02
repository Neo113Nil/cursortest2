package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class CPDRequestData extends org.bouncycastle.dvcs.DVCSRequestData {
    CPDRequestData(org.bouncycastle.asn1.dvcs.Data data) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(data);
        if (this.data.getMessage() == null) {
            throw new org.bouncycastle.dvcs.DVCSConstructionException("DVCSRequest.data.message should be specified for CPD service");
        }
    }

    public byte[] getMessage() {
        return this.data.getMessage().getOctets();
    }
}
