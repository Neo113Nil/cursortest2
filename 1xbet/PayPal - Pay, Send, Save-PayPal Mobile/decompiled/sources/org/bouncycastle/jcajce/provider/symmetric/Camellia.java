package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Camellia {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("Camellia");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.CAMELLIA", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.CAMELLIA", sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb4.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.CAMELLIAWRAP", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap, "CAMELLIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap, "CAMELLIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap, "CAMELLIAWRAP");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.CAMELLIA", sb9.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.CAMELLIA", sb10.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier4, sb11.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier5, sb12.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, sb13.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc;
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier7, sb14.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc;
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier8, sb15.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc;
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier9, sb16.toString());
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$GMAC");
            java.lang.String obj = sb17.toString();
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", obj, sb18.toString());
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$Poly1305");
            java.lang.String obj2 = sb19.toString();
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", obj2, sb20.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Camellia IV";
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super("Camellia", i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.CamelliaEngine()), 128);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.CamelliaEngine();
                }
            });
        }
    }

    public static class GMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.CamelliaEngine())));
        }
    }

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public static class KeyGen128 extends org.bouncycastle.jcajce.provider.symmetric.Camellia.KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends org.bouncycastle.jcajce.provider.symmetric.Camellia.KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends org.bouncycastle.jcajce.provider.symmetric.Camellia.KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.CamelliaEngine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public RFC3211Wrap() {
            super(new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.CamelliaEngine()), 16);
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.CamelliaWrapEngine());
        }
    }

    private Camellia() {
    }
}
