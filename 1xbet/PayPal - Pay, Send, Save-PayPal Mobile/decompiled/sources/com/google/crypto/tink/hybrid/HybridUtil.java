package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
final class HybridUtil {

    /* renamed from: com.google.crypto.tink.hybrid.HybridUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.HashType.SHA1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA224.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA256.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA384.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA512.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static java.lang.String toHmacAlgo(com.google.crypto.tink.proto.HashType hashType) throws java.security.NoSuchAlgorithmException {
        int i = com.google.crypto.tink.hybrid.HybridUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha224";
        }
        if (i == 3) {
            return "HmacSha256";
        }
        if (i == 4) {
            return "HmacSha384";
        }
        if (i == 5) {
            return "HmacSha512";
        }
        throw new java.security.NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(java.lang.String.valueOf(hashType)));
    }

    private HybridUtil() {
    }
}
