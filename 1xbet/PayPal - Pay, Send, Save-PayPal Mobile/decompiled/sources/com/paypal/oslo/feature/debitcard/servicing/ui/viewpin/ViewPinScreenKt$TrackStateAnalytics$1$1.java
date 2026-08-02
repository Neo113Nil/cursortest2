package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$TrackStateAnalytics$1$1", f = "ViewPinScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ViewPinScreenKt$TrackStateAnalytics$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics.INSTANCE.getUserIntent(this.getHighResolutionOutputSizeshNQ4ISI);
        com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState = this.getHighSpeedVideoFpsRanges;
        if (viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Input) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics.SCREEN_ID, userIntent, null, null, 12, null);
        } else if (viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Processing) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics.SCREEN_LOADING, userIntent, null, null, 12, null);
        } else if (viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.DisplayPin) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics.SCREEN_DISPLAY_PIN, userIntent, null, null, 12, null);
        } else {
            if (!(viewPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState.Error) viewPinState;
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.ViewPinAnalytics.SCREEN_ERROR, userIntent, error.getErrorCode(), error.getErrorType().name(), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$TrackStateAnalytics$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$TrackStateAnalytics$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPinScreenKt$TrackStateAnalytics$1$1(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinState viewPinState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.ViewPinScreenKt$TrackStateAnalytics$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = debitCardProductName;
        this.getHighSpeedVideoFpsRanges = viewPinState;
    }
}
