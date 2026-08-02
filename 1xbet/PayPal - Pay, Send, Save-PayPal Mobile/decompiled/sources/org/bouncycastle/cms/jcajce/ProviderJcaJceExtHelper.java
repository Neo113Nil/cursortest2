package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
class ProviderJcaJceExtHelper extends org.bouncycastle.jcajce.util.ProviderJcaJceHelper implements org.bouncycastle.cms.jcajce.JcaJceExtHelper {
    @Override // org.bouncycastle.cms.jcajce.JcaJceExtHelper
    public final org.bouncycastle.operator.SymmetricKeyUnwrapper getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, javax.crypto.SecretKey secretKey) {
        return new org.bouncycastle.operator.jcajce.JceSymmetricKeyUnwrapper(algorithmIdentifier, secretKey).setProvider(this.provider);
    }

    @Override // org.bouncycastle.cms.jcajce.JcaJceExtHelper
    public final org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return new org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper(algorithmIdentifier, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey), bArr, bArr2).setProvider(this.provider);
    }

    @Override // org.bouncycastle.cms.jcajce.JcaJceExtHelper
    public final org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey) {
        return new org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper(algorithmIdentifier, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey)).setProvider(this.provider);
    }

    public ProviderJcaJceExtHelper(java.security.Provider provider) {
        super(provider);
    }
}
