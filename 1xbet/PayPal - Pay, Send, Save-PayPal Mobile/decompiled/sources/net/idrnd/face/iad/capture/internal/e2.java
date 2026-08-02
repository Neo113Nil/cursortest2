package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class e2 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CAPTURE_END_FIELD_NUMBER = 4;
    public static final int CAPTURE_START_FIELD_NUMBER = 3;
    public static final int CONTROL_PHOTO_FIELD_NUMBER = 2;
    private static final net.idrnd.face.iad.capture.internal.e2 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.e2> PARSER = null;
    public static final int PHOTO_FIELD_NUMBER = 1;
    private long captureEnd_;
    private long captureStart_;
    private long controlPhoto_;
    private long photo_;

    static {
        net.idrnd.face.iad.capture.internal.e2 e2Var = new net.idrnd.face.iad.capture.internal.e2();
        DEFAULT_INSTANCE = e2Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.e2.class, e2Var);
    }

    public static net.idrnd.face.iad.capture.internal.d2 a() {
        return (net.idrnd.face.iad.capture.internal.d2) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.e2();
            case 2:
                return new net.idrnd.face.iad.capture.internal.d2();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002", new java.lang.Object[]{"photo_", "controlPhoto_", "captureStart_", "captureEnd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.e2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.e2.class) {
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
