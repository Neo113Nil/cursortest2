package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/sequences/EmptySequence;", "Lkotlin/sequences/Sequence;", "", "Lkotlin/sequences/DropTakeSequence;", "<init>", "()V", "", "iterator", "()Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EmptySequence implements kotlin.sequences.Sequence, kotlin.sequences.DropTakeSequence {
    public static final kotlin.sequences.EmptySequence INSTANCE = new kotlin.sequences.EmptySequence();

    private EmptySequence() {
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator iterator() {
        return kotlin.collections.EmptyIterator.INSTANCE;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final /* bridge */ /* synthetic */ kotlin.sequences.Sequence drop(int i) {
        return INSTANCE;
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final /* bridge */ /* synthetic */ kotlin.sequences.Sequence take(int i) {
        return INSTANCE;
    }
}
