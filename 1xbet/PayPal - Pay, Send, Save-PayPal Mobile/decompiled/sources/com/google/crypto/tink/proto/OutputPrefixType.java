package com.google.crypto.tink.proto;

/* loaded from: classes4.dex */
public enum OutputPrefixType implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);

    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final int WITH_ID_REQUIREMENT_VALUE = 5;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType>() { // from class: com.google.crypto.tink.proto.OutputPrefixType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.proto.OutputPrefixType findValueByNumber(int i) {
            return com.google.crypto.tink.proto.OutputPrefixType.forNumber(i);
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
    public static com.google.crypto.tink.proto.OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.proto.OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i == 4) {
            return CRUNCHY;
        }
        if (i != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier.INSTANCE;
    }

    /* loaded from: classes9.dex */
    static final class OutputPrefixTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.proto.OutputPrefixType.OutputPrefixTypeVerifier();

        private OutputPrefixTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.proto.OutputPrefixType.forNumber(i) != null;
        }
    }

    OutputPrefixType(int i) {
        this.value = i;
    }
}
