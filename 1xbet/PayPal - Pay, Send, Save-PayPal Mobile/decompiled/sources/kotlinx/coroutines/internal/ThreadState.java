package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "Lkotlin/coroutines/CoroutineContext;", "p0", "", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Camera2StreamConfigurationMap", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ThreadState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.Object[] getHighSpeedVideoSizes;
    int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] Camera2StreamConfigurationMap;

    public ThreadState(kotlin.coroutines.CoroutineContext coroutineContext, int i) {
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.getHighSpeedVideoSizes = new java.lang.Object[i];
        this.Camera2StreamConfigurationMap = new kotlinx.coroutines.ThreadContextElement[i];
    }
}
