package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "Lkotlin/Function2;", "transform", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "Camera2StreamConfigurationMap", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MergingSequence<T1, T2, V> implements kotlin.sequences.Sequence<V> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T1> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<T1, T2, V> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T2> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(kotlin.sequences.Sequence<? extends T1> sequence, kotlin.sequences.Sequence<? extends T2> sequence2, kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends V> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoSizes = sequence;
        this.getHighSpeedVideoFpsRanges = sequence2;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<V> iterator() {
        return new kotlin.sequences.MergingSequence$iterator$1(this);
    }
}
