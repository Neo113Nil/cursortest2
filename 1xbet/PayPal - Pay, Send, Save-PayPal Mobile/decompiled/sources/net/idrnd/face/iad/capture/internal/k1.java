package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class k1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final net.idrnd.face.iad.capture.internal.k1 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.k1> PARSER = null;
    public static final int POSITION_ON_IMAGE_FIELD_NUMBER = 4;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int TOP_LEFT_POINT_ON_IMAGE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    private int positionOnImage_;
    private net.idrnd.face.iad.capture.internal.c2 size_;
    private net.idrnd.face.iad.capture.internal.y1 topLeftPointOnImage_;

    static {
        net.idrnd.face.iad.capture.internal.k1 k1Var = new net.idrnd.face.iad.capture.internal.k1();
        DEFAULT_INSTANCE = k1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.k1.class, k1Var);
    }

    public static net.idrnd.face.iad.capture.internal.j1 a() {
        return (net.idrnd.face.iad.capture.internal.j1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.k1();
            case 2:
                return new net.idrnd.face.iad.capture.internal.j1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\t\u0003\t\u0004\f", new java.lang.Object[]{"content_", "size_", "topLeftPointOnImage_", "positionOnImage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.k1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.k1.class) {
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
}
