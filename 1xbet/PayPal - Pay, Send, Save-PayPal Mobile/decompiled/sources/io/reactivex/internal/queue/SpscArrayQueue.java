package io.reactivex.internal.queue;

/* loaded from: classes3.dex */
public final class SpscArrayQueue<E> extends java.util.concurrent.atomic.AtomicReferenceArray<E> implements io.reactivex.internal.fuseable.SimplePlainQueue<E> {
    private static final java.lang.Integer getOutputMinFrameDuration = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final int Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public SpscArrayQueue(int i) {
        super(io.reactivex.internal.util.Pow2.roundToPowerOfTwo(i));
        this.Camera2StreamConfigurationMap = length() - 1;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();
        this.getHighSpeedVideoSizes = java.lang.Math.min(i / 4, getOutputMinFrameDuration.intValue());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(E e) {
        if (e == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        int i = this.Camera2StreamConfigurationMap;
        long j = this.getHighSpeedVideoFpsRanges.get();
        int i2 = ((int) j) & i;
        if (j >= this.getHighResolutionOutputSizeshNQ4ISI) {
            long j2 = this.getHighSpeedVideoSizes + j;
            if (get(i & ((int) j2)) == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        this.getHighSpeedVideoFpsRanges.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(E e, E e2) {
        return offer(e) && offer(e2);
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public final E poll() {
        long j = this.getHighSpeedVideoFpsRangesFor.get();
        int i = ((int) j) & this.Camera2StreamConfigurationMap;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.getHighSpeedVideoFpsRangesFor.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges.get() == this.getHighSpeedVideoFpsRangesFor.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
