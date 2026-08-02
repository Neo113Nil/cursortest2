package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall", f = "FetchDepositOptionsCall.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {111}, m = "execute", n = {"amount", "currencyCode", "speed", "raise$iv$iv$iv", "$this$execute_u24lambda_u240", "productFlowIdentifier", "query", "apolloCall", "config", "input", "isLowBalance", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FetchDepositOptionsCall$execute$2"}, nl = {134}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class FetchDepositOptionsCall$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.toString = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.execute(null, null, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchDepositOptionsCall$execute$1(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall$execute$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = fetchDepositOptionsCall;
    }
}
