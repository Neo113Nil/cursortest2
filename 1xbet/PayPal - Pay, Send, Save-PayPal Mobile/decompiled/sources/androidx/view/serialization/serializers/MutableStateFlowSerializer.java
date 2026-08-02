package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u00020\u00148\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/KSerializer;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MutableStateFlowSerializer<T> implements kotlinx.serialization.KSerializer<kotlinx.coroutines.flow.MutableStateFlow<T>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> Camera2StreamConfigurationMap;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public MutableStateFlowSerializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlinx.serialization.descriptors.SerialDescriptor SerialDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.Camera2StreamConfigurationMap = kSerializer;
        kotlinx.serialization.descriptors.SerialKind kind = kSerializer.getDescriptor().getKind();
        if (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            SerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.coroutines.flow.MutableStateFlow", (kotlinx.serialization.descriptors.PrimitiveKind) kind);
        } else {
            SerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("kotlinx.coroutines.flow.MutableStateFlow", kSerializer.getDescriptor());
        }
        this.descriptor = SerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, kotlinx.coroutines.flow.MutableStateFlow<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.encodeSerializableValue(this.Camera2StreamConfigurationMap, value.getValue());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final kotlinx.coroutines.flow.MutableStateFlow<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(decoder.decodeSerializableValue(this.Camera2StreamConfigurationMap));
    }
}
