package com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$StatusWidgetContent$2$1$1", f = "StatusWidget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class StatusWidgetKt$StatusWidgetContent$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.airbnb.lottie.compose.LottieAnimationState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float floatValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap.getThird().intValue() != Integer.MAX_VALUE) {
            floatValue = this.getHighSpeedVideoFpsRangesFor.getValue().floatValue();
            if (floatValue == 1.0f) {
                this.getHighSpeedVideoSizes.invoke();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$StatusWidgetContent$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$StatusWidgetContent$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatusWidgetKt$StatusWidgetContent$2$1$1(kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> triple, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.airbnb.lottie.compose.LottieAnimationState lottieAnimationState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$StatusWidgetContent$2$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = triple;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRangesFor = lottieAnimationState;
    }
}
