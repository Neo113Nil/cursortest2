package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl", f = "SavingsRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {84, 94}, m = "getSavingsHubData", n = {"savingsAccountFeaturesCountryCode", "savingsAccountsUserId", "savingsAccountFeaturesCountryCode", "savingsAccountsUserId", "result", "this_$iv", "it$iv", "savingsHubData", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-SavingsRepositoryImpl$getSavingsHubData$2"}, nl = {88, 95}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsRepositoryImpl$getSavingsHubData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.getSavingsHubData(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsRepositoryImpl$getSavingsHubData$1(com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsHubData$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = savingsRepositoryImpl;
    }
}
