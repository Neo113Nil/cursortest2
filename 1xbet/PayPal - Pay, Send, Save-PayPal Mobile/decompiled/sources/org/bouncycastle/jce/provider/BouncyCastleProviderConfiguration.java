package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class BouncyCastleProviderConfiguration implements org.bouncycastle.jcajce.provider.config.ProviderConfiguration {
    volatile java.lang.Object getHighSpeedVideoSizesFor;
    volatile org.bouncycastle.jce.spec.ECParameterSpec getOutputStallDurationlomOqCM;
    static java.security.Permission getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
    static java.security.Permission getInputFormats = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.EC_IMPLICITLY_CA);
    static java.security.Permission getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
    static java.security.Permission getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.DH_DEFAULT_PARAMS);
    static java.security.Permission getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.ACCEPTABLE_EC_CURVES);
    static java.security.Permission Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME, org.bouncycastle.jcajce.provider.config.ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);
    java.lang.ThreadLocal getOutputSizeshNQ4ISI = new java.lang.ThreadLocal();
    java.lang.ThreadLocal getOutputFormats = new java.lang.ThreadLocal();
    volatile java.util.Set getInputSizeshNQ4ISI = new java.util.HashSet();
    volatile java.util.Map getOutputMinFrameDuration = new java.util.HashMap();

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public org.bouncycastle.jce.spec.ECParameterSpec getEcImplicitlyCa() {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) this.getOutputSizeshNQ4ISI.get();
        return eCParameterSpec != null ? eCParameterSpec : this.getOutputStallDurationlomOqCM;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public java.security.spec.DSAParameterSpec getDSADefaultParameters(int i) {
        org.bouncycastle.crypto.params.DSAParameters dSAParameters = (org.bouncycastle.crypto.params.DSAParameters) org.bouncycastle.crypto.CryptoServicesRegistrar.getSizedProperty(org.bouncycastle.crypto.CryptoServicesRegistrar.Property.DSA_DEFAULT_PARAMS, i);
        if (dSAParameters != null) {
            return new java.security.spec.DSAParameterSpec(dSAParameters.getP(), dSAParameters.getQ(), dSAParameters.getG());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public javax.crypto.spec.DHParameterSpec getDHDefaultParameters(int i) {
        java.lang.Object obj = this.getOutputFormats.get();
        if (obj == null) {
            obj = this.getHighSpeedVideoSizesFor;
        }
        if (obj instanceof javax.crypto.spec.DHParameterSpec) {
            javax.crypto.spec.DHParameterSpec dHParameterSpec = (javax.crypto.spec.DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i) {
                return dHParameterSpec;
            }
        } else if (obj instanceof javax.crypto.spec.DHParameterSpec[]) {
            javax.crypto.spec.DHParameterSpec[] dHParameterSpecArr = (javax.crypto.spec.DHParameterSpec[]) obj;
            for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                    return dHParameterSpecArr[i2];
                }
            }
        }
        org.bouncycastle.crypto.params.DHParameters dHParameters = (org.bouncycastle.crypto.params.DHParameters) org.bouncycastle.crypto.CryptoServicesRegistrar.getSizedProperty(org.bouncycastle.crypto.CryptoServicesRegistrar.Property.DH_DEFAULT_PARAMS, i);
        if (dHParameters != null) {
            return new org.bouncycastle.jcajce.spec.DHDomainParameterSpec(dHParameters);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public java.util.Map getAdditionalECParameters() {
        return java.util.Collections.unmodifiableMap(this.getOutputMinFrameDuration);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public java.util.Set getAcceptableNamedCurves() {
        return java.util.Collections.unmodifiableSet(this.getInputSizeshNQ4ISI);
    }

    BouncyCastleProviderConfiguration() {
    }
}
