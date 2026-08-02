package com.paypal.oslo.feature.identity.checkoutdataprovider.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl", f = "IdentityCheckoutDataProviderImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {71}, m = "getCheckoutData", n = {"authenticationContext", "raise$iv$iv$iv", "$this$getCheckoutData_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-IdentityCheckoutDataProviderImpl$getCheckoutData$2"}, nl = {75}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class IdentityCheckoutDataProviderImpl$getCheckoutData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getCheckoutData(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityCheckoutDataProviderImpl$getCheckoutData$1(com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl identityCheckoutDataProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.checkoutdataprovider.data.IdentityCheckoutDataProviderImpl$getCheckoutData$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = identityCheckoutDataProviderImpl;
    }
}
