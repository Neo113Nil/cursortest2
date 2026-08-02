package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/concurrent/atomic/AtomicInteger;", "", "bits", "setBitsOrZero", "(Ljava/util/concurrent/atomic/AtomicInteger;I)I"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class _AtomicKt {
    public static final int setBitsOrZero(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
        do {
            i2 = atomicInteger.get();
            if ((i2 & i) != 0) {
                return 0;
            }
            i3 = i2 | i;
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i3;
    }
}
