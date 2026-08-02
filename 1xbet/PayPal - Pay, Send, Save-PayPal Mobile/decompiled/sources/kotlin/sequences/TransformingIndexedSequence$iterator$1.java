package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence$iterator$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "index", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "setIndex", "(I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformingIndexedSequence$iterator$1<R> implements java.util.Iterator<R>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.sequences.TransformingIndexedSequence<T, R> getHighResolutionOutputSizeshNQ4ISI;
    private int index;
    private final java.util.Iterator<T> iterator;

    TransformingIndexedSequence$iterator$1(kotlin.sequences.TransformingIndexedSequence<T, R> transformingIndexedSequence) {
        kotlin.sequences.Sequence sequence;
        this.getHighResolutionOutputSizeshNQ4ISI = transformingIndexedSequence;
        sequence = ((kotlin.sequences.TransformingIndexedSequence) transformingIndexedSequence).getHighSpeedVideoFpsRangesFor;
        this.iterator = sequence.iterator();
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public final R next() {
        kotlin.jvm.functions.Function2 function2;
        function2 = ((kotlin.sequences.TransformingIndexedSequence) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
        int i = this.index;
        this.index = i + 1;
        if (i < 0) {
            kotlin.collections.CollectionsKt.throwIndexOverflow();
        }
        return (R) function2.invoke(java.lang.Integer.valueOf(i), this.iterator.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
