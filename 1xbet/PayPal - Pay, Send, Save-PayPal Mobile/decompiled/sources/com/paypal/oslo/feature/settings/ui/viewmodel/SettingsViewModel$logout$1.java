package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$logout$1", f = "SettingsViewModel.kt", i = {}, l = {525, 527}, m = "invokeSuspend", n = {}, nl = {527, 747}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$logout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1500, r5) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.domain.usecase.SettingsUseCasesProvider settingsUseCasesProvider;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.getHighSpeedVideoSizes;
                if (either instanceof arrow.core.Either.Right) {
                    mviStateStore2 = settingsViewModel.getInputSizeshNQ4ISI;
                    mviStateStore2.onEvent(com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutCompleted.INSTANCE);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError = (com.paypal.oslo.feature.settings.domain.error.SettingsError) ((arrow.core.Either.Left) either).getValue();
                    mviStateStore = settingsViewModel.getInputSizeshNQ4ISI;
                    mviStateStore.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.SystemEvent.LogoutFailed(settingsError.toString()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        settingsUseCasesProvider = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = 2;
        obj = settingsUseCasesProvider.getLogoutUseCase().invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$logout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$logout$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsViewModel$logout$1(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$logout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = settingsViewModel;
    }
}
