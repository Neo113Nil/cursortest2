package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class i1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    private static final net.idrnd.face.iad.capture.internal.i1 DEFAULT_INSTANCE;
    public static final int IMMUTABLE_STREAM_ID_FIELD_NUMBER = 5;
    public static final int IS_OBS_FIELD_NUMBER = 3;
    public static final int LISTENER_INCONSISTENCIES_FIELD_NUMBER = 10;
    public static final int MODULE_INTEGRITY_FIELD_NUMBER = 8;
    public static final int NOT_NATIVE_FUNCTION_FIELD_NUMBER = 1;
    public static final int OPEN_CONSOLE_FIELD_NUMBER = 7;
    public static final int OVERRIDE_FUNCTION_NAME_FIELD_NUMBER = 4;
    public static final int OVERRIDE_TO_STRING_FIELD_NUMBER = 2;
    public static final int OVERRIDE_USER_AGENT_FIELD_NUMBER = 12;
    public static final int OVERRIDE_VIDEO_SRC_FIELD_NUMBER = 9;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.i1> PARSER = null;
    public static final int ROOTED_DEVICE_FIELD_NUMBER = 11;
    public static final int TOO_MANY_VIDEO_ELEMENTS_FIELD_NUMBER = 6;
    private boolean immutableStreamId_;
    private boolean isObs_;
    private boolean listenerInconsistencies_;
    private boolean moduleIntegrity_;
    private boolean notNativeFunction_;
    private boolean openConsole_;
    private boolean overrideFunctionName_;
    private boolean overrideToString_;
    private boolean overrideUserAgent_;
    private boolean overrideVideoSrc_;
    private boolean rootedDevice_;
    private boolean tooManyVideoElements_;

    static {
        net.idrnd.face.iad.capture.internal.i1 i1Var = new net.idrnd.face.iad.capture.internal.i1();
        DEFAULT_INSTANCE = i1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.i1.class, i1Var);
    }

    public static net.idrnd.face.iad.capture.internal.h1 a() {
        return (net.idrnd.face.iad.capture.internal.h1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.i1();
            case 2:
                return new net.idrnd.face.iad.capture.internal.h1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007", new java.lang.Object[]{"notNativeFunction_", "overrideToString_", "isObs_", "overrideFunctionName_", "immutableStreamId_", "tooManyVideoElements_", "openConsole_", "moduleIntegrity_", "overrideVideoSrc_", "listenerInconsistencies_", "rootedDevice_", "overrideUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.i1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.i1.class) {
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
