package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public class ArrayRingBuffer<T> implements androidx.camera.core.internal.utils.RingBuffer<T> {
    private final java.util.ArrayDeque<T> Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public ArrayRingBuffer(int i) {
        this(i, null);
    }

    public ArrayRingBuffer(int i, androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> onRemoveCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = new java.util.ArrayDeque<>(i);
        this.getHighSpeedVideoFpsRangesFor = onRemoveCallback;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public void enqueue(T t) {
        T dequeue;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            dequeue = this.Camera2StreamConfigurationMap.size() >= this.getHighSpeedVideoSizes ? dequeue() : null;
            this.Camera2StreamConfigurationMap.addFirst(t);
        }
        androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<T> onRemoveCallback = this.getHighSpeedVideoFpsRangesFor;
        if (onRemoveCallback == null || dequeue == null) {
            return;
        }
        onRemoveCallback.onRemove(dequeue);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public T dequeue() {
        T removeLast;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            removeLast = this.Camera2StreamConfigurationMap.removeLast();
        }
        return removeLast;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public int getMaxCapacity() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            isEmpty = this.Camera2StreamConfigurationMap.isEmpty();
        }
        return isEmpty;
    }
}
