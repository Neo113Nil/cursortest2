package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$handleNetworkFailure$1", f = "ControlCenterViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ControlCenterViewModel$handleNetworkFailure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.NetworkFailure getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase refreshUserProfileUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                refreshUserProfileUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (refreshUserProfileUseCase.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.controlcenter.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getLoading().error("Auto-refresh failed after network failure", "user_store_refresh_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", e2.getMessage()), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, this.getHighSpeedVideoFpsRangesFor.toString())), e2));
            this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed("Unable to load your profile. Please try again.", null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$handleNetworkFailure$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$handleNetworkFailure$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlCenterViewModel$handleNetworkFailure$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.NetworkFailure networkFailure, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$handleNetworkFailure$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = controlCenterViewModel;
        this.getHighSpeedVideoFpsRangesFor = networkFailure;
    }
}
