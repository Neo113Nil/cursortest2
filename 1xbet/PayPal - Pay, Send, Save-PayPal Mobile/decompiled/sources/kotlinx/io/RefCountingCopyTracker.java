package kotlinx.io;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\b"}, d2 = {"Lkotlinx/io/RefCountingCopyTracker;", "Lkotlinx/io/SegmentCopyTracker;", "<init>", "()V", "", "addCopy", "", "removeCopy", "()Z", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getShared", "shared", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefCountingCopyTracker extends kotlinx.io.SegmentCopyTracker {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<kotlinx.io.RefCountingCopyTracker> getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.io.RefCountingCopyTracker.class, "getHighSpeedVideoFpsRangesFor");

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile int getHighSpeedVideoSizes;

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean getShared() {
        return this.getHighSpeedVideoSizes > 0;
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final void addCopy() {
        getHighSpeedVideoFpsRanges.incrementAndGet(this);
    }

    @Override // kotlinx.io.SegmentCopyTracker
    public final boolean removeCopy() {
        if (this.getHighSpeedVideoSizes == 0) {
            return false;
        }
        int decrementAndGet = getHighSpeedVideoFpsRanges.decrementAndGet(this);
        if (decrementAndGet >= 0) {
            return true;
        }
        if (decrementAndGet != -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Shared copies count is negative: ");
            sb.append(decrementAndGet + 1);
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes = 0;
        return false;
    }
}
