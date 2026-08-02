package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase", f = "AddTaxUseCase.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {26, 27}, m = "invoke", n = {"label", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "label", "this_$iv", "it$iv", "it", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-AddTaxUseCase$invoke$2"}, nl = {32, 28}, s = {"L$0", "D$0", "L$0", "L$1", "L$3", "L$4", "D$0", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class AddTaxUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, 0.0d, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddTaxUseCase$invoke$1(com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase addTaxUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = addTaxUseCase;
    }
}
