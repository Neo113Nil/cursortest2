package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum JwtEcdsaAlgorithm implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    ES_UNKNOWN(0),
    ES256(1),
    ES384(2),
    ES512(3),
    UNRECOGNIZED(-1);

    public static final int ES256_VALUE = 1;
    public static final int ES384_VALUE = 2;
    public static final int ES512_VALUE = 3;
    public static final int ES_UNKNOWN_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtEcdsaAlgorithm> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtEcdsaAlgorithm>() { // from class: com.google.crypto.tink.proto.JwtEcdsaAlgorithm.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.JwtEcdsaAlgorithm findValueByNumber(int i) {
            return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.forNumber(i);
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
    public static com.google.crypto.tink.proto.JwtEcdsaAlgorithm valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.JwtEcdsaAlgorithm forNumber(int i) {
        if (i == 0) {
            return ES_UNKNOWN;
        }
        if (i == 1) {
            return ES256;
        }
        if (i == 2) {
            return ES384;
        }
        if (i != 3) {
            return null;
        }
        return ES512;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtEcdsaAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.JwtEcdsaAlgorithmVerifier.INSTANCE;
    }

    static final class JwtEcdsaAlgorithmVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.JwtEcdsaAlgorithm.JwtEcdsaAlgorithmVerifier();

        private JwtEcdsaAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.JwtEcdsaAlgorithm.forNumber(i) != null;
        }
    }

    JwtEcdsaAlgorithm(int i) {
        this.value = i;
    }
}
