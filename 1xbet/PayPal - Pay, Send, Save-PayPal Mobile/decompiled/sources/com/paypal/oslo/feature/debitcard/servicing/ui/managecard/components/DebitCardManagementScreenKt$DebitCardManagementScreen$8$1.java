package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1", f = "DebitCardManagementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$DebitCardManagementScreen$8$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult debitCardActivationNavResult = (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType resultType = debitCardActivationNavResult.getResultType();
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState access$DebitCardManagementScreen$lambda$0 = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor);
        final androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$handleActivationResult(resultType, debitCardManagementViewModel, access$DebitCardManagementScreen$lambda$0, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult.this, mutableState);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult debitCardActivationNavResult, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(debitCardActivationNavResult.getToastMessage());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult debitCardActivationNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1) create(debitCardActivationNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1 debitCardManagementScreenKt$DebitCardManagementScreen$8$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        debitCardManagementScreenKt$DebitCardManagementScreen$8$1.getHighSpeedVideoSizes = obj;
        return debitCardManagementScreenKt$DebitCardManagementScreen$8$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardManagementScreenKt$DebitCardManagementScreen$8$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> state, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$8$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardManagementViewModel;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
