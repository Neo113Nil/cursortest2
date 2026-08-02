package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseWrapCipher extends javax.crypto.CipherSpi implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private boolean Camera2StreamConfigurationMap;
    protected java.security.AlgorithmParameters engineParams;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighSpeedVideoFpsRangesFor;
    private java.lang.Class[] getHighSpeedVideoSizes;
    private org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream getOutputFormats;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected org.bouncycastle.crypto.Wrapper wrapEngine;

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(java.security.Key key) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new java.security.InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            org.bouncycastle.crypto.Wrapper wrapper = this.wrapEngine;
            return wrapper == null ? engineDoFinal(encoded, 0, encoded.length) : wrapper.wrap(encoded, 0, encoded.length);
        } catch (javax.crypto.BadPaddingException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream erasableOutputStream = this.getOutputFormats;
        if (erasableOutputStream == null) {
            throw new java.lang.IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream erasableOutputStream = this.getOutputFormats;
        if (erasableOutputStream == null) {
            throw new java.lang.IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected java.security.Key engineUnwrap(byte[] bArr, java.lang.String str, int i) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
        try {
            org.bouncycastle.crypto.Wrapper wrapper = this.wrapEngine;
            byte[] engineDoFinal = wrapper == null ? engineDoFinal(bArr, 0, bArr.length) : wrapper.unwrap(bArr, 0, bArr.length);
            if (i == 3) {
                return new javax.crypto.spec.SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i == 2) {
                try {
                    org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(engineDoFinal);
                    java.security.PrivateKey privateKey = org.bouncycastle.jce.provider.BouncyCastleProvider.getPrivateKey(privateKeyInfo);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("algorithm ");
                    sb.append(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
                    sb.append(" not supported");
                    throw new java.security.InvalidKeyException(sb.toString());
                } catch (java.lang.Exception unused) {
                    throw new java.security.InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                java.security.KeyFactory createKeyFactory = this.getHighSpeedVideoFpsRangesFor.createKeyFactory(str);
                if (i == 1) {
                    return createKeyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return createKeyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new java.security.InvalidKeyException("Unknown key type ".concat(java.lang.String.valueOf(i)));
            } catch (java.security.NoSuchProviderException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown key type ");
                sb2.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb2.toString());
            } catch (java.security.spec.InvalidKeySpecException e2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown key type ");
                sb3.append(e2.getMessage());
                throw new java.security.InvalidKeyException(sb3.toString());
            }
        } catch (javax.crypto.BadPaddingException e3) {
            throw new java.security.InvalidKeyException(e3.getMessage());
        } catch (javax.crypto.IllegalBlockSizeException e4) {
            throw new java.security.InvalidKeyException(e4.getMessage());
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e5) {
            throw new java.security.InvalidKeyException(e5.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding ");
        sb.append(str);
        sb.append(" unknown.");
        throw new javax.crypto.NoSuchPaddingException(sb.toString());
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.CipherParameters keyParameter;
        int i2;
        if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key;
            if (algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec) {
                keyParameter = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else {
                if (bCPBEKey.getParam() == null) {
                    throw new java.security.InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                keyParameter = bCPBEKey.getParam();
            }
        } else {
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
            byte[] iv = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
            this.getHighSpeedVideoFpsRanges = iv;
            keyParameter = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, iv);
        }
        if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec) {
            org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec gOST28147WrapParameterSpec = (org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec) algorithmParameterSpec;
            byte[] sBox = gOST28147WrapParameterSpec.getSBox();
            if (sBox != null) {
                keyParameter = new org.bouncycastle.crypto.params.ParametersWithSBox(keyParameter, sBox);
            }
            keyParameter = new org.bouncycastle.crypto.params.ParametersWithUKM(keyParameter, gOST28147WrapParameterSpec.getUKM());
        }
        if ((keyParameter instanceof org.bouncycastle.crypto.params.KeyParameter) && (i2 = this.getHighResolutionOutputSizeshNQ4ISI) != 0 && (i == 3 || i == 1)) {
            byte[] bArr = new byte[i2];
            this.getHighSpeedVideoFpsRanges = bArr;
            secureRandom.nextBytes(bArr);
            keyParameter = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, this.getHighSpeedVideoFpsRanges);
        }
        if (secureRandom != null) {
            keyParameter = new org.bouncycastle.crypto.params.ParametersWithRandom(keyParameter, secureRandom);
        }
        try {
            if (i != 1) {
                if (i == 2) {
                    this.wrapEngine.init(false, keyParameter);
                    this.getOutputFormats = new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream();
                } else if (i == 3) {
                    this.wrapEngine.init(true, keyParameter);
                    this.getOutputFormats = null;
                } else {
                    if (i != 4) {
                        throw new java.security.InvalidParameterException("Unknown mode parameter passed to init.");
                    }
                    this.wrapEngine.init(false, keyParameter);
                    this.getOutputFormats = null;
                }
                this.Camera2StreamConfigurationMap = false;
                return;
            }
            this.wrapEngine.init(true, keyParameter);
            this.getOutputFormats = new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream();
            this.Camera2StreamConfigurationMap = true;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.InvalidKeyOrParametersException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = org.bouncycastle.jcajce.provider.symmetric.util.SpecUtil.getHighSpeedVideoFpsRanges(algorithmParameters, this.getHighSpeedVideoSizes);
            if (algorithmParameterSpec == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't handle parameter ");
                sb.append(algorithmParameters.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.getHighSpeedVideoFpsRanges != null) {
            java.lang.String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoFpsRanges));
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(java.security.Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] wrap;
        org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream erasableOutputStream = this.getOutputFormats;
        if (erasableOutputStream == null) {
            throw new java.lang.IllegalStateException("not supported in a wrapping mode");
        }
        if (bArr != null) {
            erasableOutputStream.write(bArr, i, i2);
        }
        try {
            if (this.Camera2StreamConfigurationMap) {
                try {
                    wrap = this.wrapEngine.wrap(this.getOutputFormats.getBuf(), 0, this.getOutputFormats.size());
                    return wrap;
                } catch (java.lang.Exception e) {
                    throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
                }
            }
            try {
                wrap = this.wrapEngine.unwrap(this.getOutputFormats.getBuf(), 0, this.getOutputFormats.size());
                return wrap;
            } catch (org.bouncycastle.crypto.InvalidCipherTextException e2) {
                throw new javax.crypto.BadPaddingException(e2.getMessage());
            }
        } finally {
            this.getOutputFormats.erase();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:9:0x000c, B:10:0x003c, B:12:0x0041, B:16:0x004c, B:17:0x0053, B:23:0x002a, B:20:0x0020, B:21:0x0029, B:26:0x0055, B:27:0x005e), top: B:4:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:9:0x000c, B:10:0x003c, B:12:0x0041, B:16:0x004c, B:17:0x0053, B:23:0x002a, B:20:0x0020, B:21:0x0029, B:26:0x0055, B:27:0x005e), top: B:4:0x0007, inners: #0, #1 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        byte[] unwrap;
        org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream erasableOutputStream = this.getOutputFormats;
        if (erasableOutputStream == null) {
            throw new java.lang.IllegalStateException("not supported in a wrapping mode");
        }
        erasableOutputStream.write(bArr, i, i2);
        try {
            if (this.Camera2StreamConfigurationMap) {
                try {
                    unwrap = this.wrapEngine.wrap(this.getOutputFormats.getBuf(), 0, this.getOutputFormats.size());
                    if (unwrap.length + i3 <= bArr2.length) {
                        throw new javax.crypto.ShortBufferException("output buffer too short for input.");
                    }
                    java.lang.System.arraycopy(unwrap, 0, bArr2, i3, unwrap.length);
                    return unwrap.length;
                } catch (java.lang.Exception e) {
                    throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
                }
            }
            try {
                unwrap = this.wrapEngine.unwrap(this.getOutputFormats.getBuf(), 0, this.getOutputFormats.size());
                if (unwrap.length + i3 <= bArr2.length) {
                }
            } catch (org.bouncycastle.crypto.InvalidCipherTextException e2) {
                throw new javax.crypto.BadPaddingException(e2.getMessage());
            }
        } finally {
            this.getOutputFormats.erase();
        }
    }

    protected static final class ErasableOutputStream extends java.io.ByteArrayOutputStream {
        public final byte[] getBuf() {
            return this.buf;
        }

        public final void erase() {
            org.bouncycastle.util.Arrays.fill(this.buf, (byte) 0);
            reset();
        }
    }

    protected final java.security.AlgorithmParameters createParametersInstance(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        return this.getHighSpeedVideoFpsRangesFor.createAlgorithmParameters(str);
    }

    protected static class InvalidKeyOrParametersException extends java.security.InvalidKeyException {
        private final java.lang.Throwable getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        InvalidKeyOrParametersException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighSpeedVideoFpsRangesFor = th;
        }
    }

    public BaseWrapCipher(org.bouncycastle.crypto.Wrapper wrapper, int i) {
        this.getHighSpeedVideoSizes = new java.lang.Class[]{org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class, javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
        this.wrapEngine = wrapper;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public BaseWrapCipher(org.bouncycastle.crypto.Wrapper wrapper) {
        this(wrapper, 0);
    }

    protected BaseWrapCipher() {
        this.getHighSpeedVideoSizes = new java.lang.Class[]{org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class, javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    }
}
