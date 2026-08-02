package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JcaITSExplicitCertificateBuilder extends org.bouncycastle.its.ITSExplicitCertificateBuilder {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;

    public org.bouncycastle.its.jcajce.JcaITSExplicitCertificateBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.its.jcajce.JcaITSExplicitCertificateBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPublicKey eCPublicKey2) {
        return super.build(certificateId, new org.bouncycastle.its.jcajce.JcaITSPublicVerificationKey(eCPublicKey, this.getHighSpeedVideoSizes), eCPublicKey2 != null ? new org.bouncycastle.its.jcajce.JceITSPublicEncryptionKey(eCPublicKey2, this.getHighSpeedVideoSizes) : null);
    }

    public org.bouncycastle.its.ITSCertificate build(org.bouncycastle.oer.its.CertificateId certificateId, java.security.interfaces.ECPublicKey eCPublicKey) {
        return build(certificateId, eCPublicKey, (java.security.interfaces.ECPublicKey) null);
    }

    private JcaITSExplicitCertificateBuilder(org.bouncycastle.its.operator.ITSContentSigner iTSContentSigner, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        super(iTSContentSigner, builder);
        this.getHighSpeedVideoSizes = jcaJceHelper;
    }

    public JcaITSExplicitCertificateBuilder(org.bouncycastle.its.operator.ITSContentSigner iTSContentSigner, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
        this(iTSContentSigner, builder, new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
    }
}
