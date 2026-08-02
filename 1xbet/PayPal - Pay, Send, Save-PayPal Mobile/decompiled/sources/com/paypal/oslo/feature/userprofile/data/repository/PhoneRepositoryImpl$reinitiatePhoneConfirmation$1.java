package com.paypal.oslo.feature.userprofile.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl", f = "PhoneRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m = "reinitiatePhoneConfirmation", n = {"phoneId", "authId", "challengeId", "raise$iv$iv$iv", "$this$reinitiatePhoneConfirmation_u24lambda_u240", "input", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PhoneRepositoryImpl$reinitiatePhoneConfirmation$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class PhoneRepositoryImpl$reinitiatePhoneConfirmation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.reinitiatePhoneConfirmation(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneRepositoryImpl$reinitiatePhoneConfirmation$1(com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl phoneRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl$reinitiatePhoneConfirmation$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = phoneRepositoryImpl;
    }
}
