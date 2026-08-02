package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class EmptyArrayMap$iterator$1 implements java.util.Iterator, kotlin.jvm.internal.markers.KMappedMarker {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    EmptyArrayMap$iterator$1() {
    }

    @Override // java.util.Iterator
    public final java.lang.Void next() {
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
