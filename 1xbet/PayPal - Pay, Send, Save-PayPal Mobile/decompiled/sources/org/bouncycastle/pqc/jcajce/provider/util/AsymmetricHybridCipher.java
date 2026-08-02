package org.bouncycastle.pqc.jcajce.provider.util;

/* loaded from: classes17.dex */
public abstract class AsymmetricHybridCipher extends org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt {
    protected java.security.spec.AlgorithmParameterSpec paramSpec;

    protected abstract int decryptOutputSize(int i);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.BadPaddingException;

    protected abstract int encryptOutputSize(int i);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    protected abstract void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    protected abstract void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setMode(java.lang.String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setPadding(java.lang.String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] update(byte[] bArr, int i, int i2);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        if (bArr2.length < getOutputSize(i2)) {
            throw new javax.crypto.ShortBufferException("output");
        }
        byte[] update = update(bArr, i, i2);
        java.lang.System.arraycopy(update, 0, bArr2, i3, update.length);
        return update.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }

    public final void initEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        initEncrypt(key, algorithmParameterSpec, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
    }

    public final void initEncrypt(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            initEncrypt(key, null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException unused) {
            throw new java.security.InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(java.security.Key key) throws java.security.InvalidKeyException {
        try {
            initEncrypt(key, null, org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom());
        } catch (java.security.InvalidAlgorithmParameterException unused) {
            throw new java.security.InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    public final void initDecrypt(java.security.Key key) throws java.security.InvalidKeyException {
        try {
            initDecrypt(key, null);
        } catch (java.security.InvalidAlgorithmParameterException unused) {
            throw new java.security.InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final java.security.spec.AlgorithmParameterSpec getParameters() {
        return this.paramSpec;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i) {
        return this.opMode == 1 ? encryptOutputSize(i) : decryptOutputSize(i);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.BadPaddingException {
        if (bArr2.length < getOutputSize(i2)) {
            throw new javax.crypto.ShortBufferException("Output buffer too short.");
        }
        byte[] doFinal = doFinal(bArr, i, i2);
        java.lang.System.arraycopy(doFinal, 0, bArr2, i3, doFinal.length);
        return doFinal.length;
    }
}
