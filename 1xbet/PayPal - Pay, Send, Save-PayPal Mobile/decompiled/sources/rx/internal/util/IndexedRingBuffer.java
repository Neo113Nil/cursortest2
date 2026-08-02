package rx.internal.util;

/* loaded from: classes18.dex */
public final class IndexedRingBuffer<E> implements rx.Subscription {
    static final int Camera2StreamConfigurationMap;
    private final rx.internal.util.IndexedRingBuffer.ElementSection<E> getHighSpeedVideoSizes = new rx.internal.util.IndexedRingBuffer.ElementSection<>();
    private final rx.internal.util.IndexedRingBuffer.IndexSection getHighSpeedVideoFpsRangesFor = new rx.internal.util.IndexedRingBuffer.IndexSection();
    final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return false;
    }

    static {
        int i = rx.internal.util.PlatformDependent.isAndroid() ? 8 : 128;
        java.lang.String property = java.lang.System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i = java.lang.Integer.parseInt(property);
            } catch (java.lang.NumberFormatException e) {
                java.io.PrintStream printStream = java.lang.System.err;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to set 'rx.indexed-ring-buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
            }
        }
        Camera2StreamConfigurationMap = i;
    }

    public static <T> rx.internal.util.IndexedRingBuffer<T> getInstance() {
        return new rx.internal.util.IndexedRingBuffer<>();
    }

    public final void releaseToPool() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI.get();
        int i2 = 0;
        loop0: for (rx.internal.util.IndexedRingBuffer.ElementSection<E> elementSection = this.getHighSpeedVideoSizes; elementSection != null; elementSection = elementSection.getHighResolutionOutputSizeshNQ4ISI.get()) {
            int i3 = 0;
            while (i3 < Camera2StreamConfigurationMap) {
                if (i2 >= i) {
                    break loop0;
                }
                elementSection.getHighSpeedVideoSizes.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.set(0);
        this.getHighSpeedVideoFpsRanges.set(0);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        releaseToPool();
    }

    IndexedRingBuffer() {
    }

    public final int add(E e) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        int i = Camera2StreamConfigurationMap;
        if (highSpeedVideoFpsRanges < i) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.set(highSpeedVideoFpsRanges, e);
            return highSpeedVideoFpsRanges;
        }
        getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges).getHighSpeedVideoSizes.set(highSpeedVideoFpsRanges % i, e);
        return highSpeedVideoFpsRanges;
    }

    public final E remove(int i) {
        E andSet;
        int i2 = Camera2StreamConfigurationMap;
        if (i < i2) {
            andSet = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.getAndSet(i, null);
        } else {
            andSet = getHighSpeedVideoFpsRanges(i).getHighSpeedVideoSizes.getAndSet(i % i2, null);
        }
        synchronized (this) {
            int andIncrement = this.getHighSpeedVideoFpsRanges.getAndIncrement();
            if (andIncrement >= i2) {
                rx.internal.util.IndexedRingBuffer.IndexSection highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(andIncrement);
                highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.set(andIncrement % i2, i);
            } else {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.set(andIncrement, i);
            }
        }
        return andSet;
    }

    private rx.internal.util.IndexedRingBuffer.IndexSection getHighSpeedVideoFpsRangesFor(int i) {
        int i2 = Camera2StreamConfigurationMap;
        if (i < i2) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        int i3 = i / i2;
        rx.internal.util.IndexedRingBuffer.IndexSection indexSection = this.getHighSpeedVideoFpsRangesFor;
        for (int i4 = 0; i4 < i3; i4++) {
            indexSection = indexSection.Camera2StreamConfigurationMap();
        }
        return indexSection;
    }

    private rx.internal.util.IndexedRingBuffer.ElementSection<E> getHighSpeedVideoFpsRanges(int i) {
        int i2 = Camera2StreamConfigurationMap;
        if (i < i2) {
            return this.getHighSpeedVideoSizes;
        }
        int i3 = i / i2;
        rx.internal.util.IndexedRingBuffer.ElementSection<E> elementSection = this.getHighSpeedVideoSizes;
        for (int i4 = 0; i4 < i3; i4++) {
            elementSection = elementSection.Camera2StreamConfigurationMap();
        }
        return elementSection;
    }

    private int getHighSpeedVideoFpsRanges() {
        int andIncrement;
        synchronized (this) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI >= 0) {
                int i = Camera2StreamConfigurationMap;
                if (highResolutionOutputSizeshNQ4ISI >= i) {
                    rx.internal.util.IndexedRingBuffer.IndexSection highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                    andIncrement = highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getAndSet(highResolutionOutputSizeshNQ4ISI % i, -1);
                } else {
                    andIncrement = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor.getAndSet(highResolutionOutputSizeshNQ4ISI, -1);
                }
                if (andIncrement == this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement();
                }
            } else {
                andIncrement = this.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement();
            }
        }
        return andIncrement;
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        int i2;
        synchronized (this) {
            do {
                i = this.getHighSpeedVideoFpsRanges.get();
                if (i <= 0) {
                    return -1;
                }
                i2 = i - 1;
            } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(i, i2));
            return i2;
        }
    }

    public final int forEach(rx.functions.Func1<? super E, java.lang.Boolean> func1) {
        return forEach(func1, 0);
    }

    public final int forEach(rx.functions.Func1<? super E, java.lang.Boolean> func1, int i) {
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(func1, i, this.getHighResolutionOutputSizeshNQ4ISI.get());
        if (i > 0 && Camera2StreamConfigurationMap2 == this.getHighResolutionOutputSizeshNQ4ISI.get()) {
            return Camera2StreamConfigurationMap(func1, 0, i);
        }
        if (Camera2StreamConfigurationMap2 == this.getHighResolutionOutputSizeshNQ4ISI.get()) {
            return 0;
        }
        return Camera2StreamConfigurationMap2;
    }

    private int Camera2StreamConfigurationMap(rx.functions.Func1<? super E, java.lang.Boolean> func1, int i, int i2) {
        int i3;
        E e;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI.get();
        rx.internal.util.IndexedRingBuffer.ElementSection<E> elementSection = this.getHighSpeedVideoSizes;
        int i5 = Camera2StreamConfigurationMap;
        if (i >= i5) {
            elementSection = getHighSpeedVideoFpsRanges(i);
            i3 = i % i5;
        } else {
            i3 = i;
        }
        while (elementSection != null) {
            while (i3 < Camera2StreamConfigurationMap) {
                if (i >= i4 || i >= i2 || !((e = elementSection.getHighSpeedVideoSizes.get(i3)) == null || func1.call(e).booleanValue())) {
                    return i;
                }
                i3++;
                i++;
            }
            elementSection = elementSection.getHighResolutionOutputSizeshNQ4ISI.get();
            i3 = 0;
        }
        return i;
    }

    static final class ElementSection<E> {
        final java.util.concurrent.atomic.AtomicReferenceArray<E> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReferenceArray<>(rx.internal.util.IndexedRingBuffer.Camera2StreamConfigurationMap);
        final java.util.concurrent.atomic.AtomicReference<rx.internal.util.IndexedRingBuffer.ElementSection<E>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

        ElementSection() {
        }

        final rx.internal.util.IndexedRingBuffer.ElementSection<E> Camera2StreamConfigurationMap() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                return this.getHighResolutionOutputSizeshNQ4ISI.get();
            }
            rx.internal.util.IndexedRingBuffer.ElementSection<E> elementSection = new rx.internal.util.IndexedRingBuffer.ElementSection<>();
            return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, null, elementSection) ? elementSection : this.getHighResolutionOutputSizeshNQ4ISI.get();
        }
    }

    static class IndexSection {
        final java.util.concurrent.atomic.AtomicIntegerArray getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicIntegerArray(rx.internal.util.IndexedRingBuffer.Camera2StreamConfigurationMap);
        private final java.util.concurrent.atomic.AtomicReference<rx.internal.util.IndexedRingBuffer.IndexSection> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        IndexSection() {
        }

        final rx.internal.util.IndexedRingBuffer.IndexSection Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoSizes.get() != null) {
                return this.getHighSpeedVideoSizes.get();
            }
            rx.internal.util.IndexedRingBuffer.IndexSection indexSection = new rx.internal.util.IndexedRingBuffer.IndexSection();
            return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, indexSection) ? indexSection : this.getHighSpeedVideoSizes.get();
        }
    }
}
