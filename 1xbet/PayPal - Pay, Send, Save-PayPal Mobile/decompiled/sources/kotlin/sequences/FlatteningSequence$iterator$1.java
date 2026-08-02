package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/sequences/FlatteningSequence$iterator$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "itemIterator", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "", "state", com.visa.cbp.getEncExpo.warmup, "getState", "()I", "setState", "(I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlatteningSequence$iterator$1<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.sequences.FlatteningSequence<T, R, E> getHighSpeedVideoFpsRangesFor;
    private java.util.Iterator<? extends E> itemIterator;
    private final java.util.Iterator<T> iterator;
    private int state;

    FlatteningSequence$iterator$1(kotlin.sequences.FlatteningSequence<T, R, E> flatteningSequence) {
        kotlin.sequences.Sequence sequence;
        this.getHighSpeedVideoFpsRangesFor = flatteningSequence;
        sequence = ((kotlin.sequences.FlatteningSequence) flatteningSequence).getHighSpeedVideoFpsRangesFor;
        this.iterator = sequence.iterator();
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    public final java.util.Iterator<E> getItemIterator() {
        return this.itemIterator;
    }

    public final void setItemIterator(java.util.Iterator<? extends E> it) {
        this.itemIterator = it;
    }

    public final int getState() {
        return this.state;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @Override // java.util.Iterator
    public final E next() {
        int i = this.state;
        if (i == 2) {
            throw new java.util.NoSuchElementException();
        }
        if (i == 0 && !getHighResolutionOutputSizeshNQ4ISI()) {
            throw new java.util.NoSuchElementException();
        }
        this.state = 0;
        java.util.Iterator<? extends E> it = this.itemIterator;
        kotlin.jvm.internal.Intrinsics.checkNotNull(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.state;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        java.util.Iterator<? extends E> it = this.itemIterator;
        if (it != null && it.hasNext()) {
            this.state = 1;
            return true;
        }
        while (this.iterator.hasNext()) {
            java.lang.Object next = this.iterator.next();
            function1 = ((kotlin.sequences.FlatteningSequence) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
            function12 = ((kotlin.sequences.FlatteningSequence) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            java.util.Iterator<? extends E> it2 = (java.util.Iterator) function1.invoke(function12.invoke(next));
            if (it2.hasNext()) {
                this.itemIterator = it2;
                this.state = 1;
                return true;
            }
        }
        this.state = 2;
        this.itemIterator = null;
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
