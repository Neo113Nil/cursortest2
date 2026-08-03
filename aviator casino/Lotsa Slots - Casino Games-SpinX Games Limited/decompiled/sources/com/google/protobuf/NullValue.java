package com.google.protobuf;

/* loaded from: classes4.dex */
public enum NullValue implements com.google.protobuf.Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.NullValue> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.NullValue>() { // from class: com.google.protobuf.NullValue.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public com.google.protobuf.NullValue findValueByNumber(int number) {
            return com.google.protobuf.NullValue.forNumber(number);
        }
    };
    private final int value;

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @java.lang.Deprecated
    public static com.google.protobuf.NullValue valueOf(int value) {
        return forNumber(value);
    }

    public static com.google.protobuf.NullValue forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.google.protobuf.NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.protobuf.NullValue.NullValueVerifier.INSTANCE;
    }

    private static final class NullValueVerifier implements com.google.protobuf.Internal.EnumVerifier {
        static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new com.google.protobuf.NullValue.NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return com.google.protobuf.NullValue.forNumber(number) != null;
        }
    }

    NullValue(int value) {
        this.value = value;
    }
}
