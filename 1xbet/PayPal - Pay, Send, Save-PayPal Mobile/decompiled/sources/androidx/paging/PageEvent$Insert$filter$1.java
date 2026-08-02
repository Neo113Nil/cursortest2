package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", "it", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "originalIndices", "t", "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageEvent$Insert$filter$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ androidx.paging.PageEvent.Insert<T> unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.unwrapAs.filter(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageEvent$Insert$filter$1(androidx.paging.PageEvent.Insert<T> insert, kotlin.coroutines.Continuation<? super androidx.paging.PageEvent$Insert$filter$1> continuation) {
        super(continuation);
        this.unwrapAs = insert;
    }
}
