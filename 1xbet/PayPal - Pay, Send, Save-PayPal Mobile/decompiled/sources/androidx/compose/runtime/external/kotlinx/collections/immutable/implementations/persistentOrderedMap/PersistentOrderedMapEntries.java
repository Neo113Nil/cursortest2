package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "element", "", "contains", "(Ljava/util/Map$Entry;)Z", "", "iterator", "()Ljava/util/Iterator;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "getHighSpeedVideoFpsRanges", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentOrderedMapEntries<K, V> extends kotlin.collections.AbstractSet<java.util.Map.Entry<? extends K, ? extends V>> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> getHighSpeedVideoFpsRanges;

    public PersistentOrderedMapEntries(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.getHighSpeedVideoFpsRanges = persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return contains((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    public final boolean contains(java.util.Map.Entry<? extends K, ? extends V> element) {
        if (!(element instanceof java.util.Map.Entry)) {
            return false;
        }
        V v = this.getHighSpeedVideoFpsRanges.get(element.getKey());
        return v != null ? kotlin.jvm.internal.Intrinsics.areEqual(v, element.getValue()) : element.getValue() == null && this.getHighSpeedVideoFpsRanges.containsKey(element.getKey());
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapEntriesIterator(this.getHighSpeedVideoFpsRanges);
    }
}
