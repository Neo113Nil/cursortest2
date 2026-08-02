package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$trackImpression$1", f = "CriticalAlertViewModel.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertViewModel$trackImpression$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.notificationcenter.criticalalert.domain.usecase.TrackCriticalAlertUseCase trackCriticalAlertUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            trackCriticalAlertUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = trackCriticalAlertUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.TrackingStatus.IMPRESSED, this);
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
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (either.isLeft()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.notificationcenter.LoggerKt.log, "Critical alert impression tracking failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("alertId", str), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.notificationcenter.criticalalert.domain.repository.CriticalAlertError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$trackImpression$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$trackImpression$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertViewModel$trackImpression$1(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel criticalAlertViewModel, com.paypal.oslo.feature.notificationcenter.criticalalert.domain.model.CriticalAlertData criticalAlertData, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$trackImpression$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = criticalAlertViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = criticalAlertData;
        this.getHighSpeedVideoSizes = str;
    }
}
