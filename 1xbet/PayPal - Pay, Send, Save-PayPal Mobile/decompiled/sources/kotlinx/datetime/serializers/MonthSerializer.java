package kotlinx.datetime.serializers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/serializers/MonthSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/Month;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/datetime/Month;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/datetime/Month;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MonthSerializer implements kotlinx.serialization.KSerializer<kotlinx.datetime.Month> {
    public static final kotlinx.datetime.serializers.MonthSerializer INSTANCE = new kotlinx.datetime.serializers.MonthSerializer();
    private final /* synthetic */ kotlinx.serialization.KSerializer<kotlinx.datetime.Month> Camera2StreamConfigurationMap = kotlinx.datetime.serializers.MonthSerializersKt.createEnumSerializer("kotlinx.datetime.Month", kotlinx.datetime.Month.values());

    private MonthSerializer() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.datetime.Month value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.Camera2StreamConfigurationMap.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.Camera2StreamConfigurationMap.getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.datetime.Month deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return this.Camera2StreamConfigurationMap.deserialize(decoder);
    }
}
