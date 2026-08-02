package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IndexingSequence<T> implements kotlin.sequences.Sequence<kotlin.collections.IndexedValue<? extends T>> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        this.Camera2StreamConfigurationMap = sequence;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<kotlin.collections.IndexedValue<T>> iterator() {
        return new kotlin.sequences.IndexingSequence$iterator$1(this);
    }
}
