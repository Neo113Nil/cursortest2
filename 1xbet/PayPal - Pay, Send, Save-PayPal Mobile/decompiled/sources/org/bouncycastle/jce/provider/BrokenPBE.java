package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    public static class Util {
        static org.bouncycastle.crypto.CipherParameters getHighSpeedVideoSizes(org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey bCPBEKey, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, int i, int i2, java.lang.String str, int i3, int i4) {
            org.bouncycastle.crypto.PBEParametersGenerator pKCS12ParametersGenerator;
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.lang.IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            if (i == 0) {
                if (i2 == 0) {
                    pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator(new org.bouncycastle.crypto.digests.MD5Digest());
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
                    }
                    pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
                }
            } else if (i == 1) {
                pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator();
            } else if (i == 3) {
                if (i2 == 0) {
                    pKCS12ParametersGenerator = new org.bouncycastle.jce.provider.OldPKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.MD5Digest());
                } else if (i2 == 1) {
                    pKCS12ParametersGenerator = new org.bouncycastle.jce.provider.OldPKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                    pKCS12ParametersGenerator = new org.bouncycastle.jce.provider.OldPKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.RIPEMD160Digest());
                }
            } else if (i2 == 0) {
                pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.MD5Digest());
            } else if (i2 == 1) {
                pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.SHA1Digest());
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("unknown digest scheme for PBE encryption.");
                }
                pKCS12ParametersGenerator = new org.bouncycastle.crypto.generators.PKCS12ParametersGenerator(new org.bouncycastle.crypto.digests.RIPEMD160Digest());
            }
            byte[] encoded = bCPBEKey.getEncoded();
            pKCS12ParametersGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            org.bouncycastle.crypto.CipherParameters generateDerivedParameters = i4 != 0 ? pKCS12ParametersGenerator.generateDerivedParameters(i3, i4) : pKCS12ParametersGenerator.generateDerivedParameters(i3);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
                    getHighSpeedVideoFpsRanges(((org.bouncycastle.crypto.params.KeyParameter) ((org.bouncycastle.crypto.params.ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                } else {
                    getHighSpeedVideoFpsRanges(((org.bouncycastle.crypto.params.KeyParameter) generateDerivedParameters).getKey());
                }
            }
            for (int i5 = 0; i5 != encoded.length; i5++) {
                encoded[i5] = 0;
            }
            return generateDerivedParameters;
        }

        private static void getHighSpeedVideoFpsRanges(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                bArr[i] = (byte) ((b & 254) | (((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1));
            }
        }
    }
}
