package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JceCRMFEncryptorBuilder {
    private static final org.bouncycastle.operator.SecretKeySizeProvider getHighSpeedVideoFpsRanges = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
    private org.bouncycastle.cert.crmf.jcajce.CRMFHelper Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    public org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizes = secureRandom;
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build() throws org.bouncycastle.cert.crmf.CRMFException {
        return new org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.CRMFOutputEncryptor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    class CRMFOutputEncryptor implements org.bouncycastle.operator.OutputEncryptor {
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
        private javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI;
        private javax.crypto.SecretKey getHighSpeedVideoSizes;

        @Override // org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            return new org.bouncycastle.jcajce.io.CipherOutputStream(outputStream, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.jcajce.JceGenericKey(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.Camera2StreamConfigurationMap;
        }

        CRMFOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.SecureRandom secureRandom) throws org.bouncycastle.cert.crmf.CRMFException {
            javax.crypto.KeyGenerator highSpeedVideoFpsRanges = org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier);
            secureRandom = secureRandom == null ? new java.security.SecureRandom() : secureRandom;
            i = i < 0 ? org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.getHighSpeedVideoFpsRanges.getKeySize(aSN1ObjectIdentifier) : i;
            if (i < 0) {
                highSpeedVideoFpsRanges.init(secureRandom);
            } else {
                highSpeedVideoFpsRanges.init(i, secureRandom);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier);
            this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges.generateKey();
            java.security.AlgorithmParameters highSpeedVideoSizes = org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(aSN1ObjectIdentifier, this.getHighSpeedVideoSizes, secureRandom);
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.init(1, this.getHighSpeedVideoSizes, highSpeedVideoSizes, secureRandom);
                highSpeedVideoSizes = highSpeedVideoSizes == null ? this.getHighResolutionOutputSizeshNQ4ISI.getParameters() : highSpeedVideoSizes;
                org.bouncycastle.cert.crmf.jcajce.CRMFHelper unused = org.bouncycastle.cert.crmf.jcajce.JceCRMFEncryptorBuilder.this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = org.bouncycastle.cert.crmf.jcajce.CRMFHelper.getHighSpeedVideoSizes(aSN1ObjectIdentifier, highSpeedVideoSizes);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to initialize cipher: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
            }
        }
    }

    public JceCRMFEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public JceCRMFEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, -1);
    }
}
