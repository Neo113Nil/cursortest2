package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [V] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n"}, d2 = {"Lkotlin/sequences/MergingSequence$iterator$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "iterator1", "Ljava/util/Iterator;", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MergingSequence$iterator$1<V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.sequences.MergingSequence<T1, T2, V> Camera2StreamConfigurationMap;
    private final java.util.Iterator<T1> iterator1;
    private final java.util.Iterator<T2> iterator2;

    MergingSequence$iterator$1(kotlin.sequences.MergingSequence<T1, T2, V> mergingSequence) {
        kotlin.sequences.Sequence sequence;
        kotlin.sequences.Sequence sequence2;
        this.Camera2StreamConfigurationMap = mergingSequence;
        sequence = ((kotlin.sequences.MergingSequence) mergingSequence).getHighSpeedVideoSizes;
        this.iterator1 = sequence.iterator();
        sequence2 = ((kotlin.sequences.MergingSequence) mergingSequence).getHighSpeedVideoFpsRanges;
        this.iterator2 = sequence2.iterator();
    }

    public final java.util.Iterator<T1> getIterator1() {
        return this.iterator1;
    }

    public final java.util.Iterator<T2> getIterator2() {
        return this.iterator2;
    }

    @Override // java.util.Iterator
    public final V next() {
        kotlin.jvm.functions.Function2 function2;
        function2 = ((kotlin.sequences.MergingSequence) this.Camera2StreamConfigurationMap).getHighResolutionOutputSizeshNQ4ISI;
        return (V) function2.invoke(this.iterator1.next(), this.iterator2.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
