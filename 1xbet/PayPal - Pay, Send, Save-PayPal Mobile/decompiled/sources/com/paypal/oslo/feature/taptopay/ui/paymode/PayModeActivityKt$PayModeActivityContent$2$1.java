package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1", f = "PayModeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivityKt$PayModeActivityContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult bnplAcquisitionNavResult = (com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status = bnplAcquisitionNavResult.getStatus();
        if (status instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeActivity: BNPL acquisition completed, navigating to setup flow", null, null, 6, null);
            final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContentKt.toSetupCardInfo(((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed) status).getCard());
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (status instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeActivity: BNPL acquisition cancelled", null, null, 6, null);
        } else if (status instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeActivity: BNPL acquisition declined", null, null, 6, null);
        } else {
            if (!(status instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "PayModeActivity: BNPL acquisition error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bnpl_error_message", ((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error) status).getMessage())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination(setupCardInfo, com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint.PL2GO, (java.lang.String) null, (java.lang.String) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult bnplAcquisitionNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1) create(bnplAcquisitionNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1 payModeActivityKt$PayModeActivityContent$2$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1(this.Camera2StreamConfigurationMap, continuation);
        payModeActivityKt$PayModeActivityContent$2$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return payModeActivityKt$PayModeActivityContent$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivityKt$PayModeActivityContent$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivityKt$PayModeActivityContent$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
