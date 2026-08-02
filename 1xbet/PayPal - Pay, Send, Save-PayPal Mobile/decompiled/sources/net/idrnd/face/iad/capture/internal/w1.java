package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class w1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final net.idrnd.face.iad.capture.internal.w1 DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.w1> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VENDOR_FIELD_NUMBER = 2;
    private java.lang.String type_ = "";
    private java.lang.String vendor_ = "";
    private java.lang.String deviceModel_ = "";

    static {
        net.idrnd.face.iad.capture.internal.w1 w1Var = new net.idrnd.face.iad.capture.internal.w1();
        DEFAULT_INSTANCE = w1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.w1.class, w1Var);
    }

    public static net.idrnd.face.iad.capture.internal.v1 a() {
        return (net.idrnd.face.iad.capture.internal.v1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.w1();
            case 2:
                return new net.idrnd.face.iad.capture.internal.v1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new java.lang.Object[]{"type_", "vendor_", "deviceModel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.w1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.w1.class) {
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
