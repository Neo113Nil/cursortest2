package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class GMCipherSpi extends javax.crypto.CipherSpi {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.engines.SM2Engine getHighSpeedVideoFpsRanges;
    private java.security.SecureRandom getHighSpeedVideoSizes;
    private final org.bouncycastle.jcajce.util.JcaJceHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.jcajce.util.BCJcaJceHelper();
    private int getInputFormats = -1;
    private org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi.ErasableOutputStream getHighSpeedVideoFpsRangesFor = new org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi.ErasableOutputStream();

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        if (!org.bouncycastle.util.Strings.toUpperCase(str).equals("NOPADDING")) {
            throw new javax.crypto.NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        if (!org.bouncycastle.util.Strings.toUpperCase(str).equals("NONE")) {
            throw new java.lang.IllegalArgumentException("can't support mode ".concat(java.lang.String.valueOf(str)));
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter highResolutionOutputSizeshNQ4ISI;
        if (i == 1 || i == 3) {
            if (!(key instanceof java.security.PublicKey)) {
                throw new java.security.InvalidKeyException("must be passed public EC key for encryption");
            }
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.PublicKey) key);
        } else {
            if (i != 2 && i != 4) {
                throw new java.security.InvalidKeyException("must be passed EC key");
            }
            if (!(key instanceof java.security.PrivateKey)) {
                throw new java.security.InvalidKeyException("must be passed private EC key for decryption");
            }
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
        }
        this.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
        if (secureRandom != null) {
            this.getHighSpeedVideoSizes = secureRandom;
        } else {
            this.getHighSpeedVideoSizes = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot handle supplied parameter spec: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (algorithmParameters == null) {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot recognise parameters: ");
            sb.append(algorithmParameters.getClass().getName());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        int i2 = this.getInputFormats;
        if (i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4) {
            return this.getHighSpeedVideoFpsRanges.getOutputSize(i);
        }
        throw new java.lang.IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(java.security.Key key) {
        if (key instanceof org.bouncycastle.jce.interfaces.ECKey) {
            return ((org.bouncycastle.jce.interfaces.ECKey) key).getParameters().getCurve().getFieldSize();
        }
        throw new java.lang.IllegalArgumentException("not an EC key");
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

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] processBlock;
        if (i2 != 0) {
            this.getHighSpeedVideoFpsRangesFor.write(bArr, i, i2);
        }
        try {
            int i3 = this.getInputFormats;
            if (i3 == 1 || i3 == 3) {
                try {
                    this.getHighSpeedVideoFpsRanges.init(true, new org.bouncycastle.crypto.params.ParametersWithRandom(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
                    processBlock = this.getHighSpeedVideoFpsRanges.processBlock(this.getHighSpeedVideoFpsRangesFor.getBuf(), 0, this.getHighSpeedVideoFpsRangesFor.size());
                    return processBlock;
                } catch (java.lang.Exception e) {
                    throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e);
                }
            }
            if (i3 != 2 && i3 != 4) {
                throw new java.lang.IllegalStateException("cipher not initialised");
            }
            try {
                this.getHighSpeedVideoFpsRanges.init(false, this.Camera2StreamConfigurationMap);
                processBlock = this.getHighSpeedVideoFpsRanges.processBlock(this.getHighSpeedVideoFpsRangesFor.getBuf(), 0, this.getHighSpeedVideoFpsRangesFor.size());
                return processBlock;
            } catch (java.lang.Exception e2) {
                throw new org.bouncycastle.jcajce.provider.util.BadBlockException("unable to process block", e2);
            }
        } finally {
            this.getHighSpeedVideoFpsRangesFor.erase();
        }
    }

    public static class SM2 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2() {
            super(new org.bouncycastle.crypto.engines.SM2Engine());
        }
    }

    public static class SM2withBlake2b extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withBlake2b() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.Blake2bDigest(512)));
        }
    }

    public static class SM2withBlake2s extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withBlake2s() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.Blake2sDigest(256)));
        }
    }

    public static class SM2withMD5 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withMD5() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.MD5Digest()));
        }
    }

    public static class SM2withRMD extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withRMD() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.RIPEMD160Digest()));
        }
    }

    public static class SM2withSha1 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withSha1() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.SHA1Digest()));
        }
    }

    public static class SM2withSha224 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withSha224() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.SHA224Digest()));
        }
    }

    public static class SM2withSha256 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withSha256() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.SHA256Digest()));
        }
    }

    public static class SM2withSha384 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withSha384() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.SHA384Digest()));
        }
    }

    public static class SM2withSha512 extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withSha512() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.SHA512Digest()));
        }
    }

    public static class SM2withWhirlpool extends org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi {
        public SM2withWhirlpool() {
            super(new org.bouncycastle.crypto.engines.SM2Engine(new org.bouncycastle.crypto.digests.WhirlpoolDigest()));
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        java.lang.System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public GMCipherSpi(org.bouncycastle.crypto.engines.SM2Engine sM2Engine) {
        this.getHighSpeedVideoFpsRanges = sM2Engine;
    }
}
