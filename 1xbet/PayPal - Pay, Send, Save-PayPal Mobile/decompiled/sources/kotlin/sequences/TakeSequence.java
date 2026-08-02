package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "<init>", "(Lkotlin/sequences/Sequence;I)V", "n", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(I)Lkotlin/sequences/Sequence;", "take", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/sequences/Sequence;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TakeSequence<T> implements kotlin.sequences.Sequence<T>, kotlin.sequences.DropTakeSequence<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.sequences.Sequence<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(kotlin.sequences.Sequence<? extends T> sequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sequence;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i >= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("count must be non-negative, but was ");
        sb.append(i);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final kotlin.sequences.Sequence<T> drop(int n) {
        return n >= this.getHighSpeedVideoFpsRangesFor ? kotlin.sequences.SequencesKt.emptySequence() : new kotlin.sequences.SubSequence(this.getHighResolutionOutputSizeshNQ4ISI, n, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final kotlin.sequences.Sequence<T> take(int n) {
        return n >= this.getHighSpeedVideoFpsRangesFor ? this : new kotlin.sequences.TakeSequence(this.getHighResolutionOutputSizeshNQ4ISI, n);
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<T> iterator() {
        return new kotlin.sequences.TakeSequence$iterator$1(this);
    }
}
