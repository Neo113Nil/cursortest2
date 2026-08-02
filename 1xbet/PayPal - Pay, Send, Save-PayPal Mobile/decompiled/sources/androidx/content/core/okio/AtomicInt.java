package androidx.content.core.okio;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/core/okio/AtomicInt;", "", "", "initialValue", "<init>", "(I)V", "getAndIncrement", "()I", "decrementAndGet", "get", "incrementAndGet", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicInt {
    private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

    public AtomicInt(int i) {
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger(i);
    }

    public final int getAndIncrement() {
        return this.getHighSpeedVideoSizes.getAndIncrement();
    }

    public final int decrementAndGet() {
        return this.getHighSpeedVideoSizes.decrementAndGet();
    }

    public final int get() {
        return this.getHighSpeedVideoSizes.get();
    }

    public final int incrementAndGet() {
        return this.getHighSpeedVideoSizes.incrementAndGet();
    }
}
