package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\fJ#\u0010\u0015\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\fR \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/AbstractMapBuilderEntries;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/util/Map$Entry;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "removeEntry", "containsEntry", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHighSpeedVideoFpsRangesFor", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentHashMapBuilderEntries<K, V> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries<java.util.Map.Entry<K, V>, K, V> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> getHighSpeedVideoFpsRangesFor;

    public PersistentHashMapBuilderEntries(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.getHighSpeedVideoFpsRangesFor = persistentHashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.util.Map.Entry<K, V> element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntriesIterator(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public final boolean removeEntry(java.util.Map.Entry<? extends K, ? extends V> element) {
        return this.getHighSpeedVideoFpsRangesFor.remove(element.getKey(), element.getValue());
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public final boolean containsEntry(java.util.Map.Entry<? extends K, ? extends V> element) {
        V v = this.getHighSpeedVideoFpsRangesFor.get(element.getKey());
        return v != null ? kotlin.jvm.internal.Intrinsics.areEqual(v, element.getValue()) : element.getValue() == null && this.getHighSpeedVideoFpsRangesFor.containsKey(element.getKey());
    }
}
