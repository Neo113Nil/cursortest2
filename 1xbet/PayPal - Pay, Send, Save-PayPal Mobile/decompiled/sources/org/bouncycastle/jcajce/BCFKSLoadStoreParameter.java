package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class BCFKSLoadStoreParameter extends org.bouncycastle.jcajce.BCLoadStoreParameter {
    private final org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm Camera2StreamConfigurationMap;
    private final java.security.cert.X509Certificate[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.security.Key getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm getHighSpeedVideoSizes;
    private final org.bouncycastle.jcajce.BCFKSLoadStoreParameter.CertChainValidator getInputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.util.PBKDFConfig getOutputFormats;

    public interface CertChainValidator {
        boolean isValid(java.security.cert.X509Certificate[] x509CertificateArr);
    }

    public enum EncryptionAlgorithm {
        AES256_CCM,
        AES256_KWP
    }

    public enum MacAlgorithm {
        HmacSHA512,
        HmacSHA3_512
    }

    public enum SignatureAlgorithm {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    public static class Builder {
        private final java.io.InputStream Camera2StreamConfigurationMap;
        private org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm getHighResolutionOutputSizeshNQ4ISI;
        private final java.io.OutputStream getHighSpeedVideoFpsRanges;
        private org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm getHighSpeedVideoFpsRangesFor;
        private java.security.cert.X509Certificate[] getHighSpeedVideoSizes;
        private final java.security.Key getHighSpeedVideoSizesFor;
        private org.bouncycastle.crypto.util.PBKDFConfig getInputFormats;
        private org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm getInputSizeshNQ4ISI;
        private org.bouncycastle.jcajce.BCFKSLoadStoreParameter.CertChainValidator getOutputFormats;
        private final java.security.KeyStore.ProtectionParameter getOutputMinFrameDuration;

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder withStoreSignatureAlgorithm(org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) {
            this.getInputSizeshNQ4ISI = signatureAlgorithm;
            return this;
        }

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder withStorePBKDFConfig(org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig) {
            this.getInputFormats = pBKDFConfig;
            return this;
        }

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder withStoreMacAlgorithm(org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm macAlgorithm) {
            this.getHighSpeedVideoFpsRangesFor = macAlgorithm;
            return this;
        }

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder withStoreEncryptionAlgorithm(org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm encryptionAlgorithm) {
            this.getHighResolutionOutputSizeshNQ4ISI = encryptionAlgorithm;
            return this;
        }

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder withCertificates(java.security.cert.X509Certificate[] x509CertificateArr) {
            int length = x509CertificateArr.length;
            java.security.cert.X509Certificate[] x509CertificateArr2 = new java.security.cert.X509Certificate[length];
            java.lang.System.arraycopy(x509CertificateArr, 0, x509CertificateArr2, 0, length);
            this.getHighSpeedVideoSizes = x509CertificateArr2;
            return this;
        }

        public org.bouncycastle.jcajce.BCFKSLoadStoreParameter build() {
            return new org.bouncycastle.jcajce.BCFKSLoadStoreParameter(this, (byte) 0);
        }

        public Builder(java.io.OutputStream outputStream, char[] cArr) {
            this(outputStream, new java.security.KeyStore.PasswordProtection(cArr));
        }

        public Builder(java.io.OutputStream outputStream, java.security.PrivateKey privateKey) {
            this.getInputFormats = new org.bouncycastle.crypto.util.PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA512).build();
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512;
            this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = outputStream;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizesFor = privateKey;
        }

        public Builder(java.io.OutputStream outputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
            this.getInputFormats = new org.bouncycastle.crypto.util.PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA512).build();
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512;
            this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = outputStream;
            this.getOutputMinFrameDuration = protectionParameter;
            this.getHighSpeedVideoSizesFor = null;
        }

        public Builder(java.io.InputStream inputStream, char[] cArr) {
            this(inputStream, new java.security.KeyStore.PasswordProtection(cArr));
        }

        public Builder(java.io.InputStream inputStream, org.bouncycastle.jcajce.BCFKSLoadStoreParameter.CertChainValidator certChainValidator) {
            this.getInputFormats = new org.bouncycastle.crypto.util.PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA512).build();
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512;
            this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = inputStream;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputMinFrameDuration = null;
            this.getOutputFormats = certChainValidator;
            this.getHighSpeedVideoSizesFor = null;
        }

        public Builder(java.io.InputStream inputStream, java.security.PublicKey publicKey) {
            this.getInputFormats = new org.bouncycastle.crypto.util.PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA512).build();
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512;
            this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = inputStream;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizesFor = publicKey;
        }

        public Builder(java.io.InputStream inputStream, java.security.KeyStore.ProtectionParameter protectionParameter) {
            this.getInputFormats = new org.bouncycastle.crypto.util.PBKDF2Config.Builder().withIterationCount(16384).withSaltLength(64).withPRF(org.bouncycastle.crypto.util.PBKDF2Config.PRF_SHA512).build();
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM;
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512;
            this.getInputSizeshNQ4ISI = org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA;
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = inputStream;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputMinFrameDuration = protectionParameter;
            this.getHighSpeedVideoSizesFor = null;
        }

        public Builder() {
            this((java.io.OutputStream) null, (java.security.KeyStore.ProtectionParameter) null);
        }
    }

    public java.security.Key getStoreSignatureKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.SignatureAlgorithm getStoreSignatureAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.crypto.util.PBKDFConfig getStorePBKDFConfig() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.MacAlgorithm getStoreMacAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.EncryptionAlgorithm getStoreEncryptionAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public java.security.cert.X509Certificate[] getStoreCertificates() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.jcajce.BCFKSLoadStoreParameter.CertChainValidator getCertChainValidator() {
        return this.getInputSizeshNQ4ISI;
    }

    /* synthetic */ BCFKSLoadStoreParameter(org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder builder, byte b) {
        this(builder);
    }

    private BCFKSLoadStoreParameter(org.bouncycastle.jcajce.BCFKSLoadStoreParameter.Builder builder) {
        super(builder.Camera2StreamConfigurationMap, builder.getHighSpeedVideoFpsRanges, builder.getOutputMinFrameDuration);
        this.getOutputFormats = builder.getInputFormats;
        this.getHighSpeedVideoSizes = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = builder.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = builder.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoSizesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = builder.getOutputFormats;
    }
}
