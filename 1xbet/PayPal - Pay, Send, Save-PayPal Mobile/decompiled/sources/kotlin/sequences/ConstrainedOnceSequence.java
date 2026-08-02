package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR*\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConstrainedOnceSequence<T> implements kotlin.sequences.Sequence<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<kotlin.sequences.Sequence<T>> getHighSpeedVideoFpsRangesFor;

    public ConstrainedOnceSequence(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<T> iterator() {
        kotlin.sequences.Sequence<T> andSet = this.getHighSpeedVideoFpsRangesFor.getAndSet(null);
        if (andSet == null) {
            throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}
