package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceFujisakiCipherSpi extends org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private java.io.ByteArrayOutputStream Camera2StreamConfigurationMap = new java.io.ByteArrayOutputStream();
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int encryptOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key), secureRandom);
        this.getHighSpeedVideoFpsRanges.reset();
        this.getHighSpeedVideoFpsRangesFor.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key);
        this.getHighSpeedVideoFpsRanges.reset();
        this.getHighSpeedVideoFpsRangesFor.init(false, generatePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public java.lang.String getName() {
        return "McElieceFujisakiCipher";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(java.security.Key key) throws java.security.InvalidKeyException {
        return this.getHighSpeedVideoFpsRangesFor.getKeySize((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters) (key instanceof java.security.PublicKey ? org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key) : org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.BadPaddingException {
        update(bArr, i, i2);
        byte[] byteArray = this.Camera2StreamConfigurationMap.toByteArray();
        this.Camera2StreamConfigurationMap.reset();
        if (this.opMode == 1) {
            return this.getHighSpeedVideoFpsRangesFor.messageEncrypt(byteArray);
        }
        if (this.opMode != 2) {
            throw new java.lang.IllegalStateException("unknown mode in doFinal");
        }
        try {
            return this.getHighSpeedVideoFpsRangesFor.messageDecrypt(byteArray);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new javax.crypto.BadPaddingException(e.getMessage());
        }
    }

    public static class McElieceFujisaki extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceFujisakiCipherSpi {
        public McElieceFujisaki() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher());
        }
    }

    protected McElieceFujisakiCipherSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher mcElieceFujisakiCipher) {
        this.getHighSpeedVideoFpsRanges = digest;
        this.getHighSpeedVideoFpsRangesFor = mcElieceFujisakiCipher;
    }
}
