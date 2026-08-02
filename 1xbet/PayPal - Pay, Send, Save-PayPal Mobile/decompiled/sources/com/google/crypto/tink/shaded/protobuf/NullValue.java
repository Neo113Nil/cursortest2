package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public enum NullValue implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue>() { // from class: com.google.crypto.tink.shaded.protobuf.NullValue.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.shaded.protobuf.NullValue findValueByNumber(int i) {
            return com.google.crypto.tink.shaded.protobuf.NullValue.forNumber(i);
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
    public static com.google.crypto.tink.shaded.protobuf.NullValue valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.shaded.protobuf.NullValue forNumber(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.shaded.protobuf.NullValue.NullValueVerifier.INSTANCE;
    }

    static final class NullValueVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.shaded.protobuf.NullValue.NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.shaded.protobuf.NullValue.forNumber(i) != null;
        }
    }

    NullValue(int i) {
        this.value = i;
    }
}
