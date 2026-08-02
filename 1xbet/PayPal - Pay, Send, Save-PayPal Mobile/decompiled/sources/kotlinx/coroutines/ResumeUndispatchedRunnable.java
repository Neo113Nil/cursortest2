package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "Lkotlinx/coroutines/CoroutineDispatcher;", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "", "p1", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CancellableContinuation;)V", "run", "()V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ResumeUndispatchedRunnable implements java.lang.Runnable {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        this.getHighSpeedVideoFpsRanges = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.getHighSpeedVideoFpsRanges.resumeUndispatched(this.Camera2StreamConfigurationMap, kotlin.Unit.INSTANCE);
    }
}
