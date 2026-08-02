package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcePasswordRecipientInfoGenerator extends org.bouncycastle.cms.PasswordRecipientInfoGenerator {
    private org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cms.jcajce.JcePasswordRecipientInfoGenerator setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JcePasswordRecipientInfoGenerator setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] generateEncryptedBytes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr, org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        java.security.Key highResolutionOutputSizeshNQ4ISI = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(genericKey);
        javax.crypto.Cipher outputMinFrameDuration = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration(algorithmIdentifier.getAlgorithm());
        try {
            outputMinFrameDuration.init(3, new javax.crypto.spec.SecretKeySpec(bArr, outputMinFrameDuration.getAlgorithm()), new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(algorithmIdentifier.getParameters()).getOctets()));
            return outputMinFrameDuration.wrap(highResolutionOutputSizeshNQ4ISI);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot process content encryption key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cms.PasswordRecipientInfoGenerator
    public byte[] calculateDerivedKey(int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(i, this.password, algorithmIdentifier, i2);
    }

    public JcePasswordRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, char[] cArr) {
        super(aSN1ObjectIdentifier, cArr);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
    }
}
