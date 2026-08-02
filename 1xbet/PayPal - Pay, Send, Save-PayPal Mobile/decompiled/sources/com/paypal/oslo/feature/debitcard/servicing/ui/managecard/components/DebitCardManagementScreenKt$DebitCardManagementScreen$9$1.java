package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$9$1", f = "DebitCardManagementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$DebitCardManagementScreen$9$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI) instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) && this.getHighSpeedVideoFpsRangesFor.getAcquisitionOnArrivalAction() == com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction.PUSH_PROVISIONING_SUCCESS) {
            this.getHighSpeedVideoFpsRangesFor.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful.INSTANCE);
            this.getHighSpeedVideoFpsRangesFor.consumeOnArrivalAction();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$9$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$9$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardManagementScreenKt$DebitCardManagementScreen$9$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$9$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardManagementViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
