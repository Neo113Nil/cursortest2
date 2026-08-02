package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlin/sequences/SubSequence$iterator$1;", "", "", "getHighSpeedVideoFpsRanges", "()V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", com.daon.sdk.face.license.License.FEATURE_POSITION, com.visa.cbp.getEncExpo.warmup, "getPosition", "()I", "setPosition", "(I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SubSequence$iterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.sequences.SubSequence<T> getHighSpeedVideoFpsRangesFor;
    private final java.util.Iterator<T> iterator;
    private int position;

    SubSequence$iterator$1(kotlin.sequences.SubSequence<T> subSequence) {
        kotlin.sequences.Sequence sequence;
        this.getHighSpeedVideoFpsRangesFor = subSequence;
        sequence = ((kotlin.sequences.SubSequence) subSequence).getHighSpeedVideoSizes;
        this.iterator = sequence.iterator();
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges() {
        int i;
        while (r0 < i && this.iterator.hasNext()) {
            this.iterator.next();
            this.position++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        getHighSpeedVideoFpsRanges();
        int i2 = this.position;
        i = ((kotlin.sequences.SubSequence) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
        return i2 < i && this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        int i;
        getHighSpeedVideoFpsRanges();
        int i2 = this.position;
        i = ((kotlin.sequences.SubSequence) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRanges;
        if (i2 >= i) {
            throw new java.util.NoSuchElementException();
        }
        this.position++;
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
