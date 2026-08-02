package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class g1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONSECUTIVE_FRAMES_ARE_DIFFERENT_FIELD_NUMBER = 2;
    public static final int CROP_SIZE_FIELD_NUMBER = 4;
    private static final net.idrnd.face.iad.capture.internal.g1 DEFAULT_INSTANCE;
    public static final int FPS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.g1> PARSER = null;
    public static final int QUANTILES_FIELD_NUMBER = 1;
    public static final int QUANTILE_FIELD_NUMBER = 5;
    public static final int THRESHOLD_FIELD_NUMBER = 6;
    private float cropSize_;
    private float fps_;
    private float quantile_;
    private int threshold_;
    private int quantilesMemoizedSerializedSize = -1;
    private int consecutiveFramesAreDifferentMemoizedSerializedSize = -1;
    private com.google.protobuf.Internal.IntList quantiles_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    private com.google.protobuf.Internal.BooleanList consecutiveFramesAreDifferent_ = com.google.protobuf.GeneratedMessageLite.emptyBooleanList();

    static {
        net.idrnd.face.iad.capture.internal.g1 g1Var = new net.idrnd.face.iad.capture.internal.g1();
        DEFAULT_INSTANCE = g1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.g1.class, g1Var);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.g1();
            case 2:
                return new net.idrnd.face.iad.capture.internal.f1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001'\u0002*\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0004", new java.lang.Object[]{"quantiles_", "consecutiveFramesAreDifferent_", "fps_", "cropSize_", "quantile_", "threshold_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.g1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.g1.class) {
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
