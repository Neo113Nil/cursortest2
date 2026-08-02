package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValues;", "K", "V", "", "Lkotlin/collections/AbstractMutableCollection;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getHighResolutionOutputSizeshNQ4ISI", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends kotlin.collections.AbstractMutableCollection<V> implements java.util.Collection<V>, kotlin.jvm.internal.markers.KMutableCollection {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> getHighResolutionOutputSizeshNQ4ISI;

    public PersistentOrderedMapBuilderValues(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.getHighResolutionOutputSizeshNQ4ISI = persistentOrderedMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableCollection
    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object element) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsValue(element);
    }

    @Override // kotlin.collections.AbstractMutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderValuesIterator(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
