package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardScreen$5$1", f = "ManageCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardScreenKt$ManageCardScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt.access$ManageCardScreen$lambda$3(this.getHighSpeedVideoFpsRanges) instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType.None)) {
            this.getHighSpeedVideoSizes.showSheet();
        } else {
            this.getHighSpeedVideoSizes.hideSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardScreen$5$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardScreenKt$ManageCardScreen$5$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.components.BottomSheetType> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardScreen$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
