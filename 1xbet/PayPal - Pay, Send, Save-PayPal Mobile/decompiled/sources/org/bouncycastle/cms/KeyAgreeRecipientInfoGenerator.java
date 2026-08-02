package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class KeyAgreeRecipientInfoGenerator implements org.bouncycastle.cms.RecipientInfoGenerator {
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    protected abstract org.bouncycastle.asn1.ASN1Sequence generateRecipientEncryptedKeys(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException;

    protected abstract byte[] getUserKeyingMaterial(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cms.CMSException;

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public org.bouncycastle.asn1.cms.RecipientInfo generate(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey originatorIdentifierOrKey = new org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey(createOriginatorPublicKey(this.getHighResolutionOutputSizeshNQ4ISI));
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = (org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.getId()) || this.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMSRC2wrap)) ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes, org.bouncycastle.asn1.DERNull.INSTANCE) : org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor) ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes, new org.bouncycastle.asn1.cryptopro.Gost2814789KeyWrapParameters(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet)) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, algorithmIdentifier);
        org.bouncycastle.asn1.ASN1Sequence generateRecipientEncryptedKeys = generateRecipientEncryptedKeys(algorithmIdentifier2, algorithmIdentifier, genericKey);
        byte[] userKeyingMaterial = getUserKeyingMaterial(algorithmIdentifier2);
        return userKeyingMaterial != null ? new org.bouncycastle.asn1.cms.RecipientInfo(new org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo(originatorIdentifierOrKey, new org.bouncycastle.asn1.DEROctetString(userKeyingMaterial), algorithmIdentifier2, generateRecipientEncryptedKeys)) : new org.bouncycastle.asn1.cms.RecipientInfo(new org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo(originatorIdentifierOrKey, null, algorithmIdentifier2, generateRecipientEncryptedKeys));
    }

    protected org.bouncycastle.asn1.cms.OriginatorPublicKey createOriginatorPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new org.bouncycastle.asn1.cms.OriginatorPublicKey(subjectPublicKeyInfo.getAlgorithm(), subjectPublicKeyInfo.getPublicKeyData().getBytes());
    }

    public KeyAgreeRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.getHighResolutionOutputSizeshNQ4ISI = subjectPublicKeyInfo;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier2;
    }
}
