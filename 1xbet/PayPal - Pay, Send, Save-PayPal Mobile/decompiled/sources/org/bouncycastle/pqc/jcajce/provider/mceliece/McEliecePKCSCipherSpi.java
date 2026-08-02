package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
public class McEliecePKCSCipherSpi extends org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers, org.bouncycastle.asn1.x509.X509ObjectIdentifiers {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceCipher getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageEncrypt(byte[] bArr) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        try {
            return this.getHighSpeedVideoFpsRanges.messageEncrypt(bArr);
        } catch (java.lang.Exception e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public byte[] messageDecrypt(byte[] bArr) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        try {
            return this.getHighSpeedVideoFpsRanges.messageDecrypt(bArr);
        } catch (java.lang.Exception e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoFpsRanges.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeysToParams.generatePublicKeyParameter((java.security.PublicKey) key), secureRandom));
        this.maxPlainTextSize = this.getHighSpeedVideoFpsRanges.maxPlainTextSize;
        this.cipherTextSize = this.getHighSpeedVideoFpsRanges.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.AsymmetricBlockCipher
    public void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.getHighSpeedVideoFpsRanges.init(false, org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key));
        this.maxPlainTextSize = this.getHighSpeedVideoFpsRanges.maxPlainTextSize;
        this.cipherTextSize = this.getHighSpeedVideoFpsRanges.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public java.lang.String getName() {
        return "McEliecePKCS";
    }

    public static class McEliecePKCS extends org.bouncycastle.pqc.jcajce.provider.mceliece.McEliecePKCSCipherSpi {
        public McEliecePKCS() {
            super(new org.bouncycastle.pqc.crypto.mceliece.McElieceCipher());
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public int getKeySize(java.security.Key key) throws java.security.InvalidKeyException {
        return this.getHighSpeedVideoFpsRanges.getKeySize((org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters) (key instanceof java.security.PublicKey ? org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeysToParams.generatePublicKeyParameter((java.security.PublicKey) key) : org.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeysToParams.generatePrivateKeyParameter((java.security.PrivateKey) key)));
    }

    public McEliecePKCSCipherSpi(org.bouncycastle.pqc.crypto.mceliece.McElieceCipher mcElieceCipher) {
        this.getHighSpeedVideoFpsRanges = mcElieceCipher;
    }
}
