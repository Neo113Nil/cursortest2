package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntriesIterator;", "K", "V", "", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/util/Map$Entry;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentOrderedMapEntriesIterator<K, V> implements java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapLinksIterator<K, V> getHighSpeedVideoFpsRanges;

    public PersistentOrderedMapEntriesIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.getHighSpeedVideoFpsRanges = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey(), persistentOrderedMap.getHashMap$runtime());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges.hasNext();
    }

    @Override // java.util.Iterator
    public final java.util.Map.Entry<K, V> next() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry(this.getHighSpeedVideoFpsRanges.getNextKey(), this.getHighSpeedVideoFpsRanges.next().getValue());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
