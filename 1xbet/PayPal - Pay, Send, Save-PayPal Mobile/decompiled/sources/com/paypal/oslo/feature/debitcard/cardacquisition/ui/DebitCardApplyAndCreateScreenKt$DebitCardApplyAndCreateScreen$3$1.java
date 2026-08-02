package com.paypal.oslo.feature.debitcard.cardacquisition.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1", f = "DebitCardApplyAndCreateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState access$DebitCardApplyAndCreateScreen$lambda$0 = com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt.access$DebitCardApplyAndCreateScreen$lambda$0(this.getHighSpeedVideoFpsRangesFor);
        if (access$DebitCardApplyAndCreateScreen$lambda$0 instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent(), null, null, 12, null);
        } else if (access$DebitCardApplyAndCreateScreen$lambda$0 instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.SCREEN_PROVISIONING, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent(), null, null, 12, null);
        } else if (access$DebitCardApplyAndCreateScreen$lambda$0 instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) {
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) access$DebitCardApplyAndCreateScreen$lambda$0;
            java.lang.String errorCode = error.getErrorCode();
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
            if (errorType == null || (str = errorType.name()) == null) {
                str = "RECOVERABLE";
            }
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.SCREEN_ERROR, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.INSTANCE.getUserIntent(), errorCode, str, (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.DebitCardApplyAndCreateScreenKt$DebitCardApplyAndCreateScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
