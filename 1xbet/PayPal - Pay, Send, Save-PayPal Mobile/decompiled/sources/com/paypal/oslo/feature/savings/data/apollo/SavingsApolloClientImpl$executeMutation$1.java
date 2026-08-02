package com.paypal.oslo.feature.savings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl", f = "SavingsApolloClientImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {389}, m = "executeMutation", n = {"mutation", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchPolicy", "mapper", "config", "apolloCall"}, nl = {731}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsApolloClientImpl$executeMutation$1<D extends com.apollographql.apollo.api.Mutation.Data, T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsApolloClientImpl$executeMutation$1(com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl savingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.apollo.SavingsApolloClientImpl$executeMutation$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = savingsApolloClientImpl;
    }
}
