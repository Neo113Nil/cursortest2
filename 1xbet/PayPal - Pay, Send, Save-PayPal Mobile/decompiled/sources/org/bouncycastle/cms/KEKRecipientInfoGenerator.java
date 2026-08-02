package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public abstract class KEKRecipientInfoGenerator implements org.bouncycastle.cms.RecipientInfoGenerator {
    private final org.bouncycastle.asn1.cms.KEKIdentifier getHighSpeedVideoSizes;
    protected final org.bouncycastle.operator.SymmetricKeyWrapper wrapper;

    @Override // org.bouncycastle.cms.RecipientInfoGenerator
    public final org.bouncycastle.asn1.cms.RecipientInfo generate(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        try {
            return new org.bouncycastle.asn1.cms.RecipientInfo(new org.bouncycastle.asn1.cms.KEKRecipientInfo(this.getHighSpeedVideoSizes, this.wrapper.getAlgorithmIdentifier(), new org.bouncycastle.asn1.DEROctetString(this.wrapper.generateWrappedKey(genericKey))));
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception wrapping content key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public KEKRecipientInfoGenerator(org.bouncycastle.asn1.cms.KEKIdentifier kEKIdentifier, org.bouncycastle.operator.SymmetricKeyWrapper symmetricKeyWrapper) {
        this.getHighSpeedVideoSizes = kEKIdentifier;
        this.wrapper = symmetricKeyWrapper;
    }
}
