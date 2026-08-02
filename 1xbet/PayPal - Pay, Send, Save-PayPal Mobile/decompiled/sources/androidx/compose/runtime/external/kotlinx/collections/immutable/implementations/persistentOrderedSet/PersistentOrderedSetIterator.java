package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "", "nextElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getMap$runtime", "()Ljava/util/Map;", "", "index", com.visa.cbp.getEncExpo.warmup, "getIndex$runtime", "()I", "setIndex$runtime", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PersistentOrderedSetIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoSizes;
    private int index;
    private final java.util.Map<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> map;

    public PersistentOrderedSetIterator(java.lang.Object obj, java.util.Map<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> map) {
        this.getHighSpeedVideoSizes = obj;
        this.map = map;
    }

    public final java.util.Map<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> getMap$runtime() {
        return this.map;
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
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        if (hasNext()) {
            E e = (E) this.getHighSpeedVideoSizes;
            this.index++;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links = this.map.get(e);
            if (links != null) {
                this.getHighSpeedVideoSizes = links.getNext();
                return e;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Hash code of an element (");
            sb.append(e);
            sb.append(") has changed after it was added to the persistent set.");
            throw new java.util.ConcurrentModificationException(sb.toString());
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
