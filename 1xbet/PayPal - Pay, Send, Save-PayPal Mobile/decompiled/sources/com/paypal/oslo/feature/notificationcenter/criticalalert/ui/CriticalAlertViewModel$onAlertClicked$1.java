package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$onAlertClicked$1", f = "CriticalAlertViewModel.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertViewModel$onAlertClicked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase trackCriticalAlertUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            trackCriticalAlertUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = trackCriticalAlertUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.CLICKED, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either.isLeft()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, "Critical alert click tracking failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("alertId", criticalAlertData.getAlertIdentifier()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$onAlertClicked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$onAlertClicked$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertViewModel$onAlertClicked$1(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel criticalAlertViewModel, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$onAlertClicked$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = criticalAlertViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = criticalAlertData;
    }
}
