package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class g2 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BITRATE_FIELD_NUMBER = 4;
    public static final int CODEC_FIELD_NUMBER = 2;
    public static final int DATA_FIELD_NUMBER = 1;
    private static final net.idrnd.face.iad.capture.internal.g2 DEFAULT_INSTANCE;
    public static final int FPS_FIELD_NUMBER = 5;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.g2> PARSER = null;
    public static final int RESOLUTION_FIELD_NUMBER = 3;
    private int bitrate_;
    private int codec_;
    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    private float fps_;
    private net.idrnd.face.iad.capture.internal.c2 resolution_;

    static {
        net.idrnd.face.iad.capture.internal.g2 g2Var = new net.idrnd.face.iad.capture.internal.g2();
        DEFAULT_INSTANCE = g2Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.g2.class, g2Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.g2();
            case 2:
                return new net.idrnd.face.iad.capture.internal.f2();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\f\u0003\t\u0004\u0004\u0005\u0001", new java.lang.Object[]{"data_", "codec_", "resolution_", "bitrate_", "fps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.g2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.g2.class) {
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
