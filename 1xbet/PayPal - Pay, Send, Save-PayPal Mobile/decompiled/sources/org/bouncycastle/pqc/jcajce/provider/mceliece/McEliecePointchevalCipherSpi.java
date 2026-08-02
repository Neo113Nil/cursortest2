package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McEliecePointchevalCipherSpi extends org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private java.io.ByteArrayOutputStream getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher getHighSpeedVideoSizes;

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
        this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key), secureRandom);
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoSizes.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key);
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoSizes.init(false, generatePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public java.lang.String getName() {
        return "McEliecePointchevalCipher";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(java.security.Key key) throws java.security.InvalidKeyException {
        return this.getHighSpeedVideoSizes.getKeySize((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters) (key instanceof java.security.PublicKey ? org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key) : org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key)));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.BadPaddingException {
        update(bArr, i, i2);
        byte[] byteArray = this.getHighSpeedVideoFpsRanges.toByteArray();
        this.getHighSpeedVideoFpsRanges.reset();
        if (this.opMode == 1) {
            return this.getHighSpeedVideoSizes.messageEncrypt(byteArray);
        }
        if (this.opMode != 2) {
            return null;
        }
        try {
            return this.getHighSpeedVideoSizes.messageDecrypt(byteArray);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new javax.crypto.BadPaddingException(e.getMessage());
        }
    }

    public static class McEliecePointcheval extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi {
        public McEliecePointcheval() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher());
        }
    }

    public static class McEliecePointcheval224 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi {
        public McEliecePointcheval224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher());
        }
    }

    public static class McEliecePointcheval256 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi {
        public McEliecePointcheval256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher());
        }
    }

    public static class McEliecePointcheval384 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi {
        public McEliecePointcheval384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher());
        }
    }

    public static class McEliecePointcheval512 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePointchevalCipherSpi {
        public McEliecePointcheval512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher());
        }
    }

    protected McEliecePointchevalCipherSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher mcEliecePointchevalCipher) {
        this.getHighSpeedVideoFpsRanges = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoFpsRangesFor = digest;
        this.getHighSpeedVideoSizes = mcEliecePointchevalCipher;
        this.getHighSpeedVideoFpsRanges = new java.io.ByteArrayOutputStream();
    }
}
