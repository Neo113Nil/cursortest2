package io.reactivex.internal.queue;

/* loaded from: classes3.dex */
public final class SpscLinkedArrayQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    static final int getHighSpeedVideoFpsRanges = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final java.lang.Object getInputFormats = new java.lang.Object();
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> Camera2StreamConfigurationMap;
    java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;
    final int getHighSpeedVideoSizesFor;
    long getInputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicLong getOutputFormats;
    int getOutputMinFrameDuration;

    public SpscLinkedArrayQueue(int i) {
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.getOutputFormats = atomicLong;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();
        int roundToPowerOfTwo = io.reactivex.internal.util.Pow2.roundToPowerOfTwo(java.lang.Math.max(8, i));
        int i2 = roundToPowerOfTwo - 1;
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new java.util.concurrent.atomic.AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.Camera2StreamConfigurationMap = atomicReferenceArray;
        this.getHighSpeedVideoSizesFor = i2;
        this.getOutputMinFrameDuration = java.lang.Math.min(roundToPowerOfTwo / 4, getHighSpeedVideoFpsRanges);
        this.getHighResolutionOutputSizeshNQ4ISI = atomicReferenceArray;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getInputSizeshNQ4ISI = roundToPowerOfTwo - 2;
        atomicLong.lazySet(0L);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t) {
        if (t == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.Camera2StreamConfigurationMap;
        long j = this.getOutputFormats.get();
        int i = this.getHighSpeedVideoSizesFor;
        int i2 = ((int) j) & i;
        if (j >= this.getInputSizeshNQ4ISI) {
            long j2 = this.getOutputMinFrameDuration + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.getInputSizeshNQ4ISI = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.getOutputFormats.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.getOutputFormats.lazySet(j3);
                return true;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
            this.Camera2StreamConfigurationMap = atomicReferenceArray2;
            this.getInputSizeshNQ4ISI = (i + j) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, getInputFormats);
            this.getOutputFormats.lazySet(j3);
            return true;
        }
        atomicReferenceArray.lazySet(i2, t);
        this.getOutputFormats.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public final T poll() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = this.getHighSpeedVideoSizes.get();
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == getInputFormats;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            this.getHighSpeedVideoSizes.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.getHighResolutionOutputSizeshNQ4ISI = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            this.getHighSpeedVideoSizes.lazySet(j + 1);
        }
        return t2;
    }

    public final T peek() {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getHighResolutionOutputSizeshNQ4ISI;
        long j = this.getHighSpeedVideoSizes.get();
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        if (t != getInputFormats) {
            return t;
        }
        int i3 = i + 1;
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (java.util.concurrent.atomic.AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.getHighResolutionOutputSizeshNQ4ISI = atomicReferenceArray2;
        return (T) atomicReferenceArray2.get(i2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t, T t2) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.Camera2StreamConfigurationMap;
        long j = this.getOutputFormats.get();
        int i = this.getHighSpeedVideoSizesFor;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) != null) {
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(atomicReferenceArray.length());
            this.Camera2StreamConfigurationMap = atomicReferenceArray2;
            int i2 = ((int) j) & i;
            atomicReferenceArray2.lazySet(i2 + 1, t2);
            atomicReferenceArray2.lazySet(i2, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, getInputFormats);
            this.getOutputFormats.lazySet(j2);
        } else {
            int i3 = ((int) j) & i;
            atomicReferenceArray.lazySet(i3 + 1, t2);
            atomicReferenceArray.lazySet(i3, t);
            this.getOutputFormats.lazySet(j2);
        }
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.getOutputFormats.get() == this.getHighSpeedVideoSizes.get();
    }

    public final int size() {
        long j = this.getHighSpeedVideoSizes.get();
        while (true) {
            long j2 = this.getOutputFormats.get();
            long j3 = this.getHighSpeedVideoSizes.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
