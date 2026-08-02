package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall", f = "DisableAutoReloadCall.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {65}, m = "execute", n = {"scheduleType", "raise$iv$iv$iv", "$this$execute_u24lambda_u240", "mutation", "apolloCall", "config", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-DisableAutoReloadCall$execute$2"}, nl = {100}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class DisableAutoReloadCall$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisableAutoReloadCall$execute$1(com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall$execute$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = disableAutoReloadCall;
    }
}
