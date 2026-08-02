package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McElieceKobaraImaiCipherSpi extends org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher getHighSpeedVideoFpsRangesFor;
    private java.io.ByteArrayOutputStream getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int decryptOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public int encryptOutputSize(int i) {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.BadPaddingException {
        update(bArr, i, i2);
        if (this.opMode == 1) {
            org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher mcElieceKobaraImaiCipher = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes.write(1);
            byte[] byteArray = this.getHighSpeedVideoSizes.toByteArray();
            this.getHighSpeedVideoSizes.reset();
            return mcElieceKobaraImaiCipher.messageEncrypt(byteArray);
        }
        if (this.opMode != 2) {
            throw new java.lang.IllegalStateException("unknown mode in doFinal");
        }
        try {
            byte[] byteArray2 = this.getHighSpeedVideoSizes.toByteArray();
            this.getHighSpeedVideoSizes.reset();
            byte[] messageDecrypt = this.getHighSpeedVideoFpsRangesFor.messageDecrypt(byteArray2);
            int length = messageDecrypt.length - 1;
            while (length >= 0 && messageDecrypt[length] == 0) {
                length--;
            }
            if (messageDecrypt[length] != 1) {
                throw new javax.crypto.BadPaddingException("invalid ciphertext");
            }
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(messageDecrypt, 0, bArr2, 0, length);
            return bArr2;
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new javax.crypto.BadPaddingException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher, org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public byte[] update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
        return new byte[0];
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoSizes.reset();
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key), secureRandom);
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoFpsRangesFor.init(true, parametersWithRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricHybridCipher
    public void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoSizes.reset();
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key);
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        this.getHighSpeedVideoFpsRangesFor.init(false, generatePrivateKeyParameter);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public java.lang.String getName() {
        return "McElieceKobaraImaiCipher";
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(java.security.Key key) throws java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter generatePrivateKeyParameter;
        if (key instanceof java.security.PublicKey) {
            generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePublicKeyParameter((java.security.PublicKey) key);
        } else {
            if (!(key instanceof java.security.PrivateKey)) {
                throw new java.security.InvalidKeyException();
            }
            generatePrivateKeyParameter = org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key);
        }
        return this.getHighSpeedVideoFpsRangesFor.getKeySize((org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters) generatePrivateKeyParameter);
    }

    public static class McElieceKobaraImai extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA1(), new org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai224 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai224() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA224(), new org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai256 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai256() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA256(), new org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai384 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai384() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA384(), new org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher());
        }
    }

    public static class McElieceKobaraImai512 extends org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKobaraImaiCipherSpi {
        public McElieceKobaraImai512() {
            super(org.bouncycastle.crypto.util.DigestFactory.createSHA512(), new org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher());
        }
    }

    protected McElieceKobaraImaiCipherSpi(org.bouncycastle.crypto.Digest digest, org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher mcElieceKobaraImaiCipher) {
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRangesFor = mcElieceKobaraImaiCipher;
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
    }

    public McElieceKobaraImaiCipherSpi() {
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
        this.getHighSpeedVideoSizes = new java.io.ByteArrayOutputStream();
    }
}
