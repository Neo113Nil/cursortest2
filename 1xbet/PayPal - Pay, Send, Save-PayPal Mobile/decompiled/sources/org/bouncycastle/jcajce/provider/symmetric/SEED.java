package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class SEED {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("SEED");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SEED", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb2.append(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC);
            configurableProvider.addAlgorithm(sb2.toString(), "SEED");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SEED", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb4.append(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC);
            configurableProvider.addAlgorithm(sb4.toString(), "SEED");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.SEED", sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.SEEDWRAP", sb7.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "SEEDWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.SEED", sb8.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, sb9.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier3, sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.SEED", sb11.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC, "SEED");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$CMAC");
            java.lang.String obj = sb12.toString();
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$KeyGen");
            addCMacAlgorithm(configurableProvider, "SEED", obj, sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$GMAC");
            java.lang.String obj2 = sb14.toString();
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "SEED", obj2, sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$Poly1305");
            java.lang.String obj3 = sb16.toString();
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "SEED", obj3, sb17.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.SEEDEngine()), 128);
        }
    }

    public static class CMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.SEEDEngine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.SEEDEngine();
                }
            });
        }
    }

    public static class GMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC() {
            super(new org.bouncycastle.crypto.macs.GMac(new org.bouncycastle.crypto.modes.GCMBlockCipher(new org.bouncycastle.crypto.engines.SEEDEngine())));
        }
    }

    public static class KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Poly1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new org.bouncycastle.crypto.engines.SEEDEngine()));
        }
    }

    public static class Poly1305KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.SEEDWrapEngine());
        }
    }

    private SEED() {
    }
}
