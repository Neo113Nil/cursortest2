package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b*\u001e\b\u0002\u0010\r\u001a\u0004\b\u0000\u0010\u000b\"\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0012\u0004\u0012\u00028\u00000\f"}, d2 = {"", "timeMillis", "delayToNanos", "(J)J", "timeNanos", "delayNanosToMillis", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/internal/Symbol;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventLoop_commonKt {
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRanges = new kotlinx.coroutines.internal.Symbol("REMOVED_TASK");
    private static final kotlinx.coroutines.internal.Symbol Camera2StreamConfigurationMap = new kotlinx.coroutines.internal.Symbol("CLOSED_EMPTY");

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j * 1000000;
    }

    public static final long delayNanosToMillis(long j) {
        return j / 1000000;
    }
}
