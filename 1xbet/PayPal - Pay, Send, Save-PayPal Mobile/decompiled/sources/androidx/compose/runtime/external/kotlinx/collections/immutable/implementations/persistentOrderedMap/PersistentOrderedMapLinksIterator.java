package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B+\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "Ljava/lang/Object;", "getNextKey$runtime", "()Ljava/lang/Object;", "setNextKey$runtime", "(Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "", "index", com.visa.cbp.getEncExpo.warmup, "getIndex$runtime", "()I", "setIndex$runtime", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements java.util.Iterator<androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> getHighSpeedVideoFpsRanges;
    private int index;
    private java.lang.Object nextKey;

    public PersistentOrderedMapLinksIterator(java.lang.Object obj, java.util.Map<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> map) {
        this.nextKey = obj;
        this.getHighSpeedVideoFpsRanges = map;
    }

    /* renamed from: getNextKey$runtime, reason: from getter */
    public final java.lang.Object getNextKey() {
        return this.nextKey;
    }

    public final void setNextKey$runtime(java.lang.Object obj) {
        this.nextKey = obj;
    }

    /* renamed from: getIndex$runtime, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final void setIndex$runtime(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.getHighSpeedVideoFpsRanges.size();
    }

    @Override // java.util.Iterator
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.getHighSpeedVideoFpsRanges.get(this.nextKey);
        if (linkedValue == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Hash code of a key (");
            sb.append(this.nextKey);
            sb.append(") has changed after it was added to the persistent map.");
            throw new java.util.ConcurrentModificationException(sb.toString());
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue2 = linkedValue;
        this.index++;
        this.nextKey = linkedValue2.getNext();
        return linkedValue2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
