package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1", f = "GetNotificationPreferencesUseCase.kt", i = {0, 1}, l = {48, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {43, 51}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetNotificationPreferencesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.util.NotificationsStrings Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00af, code lost:
    
        if (r2.emit(r4.map(r5, r6, r7, r8, ((java.lang.Boolean) r15).booleanValue()), r14) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration;
        com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository;
        java.lang.String str;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration2;
        com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper notificationPreferencesDataMapper;
        com.paypal.oslo.feature.settings.domain.util.NotificationsStrings notificationsStrings;
        com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputStallDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper notificationPreferencesDataMapper2 = com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper.INSTANCE;
            com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData2 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.settings.domain.util.NotificationsStrings notificationsStrings2 = this.Camera2StreamConfigurationMap;
            settingsDynamicConfiguration = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            remoteConfigConfig = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String webViewUrl = com.paypal.oslo.feature.settings.domain.webview.WebViewUrlExtensionsKt.getWebViewUrl(remoteConfigConfig);
            iSettingsRepository = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighSpeedVideoFpsRangesFor = flowCollector2;
            this.getHighSpeedVideoFpsRanges = notificationPreferencesDataMapper2;
            this.getHighSpeedVideoSizes = notificationPreferencesSettingsData2;
            this.getHighSpeedVideoSizesFor = notificationsStrings2;
            this.getInputFormats = settingsDynamicConfiguration;
            this.getOutputMinFrameDuration = webViewUrl;
            this.getOutputFormats = 1;
            java.lang.Object isPrimaryUser = iSettingsRepository.isPrimaryUser(this);
            if (isPrimaryUser != coroutine_suspended) {
                str = webViewUrl;
                flowCollector = flowCollector2;
                settingsDynamicConfiguration2 = settingsDynamicConfiguration;
                obj = isPrimaryUser;
                notificationPreferencesDataMapper = notificationPreferencesDataMapper2;
                notificationsStrings = notificationsStrings2;
                notificationPreferencesSettingsData = notificationPreferencesSettingsData2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        java.lang.String str2 = (java.lang.String) this.getOutputMinFrameDuration;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration3 = (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration) this.getInputFormats;
        com.paypal.oslo.feature.settings.domain.util.NotificationsStrings notificationsStrings3 = (com.paypal.oslo.feature.settings.domain.util.NotificationsStrings) this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData3 = (com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData) this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper notificationPreferencesDataMapper3 = (com.paypal.oslo.feature.settings.domain.mapper.notificationpreferences.NotificationPreferencesDataMapper) this.getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        str = str2;
        flowCollector = flowCollector3;
        settingsDynamicConfiguration2 = settingsDynamicConfiguration3;
        notificationPreferencesDataMapper = notificationPreferencesDataMapper3;
        notificationsStrings = notificationsStrings3;
        notificationPreferencesSettingsData = notificationPreferencesSettingsData3;
        this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = null;
        this.getOutputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1 getNotificationPreferencesUseCase$invoke$1 = new com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, continuation);
        getNotificationPreferencesUseCase$invoke$1.getOutputStallDuration = obj;
        return getNotificationPreferencesUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetNotificationPreferencesUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData notificationPreferencesSettingsData, com.paypal.oslo.feature.settings.domain.util.NotificationsStrings notificationsStrings, com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase getNotificationPreferencesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetNotificationPreferencesUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = notificationPreferencesSettingsData;
        this.Camera2StreamConfigurationMap = notificationsStrings;
        this.getInputSizeshNQ4ISI = getNotificationPreferencesUseCase;
    }
}
