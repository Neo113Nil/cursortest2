package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B7\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "p0", "p1", "p2", "<init>", "(Ljava/util/Map;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "getValue", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableMapEntry<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> Camera2StreamConfigurationMap;

    public MutableMapEntry(java.util.Map<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> map, K k, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue) {
        super(k, linkedValue.getValue());
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoSizes = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V getValue() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final V setValue(V p0) {
        V value = this.getHighSpeedVideoSizes.getValue();
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes.withValue(p0);
        this.Camera2StreamConfigurationMap.put(getKey(), this.getHighSpeedVideoSizes);
        return value;
    }
}
