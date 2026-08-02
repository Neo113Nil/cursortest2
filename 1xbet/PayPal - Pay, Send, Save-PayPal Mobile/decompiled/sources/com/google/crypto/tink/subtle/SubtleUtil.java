package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class SubtleUtil {
    public static java.lang.String toEcdsaAlgo(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashType);
        sb.append("withECDSA");
        return sb.toString();
    }

    public static java.lang.String toRsaSsaPkcs1Algo(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Validators.validateSignatureHash(hashType);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(hashType);
        sb.append("withRSA");
        return sb.toString();
    }

    /* renamed from: com.google.crypto.tink.subtle.SubtleUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.Enums.HashType.SHA1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA224.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA256.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA384.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA512.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static java.lang.String toDigestAlgo(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1) {
            return "SHA-1";
        }
        if (i == 2) {
            return "SHA-224";
        }
        if (i == 3) {
            return "SHA-256";
        }
        if (i == 4) {
            return "SHA-384";
        }
        if (i == 5) {
            return "SHA-512";
        }
        throw new java.security.GeneralSecurityException("Unsupported hash ".concat(java.lang.String.valueOf(hashType)));
    }

    public static boolean isAndroid() {
        return "The Android Project".equals(java.lang.System.getProperty("java.vendor"));
    }

    @java.lang.Deprecated
    public static int androidApiLevel() {
        java.lang.Integer androidApiLevel = com.google.crypto.tink.internal.Util.getAndroidApiLevel();
        if (androidApiLevel != null) {
            return androidApiLevel.intValue();
        }
        return -1;
    }

    public static java.math.BigInteger bytes2Integer(byte[] bArr) {
        return com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(bArr);
    }

    public static byte[] integer2Bytes(java.math.BigInteger bigInteger, int i) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(bigInteger, i);
    }

    public static byte[] mgf1(byte[] bArr, int i, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        java.security.MessageDigest engineFactory = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST.getInstance(toDigestAlgo(hashType));
        int digestLength = engineFactory.getDigestLength();
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 <= (i - 1) / digestLength; i3++) {
            engineFactory.reset();
            engineFactory.update(bArr);
            engineFactory.update(integer2Bytes(java.math.BigInteger.valueOf(i3), 4));
            byte[] digest = engineFactory.digest();
            java.lang.System.arraycopy(digest, 0, bArr2, i2, java.lang.Math.min(digest.length, i - i2));
            i2 += digest.length;
        }
        return bArr2;
    }

    public static void putAsUnsigedInt(java.nio.ByteBuffer byteBuffer, long j) throws java.security.GeneralSecurityException {
        if (0 > j || j >= 4294967296L) {
            throw new java.security.GeneralSecurityException("Index out of range");
        }
        byteBuffer.putInt((int) j);
    }

    private SubtleUtil() {
    }
}
