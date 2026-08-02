package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentHalfSheetNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1", f = "ChooseDefaultPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult chooseDefaultPaymentHalfSheetNavResult = (com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult.Status status = chooseDefaultPaymentHalfSheetNavResult.getStatus();
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult.Status.SetDefault.INSTANCE)) {
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoFpsRanges.setPaypalAsDefaultPaymentApp(this.getHighSpeedVideoSizes));
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult.Status.KeepManual.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult.Skipped.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentHalfSheetNavResult chooseDefaultPaymentHalfSheetNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1) create(chooseDefaultPaymentHalfSheetNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1 chooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1 = new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        chooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1.Camera2StreamConfigurationMap = obj;
        return chooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel chooseDefaultPaymentViewModel, androidx.view.compose.ManagedActivityResultLauncher<android.content.Intent, androidx.view.result.ActivityResult> managedActivityResultLauncher, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseDefaultPaymentAppResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentScreenKt$ChooseDefaultPaymentScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = chooseDefaultPaymentViewModel;
        this.getHighSpeedVideoSizes = managedActivityResultLauncher;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
