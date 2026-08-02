package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1", f = "DeactivateContactlessBottomSheet.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {106}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect> uiEffect = this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect();
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect deactivateContactlessSheetEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(deactivateContactlessSheetEffect, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.DismissSheet.INSTANCE)) {
                        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled.INSTANCE);
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(deactivateContactlessSheetEffect, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.mvi.DeactivateContactlessSheetEffect.ShowDeactivationSuccessToast.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Success.INSTANCE);
                    }
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessSheetViewModel deactivateContactlessSheetViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessBottomSheetKt$DeactivateContactlessBottomSheet$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = deactivateContactlessSheetViewModel;
        this.getHighSpeedVideoSizes = function1;
    }
}
