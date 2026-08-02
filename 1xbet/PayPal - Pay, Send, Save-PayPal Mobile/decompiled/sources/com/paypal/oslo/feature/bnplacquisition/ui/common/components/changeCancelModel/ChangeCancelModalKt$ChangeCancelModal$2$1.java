package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1", f = "ChangeCancelModal.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, nl = {144}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ChangeCancelModalKt$ChangeCancelModal$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighResolutionOutputSizeshNQ4ISI.getVisible()) {
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect> uiEffect = this.Camera2StreamConfigurationMap.getUiEffect();
                final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
                if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        kotlin.jvm.functions.Function0<kotlin.Unit> onButtonClick;
                        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect changeCancelUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect) obj2;
                        if (kotlin.jvm.internal.Intrinsics.areEqual(changeCancelUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.ExecutePrimaryAction.INSTANCE)) {
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig.this.getPrimaryAction().getOnButtonClick().invoke();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(changeCancelUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.ExecuteSecondaryAction.INSTANCE)) {
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction secondaryAction = com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig.this.getSecondaryAction();
                            if (secondaryAction != null && (onButtonClick = secondaryAction.getOnButtonClick()) != null) {
                                onButtonClick.invoke();
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(changeCancelUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.DismissModal.INSTANCE)) {
                            bottomSheetController.hideSheet();
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(changeCancelUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiEffect.DismissModalApiSuccess.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            bottomSheetController.hideSheet();
                            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig.this.getOnCancelLoanSuccess().invoke();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeCancelModalKt$ChangeCancelModal$2$1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.Camera2StreamConfigurationMap = changeCancelViewModel;
        this.getHighSpeedVideoFpsRangesFor = changeCancelConfig;
    }
}
