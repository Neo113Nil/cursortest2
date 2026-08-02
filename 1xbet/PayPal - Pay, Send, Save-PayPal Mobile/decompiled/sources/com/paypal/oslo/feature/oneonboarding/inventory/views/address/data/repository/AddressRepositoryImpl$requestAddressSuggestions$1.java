package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl", f = "AddressRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {100}, m = "requestAddressSuggestions-AttygxE", n = {"query", "countryCode", "addressMatchingScope", "raise$iv$iv$iv", "$this$requestAddressSuggestions_AttygxE_u24lambda_u240", "input", "graphqlQuery", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-AddressRepositoryImpl$requestAddressSuggestions$2"}, nl = {110}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class AddressRepositoryImpl$requestAddressSuggestions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.mo16894requestAddressSuggestionsAttygxE(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$requestAddressSuggestions$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$requestAddressSuggestions$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = addressRepositoryImpl;
    }
}
