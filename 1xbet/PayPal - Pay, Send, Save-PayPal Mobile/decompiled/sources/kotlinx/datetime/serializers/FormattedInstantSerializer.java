package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00198\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/datetime/serializers/FormattedInstantSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/time/Instant;", "", "name", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "format", "<init>", "(Ljava/lang/String;Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlin/time/Instant;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/time/Instant;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlinx/datetime/format/DateTimeFormat;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FormattedInstantSerializer implements kotlinx.serialization.KSerializer<kotlin.time.Instant> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> Camera2StreamConfigurationMap;

    public FormattedInstantSerializer(java.lang.String str, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> dateTimeFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
        this.Camera2StreamConfigurationMap = dateTimeFormat;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlin.time.Instant/serializer/".concat(java.lang.String.valueOf(str)), kotlinx.serialization.descriptors.PrimitiveKind.STRING.INSTANCE);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public kotlin.time.Instant deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return kotlinx.datetime.InstantKt.parse(kotlin.time.Instant.INSTANCE, decoder.decodeString(), this.Camera2StreamConfigurationMap);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlin.time.Instant value) {
        java.lang.String format$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        format$default = kotlinx.datetime.InstantKt__InstantKt.format$default(value, this.Camera2StreamConfigurationMap, null, 2, null);
        encoder.encodeString(format$default);
    }

    public java.lang.String toString() {
        return getDescriptor().getGetHighSpeedVideoSizes();
    }
}
