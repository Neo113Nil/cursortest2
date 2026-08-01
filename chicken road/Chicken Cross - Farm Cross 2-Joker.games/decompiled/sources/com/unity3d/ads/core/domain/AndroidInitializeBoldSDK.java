package com.unity3d.ads.core.domain;

import androidx.compose.material.MenuKt;
import com.adjust.sdk.AdjustConfig;
import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: AndroidInitializeBoldSDK.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0096B¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020'H\u0002J\u001e\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020)H\u0002J&\u00101\u001a\u00020'2\u0006\u00102\u001a\u0002032\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u00104J(\u00105\u001a\u00020'2\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u0002072\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0002J0\u00108\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)092\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\u0006\u0010(\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010:\u001a\u00020'H\u0002J\b\u0010;\u001a\u00020'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "initializeOM", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "cleanAssets", "Lcom/unity3d/ads/core/domain/CleanAssets;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "eventObservers", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "storageManager", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "getGameId", "Lcom/unity3d/ads/core/domain/GetGameId;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "handleFocusCounters", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V", "invoke", "", "source", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkCanInitialize", "initializationStart", "isRetry", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitLog", "initializationSuccess", "startTime", "Lkotlin/time/TimeMark;", "(Lkotlin/time/TimeMark;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializationFailure", "e", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getTags", "", "setupDiagnosticEvents", "logNewPrivacyWasNotUsedIfNeeded", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final CoroutineDispatcher defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final Logger logger;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    public AndroidInitializeBoldSDK(CoroutineDispatcher defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters handleFocusCounters) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(initializeOM, "initializeOM");
        Intrinsics.checkNotNullParameter(getInitializeRequest, "getInitializeRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(cleanAssets, "cleanAssets");
        Intrinsics.checkNotNullParameter(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(eventObservers, "eventObservers");
        Intrinsics.checkNotNullParameter(triggerInitializeListener, "triggerInitializeListener");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(sdkPropertiesManager, "sdkPropertiesManager");
        Intrinsics.checkNotNullParameter(getGameId, "getGameId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(handleFocusCounters, "handleFocusCounters");
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
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = handleFocusCounters;
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(this, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (!this.sessionRepository.getShouldInitialize()) {
            InitializationException initializationError = this.sessionRepository.getInitializationError();
            if (initializationError == null) {
                initializationError = new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", null, null, 50, null);
            }
            throw initializationError;
        }
        if (this.getGameId.invoke() == null) {
            throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", null, null, 50, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, Continuation<? super Unit> continuation) {
        this.logger.info(getInitLog());
        logNewPrivacyWasNotUsedIfNeeded();
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED, (Double) null, MapsKt.plus(getTags$default(this, null, str, z, 1, null), MapsKt.mapOf(TuplesKt.to("kotlin_version", KotlinVersion.CURRENT.toString()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    private final String getInitLog() {
        return "Initializing SDK 4.19.0 41900 with game id " + this.getGameId.invoke() + " in " + (this.sessionRepository.isTestModeEnabled() ? "test" : AdjustConfig.ENVIRONMENT_PRODUCTION) + " mode, session " + ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializationSuccess(TimeMark timeMark, String str, boolean z, Continuation<? super Unit> continuation) {
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$1;
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$12;
        Object coroutine_suspended;
        int i;
        double d;
        CleanAssets cleanAssets;
        SessionRepository sessionRepository;
        if (continuation instanceof AndroidInitializeBoldSDK$initializationSuccess$1) {
            androidInitializeBoldSDK$initializationSuccess$1 = (AndroidInitializeBoldSDK$initializationSuccess$1) continuation;
            if ((androidInitializeBoldSDK$initializationSuccess$1.label & Integer.MIN_VALUE) != 0) {
                androidInitializeBoldSDK$initializationSuccess$1.label -= Integer.MIN_VALUE;
                androidInitializeBoldSDK$initializationSuccess$12 = androidInitializeBoldSDK$initializationSuccess$1;
                Object obj = androidInitializeBoldSDK$initializationSuccess$12.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidInitializeBoldSDK$initializationSuccess$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.logger.info("Initialized successfully");
                    double elapsedMillis = TimeExtensionsKt.elapsedMillis(timeMark);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME, Boxing.boxDouble(elapsedMillis), getTags$default(this, null, str, z, 1, null), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
                    this.storageManager.hasInitialized();
                    InitializeOMSDK initializeOMSDK = this.initializeOM;
                    androidInitializeBoldSDK$initializationSuccess$12.D$0 = elapsedMillis;
                    androidInitializeBoldSDK$initializationSuccess$12.label = 1;
                    if (initializeOMSDK.invoke(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    d = elapsedMillis;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                            ResultKt.throwOnFailure(obj);
                            this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
                            this.sdkPropertiesManager.setInitialized(true);
                            this.sessionRepository.setInitializationLatency((int) d);
                            this.triggerInitializeListener.success();
                            setupDiagnosticEvents();
                            return Unit.INSTANCE;
                        }
                        d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                        ResultKt.throwOnFailure(obj);
                        this.handleFocusCounters.invoke();
                        sessionRepository = this.sessionRepository;
                        androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
                        androidInitializeBoldSDK$initializationSuccess$12.label = 3;
                        if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
                        this.sdkPropertiesManager.setInitialized(true);
                        this.sessionRepository.setInitializationLatency((int) d);
                        this.triggerInitializeListener.success();
                        setupDiagnosticEvents();
                        return Unit.INSTANCE;
                    }
                    d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                    ResultKt.throwOnFailure(obj);
                }
                cleanAssets = this.cleanAssets;
                androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
                androidInitializeBoldSDK$initializationSuccess$12.label = 2;
                if (cleanAssets.invoke(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.handleFocusCounters.invoke();
                sessionRepository = this.sessionRepository;
                androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
                androidInitializeBoldSDK$initializationSuccess$12.label = 3;
                if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
                }
                this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
                this.sdkPropertiesManager.setInitialized(true);
                this.sessionRepository.setInitializationLatency((int) d);
                this.triggerInitializeListener.success();
                setupDiagnosticEvents();
                return Unit.INSTANCE;
            }
        }
        androidInitializeBoldSDK$initializationSuccess$1 = new AndroidInitializeBoldSDK$initializationSuccess$1(this, continuation);
        androidInitializeBoldSDK$initializationSuccess$12 = androidInitializeBoldSDK$initializationSuccess$1;
        Object obj2 = androidInitializeBoldSDK$initializationSuccess$12.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidInitializeBoldSDK$initializationSuccess$12.label;
        if (i != 0) {
        }
        cleanAssets = this.cleanAssets;
        androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
        androidInitializeBoldSDK$initializationSuccess$12.label = 2;
        if (cleanAssets.invoke(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
        }
        this.handleFocusCounters.invoke();
        sessionRepository = this.sessionRepository;
        androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
        androidInitializeBoldSDK$initializationSuccess$12.label = 3;
        if (sessionRepository.persistNativeConfiguration(androidInitializeBoldSDK$initializationSuccess$12) == coroutine_suspended) {
        }
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
        this.sdkPropertiesManager.setInitialized(true);
        this.sessionRepository.setInitializationLatency((int) d);
        this.triggerInitializeListener.success();
        setupDiagnosticEvents();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(TimeMark startTime, InitializationException e, String source, boolean isRetry) {
        this.logger.error("Initialization failed: " + e.getMessage(), e);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), getTags(e, source, isRetry), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, MenuKt.InTransitionDuration, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sessionRepository.setInitializationError(e);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(e);
        setupDiagnosticEvents();
    }

    static /* synthetic */ Map getTags$default(AndroidInitializeBoldSDK androidInitializeBoldSDK, InitializationException initializationException, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            initializationException = null;
        }
        return androidInitializeBoldSDK.getTags(initializationException, str, z);
    }

    private final Map<String, String> getTags(InitializationException e, String source, boolean isRetry) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("operation", OperationType.INITIALIZATION.toString());
        if (e != null) {
        }
        createMapBuilder.put("source", source);
        createMapBuilder.put("is_retry", String.valueOf(isRetry));
        createMapBuilder.put("new_api", String.valueOf(this.sessionRepository.getInitializationConfiguration() != null));
        if (e != null && e.getReasonDebug() != null) {
            createMapBuilder.put("reason_debug", e.getReasonDebug());
        }
        return MapsKt.build(createMapBuilder);
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        Intrinsics.checkNotNull(diagnosticEvents);
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    private final void logNewPrivacyWasNotUsedIfNeeded() {
        if (this.sessionRepository.getInitializationConfiguration() != null && UnityAds.getUserConsent() == null && UnityAds.getUserOptOut() == null && UnityAds.getNonBehavioral() == null) {
            this.logger.info("The new UnityAds SDK initialization was used without the new privacy APIs. Use the new privacy APIs to update privacy consent handling.");
        }
    }
}
