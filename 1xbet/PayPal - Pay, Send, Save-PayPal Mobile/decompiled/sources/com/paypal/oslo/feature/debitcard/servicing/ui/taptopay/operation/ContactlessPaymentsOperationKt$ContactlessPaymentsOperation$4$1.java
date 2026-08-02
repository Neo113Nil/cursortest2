package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1", f = "ContactlessPaymentsOperation.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult = (com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status = setupFlowNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed) {
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt.access$ContactlessPaymentsOperation$lambda$2(this.getHighSpeedVideoSizes).getId()));
        } else if (!(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled) && !(status instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1) create(setupFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1 contactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        contactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1.getHighSpeedVideoFpsRangesFor = obj;
        return contactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel contactlessPaymentsOperationViewModel, androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$4$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = contactlessPaymentsOperationViewModel;
        this.getHighSpeedVideoSizes = state;
    }
}
