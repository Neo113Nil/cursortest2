package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public abstract class BcKeyTransRecipient implements org.bouncycastle.cms.KeyTransRecipient {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighResolutionOutputSizeshNQ4ISI;

    protected org.bouncycastle.crypto.CipherParameters extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.cms.bc.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.operator.bc.BcRSAAsymmetricKeyUnwrapper(algorithmIdentifier, this.getHighResolutionOutputSizeshNQ4ISI).generateUnwrappedKey(algorithmIdentifier2, bArr));
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public BcKeyTransRecipient(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        this.getHighResolutionOutputSizeshNQ4ISI = asymmetricKeyParameter;
    }
}
