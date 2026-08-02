package coil3.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.network.DeDupeConcurrentRequestStrategy", f = "ConcurrentRequestStrategy.kt", i = {0, 0, 0, 1, 1}, l = {58, 62}, m = com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, n = {"key", "block", "request", "key", "request"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class DeDupeConcurrentRequestStrategy$apply$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ coil3.content.DeDupeConcurrentRequestStrategy getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.apply(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeDupeConcurrentRequestStrategy$apply$1(coil3.content.DeDupeConcurrentRequestStrategy deDupeConcurrentRequestStrategy, kotlin.coroutines.Continuation<? super coil3.content.DeDupeConcurrentRequestStrategy$apply$1> continuation) {
        super(continuation);
        this.getInputFormats = deDupeConcurrentRequestStrategy;
    }
}
