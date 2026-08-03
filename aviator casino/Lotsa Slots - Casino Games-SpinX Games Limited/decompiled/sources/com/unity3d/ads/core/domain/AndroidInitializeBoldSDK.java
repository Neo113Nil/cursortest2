package com.unity3d.ads.core.domain;

/* compiled from: AndroidInitializeBoldSDK.kt */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0002J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J\u0019\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J(\u00106\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0002J!\u00109\u001a\u00020(2\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J)\u0010;\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010<J\u0019\u0010=\u001a\u00020(2\u0006\u0010/\u001a\u00020*H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "initializeOM", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "cleanAssets", "Lcom/unity3d/ads/core/domain/CleanAssets;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "eventObservers", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "legacyConfigurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "handleFocusCounters", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V", "checkCanInitialize", "", "getInitLog", "", "getTags", "", "e", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "source", "isRetry", "", "handleResponse", com.ironsource.Ve.n, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationFailure", "startTime", "Lkotlin/time/TimeMark;", "initializationStart", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationSuccess", "(Lkotlin/time/TimeMark;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupDiagnosticEvents", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidInitializeBoldSDK implements com.unity3d.ads.core.domain.InitializeBoldSDK {
    public static final java.lang.String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final java.lang.String MSG_NETWORK = "Network";
    public static final java.lang.String MSG_TIMEOUT = "Timeout";
    public static final java.lang.String MSG_UNKNOWN = "Initialization failure";
    private final com.unity3d.ads.core.domain.CleanAssets cleanAssets;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository;
    private final com.unity3d.ads.core.domain.events.EventObservers eventObservers;
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetGameId getGameId;
    private final com.unity3d.ads.core.domain.GetInitializationRequest getInitializeRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
    private final com.unity3d.ads.core.domain.AndroidHandleFocusCounters handleFocusCounters;
    private final com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOM;
    private final com.unity3d.services.core.configuration.ConfigurationReader legacyConfigurationReader;
    private final com.unity3d.ads.core.log.Logger logger;
    private final com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.data.manager.StorageManager storageManager;
    private final com.unity3d.ads.core.domain.TriggerInitializeListener triggerInitializeListener;

    public AndroidInitializeBoldSDK(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOM, com.unity3d.ads.core.domain.GetInitializationRequest getInitializeRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.core.domain.CleanAssets cleanAssets, com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.events.EventObservers eventObservers, com.unity3d.ads.core.domain.TriggerInitializeListener triggerInitializeListener, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository, com.unity3d.ads.core.data.manager.StorageManager storageManager, com.unity3d.services.core.configuration.ConfigurationReader legacyConfigurationReader, com.unity3d.ads.core.data.manager.SDKPropertiesManager sdkPropertiesManager, com.unity3d.ads.core.domain.GetGameId getGameId, com.unity3d.ads.core.log.Logger logger, com.unity3d.ads.core.domain.AndroidHandleFocusCounters handleFocusCounters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeOM, "initializeOM");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializeRequest, "getInitializeRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanAssets, "cleanAssets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventObservers, "eventObservers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triggerInitializeListener, "triggerInitializeListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyConfigurationReader, "legacyConfigurationReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = handleFocusCounters;
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.defaultDispatcher, new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2(this, str, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object handleResponse(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse universalResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new com.unity3d.ads.core.data.model.exception.InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new com.unity3d.ads.core.data.model.exception.InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new com.unity3d.ads.core.data.model.exception.InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        com.unity3d.ads.core.domain.HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
        java.lang.Object invoke = handleGatewayInitializationResponse.invoke(initializationResponse, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new com.unity3d.ads.core.data.model.exception.InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        if (this.getGameId.invoke() == null) {
            throw new com.unity3d.ads.core.data.model.exception.InitializationException("gameId is null.", null, "invalid_game_id", kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object initializationStart(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("is_retry", java.lang.String.valueOf(z)), kotlin.TuplesKt.to("kotlin_version", kotlin.KotlinVersion.CURRENT.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZING);
        java.lang.Object invoke = this.eventObservers.invoke(continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }

    private final java.lang.String getInitLog() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initializing SDK 4.16.5 41605 with game id ");
        sb.append(this.getGameId.invoke());
        sb.append(" in ");
        sb.append(this.sessionRepository.isTestModeEnabled() ? "test" : com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION);
        sb.append(" mode, session ");
        sb.append(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initializationSuccess(kotlin.time.TimeMark timeMark, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK;
        com.unity3d.ads.core.domain.CleanAssets cleanAssets;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1) {
            androidInitializeBoldSDK$initializationSuccess$1 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1) continuation;
            if ((androidInitializeBoldSDK$initializationSuccess$1.label & Integer.MIN_VALUE) != 0) {
                androidInitializeBoldSDK$initializationSuccess$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidInitializeBoldSDK$initializationSuccess$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidInitializeBoldSDK$initializationSuccess$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.logger.info("Initialized successfully");
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("is_retry", java.lang.String.valueOf(z))), null, null, null, 56, null);
                    this.storageManager.hasInitialized();
                    com.unity3d.ads.core.domain.om.InitializeOMSDK initializeOMSDK = this.initializeOM;
                    androidInitializeBoldSDK$initializationSuccess$1.L$0 = this;
                    androidInitializeBoldSDK$initializationSuccess$1.label = 1;
                    if (initializeOMSDK.invoke(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidInitializeBoldSDK = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            androidInitializeBoldSDK2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) androidInitializeBoldSDK$initializationSuccess$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
                            androidInitializeBoldSDK2.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZED);
                            androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
                            androidInitializeBoldSDK2.triggerInitializeListener.success();
                            androidInitializeBoldSDK2.setupDiagnosticEvents();
                            return kotlin.Unit.INSTANCE;
                        }
                        androidInitializeBoldSDK = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) androidInitializeBoldSDK$initializationSuccess$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidInitializeBoldSDK.handleFocusCounters.invoke();
                        sessionRepository = androidInitializeBoldSDK.sessionRepository;
                        androidInitializeBoldSDK$initializationSuccess$1.L$0 = androidInitializeBoldSDK;
                        androidInitializeBoldSDK$initializationSuccess$1.label = 3;
                        if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidInitializeBoldSDK2 = androidInitializeBoldSDK;
                        androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
                        androidInitializeBoldSDK2.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.INITIALIZED);
                        androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
                        androidInitializeBoldSDK2.triggerInitializeListener.success();
                        androidInitializeBoldSDK2.setupDiagnosticEvents();
                        return kotlin.Unit.INSTANCE;
                    }
                    androidInitializeBoldSDK = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) androidInitializeBoldSDK$initializationSuccess$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cleanAssets = androidInitializeBoldSDK.cleanAssets;
                androidInitializeBoldSDK$initializationSuccess$1.L$0 = androidInitializeBoldSDK;
                androidInitializeBoldSDK$initializationSuccess$1.label = 2;
                if (cleanAssets.invoke(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidInitializeBoldSDK.handleFocusCounters.invoke();
                sessionRepository = androidInitializeBoldSDK.sessionRepository;
                androidInitializeBoldSDK$initializationSuccess$1.L$0 = androidInitializeBoldSDK;
                androidInitializeBoldSDK$initializationSuccess$1.label = 3;
                if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
                }
            }
        }
        androidInitializeBoldSDK$initializationSuccess$1 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1(this, continuation);
        java.lang.Object obj2 = androidInitializeBoldSDK$initializationSuccess$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInitializeBoldSDK$initializationSuccess$1.label;
        if (i != 0) {
        }
        cleanAssets = androidInitializeBoldSDK.cleanAssets;
        androidInitializeBoldSDK$initializationSuccess$1.L$0 = androidInitializeBoldSDK;
        androidInitializeBoldSDK$initializationSuccess$1.label = 2;
        if (cleanAssets.invoke(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
        }
        androidInitializeBoldSDK.handleFocusCounters.invoke();
        sessionRepository = androidInitializeBoldSDK.sessionRepository;
        androidInitializeBoldSDK$initializationSuccess$1.L$0 = androidInitializeBoldSDK;
        androidInitializeBoldSDK$initializationSuccess$1.label = 3;
        if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$1) == coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(kotlin.time.TimeMark startTime, com.unity3d.ads.core.data.model.exception.InitializationException e, java.lang.String source, boolean isRetry) {
        this.logger.error("Initialization failed: " + e.getMessage(), e);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), getTags(e, source, isRetry), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(com.unity3d.ads.core.data.model.InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, e.getMessage());
        setupDiagnosticEvents();
    }

    private final java.util.Map<java.lang.String, java.lang.String> getTags(com.unity3d.ads.core.data.model.exception.InitializationException e, java.lang.String source, boolean isRetry) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("operation", com.unity3d.ads.core.data.model.OperationType.INITIALIZATION.toString());
        createMapBuilder.put("reason", e.getReason());
        createMapBuilder.put("source", source);
        createMapBuilder.put("is_retry", java.lang.String.valueOf(isRetry));
        if (e.getReasonDebug() != null) {
            createMapBuilder.put("reason_debug", e.getReasonDebug());
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    private final void setupDiagnosticEvents() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        com.unity3d.ads.core.data.repository.DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(config, "config");
        diagnosticEventRepository.configure(config);
    }
}
