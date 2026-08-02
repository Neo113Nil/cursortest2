package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class VSDRequestData extends org.bouncycastle.dvcs.DVCSRequestData {
    private org.bouncycastle.cms.CMSSignedData Camera2StreamConfigurationMap;

    VSDRequestData(org.bouncycastle.asn1.dvcs.Data data) throws org.bouncycastle.dvcs.DVCSConstructionException {
        super(data);
        if (this.Camera2StreamConfigurationMap == null) {
            if (this.data.getMessage() == null) {
                throw new org.bouncycastle.dvcs.DVCSConstructionException("DVCSRequest.data.message should be specified for VSD service");
            }
            try {
                this.Camera2StreamConfigurationMap = new org.bouncycastle.cms.CMSSignedData(this.data.getMessage().getOctets());
            } catch (org.bouncycastle.cms.CMSException e) {
                throw new org.bouncycastle.dvcs.DVCSConstructionException("Can't read CMS SignedData from input", e);
            }
        }
    }

    public org.bouncycastle.cms.CMSSignedData getParsedMessage() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getMessage() {
        return this.data.getMessage().getOctets();
    }
}
