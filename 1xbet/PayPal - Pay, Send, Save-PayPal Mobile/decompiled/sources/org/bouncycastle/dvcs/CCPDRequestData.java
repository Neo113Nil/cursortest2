package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class CCPDRequestData extends org.bouncycastle.dvcs.DVCSRequestData {
    CCPDRequestData(org.bouncycastle.asn1.dvcs.Data data) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(data);
        if (this.data.getMessageImprint() == null) {
            throw new org.bouncycastle.dvcs.DVCSConstructionException("DVCSRequest.data.messageImprint should be specified for CCPD service");
        }
    }

    public org.bouncycastle.dvcs.MessageImprint getMessageImprint() {
        return new org.bouncycastle.dvcs.MessageImprint(this.data.getMessageImprint());
    }
}
