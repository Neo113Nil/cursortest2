package androidx.view.compose.serialization.serializers;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u00020\u00148\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/MutableState;", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/compose/runtime/MutableState;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/KSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MutableStateSerializer<T> implements kotlinx.serialization.KSerializer<androidx.compose.runtime.MutableState<T>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public MutableStateSerializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlinx.serialization.descriptors.SerialDescriptor SerialDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kSerializer;
        kotlinx.serialization.descriptors.SerialKind kind = kSerializer.getDescriptor().getKind();
        if (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) {
            SerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.PrimitiveSerialDescriptor("androidx.compose.runtime.MutableState", (kotlinx.serialization.descriptors.PrimitiveKind) kind);
        } else {
            SerialDescriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("androidx.compose.runtime.MutableState", kSerializer.getDescriptor());
        }
        this.descriptor = SerialDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, androidx.compose.runtime.MutableState<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.encodeSerializableValue(this.getHighResolutionOutputSizeshNQ4ISI, value.getValue());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final androidx.compose.runtime.MutableState<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        return androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(decoder.decodeSerializableValue(this.getHighResolutionOutputSizeshNQ4ISI), null, 2, null);
    }
}
