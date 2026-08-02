package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$4$1", f = "OsloScene.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes2.dex */
final class CompositeL0L1Scene$content$1$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.BottomSheetScaffoldState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.scene.L1TabState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            if (z) {
                this.getHighSpeedVideoSizes.setExpanded(this.getHighSpeedVideoFpsRangesFor.getBottomSheetState().getCurrentValue() == androidx.compose.material3.SheetValue.Expanded);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeL0L1Scene$content$1$4$1(com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene compositeL0L1Scene, com.paypal.oslo.core.navigation.scene.L1TabState l1TabState, androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.CompositeL0L1Scene$content$1$4$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = compositeL0L1Scene;
        this.getHighSpeedVideoSizes = l1TabState;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetScaffoldState;
    }
}
