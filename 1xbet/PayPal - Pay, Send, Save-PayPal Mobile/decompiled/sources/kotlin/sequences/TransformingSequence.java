package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\f2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "E", "flatten$kotlin_stdlib", "(Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "Camera2StreamConfigurationMap", "Lkotlin/sequences/Sequence;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformingSequence<T, R> implements kotlin.sequences.Sequence<R> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<T, R> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sequence;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<R> iterator() {
        return new kotlin.sequences.TransformingSequence$iterator$1(this);
    }

    public final <E> kotlin.sequences.Sequence<E> flatten$kotlin_stdlib(kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterator, "");
        return new kotlin.sequences.FlatteningSequence(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, iterator);
    }
}
