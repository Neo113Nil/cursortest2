package androidx.navigation3.runtime.serialization;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u00020\u00198\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/navigation3/runtime/serialization/NavBackStackSerializer;", "Landroidx/navigation3/runtime/NavKey;", "T", "Lkotlinx/serialization/KSerializer;", "Landroidx/navigation3/runtime/NavBackStack;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/navigation3/runtime/NavBackStack;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/navigation3/runtime/NavBackStack;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/KSerializer;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", "Camera2StreamConfigurationMap", "Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavBackStackSerializer<T extends androidx.navigation3.runtime.NavKey> implements kotlinx.serialization.KSerializer<androidx.navigation3.runtime.NavBackStack<T>> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.compose.serialization.serializers.SnapshotStateListSerializer<T> getHighSpeedVideoSizes;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<T> getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public NavBackStackSerializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        this.getHighResolutionOutputSizeshNQ4ISI = kSerializer;
        androidx.view.compose.serialization.serializers.SnapshotStateListSerializer<T> snapshotStateListSerializer = new androidx.view.compose.serialization.serializers.SnapshotStateListSerializer<>(kSerializer);
        this.getHighSpeedVideoSizes = snapshotStateListSerializer;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("androidx.navigation3.runtime.NavBackStack", snapshotStateListSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, androidx.navigation3.runtime.NavBackStack<T> value) {
        encoder.encodeSerializableValue(this.getHighSpeedVideoSizes, value.getBase$navigation3_runtime());
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final androidx.navigation3.runtime.NavBackStack<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        return new androidx.navigation3.runtime.NavBackStack<>((androidx.compose.runtime.snapshots.SnapshotStateList) decoder.decodeSerializableValue(this.getHighSpeedVideoSizes));
    }
}
