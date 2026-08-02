package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class BaseMac extends javax.crypto.MacSpi implements org.bouncycastle.jcajce.provider.symmetric.util.PBE {
    private static final java.lang.Class getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil.loadClass(org.bouncycastle.jcajce.provider.symmetric.util.BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.Mac getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        int i;
        org.bouncycastle.crypto.CipherParameters makePBEMacParameters;
        if (key == null) {
            throw new java.security.InvalidKeyException("key is null");
        }
        if (key instanceof org.bouncycastle.jcajce.PKCS12Key) {
            try {
                javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) key;
                try {
                    javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof javax.crypto.interfaces.PBEKey) && pBEParameterSpec == null) {
                        javax.crypto.interfaces.PBEKey pBEKey = (javax.crypto.interfaces.PBEKey) secretKey;
                        pBEParameterSpec = new javax.crypto.spec.PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i2 = 256;
                    if (this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("GOST")) {
                        i = 6;
                    } else {
                        org.bouncycastle.crypto.Mac mac = this.getHighSpeedVideoFpsRangesFor;
                        if (!(mac instanceof org.bouncycastle.crypto.macs.HMac) || mac.getAlgorithmName().startsWith("SHA-1")) {
                            i = 1;
                        } else if (this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("SHA-224")) {
                            i = 7;
                            i2 = 224;
                        } else if (this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("SHA-256")) {
                            i = 4;
                        } else if (this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("SHA-384")) {
                            i = 8;
                            i2 = 384;
                        } else if (this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("SHA-512")) {
                            i = 9;
                            i2 = 512;
                        } else {
                            if (!this.getHighSpeedVideoFpsRangesFor.getAlgorithmName().startsWith("RIPEMD160")) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("no PKCS12 mapping for HMAC: ");
                                sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
                                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
                            }
                            i = 2;
                        }
                        i2 = 160;
                    }
                    makePBEMacParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(secretKey, 2, i, i2, pBEParameterSpec);
                } catch (java.lang.Exception unused) {
                    throw new java.security.InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (java.lang.Exception unused2) {
                throw new java.security.InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) {
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                makePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                    throw new java.security.InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                makePBEMacParameters = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("inappropriate parameter type: ");
                sb2.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.InvalidAlgorithmParameterException(sb2.toString());
            }
            makePBEMacParameters = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
        }
        org.bouncycastle.crypto.params.KeyParameter keyParameter = makePBEMacParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV ? (org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) makePBEMacParameters).getParameters() : (org.bouncycastle.crypto.params.KeyParameter) makePBEMacParameters;
        if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.AEADParameterSpec) {
            org.bouncycastle.jcajce.spec.AEADParameterSpec aEADParameterSpec = (org.bouncycastle.jcajce.spec.AEADParameterSpec) algorithmParameterSpec;
            makePBEMacParameters = new org.bouncycastle.crypto.params.AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
        } else if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
            makePBEMacParameters = new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec) {
            javax.crypto.spec.RC2ParameterSpec rC2ParameterSpec = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
            makePBEMacParameters = new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.RC2Parameters(keyParameter.getKey(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.SkeinParameterSpec) {
            makePBEMacParameters = new org.bouncycastle.crypto.params.SkeinParameters.Builder(getHighSpeedVideoFpsRangesFor(((org.bouncycastle.jcajce.spec.SkeinParameterSpec) algorithmParameterSpec).getParameters())).setKey(keyParameter.getKey()).build();
        } else if (algorithmParameterSpec == null) {
            makePBEMacParameters = new org.bouncycastle.crypto.params.KeyParameter(key.getEncoded());
        } else {
            java.lang.Class cls = getHighResolutionOutputSizeshNQ4ISI;
            if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                makePBEMacParameters = org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.Camera2StreamConfigurationMap(keyParameter, algorithmParameterSpec);
            } else if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unknown parameter type: ");
                sb3.append(algorithmParameterSpec.getClass().getName());
                throw new java.security.InvalidAlgorithmParameterException(sb3.toString());
            }
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.init(makePBEMacParameters);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("cannot initialize MAC: ");
            sb4.append(e.getMessage());
            throw new java.security.InvalidAlgorithmParameterException(sb4.toString());
        }
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.getHighSpeedVideoFpsRangesFor.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
        return bArr;
    }

    private static java.util.Hashtable getHighSpeedVideoFpsRangesFor(java.util.Map map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        for (java.lang.Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    public BaseMac(org.bouncycastle.crypto.Mac mac, int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = mac;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = i3;
    }

    public BaseMac(org.bouncycastle.crypto.Mac mac) {
        this.getHighSpeedVideoSizes = 2;
        this.Camera2StreamConfigurationMap = 1;
        this.getHighSpeedVideoFpsRanges = 160;
        this.getHighSpeedVideoFpsRangesFor = mac;
    }
}
