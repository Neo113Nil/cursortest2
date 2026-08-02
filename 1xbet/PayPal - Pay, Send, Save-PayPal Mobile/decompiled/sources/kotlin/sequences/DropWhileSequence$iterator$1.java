package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/sequences/DropWhileSequence$iterator$1;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "dropState", com.visa.cbp.getEncExpo.warmup, "getDropState", "()I", "setDropState", "(I)V", "nextItem", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropWhileSequence$iterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    private int dropState;
    final /* synthetic */ kotlin.sequences.DropWhileSequence<T> getHighSpeedVideoFpsRanges;
    private final java.util.Iterator<T> iterator;
    private T nextItem;

    DropWhileSequence$iterator$1(kotlin.sequences.DropWhileSequence<T> dropWhileSequence) {
        kotlin.sequences.Sequence sequence;
        this.getHighSpeedVideoFpsRanges = dropWhileSequence;
        sequence = ((kotlin.sequences.DropWhileSequence) dropWhileSequence).getHighSpeedVideoFpsRanges;
        this.iterator = sequence.iterator();
        this.dropState = -1;
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getDropState() {
        return this.dropState;
    }

    public final void setDropState(int i) {
        this.dropState = i;
    }

    public final T getNextItem() {
        return this.nextItem;
    }

    public final void setNextItem(T t) {
        this.nextItem = t;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        kotlin.jvm.functions.Function1 function1;
        while (this.iterator.hasNext()) {
            T next = this.iterator.next();
            function1 = ((kotlin.sequences.DropWhileSequence) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
            if (!((java.lang.Boolean) function1.invoke(next)).booleanValue()) {
                this.nextItem = next;
                this.dropState = 1;
                return;
            }
        }
        this.dropState = 0;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.dropState == -1) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        if (this.dropState == 1) {
            T t = this.nextItem;
            this.nextItem = null;
            this.dropState = 0;
            return t;
        }
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.dropState == -1) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
        return this.dropState == 1 || this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
