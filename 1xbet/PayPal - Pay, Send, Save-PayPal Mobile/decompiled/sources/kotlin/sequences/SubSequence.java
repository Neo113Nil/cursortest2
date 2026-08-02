package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/Sequence;II)V", "n", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.DROP, "(I)Lkotlin/sequences/Sequence;", "take", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoSizes", "Lkotlin/sequences/Sequence;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SubSequence<T> implements kotlin.sequences.Sequence<T>, kotlin.sequences.DropTakeSequence<T> {
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.sequences.Sequence<T> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(kotlin.sequences.Sequence<? extends T> sequence, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        this.getHighSpeedVideoSizes = sequence;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("startIndex should be non-negative, but is ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("endIndex should be non-negative, but is ".concat(java.lang.String.valueOf(i2)).toString());
        }
        if (i2 >= i) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex should be not less than startIndex, but was ");
        sb.append(i2);
        sb.append(" < ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<T> iterator() {
        return new kotlin.sequences.SubSequence$iterator$1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final kotlin.sequences.Sequence<T> drop(int n) {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return n >= i - i2 ? kotlin.sequences.SequencesKt.emptySequence() : new kotlin.sequences.SubSequence(this.getHighSpeedVideoSizes, i2 + n, i);
    }

    @Override // kotlin.sequences.DropTakeSequence
    public final kotlin.sequences.Sequence<T> take(int n) {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return n >= i - i2 ? this : new kotlin.sequences.SubSequence(this.getHighSpeedVideoSizes, i2, n + i2);
    }
}
