package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\r"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "p0", "p1", "", "p2", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ULongProgressionIterator implements java.util.Iterator<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    private ULongProgressionIterator(long j, long j2, long j3) {
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoSizes = j3 <= 0 ? java.lang.Long.compareUnsigned(j, j2) >= 0 : java.lang.Long.compareUnsigned(j, j2) <= 0;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.ULong.m23494constructorimpl(j3);
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ kotlin.ULong next() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        if (j == this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoSizes) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighSpeedVideoSizes = false;
        } else {
            this.getHighSpeedVideoFpsRangesFor = kotlin.ULong.m23494constructorimpl(this.getHighResolutionOutputSizeshNQ4ISI + j);
        }
        return kotlin.ULong.m23493boximpl(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ ULongProgressionIterator(long j, long j2, long j3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
