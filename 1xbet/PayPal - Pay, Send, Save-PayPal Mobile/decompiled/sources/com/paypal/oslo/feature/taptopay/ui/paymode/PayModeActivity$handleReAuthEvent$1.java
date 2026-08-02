package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleReAuthEvent$1", f = "PayModeActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivity$handleReAuthEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.result.ActivityResultLauncher activityResultLauncher;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getReAuthPromptManager().orchestrateAuthentication(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult reAuthOrchestrationResult = (com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult) obj;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Authentication orchestration result: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(reAuthOrchestrationResult.getClass()).getSimpleName())), null, null, 6, null);
        if (reAuthOrchestrationResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Authenticated) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth succeeded - reporting to ViewModel", null, null, 6, null);
            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getViewModel(this.getHighSpeedVideoFpsRangesFor).onReAuthResult(true);
        } else if (reAuthOrchestrationResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.Failed) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth failed - reporting to ViewModel", null, null, 6, null);
            com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getViewModel(this.getHighSpeedVideoFpsRangesFor).onReAuthResult(false);
        } else if (reAuthOrchestrationResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.CustomLauncherInvoked) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Custom launcher invoked - callbacks handled by domain", null, null, 6, null);
        } else {
            if (!(reAuthOrchestrationResult instanceof com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Launching KeyguardManager intent", null, null, 6, null);
            activityResultLauncher = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            activityResultLauncher.launch(((com.paypal.oslo.feature.taptopay.ui.paymode.auth.ReAuthPromptManager.ReAuthOrchestrationResult.LaunchKeyguardIntent) reAuthOrchestrationResult).getIntent());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleReAuthEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleReAuthEvent$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivity$handleReAuthEvent$1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired authenticationRequired, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleReAuthEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = payModeActivity;
        this.getHighResolutionOutputSizeshNQ4ISI = authenticationRequired;
    }
}
