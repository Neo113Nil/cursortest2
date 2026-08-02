package com.google.crypto.tink.proto;

/* loaded from: classes9.dex */
public enum EcPointFormat implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);

    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat>() { // from class: com.google.crypto.tink.proto.EcPointFormat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.EcPointFormat findValueByNumber(int i) {
            return com.google.crypto.tink.proto.EcPointFormat.forNumber(i);
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
    public static com.google.crypto.tink.proto.EcPointFormat valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.EcPointFormat forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.EcPointFormat.EcPointFormatVerifier.INSTANCE;
    }

    static final class EcPointFormatVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.EcPointFormat.EcPointFormatVerifier();

        private EcPointFormatVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.EcPointFormat.forNumber(i) != null;
        }
    }

    EcPointFormat(int i) {
        this.value = i;
    }
}
