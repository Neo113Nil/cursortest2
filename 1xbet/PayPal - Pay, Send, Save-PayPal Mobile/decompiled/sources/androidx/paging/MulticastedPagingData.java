package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/paging/MulticastedPagingData;", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "p0", "Landroidx/paging/PagingData;", "p1", "Landroidx/paging/ActiveFlowTracker;", "p2", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagingData;Landroidx/paging/ActiveFlowTracker;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/PagingData;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/paging/ActiveFlowTracker;", "()Landroidx/paging/ActiveFlowTracker;", "Landroidx/paging/CachedPageEventFlow;", "getHighSpeedVideoSizes", "Landroidx/paging/CachedPageEventFlow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class MulticastedPagingData<T> {
    private final androidx.paging.ActiveFlowTracker Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final androidx.paging.PagingData<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.paging.CachedPageEventFlow<T> getHighSpeedVideoFpsRanges;

    public MulticastedPagingData(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.paging.PagingData<T> pagingData, androidx.paging.ActiveFlowTracker activeFlowTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = pagingData;
        this.Camera2StreamConfigurationMap = activeFlowTracker;
        androidx.paging.CachedPageEventFlow<T> cachedPageEventFlow = new androidx.paging.CachedPageEventFlow<>(pagingData.getFlow$paging_common(), coroutineScope);
        if (activeFlowTracker != null) {
            activeFlowTracker.onNewCachedEventFlow(cachedPageEventFlow);
        }
        this.getHighSpeedVideoFpsRanges = cachedPageEventFlow;
    }

    /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
    public final androidx.paging.ActiveFlowTracker getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }
}
