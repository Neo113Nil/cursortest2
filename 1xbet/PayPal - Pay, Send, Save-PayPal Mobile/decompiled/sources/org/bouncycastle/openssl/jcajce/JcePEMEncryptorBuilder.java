package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcePEMEncryptorBuilder {
    private final java.lang.String Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.openssl.PEMEncryptor build(final char[] cArr) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();
        }
        final byte[] bArr = new byte[this.Camera2StreamConfigurationMap.startsWith("AES-") ? 16 : 8];
        this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr);
        return new org.bouncycastle.openssl.PEMEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.1
            @Override // org.bouncycastle.openssl.PEMEncryptor
            public byte[] getIV() {
                return bArr;
            }

            @Override // org.bouncycastle.openssl.PEMEncryptor
            public java.lang.String getAlgorithm() {
                return org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.this.Camera2StreamConfigurationMap;
            }

            @Override // org.bouncycastle.openssl.PEMEncryptor
            public byte[] encrypt(byte[] bArr2) throws org.bouncycastle.openssl.PEMException {
                return org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoFpsRangesFor(true, org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.this.getHighSpeedVideoSizes, bArr2, cArr, org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.this.Camera2StreamConfigurationMap, bArr);
            }
        };
    }

    public JcePEMEncryptorBuilder(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }
}
