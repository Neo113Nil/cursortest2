package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class DES {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.DES.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.DES", sb.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb2.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.");
            sb3.append(aSN1ObjectIdentifier2.getId());
            configurableProvider.addAlgorithm(sb3.toString(), "DES");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.KeyFactory.");
            sb4.append(aSN1ObjectIdentifier2.getId());
            configurableProvider.addAlgorithm(sb4.toString(), "DES");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$RFC3211");
            configurableProvider.addAlgorithm("Cipher.DESRFC3211WRAP", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.DES", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.DES", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.DESCMAC", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$CBCMAC");
            configurableProvider.addAlgorithm("Mac.DESMAC", sb9.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES", "DESMAC");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$DESCFB8");
            configurableProvider.addAlgorithm("Mac.DESMAC/CFB8", sb10.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$DES64");
            configurableProvider.addAlgorithm("Mac.DESMAC64", sb11.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64", "DESMAC64");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$DES64with7816d4");
            configurableProvider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", sb12.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$DES9797Alg3");
            configurableProvider.addAlgorithm("Mac.DESWITHISO9797", sb13.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$DES9797Alg3");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3MAC", sb14.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$DES9797Alg3with7816d4");
            configurableProvider.addAlgorithm("Mac.ISO9797ALG3WITHISO7816-4PADDING", sb15.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC, "DES");
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DES", sb16.toString());
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb17.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC);
            configurableProvider.addAlgorithm(sb17.toString(), "DES");
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$PBEWithMD2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD2ANDDES", sb18.toString());
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$PBEWithMD5");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5ANDDES", sb19.toString());
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$PBEWithSHA1");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA1ANDDES", sb20.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC, "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, "PBEWITHSHA1ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$PBEWithMD2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDDES", sb21.toString());
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$PBEWithMD5KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDDES", sb22.toString());
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$PBEWithSHA1KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDDES", sb23.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb24.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
            configurableProvider.addAlgorithm(sb24.toString(), "PBEWITHMD2ANDDES");
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb25.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
            configurableProvider.addAlgorithm(sb25.toString(), "PBEWITHMD5ANDDES");
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb26.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
            configurableProvider.addAlgorithm(sb26.toString(), "PBEWITHSHA1ANDDES");
        }
    }

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
            if (!javax.crypto.spec.DESKeySpec.class.isAssignableFrom(cls)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            try {
                return new javax.crypto.spec.DESKeySpec(secretKey.getEncoded());
            } catch (java.lang.Exception e) {
                throw new java.security.spec.InvalidKeySpecException(e.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            return keySpec instanceof javax.crypto.spec.DESKeySpec ? new javax.crypto.spec.SecretKeySpec(((javax.crypto.spec.DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
        }

        public KeyFactory() {
            super("DES", null);
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, java.security.SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public javax.crypto.SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new org.bouncycastle.crypto.KeyGenerationParameters(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            return new javax.crypto.spec.SecretKeySpec(this.engine.generateKey(), this.algName);
        }

        public KeyGenerator() {
            super("DES", 64, new org.bouncycastle.crypto.generators.DESKeyGenerator());
        }
    }

    public static class DESPBEKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (!(keySpec instanceof javax.crypto.spec.PBEKeySpec)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            javax.crypto.spec.PBEKeySpec pBEKeySpec = (javax.crypto.spec.PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() != null) {
                org.bouncycastle.crypto.CipherParameters makePBEParameters = this.getHighSpeedVideoFpsRanges ? org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(pBEKeySpec, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap) : org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(pBEKeySpec, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                org.bouncycastle.crypto.params.DESParameters.setOddParity((makePBEParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV ? (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) makePBEParameters).getParameters() : (org.bouncycastle.crypto.params.KeyParameter) makePBEParameters).getKey());
                return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, pBEKeySpec, makePBEParameters);
            }
            int i = this.getHighSpeedVideoSizes;
            if (i == 0 || i == 4) {
                return new org.bouncycastle.jcajce.PBKDF1Key(pBEKeySpec.getPassword(), this.getHighSpeedVideoSizes == 0 ? org.bouncycastle.crypto.PasswordConverter.ASCII : org.bouncycastle.crypto.PasswordConverter.UTF8);
            }
            return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, pBEKeySpec, null);
        }

        public DESPBEKeyFactory(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, int i, int i2, int i3, int i4) {
            super(str, aSN1ObjectIdentifier);
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRangesFor = i3;
            this.Camera2StreamConfigurationMap = i4;
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 64);
        }
    }

    public static class CBCMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CBCMAC() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESEngine()));
        }
    }

    public static class CMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.DESEngine()));
        }
    }

    public static class DES64 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES64() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESEngine(), 64));
        }
    }

    public static class DES64with7816d4 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES64with7816d4() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.DESEngine(), 64, new org.bouncycastle.crypto.paddings.ISO7816d4Padding()));
        }
    }

    public static class DES9797Alg3 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES9797Alg3() {
            super(new org.bouncycastle.crypto.macs.ISO9797Alg3Mac(new org.bouncycastle.crypto.engines.DESEngine()));
        }
    }

    public static class DES9797Alg3with7816d4 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DES9797Alg3with7816d4() {
            super(new org.bouncycastle.crypto.macs.ISO9797Alg3Mac(new org.bouncycastle.crypto.engines.DESEngine(), new org.bouncycastle.crypto.paddings.ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public DESCFB8() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.DESEngine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.DESEngine());
        }
    }

    public static class PBEWithMD2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithMD2() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 0, 5, 64, 8);
        }
    }

    public static class PBEWithMD2KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andDES", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithMD5() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andDES", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESEngine()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.DES.DESPBEKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andDES", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, true, 0, 1, 64, 64);
        }
    }

    public static class RFC3211 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC3211() {
            super(new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.DESEngine()), 8);
        }
    }

    private DES() {
    }
}
