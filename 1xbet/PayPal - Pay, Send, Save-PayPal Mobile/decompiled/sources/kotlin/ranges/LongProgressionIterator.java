package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\r"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "nextLong", "()J", "J", "getStep", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LongProgressionIterator extends kotlin.collections.LongIterator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;
    private final long step;

    public LongProgressionIterator(long j, long j2, long j3) {
        this.step = j3;
        this.Camera2StreamConfigurationMap = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = z ? j : j2;
    }

    public final long getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.collections.LongIterator
    public final long nextLong() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        if (j == this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoFpsRanges) {
                throw new java.util.NoSuchElementException();
            }
            this.getHighSpeedVideoFpsRanges = false;
            return j;
        }
        this.getHighSpeedVideoFpsRangesFor = this.step + j;
        return j;
    }
}
