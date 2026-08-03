package com.unity3d.ads.core.domain;

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "transactionEventManager", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkScope", "Lkotlinx/coroutines/CoroutineScope;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "getSafeguardedInitializationPolicy", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;)V", "invoke", "", com.ironsource.Ve.n, "Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$InitializationResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHandleGatewayInitializationResponse implements com.unity3d.ads.core.domain.HandleGatewayInitializationResponse {
    private final com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final com.unity3d.ads.core.domain.HandleDebugSettings handleDebugSettings;
    private final kotlinx.coroutines.CoroutineScope sdkScope;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager;
    private final com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(com.unity3d.ads.core.data.manager.TransactionEventManager transactionEventManager, com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, kotlinx.coroutines.CoroutineScope sdkScope, com.unity3d.ads.core.domain.HandleDebugSettings handleDebugSettings, com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventManager, "transactionEventManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkScope, "sdkScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleDebugSettings, "handleDebugSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public java.lang.Object invoke(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.String universalRequestUrl;
        if (initializationResponse.hasError()) {
            java.lang.String errorText = initializationResponse.getError().getErrorText();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
            throw new com.unity3d.ads.core.data.model.exception.GatewayException(errorText, new java.lang.IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository = this.sessionRepository;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "response.nativeConfiguration");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl.Companion companion = gatewayprotocol.v1.NativeConfigurationKt.Dsl.INSTANCE;
        gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        gatewayprotocol.v1.NativeConfigurationKt.Dsl _create = companion._create(builder);
        _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
        sessionRepository.setNativeConfiguration(_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2 = this.sessionRepository;
            java.lang.String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(universalRequestUrl2, "response.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(scarEligibleFormatsList, "response.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.sdkScope, null, null, new com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3(this, null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            com.unity3d.ads.core.domain.HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(debugSettings, "response.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        return kotlin.Unit.INSTANCE;
    }
}
