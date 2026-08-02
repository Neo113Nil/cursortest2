package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum HpkeAead implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    public static final int AEAD_UNKNOWN_VALUE = 0;
    public static final int AES_128_GCM_VALUE = 1;
    public static final int AES_256_GCM_VALUE = 2;
    public static final int CHACHA20_POLY1305_VALUE = 3;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeAead> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeAead>() { // from class: com.google.crypto.tink.proto.HpkeAead.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.HpkeAead findValueByNumber(int i) {
            return com.google.crypto.tink.proto.HpkeAead.forNumber(i);
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
    public static com.google.crypto.tink.proto.HpkeAead valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.HpkeAead forNumber(int i) {
        if (i == 0) {
            return AEAD_UNKNOWN;
        }
        if (i == 1) {
            return AES_128_GCM;
        }
        if (i == 2) {
            return AES_256_GCM;
        }
        if (i != 3) {
            return null;
        }
        return CHACHA20_POLY1305;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeAead> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.HpkeAead.HpkeAeadVerifier.INSTANCE;
    }

    static final class HpkeAeadVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.HpkeAead.HpkeAeadVerifier();

        private HpkeAeadVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.HpkeAead.forNumber(i) != null;
        }
    }

    HpkeAead(int i) {
        this.value = i;
    }
}
