package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformingIndexedSequence<T, R> implements kotlin.sequences.Sequence<R> {
    private final kotlin.jvm.functions.Function2<java.lang.Integer, T, R> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingIndexedSequence(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoFpsRangesFor = sequence;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<R> iterator() {
        return new kotlin.sequences.TransformingIndexedSequence$iterator$1(this);
    }
}
