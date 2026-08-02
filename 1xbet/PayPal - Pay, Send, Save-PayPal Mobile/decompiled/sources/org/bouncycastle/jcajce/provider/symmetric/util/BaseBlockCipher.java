package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class BaseBlockCipher extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private static final java.lang.Class getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private java.lang.Class[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.params.AEADParameters getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ParametersWithIV getOutputFormats;
    private org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private javax.crypto.spec.PBEParameterSpec getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private int getValidOutputFormatsForInputhNQ4ISI;

    interface GenericBlockCipher {
        int Camera2StreamConfigurationMap(int i);

        org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap();

        void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2);

        int getHighResolutionOutputSizeshNQ4ISI(int i);

        boolean getHighResolutionOutputSizeshNQ4ISI();

        int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException;

        java.lang.String getHighSpeedVideoFpsRangesFor();

        int getHighSpeedVideoSizes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException;

        void getHighSpeedVideoSizes(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0270, code lost:
    
        r20.getOutputFormats = (org.bouncycastle.crypto.params.ParametersWithIV) r5;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0169, code lost:
    
        if (r7 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01b6, code lost:
    
        if (r7 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x026e, code lost:
    
        if (r7 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r7 != false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0510 A[Catch: Exception -> 0x0537, IllegalArgumentException -> 0x0542, TryCatch #3 {IllegalArgumentException -> 0x0542, Exception -> 0x0537, blocks: (B:71:0x04e4, B:72:0x04fd, B:73:0x04fe, B:74:0x050a, B:76:0x0510, B:78:0x0514, B:82:0x0505), top: B:66:0x04db }] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v80, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v11, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC5Parameters] */
    /* JADX WARN: Type inference failed for: r5v17, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC2Parameters] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.ParametersWithSBox] */
    /* JADX WARN: Type inference failed for: r5v20, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v31, types: [org.bouncycastle.crypto.params.AEADParameters] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void engineInit(int i, java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.CipherParameters cipherParameters;
        org.bouncycastle.crypto.CipherParameters cipherParameters2;
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV;
        org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom;
        org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher genericBlockCipher;
        org.bouncycastle.crypto.CipherParameters cipherParameters3;
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV2;
        org.bouncycastle.crypto.BlockCipher blockCipher;
        org.bouncycastle.crypto.params.KeyParameter keyParameter = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.engineParams = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        if (!(key instanceof javax.crypto.SecretKey)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key for algorithm ");
            sb.append(key != null ? key.getAlgorithm() : null);
            sb.append(" not suitable for symmetric enryption.");
            throw new java.security.InvalidKeyException(sb.toString());
        }
        if (algorithmParameterSpec == null && (blockCipher = this.getHighSpeedVideoFpsRanges) != null && blockCipher.getAlgorithmName().startsWith("RC5-64")) {
            throw new java.security.InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int i2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i2 == 2 || (key instanceof org.bouncycastle.jcajce.PKCS12Key)) {
            try {
                javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) key;
                if (algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec) {
                    this.getOutputStallDuration = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z = secretKey instanceof javax.crypto.interfaces.PBEKey;
                if (z && this.getOutputStallDuration == null) {
                    javax.crypto.interfaces.PBEKey pBEKey = (javax.crypto.interfaces.PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        throw new java.security.InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                    }
                    this.getOutputStallDuration = new javax.crypto.spec.PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.getOutputStallDuration == null && !z) {
                    throw new java.security.InvalidKeyException("Algorithm requires a PBE key");
                }
                if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
                    org.bouncycastle.crypto.CipherParameters param = ((org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key).getParam();
                    if (!(param instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                        if (param != null) {
                            throw new java.security.InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                        }
                        param = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI * 8, this.getOutputStallDuration, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
                    }
                    cipherParameters = param;
                } else {
                    cipherParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI * 8, this.getOutputStallDuration, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
                }
                boolean z2 = cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV;
                keyParameter = cipherParameters;
                cipherParameters2 = cipherParameters;
            } catch (java.lang.Exception unused) {
                throw new java.security.InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof org.bouncycastle.jcajce.PBKDF1Key) {
            org.bouncycastle.jcajce.PBKDF1Key pBKDF1Key = (org.bouncycastle.jcajce.PBKDF1Key) key;
            if (algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec) {
                this.getOutputStallDuration = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof org.bouncycastle.jcajce.PBKDF1KeyWithParameters) && this.getOutputStallDuration == null) {
                org.bouncycastle.jcajce.PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (org.bouncycastle.jcajce.PBKDF1KeyWithParameters) pBKDF1Key;
                this.getOutputStallDuration = new javax.crypto.spec.PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            org.bouncycastle.crypto.CipherParameters makePBEParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI * 8, this.getOutputStallDuration, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
            boolean z3 = makePBEParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV;
            keyParameter = makePBEParameters;
            cipherParameters2 = makePBEParameters;
        } else if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key;
            this.getOutputStallDurationlomOqCM = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                org.bouncycastle.crypto.CipherParameters param2 = bCPBEKey.getParam();
                if (param2 instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
                    org.bouncycastle.crypto.CipherParameters parameters = ((org.bouncycastle.crypto.params.ParametersWithIV) param2).getParameters();
                    if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                        parametersWithIV2 = new org.bouncycastle.crypto.params.ParametersWithIV(parameters, ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV());
                    } else {
                        cipherParameters3 = param2;
                        if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) {
                            org.bouncycastle.jcajce.spec.GOST28147ParameterSpec gOST28147ParameterSpec = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec;
                            org.bouncycastle.crypto.params.ParametersWithSBox parametersWithSBox = new org.bouncycastle.crypto.params.ParametersWithSBox(param2, gOST28147ParameterSpec.getSbox());
                            if (gOST28147ParameterSpec.getIV() == null || this.getInputSizeshNQ4ISI == 0) {
                                cipherParameters3 = parametersWithSBox;
                            } else {
                                parametersWithIV2 = new org.bouncycastle.crypto.params.ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
                            }
                        }
                    }
                    this.getOutputFormats = parametersWithIV2;
                    cipherParameters3 = parametersWithIV2;
                } else if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                    org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV3 = new org.bouncycastle.crypto.params.ParametersWithIV(param2, ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV());
                    this.getOutputFormats = parametersWithIV3;
                    cipherParameters3 = parametersWithIV3;
                } else {
                    cipherParameters3 = param2;
                    if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) {
                        org.bouncycastle.jcajce.spec.GOST28147ParameterSpec gOST28147ParameterSpec2 = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec;
                        org.bouncycastle.crypto.params.ParametersWithSBox parametersWithSBox2 = new org.bouncycastle.crypto.params.ParametersWithSBox(param2, gOST28147ParameterSpec2.getSbox());
                        cipherParameters3 = (gOST28147ParameterSpec2.getIV() == null || this.getInputSizeshNQ4ISI == 0) ? parametersWithSBox2 : new org.bouncycastle.crypto.params.ParametersWithIV(parametersWithSBox2, gOST28147ParameterSpec2.getIV());
                    }
                }
            } else {
                if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                    throw new java.security.InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.getOutputStallDuration = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
                cipherParameters3 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap().getAlgorithmName());
            }
            boolean z4 = cipherParameters3 instanceof org.bouncycastle.crypto.params.ParametersWithIV;
            keyParameter = cipherParameters3;
            cipherParameters2 = cipherParameters3;
        } else if (key instanceof javax.crypto.interfaces.PBEKey) {
            javax.crypto.interfaces.PBEKey pBEKey2 = (javax.crypto.interfaces.PBEKey) key;
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            this.getOutputStallDuration = pBEParameterSpec;
            if ((pBEKey2 instanceof org.bouncycastle.jcajce.PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                this.getOutputStallDuration = new javax.crypto.spec.PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
            }
            org.bouncycastle.crypto.CipherParameters makePBEParameters2 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI * 8, this.getOutputStallDuration, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
            boolean z5 = makePBEParameters2 instanceof org.bouncycastle.crypto.params.ParametersWithIV;
            keyParameter = makePBEParameters2;
            cipherParameters2 = makePBEParameters2;
        } else if (!(key instanceof org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec)) {
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 5) {
                throw new java.security.InvalidKeyException("Algorithm requires a PBE key");
            }
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
        }
        try {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec)) {
                if (!(algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec)) {
                    if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) {
                        org.bouncycastle.jcajce.spec.GOST28147ParameterSpec gOST28147ParameterSpec3 = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec;
                        keyParameter = new org.bouncycastle.crypto.params.ParametersWithSBox(new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded()), gOST28147ParameterSpec3.getSbox());
                        if (gOST28147ParameterSpec3.getIV() != null && this.getInputSizeshNQ4ISI != 0) {
                            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, gOST28147ParameterSpec3.getIV());
                            keyParameter = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec) {
                        javax.crypto.spec.RC2ParameterSpec rC2ParameterSpec = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
                        keyParameter = new org.bouncycastle.crypto.params.RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                        if (rC2ParameterSpec.getIV() != null && this.getInputSizeshNQ4ISI != 0) {
                            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, rC2ParameterSpec.getIV());
                            keyParameter = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof javax.crypto.spec.RC5ParameterSpec) {
                        javax.crypto.spec.RC5ParameterSpec rC5ParameterSpec = (javax.crypto.spec.RC5ParameterSpec) algorithmParameterSpec;
                        keyParameter = new org.bouncycastle.crypto.params.RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                        if (!this.getHighSpeedVideoFpsRanges.getAlgorithmName().startsWith("RC5")) {
                            throw new java.security.InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
                        }
                        if (this.getHighSpeedVideoFpsRanges.getAlgorithmName().equals("RC5-32")) {
                            if (rC5ParameterSpec.getWordSize() != 32) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("RC5 already set up for a word size of 32 not ");
                                sb2.append(rC5ParameterSpec.getWordSize());
                                sb2.append(".");
                                throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
                            }
                        } else if (this.getHighSpeedVideoFpsRanges.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("RC5 already set up for a word size of 64 not ");
                            sb3.append(rC5ParameterSpec.getWordSize());
                            sb3.append(".");
                            throw new java.security.InvalidAlgorithmParameterException(sb3.toString());
                        }
                        if (rC5ParameterSpec.getIV() != null && this.getInputSizeshNQ4ISI != 0) {
                            parametersWithIV = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, rC5ParameterSpec.getIV());
                            keyParameter = parametersWithIV;
                        }
                    } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.FPEParameterSpec) {
                        org.bouncycastle.jcajce.spec.FPEParameterSpec fPEParameterSpec = (org.bouncycastle.jcajce.spec.FPEParameterSpec) algorithmParameterSpec;
                        keyParameter = new org.bouncycastle.crypto.params.FPEParameters(keyParameter, fPEParameterSpec.getRadix(), fPEParameterSpec.getTweak(), fPEParameterSpec.isUsingInverseFunction());
                    } else {
                        java.lang.Class cls = getHighResolutionOutputSizeshNQ4ISI;
                        if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                            if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                                throw new java.security.InvalidAlgorithmParameterException("unknown parameter type.");
                            }
                        } else {
                            if (!getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM) && !(this.getHighSpeedVideoSizes instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher)) {
                                throw new java.security.InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                            }
                            keyParameter = org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.Camera2StreamConfigurationMap(keyParameter instanceof org.bouncycastle.crypto.params.ParametersWithIV ? (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) keyParameter).getParameters() : keyParameter, algorithmParameterSpec);
                        }
                    }
                    this.getOutputFormats = keyParameter;
                } else if (this.getInputSizeshNQ4ISI != 0) {
                    javax.crypto.spec.IvParameterSpec ivParameterSpec = (javax.crypto.spec.IvParameterSpec) algorithmParameterSpec;
                    if (ivParameterSpec.getIV().length != this.getInputSizeshNQ4ISI && !(this.getHighSpeedVideoSizes instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) && this.getInputFormats) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("IV must be ");
                        sb4.append(this.getInputSizeshNQ4ISI);
                        sb4.append(" bytes long.");
                        throw new java.security.InvalidAlgorithmParameterException(sb4.toString());
                    }
                    keyParameter = keyParameter instanceof org.bouncycastle.crypto.params.ParametersWithIV ? new org.bouncycastle.crypto.params.ParametersWithIV(((org.bouncycastle.crypto.params.ParametersWithIV) keyParameter).getParameters(), ivParameterSpec.getIV()) : new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, ivParameterSpec.getIV());
                    this.getOutputFormats = keyParameter;
                } else {
                    java.lang.String str = this.getOutputMinFrameDurationlomOqCM;
                    if (str != null && str.equals("ECB")) {
                        throw new java.security.InvalidAlgorithmParameterException("ECB mode does not use an IV");
                    }
                }
                parametersWithRandom = keyParameter;
                if (this.getInputSizeshNQ4ISI != 0) {
                    boolean z6 = keyParameter instanceof org.bouncycastle.crypto.params.ParametersWithIV;
                    parametersWithRandom = keyParameter;
                    if (!z6) {
                        boolean z7 = keyParameter instanceof org.bouncycastle.crypto.params.AEADParameters;
                        parametersWithRandom = keyParameter;
                        if (!z7) {
                            java.security.SecureRandom secureRandom2 = secureRandom == null ? org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom() : secureRandom;
                            if (i == 1 || i == 3) {
                                byte[] bArr = new byte[this.getInputSizeshNQ4ISI];
                                secureRandom2.nextBytes(bArr);
                                ?? parametersWithIV4 = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, bArr);
                                this.getOutputFormats = parametersWithIV4;
                                parametersWithRandom = parametersWithIV4;
                            } else {
                                parametersWithRandom = keyParameter;
                                if (this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap().getAlgorithmName().indexOf("PGPCFB") < 0) {
                                    throw new java.security.InvalidAlgorithmParameterException("no IV set when one expected");
                                }
                            }
                        }
                    }
                }
                if (secureRandom != null && this.getOutputSizes) {
                    parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(parametersWithRandom, secureRandom);
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("unknown opmode ");
                                sb5.append(i);
                                sb5.append(" passed");
                                throw new java.security.InvalidParameterException(sb5.toString());
                            }
                        }
                    }
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(false, parametersWithRandom);
                    genericBlockCipher = this.getHighSpeedVideoSizes;
                    if ((genericBlockCipher instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) && this.getHighSpeedVideoFpsRangesFor == null) {
                        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.params.AEADParameters((org.bouncycastle.crypto.params.KeyParameter) this.getOutputFormats.getParameters(), ((org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) genericBlockCipher).getHighResolutionOutputSizeshNQ4ISI.getMac().length * 8, this.getOutputFormats.getIV());
                        return;
                    }
                    return;
                }
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(true, parametersWithRandom);
                genericBlockCipher = this.getHighSpeedVideoSizes;
                if (genericBlockCipher instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) {
                    return;
                } else {
                    return;
                }
            }
            if (!getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM) && !(this.getHighSpeedVideoSizes instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher)) {
                throw new java.security.InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
            }
            org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
            keyParameter = new org.bouncycastle.crypto.params.AEADParameters(keyParameter instanceof org.bouncycastle.crypto.params.ParametersWithIV ? (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) keyParameter).getParameters() : keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
            if (i != 1) {
            }
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(true, parametersWithRandom);
            genericBlockCipher = this.getHighSpeedVideoSizes;
            if (genericBlockCipher instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) {
            }
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.security.InvalidAlgorithmParameterException(e.getMessage(), e);
        } catch (java.lang.Exception e2) {
            throw new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.InvalidKeyOrParametersException(e2.getMessage(), e2);
        }
        this.getHighSpeedVideoFpsRangesFor = keyParameter;
        parametersWithRandom = keyParameter;
        if (this.getInputSizeshNQ4ISI != 0) {
        }
        if (secureRandom != null) {
            parametersWithRandom = new org.bouncycastle.crypto.params.ParametersWithRandom(parametersWithRandom, secureRandom);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(java.nio.ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining <= 0) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int min = java.lang.Math.min(512, remaining);
            byteBuffer.get(bArr2, 0, min);
            engineUpdateAAD(bArr2, 0, min);
            remaining -= min;
        } while (remaining > 0);
        org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(i2);
        if (highResolutionOutputSizeshNQ4ISI <= 0) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[highResolutionOutputSizeshNQ4ISI];
        int highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2, bArr2, 0);
        if (highSpeedVideoSizes == 0) {
            return null;
        }
        if (highSpeedVideoSizes == highResolutionOutputSizeshNQ4ISI) {
            return bArr2;
        }
        byte[] bArr3 = new byte[highSpeedVideoSizes];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, highSpeedVideoSizes);
        return bArr3;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.ShortBufferException {
        if (this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(i2) + i3 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2, bArr2, i3);
        } catch (org.bouncycastle.crypto.DataLengthException e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(java.lang.String str) throws javax.crypto.NoSuchPaddingException {
        org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new javax.crypto.NoSuchPaddingException("no padding supported for this algorithm");
        }
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (!this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI()) {
                return;
            } else {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap()));
            }
        } else if (upperCase.equals("WITHCTS") || upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
            bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.CTSBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap()));
        } else {
            this.getOutputSizes = true;
            if (getHighSpeedVideoFpsRanges(this.getOutputMinFrameDurationlomOqCM)) {
                throw new javax.crypto.NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            }
            if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap());
            } else if (upperCase.equals("ZEROBYTEPADDING")) {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), new org.bouncycastle.crypto.paddings.ZeroBytePadding());
            } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), new org.bouncycastle.crypto.paddings.ISO10126d2Padding());
            } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), new org.bouncycastle.crypto.paddings.X923Padding());
            } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), new org.bouncycastle.crypto.paddings.ISO7816d4Padding());
            } else {
                if (!upperCase.equals("TBCPADDING")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Padding ");
                    sb.append(str);
                    sb.append(" unknown.");
                    throw new javax.crypto.NoSuchPaddingException(sb.toString());
                }
                bufferedGenericBlockCipher = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), new org.bouncycastle.crypto.paddings.TBCPadding());
            }
        }
        this.getHighSpeedVideoSizes = bufferedGenericBlockCipher;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.security.NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        this.getOutputMinFrameDurationlomOqCM = upperCase;
        if (upperCase.equals("ECB")) {
            this.getInputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(this.getHighSpeedVideoFpsRanges);
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("CBC")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(this.getHighSpeedVideoFpsRanges));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.startsWith("OFB")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            if (this.getOutputMinFrameDurationlomOqCM.length() != 3) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(this.getHighSpeedVideoFpsRanges, java.lang.Integer.parseInt(this.getOutputMinFrameDurationlomOqCM.substring(3))));
                return;
            } else {
                org.bouncycastle.crypto.BlockCipher blockCipher = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
                return;
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM.startsWith("CFB")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            if (this.getOutputMinFrameDurationlomOqCM.length() != 3) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(this.getHighSpeedVideoFpsRanges, java.lang.Integer.parseInt(this.getOutputMinFrameDurationlomOqCM.substring(3))));
                return;
            } else {
                org.bouncycastle.crypto.BlockCipher blockCipher2 = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(blockCipher2, blockCipher2.getBlockSize() * 8));
                return;
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM.startsWith("PGPCFB")) {
            boolean equals = this.getOutputMinFrameDurationlomOqCM.equals("PGPCFBWITHIV");
            if (equals || this.getOutputMinFrameDurationlomOqCM.length() == 6) {
                this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.PGPCFBBlockCipher(this.getHighSpeedVideoFpsRanges, equals));
                return;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("no mode support for ");
                sb.append(this.getOutputMinFrameDurationlomOqCM);
                throw new java.security.NoSuchAlgorithmException(sb.toString());
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("OPENPGPCFB")) {
            this.getInputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher(this.getHighSpeedVideoFpsRanges));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("FF1")) {
            this.getInputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedFPEBlockCipher(new org.bouncycastle.crypto.fpe.FPEFF1Engine(this.getHighSpeedVideoFpsRanges));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("FF3-1")) {
            this.getInputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedFPEBlockCipher(new org.bouncycastle.crypto.fpe.FPEFF3_1Engine(this.getHighSpeedVideoFpsRanges));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("SIC")) {
            int blockSize = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getInputSizeshNQ4ISI = blockSize;
            if (blockSize < 16) {
                throw new java.lang.IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
            }
            this.getInputFormats = false;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.SICBlockCipher(this.getHighSpeedVideoFpsRanges)));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("CTR")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getInputFormats = false;
            org.bouncycastle.crypto.BlockCipher blockCipher3 = this.getHighSpeedVideoFpsRanges;
            if (blockCipher3 instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.KCTRBlockCipher(blockCipher3)));
                return;
            } else {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.SICBlockCipher(blockCipher3)));
                return;
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("GOFB")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.GOFBBlockCipher(this.getHighSpeedVideoFpsRanges)));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("GCFB")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.GCFBBlockCipher(this.getHighSpeedVideoFpsRanges)));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("CTS")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(new org.bouncycastle.crypto.modes.CTSBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(this.getHighSpeedVideoFpsRanges)));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("CCM")) {
            this.getInputSizeshNQ4ISI = 12;
            if (this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.KCCMBlockCipher(this.getHighSpeedVideoFpsRanges));
                return;
            } else {
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.CCMBlockCipher(this.getHighSpeedVideoFpsRanges));
                return;
            }
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("OCB")) {
            if (this.getOutputMinFrameDuration == null) {
                throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
            }
            this.getInputSizeshNQ4ISI = 15;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.OCBBlockCipher(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration.get()));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("EAX")) {
            this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getBlockSize();
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.EAXBlockCipher(this.getHighSpeedVideoFpsRanges));
            return;
        }
        if (this.getOutputMinFrameDurationlomOqCM.equals("GCM-SIV")) {
            this.getInputSizeshNQ4ISI = 12;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.GCMSIVBlockCipher(this.getHighSpeedVideoFpsRanges));
        } else {
            if (!this.getOutputMinFrameDurationlomOqCM.equals(com.google.android.gms.stats.CodePackage.GCM)) {
                throw new java.security.NoSuchAlgorithmException("can't support mode ".concat(java.lang.String.valueOf(str)));
            }
            org.bouncycastle.crypto.BlockCipher blockCipher4 = this.getHighSpeedVideoFpsRanges;
            if (blockCipher4 instanceof org.bouncycastle.crypto.engines.DSTU7624Engine) {
                this.getInputSizeshNQ4ISI = blockCipher4.getBlockSize();
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.KGCMBlockCipher(this.getHighSpeedVideoFpsRanges));
            } else {
                this.getInputSizeshNQ4ISI = 12;
                this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(new org.bouncycastle.crypto.modes.GCMBlockCipher(this.getHighSpeedVideoFpsRanges));
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            engineInit(i, key, (java.security.spec.AlgorithmParameterSpec) null, secureRandom);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new java.security.InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i, java.security.Key key, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = org.bouncycastle.jcajce.provider.symmetric.util.SpecUtil.getHighSpeedVideoFpsRanges(algorithmParameters, this.Camera2StreamConfigurationMap);
            if (algorithmParameterSpec == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("can't handle parameter ");
                sb.append(algorithmParameters.toString());
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected java.security.AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.getOutputStallDuration != null) {
                try {
                    this.engineParams = createParametersInstance(this.getOutputStallDurationlomOqCM);
                    this.engineParams.init(this.getOutputStallDuration);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else if (this.getHighSpeedVideoFpsRangesFor != null) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    try {
                        this.engineParams = createParametersInstance(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
                        this.engineParams.init(new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor.getNonce()).getEncoded());
                    } catch (java.lang.Exception e) {
                        throw new java.lang.RuntimeException(e.toString());
                    }
                } else {
                    try {
                        this.engineParams = createParametersInstance(com.google.android.gms.stats.CodePackage.GCM);
                        this.engineParams.init(new org.bouncycastle.internal.asn1.cms.GCMParameters(this.getHighSpeedVideoFpsRangesFor.getNonce(), this.getHighSpeedVideoFpsRangesFor.getMacSize() / 8).getEncoded());
                    } catch (java.lang.Exception e2) {
                        throw new java.lang.RuntimeException(e2.toString());
                    }
                }
            } else if (this.getOutputFormats != null) {
                java.lang.String algorithmName = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    this.engineParams = createParametersInstance(algorithmName);
                    this.engineParams.init(new javax.crypto.spec.IvParameterSpec(this.getOutputFormats.getIV()));
                } catch (java.lang.Exception e3) {
                    throw new java.lang.RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i) {
        return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(i);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(java.security.Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        org.bouncycastle.crypto.params.AEADParameters aEADParameters = this.getHighSpeedVideoFpsRangesFor;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = this.getOutputFormats;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        org.bouncycastle.crypto.BlockCipher blockCipher = this.getHighSpeedVideoFpsRanges;
        if (blockCipher == null) {
            return -1;
        }
        return blockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i, int i2) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int highSpeedVideoSizes = i2 != 0 ? this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int highSpeedVideoFpsRangesFor = highSpeedVideoSizes + this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(bArr2, highSpeedVideoSizes);
            if (highSpeedVideoFpsRangesFor == engineGetOutputSize) {
                return bArr2;
            }
            if (highSpeedVideoFpsRangesFor > engineGetOutputSize) {
                throw new javax.crypto.IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[highSpeedVideoFpsRangesFor];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, highSpeedVideoFpsRangesFor);
            return bArr3;
        } catch (org.bouncycastle.crypto.DataLengthException e) {
            throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
        }
    }

    static class AEADGenericBlockCipher implements org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher {
        private static final java.lang.reflect.Constructor Camera2StreamConfigurationMap;
        private org.bouncycastle.crypto.modes.AEADCipher getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI.processAADBytes(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoSizes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
            return this.getHighResolutionOutputSizeshNQ4ISI.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void getHighSpeedVideoSizes(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
            this.getHighResolutionOutputSizeshNQ4ISI.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighResolutionOutputSizeshNQ4ISI(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap() {
            org.bouncycastle.crypto.modes.AEADCipher aEADCipher = this.getHighResolutionOutputSizeshNQ4ISI;
            if (aEADCipher instanceof org.bouncycastle.crypto.modes.AEADBlockCipher) {
                return ((org.bouncycastle.crypto.modes.AEADBlockCipher) aEADCipher).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int Camera2StreamConfigurationMap(int i) {
            return this.getHighResolutionOutputSizeshNQ4ISI.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            org.bouncycastle.crypto.modes.AEADCipher aEADCipher = this.getHighResolutionOutputSizeshNQ4ISI;
            return aEADCipher instanceof org.bouncycastle.crypto.modes.AEADBlockCipher ? ((org.bouncycastle.crypto.modes.AEADBlockCipher) aEADCipher).getUnderlyingCipher().getAlgorithmName() : aEADCipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException {
            javax.crypto.BadPaddingException badPaddingException;
            try {
                return this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr, i);
            } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
                java.lang.reflect.Constructor constructor = Camera2StreamConfigurationMap;
                if (constructor != null) {
                    try {
                        badPaddingException = (javax.crypto.BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (java.lang.Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new javax.crypto.BadPaddingException(e.getMessage());
            }
        }

        private static java.lang.reflect.Constructor getHighResolutionOutputSizeshNQ4ISI(java.lang.Class cls) {
            try {
                return cls.getConstructor(java.lang.String.class);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }

        AEADGenericBlockCipher(org.bouncycastle.crypto.modes.AEADCipher aEADCipher) {
            this.getHighResolutionOutputSizeshNQ4ISI = aEADCipher;
        }

        static {
            java.lang.Class loadClass = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            Camera2StreamConfigurationMap = loadClass != null ? getHighResolutionOutputSizeshNQ4ISI(loadClass) : null;
        }
    }

    static class BufferedGenericBlockCipher implements org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher {
        private org.bouncycastle.crypto.BufferedBlockCipher getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return !(this.getHighSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.modes.CTSBlockCipher);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoSizes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
            return this.getHighSpeedVideoFpsRanges.processBytes(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void getHighSpeedVideoSizes(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
            this.getHighSpeedVideoFpsRanges.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighResolutionOutputSizeshNQ4ISI(int i) {
            return this.getHighSpeedVideoFpsRanges.getUpdateOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRanges.getUnderlyingCipher();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int Camera2StreamConfigurationMap(int i) {
            return this.getHighSpeedVideoFpsRanges.getOutputSize(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRanges.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException {
            try {
                return this.getHighSpeedVideoFpsRanges.doFinal(bArr, i);
            } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
                throw new javax.crypto.BadPaddingException(e.getMessage());
            }
        }

        BufferedGenericBlockCipher(org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher) {
            this.getHighSpeedVideoFpsRanges = bufferedBlockCipher;
        }

        BufferedGenericBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, org.bouncycastle.crypto.paddings.BlockCipherPadding blockCipherPadding) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        BufferedGenericBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(blockCipher);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException, javax.crypto.ShortBufferException {
        int highSpeedVideoSizes;
        if (engineGetOutputSize(i2) + i3 > bArr2.length) {
            throw new javax.crypto.ShortBufferException("output buffer too short for input.");
        }
        if (i2 != 0) {
            try {
                highSpeedVideoSizes = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(bArr, i, i2, bArr2, i3);
            } catch (org.bouncycastle.crypto.OutputLengthException e) {
                throw new javax.crypto.IllegalBlockSizeException(e.getMessage());
            } catch (org.bouncycastle.crypto.DataLengthException e2) {
                throw new javax.crypto.IllegalBlockSizeException(e2.getMessage());
            }
        } else {
            highSpeedVideoSizes = 0;
        }
        return highSpeedVideoSizes + this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(bArr2, i3 + highSpeedVideoSizes);
    }

    private static boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        return "CCM".equals(str) || "EAX".equals(str) || com.google.android.gms.stats.CodePackage.GCM.equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    public BaseBlockCipher(org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider blockCipherProvider) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = blockCipherProvider.get();
        this.getOutputMinFrameDuration = blockCipherProvider;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    static class BufferedFPEBlockCipher implements org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher {
        private org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream Camera2StreamConfigurationMap = new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.ErasableOutputStream();
        private org.bouncycastle.crypto.fpe.FPEEngine getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighResolutionOutputSizeshNQ4ISI(int i) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
            throw new java.lang.UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoSizes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
            this.Camera2StreamConfigurationMap.write(bArr, i, i2);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final void getHighSpeedVideoSizes(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
            this.getHighSpeedVideoSizes.init(z, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap() {
            throw new java.lang.IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int Camera2StreamConfigurationMap(int i) {
            return this.Camera2StreamConfigurationMap.size() + i;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoSizes.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public final int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.BadPaddingException {
            try {
                return this.getHighSpeedVideoSizes.processBlock(this.Camera2StreamConfigurationMap.getBuf(), 0, this.Camera2StreamConfigurationMap.size(), bArr, i);
            } finally {
                this.Camera2StreamConfigurationMap.erase();
            }
        }

        BufferedFPEBlockCipher(org.bouncycastle.crypto.fpe.FPEEngine fPEEngine) {
            this.getHighSpeedVideoSizes = fPEEngine;
        }
    }

    public BaseBlockCipher(org.bouncycastle.crypto.modes.AEADCipher aEADCipher, boolean z, int i) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputFormats = z;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(aEADCipher);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = aEADBlockCipher.getUnderlyingCipher();
        this.getInputFormats = z;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.modes.AEADBlockCipher aEADBlockCipher) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = aEADBlockCipher.getUnderlyingCipher();
        this.getInputSizeshNQ4ISI = aEADBlockCipher.getAlgorithmName().indexOf(com.google.android.gms.stats.CodePackage.GCM) >= 0 ? 12 : this.getHighSpeedVideoFpsRanges.getBlockSize();
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher, boolean z, int i) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = bufferedBlockCipher.getUnderlyingCipher();
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(bufferedBlockCipher);
        this.getInputFormats = z;
        this.getInputSizeshNQ4ISI = i / 8;
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher, int i) {
        this(bufferedBlockCipher, true, i);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, boolean z, int i) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = blockCipher;
        this.getInputFormats = z;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(blockCipher);
        this.getInputSizeshNQ4ISI = i / 8;
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = blockCipher;
        this.getValidOutputFormatsForInputhNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = i2;
        this.getOutputSizeshNQ4ISI = i3;
        this.getInputSizeshNQ4ISI = i4;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        this(blockCipher, true, i);
    }

    public BaseBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.Camera2StreamConfigurationMap = new java.lang.Class[]{javax.crypto.spec.RC2ParameterSpec.class, javax.crypto.spec.RC5ParameterSpec.class, getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class, javax.crypto.spec.IvParameterSpec.class, javax.crypto.spec.PBEParameterSpec.class};
        this.getValidOutputFormatsForInputhNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = 0;
        this.getInputFormats = true;
        this.getOutputStallDuration = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getHighSpeedVideoFpsRanges = blockCipher;
        this.getHighSpeedVideoSizes = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.BufferedGenericBlockCipher(blockCipher);
    }
}
