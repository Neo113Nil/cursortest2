package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class a2 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACCELERATION_FIELD_NUMBER = 1;
    public static final int ACCELERATION_INCLUDING_GRAVITY_FIELD_NUMBER = 2;
    public static final int ANGULAR_VELOCITY_FIELD_NUMBER = 3;
    private static final net.idrnd.face.iad.capture.internal.a2 DEFAULT_INSTANCE;
    public static final int MOTION_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.a2> PARSER;
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.r1> acceleration_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.r1> accelerationIncludingGravity_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.r1> angularVelocity_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.r1> motion_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        net.idrnd.face.iad.capture.internal.a2 a2Var = new net.idrnd.face.iad.capture.internal.a2();
        DEFAULT_INSTANCE = a2Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.a2.class, a2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.a2();
            case 2:
                return new net.idrnd.face.iad.capture.internal.z1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new java.lang.Object[]{"acceleration_", net.idrnd.face.iad.capture.internal.r1.class, "accelerationIncludingGravity_", net.idrnd.face.iad.capture.internal.r1.class, "angularVelocity_", net.idrnd.face.iad.capture.internal.r1.class, "motion_", net.idrnd.face.iad.capture.internal.r1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.a2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.a2.class) {
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
