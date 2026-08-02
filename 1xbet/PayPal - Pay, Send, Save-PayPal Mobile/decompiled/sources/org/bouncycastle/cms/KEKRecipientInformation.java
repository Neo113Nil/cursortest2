package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KEKRecipientInformation extends org.bouncycastle.cms.RecipientInformation {
    private org.bouncycastle.asn1.cms.KEKRecipientInfo getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.cms.RecipientInformation
    protected org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        return ((org.bouncycastle.cms.KEKRecipient) recipient).getRecipientOperator(this.keyEncAlg, this.messageAlgorithm, this.getHighSpeedVideoFpsRangesFor.getEncryptedKey().getOctets());
    }

    KEKRecipientInformation(org.bouncycastle.asn1.cms.KEKRecipientInfo kEKRecipientInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        super(kEKRecipientInfo.getKeyEncryptionAlgorithm(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        this.getHighSpeedVideoFpsRangesFor = kEKRecipientInfo;
        this.rid = new org.bouncycastle.cms.KEKRecipientId(kEKRecipientInfo.getKekid().getKeyIdentifier().getOctets());
    }
}
