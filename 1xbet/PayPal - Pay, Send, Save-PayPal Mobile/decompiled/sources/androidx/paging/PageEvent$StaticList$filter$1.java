package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", i = {0, 0, 0}, l = {72}, m = com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, n = {"predicate", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$1", "L$3"}, v = 1)
/* loaded from: classes7.dex */
final class PageEvent$StaticList$filter$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ androidx.paging.PageEvent.StaticList<T> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.filter(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$StaticList$filter$1(androidx.paging.PageEvent.StaticList<T> staticList, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent$StaticList$filter$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = staticList;
    }
}
