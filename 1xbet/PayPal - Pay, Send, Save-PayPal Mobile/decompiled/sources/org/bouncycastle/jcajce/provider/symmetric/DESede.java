package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class DESede {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("DES");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public java.security.spec.KeySpec engineGetKeySpec(javax.crypto.SecretKey secretKey, java.lang.Class cls) throws java.security.spec.InvalidKeySpecException {
            if (cls == null) {
                throw new java.security.spec.InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new java.security.spec.InvalidKeySpecException("key parameter is null");
            }
            if (javax.crypto.spec.SecretKeySpec.class.isAssignableFrom(cls)) {
                return new javax.crypto.spec.SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
            if (!javax.crypto.spec.DESedeKeySpec.class.isAssignableFrom(cls)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            byte[] encoded = secretKey.getEncoded();
            try {
                if (encoded.length != 16) {
                    return new javax.crypto.spec.DESedeKeySpec(encoded);
                }
                byte[] bArr = new byte[24];
                java.lang.System.arraycopy(encoded, 0, bArr, 0, 16);
                java.lang.System.arraycopy(encoded, 0, bArr, 16, 8);
                return new javax.crypto.spec.DESedeKeySpec(bArr);
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            return keySpec instanceof javax.crypto.spec.DESedeKeySpec ? new javax.crypto.spec.SecretKeySpec(((javax.crypto.spec.DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
        }

        public KeyFactory() {
            super("DESede", null);
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        private boolean getHighSpeedVideoFpsRangesFor;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, java.security.SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public javax.crypto.SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new org.bouncycastle.crypto.KeyGenerationParameters(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                return new javax.crypto.spec.SecretKeySpec(this.engine.generateKey(), this.algName);
            }
            byte[] generateKey = this.engine.generateKey();
            java.lang.System.arraycopy(generateKey, 0, generateKey, 16, 8);
            return new javax.crypto.spec.SecretKeySpec(generateKey, this.algName);
        }

        public KeyGenerator() {
            super("DESede", 192, new org.bouncycastle.crypto.generators.DESedeKeyGenerator());
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.DESede.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.DESEDE", sb.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.DESEDEWRAP", sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$RFC3211");
            configurableProvider.addAlgorithm("Cipher.DESEDERFC3211WRAP", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA-1")) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("$PBEWithSHAAndDES3Key");
                configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str);
                sb7.append("$PBEWithSHAAndDES2Key");
                configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", sb7.toString());
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.DESEDE", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("KeyGenerator.");
            sb9.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
            java.lang.String obj = sb9.toString();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$KeyGenerator3");
            configurableProvider.addAlgorithm(obj, sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.DESEDEWRAP", sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.DESEDE", sb12.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desEDE;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory", aSN1ObjectIdentifier3, sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.DESEDECMAC", sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$CBCMAC");
            configurableProvider.addAlgorithm("Mac.DESEDEMAC", sb15.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$DESedeCFB8");
            configurableProvider.addAlgorithm("Mac.DESEDEMAC/CFB8", sb16.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$DESede64");
            configurableProvider.addAlgorithm("Mac.DESEDEMAC64", sb17.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$DESede64with7816d4");
            configurableProvider.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", sb18.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb19.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
            configurableProvider.addAlgorithm(sb19.toString(), "DESEDE");
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DESEDE", sb20.toString());
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb21.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
            configurableProvider.addAlgorithm(sb21.toString(), "DESEDE");
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$PBEWithSHAAndDES3KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", sb22.toString());
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$PBEWithSHAAndDES2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", sb23.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 64);
        }
    }

    public static class CBCMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CBCMAC() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESedeEngine()));
        }
    }

    public static class CMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.DESedeEngine()));
        }
    }

    public static class DESede64 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESede64() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESedeEngine(), 64));
        }
    }

    public static class DESede64with7816d4 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESede64with7816d4() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESedeEngine(), 64, new org.bouncycastle.crypto.paddings.ISO7816d4Padding()));
        }
    }

    public static class DESedeCFB8 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESedeCFB8() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.DESedeEngine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.DESedeEngine());
        }
    }

    public static class KeyGenerator3 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator3() {
            super("DESede3", 192, new org.bouncycastle.crypto.generators.DESedeKeyGenerator());
        }
    }

    public static class PBEWithSHAAndDES2Key extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAndDES2Key() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAndDES2KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() {
            super("PBEwithSHAandDES2Key-CBC", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAndDES3Key extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAndDES3Key() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()), 2, 1, 192, 8);
        }
    }

    public static class PBEWithSHAAndDES3KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() {
            super("PBEwithSHAandDES3Key-CBC", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, true, 2, 1, 192, 64);
        }
    }

    public static class RFC3211 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC3211() {
            super(new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.DESedeEngine()), 8);
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.DESedeWrapEngine());
        }
    }

    private DESede() {
    }
}
