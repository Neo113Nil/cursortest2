package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KeyTransRecipientInformation extends org.bouncycastle.cms.RecipientInformation {
    private org.bouncycastle.asn1.cms.KeyTransRecipientInfo getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.cms.RecipientInformation
    protected org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException {
        return ((org.bouncycastle.cms.KeyTransRecipient) recipient).getRecipientOperator(this.keyEncAlg, this.messageAlgorithm, this.getHighResolutionOutputSizeshNQ4ISI.getEncryptedKey().getOctets());
    }

    KeyTransRecipientInformation(org.bouncycastle.asn1.cms.KeyTransRecipientInfo keyTransRecipientInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        super(keyTransRecipientInfo.getKeyEncryptionAlgorithm(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        org.bouncycastle.cms.KeyTransRecipientId keyTransRecipientId;
        this.getHighResolutionOutputSizeshNQ4ISI = keyTransRecipientInfo;
        org.bouncycastle.asn1.cms.RecipientIdentifier recipientIdentifier = keyTransRecipientInfo.getRecipientIdentifier();
        boolean isTagged = recipientIdentifier.isTagged();
        org.bouncycastle.asn1.ASN1Encodable id = recipientIdentifier.getId();
        if (isTagged) {
            keyTransRecipientId = new org.bouncycastle.cms.KeyTransRecipientId(org.bouncycastle.asn1.ASN1OctetString.getInstance(id).getOctets());
        } else {
            org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = org.bouncycastle.asn1.cms.IssuerAndSerialNumber.getInstance(id);
            keyTransRecipientId = new org.bouncycastle.cms.KeyTransRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        }
        this.rid = keyTransRecipientId;
    }
}
