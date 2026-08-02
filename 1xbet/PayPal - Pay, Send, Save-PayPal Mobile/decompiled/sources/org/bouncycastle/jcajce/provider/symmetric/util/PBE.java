package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        public static org.bouncycastle.crypto.CipherParameters makePBEMacParameters(org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.lang.IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            if (bCPBEKey.isDestroyed()) {
                throw new java.lang.IllegalStateException("key has been destroyed");
            }
            int i = bCPBEKey.getInputSizeshNQ4ISI;
            if (bCPBEKey.isDestroyed()) {
                throw new java.lang.IllegalStateException("key has been destroyed");
            }
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, bCPBEKey.getHighSpeedVideoSizes);
            highSpeedVideoSizes.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            if (bCPBEKey.isDestroyed()) {
                throw new java.lang.IllegalStateException("key has been destroyed");
            }
            return highSpeedVideoSizes.generateDerivedMacParameters(bCPBEKey.Camera2StreamConfigurationMap);
        }

        public static org.bouncycastle.crypto.CipherParameters makePBEParameters(org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.lang.String str) {
            org.bouncycastle.crypto.CipherParameters generateDerivedParameters;
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.lang.IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            if (bCPBEKey.isDestroyed()) {
                throw new java.lang.IllegalStateException("key has been destroyed");
            }
            int i = bCPBEKey.getInputSizeshNQ4ISI;
            if (bCPBEKey.isDestroyed()) {
                throw new java.lang.IllegalStateException("key has been destroyed");
            }
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, bCPBEKey.getHighSpeedVideoSizes);
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.getOutputMinFrameDuration) {
                encoded = new byte[2];
            }
            highSpeedVideoSizes.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            if (bCPBEKey.getIvSize() != 0) {
                if (bCPBEKey.isDestroyed()) {
                    throw new java.lang.IllegalStateException("key has been destroyed");
                }
                generateDerivedParameters = highSpeedVideoSizes.generateDerivedParameters(bCPBEKey.Camera2StreamConfigurationMap, bCPBEKey.getIvSize());
            } else {
                if (bCPBEKey.isDestroyed()) {
                    throw new java.lang.IllegalStateException("key has been destroyed");
                }
                generateDerivedParameters = highSpeedVideoSizes.generateDerivedParameters(bCPBEKey.Camera2StreamConfigurationMap);
            }
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
                    org.bouncycastle.crypto.params.DESParameters.setOddParity(((org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    return generateDerivedParameters;
                }
                org.bouncycastle.crypto.params.DESParameters.setOddParity(((org.bouncycastle.crypto.params.KeyParameter) generateDerivedParameters).getKey());
            }
            return generateDerivedParameters;
        }

        public static org.bouncycastle.crypto.CipherParameters makePBEParameters(byte[] bArr, int i, int i2, int i3, int i4, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.lang.String str) throws java.security.InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, i2);
            highSpeedVideoSizes.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            org.bouncycastle.crypto.CipherParameters generateDerivedParameters = i4 != 0 ? highSpeedVideoSizes.generateDerivedParameters(i3, i4) : highSpeedVideoSizes.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
                    org.bouncycastle.crypto.params.DESParameters.setOddParity(((org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    return generateDerivedParameters;
                }
                org.bouncycastle.crypto.params.DESParameters.setOddParity(((org.bouncycastle.crypto.params.KeyParameter) generateDerivedParameters).getKey());
            }
            return generateDerivedParameters;
        }

        public static org.bouncycastle.crypto.CipherParameters makePBEParameters(javax.crypto.spec.PBEKeySpec pBEKeySpec, int i, int i2, int i3, int i4) {
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, i2);
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, pBEKeySpec);
            highSpeedVideoSizes.init(highResolutionOutputSizeshNQ4ISI, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            org.bouncycastle.crypto.CipherParameters generateDerivedParameters = i4 != 0 ? highSpeedVideoSizes.generateDerivedParameters(i3, i4) : highSpeedVideoSizes.generateDerivedParameters(i3);
            for (int i5 = 0; i5 != highResolutionOutputSizeshNQ4ISI.length; i5++) {
                highResolutionOutputSizeshNQ4ISI[i5] = 0;
            }
            return generateDerivedParameters;
        }

        public static org.bouncycastle.crypto.CipherParameters makePBEMacParameters(javax.crypto.spec.PBEKeySpec pBEKeySpec, int i, int i2, int i3) {
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, i2);
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, pBEKeySpec);
            highSpeedVideoSizes.init(highResolutionOutputSizeshNQ4ISI, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters = highSpeedVideoSizes.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != highResolutionOutputSizeshNQ4ISI.length; i4++) {
                highResolutionOutputSizeshNQ4ISI[i4] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static org.bouncycastle.crypto.CipherParameters makePBEMacParameters(javax.crypto.SecretKey secretKey, int i, int i2, int i3, javax.crypto.spec.PBEParameterSpec pBEParameterSpec) {
            org.bouncycastle.crypto.PBEParametersGenerator highSpeedVideoSizes = getHighSpeedVideoSizes(i, i2);
            byte[] encoded = secretKey.getEncoded();
            highSpeedVideoSizes.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters = highSpeedVideoSizes.generateDerivedMacParameters(i3);
            for (int i4 = 0; i4 != encoded.length; i4++) {
                encoded[i4] = 0;
            }
            return generateDerivedMacParameters;
        }

        private static org.bouncycastle.crypto.PBEParametersGenerator getHighSpeedVideoSizes(int i, int i2) {
            if (i == 0 || i == 4) {
                if (i2 == 0) {
                    return new org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createMD5());
                }
                if (i2 == 1) {
                    return new org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
                }
                if (i2 == 5) {
                    return new org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator(new org.bouncycastle.crypto.digests.MD2Digest());
                }
                throw new java.lang.IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            if (i != 1 && i != 5) {
                if (i != 2) {
                    return new org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator();
                }
                switch (i2) {
                    case 0:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createMD5());
                    case 1:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
                    case 2:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.RIPEMD160Digest());
                    case 3:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.TigerDigest());
                    case 4:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256());
                    case 5:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.MD2Digest());
                    case 6:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.GOST3411Digest());
                    case 7:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224());
                    case 8:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384());
                    case 9:
                        return new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512());
                    default:
                        throw new java.lang.IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
            switch (i2) {
                case 0:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createMD5());
                case 1:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
                case 2:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.RIPEMD160Digest());
                case 3:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.TigerDigest());
                case 4:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256());
                case 5:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.MD2Digest());
                case 6:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.GOST3411Digest());
                case 7:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224());
                case 8:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384());
                case 9:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512());
                case 10:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_224());
                case 11:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_256());
                case 12:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_384());
                case 13:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA3_512());
                case 14:
                    return new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator(new org.bouncycastle.crypto.digests.SM3Digest());
                default:
                    throw new java.lang.IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }

        private static byte[] getHighResolutionOutputSizeshNQ4ISI(int i, javax.crypto.spec.PBEKeySpec pBEKeySpec) {
            if (i == 2) {
                return org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword());
            }
            return (i == 5 || i == 4) ? org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }
    }
}
