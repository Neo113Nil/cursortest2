package org.bouncycastle.dvcs;

/* loaded from: classes17.dex */
public class SignedDVCSMessageGenerator {
    private final org.bouncycastle.cms.CMSSignedDataGenerator getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.cms.CMSSignedData build(org.bouncycastle.dvcs.DVCSMessage dVCSMessage) throws org.bouncycastle.dvcs.DVCSException {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.generate(new org.bouncycastle.cms.CMSProcessableByteArray(dVCSMessage.getContentType(), dVCSMessage.getContent().toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)), true);
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.dvcs.DVCSException("Could not encode DVCS request", e);
        } catch (org.bouncycastle.cms.CMSException e2) {
            throw new org.bouncycastle.dvcs.DVCSException("Could not sign DVCS request", e2);
        }
    }

    public SignedDVCSMessageGenerator(org.bouncycastle.cms.CMSSignedDataGenerator cMSSignedDataGenerator) {
        this.getHighResolutionOutputSizeshNQ4ISI = cMSSignedDataGenerator;
    }
}
