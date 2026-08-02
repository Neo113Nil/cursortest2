package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum HpkeKem implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    public static final int DHKEM_P256_HKDF_SHA256_VALUE = 2;
    public static final int DHKEM_P384_HKDF_SHA384_VALUE = 3;
    public static final int DHKEM_P521_HKDF_SHA512_VALUE = 4;
    public static final int DHKEM_X25519_HKDF_SHA256_VALUE = 1;
    public static final int KEM_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKem> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKem>() { // from class: com.google.crypto.tink.proto.HpkeKem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.HpkeKem findValueByNumber(int i) {
            return com.google.crypto.tink.proto.HpkeKem.forNumber(i);
        }
    };
    private final int value;

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HpkeKem valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.HpkeKem forNumber(int i) {
        if (i == 0) {
            return KEM_UNKNOWN;
        }
        if (i == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKem> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.HpkeKem.HpkeKemVerifier.INSTANCE;
    }

    static final class HpkeKemVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.HpkeKem.HpkeKemVerifier();

        private HpkeKemVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.HpkeKem.forNumber(i) != null;
        }
    }

    HpkeKem(int i) {
        this.value = i;
    }
}
