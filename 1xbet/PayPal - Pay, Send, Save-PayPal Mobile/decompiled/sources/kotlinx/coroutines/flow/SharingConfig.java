package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015"}, d2 = {"Lkotlinx/coroutines/flow/SharingConfig;", "T", "", "Lkotlinx/coroutines/flow/Flow;", "p0", "", "p1", "Lkotlinx/coroutines/channels/BufferOverflow;", "p2", "Lkotlin/coroutines/CoroutineContext;", "p3", "<init>", "(Lkotlinx/coroutines/flow/Flow;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/coroutines/CoroutineContext;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/BufferOverflow;", "Camera2StreamConfigurationMap", "Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SharingConfig<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public final kotlinx.coroutines.channels.BufferOverflow Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public final kotlinx.coroutines.flow.Flow<T> getHighResolutionOutputSizeshNQ4ISI;
    public final int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public SharingConfig(kotlinx.coroutines.flow.Flow<? extends T> flow, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = bufferOverflow;
        this.getHighSpeedVideoFpsRanges = coroutineContext;
    }
}
