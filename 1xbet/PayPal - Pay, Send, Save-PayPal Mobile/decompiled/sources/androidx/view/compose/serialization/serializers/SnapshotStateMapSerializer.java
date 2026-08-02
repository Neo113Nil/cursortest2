package androidx.view.compose.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u00020\u00168\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;", "K", "V", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SnapshotStateMapSerializer<K, V> implements kotlinx.serialization.KSerializer<androidx.compose.runtime.snapshots.SnapshotStateMap<K, V>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
    private final kotlinx.serialization.KSerializer<java.util.Map<K, V>> getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public SnapshotStateMapSerializer(kotlinx.serialization.KSerializer<K> kSerializer, kotlinx.serialization.KSerializer<V> kSerializer2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer2, "");
        kotlinx.serialization.KSerializer<java.util.Map<K, V>> MapSerializer = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(kSerializer, kSerializer2);
        this.getHighSpeedVideoFpsRangesFor = MapSerializer;
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.SerialDescriptor("androidx.compose.runtime.SnapshotStateMap", MapSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        encoder.encodeSerializableValue(this.getHighSpeedVideoFpsRangesFor, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        java.util.Map<? extends K, ? extends V> map = (java.util.Map) decoder.decodeSerializableValue(this.getHighSpeedVideoFpsRangesFor);
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap = new androidx.compose.runtime.snapshots.SnapshotStateMap<>();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }
}
