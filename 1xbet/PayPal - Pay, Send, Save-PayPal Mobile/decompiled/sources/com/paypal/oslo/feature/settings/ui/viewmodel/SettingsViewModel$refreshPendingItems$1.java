package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1", f = "SettingsViewModel.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, nl = {359}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$refreshPendingItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow take = kotlinx.coroutines.flow.FlowKt.take(this.getHighResolutionOutputSizeshNQ4ISI.getStatusFlow(), 2);
                final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult refreshItemResult = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str = this.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 1;
                if (take.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) obj2;
                        mviStateStore = com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.settings.domain.model.SettingSection section = refreshItemResult.getSection();
                        java.lang.String str2 = str;
                        mviStateStore.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.ItemStatusRefreshed(section, str2, settingsItemStatus, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.access$getStatusText(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, str2, refreshItemResult.getSection(), settingsItemStatus), com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.access$getSubtitleText(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this, str, settingsItemStatus)));
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getInternalNavigation().error("Row data refresh failed after returning from L2", "row_data_refresh_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("row_id", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("error_message", e.getMessage())), e));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsViewModel$refreshPendingItems$1(com.paypal.oslo.feature.settings.domain.usecase.RefreshItemResult refreshItemResult, java.lang.String str, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$refreshPendingItems$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = refreshItemResult;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = settingsViewModel;
    }
}
