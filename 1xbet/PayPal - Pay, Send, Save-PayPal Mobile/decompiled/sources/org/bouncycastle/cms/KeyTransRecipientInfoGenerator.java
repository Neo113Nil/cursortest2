package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class KeyTransRecipientInfoGenerator implements org.bouncycastle.cms.RecipientInfoGenerator {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.IssuerAndSerialNumber getHighSpeedVideoSizes;
    protected final org.bouncycastle.operator.AsymmetricKeyWrapper wrapper;

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public final org.bouncycastle.asn1.cms.RecipientInfo generate(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        try {
            byte[] generateWrappedKey = this.wrapper.generateWrappedKey(genericKey);
            org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber = this.getHighSpeedVideoSizes;
            return new org.bouncycastle.asn1.cms.RecipientInfo(new org.bouncycastle.asn1.cms.KeyTransRecipientInfo(issuerAndSerialNumber != null ? new org.bouncycastle.asn1.cms.RecipientIdentifier(issuerAndSerialNumber) : new org.bouncycastle.asn1.cms.RecipientIdentifier((org.bouncycastle.asn1.ASN1OctetString) new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI)), this.wrapper.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DEROctetString(generateWrappedKey)));
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception wrapping content key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public KeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.operator.AsymmetricKeyWrapper asymmetricKeyWrapper) {
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.wrapper = asymmetricKeyWrapper;
    }

    public KeyTransRecipientInfoGenerator(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber, org.bouncycastle.operator.AsymmetricKeyWrapper asymmetricKeyWrapper) {
        this.getHighSpeedVideoSizes = issuerAndSerialNumber;
        this.wrapper = asymmetricKeyWrapper;
    }
}
