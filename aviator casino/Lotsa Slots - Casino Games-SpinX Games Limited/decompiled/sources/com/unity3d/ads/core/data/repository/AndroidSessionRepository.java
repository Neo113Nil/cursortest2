package com.unity3d.ads.core.data.repository;

/* compiled from: AndroidSessionRepository.kt */
@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u0017H\u0016J\u0011\u0010v\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\u0011\u0010x\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\u0011\u0010y\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\b\u0010z\u001a\u00020tH\u0016J\b\u0010{\u001a\u00020tH\u0016J\b\u0010|\u001a\u00020tH\u0016J\b\u0010}\u001a\u00020tH\u0016J\b\u0010~\u001a\u00020tH\u0016J\b\u0010\u007f\u001a\u00020tH\u0016J\t\u0010\u0080\u0001\u001a\u00020tH\u0016J\t\u0010\u0081\u0001\u001a\u00020tH\u0016J\t\u0010\u0082\u0001\u001a\u00020tH\u0016J\t\u0010\u0083\u0001\u001a\u00020tH\u0016J\u0012\u0010\u0084\u0001\u001a\u00020tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010wJ\t\u0010\u0085\u0001\u001a\u00020tH\u0016J\u001b\u0010\u0086\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001J\u001b\u0010\u0089\u0001\u001a\u00020t2\u0006\u0010,\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010-\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00102\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R$\u0010=\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010F\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010CR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010I\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00190O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0SX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0OX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0XX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u00104R$\u0010c\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R$\u0010f\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010C\"\u0004\bh\u0010iR$\u0010j\u001a\u00020'2\u0006\u0010,\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010o\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010/R\u0016\u0010q\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008a\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidSessionRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "gatewayCacheDataSource", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "privacyDataSource", "fsmDataSource", "nativeConfigDataSource", "unityInfoDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/protobuf/ByteString;", "_gameId", "", "_gatewayUrl", "_headerBiddingTokenCounter", "", "_initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "_isFirstInitAttempt", "", "_isTestModeEnabled", "_onChange", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "_sdkConfiguration", "_sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "_sessionId", "_sessionToken", "_shouldInitialize", "_tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "value", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "getHeaderBiddingTokenCounter", "()I", "initializationState", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "()Z", "isFirstInitAttempt", "isInit", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "persistedNativeConfiguration", "scarEligibleFormats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getScarEligibleFormats", "()Ljava/util/List;", "sessionCounters", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "addTimeToGlobalAdsFocusTime", "", "timeMs", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementFocusChangeCount", "incrementGlobalAdsFocusChangeCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidSessionRepository implements com.unity3d.ads.core.data.repository.SessionRepository {
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _currentState;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _gameId;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _gatewayUrl;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> _headerBiddingTokenCounter;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.InitializationState> _initializationState;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isFirstInitAttempt;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isTestModeEnabled;
    private kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> _onChange;
    private final kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> _sdkConfiguration;
    private final kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> _sessionCounters;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _sessionId;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> _sessionToken;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _shouldInitialize;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> _tokenCounters;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource fsmDataSource;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource gatewayCacheDataSource;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isInit;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource nativeConfigDataSource;
    private final kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.model.SessionChange> onChange;
    private final kotlinx.coroutines.flow.Flow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> persistedNativeConfiguration;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyDataSource;
    private final java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> scarEligibleFormats;
    private final com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource unityInfoDataSource;

    public AndroidSessionRepository(com.unity3d.ads.core.data.datasource.ByteStringDataSource gatewayCacheDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource privacyDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource fsmDataSource, com.unity3d.ads.core.data.datasource.ByteStringDataSource nativeConfigDataSource, com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource unityInfoDataSource, gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayCacheDataSource, "gatewayCacheDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyDataSource, "privacyDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fsmDataSource, "fsmDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfigDataSource, "nativeConfigDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unityInfoDataSource, "unityInfoDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(defaultNativeConfiguration);
        this._sdkConfiguration = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.isInit = MutableStateFlow2;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final kotlinx.coroutines.flow.Flow flowCombine = kotlinx.coroutines.flow.FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>> flow = new kotlinx.coroutines.flow.Flow<kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (((java.lang.Boolean) ((kotlin.Pair) obj).getSecond()).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.persistedNativeConfiguration = new kotlinx.coroutines.flow.Flow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                java.lang.Object first = ((kotlin.Pair) obj).getFirst();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(first, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        this.scarEligibleFormats = new java.util.ArrayList();
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._onChange = MutableSharedFlow$default;
        this.onChange = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        java.lang.String gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
        this._gameId = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(gameId != null ? gameId : null);
        java.util.UUID fromString = java.util.UUID.fromString(com.unity3d.services.core.properties.SessionIdReader.INSTANCE.getSessionId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(SessionIdReader.sessionId)");
        this._sessionId = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString));
        this._isTestModeEnabled = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf(com.unity3d.services.core.properties.SdkProperties.isTestMode()));
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters build = gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.newBuilder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "newBuilder().build()");
        this._sessionCounters = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(build);
        this._tokenCounters = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.unity3d.ads.core.data.model.TokenCounters(0, 0, 0));
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._sessionToken = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(EMPTY);
        com.google.protobuf.ByteString EMPTY2 = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
        this._currentState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(EMPTY2);
        this._gatewayUrl = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.services.UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        this._shouldInitialize = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(true);
        this._isFirstInitAttempt = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(true);
    }

    /* compiled from: AndroidSessionRepository.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.domain.SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.data.repository.AndroidSessionRepository.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.nativeConfigDataSource.get(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.unity3d.ads.core.data.repository.AndroidSessionRepository.this._sdkConfiguration;
                    gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration parseFrom = gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(data)");
                    mutableStateFlow.setValue(parseFrom);
                }
            } catch (java.lang.Exception e) {
                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debugReason", message)), null, null, null, 58, null);
            }
            com.unity3d.ads.core.data.repository.AndroidSessionRepository.this.isInit.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.data.model.SessionChange> getOnChange() {
        return this.onChange;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getGameId() {
        java.lang.String value;
        java.lang.String gameId;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, gameId));
        return gameId;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(java.lang.String str) {
        java.lang.String value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            com.unity3d.services.core.properties.ClientProperties.setGameId(str);
        } while (!mutableStateFlow.compareAndSet(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getSessionId() {
        return this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        java.lang.Boolean value;
        boolean isTestMode;
        java.lang.Boolean valueOf;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._isTestModeEnabled;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
            isTestMode = com.unity3d.services.core.properties.SdkProperties.isTestMode();
            valueOf = java.lang.Boolean.valueOf(isTestMode);
        } while (!mutableStateFlow.compareAndSet(value, valueOf));
        valueOf.getClass();
        return isTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.unity3d.ads.core.data.model.TokenCounters getTokenCounters() {
        return this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(com.unity3d.ads.core.data.model.TokenCounters value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int timeMs) {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + timeMs);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters value;
        gatewayprotocol.v1.SessionCountersKt.Dsl _create;
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            gatewayprotocol.v1.SessionCountersKt.Dsl.Companion companion = gatewayprotocol.v1.SessionCountersKt.Dsl.INSTANCE;
            gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
            _create = companion._create(builder);
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        com.unity3d.ads.core.data.model.TokenCounters value;
        com.unity3d.ads.core.data.model.TokenCounters tokenCounters;
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, com.unity3d.ads.core.data.model.TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.unity3d.ads.core.data.model.TokenCounters(0, 0, 0))) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getSessionToken() {
        return this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(com.google.protobuf.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> mutableStateFlow = this._sessionToken;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.google.protobuf.ByteString getGatewayState() {
        return this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(com.google.protobuf.ByteString value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.google.protobuf.ByteString> mutableStateFlow = this._currentState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        java.lang.Object runBlocking$default;
        if (!this.isInit.getValue().booleanValue()) {
            runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null);
            return (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) runBlocking$default;
        }
        return this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration> mutableStateFlow = this._sdkConfiguration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this._gatewayUrl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public com.unity3d.ads.core.data.model.InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(com.unity3d.ads.core.data.model.InitializationState value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlinx.coroutines.flow.MutableStateFlow<com.unity3d.ads.core.data.model.InitializationState> mutableStateFlow = this._initializationState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public kotlinx.coroutines.flow.Flow<com.unity3d.ads.core.data.model.InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == com.unity3d.ads.core.data.model.InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        gatewayprotocol.v1.NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        java.lang.Integer value;
        java.lang.Integer num;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this._headerBiddingTokenCounter;
        do {
            value = mutableStateFlow.getValue();
            num = value;
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(num.intValue() + 1)));
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getGatewayCache(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 androidSessionRepository$getGatewayCache$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1) {
            androidSessionRepository$getGatewayCache$1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1) continuation;
            if ((androidSessionRepository$getGatewayCache$1.label & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getGatewayCache$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidSessionRepository$getGatewayCache$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getGatewayCache$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
                    androidSessionRepository$getGatewayCache$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getGatewayCache$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "gatewayCacheDataSource.get().data");
                return data;
            }
        }
        androidSessionRepository$getGatewayCache$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1(this, continuation);
        java.lang.Object obj2 = androidSessionRepository$getGatewayCache$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getGatewayCache$1.label;
        if (i != 0) {
        }
        com.google.protobuf.ByteString data2 = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "gatewayCacheDataSource.get().data");
        return data2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object setGatewayCache(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.gatewayCacheDataSource.set(byteString, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPrivacy(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 androidSessionRepository$getPrivacy$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1) {
            androidSessionRepository$getPrivacy$1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1) continuation;
            if ((androidSessionRepository$getPrivacy$1.label & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidSessionRepository$getPrivacy$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getPrivacy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$getPrivacy$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacy$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "privacyDataSource.get().data");
                return data;
            }
        }
        androidSessionRepository$getPrivacy$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1(this, continuation);
        java.lang.Object obj2 = androidSessionRepository$getPrivacy$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getPrivacy$1.label;
        if (i != 0) {
        }
        com.google.protobuf.ByteString data2 = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "privacyDataSource.get().data");
        return data2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 androidSessionRepository$setPrivacy$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository;
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> mutableSharedFlow;
        com.unity3d.ads.core.data.model.SessionChange.UserConsentChange userConsentChange;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1) {
            androidSessionRepository$setPrivacy$1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1) continuation;
            if ((androidSessionRepository$setPrivacy$1.label & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacy$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidSessionRepository$setPrivacy$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$setPrivacy$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$setPrivacy$1.L$0 = this;
                    androidSessionRepository$setPrivacy$1.L$1 = byteString;
                    androidSessionRepository$setPrivacy$1.label = 1;
                    if (byteStringDataSource.set(byteString, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidSessionRepository = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    byteString = (com.google.protobuf.ByteString) androidSessionRepository$setPrivacy$1.L$1;
                    androidSessionRepository = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) androidSessionRepository$setPrivacy$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mutableSharedFlow = androidSessionRepository._onChange;
                userConsentChange = new com.unity3d.ads.core.data.model.SessionChange.UserConsentChange(byteString);
                androidSessionRepository$setPrivacy$1.L$0 = null;
                androidSessionRepository$setPrivacy$1.L$1 = null;
                androidSessionRepository$setPrivacy$1.label = 2;
                if (mutableSharedFlow.emit(userConsentChange, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidSessionRepository$setPrivacy$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1(this, continuation);
        java.lang.Object obj2 = androidSessionRepository$setPrivacy$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$setPrivacy$1.label;
        if (i != 0) {
        }
        mutableSharedFlow = androidSessionRepository._onChange;
        userConsentChange = new com.unity3d.ads.core.data.model.SessionChange.UserConsentChange(byteString);
        androidSessionRepository$setPrivacy$1.L$0 = null;
        androidSessionRepository$setPrivacy$1.L$1 = null;
        androidSessionRepository$setPrivacy$1.label = 2;
        if (mutableSharedFlow.emit(userConsentChange, androidSessionRepository$setPrivacy$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object getPrivacyFsm(kotlin.coroutines.Continuation<? super com.google.protobuf.ByteString> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 androidSessionRepository$getPrivacyFsm$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1) {
            androidSessionRepository$getPrivacyFsm$1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1) continuation;
            if ((androidSessionRepository$getPrivacyFsm$1.label & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacyFsm$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidSessionRepository$getPrivacyFsm$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$getPrivacyFsm$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$getPrivacyFsm$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacyFsm$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.google.protobuf.ByteString data = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "fsmDataSource.get().data");
                return data;
            }
        }
        androidSessionRepository$getPrivacyFsm$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1(this, continuation);
        java.lang.Object obj2 = androidSessionRepository$getPrivacyFsm$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$getPrivacyFsm$1.label;
        if (i != 0) {
        }
        com.google.protobuf.ByteString data2 = ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "fsmDataSource.get().data");
        return data2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 androidSessionRepository$setPrivacyFsm$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.unity3d.ads.core.data.repository.AndroidSessionRepository androidSessionRepository;
        kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> mutableSharedFlow;
        com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange privacyFsmChange;
        if (continuation instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1) {
            androidSessionRepository$setPrivacyFsm$1 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1) continuation;
            if ((androidSessionRepository$setPrivacyFsm$1.label & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacyFsm$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidSessionRepository$setPrivacyFsm$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidSessionRepository$setPrivacyFsm$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$setPrivacyFsm$1.L$0 = this;
                    androidSessionRepository$setPrivacyFsm$1.L$1 = byteString;
                    androidSessionRepository$setPrivacyFsm$1.label = 1;
                    if (byteStringDataSource.set(byteString, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidSessionRepository = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    byteString = (com.google.protobuf.ByteString) androidSessionRepository$setPrivacyFsm$1.L$1;
                    androidSessionRepository = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) androidSessionRepository$setPrivacyFsm$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                mutableSharedFlow = androidSessionRepository._onChange;
                privacyFsmChange = new com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange(byteString);
                androidSessionRepository$setPrivacyFsm$1.L$0 = null;
                androidSessionRepository$setPrivacyFsm$1.L$1 = null;
                androidSessionRepository$setPrivacyFsm$1.label = 2;
                if (mutableSharedFlow.emit(privacyFsmChange, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        androidSessionRepository$setPrivacyFsm$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1(this, continuation);
        java.lang.Object obj2 = androidSessionRepository$setPrivacyFsm$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidSessionRepository$setPrivacyFsm$1.label;
        if (i != 0) {
        }
        mutableSharedFlow = androidSessionRepository._onChange;
        privacyFsmChange = new com.unity3d.ads.core.data.model.SessionChange.PrivacyFsmChange(byteString);
        androidSessionRepository$setPrivacyFsm$1.L$0 = null;
        androidSessionRepository$setPrivacyFsm$1.L$1 = null;
        androidSessionRepository$setPrivacyFsm$1.label = 2;
        if (mutableSharedFlow.emit(privacyFsmChange, androidSessionRepository$setPrivacyFsm$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        java.lang.Boolean value;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._shouldInitialize;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.Object persistNativeConfiguration(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        com.google.protobuf.ByteString byteString = getNativeConfiguration().toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "nativeConfiguration.toByteString()");
        java.lang.Object obj = byteStringDataSource.set(byteString, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        java.lang.Boolean value;
        java.lang.Boolean bool;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this._isFirstInitAttempt;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, false));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public java.lang.String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }
}
