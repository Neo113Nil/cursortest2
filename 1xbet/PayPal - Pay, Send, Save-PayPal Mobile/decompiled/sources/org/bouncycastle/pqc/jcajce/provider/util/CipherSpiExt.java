package org.bouncycastle.pqc.jcajce.provider.util;

/* loaded from: classes17.dex */
public abstract class CipherSpiExt extends javax.crypto.CipherSpi {
    public static final int DECRYPT_MODE = 2;
    public static final int ENCRYPT_MODE = 1;
    protected int opMode;

    public abstract int doFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;

    public abstract byte[] doFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException;

    @Override // javax.crypto.CipherSpi
    protected final java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    public abstract int getBlockSize();

    public abstract byte[] getIV();

    public abstract int getKeySize(java.security.Key key) throws java.security.InvalidKeyException;

    public abstract java.lang.String getName();

    public abstract int getOutputSize(int i);

    public abstract java.security.spec.AlgorithmParameterSpec getParameters();

    public abstract void initDecrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    public abstract void initEncrypt(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException;

    protected abstract void setMode(java.lang.String str) throws java.security.NoSuchAlgorithmException;

    protected abstract void setPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException;

    public abstract int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException;

    public abstract byte[] update(byte[] bArr, int i, int i2);

    public final byte[] update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return update(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        return update(bArr, i, i2, bArr2, i3);
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        setPadding(str);
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        setMode(str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof java.security.spec.AlgorithmParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException();
        }
        if (key == null || !(key instanceof java.security.Key)) {
            throw new java.security.InvalidKeyException();
        }
        this.opMode = i;
        if (i == 1) {
            initEncrypt(key, algorithmParameterSpec, secureRandom);
        } else if (i == 2) {
            initDecrypt(key, algorithmParameterSpec);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new java.security.InvalidParameterException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected final void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, secureRandom);
        } else {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetOutputSize(int i) {
        return getOutputSize(i);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetKeySize(java.security.Key key) throws java.security.InvalidKeyException {
        if (key instanceof java.security.Key) {
            return getKeySize(key);
        }
        throw new java.security.InvalidKeyException("Unsupported key.");
    }

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineGetIV() {
        return getIV();
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineGetBlockSize() {
        return getBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    protected final byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        return doFinal(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    protected final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        return doFinal(bArr, i, i2, bArr2, i3);
    }

    public final byte[] doFinal(byte[] bArr) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        return doFinal(bArr, 0, bArr.length);
    }

    public final byte[] doFinal() throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        return doFinal(null, 0, 0);
    }
}
