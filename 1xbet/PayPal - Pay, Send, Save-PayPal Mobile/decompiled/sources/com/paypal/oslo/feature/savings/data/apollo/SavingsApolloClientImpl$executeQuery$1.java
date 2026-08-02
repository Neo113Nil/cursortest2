package com.paypal.oslo.feature.savings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl", f = "SavingsApolloClientImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {365}, m = "executeQuery", n = {"query", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchPolicy", "authenticationState", "extraHeaders", "mapper", "config", "apolloCall"}, nl = {731}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsApolloClientImpl$executeQuery$1<D extends com.apollographql.apollo.api.Query.Data, T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(null, null, null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsApolloClientImpl$executeQuery$1(com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl savingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl$executeQuery$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = savingsApolloClientImpl;
    }
}
