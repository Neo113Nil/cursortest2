package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "elementAt", "(I)Ljava/lang/Object;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "removeAt", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class IndexBasedArrayIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    protected abstract T elementAt(int index);

    protected abstract void removeAt(int index);

    public IndexBasedArrayIterator(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T elementAt = elementAt(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI++;
        this.getHighSpeedVideoFpsRanges = true;
        return elementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.getHighSpeedVideoFpsRanges) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI - 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        removeAt(i);
        this.getHighSpeedVideoFpsRangesFor--;
        this.getHighSpeedVideoFpsRanges = false;
    }
}
