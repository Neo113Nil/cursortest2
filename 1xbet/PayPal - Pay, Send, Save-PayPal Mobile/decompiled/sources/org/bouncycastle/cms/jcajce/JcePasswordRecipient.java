package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public abstract class JcePasswordRecipient implements org.bouncycastle.cms.PasswordRecipient {
    private char[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes = 1;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper helper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());

    public org.bouncycastle.cms.jcajce.JcePasswordRecipient setProvider(java.security.Provider provider) {
        this.helper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcePasswordRecipient setProvider(java.lang.String str) {
        this.helper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcePasswordRecipient setPasswordConversionScheme(int i) {
        this.getHighSpeedVideoSizes = i;
        return this;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public int getPasswordConversionScheme() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public char[] getPassword() {
        return this.Camera2StreamConfigurationMap;
    }

    protected java.security.Key extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException {
        javax.crypto.Cipher outputMinFrameDuration = this.helper.getOutputMinFrameDuration(algorithmIdentifier.getAlgorithm());
        try {
            outputMinFrameDuration.init(4, new javax.crypto.spec.SecretKeySpec(bArr, outputMinFrameDuration.getAlgorithm()), new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
            return outputMinFrameDuration.unwrap(bArr2, algorithmIdentifier2.getAlgorithm().getId(), 3);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot process content encryption key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cms.PasswordRecipient
    public byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException {
        return this.helper.getHighSpeedVideoSizes(i, this.Camera2StreamConfigurationMap, algorithmIdentifier, i2);
    }

    JcePasswordRecipient(char[] cArr) {
        this.Camera2StreamConfigurationMap = cArr;
    }
}
