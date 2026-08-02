package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class PasswordRecipientInformation extends org.bouncycastle.cms.RecipientInformation {
    static java.util.Map getHighSpeedVideoFpsRanges = new java.util.HashMap();
    static java.util.Map getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cms.PasswordRecipientInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cms.RecipientInformation
    protected org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.cms.Recipient recipient) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        org.bouncycastle.cms.PasswordRecipient passwordRecipient = (org.bouncycastle.cms.PasswordRecipient) recipient;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.getHighSpeedVideoSizes.getKeyEncryptionAlgorithm()).getParameters());
        return passwordRecipient.getRecipientOperator(algorithmIdentifier, this.messageAlgorithm, passwordRecipient.calculateDerivedKey(passwordRecipient.getPasswordConversionScheme(), getKeyDerivationAlgorithm(), ((java.lang.Integer) getHighSpeedVideoFpsRanges.get(algorithmIdentifier.getAlgorithm())).intValue()), this.getHighSpeedVideoSizes.getEncryptedKey().getOctets());
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyDerivationAlgorithm() {
        return this.getHighSpeedVideoSizes.getKeyDerivationAlgorithm();
    }

    public byte[] getKeyDerivationAlgParams() {
        org.bouncycastle.asn1.ASN1Encodable parameters;
        try {
            if (this.getHighSpeedVideoSizes.getKeyDerivationAlgorithm() == null || (parameters = this.getHighSpeedVideoSizes.getKeyDerivationAlgorithm().getParameters()) == null) {
                return null;
            }
            return parameters.toASN1Primitive().getEncoded();
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("exception getting encryption parameters ".concat(java.lang.String.valueOf(e)));
        }
    }

    public java.lang.String getKeyDerivationAlgOID() {
        if (this.getHighSpeedVideoSizes.getKeyDerivationAlgorithm() != null) {
            return this.getHighSpeedVideoSizes.getKeyDerivationAlgorithm().getAlgorithm().getId();
        }
        return null;
    }

    PasswordRecipientInformation(org.bouncycastle.asn1.cms.PasswordRecipientInfo passwordRecipientInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.cms.CMSSecureReadable cMSSecureReadable, org.bouncycastle.cms.AuthAttributesProvider authAttributesProvider) {
        super(passwordRecipientInfo.getKeyEncryptionAlgorithm(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        this.getHighSpeedVideoSizes = passwordRecipientInfo;
        this.rid = new org.bouncycastle.cms.PasswordRecipientId();
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, org.bouncycastle.util.Integers.valueOf(8));
        getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, org.bouncycastle.util.Integers.valueOf(16));
        getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, org.bouncycastle.util.Integers.valueOf(16));
        getHighSpeedVideoFpsRangesFor.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, org.bouncycastle.util.Integers.valueOf(16));
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, org.bouncycastle.util.Integers.valueOf(192));
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, org.bouncycastle.util.Integers.valueOf(128));
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, org.bouncycastle.util.Integers.valueOf(192));
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, org.bouncycastle.util.Integers.valueOf(256));
    }
}
