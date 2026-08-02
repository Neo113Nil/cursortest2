package arrow.core;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n"}, d2 = {"Larrow/core/SequenceKt$zip$1$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "iterator1", "Ljava/util/Iterator;", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "iterator3", "getIterator3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SequenceKt$zip$1$1<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.jvm.functions.Function3<B, C, D, E> getHighSpeedVideoFpsRangesFor;
    private final java.util.Iterator<B> iterator1;
    private final java.util.Iterator<C> iterator2;
    private final java.util.Iterator<D> iterator3;

    /* JADX WARN: Multi-variable type inference failed */
    SequenceKt$zip$1$1(kotlin.sequences.Sequence<? extends B> sequence, kotlin.sequences.Sequence<? extends C> sequence2, kotlin.sequences.Sequence<? extends D> sequence3, kotlin.jvm.functions.Function3<? super B, ? super C, ? super D, ? extends E> function3) {
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.iterator1 = sequence.iterator();
        this.iterator2 = sequence2.iterator();
        this.iterator3 = sequence3.iterator();
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

    @Override // java.util.Iterator
    public final E next() {
        return this.getHighSpeedVideoFpsRangesFor.invoke(this.iterator1.next(), this.iterator2.next(), this.iterator3.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext() && this.iterator3.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
