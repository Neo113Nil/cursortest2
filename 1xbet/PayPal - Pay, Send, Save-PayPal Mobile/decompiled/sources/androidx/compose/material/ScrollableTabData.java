package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\n\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "Landroidx/compose/foundation/ScrollState;", "p0", "Lkotlinx/coroutines/CoroutineScope;", "p1", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/ScrollState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "", "Camera2StreamConfigurationMap", "Ljava/lang/Integer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollableTabData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    java.lang.Integer getHighSpeedVideoSizes;
    final androidx.compose.foundation.ScrollState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    public ScrollableTabData(androidx.compose.foundation.ScrollState scrollState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.getHighResolutionOutputSizeshNQ4ISI = scrollState;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
    }
}
