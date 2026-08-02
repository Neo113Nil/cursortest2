package androidx.core.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.content.ContextKt", f = "Context.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m = "receiveBroadcasts", n = {"$this$receiveBroadcasts", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "broadcastPermission", "scheduler", "onReceive", "receiver", "flags"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 1)
/* loaded from: classes7.dex */
final class ContextKt$receiveBroadcasts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return androidx.core.content.ContextKt.receiveBroadcasts(null, null, 0, null, null, null, this);
    }

    ContextKt$receiveBroadcasts$1(kotlin.coroutines.Continuation<? super androidx.core.content.ContextKt$receiveBroadcasts$1> continuation) {
        super(continuation);
    }
}
