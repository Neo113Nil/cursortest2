package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase", f = "DeleteTaxUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {25, 26}, m = "invoke", n = {"taxId", "taxId", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-DeleteTaxUseCase$invoke$2"}, nl = {31, 27}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class DeleteTaxUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteTaxUseCase$invoke$1(com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase deleteTaxUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = deleteTaxUseCase;
    }
}
