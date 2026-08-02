package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcePKCSPBEOutputEncryptorBuilder {
    private org.bouncycastle.operator.AlgorithmNameFinder Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes;
    private java.security.SecureRandom getHighSpeedVideoSizesFor;
    private final org.bouncycastle.crypto.util.PBKDFConfig getInputFormats;
    private org.bouncycastle.crypto.util.PBKDF2Config.Builder getInputSizeshNQ4ISI;
    private org.bouncycastle.operator.SecretKeySizeProvider getOutputMinFrameDuration;

    static /* synthetic */ byte[] getHighSpeedVideoFpsRangesFor(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            char c = cArr[i];
            bArr[i2] = (byte) (c >>> '\b');
            bArr[i2 + 1] = (byte) c;
        }
        return bArr;
    }

    static /* synthetic */ byte[] getHighResolutionOutputSizeshNQ4ISI(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoSizesFor = secureRandom;
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setPRF(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        if (this.getInputFormats != null) {
            throw new java.lang.IllegalStateException("set PRF count using PBKDFDef");
        }
        this.getInputSizeshNQ4ISI.withPRF(algorithmIdentifier);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setKeySizeProvider(org.bouncycastle.operator.SecretKeySizeProvider secretKeySizeProvider) {
        this.getOutputMinFrameDuration = secretKeySizeProvider;
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder setIterationCount(int i) {
        if (this.getInputFormats != null) {
            throw new java.lang.IllegalStateException("set iteration count using PBKDFDef");
        }
        this.getHighSpeedVideoFpsRanges = i;
        this.getInputSizeshNQ4ISI.withIterationCount(i);
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build(final char[] cArr) throws org.bouncycastle.operator.OperatorCreationException {
        final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier;
        final javax.crypto.Cipher cipher;
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = new java.security.SecureRandom();
        }
        try {
            if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor)) {
                byte[] bArr = new byte[20];
                this.getHighSpeedVideoSizesFor.nextBytes(bArr);
                cipher = this.getHighSpeedVideoSizes.createCipher(this.getHighSpeedVideoFpsRangesFor.getId());
                cipher.init(1, new org.bouncycastle.jcajce.PKCS12KeyWithParameters(cArr, bArr, this.getHighSpeedVideoFpsRanges));
                algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(bArr, this.getHighSpeedVideoFpsRanges));
            } else {
                if (!this.getHighSpeedVideoFpsRangesFor.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2)) {
                    throw new org.bouncycastle.operator.OperatorCreationException("unrecognised algorithm");
                }
                org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig = this.getInputFormats;
                if (pBKDFConfig == null) {
                    pBKDFConfig = this.getInputSizeshNQ4ISI.build();
                }
                if (org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) pBKDFConfig.getAlgorithm())) {
                    org.bouncycastle.crypto.util.ScryptConfig scryptConfig = (org.bouncycastle.crypto.util.ScryptConfig) pBKDFConfig;
                    byte[] bArr2 = new byte[scryptConfig.getSaltLength()];
                    this.getHighSpeedVideoSizesFor.nextBytes(bArr2);
                    org.bouncycastle.asn1.misc.ScryptParams scryptParams = new org.bouncycastle.asn1.misc.ScryptParams(bArr2, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter());
                    javax.crypto.SecretKey generateSecret = this.getHighSpeedVideoSizes.createSecretKeyFactory("SCRYPT").generateSecret(new org.bouncycastle.jcajce.spec.ScryptKeySpec(cArr, bArr2, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), this.getOutputMinFrameDuration.getKeySize(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighResolutionOutputSizeshNQ4ISI))));
                    javax.crypto.Cipher createCipher = this.getHighSpeedVideoSizes.createCipher(this.getHighResolutionOutputSizeshNQ4ISI.getId());
                    createCipher.init(1, getHighResolutionOutputSizeshNQ4ISI(generateSecret), this.getHighSpeedVideoSizesFor);
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, createCipher.getParameters() != null ? new org.bouncycastle.asn1.pkcs.PBES2Parameters(new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt, scryptParams), new org.bouncycastle.asn1.pkcs.EncryptionScheme(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.asn1.ASN1Primitive.fromByteArray(createCipher.getParameters().getEncoded()))) : new org.bouncycastle.asn1.pkcs.PBES2Parameters(new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt, scryptParams), new org.bouncycastle.asn1.pkcs.EncryptionScheme(this.getHighResolutionOutputSizeshNQ4ISI)));
                    cipher = createCipher;
                } else {
                    org.bouncycastle.crypto.util.PBKDF2Config pBKDF2Config = (org.bouncycastle.crypto.util.PBKDF2Config) pBKDFConfig;
                    byte[] bArr3 = new byte[pBKDF2Config.getSaltLength()];
                    this.getHighSpeedVideoSizesFor.nextBytes(bArr3);
                    javax.crypto.SecretKey generateSecret2 = this.getHighSpeedVideoSizes.createSecretKeyFactory(org.bouncycastle.pkcs.jcajce.JceUtils.getHighResolutionOutputSizeshNQ4ISI(pBKDF2Config.getPRF().getAlgorithm())).generateSecret(new javax.crypto.spec.PBEKeySpec(cArr, bArr3, pBKDF2Config.getIterationCount(), this.getOutputMinFrameDuration.getKeySize(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighResolutionOutputSizeshNQ4ISI))));
                    javax.crypto.Cipher createCipher2 = this.getHighSpeedVideoSizes.createCipher(this.getHighResolutionOutputSizeshNQ4ISI.getId());
                    createCipher2.init(1, getHighResolutionOutputSizeshNQ4ISI(generateSecret2), this.getHighSpeedVideoSizesFor);
                    algorithmIdentifier = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(this.getHighSpeedVideoFpsRangesFor, createCipher2.getParameters() != null ? new org.bouncycastle.asn1.pkcs.PBES2Parameters(new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(bArr3, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new org.bouncycastle.asn1.pkcs.EncryptionScheme(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.asn1.ASN1Primitive.fromByteArray(createCipher2.getParameters().getEncoded()))) : new org.bouncycastle.asn1.pkcs.PBES2Parameters(new org.bouncycastle.asn1.pkcs.KeyDerivationFunc(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2, new org.bouncycastle.asn1.pkcs.PBKDF2Params(bArr3, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new org.bouncycastle.asn1.pkcs.EncryptionScheme(this.getHighResolutionOutputSizeshNQ4ISI)));
                    cipher = createCipher2;
                }
            }
            return new org.bouncycastle.operator.OutputEncryptor() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.1
                @Override // org.bouncycastle.operator.OutputEncryptor
                public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
                    return new org.bouncycastle.jcajce.io.CipherOutputStream(outputStream, cipher);
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public org.bouncycastle.operator.GenericKey getKey() {
                    return org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm()) ? new org.bouncycastle.operator.GenericKey(algorithmIdentifier, org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.getHighSpeedVideoFpsRangesFor(cArr)) : new org.bouncycastle.operator.GenericKey(algorithmIdentifier, org.bouncycastle.pkcs.jcajce.JcePKCSPBEOutputEncryptorBuilder.getHighResolutionOutputSizeshNQ4ISI(cArr));
                }

                @Override // org.bouncycastle.operator.OutputEncryptor
                public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                    return algorithmIdentifier;
                }
            };
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create OutputEncryptor: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        }
    }

    private javax.crypto.SecretKey getHighResolutionOutputSizeshNQ4ISI(javax.crypto.SecretKey secretKey) {
        return (!this.Camera2StreamConfigurationMap.hasAlgorithmName(this.getHighResolutionOutputSizeshNQ4ISI) || this.Camera2StreamConfigurationMap.getAlgorithmName(this.getHighResolutionOutputSizeshNQ4ISI).indexOf(org.jose4j.keys.AesKey.ALGORITHM) < 0) ? secretKey : new javax.crypto.spec.SecretKeySpec(secretKey.getEncoded(), org.jose4j.keys.AesKey.ALGORITHM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.on(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_12PbeIds) || aSN1ObjectIdentifier.on(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha1_pkcs12) || aSN1ObjectIdentifier.on(org.bouncycastle.asn1.bc.BCObjectIdentifiers.bc_pbe_sha256_pkcs12);
    }

    public JcePKCSPBEOutputEncryptorBuilder(org.bouncycastle.crypto.util.PBKDFConfig pBKDFConfig, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
        this.getOutputMinFrameDuration = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.DefaultAlgorithmNameFinder();
        this.getHighSpeedVideoFpsRanges = 1024;
        this.getInputSizeshNQ4ISI = new org.bouncycastle.crypto.util.PBKDF2Config.Builder();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2;
        this.getInputFormats = pBKDFConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }

    public JcePKCSPBEOutputEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
        this.getOutputMinFrameDuration = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.DefaultAlgorithmNameFinder();
        this.getHighSpeedVideoFpsRanges = 1024;
        this.getInputSizeshNQ4ISI = new org.bouncycastle.crypto.util.PBKDF2Config.Builder();
        this.getInputFormats = null;
        if (getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier)) {
            this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        } else {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
    }
}
