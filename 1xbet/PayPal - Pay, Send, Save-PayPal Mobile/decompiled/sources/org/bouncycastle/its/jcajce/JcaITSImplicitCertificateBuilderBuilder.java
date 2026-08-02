package org.bouncycastle.its.jcajce;

/* loaded from: classes17.dex */
public class JcaITSImplicitCertificateBuilderBuilder {
    private org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder Camera2StreamConfigurationMap = new org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder();

    public org.bouncycastle.its.jcajce.JcaITSImplicitCertificateBuilderBuilder setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap.setProvider(provider);
        return this;
    }

    public org.bouncycastle.its.jcajce.JcaITSImplicitCertificateBuilderBuilder setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap.setProvider(str);
        return this;
    }

    public org.bouncycastle.its.ITSImplicitCertificateBuilder build(org.bouncycastle.its.ITSCertificate iTSCertificate, org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.its.ITSImplicitCertificateBuilder(iTSCertificate, this.Camera2StreamConfigurationMap.build(), builder);
    }
}
