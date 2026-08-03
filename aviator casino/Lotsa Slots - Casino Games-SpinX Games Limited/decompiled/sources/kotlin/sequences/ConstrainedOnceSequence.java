package kotlin.sequences;

/* compiled from: SequencesJVM.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R(\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \b*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/ConstrainedOnceSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "sequenceRef", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConstrainedOnceSequence<T> implements kotlin.sequences.Sequence<T> {
    private final java.util.concurrent.atomic.AtomicReference<kotlin.sequences.Sequence<T>> sequenceRef;

    public ConstrainedOnceSequence(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequenceRef = new java.util.concurrent.atomic.AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        kotlin.sequences.Sequence<T> andSet = this.sequenceRef.getAndSet(null);
        if (andSet == null) {
            throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.iterator();
    }
}
