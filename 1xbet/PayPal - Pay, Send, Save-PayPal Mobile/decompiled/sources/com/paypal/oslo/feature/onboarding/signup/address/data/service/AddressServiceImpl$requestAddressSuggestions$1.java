package com.paypal.oslo.feature.onboarding.signup.address.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl", f = "AddressServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {83}, m = "requestAddressSuggestions", n = {"query", "countryCode", "raise$iv$iv$iv", "$this$requestAddressSuggestions_u24lambda_u240", "input", "graphqlQuery", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-AddressServiceImpl$requestAddressSuggestions$2"}, nl = {92}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class AddressServiceImpl$requestAddressSuggestions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.requestAddressSuggestions(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressServiceImpl$requestAddressSuggestions$1(com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl addressServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.address.data.service.AddressServiceImpl$requestAddressSuggestions$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = addressServiceImpl;
    }
}
