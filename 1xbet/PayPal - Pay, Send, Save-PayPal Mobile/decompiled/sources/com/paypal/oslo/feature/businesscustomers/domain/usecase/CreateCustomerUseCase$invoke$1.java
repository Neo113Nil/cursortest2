package com.paypal.oslo.feature.businesscustomers.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase", f = "CreateCustomerUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {27, 28}, m = "invoke", n = {"customer", "customer", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CreateCustomerUseCase$invoke$2"}, nl = {28, 31}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class CreateCustomerUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateCustomerUseCase$invoke$1(com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase createCustomerUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = createCustomerUseCase;
    }
}
