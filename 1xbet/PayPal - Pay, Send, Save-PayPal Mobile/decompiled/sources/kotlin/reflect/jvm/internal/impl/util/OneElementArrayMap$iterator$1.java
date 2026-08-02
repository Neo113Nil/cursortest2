package kotlin.reflect.jvm.internal.impl.util;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class OneElementArrayMap$iterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap<T> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor = true;

    OneElementArrayMap$iterator$1(kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap<T> oneElementArrayMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = oneElementArrayMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor = false;
            return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
