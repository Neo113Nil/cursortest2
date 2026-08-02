package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum JwtRsaSsaPkcs1Algorithm implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    RS_UNKNOWN(0),
    RS256(1),
    RS384(2),
    RS512(3),
    UNRECOGNIZED(-1);

    public static final int RS256_VALUE = 1;
    public static final int RS384_VALUE = 2;
    public static final int RS512_VALUE = 3;
    public static final int RS_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm>() { // from class: com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm findValueByNumber(int i) {
            return com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.forNumber(i);
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
    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm forNumber(int i) {
        if (i == 0) {
            return RS_UNKNOWN;
        }
        if (i == 1) {
            return RS256;
        }
        if (i == 2) {
            return RS384;
        }
        if (i != 3) {
            return null;
        }
        return RS512;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE;
    }

    static final class JwtRsaSsaPkcs1AlgorithmVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.JwtRsaSsaPkcs1AlgorithmVerifier();

        private JwtRsaSsaPkcs1AlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.forNumber(i) != null;
        }
    }

    JwtRsaSsaPkcs1Algorithm(int i) {
        this.value = i;
    }
}
