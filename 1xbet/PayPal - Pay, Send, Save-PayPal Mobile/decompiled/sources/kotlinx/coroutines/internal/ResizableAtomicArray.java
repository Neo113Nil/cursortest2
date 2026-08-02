package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/internal/ResizableAtomicArray;", "T", "", "", "initialLength", "<init>", "(I)V", "currentLength", "()I", "index", "get", "(I)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setSynchronized", "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResizableAtomicArray<T> {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<T> array;

    public ResizableAtomicArray(int i) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
    }

    public final int currentLength() {
        return this.array.length();
    }

    public final T get(int index) {
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (index < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(index);
        }
        return null;
    }

    public final void setSynchronized(int index, T value) {
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (index < length) {
            atomicReferenceArray.set(index, value);
            return;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(kotlin.ranges.RangesKt.coerceAtLeast(index + 1, length * 2));
        for (int i = 0; i < length; i++) {
            atomicReferenceArray2.set(i, atomicReferenceArray.get(i));
        }
        atomicReferenceArray2.set(index, value);
        this.array = atomicReferenceArray2;
    }
}
