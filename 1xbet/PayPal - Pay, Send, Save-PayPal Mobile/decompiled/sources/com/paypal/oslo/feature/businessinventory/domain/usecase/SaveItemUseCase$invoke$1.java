package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase", f = "SaveItemUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {27, 29}, m = "invoke", n = {"item", "item", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-SaveItemUseCase$invoke$2"}, nl = {28, 30}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class SaveItemUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveItemUseCase$invoke$1(com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase saveItemUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = saveItemUseCase;
    }
}
