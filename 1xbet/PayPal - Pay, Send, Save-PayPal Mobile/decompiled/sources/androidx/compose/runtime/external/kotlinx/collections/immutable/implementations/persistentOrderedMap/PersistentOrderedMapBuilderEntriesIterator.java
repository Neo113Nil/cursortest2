package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderEntriesIterator;", "K", "V", "", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/util/Map$Entry;", "", "remove", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderLinksIterator<K, V> Camera2StreamConfigurationMap;

    public PersistentOrderedMapBuilderEntriesIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.Camera2StreamConfigurationMap = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap.hasNext();
    }

    @Override // java.util.Iterator
    public final java.util.Map.Entry<K, V> next() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.MutableMapEntry(this.Camera2StreamConfigurationMap.getBuilder$runtime().getHashMapBuilder$runtime(), this.Camera2StreamConfigurationMap.getLastIteratedKey(), this.Camera2StreamConfigurationMap.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.Camera2StreamConfigurationMap.remove();
    }
}
