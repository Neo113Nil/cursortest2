package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: SessionRepository.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u001b\b`\u0018\u00002\u00020\u0001J\u000e\u0010b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010cJ\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010gJ\u000e\u0010h\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010cJ\u0016\u0010i\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010gJ\u000e\u0010j\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010cJ\u0016\u0010k\u001a\u00020e2\u0006\u0010f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010gJ\b\u0010l\u001a\u00020eH&J\b\u0010m\u001a\u00020eH&J\b\u0010n\u001a\u00020eH&J\b\u0010o\u001a\u00020eH&J\b\u0010p\u001a\u00020eH&J\u000e\u0010q\u001a\u00020eH¦@¢\u0006\u0002\u0010cJ\b\u0010r\u001a\u00020eH&J\b\u0010s\u001a\u00020eH&J\b\u0010t\u001a\u00020eH&J\b\u0010u\u001a\u00020eH&J\b\u0010v\u001a\u00020eH&J\u0010\u0010w\u001a\u00020e2\u0006\u0010x\u001a\u00020SH&J\b\u0010y\u001a\u00020eH&J\u0010\u0010z\u001a\u00020e2\u0006\u0010{\u001a\u00020SH&J\u0010\u0010|\u001a\u00020e2\u0006\u0010{\u001a\u00020SH&J\b\u0010}\u001a\u00020eH&J\b\u0010~\u001a\u00020eH&J\b\u0010\u007f\u001a\u00020eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001eX¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00180+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u00100R\u0012\u00101\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00100R\u0012\u00102\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0018\u00103\u001a\u000204X¦\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u00109\u001a\u00020:X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u0004\u0018\u00010\u0012X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0014\"\u0004\bA\u0010\u0016R\u0018\u0010B\u001a\u00020/X¦\u000e¢\u0006\f\u001a\u0004\bC\u00100\"\u0004\bD\u0010ER\u0012\u0010F\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0012\u0010H\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u00100R\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0012\u0010N\u001a\u00020OX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00020SX¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0012\u0010V\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u00100R\u0012\u0010W\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u00100R\u0014\u0010X\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0014R\u0014\u0010Z\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0014R\u001a\u0010\\\u001a\u0004\u0018\u00010]X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010a¨\u0006\u0080\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "sessionToken", "Lcom/google/protobuf/ByteString;", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "gatewayState", "getGatewayState", "setGatewayState", "nativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "gatewayUrl", "", "getGatewayUrl", "()Ljava/lang/String;", "setGatewayUrl", "(Ljava/lang/String;)V", "initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationError", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "requestUrlOverrides", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "getRequestUrlOverrides", "()Ljava/util/List;", "setRequestUrlOverrides", "(Ljava/util/List;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "isSdkInitialized", "", "()Z", "isNativeConfigReady", "isDiagnosticsEnabled", "sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "setGameId", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "sessionId", "getSessionId", "isTestModeEnabled", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "headerBiddingTokenCounter", "", "getHeaderBiddingTokenCounter", "()I", "isOmEnabled", "isFirstInitAttempt", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGatewayCache", "", "value", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "incrementLoadRequestCount", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "persistNativeConfiguration", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "incrementGlobalAdsFocusChangeCount", "addTimeToGlobalAdsFocusTime", "timeMs", "incrementFocusChangeCount", "setInitializationLatency", "ms", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int timeMs);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(Continuation<? super ByteString> continuation);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationConfigurationInternal getInitializationConfiguration();

    InitializationException getInitializationError();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    Flow<InitializationState> getObserveInitializationState();

    SharedFlow<SessionChange> getOnChange();

    Object getPrivacy(Continuation<? super ByteString> continuation);

    Object getPrivacyFsm(Continuation<? super ByteString> continuation);

    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

    String getUnityMegaSessionId();

    void incrementAllErrorsCount();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementCacheTimeoutErrorsCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementSuccessCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isNativeConfigReady();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(Continuation<? super Unit> continuation);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, Continuation<? super Unit> continuation);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(InitializationException initializationException);

    void setInitializationLatency(int ms);

    void setInitializationState(InitializationState initializationState);

    void setLastLoadLatency(int ms);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, Continuation<? super Unit> continuation);

    Object setPrivacyFsm(ByteString byteString, Continuation<? super Unit> continuation);

    void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
