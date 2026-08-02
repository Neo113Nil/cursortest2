package kotlin.concurrent.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a#\u0010\u0004\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0004\u0010\u000b\u001a/\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u000e\u001a+\u0010\u0004\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0011\u001a+\u0010\u0004\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\u0013\u001a7\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0015"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "", "expected", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "compareAndExchange", "(Ljava/util/concurrent/atomic/AtomicInteger;II)I", "Ljava/util/concurrent/atomic/AtomicLong;", "", "(Ljava/util/concurrent/atomic/AtomicLong;JJ)J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "(Ljava/util/concurrent/atomic/AtomicBoolean;ZZ)Z", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;III)I", "Ljava/util/concurrent/atomic/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;IJJ)J", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AtomicIntrinsicsKt {
    public static final int compareAndExchange(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
        do {
            int i3 = atomicInteger.get();
            if (i != i3) {
                return i3;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static final long compareAndExchange(java.util.concurrent.atomic.AtomicLong atomicLong, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLong, "");
        do {
            long j3 = atomicLong.get();
            if (j != j3) {
                return j3;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        return j;
    }

    public static final boolean compareAndExchange(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "");
        do {
            boolean z3 = atomicBoolean.get();
            if (z != z3) {
                return z3;
            }
        } while (!atomicBoolean.compareAndSet(z, z2));
        return z;
    }

    public static final <T> T compareAndExchange(java.util.concurrent.atomic.AtomicReference<T> atomicReference, T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        do {
            T t3 = atomicReference.get();
            if (t != t3) {
                return t3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, t, t2));
        return t;
    }

    public static final int compareAndExchange(java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicIntegerArray, "");
        do {
            int i4 = atomicIntegerArray.get(i);
            if (i2 != i4) {
                return i4;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i2, i3));
        return i2;
    }

    public static final long compareAndExchange(java.util.concurrent.atomic.AtomicLongArray atomicLongArray, int i, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicLongArray, "");
        do {
            long j3 = atomicLongArray.get(i);
            if (j != j3) {
                return j3;
            }
        } while (!atomicLongArray.compareAndSet(i, j, j2));
        return j;
    }

    public static final <T> T compareAndExchange(java.util.concurrent.atomic.AtomicReferenceArray<T> atomicReferenceArray, int i, T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReferenceArray, "");
        do {
            T t3 = atomicReferenceArray.get(i);
            if (t != t3) {
                return t3;
            }
        } while (!com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, t, t2));
        return t;
    }
}
