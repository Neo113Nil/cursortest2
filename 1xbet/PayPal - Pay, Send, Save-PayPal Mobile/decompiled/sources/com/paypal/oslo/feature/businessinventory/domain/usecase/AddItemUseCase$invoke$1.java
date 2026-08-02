package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase", f = "AddItemUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {27, 32}, m = "invoke", n = {"item", "item", "this_$iv", "it$iv", "updatedItem", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-AddItemUseCase$invoke$3"}, nl = {28, 33}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class AddItemUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddItemUseCase$invoke$1(com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase addItemUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = addItemUseCase;
    }
}
