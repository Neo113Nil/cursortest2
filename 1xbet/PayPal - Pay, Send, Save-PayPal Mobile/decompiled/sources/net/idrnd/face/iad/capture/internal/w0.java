package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public final class w0 extends com.google.protobuf.GeneratedMessageLite implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int APPLICATION_VERSION_FIELD_NUMBER = 15;
    public static final int CONTROL_PHOTO_FIELD_NUMBER = 2;
    public static final int CROPS_FIELD_NUMBER = 11;
    private static final net.idrnd.face.iad.capture.internal.w0 DEFAULT_INSTANCE;
    public static final int EXTRA_IMAGES_FIELD_NUMBER = 18;
    public static final int FRAME_SIMILARITY_CHECK_FIELD_NUMBER = 17;
    public static final int FRONT_CHECK_FIELD_NUMBER = 6;
    public static final int META_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.w0> PARSER = null;
    public static final int PHOTO_FIELD_NUMBER = 1;
    public static final int PHOTO_FORMAT_FIELD_NUMBER = 12;
    public static final int PLATFORM_FIELD_NUMBER = 5;
    public static final int QUALITY_PHOTO_FIELD_NUMBER = 16;
    public static final int SENSORS_FIELD_NUMBER = 14;
    public static final int TIMESTAMP_SEC_FIELD_NUMBER = 10;
    public static final int USED_TAKE_PHOTO_METHOD_FIELD_NUMBER = 7;
    public static final int VIDEO_FIELD_NUMBER = 13;
    private java.lang.String applicationVersion_;
    private com.google.protobuf.ByteString controlPhoto_;
    private com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.k1> crops_;
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> extraImages_;
    private net.idrnd.face.iad.capture.internal.g1 frameSimilarityCheck_;
    private net.idrnd.face.iad.capture.internal.i1 frontCheck_;
    private net.idrnd.face.iad.capture.internal.p1 metaInfo_;
    private net.idrnd.face.iad.capture.internal.m1 photoFormat_;
    private com.google.protobuf.ByteString photo_;
    private int platform_;
    private int qualityPhoto_;
    private net.idrnd.face.iad.capture.internal.a2 sensors_;
    private long timestampSec_;
    private int usedTakePhotoMethod_;
    private net.idrnd.face.iad.capture.internal.g2 video_;

    static {
        net.idrnd.face.iad.capture.internal.w0 w0Var = new net.idrnd.face.iad.capture.internal.w0();
        DEFAULT_INSTANCE = w0Var;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(net.idrnd.face.iad.capture.internal.w0.class, w0Var);
    }

    public static net.idrnd.face.iad.capture.internal.t0 c() {
        return (net.idrnd.face.iad.capture.internal.t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (net.idrnd.face.iad.capture.internal.q0.f6999a[methodToInvoke.ordinal()]) {
            case 1:
                return new net.idrnd.face.iad.capture.internal.w0();
            case 2:
                return new net.idrnd.face.iad.capture.internal.t0();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u0012\u000f\u0000\u0002\u0000\u0001\n\u0002\n\u0003\t\u0005\f\u0006\t\u0007\f\n\u0002\u000b\u001b\f\t\r\t\u000e\t\u000fȈ\u0010\f\u0011\t\u0012\u001c", new java.lang.Object[]{"photo_", "controlPhoto_", "metaInfo_", "platform_", "frontCheck_", "usedTakePhotoMethod_", "timestampSec_", "crops_", net.idrnd.face.iad.capture.internal.k1.class, "photoFormat_", "video_", "sensors_", "applicationVersion_", "qualityPhoto_", "frameSimilarityCheck_", "extraImages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<net.idrnd.face.iad.capture.internal.w0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (net.idrnd.face.iad.capture.internal.w0.class) {
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

    public final void a(java.util.ArrayList arrayList) {
        a();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) arrayList, (java.util.List) this.crops_);
    }

    public final void b(java.util.ArrayList arrayList) {
        b();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) arrayList, (java.util.List) this.extraImages_);
    }

    public w0() {
        com.google.protobuf.ByteString byteString = com.google.protobuf.ByteString.EMPTY;
        this.photo_ = byteString;
        this.controlPhoto_ = byteString;
        this.crops_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        this.applicationVersion_ = "";
        this.extraImages_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    public final void a() {
        com.google.protobuf.Internal.ProtobufList<net.idrnd.face.iad.capture.internal.k1> protobufList = this.crops_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.crops_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public final void b() {
        com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> protobufList = this.extraImages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.extraImages_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }
}
