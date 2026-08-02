package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "<init>", "()V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "computeNext", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setNext", "(Ljava/lang/Object;)V", com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.TestTagDone, "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private T getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    protected abstract void computeNext();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            this.getHighSpeedVideoFpsRanges = 3;
            computeNext();
            return this.getHighSpeedVideoFpsRanges == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 1) {
            this.getHighSpeedVideoFpsRanges = 0;
            return this.getHighSpeedVideoFpsRangesFor;
        }
        if (i != 2) {
            this.getHighSpeedVideoFpsRanges = 3;
            computeNext();
            if (this.getHighSpeedVideoFpsRanges == 1) {
                this.getHighSpeedVideoFpsRanges = 0;
                return this.getHighSpeedVideoFpsRangesFor;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    protected final void setNext(T value) {
        this.getHighSpeedVideoFpsRangesFor = value;
        this.getHighSpeedVideoFpsRanges = 1;
    }

    protected final void done() {
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
