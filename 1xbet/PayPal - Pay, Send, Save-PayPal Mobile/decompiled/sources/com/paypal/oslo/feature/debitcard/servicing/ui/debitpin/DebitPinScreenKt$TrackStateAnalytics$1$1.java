package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$TrackStateAnalytics$1$1", f = "DebitPinScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitPinScreenKt$TrackStateAnalytics$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState = this.getHighSpeedVideoFpsRanges;
        if (debitPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Input) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.INSTANCE.getUserIntent(this.Camera2StreamConfigurationMap), null, null, 12, null);
        } else if (debitPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Processing) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.SCREEN_LOADING, com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.INSTANCE.getUserIntent(this.Camera2StreamConfigurationMap), null, null, 12, null);
        } else if (debitPinState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error) {
            com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Error) debitPinState;
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardErrorScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.SCREEN_ERROR, com.paypal.oslo.feature.debitcard.shared.analytics.DebitPinAnalytics.INSTANCE.getUserIntent(this.Camera2StreamConfigurationMap), error.getErrorCode(), error.getErrorType().name(), (com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module) null, 16, (java.lang.Object) null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$TrackStateAnalytics$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$TrackStateAnalytics$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitPinScreenKt$TrackStateAnalytics$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState debitPinState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$TrackStateAnalytics$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = debitPinState;
        this.Camera2StreamConfigurationMap = debitCardProductName;
    }
}
