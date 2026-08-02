package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase", f = "UpdateTaxUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {29, 30}, m = "invoke", n = {"tax", "tax", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UpdateTaxUseCase$invoke$2"}, nl = {35, 31}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class UpdateTaxUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateTaxUseCase$invoke$1(com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase updateTaxUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = updateTaxUseCase;
    }
}
