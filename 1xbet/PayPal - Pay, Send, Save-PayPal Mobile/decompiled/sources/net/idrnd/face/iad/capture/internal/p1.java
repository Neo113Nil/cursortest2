package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class p1 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int BROWSER_FIELD_NUMBER = 4;
    public static final int CAMERAS_ON_DEVICE_FIELD_NUMBER = 8;
    public static final int CAPTURE_TYPE_FIELD_NUMBER = 15;
    private static final net.idrnd.face.iad.capture.internal.p1 DEFAULT_INSTANCE;
    public static final int ENGINE_FIELD_NUMBER = 5;
    public static final int EXTERNAL_FIELD_NUMBER = 12;
    public static final int FRONT_CAMERA_INFO_FIELD_NUMBER = 13;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int INITIALIZATION_TIME_FIELD_NUMBER = 9;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.p1> PARSER = null;
    public static final int PHOTO_CAPTURE_INFO_FIELD_NUMBER = 14;
    public static final int PLATFORM_FIELD_NUMBER = 7;
    public static final int TIMESTAMPS_MS_FIELD_NUMBER = 10;
    public static final int USED_CAMERA_FIELD_NUMBER = 3;
    public static final int WEBGL_RENDERER_FIELD_NUMBER = 11;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private net.idrnd.face.iad.capture.internal.s0 browser_;
    private int captureType_;
    private net.idrnd.face.iad.capture.internal.e1 engine_;
    private net.idrnd.face.iad.capture.internal.y0 frontCameraInfo_;
    private int height_;
    private int initializationTime_;
    private net.idrnd.face.iad.capture.internal.u1 os_;
    private net.idrnd.face.iad.capture.internal.a1 photoCaptureInfo_;
    private net.idrnd.face.iad.capture.internal.w1 platform_;
    private net.idrnd.face.iad.capture.internal.e2 timestampsMs_;
    private int width_;
    private java.lang.String usedCamera_ = "";
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> camerasOnDevice_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String webglRenderer_ = "";
    private java.lang.String external_ = "";

    static {
        net.idrnd.face.iad.capture.internal.p1 p1Var = new net.idrnd.face.iad.capture.internal.p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.p1.class, p1Var);
    }

    public static net.idrnd.face.iad.capture.internal.o1 a() {
        return (net.idrnd.face.iad.capture.internal.o1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.p1();
            case 2:
                return new net.idrnd.face.iad.capture.internal.o1();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0001\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004\t\u0005\t\u0006\t\u0007\t\bȚ\t\u0004\n\t\u000bȈ\fȈ\r\t\u000e\t\u000f\f", new java.lang.Object[]{"width_", "height_", "usedCamera_", "browser_", "engine_", "os_", "platform_", "camerasOnDevice_", "initializationTime_", "timestampsMs_", "webglRenderer_", "external_", "frontCameraInfo_", "photoCaptureInfo_", "captureType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.p1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.p1.class) {
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
