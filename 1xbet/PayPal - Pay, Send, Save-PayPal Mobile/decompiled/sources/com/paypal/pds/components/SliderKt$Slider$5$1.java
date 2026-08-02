package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "startPoint", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.SliderKt$Slider$5$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class SliderKt$Slider$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.SliderDraggableState getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.startDragAt(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        long m5762unboximpl = offset.m5762unboximpl();
        com.paypal.pds.components.SliderKt$Slider$5$1 sliderKt$Slider$5$1 = new com.paypal.pds.components.SliderKt$Slider$5$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        sliderKt$Slider$5$1.getHighResolutionOutputSizeshNQ4ISI = m5762unboximpl;
        return sliderKt$Slider$5$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$5$1(com.paypal.pds.components.SliderDraggableState sliderDraggableState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.SliderKt$Slider$5$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = sliderDraggableState;
    }
}
