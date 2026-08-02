package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum JwtHmacAlgorithm implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    HS_UNKNOWN(0),
    HS256(1),
    HS384(2),
    HS512(3),
    UNRECOGNIZED(-1);

    public static final int HS256_VALUE = 1;
    public static final int HS384_VALUE = 2;
    public static final int HS512_VALUE = 3;
    public static final int HS_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtHmacAlgorithm> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtHmacAlgorithm>() { // from class: com.google.crypto.tink.proto.JwtHmacAlgorithm.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.JwtHmacAlgorithm findValueByNumber(int i) {
            return com.google.crypto.tink.proto.JwtHmacAlgorithm.forNumber(i);
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
    public static com.google.crypto.tink.proto.JwtHmacAlgorithm valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.JwtHmacAlgorithm forNumber(int i) {
        if (i == 0) {
            return HS_UNKNOWN;
        }
        if (i == 1) {
            return HS256;
        }
        if (i == 2) {
            return HS384;
        }
        if (i != 3) {
            return null;
        }
        return HS512;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtHmacAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.JwtHmacAlgorithm.JwtHmacAlgorithmVerifier.INSTANCE;
    }

    static final class JwtHmacAlgorithmVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.JwtHmacAlgorithm.JwtHmacAlgorithmVerifier();

        private JwtHmacAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.JwtHmacAlgorithm.forNumber(i) != null;
        }
    }

    JwtHmacAlgorithm(int i) {
        this.value = i;
    }
}
