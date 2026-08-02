package org.bouncycastle.pqc.jcajce.provider.sphincs;

/* loaded from: classes17.dex */
public class Sphincs256KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    java.security.SecureRandom Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyPairGenerator getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters getHighSpeedVideoSizes;

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("parameter object not a SPHINCS256KeyGenParameterSpec");
        }
        org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec sPHINCS256KeyGenParameterSpec = (org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec) algorithmParameterSpec;
        if (!sPHINCS256KeyGenParameterSpec.getTreeDigest().equals(org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec.SHA512_256)) {
            if (sPHINCS256KeyGenParameterSpec.getTreeDigest().equals("SHA3-256")) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256;
                sPHINCS256KeyGenerationParameters = new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.digests.SHA3Digest(256));
            }
            this.getHighSpeedVideoFpsRangesFor.init(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRanges = true;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256;
        sPHINCS256KeyGenerationParameters = new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters(secureRandom, new org.bouncycastle.crypto.digests.SHA512tDigest(256));
        this.getHighSpeedVideoSizes = sPHINCS256KeyGenerationParameters;
        this.getHighSpeedVideoFpsRangesFor.init(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, java.security.SecureRandom secureRandom) {
        throw new java.lang.IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public java.security.KeyPair generateKeyPair() {
        if (!this.getHighSpeedVideoFpsRanges) {
            org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters sPHINCS256KeyGenerationParameters = new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyGenerationParameters(this.Camera2StreamConfigurationMap, new org.bouncycastle.crypto.digests.SHA512tDigest(256));
            this.getHighSpeedVideoSizes = sPHINCS256KeyGenerationParameters;
            this.getHighSpeedVideoFpsRangesFor.init(sPHINCS256KeyGenerationParameters);
            this.getHighSpeedVideoFpsRanges = true;
        }
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair = this.getHighSpeedVideoFpsRangesFor.generateKeyPair();
        return new java.security.KeyPair(new org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey(this.getHighResolutionOutputSizeshNQ4ISI, (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters) generateKeyPair.getPublic()), new org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey(this.getHighResolutionOutputSizeshNQ4ISI, (org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    public Sphincs256KeyPairGeneratorSpi() {
        super("SPHINCS256");
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.crypto.sphincs.SPHINCS256KeyPairGenerator();
        this.Camera2StreamConfigurationMap = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        this.getHighSpeedVideoFpsRanges = false;
    }
}
