package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r"}, d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "p0", "p1", "", "p2", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class UIntProgressionIterator implements java.util.Iterator<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    private UIntProgressionIterator(int i, int i2, int i3) {
        this.getHighSpeedVideoSizes = i2;
        int compareUnsigned = java.lang.Integer.compareUnsigned(i, i2);
        this.getHighResolutionOutputSizeshNQ4ISI = i3 <= 0 ? compareUnsigned >= 0 : compareUnsigned <= 0;
        this.getHighSpeedVideoFpsRanges = kotlin.UInt.m23470constructorimpl(i3);
        this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ kotlin.UInt next() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == this.getHighSpeedVideoSizes) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        } else {
            this.getHighSpeedVideoFpsRangesFor = kotlin.UInt.m23470constructorimpl(this.getHighSpeedVideoFpsRanges + i);
        }
        return kotlin.UInt.m23469boximpl(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ UIntProgressionIterator(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }
}
