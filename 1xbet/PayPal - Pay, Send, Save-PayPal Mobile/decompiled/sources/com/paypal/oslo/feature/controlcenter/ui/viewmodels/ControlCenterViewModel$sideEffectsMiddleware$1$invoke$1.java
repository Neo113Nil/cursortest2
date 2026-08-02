package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1", f = "ControlCenterViewModel.kt", i = {}, l = {486}, m = "invokeSuspend", n = {}, nl = {488}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase refreshUserProfileUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Retry triggered - refreshing user profile", null, null, 6, null);
                refreshUserProfileUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
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
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Retry refresh failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_EVENT_NAME, "retry_refresh"), kotlin.TuplesKt.to("retry_source", com.paypal.oslo.feature.controlcenter.domain.constants.ControlCenterConstants.RemoteConfig.DOMAIN)), null, e2, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = controlCenterViewModel;
    }
}
