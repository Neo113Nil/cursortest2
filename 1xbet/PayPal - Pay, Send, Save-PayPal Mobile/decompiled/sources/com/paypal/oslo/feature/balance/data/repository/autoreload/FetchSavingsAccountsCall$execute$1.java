package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall", f = "FetchSavingsAccountsCall.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {40}, m = "execute", n = {"raise$iv$iv$iv", "$this$execute_u24lambda_u240", "query", "apolloCall", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FetchSavingsAccountsCall$execute$2"}, nl = {65}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class FetchSavingsAccountsCall$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.execute(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchSavingsAccountsCall$execute$1(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall$execute$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = fetchSavingsAccountsCall;
    }
}
