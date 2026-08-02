package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum JwtRsaSsaPssAlgorithm implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    PS_UNKNOWN(0),
    PS256(1),
    PS384(2),
    PS512(3),
    UNRECOGNIZED(-1);

    public static final int PS256_VALUE = 1;
    public static final int PS384_VALUE = 2;
    public static final int PS512_VALUE = 3;
    public static final int PS_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm>() { // from class: com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm findValueByNumber(int i) {
            return com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.forNumber(i);
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
    public static com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm forNumber(int i) {
        if (i == 0) {
            return PS_UNKNOWN;
        }
        if (i == 1) {
            return PS256;
        }
        if (i == 2) {
            return PS384;
        }
        if (i != 3) {
            return null;
        }
        return PS512;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.JwtRsaSsaPssAlgorithmVerifier.INSTANCE;
    }

    static final class JwtRsaSsaPssAlgorithmVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.JwtRsaSsaPssAlgorithmVerifier();

        private JwtRsaSsaPssAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.forNumber(i) != null;
        }
    }

    JwtRsaSsaPssAlgorithm(int i) {
        this.value = i;
    }
}
