package org.jose4j.jca;

/* loaded from: classes18.dex */
public class ProviderContext {
    private java.security.SecureRandom getHighSpeedVideoSizes;
    private org.jose4j.jca.ProviderContext.Context getHighSpeedVideoFpsRangesFor = new org.jose4j.jca.ProviderContext.Context();
    private org.jose4j.jca.ProviderContext.Context Camera2StreamConfigurationMap = new org.jose4j.jca.ProviderContext.Context();

    public enum KeyDecipherMode {
        UNWRAP,
        DECRYPT
    }

    public org.jose4j.jca.ProviderContext.Context getSuppliedKeyProviderContext() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.jose4j.jca.ProviderContext.Context getGeneralProviderContext() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.security.SecureRandom getSecureRandom() {
        return this.getHighSpeedVideoSizes;
    }

    public void setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
    }

    public class Context {
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private org.jose4j.jca.ProviderContext.KeyDecipherMode getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;
        private org.jose4j.jca.ProviderContext.SignatureAlgorithmOverride getHighSpeedVideoSizesFor;
        private java.lang.String getInputFormats;
        private java.lang.String getInputSizeshNQ4ISI;
        private java.lang.String getOutputFormats;
        private java.lang.String getOutputMinFrameDuration;
        private java.lang.String getOutputStallDuration;

        public Context() {
        }

        public java.lang.String getGeneralProvider() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public void setGeneralProvider(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public java.lang.String getKeyPairGeneratorProvider() {
            java.lang.String str = this.getInputFormats;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setKeyPairGeneratorProvider(java.lang.String str) {
            this.getInputFormats = str;
        }

        public java.lang.String getKeyAgreementProvider() {
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setKeyAgreementProvider(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public java.lang.String getCipherProvider() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setCipherProvider(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
        }

        public org.jose4j.jca.ProviderContext.KeyDecipherMode getKeyDecipherModeOverride() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public void setKeyDecipherModeOverride(org.jose4j.jca.ProviderContext.KeyDecipherMode keyDecipherMode) {
            this.getHighSpeedVideoFpsRangesFor = keyDecipherMode;
        }

        public java.lang.String getSignatureProvider() {
            java.lang.String str = this.getOutputStallDuration;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setSignatureProvider(java.lang.String str) {
            this.getOutputStallDuration = str;
        }

        public org.jose4j.jca.ProviderContext.SignatureAlgorithmOverride getSignatureAlgorithmOverride() {
            return this.getHighSpeedVideoSizesFor;
        }

        public void setSignatureAlgorithmOverride(org.jose4j.jca.ProviderContext.SignatureAlgorithmOverride signatureAlgorithmOverride) {
            this.getHighSpeedVideoSizesFor = signatureAlgorithmOverride;
        }

        public java.lang.String getMacProvider() {
            java.lang.String str = this.getOutputFormats;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setMacProvider(java.lang.String str) {
            this.getOutputFormats = str;
        }

        public java.lang.String getMessageDigestProvider() {
            java.lang.String str = this.getInputSizeshNQ4ISI;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setMessageDigestProvider(java.lang.String str) {
            this.getInputSizeshNQ4ISI = str;
        }

        public java.lang.String getKeyFactoryProvider() {
            java.lang.String str = this.getOutputMinFrameDuration;
            return str == null ? this.getHighSpeedVideoFpsRanges : str;
        }

        public void setKeyFactoryProvider(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
        }
    }

    public static class SignatureAlgorithmOverride {
        private java.lang.String Camera2StreamConfigurationMap;
        private java.security.spec.AlgorithmParameterSpec getHighSpeedVideoFpsRanges;

        public SignatureAlgorithmOverride(java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = algorithmParameterSpec;
        }

        public java.lang.String getAlgorithmName() {
            return this.Camera2StreamConfigurationMap;
        }

        public java.security.spec.AlgorithmParameterSpec getAlgorithmParameterSpec() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
