package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl", f = "DepositSwitchDDRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {130}, m = "linkAccountToPayrollProvider", n = {"directDepositIntegrationId", "bankAccountNumber", "routingNumber", "bankAccountOptional", "routingNumberOptional", "input", "mutation"}, nl = {131}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes5.dex */
final class DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.linkAccountToPayrollProvider(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1(com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl depositSwitchDDRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.data.repository.DepositSwitchDDRepositoryImpl$linkAccountToPayrollProvider$1> continuation) {
        super(continuation);
        this.getInputFormats = depositSwitchDDRepositoryImpl;
    }
}
