package com.paypal.oslo.feature.home.ui.components.fannedcollection.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1", f = "FannedCarouselContainer.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, nl = {146}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.hapticfeedback.HapticFeedback getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6717getLongPress5zf0vsI());
        }
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1(boolean z, androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.components.fannedcollection.composable.FannedCarouselContainerKt$FannedCarouselContainer$1$1$2$1$4$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = hapticFeedback;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
