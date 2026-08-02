package com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl", f = "PhoneConfirmationDataSourceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {109}, m = "confirmCode", n = {"input", "raise$iv$iv$iv", "$this$confirmCode_u24lambda_u240", "graphQLInput", "mutation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneConfirmationDataSourceImpl$confirmCode$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PhoneConfirmationDataSourceImpl$confirmCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.confirmCode(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneConfirmationDataSourceImpl$confirmCode$1(com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl phoneConfirmationDataSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.data.datasource.PhoneConfirmationDataSourceImpl$confirmCode$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = phoneConfirmationDataSourceImpl;
    }
}
