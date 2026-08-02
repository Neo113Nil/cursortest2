package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcePKCSPBEInputDecryptorProviderBuilder {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private org.bouncycastle.operator.SecretKeySizeProvider Camera2StreamConfigurationMap = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;

    static /* synthetic */ boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.ASN1Encodable parameters = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Encodable).getParameters();
        if (!(parameters instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(parameters);
        if (aSN1Sequence.size() == 2) {
            return aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1Integer;
        }
        return false;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder setTryWrongPKCS12Zero(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder setKeySizeProvider(org.bouncycastle.operator.SecretKeySizeProvider secretKeySizeProvider) {
        this.Camera2StreamConfigurationMap = secretKeySizeProvider;
        return this;
    }

    public org.bouncycastle.operator.InputDecryptorProvider build(final char[] cArr) {
        return new org.bouncycastle.operator.InputDecryptorProvider() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.1
            private javax.crypto.Cipher getHighSpeedVideoFpsRangesFor;
            private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

            @Override // org.bouncycastle.operator.InputDecryptorProvider
            public org.bouncycastle.operator.InputDecryptor get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                javax.crypto.SecretKey generateSecret;
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
                try {
                    if (algorithm.on(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_12PbeIds)) {
                        org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                        javax.crypto.Cipher createCipher = org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges.createCipher(algorithm.getId());
                        this.getHighSpeedVideoFpsRangesFor = createCipher;
                        createCipher.init(2, new org.bouncycastle.jcajce.PKCS12KeyWithParameters(cArr, org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighResolutionOutputSizeshNQ4ISI, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue()));
                        this.getHighSpeedVideoSizes = algorithmIdentifier;
                    } else if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2)) {
                        org.bouncycastle.asn1.pkcs.PBES2Parameters pBES2Parameters = org.bouncycastle.asn1.pkcs.PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
                        if (org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_scrypt.equals((org.bouncycastle.asn1.ASN1Primitive) pBES2Parameters.getKeyDerivationFunc().getAlgorithm())) {
                            org.bouncycastle.asn1.misc.ScryptParams scryptParams = org.bouncycastle.asn1.misc.ScryptParams.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
                            generateSecret = org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges.createSecretKeyFactory("SCRYPT").generateSecret(new org.bouncycastle.jcajce.spec.ScryptKeySpec(cArr, scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getParallelizationParameter().intValue(), org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.Camera2StreamConfigurationMap.getKeySize(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme()))));
                        } else {
                            javax.crypto.SecretKeyFactory createSecretKeyFactory = org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
                            org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
                            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
                            generateSecret = createSecretKeyFactory.generateSecret(pBKDF2Params.isDefaultPrf() ? new javax.crypto.spec.PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.Camera2StreamConfigurationMap.getKeySize(algorithmIdentifier2)) : new org.bouncycastle.jcajce.spec.PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.Camera2StreamConfigurationMap.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
                        }
                        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
                        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
                        org.bouncycastle.asn1.ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
                        if (parameters instanceof org.bouncycastle.asn1.ASN1OctetString) {
                            this.getHighSpeedVideoFpsRangesFor.init(2, generateSecret, new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(parameters).getOctets()));
                        } else if ((parameters instanceof org.bouncycastle.asn1.ASN1Sequence) && org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.getHighSpeedVideoSizes(pBES2Parameters.getEncryptionScheme())) {
                            java.security.AlgorithmParameters algorithmParameters = java.security.AlgorithmParameters.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
                            algorithmParameters.init(((org.bouncycastle.asn1.ASN1Sequence) parameters).getEncoded());
                            this.getHighSpeedVideoFpsRangesFor.init(2, generateSecret, algorithmParameters);
                        } else if (parameters == null) {
                            this.getHighSpeedVideoFpsRangesFor.init(2, generateSecret);
                        } else {
                            org.bouncycastle.asn1.cryptopro.GOST28147Parameters gOST28147Parameters = org.bouncycastle.asn1.cryptopro.GOST28147Parameters.getInstance(parameters);
                            this.getHighSpeedVideoFpsRangesFor.init(2, generateSecret, new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
                        }
                    } else {
                        if (!algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC) && !algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create InputDecryptor: algorithm ");
                            sb.append(algorithm);
                            sb.append(" unknown.");
                            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString());
                        }
                        org.bouncycastle.asn1.pkcs.PBEParameter pBEParameter = org.bouncycastle.asn1.pkcs.PBEParameter.getInstance(algorithmIdentifier.getParameters());
                        javax.crypto.Cipher createCipher2 = org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.this.getHighSpeedVideoFpsRanges.createCipher(algorithm.getId());
                        this.getHighSpeedVideoFpsRangesFor = createCipher2;
                        createCipher2.init(2, new org.bouncycastle.jcajce.PBKDF1Key(cArr, org.bouncycastle.crypto.PasswordConverter.ASCII), new javax.crypto.spec.PBEParameterSpec(pBEParameter.getSalt(), pBEParameter.getIterationCount().intValue()));
                    }
                    return new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.1.1
                        @Override // org.bouncycastle.operator.InputDecryptor
                        public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                            return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor);
                        }

                        @Override // org.bouncycastle.operator.InputDecryptor
                        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                            return org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder.AnonymousClass1.this.getHighSpeedVideoSizes;
                        }
                    };
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to create InputDecryptor: ");
                    sb2.append(e.getMessage());
                    throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e);
                }
            }
        };
    }
}
