package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum EcdsaSignatureEncoding implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);

    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding>() { // from class: com.google.crypto.tink.proto.EcdsaSignatureEncoding.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.EcdsaSignatureEncoding findValueByNumber(int i) {
            return com.google.crypto.tink.proto.EcdsaSignatureEncoding.forNumber(i);
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
    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i == 1) {
            return IEEE_P1363;
        }
        if (i != 2) {
            return null;
        }
        return DER;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.EcdsaSignatureEncoding.EcdsaSignatureEncodingVerifier.INSTANCE;
    }

    static final class EcdsaSignatureEncodingVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.EcdsaSignatureEncoding.EcdsaSignatureEncodingVerifier();

        private EcdsaSignatureEncodingVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.EcdsaSignatureEncoding.forNumber(i) != null;
        }
    }

    EcdsaSignatureEncoding(int i) {
        this.value = i;
    }
}
