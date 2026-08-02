package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/serialization/internal/UnitSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlin/Unit;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnitSerializer implements kotlinx.serialization.KSerializer<kotlin.Unit> {
    public static final kotlinx.serialization.internal.UnitSerializer INSTANCE = new kotlinx.serialization.internal.UnitSerializer();
    private final /* synthetic */ kotlinx.serialization.internal.ObjectSerializer<kotlin.Unit> Camera2StreamConfigurationMap = new kotlinx.serialization.internal.ObjectSerializer<>("kotlin.Unit", kotlin.Unit.INSTANCE);

    private UnitSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        m24255deserialize(decoder);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlin.Unit value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.Camera2StreamConfigurationMap.serialize(encoder, value);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.Camera2StreamConfigurationMap.getDescriptor();
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public final void m24255deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        this.Camera2StreamConfigurationMap.deserialize(decoder);
    }
}
