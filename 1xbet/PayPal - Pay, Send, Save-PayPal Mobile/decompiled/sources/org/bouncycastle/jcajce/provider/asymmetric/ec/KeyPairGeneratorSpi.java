package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public abstract class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {

    public static class EC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi {
        private static java.util.Hashtable getHighSpeedVideoSizesFor;
        boolean Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRanges;
        org.bouncycastle.crypto.generators.ECKeyPairGenerator getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.jcajce.provider.config.ProviderConfiguration getHighSpeedVideoSizes;
        java.security.SecureRandom getInputSizeshNQ4ISI;
        org.bouncycastle.crypto.params.ECKeyGenerationParameters getOutputFormats;
        int getOutputMinFrameDuration;

        protected void initializeNamedCurve(java.lang.String str, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            org.bouncycastle.asn1.x9.X9ECParameters highSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighSpeedVideoFpsRangesFor(str, this.getHighSpeedVideoSizes);
            if (highSpeedVideoFpsRangesFor == null) {
                throw new java.security.InvalidAlgorithmParameterException("unknown curve name: ".concat(java.lang.String.valueOf(str)));
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jce.spec.ECNamedCurveSpec(str, highSpeedVideoFpsRangesFor.getCurve(), highSpeedVideoFpsRangesFor.getG(), highSpeedVideoFpsRangesFor.getN(), highSpeedVideoFpsRangesFor.getH(), null);
            this.getOutputFormats = createKeyGenParamsJCE(highSpeedVideoFpsRangesFor, secureRandom);
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            java.lang.String name2;
            org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE;
            org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
            if (algorithmParameterSpec == null) {
                eCParameterSpec = this.getHighSpeedVideoSizes.getEcImplicitlyCa();
                if (eCParameterSpec == null) {
                    throw new java.security.InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            } else {
                if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECParameterSpec)) {
                    if (algorithmParameterSpec instanceof java.security.spec.ECParameterSpec) {
                        this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameterSpec;
                        createKeyGenParamsJCE = createKeyGenParamsJCE((java.security.spec.ECParameterSpec) algorithmParameterSpec, secureRandom);
                        this.getOutputFormats = createKeyGenParamsJCE;
                        this.getHighSpeedVideoFpsRangesFor.init(this.getOutputFormats);
                        this.Camera2StreamConfigurationMap = true;
                    }
                    if (algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec) {
                        name2 = ((java.security.spec.ECGenParameterSpec) algorithmParameterSpec).getName();
                    } else {
                        if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec)) {
                            java.lang.String nameFrom = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNameFrom(algorithmParameterSpec);
                            if (nameFrom == null) {
                                throw new java.security.InvalidAlgorithmParameterException("invalid parameterSpec: ".concat(java.lang.String.valueOf(algorithmParameterSpec)));
                            }
                            initializeNamedCurve(nameFrom, secureRandom);
                            this.getHighSpeedVideoFpsRangesFor.init(this.getOutputFormats);
                            this.Camera2StreamConfigurationMap = true;
                        }
                        name2 = ((org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName();
                    }
                    initializeNamedCurve(name2, secureRandom);
                    this.getHighSpeedVideoFpsRangesFor.init(this.getOutputFormats);
                    this.Camera2StreamConfigurationMap = true;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = algorithmParameterSpec;
                eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) algorithmParameterSpec;
            }
            createKeyGenParamsJCE = createKeyGenParamsBC(eCParameterSpec, secureRandom);
            this.getOutputFormats = createKeyGenParamsJCE;
            this.getHighSpeedVideoFpsRangesFor.init(this.getOutputFormats);
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public void initialize(int i, java.security.SecureRandom secureRandom) {
            this.getOutputMinFrameDuration = i;
            this.getInputSizeshNQ4ISI = secureRandom;
            java.security.spec.ECGenParameterSpec eCGenParameterSpec = (java.security.spec.ECGenParameterSpec) getHighSpeedVideoSizesFor.get(org.bouncycastle.util.Integers.valueOf(i));
            if (eCGenParameterSpec == null) {
                throw new java.security.InvalidParameterException("unknown key size.");
            }
            try {
                initialize(eCGenParameterSpec, secureRandom);
            } catch (java.security.InvalidAlgorithmParameterException unused) {
                throw new java.security.InvalidParameterException("key size not configurable.");
            }
        }

        @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
        public java.security.KeyPair generateKeyPair() {
            if (!this.Camera2StreamConfigurationMap) {
                initialize(this.getOutputMinFrameDuration, new java.security.SecureRandom());
            }
            org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRangesFor.generateKeyPair();
            org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) generateKeyPair.getPublic();
            org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) generateKeyPair.getPrivate();
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj instanceof org.bouncycastle.jce.spec.ECParameterSpec) {
                org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec = (org.bouncycastle.jce.spec.ECParameterSpec) obj;
                org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey = new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters, eCParameterSpec, this.getHighSpeedVideoSizes);
                return new java.security.KeyPair(bCECPublicKey, new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters, bCECPublicKey, eCParameterSpec, this.getHighSpeedVideoSizes));
            }
            if (obj == null) {
                return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters, this.getHighSpeedVideoSizes), new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters, this.getHighSpeedVideoSizes));
            }
            java.security.spec.ECParameterSpec eCParameterSpec2 = (java.security.spec.ECParameterSpec) obj;
            org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey bCECPublicKey2 = new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey(this.getHighSpeedVideoFpsRanges, eCPublicKeyParameters, eCParameterSpec2, this.getHighSpeedVideoSizes);
            return new java.security.KeyPair(bCECPublicKey2, new org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey(this.getHighSpeedVideoFpsRanges, eCPrivateKeyParameters, bCECPublicKey2, eCParameterSpec2, this.getHighSpeedVideoSizes));
        }

        protected org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE(org.bouncycastle.asn1.x9.X9ECParameters x9ECParameters, java.security.SecureRandom secureRandom) {
            return new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH()), secureRandom);
        }

        protected org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsJCE(java.security.spec.ECParameterSpec eCParameterSpec, java.security.SecureRandom secureRandom) {
            org.bouncycastle.asn1.x9.X9ECParameters highSpeedVideoFpsRangesFor;
            if ((eCParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec) && (highSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighSpeedVideoFpsRangesFor(((org.bouncycastle.jce.spec.ECNamedCurveSpec) eCParameterSpec).getName(), this.getHighSpeedVideoSizes)) != null) {
                return createKeyGenParamsJCE(highSpeedVideoFpsRangesFor, secureRandom);
            }
            org.bouncycastle.math.ec.ECCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(convertCurve, org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), java.math.BigInteger.valueOf(eCParameterSpec.getCofactor())), secureRandom);
        }

        protected org.bouncycastle.crypto.params.ECKeyGenerationParameters createKeyGenParamsBC(org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, java.security.SecureRandom secureRandom) {
            return new org.bouncycastle.crypto.params.ECKeyGenerationParameters(new org.bouncycastle.crypto.params.ECDomainParameters(eCParameterSpec.getCurve(), eCParameterSpec.getG(), eCParameterSpec.getN(), eCParameterSpec.getH()), secureRandom);
        }

        public EC(java.lang.String str, org.bouncycastle.jcajce.provider.config.ProviderConfiguration providerConfiguration) {
            super(str);
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = 239;
            this.getInputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoSizes = providerConfiguration;
        }

        public EC() {
            super("EC");
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = 239;
            this.getInputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRanges = "EC";
            this.getHighSpeedVideoSizes = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION;
        }

        static {
            java.util.Hashtable hashtable = new java.util.Hashtable();
            getHighSpeedVideoSizesFor = hashtable;
            hashtable.put(org.bouncycastle.util.Integers.valueOf(192), new java.security.spec.ECGenParameterSpec("prime192v1"));
            getHighSpeedVideoSizesFor.put(org.bouncycastle.util.Integers.valueOf(239), new java.security.spec.ECGenParameterSpec("prime239v1"));
            getHighSpeedVideoSizesFor.put(org.bouncycastle.util.Integers.valueOf(256), new java.security.spec.ECGenParameterSpec("prime256v1"));
            getHighSpeedVideoSizesFor.put(org.bouncycastle.util.Integers.valueOf(224), new java.security.spec.ECGenParameterSpec("P-224"));
            getHighSpeedVideoSizesFor.put(org.bouncycastle.util.Integers.valueOf(384), new java.security.spec.ECGenParameterSpec(org.jose4j.keys.EllipticCurves.P_384));
            getHighSpeedVideoSizesFor.put(org.bouncycastle.util.Integers.valueOf(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL), new java.security.spec.ECGenParameterSpec(org.jose4j.keys.EllipticCurves.P_521));
        }
    }

    public static class ECDH extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDH() {
            super("ECDH", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDHC() {
            super("ECDHC", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECDSA() {
            super("ECDSA", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi.EC {
        public ECMQV() {
            super("ECMQV", org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(java.lang.String str) {
        super(str);
    }
}
