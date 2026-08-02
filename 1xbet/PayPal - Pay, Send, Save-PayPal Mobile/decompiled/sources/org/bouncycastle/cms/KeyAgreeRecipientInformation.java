package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KeyAgreeRecipientInformation extends org.bouncycastle.cms.RecipientInformation {
    private org.bouncycastle.asn1.ASN1OctetString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cms.RecipientInformation
    protected org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        org.bouncycastle.cms.KeyAgreeRecipient keyAgreeRecipient = (org.bouncycastle.cms.KeyAgreeRecipient) recipient;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier privateKeyAlgorithmIdentifier = keyAgreeRecipient.getPrivateKeyAlgorithmIdentifier();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.keyEncAlg;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = this.messageAlgorithm;
        org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey originator = this.getHighSpeedVideoSizes.getOriginator();
        org.bouncycastle.asn1.cms.OriginatorPublicKey originatorKey = originator.getOriginatorKey();
        if (originatorKey != null) {
            return keyAgreeRecipient.getRecipientOperator(algorithmIdentifier, algorithmIdentifier2, new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(privateKeyAlgorithmIdentifier, originatorKey.getPublicKey().getBytes()), this.getHighSpeedVideoSizes.getUserKeyingMaterial(), this.getHighResolutionOutputSizeshNQ4ISI.getOctets());
        }
        org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = originator.getIssuerAndSerialNumber();
        if (issuerAndSerialNumber != null) {
            new org.bouncycastle.cms.OriginatorId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
        } else {
            new org.bouncycastle.cms.OriginatorId(originator.getSubjectKeyIdentifier().getKeyIdentifier());
        }
        throw new org.bouncycastle.cms.CMSException("No support for 'originator' as IssuerAndSerialNumber or SubjectKeyIdentifier");
    }

    public byte[] getUserKeyingMaterial() {
        org.bouncycastle.asn1.ASN1OctetString userKeyingMaterial = this.getHighSpeedVideoSizes.getUserKeyingMaterial();
        if (userKeyingMaterial != null) {
            return org.bouncycastle.util.Arrays.clone(userKeyingMaterial.getOctets());
        }
        return null;
    }

    public org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey getOriginator() {
        return this.getHighSpeedVideoSizes.getOriginator();
    }

    static void Camera2StreamConfigurationMap(java.util.List list, org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo keyAgreeRecipientInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        org.bouncycastle.asn1.ASN1Sequence recipientEncryptedKeys = keyAgreeRecipientInfo.getRecipientEncryptedKeys();
        for (int i = 0; i < recipientEncryptedKeys.size(); i++) {
            org.bouncycastle.asn1.cms.RecipientEncryptedKey recipientEncryptedKey = org.bouncycastle.asn1.cms.RecipientEncryptedKey.getInstance(recipientEncryptedKeys.getObjectAt(i));
            org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier identifier = recipientEncryptedKey.getIdentifier();
            org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = identifier.getIssuerAndSerialNumber();
            list.add(new org.bouncycastle.cms.KeyAgreeRecipientInformation(keyAgreeRecipientInfo, issuerAndSerialNumber != null ? new org.bouncycastle.cms.KeyAgreeRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue()) : new org.bouncycastle.cms.KeyAgreeRecipientId(identifier.getRKeyID().getSubjectKeyIdentifier().getOctets()), recipientEncryptedKey.getEncryptedKey(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        }
    }

    private KeyAgreeRecipientInformation(org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo keyAgreeRecipientInfo, org.bouncycastle.cms.RecipientId recipientId, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        super(keyAgreeRecipientInfo.getKeyEncryptionAlgorithm(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        this.getHighSpeedVideoSizes = keyAgreeRecipientInfo;
        this.rid = recipientId;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1OctetString;
    }
}
