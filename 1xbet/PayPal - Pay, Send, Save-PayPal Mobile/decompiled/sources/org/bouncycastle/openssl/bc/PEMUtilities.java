package org.bouncycastle.openssl.bc;

/* loaded from: classes17.dex */
class PEMUtilities {
    private static final java.util.Set Camera2StreamConfigurationMap;
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:23:0x013d A[Catch: Exception -> 0x0176, TRY_ENTER, TryCatch #0 {Exception -> 0x0176, blocks: (B:23:0x013d, B:26:0x014b, B:27:0x0157, B:31:0x0170, B:34:0x014f, B:35:0x0143), top: B:21:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014b A[Catch: Exception -> 0x0176, TryCatch #0 {Exception -> 0x0176, blocks: (B:23:0x013d, B:26:0x014b, B:27:0x0157, B:31:0x0170, B:34:0x014f, B:35:0x0143), top: B:21:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0170 A[Catch: Exception -> 0x0176, TRY_LEAVE, TryCatch #0 {Exception -> 0x0176, blocks: (B:23:0x013d, B:26:0x014b, B:27:0x0157, B:31:0x0170, B:34:0x014f, B:35:0x0143), top: B:21:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f A[Catch: Exception -> 0x0176, TryCatch #0 {Exception -> 0x0176, blocks: (B:23:0x013d, B:26:0x014b, B:27:0x0157, B:31:0x0170, B:34:0x014f, B:35:0x0143), top: B:21:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143 A[Catch: Exception -> 0x0176, TryCatch #0 {Exception -> 0x0176, blocks: (B:23:0x013d, B:26:0x014b, B:27:0x0157, B:31:0x0170, B:34:0x014f, B:35:0x0143), top: B:21:0x013b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] Camera2StreamConfigurationMap(byte[] bArr, char[] cArr, java.lang.String str, byte[] bArr2) throws org.bouncycastle.openssl.PEMException {
        java.lang.String str2;
        byte[] bArr3;
        org.bouncycastle.crypto.params.KeyParameter highSpeedVideoFpsRanges;
        org.bouncycastle.crypto.BlockCipher aESEngine;
        org.bouncycastle.crypto.BlockCipher oFBBlockCipher;
        int outputSize;
        int doFinal;
        byte[] bArr4 = bArr2;
        org.bouncycastle.crypto.paddings.PKCS7Padding pKCS7Padding = new org.bouncycastle.crypto.paddings.PKCS7Padding();
        org.bouncycastle.crypto.paddings.PKCS7Padding pKCS7Padding2 = null;
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            pKCS7Padding = null;
        } else {
            str2 = "CBC";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            str2 = "ECB";
            bArr3 = null;
        } else {
            bArr3 = bArr4;
        }
        if (str.endsWith("-OFB")) {
            str2 = "OFB";
        } else {
            pKCS7Padding2 = pKCS7Padding;
        }
        if (str.startsWith("DES-EDE")) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cArr, 24, bArr4, !str.startsWith("DES-EDE3"));
            aESEngine = new org.bouncycastle.crypto.engines.DESedeEngine();
        } else if (str.startsWith("DES-")) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cArr, 8, bArr4, false);
            aESEngine = new org.bouncycastle.crypto.engines.DESEngine();
        } else if (str.startsWith("BF-")) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cArr, 16, bArr4, false);
            aESEngine = new org.bouncycastle.crypto.engines.BlowfishEngine();
        } else {
            int i = 128;
            if (str.startsWith("RC2-")) {
                if (str.startsWith("RC2-40-")) {
                    i = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i = 64;
                }
                org.bouncycastle.crypto.params.RC2Parameters rC2Parameters = new org.bouncycastle.crypto.params.RC2Parameters(getHighSpeedVideoFpsRanges(cArr, i / 8, bArr4, false).getKey(), i);
                aESEngine = new org.bouncycastle.crypto.engines.RC2Engine();
                highSpeedVideoFpsRanges = rC2Parameters;
            } else {
                if (!str.startsWith("AES-")) {
                    throw new org.bouncycastle.openssl.EncryptionException("unknown encryption with private key: ".concat(java.lang.String.valueOf(str)));
                }
                if (bArr4.length > 8) {
                    byte[] bArr5 = new byte[8];
                    java.lang.System.arraycopy(bArr4, 0, bArr5, 0, 8);
                    bArr4 = bArr5;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i = 192;
                    } else {
                        if (!str.startsWith("AES-256-")) {
                            throw new org.bouncycastle.openssl.EncryptionException("unknown AES encryption with private key: ".concat(java.lang.String.valueOf(str)));
                        }
                        i = 256;
                    }
                }
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cArr, i / 8, bArr4, false);
                aESEngine = new org.bouncycastle.crypto.engines.AESEngine();
            }
        }
        try {
            if (str2.equals("CBC")) {
                oFBBlockCipher = new org.bouncycastle.crypto.modes.CBCBlockCipher(aESEngine);
            } else {
                if (!str2.equals("CFB")) {
                    if (str2.equals("OFB")) {
                        oFBBlockCipher = new org.bouncycastle.crypto.modes.OFBBlockCipher(aESEngine, aESEngine.getBlockSize() * 8);
                    }
                    org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher = pKCS7Padding2 != null ? new org.bouncycastle.crypto.BufferedBlockCipher(aESEngine) : new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(aESEngine, pKCS7Padding2);
                    if (bArr3 != null) {
                        bufferedBlockCipher.init(false, highSpeedVideoFpsRanges);
                    } else {
                        bufferedBlockCipher.init(false, new org.bouncycastle.crypto.params.ParametersWithIV(highSpeedVideoFpsRanges, bArr3));
                    }
                    outputSize = bufferedBlockCipher.getOutputSize(bArr.length);
                    byte[] bArr6 = new byte[outputSize];
                    int processBytes = bufferedBlockCipher.processBytes(bArr, 0, bArr.length, bArr6, 0);
                    doFinal = processBytes + bufferedBlockCipher.doFinal(bArr6, processBytes);
                    if (doFinal != outputSize) {
                        return bArr6;
                    }
                    byte[] bArr7 = new byte[doFinal];
                    java.lang.System.arraycopy(bArr6, 0, bArr7, 0, doFinal);
                    return bArr7;
                }
                oFBBlockCipher = new org.bouncycastle.crypto.modes.CFBBlockCipher(aESEngine, aESEngine.getBlockSize() * 8);
            }
            org.bouncycastle.crypto.BufferedBlockCipher bufferedBlockCipher2 = pKCS7Padding2 != null ? new org.bouncycastle.crypto.BufferedBlockCipher(aESEngine) : new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(aESEngine, pKCS7Padding2);
            if (bArr3 != null) {
            }
            outputSize = bufferedBlockCipher2.getOutputSize(bArr.length);
            byte[] bArr62 = new byte[outputSize];
            int processBytes2 = bufferedBlockCipher2.processBytes(bArr, 0, bArr.length, bArr62, 0);
            doFinal = processBytes2 + bufferedBlockCipher2.doFinal(bArr62, processBytes2);
            if (doFinal != outputSize) {
            }
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.openssl.EncryptionException("exception using cipher - please check password and data.", e);
        }
        aESEngine = oFBBlockCipher;
    }

    private static org.bouncycastle.crypto.params.KeyParameter getHighSpeedVideoFpsRanges(char[] cArr, int i, byte[] bArr, boolean z) throws org.bouncycastle.openssl.PEMException {
        org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, 1);
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i * 8);
        if (!z || keyParameter.getKey().length != 24) {
            return keyParameter;
        }
        byte[] key = keyParameter.getKey();
        java.lang.System.arraycopy(key, 0, key, 16, 8);
        return new org.bouncycastle.crypto.params.KeyParameter(key);
    }

    PEMUtilities() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        java.util.HashSet hashSet = new java.util.HashSet();
        Camera2StreamConfigurationMap = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        getHighSpeedVideoSizes = hashSet2;
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2);
        hashSet2.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.getId(), org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.getId(), org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.getId(), org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, org.bouncycastle.util.Integers.valueOf(40));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(40));
    }
}
