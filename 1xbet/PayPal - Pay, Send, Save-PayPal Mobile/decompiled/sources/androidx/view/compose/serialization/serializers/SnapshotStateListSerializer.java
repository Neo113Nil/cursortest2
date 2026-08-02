package androidx.view.compose.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R \u0010\u0018\u001a\u00020\u00178\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/KSerializer;", "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapshotStateListSerializer<T> implements kotlinx.serialization.KSerializer<androidx.compose.runtime.snapshots.SnapshotStateList<T>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<java.util.List<T>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> getHighSpeedVideoSizes;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public SnapshotStateListSerializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        this.getHighSpeedVideoSizes = kSerializer;
        kotlinx.serialization.KSerializer<java.util.List<T>> ListSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(kSerializer);
        this.getHighResolutionOutputSizeshNQ4ISI = ListSerializer;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("androidx.compose.runtime.SnapshotStateList", ListSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, androidx.compose.runtime.snapshots.SnapshotStateList<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.encodeSerializableValue(this.getHighResolutionOutputSizeshNQ4ISI, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final androidx.compose.runtime.snapshots.SnapshotStateList<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.util.List list = (java.util.List) decoder.decodeSerializableValue(this.getHighResolutionOutputSizeshNQ4ISI);
        androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList = new androidx.compose.runtime.snapshots.SnapshotStateList<>();
        snapshotStateList.addAll(kotlin.collections.CollectionsKt.toList(list));
        return snapshotStateList;
    }
}
