package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl", f = "AddressRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m = "verifyAddress", n = {"address", "raise$iv$iv$iv", "$this$verifyAddress_u24lambda_u240", "input", "graphqlQuery", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-AddressRepositoryImpl$verifyAddress$2"}, nl = {200}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class AddressRepositoryImpl$verifyAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.verifyAddress(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$verifyAddress$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl addressRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl$verifyAddress$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = addressRepositoryImpl;
    }
}
