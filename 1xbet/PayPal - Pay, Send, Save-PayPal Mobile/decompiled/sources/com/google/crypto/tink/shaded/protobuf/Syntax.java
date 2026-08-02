package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public enum Syntax implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Syntax> internalValueMap = new com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Syntax>() { // from class: com.google.crypto.tink.shaded.protobuf.Syntax.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public com.google.crypto.tink.shaded.protobuf.Syntax findValueByNumber(int i) {
            return com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(i);
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
    public static com.google.crypto.tink.shaded.protobuf.Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static com.google.crypto.tink.shaded.protobuf.Syntax forNumber(int i) {
        if (i == 0) {
            return SYNTAX_PROTO2;
        }
        if (i == 1) {
            return SYNTAX_PROTO3;
        }
        if (i != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.shaded.protobuf.Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.google.crypto.tink.shaded.protobuf.Syntax.SyntaxVerifier.INSTANCE;
    }

    static final class SyntaxVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = new com.google.crypto.tink.shaded.protobuf.Syntax.SyntaxVerifier();

        private SyntaxVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return com.google.crypto.tink.shaded.protobuf.Syntax.forNumber(i) != null;
        }
    }

    Syntax(int i) {
        this.value = i;
    }
}
