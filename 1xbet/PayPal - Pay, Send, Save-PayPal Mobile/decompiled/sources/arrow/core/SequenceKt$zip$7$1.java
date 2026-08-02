package arrow.core;

/* JADX INFO: Add missing generic type declarations: [K] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0012\u0010\nR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Larrow/core/SequenceKt$zip$7$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "iterator1", "Ljava/util/Iterator;", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "iterator3", "getIterator3", "iterator4", "getIterator4", "iterator5", "getIterator5", "iterator6", "getIterator6", "iterator7", "getIterator7", "iterator8", "getIterator8", "iterator9", "getIterator9"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SequenceKt$zip$7$1<K> implements java.util.Iterator<K>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.jvm.functions.Function9<B, C, D, E, F, G, H, I, J, K> getHighSpeedVideoFpsRangesFor;
    private final java.util.Iterator<B> iterator1;
    private final java.util.Iterator<C> iterator2;
    private final java.util.Iterator<D> iterator3;
    private final java.util.Iterator<E> iterator4;
    private final java.util.Iterator<F> iterator5;
    private final java.util.Iterator<G> iterator6;
    private final java.util.Iterator<H> iterator7;
    private final java.util.Iterator<I> iterator8;
    private final java.util.Iterator<J> iterator9;

    /* JADX WARN: Multi-variable type inference failed */
    SequenceKt$zip$7$1(kotlin.sequences.Sequence<? extends B> sequence, kotlin.sequences.Sequence<? extends C> sequence2, kotlin.sequences.Sequence<? extends D> sequence3, kotlin.sequences.Sequence<? extends E> sequence4, kotlin.sequences.Sequence<? extends F> sequence5, kotlin.sequences.Sequence<? extends G> sequence6, kotlin.sequences.Sequence<? extends H> sequence7, kotlin.sequences.Sequence<? extends I> sequence8, kotlin.sequences.Sequence<? extends J> sequence9, kotlin.jvm.functions.Function9<? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? super J, ? extends K> function9) {
        this.getHighSpeedVideoFpsRangesFor = function9;
        this.iterator1 = sequence.iterator();
        this.iterator2 = sequence2.iterator();
        this.iterator3 = sequence3.iterator();
        this.iterator4 = sequence4.iterator();
        this.iterator5 = sequence5.iterator();
        this.iterator6 = sequence6.iterator();
        this.iterator7 = sequence7.iterator();
        this.iterator8 = sequence8.iterator();
        this.iterator9 = sequence9.iterator();
    }

    public final java.util.Iterator<B> getIterator1() {
        return this.iterator1;
    }

    public final java.util.Iterator<C> getIterator2() {
        return this.iterator2;
    }

    public final java.util.Iterator<D> getIterator3() {
        return this.iterator3;
    }

    public final java.util.Iterator<E> getIterator4() {
        return this.iterator4;
    }

    public final java.util.Iterator<F> getIterator5() {
        return this.iterator5;
    }

    public final java.util.Iterator<G> getIterator6() {
        return this.iterator6;
    }

    public final java.util.Iterator<H> getIterator7() {
        return this.iterator7;
    }

    public final java.util.Iterator<I> getIterator8() {
        return this.iterator8;
    }

    public final java.util.Iterator<J> getIterator9() {
        return this.iterator9;
    }

    @Override // java.util.Iterator
    public final K next() {
        return this.getHighSpeedVideoFpsRangesFor.invoke(this.iterator1.next(), this.iterator2.next(), this.iterator3.next(), this.iterator4.next(), this.iterator5.next(), this.iterator6.next(), this.iterator7.next(), this.iterator8.next(), this.iterator9.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext() && this.iterator3.hasNext() && this.iterator4.hasNext() && this.iterator5.hasNext() && this.iterator6.hasNext() && this.iterator7.hasNext() && this.iterator8.hasNext() && this.iterator9.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
