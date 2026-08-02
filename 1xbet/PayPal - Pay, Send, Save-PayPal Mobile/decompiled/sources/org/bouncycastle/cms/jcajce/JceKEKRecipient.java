package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public abstract class JceKEKRecipient implements org.bouncycastle.cms.KEKRecipient {
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper contentHelper;
    private javax.crypto.SecretKey getHighResolutionOutputSizeshNQ4ISI;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper helper;
    protected boolean validateKeySize;

    public org.bouncycastle.cms.jcajce.JceKEKRecipient setProvider(java.security.Provider provider) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipient setProvider(java.lang.String str) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipient setKeySizeValidation(boolean z) {
        this.validateKeySize = z;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipient setContentProvider(java.security.Provider provider) {
        this.contentHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipient setContentProvider(java.lang.String str) {
        this.contentHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    protected java.security.Key extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        try {
            java.security.Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), this.helper.createSymmetricUnwrapper(algorithmIdentifier, this.getHighResolutionOutputSizeshNQ4ISI).generateUnwrappedKey(algorithmIdentifier2, bArr));
            if (this.validateKeySize) {
                this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
            }
            return jceKey;
        } catch (org.bouncycastle.operator.OperatorException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public JceKEKRecipient(javax.crypto.SecretKey secretKey) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.validateKeySize = false;
        this.getHighResolutionOutputSizeshNQ4ISI = secretKey;
    }
}
