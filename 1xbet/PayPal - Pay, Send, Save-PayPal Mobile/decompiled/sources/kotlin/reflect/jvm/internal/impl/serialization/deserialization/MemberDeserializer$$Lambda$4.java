package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
class MemberDeserializer$$Lambda$4 implements kotlin.jvm.functions.Function0 {
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.protobuf.MessageLite getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    public MemberDeserializer$$Lambda$4(kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer memberDeserializer, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind annotatedCallableKind) {
        this.getHighSpeedVideoFpsRangesFor = memberDeserializer;
        this.getHighSpeedVideoSizes = messageLite;
        this.Camera2StreamConfigurationMap = annotatedCallableKind;
    }
}
