package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$TrackStatesAnalytics$1$1", f = "DebitCardManagementScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$TrackStatesAnalytics$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState = this.Camera2StreamConfigurationMap;
        if (debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Success) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default("debit_card_management", com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getUserIntent(this.getHighResolutionOutputSizeshNQ4ISI), null, null, 12, null);
        } else if (debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Loading) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.SCREEN_LOADING, com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getUserIntent(this.getHighResolutionOutputSizeshNQ4ISI), null, null, 12, null);
        } else if (debitCardManagementState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState.Error) debitCardManagementState;
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.SCREEN_ERROR, com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getUserIntent(this.getHighResolutionOutputSizeshNQ4ISI), error.getErrorCode(), error.getErrorType().name(), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$TrackStatesAnalytics$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$TrackStatesAnalytics$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardManagementScreenKt$TrackStatesAnalytics$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$TrackStatesAnalytics$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = debitCardManagementState;
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
    }
}
