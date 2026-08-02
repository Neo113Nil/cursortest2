package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class c2 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final net.idrnd.face.iad.capture.internal.c2 DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.c2> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int height_;
    private int width_;

    static {
        net.idrnd.face.iad.capture.internal.c2 c2Var = new net.idrnd.face.iad.capture.internal.c2();
        DEFAULT_INSTANCE = c2Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.c2.class, c2Var);
    }

    public static net.idrnd.face.iad.capture.internal.b2 a() {
        return (net.idrnd.face.iad.capture.internal.b2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.c2();
            case 2:
                return new net.idrnd.face.iad.capture.internal.b2();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new java.lang.Object[]{"width_", "height_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.c2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.c2.class) {
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
