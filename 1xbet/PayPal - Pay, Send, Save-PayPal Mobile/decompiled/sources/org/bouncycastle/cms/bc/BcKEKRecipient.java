package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public abstract class BcKEKRecipient implements org.bouncycastle.cms.KEKRecipient {
    private org.bouncycastle.operator.SymmetricKeyUnwrapper Camera2StreamConfigurationMap;

    protected org.bouncycastle.crypto.CipherParameters extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.cms.bc.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.generateUnwrappedKey(algorithmIdentifier2, bArr));
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public BcKEKRecipient(org.bouncycastle.operator.bc.BcSymmetricKeyUnwrapper bcSymmetricKeyUnwrapper) {
        this.Camera2StreamConfigurationMap = bcSymmetricKeyUnwrapper;
    }
}
