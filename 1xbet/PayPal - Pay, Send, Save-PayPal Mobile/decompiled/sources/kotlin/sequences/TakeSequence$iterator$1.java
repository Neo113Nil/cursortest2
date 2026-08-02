package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/sequences/TakeSequence$iterator$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.visa.cbp.getEncExpo.warmup, "getLeft", "()I", "setLeft", "(I)V", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TakeSequence$iterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Iterator<T> iterator;
    private int left;

    TakeSequence$iterator$1(kotlin.sequences.TakeSequence<T> takeSequence) {
        int i;
        kotlin.sequences.Sequence sequence;
        i = ((kotlin.sequences.TakeSequence) takeSequence).getHighSpeedVideoFpsRangesFor;
        this.left = i;
        sequence = ((kotlin.sequences.TakeSequence) takeSequence).getHighResolutionOutputSizeshNQ4ISI;
        this.iterator = sequence.iterator();
    }

    public final int getLeft() {
        return this.left;
    }

    public final void setLeft(int i) {
        this.left = i;
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.left;
        if (i == 0) {
            throw new java.util.NoSuchElementException();
        }
        this.left = i - 1;
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.left > 0 && this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
