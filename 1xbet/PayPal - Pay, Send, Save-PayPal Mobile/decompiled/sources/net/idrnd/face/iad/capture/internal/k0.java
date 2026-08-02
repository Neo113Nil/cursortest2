package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class k0 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final net.idrnd.face.iad.capture.internal.k0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.k0> PARSER = null;
    public static final int RAW_DATA_FIELD_NUMBER = 2;
    public static final int SCHEME_FIELD_NUMBER = 3;
    private java.lang.String keyId_;
    private com.google.protobuf.ByteString key_;
    private com.google.protobuf.ByteString rawData_;
    private int scheme_;

    static {
        net.idrnd.face.iad.capture.internal.k0 k0Var = new net.idrnd.face.iad.capture.internal.k0();
        DEFAULT_INSTANCE = k0Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.k0.class, k0Var);
    }

    public static net.idrnd.face.iad.capture.internal.j0 a() {
        return (net.idrnd.face.iad.capture.internal.j0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.i0.f6973a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.k0();
            case 2:
                return new net.idrnd.face.iad.capture.internal.j0();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u000b\u0004Ȉ", new java.lang.Object[]{"key_", "rawData_", "scheme_", "keyId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.k0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.k0.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public k0() {
        com.google.protobuf.ByteString byteString = com.google.protobuf.ByteString.EMPTY;
        this.key_ = byteString;
        this.keyId_ = "";
        this.rawData_ = byteString;
    }
}
