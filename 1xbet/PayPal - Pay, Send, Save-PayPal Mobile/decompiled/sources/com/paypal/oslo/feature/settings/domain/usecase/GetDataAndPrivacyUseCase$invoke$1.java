package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1", f = "GetDataAndPrivacyUseCase.kt", i = {0, 1, 1, 2, 2}, l = {76, 92, 82}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "hasPasskeys", "$this$flow", "hasPasskeys"}, nl = {77, 93, 96}, s = {"L$0", "L$0", "Z$0", "L$0", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetDataAndPrivacyUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.LLSState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    boolean getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    boolean getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase isOutputSupportedFor;
    private /* synthetic */ java.lang.Object toString;
    int unwrapAs;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0129, code lost:
    
        if (r15.emit(r5.map(r6, r7, r10, r9, r16, r11, r12, r13, r14, r3), r17) != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r3 != r2) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository;
        java.lang.Object hasPasskeys;
        boolean booleanValue;
        com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData dataAndPrivacySettingsData;
        com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings dataAndPrivacyStrings;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration;
        com.paypal.oslo.feature.settings.domain.model.LLSState lLSState;
        com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig;
        java.lang.String webViewUrl;
        com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository2;
        java.lang.Object isPrimaryUser;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper dataAndPrivacySettingsDataMapper;
        com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate2;
        com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError;
        boolean z;
        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.toString;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.unwrapAs;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iSettingsRepository = this.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI;
            this.toString = flowCollector2;
            this.unwrapAs = 1;
            hasPasskeys = iSettingsRepository.hasPasskeys(this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            hasPasskeys = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            boolean z2 = this.getValidOutputFormatsForInputhNQ4ISI;
            boolean z3 = this.getOutputSizes;
            com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate3 = (com.paypal.oslo.core.remoteconfig.contract.FeatureGate) this.getOutputStallDuration;
            webViewUrl = (java.lang.String) this.getOutputSizeshNQ4ISI;
            lLSState = (com.paypal.oslo.feature.settings.domain.model.LLSState) this.getOutputStallDurationlomOqCM;
            com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError2 = (com.paypal.oslo.feature.settings.domain.error.SettingsError) this.getOutputMinFrameDurationlomOqCM;
            settingsDynamicConfiguration = (com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration) this.getInputSizeshNQ4ISI;
            dataAndPrivacyStrings = (com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings) this.getOutputFormats;
            dataAndPrivacySettingsData = (com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData) this.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper dataAndPrivacySettingsDataMapper2 = (com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper) this.getOutputMinFrameDuration;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            isPrimaryUser = obj;
            flowCollector = flowCollector3;
            settingsError = settingsError2;
            z = z2;
            booleanValue = z3;
            dataAndPrivacySettingsDataMapper = dataAndPrivacySettingsDataMapper2;
            featureGate2 = featureGate3;
            com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData dataAndPrivacySettingsData2 = dataAndPrivacySettingsData;
            java.lang.String str = webViewUrl;
            com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings dataAndPrivacyStrings2 = dataAndPrivacyStrings;
            com.paypal.oslo.feature.settings.domain.model.LLSState lLSState2 = lLSState;
            boolean booleanValue2 = ((java.lang.Boolean) isPrimaryUser).booleanValue();
            this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getInputFormats = null;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputFormats = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputStallDuration = null;
            this.getOutputSizes = booleanValue;
            this.unwrapAs = 3;
        }
        booleanValue = ((java.lang.Boolean) hasPasskeys).booleanValue();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Passkey status retrieved for UI", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasPasskeys", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue))), null, 4, null);
        com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper dataAndPrivacySettingsDataMapper3 = com.paypal.oslo.feature.settings.domain.mapper.dataandprivacysettings.DataAndPrivacySettingsDataMapper.INSTANCE;
        dataAndPrivacySettingsData = this.getHighSpeedVideoSizes;
        dataAndPrivacyStrings = this.getHighResolutionOutputSizeshNQ4ISI;
        settingsDynamicConfiguration = this.isOutputSupportedFor.getHighSpeedVideoFpsRangesFor;
        boolean z4 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.settings.domain.error.SettingsError leftOrNull = this.getHighSpeedVideoFpsRanges.leftOrNull();
        lLSState = this.getHighSpeedVideoFpsRangesFor;
        remoteConfigConfig = this.isOutputSupportedFor.getHighSpeedVideoSizes;
        webViewUrl = com.paypal.oslo.feature.settings.domain.webview.WebViewUrlExtensionsKt.getWebViewUrl(remoteConfigConfig);
        featureGate = this.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
        iSettingsRepository2 = this.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI;
        this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
        this.getInputFormats = flowCollector2;
        this.getOutputMinFrameDuration = dataAndPrivacySettingsDataMapper3;
        this.getHighSpeedVideoSizesFor = dataAndPrivacySettingsData;
        this.getOutputFormats = dataAndPrivacyStrings;
        this.getInputSizeshNQ4ISI = settingsDynamicConfiguration;
        this.getOutputMinFrameDurationlomOqCM = leftOrNull;
        this.getOutputStallDurationlomOqCM = lLSState;
        this.getOutputSizeshNQ4ISI = webViewUrl;
        this.getOutputStallDuration = featureGate;
        this.getOutputSizes = booleanValue;
        this.getValidOutputFormatsForInputhNQ4ISI = z4;
        this.unwrapAs = 2;
        isPrimaryUser = iSettingsRepository2.isPrimaryUser(this);
        if (isPrimaryUser != coroutine_suspended) {
            flowCollector = flowCollector2;
            dataAndPrivacySettingsDataMapper = dataAndPrivacySettingsDataMapper3;
            featureGate2 = featureGate;
            settingsError = leftOrNull;
            z = z4;
            com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData dataAndPrivacySettingsData22 = dataAndPrivacySettingsData;
            java.lang.String str2 = webViewUrl;
            com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings dataAndPrivacyStrings22 = dataAndPrivacyStrings;
            com.paypal.oslo.feature.settings.domain.model.LLSState lLSState22 = lLSState;
            boolean booleanValue22 = ((java.lang.Boolean) isPrimaryUser).booleanValue();
            this.toString = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getInputFormats = null;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getOutputFormats = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputStallDuration = null;
            this.getOutputSizes = booleanValue;
            this.unwrapAs = 3;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1 getDataAndPrivacyUseCase$invoke$1 = new com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1(this.isOutputSupportedFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        getDataAndPrivacyUseCase$invoke$1.toString = obj;
        return getDataAndPrivacyUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GetDataAndPrivacyUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase getDataAndPrivacyUseCase, com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData dataAndPrivacySettingsData, com.paypal.oslo.feature.settings.domain.util.DataAndPrivacyStrings dataAndPrivacyStrings, boolean z, arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> either, com.paypal.oslo.feature.settings.domain.model.LLSState lLSState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetDataAndPrivacyUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.isOutputSupportedFor = getDataAndPrivacyUseCase;
        this.getHighSpeedVideoSizes = dataAndPrivacySettingsData;
        this.getHighResolutionOutputSizeshNQ4ISI = dataAndPrivacyStrings;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = either;
        this.getHighSpeedVideoFpsRangesFor = lLSState;
    }
}
