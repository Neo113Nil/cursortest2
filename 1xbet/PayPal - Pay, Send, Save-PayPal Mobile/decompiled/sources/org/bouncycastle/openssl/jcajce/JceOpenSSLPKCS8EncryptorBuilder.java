package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JceOpenSSLPKCS8EncryptorBuilder {
    private javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI;
    byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;
    private java.security.AlgorithmParameters getHighSpeedVideoSizesFor;
    private javax.crypto.SecretKey getInputSizeshNQ4ISI;
    private java.security.AlgorithmParameterGenerator getOutputFormats;
    private char[] getOutputMinFrameDuration;
    private java.security.SecureRandom getOutputStallDurationlomOqCM;
    public static final java.lang.String AES_128_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.getId();
    public static final java.lang.String AES_192_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.getId();
    public static final java.lang.String AES_256_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.getId();
    public static final java.lang.String DES3_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId();
    public static final java.lang.String PBE_SHA1_RC4_128 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId();
    public static final java.lang.String PBE_SHA1_RC4_40 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4.getId();
    public static final java.lang.String PBE_SHA1_3DES = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC.getId();
    public static final java.lang.String PBE_SHA1_2DES = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC.getId();
    public static final java.lang.String PBE_SHA1_RC2_128 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC.getId();
    public static final java.lang.String PBE_SHA1_RC2_40 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC.getId();
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getInputFormats = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    int Camera2StreamConfigurationMap = 2048;

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setRandom(java.security.SecureRandom secureRandom) {
        this.getOutputStallDurationlomOqCM = secureRandom;
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setPassword(char[] cArr) {
        this.getOutputMinFrameDuration = cArr;
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setPasssword(char[] cArr) {
        this.getOutputMinFrameDuration = cArr;
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setPRF(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getInputFormats = algorithmIdentifier;
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder setIterationCount(int i) {
        this.Camera2StreamConfigurationMap = i;
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build() throws org.bouncycastle.operator.OperatorCreationException {
        final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        if (this.getOutputStallDurationlomOqCM == null) {
            this.getOutputStallDurationlomOqCM = new java.security.SecureRandom();
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.createCipher(this.getHighSpeedVideoSizes.getId());
            if (org.bouncycastle.openssl.jcajce.PEMUtilities.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes)) {
                this.getOutputFormats = this.getHighSpeedVideoFpsRanges.createAlgorithmParameterGenerator(this.getHighSpeedVideoSizes.getId());
            }
            if (org.bouncycastle.openssl.jcajce.PEMUtilities.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes)) {
                byte[] bArr = new byte[org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoFpsRanges(this.getInputFormats.getAlgorithm())];
                this.getHighSpeedVideoFpsRangesFor = bArr;
                this.getOutputStallDurationlomOqCM.nextBytes(bArr);
                java.security.AlgorithmParameters generateParameters = this.getOutputFormats.generateParameters();
                this.getHighSpeedVideoSizesFor = generateParameters;
                try {
                    org.bouncycastle.asn1.pkcs.EncryptionScheme encryptionScheme = new org.bouncycastle.asn1.pkcs.EncryptionScheme(this.getHighSpeedVideoSizes, org.bouncycastle.asn1.ASN1Primitive.fromByteArray(generateParameters.getEncoded()));
                    org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc = new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputFormats));
                    org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
                    aSN1EncodableVector.add(keyDerivationFunc);
                    aSN1EncodableVector.add(encryptionScheme);
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2, org.bouncycastle.asn1.pkcs.PBES2Parameters.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)));
                    try {
                        javax.crypto.SecretKey highResolutionOutputSizeshNQ4ISI = org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(this.getInputFormats) ? org.bouncycastle.openssl.jcajce.PEMUtilities.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getId(), this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap) : org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getId(), this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getInputFormats);
                        this.getInputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
                        this.getHighResolutionOutputSizeshNQ4ISI.init(1, highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
                    } catch (java.security.GeneralSecurityException e) {
                        throw new org.bouncycastle.operator.OperatorCreationException(e.getMessage(), e);
                    }
                } catch (java.io.IOException e2) {
                    throw new org.bouncycastle.operator.OperatorCreationException(e2.getMessage(), e2);
                }
            } else {
                if (!org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown algorithm: ");
                    sb.append(this.getHighSpeedVideoSizes);
                    throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), null);
                }
                org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
                byte[] bArr2 = new byte[20];
                this.getHighSpeedVideoFpsRangesFor = bArr2;
                this.getOutputStallDurationlomOqCM.nextBytes(bArr2);
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor));
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap));
                algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoSizes, org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2)));
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.init(1, new org.bouncycastle.jcajce.PKCS12KeyWithParameters(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
                } catch (java.security.GeneralSecurityException e3) {
                    throw new org.bouncycastle.operator.OperatorCreationException(e3.getMessage(), e3);
                }
            }
            return new org.bouncycastle.operator.OutputEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.1
                @Override // org.bouncycastle.operator.OutputEncryptor
                public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
                    return new org.bouncycastle.jcajce.io.CipherOutputStream(outputStream, org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.this.getHighResolutionOutputSizeshNQ4ISI);
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public org.bouncycastle.operator.GenericKey getKey() {
                    return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier, org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8EncryptorBuilder.this.getInputSizeshNQ4ISI);
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                    return algorithmIdentifier;
                }
            };
        } catch (java.security.GeneralSecurityException e4) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighSpeedVideoSizes);
            sb2.append(" not available: ");
            sb2.append(e4.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e4);
        }
    }

    public JceOpenSSLPKCS8EncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
    }
}
