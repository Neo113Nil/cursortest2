package org.bouncycastle.pqc.jcajce.provider.util;

/* loaded from: classes17.dex */
public abstract class AsymmetricBlockCipher extends org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt {
    protected java.io.ByteArrayOutputStream buf = new java.io.ByteArrayOutputStream();
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected java.security.spec.AlgorithmParameterSpec paramSpec;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    protected abstract void initCipherDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    protected abstract void initCipherEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    protected abstract byte[] messageDecrypt(byte[] bArr) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;

    protected abstract byte[] messageEncrypt(byte[] bArr) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setMode(java.lang.String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setPadding(java.lang.String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] update(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.buf.write(bArr, i, i2);
        }
        return new byte[0];
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        update(bArr, i, i2);
        return 0;
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
        if (i + this.buf.size() > getBlockSize()) {
            return 0;
        }
        return this.opMode == 1 ? this.cipherTextSize : this.maxPlainTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return this.opMode == 1 ? this.maxPlainTextSize : this.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        checkLength(i2);
        update(bArr, i, i2);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i3 = this.opMode;
        if (i3 == 1) {
            return messageEncrypt(byteArray);
        }
        if (i3 != 2) {
            return null;
        }
        return messageDecrypt(byteArray);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        if (bArr2.length < getOutputSize(i2)) {
            throw new javax.crypto.ShortBufferException("Output buffer too short.");
        }
        byte[] doFinal = doFinal(bArr, i, i2);
        java.lang.System.arraycopy(doFinal, 0, bArr2, i3, doFinal.length);
        return doFinal.length;
    }

    protected void checkLength(int i) throws javax.crypto.IllegalBlockSizeException {
        int size = i + this.buf.size();
        if (this.opMode == 1) {
            if (size <= this.maxPlainTextSize) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The length of the plaintext (");
            sb.append(size);
            sb.append(" bytes) is not supported by the cipher (max. ");
            sb.append(this.maxPlainTextSize);
            sb.append(" bytes).");
            throw new javax.crypto.IllegalBlockSizeException(sb.toString());
        }
        if (this.opMode != 2 || size == this.cipherTextSize) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal ciphertext length (expected ");
        sb2.append(this.cipherTextSize);
        sb2.append(" bytes, was ");
        sb2.append(size);
        sb2.append(" bytes).");
        throw new javax.crypto.IllegalBlockSizeException(sb2.toString());
    }
}
