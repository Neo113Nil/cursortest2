package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private int Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    KeyPairGeneratorSpi(int i) {
        this.getHighSpeedVideoSizes = i;
        if (((i == 1 || i == 2) ? -1 : (i == 3 || i == 4) ? -2 : i) != i) {
            this.Camera2StreamConfigurationMap = i;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator ed25519KeyPairGenerator;
        if (this.Camera2StreamConfigurationMap == 0) {
            throw new java.lang.IllegalStateException("generator not correctly initialized");
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            int i = this.Camera2StreamConfigurationMap;
            if (i == 1) {
                ed25519KeyPairGenerator = new org.bouncycastle.crypto.generators.Ed25519KeyPairGenerator();
                ed25519KeyPairGenerator.init(new org.bouncycastle.crypto.params.Ed25519KeyGenerationParameters(this.getHighResolutionOutputSizeshNQ4ISI));
            } else if (i == 2) {
                ed25519KeyPairGenerator = new org.bouncycastle.crypto.generators.Ed448KeyPairGenerator();
                ed25519KeyPairGenerator.init(new org.bouncycastle.crypto.params.Ed448KeyGenerationParameters(this.getHighResolutionOutputSizeshNQ4ISI));
            } else if (i == 3) {
                ed25519KeyPairGenerator = new org.bouncycastle.crypto.generators.X25519KeyPairGenerator();
                ed25519KeyPairGenerator.init(new org.bouncycastle.crypto.params.X25519KeyGenerationParameters(this.getHighResolutionOutputSizeshNQ4ISI));
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("generator not correctly initialized");
                }
                ed25519KeyPairGenerator = new org.bouncycastle.crypto.generators.X448KeyPairGenerator();
                ed25519KeyPairGenerator.init(new org.bouncycastle.crypto.params.X448KeyGenerationParameters(this.getHighResolutionOutputSizeshNQ4ISI));
            }
            this.getHighSpeedVideoFpsRangesFor = ed25519KeyPairGenerator;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRangesFor.generateKeyPair();
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 == 1 || i2 == 2) {
            return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPublicKey(generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.edec.BCEdDSAPrivateKey(generateKeyPair.getPrivate()));
        }
        if (i2 == 3 || i2 == 4) {
            return new java.security.KeyPair(new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPublicKey(generateKeyPair.getPublic()), new org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey(generateKeyPair.getPrivate()));
        }
        throw new java.lang.IllegalStateException("generator not correctly initialized");
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        int i2;
        int i3;
        if (i == 255 || i == 256) {
            int i4 = this.getHighSpeedVideoSizes;
            i2 = 3;
            if (i4 != -2) {
                i3 = 1;
                if (i4 != -1 && i4 != 1) {
                    if (i4 != 3) {
                        throw new java.security.InvalidParameterException("key size not configurable");
                    }
                }
                i2 = i3;
            }
            this.Camera2StreamConfigurationMap = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        if (i != 448) {
            throw new java.security.InvalidParameterException("unknown key size");
        }
        int i5 = this.getHighSpeedVideoSizes;
        i2 = 4;
        if (i5 != -2) {
            i3 = 2;
            if (i5 != -1 && i5 != 2) {
                if (i5 != 4) {
                    throw new java.security.InvalidParameterException("key size not configurable");
                }
            }
            i2 = i3;
        }
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        int i;
        java.lang.String name2 = algorithmParameterSpec instanceof java.security.spec.ECGenParameterSpec ? ((java.security.spec.ECGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec ? ((org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec) algorithmParameterSpec).getName() : algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.EdDSAParameterSpec ? ((org.bouncycastle.jcajce.spec.EdDSAParameterSpec) algorithmParameterSpec).getCurveName() : algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.XDHParameterSpec ? ((org.bouncycastle.jcajce.spec.XDHParameterSpec) algorithmParameterSpec).getCurveName() : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNameFrom(algorithmParameterSpec);
        if (name2 == null) {
            throw new java.security.InvalidAlgorithmParameterException("invalid parameterSpec: ".concat(java.lang.String.valueOf(algorithmParameterSpec)));
        }
        if (name2.equalsIgnoreCase("X25519") || name2.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X25519.getId())) {
            i = 3;
        } else if (name2.equalsIgnoreCase("Ed25519") || name2.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519.getId())) {
            i = 1;
        } else if (name2.equalsIgnoreCase("X448") || name2.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_X448.getId())) {
            i = 4;
        } else {
            if (!name2.equalsIgnoreCase("Ed448") && !name2.equals(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448.getId())) {
                throw new java.security.InvalidAlgorithmParameterException("invalid parameterSpec name: ".concat(java.lang.String.valueOf(name2)));
            }
            i = 2;
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 != i) {
            if (i2 != ((i == 1 || i == 2) ? -1 : (i == 3 || i == 4) ? -2 : i)) {
                throw new java.security.InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
        }
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public static final class Ed25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public Ed25519() {
            super(1);
        }
    }

    public static final class Ed448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public Ed448() {
            super(2);
        }
    }

    public static final class EdDSA extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1);
        }
    }

    public static final class X25519 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public X25519() {
            super(3);
        }
    }

    public static final class X448 extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public X448() {
            super(4);
        }
    }

    public static final class XDH extends org.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi {
        public XDH() {
            super(-2);
        }
    }
}
