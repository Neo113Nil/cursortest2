package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1", f = "PushProvisioningSetupScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState access$PushProvisionSetupScreen$lambda$0 = com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt.access$PushProvisionSetupScreen$lambda$0(this.getHighSpeedVideoFpsRanges);
        if (access$PushProvisionSetupScreen$lambda$0 instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Loading) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.SCREEN_LOADING, this.Camera2StreamConfigurationMap, null, null, 12, null);
        } else if (access$PushProvisionSetupScreen$lambda$0 instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error) {
            com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error error = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState.Error) access$PushProvisionSetupScreen$lambda$0;
            java.lang.String errorCode = error.getErrorCode();
            if (errorCode == null) {
                errorCode = "";
            }
            java.lang.String name2 = error.getErrorType().name();
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningSetupAnalytics.SCREEN_ERROR, this.Camera2StreamConfigurationMap, errorCode, name2, (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.mvi.PushProvisioningSetupState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.setup.PushProvisioningSetupScreenKt$PushProvisionSetupScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = userIntentContext;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
