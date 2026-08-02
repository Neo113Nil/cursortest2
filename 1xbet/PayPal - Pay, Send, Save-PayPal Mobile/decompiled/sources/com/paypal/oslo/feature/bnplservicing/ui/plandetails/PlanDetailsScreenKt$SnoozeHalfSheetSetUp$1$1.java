package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1", f = "PlanDetailsScreen.kt", i = {}, l = {486}, m = "invokeSuspend", n = {}, nl = {494}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect> uiEffect$bnpl_servicing_prodRelease = this.getHighSpeedVideoSizes.getUiEffect$bnpl_servicing_prodRelease();
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (uiEffect$bnpl_servicing_prodRelease.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    if (!(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect) obj2) instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeUiEffect.SnoozeConfirmed)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.pds.components.BottomSheetController.this.hideSheet();
                    function0.invoke();
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeViewModel snoozeViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$SnoozeHalfSheetSetUp$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = snoozeViewModel;
        this.Camera2StreamConfigurationMap = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
