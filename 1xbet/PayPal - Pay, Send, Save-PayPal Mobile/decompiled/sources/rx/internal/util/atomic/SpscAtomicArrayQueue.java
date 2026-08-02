package rx.internal.util.atomic;

/* loaded from: classes18.dex */
public final class SpscAtomicArrayQueue<E> extends rx.internal.util.atomic.AtomicReferenceArrayQueue<E> {
    private static final java.lang.Integer getHighSpeedVideoFpsRanges = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    long Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;

    @Override // rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // rx.internal.util.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        return super.iterator();
    }

    public SpscAtomicArrayQueue(int i) {
        super(i);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        this.getHighSpeedVideoFpsRangesFor = java.lang.Math.min(i / 4, getHighSpeedVideoFpsRanges.intValue());
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int i = this.mask;
        long j = this.getHighSpeedVideoSizes.get();
        int calcElementOffset = calcElementOffset(j, i);
        if (j >= this.Camera2StreamConfigurationMap) {
            long j2 = this.getHighSpeedVideoFpsRangesFor + j;
            if (lvElement(atomicReferenceArray, calcElementOffset(j2, i)) == null) {
                this.Camera2StreamConfigurationMap = j2;
            } else if (lvElement(atomicReferenceArray, calcElementOffset) != null) {
                return false;
            }
        }
        soElement(atomicReferenceArray, calcElementOffset, e);
        this.getHighSpeedVideoSizes.lazySet(j + 1);
        return true;
    }

    @Override // java.util.Queue
    public final E poll() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        int calcElementOffset = calcElementOffset(j);
        java.util.concurrent.atomic.AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        E lvElement = lvElement(atomicReferenceArray, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(atomicReferenceArray, calcElementOffset, null);
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(j + 1);
        return lvElement;
    }

    @Override // java.util.Queue
    public final E peek() {
        return lvElement(calcElementOffset(this.getHighResolutionOutputSizeshNQ4ISI.get()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.get() == this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
        while (true) {
            long j2 = this.getHighSpeedVideoSizes.get();
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
