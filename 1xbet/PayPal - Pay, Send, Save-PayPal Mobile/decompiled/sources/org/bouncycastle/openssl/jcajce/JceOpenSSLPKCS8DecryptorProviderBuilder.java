package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JceOpenSSLPKCS8DecryptorProviderBuilder {
    private org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.DefaultJcaJceHelper();

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str);
        return this;
    }

    public org.bouncycastle.operator.InputDecryptorProvider build(final char[] cArr) throws org.bouncycastle.operator.OperatorCreationException {
        return new org.bouncycastle.operator.InputDecryptorProvider() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.1
            @Override // org.bouncycastle.operator.InputDecryptorProvider
            public org.bouncycastle.operator.InputDecryptor get(final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
                final javax.crypto.Cipher createCipher;
                java.security.Key pBKDF1KeyWithParameters;
                try {
                    if (org.bouncycastle.openssl.jcajce.PEMUtilities.Camera2StreamConfigurationMap(algorithmIdentifier.getAlgorithm())) {
                        org.bouncycastle.asn1.pkcs.PBES2Parameters pBES2Parameters = org.bouncycastle.asn1.pkcs.PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
                        org.bouncycastle.asn1.pkcs.KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
                        org.bouncycastle.asn1.pkcs.EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
                        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = (org.bouncycastle.asn1.pkcs.PBKDF2Params) keyDerivationFunc.getParameters();
                        int intValue = pBKDF2Params.getIterationCount().intValue();
                        byte[] salt = pBKDF2Params.getSalt();
                        java.lang.String id = encryptionScheme.getAlgorithm().getId();
                        javax.crypto.SecretKey highResolutionOutputSizeshNQ4ISI = org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(pBKDF2Params.getPrf()) ? org.bouncycastle.openssl.jcajce.PEMUtilities.getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes, id, cArr, salt, intValue) : org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes, id, cArr, salt, intValue, pBKDF2Params.getPrf());
                        createCipher = org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes.createCipher(id);
                        java.security.AlgorithmParameters createAlgorithmParameters = org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes.createAlgorithmParameters(id);
                        createAlgorithmParameters.init(encryptionScheme.getParameters().toASN1Primitive().getEncoded());
                        createCipher.init(2, highResolutionOutputSizeshNQ4ISI, createAlgorithmParameters);
                    } else {
                        if (org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoSizes(algorithmIdentifier.getAlgorithm())) {
                            org.bouncycastle.asn1.pkcs.PKCS12PBEParams pKCS12PBEParams = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
                            javax.crypto.Cipher createCipher2 = org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes.createCipher(algorithmIdentifier.getAlgorithm().getId());
                            pBKDF1KeyWithParameters = new org.bouncycastle.jcajce.PKCS12KeyWithParameters(cArr, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue());
                            createCipher = createCipher2;
                        } else {
                            if (!org.bouncycastle.openssl.jcajce.PEMUtilities.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm())) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown algorithm: ");
                                sb.append(algorithmIdentifier.getAlgorithm());
                                throw new org.bouncycastle.openssl.PEMException(sb.toString());
                            }
                            org.bouncycastle.asn1.pkcs.PBEParameter pBEParameter = org.bouncycastle.asn1.pkcs.PBEParameter.getInstance(algorithmIdentifier.getParameters());
                            createCipher = org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.this.getHighSpeedVideoSizes.createCipher(algorithmIdentifier.getAlgorithm().getId());
                            pBKDF1KeyWithParameters = new org.bouncycastle.jcajce.PBKDF1KeyWithParameters(cArr, new org.bouncycastle.crypto.CharToByteConverter() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.1.1
                                @Override // org.bouncycastle.crypto.CharToByteConverter
                                public java.lang.String getType() {
                                    return "ASCII";
                                }

                                @Override // org.bouncycastle.crypto.CharToByteConverter
                                public byte[] convert(char[] cArr2) {
                                    return org.bouncycastle.util.Strings.toByteArray(cArr2);
                                }
                            }, pBEParameter.getSalt(), pBEParameter.getIterationCount().intValue());
                        }
                        createCipher.init(2, pBKDF1KeyWithParameters);
                    }
                    return new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder.1.2
                        @Override // org.bouncycastle.operator.InputDecryptor
                        public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                            return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, createCipher);
                        }

                        @Override // org.bouncycastle.operator.InputDecryptor
                        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                            return algorithmIdentifier;
                        }
                    };
                } catch (java.io.IOException e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(algorithmIdentifier.getAlgorithm());
                    sb2.append(" not available: ");
                    sb2.append(e.getMessage());
                    throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e);
                } catch (java.security.GeneralSecurityException e2) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(algorithmIdentifier.getAlgorithm());
                    sb3.append(" not available: ");
                    sb3.append(e2.getMessage());
                    throw new org.bouncycastle.operator.OperatorCreationException(sb3.toString(), e2);
                }
            }
        };
    }
}
