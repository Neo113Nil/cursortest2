package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class y0 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final net.idrnd.face.iad.capture.internal.y0 DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.y0> PARSER = null;
    public static final int SUPPORTED_RESOLUTIONS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.c2> supportedResolutions_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        net.idrnd.face.iad.capture.internal.y0 y0Var = new net.idrnd.face.iad.capture.internal.y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.y0.class, y0Var);
    }

    public static net.idrnd.face.iad.capture.internal.x0 b() {
        return (net.idrnd.face.iad.capture.internal.x0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.y0();
            case 2:
                return new net.idrnd.face.iad.capture.internal.x0();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"supportedResolutions_", net.idrnd.face.iad.capture.internal.c2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.y0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.y0.class) {
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

    public final void a(java.util.List list) {
        a();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) list, (java.util.List) this.supportedResolutions_);
    }

    public final void a() {
        com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.c2> protobufList = this.supportedResolutions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.supportedResolutions_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }
}
