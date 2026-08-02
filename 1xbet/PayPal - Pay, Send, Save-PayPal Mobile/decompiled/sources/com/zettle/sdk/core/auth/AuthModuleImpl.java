package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020$H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010;J;\u0010<\u001a\u00020\u00132\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060>2\b\b\u0002\u0010?\u001a\u00020$2\u0006\u0010@\u001a\u00020$2\b\b\u0002\u0010A\u001a\u00020BH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010CJ\u0011\u0010D\u001a\u000209H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJ)\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020H2\u0006\u0010@\u001a\u00020$2\u0006\u0010I\u001a\u00020BH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0016\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u000201J\u0019\u0010N\u001a\u0002092\u0006\u0010O\u001a\u00020\u0013H\u0083@ø\u0001\u0000¢\u0006\u0002\u0010PJ2\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0R2\u0006\u0010L\u001a\u00020/2\u0006\u0010T\u001a\u000201H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ'\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u0006\u0010L\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u000209H\u0016J\b\u0010^\u001a\u000209H\u0016J2\u0010_\u001a\b\u0012\u0004\u0012\u00020$0R2\u0006\u0010G\u001a\u00020H2\u0006\u0010?\u001a\u00020$H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b`\u0010aR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u00106\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b7\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthModuleImpl;", "Lcom/zettle/sdk/core/auth/AuthModule;", "Lcom/zettle/sdk/core/log/Loggable;", "context", "Landroid/content/Context;", "clientId", "", "tokenProvider", "Lcom/zettle/sdk/core/auth/TokenProvider;", "scopeProvider", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "secureStorage", "Lcom/zettle/sdk/commons/SecureStorage;", "(Landroid/content/Context;Ljava/lang/String;Lcom/zettle/sdk/core/auth/TokenProvider;Lcom/zettle/sdk/core/auth/ScopeProvider;Lcom/zettle/sdk/commons/SecureStorage;)V", "_authState", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/izettle/android/auth/AuthState;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "activeToken", "setActiveToken", "(Lcom/zettle/sdk/core/auth/OAuthTokensInternal;)V", "authFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "getAuthFlow", "()Lkotlinx/coroutines/flow/Flow;", "authState", "Lcom/zettle/sdk/commons/state/State;", "getAuthState", "()Lcom/zettle/sdk/commons/state/State;", "fetchTokensMutex", "Lkotlinx/coroutines/sync/Mutex;", "hasCachedUserConfig", "", "getHasCachedUserConfig", "()Z", "inMemoryTokenMutex", "isLoggedIn", "logTag", "getLogTag", "()Ljava/lang/String;", "refreshToken", "getRefreshToken", "refresherClient", "Lokhttp3/OkHttpClient;", "refresherServiceProvider", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "getScopeProvider", "()Lcom/zettle/sdk/core/auth/ScopeProvider;", "sharedPrefs", "Landroid/content/SharedPreferences;", "tempToken", "setTempToken", "clean", "", "invalidate", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTokens", "scopes", "", "forced", "isRetryAfter401", "ttl", "", "([Ljava/lang/String;ZZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceNoTokenLogin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccessToken", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/zettle/sdk/commons/network/Scope;", "minimumTtlMillis", "(Lcom/zettle/sdk/commons/network/Scope;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialRefreshers", "client", "serviceProvider", "persist", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "(Lcom/zettle/sdk/core/auth/OAuthTokensInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "Lkotlin/Result;", "", "service", "refresh-0E7RQCE", "(Lokhttp3/OkHttpClient;Lcom/zettle/sdk/core/auth/ServiceProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTokens", "Lcom/zettle/sdk/core/network/HttpPayload;", "Lcom/zettle/sdk/core/auth/OAuthTokens;", "request", "Lokhttp3/Request;", "(Lokhttp3/Request;Lokhttp3/OkHttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "verify", "verify-0E7RQCE", "(Lcom/zettle/sdk/commons/network/Scope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthModuleImpl implements com.zettle.sdk.core.auth.AuthModule, com.zettle.sdk.core.log.Loggable {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.zettle.sdk.commons.state.State<com.izettle.android.auth.AuthState> authState;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ com.zettle.sdk.core.log.Loggable getHighSpeedVideoFpsRanges;
    private volatile com.zettle.sdk.core.auth.OAuthTokensInternal getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.commons.state.MutableState<com.izettle.android.auth.AuthState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizesFor;
    private okhttp3.OkHttpClient getInputFormats;
    private com.zettle.sdk.core.auth.ServiceProvider getInputSizeshNQ4ISI;
    private final com.zettle.sdk.commons.SecureStorage getOutputFormats;
    private final kotlinx.coroutines.sync.Mutex getOutputMinFrameDuration;
    private volatile com.zettle.sdk.core.auth.OAuthTokensInternal getOutputSizes;
    private final com.zettle.sdk.core.auth.TokenProvider getOutputSizeshNQ4ISI;
    private final android.content.SharedPreferences getOutputStallDurationlomOqCM;
    private final com.zettle.sdk.core.auth.ScopeProvider scopeProvider;

    public AuthModuleImpl(android.content.Context context, java.lang.String str, com.zettle.sdk.core.auth.TokenProvider tokenProvider, com.zettle.sdk.core.auth.ScopeProvider scopeProvider, com.zettle.sdk.commons.SecureStorage secureStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
        this.Camera2StreamConfigurationMap = str;
        this.getOutputSizeshNQ4ISI = tokenProvider;
        this.scopeProvider = scopeProvider;
        this.getOutputFormats = secureStorage;
        this.getHighSpeedVideoFpsRanges = com.zettle.sdk.core.log.LogKt.loggable$default("AuthModule", null, 2, null);
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.zettle.sdk.core.auth.AuthModuleKt.PREFS_NAME, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.getOutputStallDurationlomOqCM = sharedPreferences;
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getOutputMinFrameDuration = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(this.getHighSpeedVideoFpsRangesFor);
        com.zettle.sdk.commons.state.MutableState<com.izettle.android.auth.AuthState> create$default = com.zettle.sdk.commons.state.MutableState.Companion.create$default(com.zettle.sdk.commons.state.MutableState.INSTANCE, com.izettle.android.auth.AuthState.INITIALIZING, null, 2, null);
        this.getHighSpeedVideoSizes = create$default;
        this.authState = create$default;
    }

    @Override // com.zettle.sdk.core.auth.AuthModule
    public final com.zettle.sdk.core.auth.ScopeProvider getScopeProvider() {
        return this.scopeProvider;
    }

    @Override // com.zettle.sdk.core.auth.AuthModule
    public final kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState> getAuthFlow() {
        final kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        return new kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $Camera2StreamConfigurationMap;
                final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.zettle.sdk.core.auth.LoggedInState loggedIn;
                    boolean has;
                    if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizes -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizes;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$Camera2StreamConfigurationMap;
                                com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj;
                                if ((oAuthTokensInternal instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) && ((com.zettle.sdk.core.auth.ConnectionOAuthToken) oAuthTokensInternal).getFailedToRetrieveToken()) {
                                    has = this.getHighSpeedVideoSizes.getOutputFormats.has(com.zettle.sdk.core.auth.merchant.MerchantConfigKt.USER_CONFIG_KEY);
                                    if (has) {
                                        loggedIn = new com.zettle.sdk.core.auth.LoggedInState.LoggedIn(true);
                                        anonymousClass1.getHighSpeedVideoSizes = 1;
                                        if (flowCollector.emit(loggedIn, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                }
                                loggedIn = oAuthTokensInternal != null ? new com.zettle.sdk.core.auth.LoggedInState.LoggedIn(false) : com.zettle.sdk.core.auth.LoggedInState.LoggedOut.INSTANCE;
                                anonymousClass1.getHighSpeedVideoSizes = 1;
                                if (flowCollector.emit(loggedIn, anonymousClass1) == coroutine_suspended) {
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
                    anonymousClass1 = new com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizes;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1$2", f = "AuthModule.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRangesFor = obj;
                        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
                        return com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl) {
                    this.$Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoSizes = authModuleImpl;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.zettle.sdk.core.auth.LoggedInState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.zettle.sdk.core.auth.AuthModuleImpl$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.zettle.sdk.core.auth.AuthStateProvider
    public final com.zettle.sdk.commons.state.State<com.izettle.android.auth.AuthState> getAuthState() {
        return this.authState;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.zettle.sdk.core.auth.AuthModule
    /* renamed from: verify-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo23159verify0E7RQCE(com.zettle.sdk.commons.network.Scope scope, boolean z, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$verify$1 authModuleImpl$verify$1;
        int i;
        if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$verify$1) {
            authModuleImpl$verify$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$verify$1) continuation;
            if ((authModuleImpl$verify$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                authModuleImpl$verify$1.getHighSpeedVideoSizes -= 2147483648;
                com.zettle.sdk.core.auth.AuthModuleImpl$verify$1 authModuleImpl$verify$12 = authModuleImpl$verify$1;
                java.lang.Object obj = authModuleImpl$verify$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authModuleImpl$verify$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.log.LogKt.debug(this, "Fetching tokens from TokenProvider [verify]");
                    java.lang.String[] invoke = getScopeProvider().invoke(scope);
                    authModuleImpl$verify$12.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRangesFor(this, invoke, z, false, 0L, authModuleImpl$verify$12, 8);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String accessToken = ((com.zettle.sdk.core.auth.OAuthTokensInternal) obj).getAccessToken();
                return kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(accessToken != null || kotlin.text.StringsKt.isBlank(accessToken))));
            }
        }
        authModuleImpl$verify$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$verify$1(this, continuation);
        com.zettle.sdk.core.auth.AuthModuleImpl$verify$1 authModuleImpl$verify$122 = authModuleImpl$verify$1;
        java.lang.Object obj2 = authModuleImpl$verify$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authModuleImpl$verify$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        java.lang.String accessToken2 = ((com.zettle.sdk.core.auth.OAuthTokensInternal) obj2).getAccessToken();
        return kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(accessToken2 != null || kotlin.text.StringsKt.isBlank(accessToken2))));
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        com.zettle.sdk.core.auth.ServiceProvider serviceProvider;
        if (getRefreshToken() != null) {
            com.zettle.sdk.core.log.LogKt.log(this, "Should refresh tokens");
            okhttp3.OkHttpClient okHttpClient = this.getInputFormats;
            if (okHttpClient == null || (serviceProvider = this.getInputSizeshNQ4ISI) == null) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease(), null, null, new com.zettle.sdk.core.auth.AuthModuleImpl$start$1(this, okHttpClient, serviceProvider, null), 3, null);
            return;
        }
        com.zettle.sdk.core.log.LogKt.log(this, "No refresh token stored");
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.core.log.LogKt.log(this, "stop periodic listeners");
        kotlinx.coroutines.JobKt.cancelChildren(com.zettle.sdk.core.auth.AuthModule.INSTANCE.getScope$core_publicRelease().getCoroutineContext(), new java.util.concurrent.CancellationException("module:stopped"));
    }

    @Override // com.zettle.sdk.core.auth.AuthModule
    public final java.lang.Object getAccessToken(com.zettle.sdk.commons.network.Scope scope, boolean z, long j, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokensInternal> continuation) {
        com.zettle.sdk.core.log.LogKt.debug(this, "Fetching tokens from TokenProvider [getAccessToken]");
        return getHighSpeedVideoFpsRangesFor(this, getScopeProvider().invoke(scope), false, z, j, continuation, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.zettle.sdk.core.auth.AuthModule
    /* renamed from: refresh-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo23158refresh0E7RQCE(okhttp3.OkHttpClient okHttpClient, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Integer>> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$refresh$1 authModuleImpl$refresh$1;
        int i;
        com.izettle.android.net.HttpUrl current;
        java.lang.String url;
        if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$refresh$1) {
            authModuleImpl$refresh$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$refresh$1) continuation;
            if ((authModuleImpl$refresh$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                authModuleImpl$refresh$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = authModuleImpl$refresh$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = authModuleImpl$refresh$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl = this;
                    com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Refreshing access token");
                    if (getRefreshToken() == null) {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        return kotlin.Result.m23436constructorimpl(kotlin.coroutines.jvm.internal.Boxing.boxInt(-1));
                    }
                    java.lang.Object mo23162getServiceUrlsIoAF18A = serviceProvider.mo23162getServiceUrlsIoAF18A(com.zettle.sdk.commons.network.Service.OAUTH2.getKey());
                    if (kotlin.Result.m23441isFailureimpl(mo23162getServiceUrlsIoAF18A)) {
                        mo23162getServiceUrlsIoAF18A = null;
                    }
                    com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A;
                    if (serviceUrls == null || (current = serviceUrls.getCurrent()) == null || (url = current.getUrl()) == null) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("No url found for auth")));
                    }
                    okhttp3.MediaType mediaType = okhttp3.MediaType.INSTANCE.get("application/x-www-form-urlencoded");
                    okhttp3.RequestBody.Companion companion3 = okhttp3.RequestBody.INSTANCE;
                    java.lang.String str = this.Camera2StreamConfigurationMap;
                    java.lang.String refreshToken = getRefreshToken();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("client_id=");
                    sb.append(str);
                    sb.append("&grant_type=refresh_token&refresh_token=");
                    sb.append(refreshToken);
                    okhttp3.RequestBody create = companion3.create(sb.toString(), mediaType);
                    okhttp3.HttpUrl build = okhttp3.HttpUrl.INSTANCE.get(url).newBuilder().addPathSegment(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build();
                    com.zettle.sdk.core.log.LogKt.log(authModuleImpl, "Calling: ".concat(java.lang.String.valueOf(build)));
                    com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2 authModuleImpl$refresh$2 = new com.zettle.sdk.core.auth.AuthModuleImpl$refresh$2(this, new okhttp3.Request.Builder().url(build).post(create).build(), okHttpClient, null);
                    authModuleImpl$refresh$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.SupervisorKt.supervisorScope(authModuleImpl$refresh$2, authModuleImpl$refresh$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
            }
        }
        authModuleImpl$refresh$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$refresh$1(this, continuation);
        java.lang.Object obj2 = authModuleImpl$refresh$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authModuleImpl$refresh$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return ((kotlin.Result) obj2).getCamera2StreamConfigurationMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8 A[Catch: all -> 0x0168, TRY_ENTER, TryCatch #0 {all -> 0x0168, blocks: (B:22:0x00b0, B:25:0x00b8, B:26:0x0101, B:33:0x00cb, B:35:0x00e1, B:37:0x00eb), top: B:21:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$persist$1 authModuleImpl$persist$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl2;
        ?? r15;
        boolean isRefreshable;
        kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> mutableStateFlow;
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal2;
        int i2;
        try {
            if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$persist$1) {
                authModuleImpl$persist$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$persist$1) continuation;
                if ((authModuleImpl$persist$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    authModuleImpl$persist$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = authModuleImpl$persist$1.getHighSpeedVideoSizesFor;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = authModuleImpl$persist$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        boolean commit = com.zettle.sdk.core.auth.OAuthTokensKt.isRefreshable(oAuthTokensInternal) ? this.getOutputStallDurationlomOqCM.edit().putString(com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY, oAuthTokensInternal.getRefreshToken()).commit() : false;
                        if (!com.zettle.sdk.core.auth.OAuthTokensKt.isRefreshable(oAuthTokensInternal)) {
                            com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal3 = this.getOutputSizes;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(oAuthTokensInternal3 != null ? oAuthTokensInternal3.getAccessToken() : null, oAuthTokensInternal.getAccessToken())) {
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        if (commit || !com.zettle.sdk.core.auth.OAuthTokensKt.isRefreshable(oAuthTokensInternal)) {
                            mutex = this.getOutputMinFrameDuration;
                            authModuleImpl$persist$1.getHighResolutionOutputSizeshNQ4ISI = this;
                            authModuleImpl$persist$1.getHighSpeedVideoSizes = oAuthTokensInternal;
                            authModuleImpl$persist$1.getHighSpeedVideoFpsRanges = mutex;
                            authModuleImpl$persist$1.getHighSpeedVideoFpsRangesFor = commit ? 1 : 0;
                            authModuleImpl$persist$1.Camera2StreamConfigurationMap = 1;
                            if (mutex.lock(null, authModuleImpl$persist$1) != coroutine_suspended) {
                                authModuleImpl = this;
                                r15 = commit;
                            }
                            return coroutine_suspended;
                        }
                        authModuleImpl2 = this;
                        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl3 = authModuleImpl2;
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl3, "tempToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getOutputSizes)));
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl3, "activeToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getHighSpeedVideoFpsRangesFor)));
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = authModuleImpl$persist$1.getHighSpeedVideoFpsRangesFor;
                        oAuthTokensInternal2 = (com.zettle.sdk.core.auth.OAuthTokensInternal) authModuleImpl$persist$1.getHighSpeedVideoSizes;
                        authModuleImpl2 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$persist$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        authModuleImpl2.getHighSpeedVideoSizes.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$persist$3
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                            public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                                return com.izettle.android.auth.AuthState.LOGGED_IN;
                            }
                        });
                        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl4 = authModuleImpl2;
                        boolean z = i2 != 0;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("persisted (");
                        sb.append(z);
                        sb.append(") auth token: ");
                        sb.append(oAuthTokensInternal2);
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl4, sb.toString());
                        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl32 = authModuleImpl2;
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl32, "tempToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getOutputSizes)));
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl32, "activeToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getHighSpeedVideoFpsRangesFor)));
                        return kotlin.Unit.INSTANCE;
                    }
                    int i3 = authModuleImpl$persist$1.getHighSpeedVideoFpsRangesFor;
                    mutex = (kotlinx.coroutines.sync.Mutex) authModuleImpl$persist$1.getHighSpeedVideoFpsRanges;
                    com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal4 = (com.zettle.sdk.core.auth.OAuthTokensInternal) authModuleImpl$persist$1.getHighSpeedVideoSizes;
                    authModuleImpl = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$persist$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    r15 = i3;
                    oAuthTokensInternal = oAuthTokensInternal4;
                    isRefreshable = com.zettle.sdk.core.auth.OAuthTokensKt.isRefreshable(oAuthTokensInternal);
                    if (isRefreshable) {
                        com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat(java.lang.String.valueOf(oAuthTokensInternal)));
                        authModuleImpl.getOutputSizes = oAuthTokensInternal;
                    } else if (isRefreshable) {
                        com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting activeToken to ".concat(java.lang.String.valueOf(oAuthTokensInternal)));
                        authModuleImpl.getHighSpeedVideoFpsRangesFor = oAuthTokensInternal;
                        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal5 = authModuleImpl.getOutputSizes;
                        if (oAuthTokensInternal5 != null && !com.zettle.sdk.core.auth.OAuthTokensKt.isValid(oAuthTokensInternal5, new java.lang.String[0], 0L)) {
                            com.zettle.sdk.core.log.LogKt.log(authModuleImpl, "clearing not-refreshable temp token");
                            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat("null"));
                            authModuleImpl.getOutputSizes = null;
                        }
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    mutableStateFlow = authModuleImpl.getHighResolutionOutputSizeshNQ4ISI;
                    authModuleImpl$persist$1.getHighResolutionOutputSizeshNQ4ISI = authModuleImpl;
                    authModuleImpl$persist$1.getHighSpeedVideoSizes = oAuthTokensInternal;
                    authModuleImpl$persist$1.getHighSpeedVideoFpsRanges = null;
                    authModuleImpl$persist$1.getHighSpeedVideoFpsRangesFor = r15;
                    authModuleImpl$persist$1.Camera2StreamConfigurationMap = 2;
                    if (mutableStateFlow.emit(oAuthTokensInternal, authModuleImpl$persist$1) != coroutine_suspended) {
                        oAuthTokensInternal2 = oAuthTokensInternal;
                        i2 = r15;
                        authModuleImpl2 = authModuleImpl;
                        authModuleImpl2.getHighSpeedVideoSizes.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$persist$3
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                            public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                                return com.izettle.android.auth.AuthState.LOGGED_IN;
                            }
                        });
                        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl42 = authModuleImpl2;
                        if (i2 != 0) {
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("persisted (");
                        sb2.append(z);
                        sb2.append(") auth token: ");
                        sb2.append(oAuthTokensInternal2);
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl42, sb2.toString());
                        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl322 = authModuleImpl2;
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl322, "tempToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getOutputSizes)));
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl322, "activeToken is ".concat(java.lang.String.valueOf(authModuleImpl2.getHighSpeedVideoFpsRangesFor)));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            isRefreshable = com.zettle.sdk.core.auth.OAuthTokensKt.isRefreshable(oAuthTokensInternal);
            if (isRefreshable) {
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            mutableStateFlow = authModuleImpl.getHighResolutionOutputSizeshNQ4ISI;
            authModuleImpl$persist$1.getHighResolutionOutputSizeshNQ4ISI = authModuleImpl;
            authModuleImpl$persist$1.getHighSpeedVideoSizes = oAuthTokensInternal;
            authModuleImpl$persist$1.getHighSpeedVideoFpsRanges = null;
            authModuleImpl$persist$1.getHighSpeedVideoFpsRangesFor = r15;
            authModuleImpl$persist$1.Camera2StreamConfigurationMap = 2;
            if (mutableStateFlow.emit(oAuthTokensInternal, authModuleImpl$persist$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        authModuleImpl$persist$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$persist$1(this, continuation);
        java.lang.Object obj2 = authModuleImpl$persist$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authModuleImpl$persist$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$1 authModuleImpl$forceNoTokenLogin$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken;
        kotlinx.coroutines.sync.Mutex mutex;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl;
        kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> mutableStateFlow;
        com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken2;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl2;
        try {
            if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$1) {
                authModuleImpl$forceNoTokenLogin$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$1) continuation;
                if ((authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = authModuleImpl$forceNoTokenLogin$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        connectionOAuthToken = new com.zettle.sdk.core.auth.ConnectionOAuthToken(null, null, 2, null);
                        com.zettle.sdk.core.auth.OAuthTokensKt.failedToRetrieveToken(connectionOAuthToken);
                        mutex = this.getOutputMinFrameDuration;
                        authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRanges = this;
                        authModuleImpl$forceNoTokenLogin$1.Camera2StreamConfigurationMap = connectionOAuthToken;
                        authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRangesFor = mutex;
                        authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes = 1;
                        if (mutex.lock(null, authModuleImpl$forceNoTokenLogin$1) != coroutine_suspended) {
                            authModuleImpl = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        connectionOAuthToken2 = (com.zettle.sdk.core.auth.ConnectionOAuthToken) authModuleImpl$forceNoTokenLogin$1.Camera2StreamConfigurationMap;
                        authModuleImpl2 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        authModuleImpl2.getHighSpeedVideoSizes.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$3
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                            public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                                return com.izettle.android.auth.AuthState.LOGGED_IN;
                            }
                        });
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl2, "persisted connection auth token: ".concat(java.lang.String.valueOf(connectionOAuthToken2)));
                        return kotlin.Unit.INSTANCE;
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRangesFor;
                    com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken3 = (com.zettle.sdk.core.auth.ConnectionOAuthToken) authModuleImpl$forceNoTokenLogin$1.Camera2StreamConfigurationMap;
                    authModuleImpl = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    connectionOAuthToken = connectionOAuthToken3;
                    com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken4 = connectionOAuthToken;
                    com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat(java.lang.String.valueOf(connectionOAuthToken4)));
                    authModuleImpl.getOutputSizes = connectionOAuthToken4;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    mutableStateFlow = authModuleImpl.getHighResolutionOutputSizeshNQ4ISI;
                    authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRanges = authModuleImpl;
                    authModuleImpl$forceNoTokenLogin$1.Camera2StreamConfigurationMap = connectionOAuthToken;
                    authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRangesFor = null;
                    authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes = 2;
                    if (mutableStateFlow.emit(connectionOAuthToken, authModuleImpl$forceNoTokenLogin$1) != coroutine_suspended) {
                        connectionOAuthToken2 = connectionOAuthToken;
                        authModuleImpl2 = authModuleImpl;
                        authModuleImpl2.getHighSpeedVideoSizes.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$3
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                            public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                                return com.izettle.android.auth.AuthState.LOGGED_IN;
                            }
                        });
                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl2, "persisted connection auth token: ".concat(java.lang.String.valueOf(connectionOAuthToken2)));
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken42 = connectionOAuthToken;
            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat(java.lang.String.valueOf(connectionOAuthToken42)));
            authModuleImpl.getOutputSizes = connectionOAuthToken42;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            mutableStateFlow = authModuleImpl.getHighResolutionOutputSizeshNQ4ISI;
            authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRanges = authModuleImpl;
            authModuleImpl$forceNoTokenLogin$1.Camera2StreamConfigurationMap = connectionOAuthToken;
            authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoFpsRangesFor = null;
            authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes = 2;
            if (mutableStateFlow.emit(connectionOAuthToken, authModuleImpl$forceNoTokenLogin$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        authModuleImpl$forceNoTokenLogin$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$1(this, continuation);
        java.lang.Object obj2 = authModuleImpl$forceNoTokenLogin$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authModuleImpl$forceNoTokenLogin$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r10.emit(null, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.zettle.sdk.core.auth.AuthModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clean(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$clean$1 authModuleImpl$clean$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl;
        com.zettle.sdk.commons.SecureStorage secureStorage;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl2;
        try {
            if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$clean$1) {
                authModuleImpl$clean$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$clean$1) continuation;
                if ((authModuleImpl$clean$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    authModuleImpl$clean$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = authModuleImpl$clean$1.getHighResolutionOutputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = authModuleImpl$clean$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getOutputStallDurationlomOqCM.edit().remove(com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY).apply();
                        mutex = this.getOutputMinFrameDuration;
                        authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor = this;
                        authModuleImpl$clean$1.getHighSpeedVideoSizes = mutex;
                        authModuleImpl$clean$1.Camera2StreamConfigurationMap = 1;
                        if (mutex.lock(null, authModuleImpl$clean$1) != coroutine_suspended) {
                            authModuleImpl = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        mutex = (kotlinx.coroutines.sync.Mutex) authModuleImpl$clean$1.getHighSpeedVideoSizes;
                        authModuleImpl = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            authModuleImpl2 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            authModuleImpl2.getHighSpeedVideoSizes.update(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, com.izettle.android.auth.AuthState>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$clean$3
                                @Override // kotlin.jvm.functions.Function1
                                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                                public final com.izettle.android.auth.AuthState invoke(com.izettle.android.auth.AuthState authState) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                                    return com.izettle.android.auth.AuthState.LOGGED_OUT;
                                }
                            });
                            return kotlin.Unit.INSTANCE;
                        }
                        authModuleImpl2 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> mutableStateFlow = authModuleImpl2.getHighResolutionOutputSizeshNQ4ISI;
                        authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor = authModuleImpl2;
                        authModuleImpl$clean$1.Camera2StreamConfigurationMap = 3;
                    }
                    com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting activeToken to ".concat("null"));
                    authModuleImpl.getHighSpeedVideoFpsRangesFor = null;
                    com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat("null"));
                    authModuleImpl.getOutputSizes = null;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    secureStorage = authModuleImpl.getOutputFormats;
                    authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor = authModuleImpl;
                    authModuleImpl$clean$1.getHighSpeedVideoSizes = null;
                    authModuleImpl$clean$1.Camera2StreamConfigurationMap = 2;
                    if (secureStorage.clearAll(authModuleImpl$clean$1) != coroutine_suspended) {
                        authModuleImpl2 = authModuleImpl;
                        kotlinx.coroutines.flow.MutableStateFlow<com.zettle.sdk.core.auth.OAuthTokensInternal> mutableStateFlow2 = authModuleImpl2.getHighResolutionOutputSizeshNQ4ISI;
                        authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor = authModuleImpl2;
                        authModuleImpl$clean$1.Camera2StreamConfigurationMap = 3;
                    }
                    return coroutine_suspended;
                }
            }
            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting activeToken to ".concat("null"));
            authModuleImpl.getHighSpeedVideoFpsRangesFor = null;
            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Setting tempToken to ".concat("null"));
            authModuleImpl.getOutputSizes = null;
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            secureStorage = authModuleImpl.getOutputFormats;
            authModuleImpl$clean$1.getHighSpeedVideoFpsRangesFor = authModuleImpl;
            authModuleImpl$clean$1.getHighSpeedVideoSizes = null;
            authModuleImpl$clean$1.Camera2StreamConfigurationMap = 2;
            if (secureStorage.clearAll(authModuleImpl$clean$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        authModuleImpl$clean$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$clean$1(this, continuation);
        java.lang.Object obj2 = authModuleImpl$clean$1.getHighResolutionOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = authModuleImpl$clean$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
    }

    @Override // com.zettle.sdk.core.auth.AuthModule
    public final java.lang.String getRefreshToken() {
        return this.getOutputStallDurationlomOqCM.getString(com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY, null);
    }

    @Override // com.zettle.sdk.core.auth.AuthModule
    public final boolean isLoggedIn() {
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal;
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal2 = this.getHighSpeedVideoFpsRangesFor;
        return (oAuthTokensInternal2 != null && com.zettle.sdk.core.auth.OAuthTokensKt.isValid$default(oAuthTokensInternal2, (java.lang.String[]) null, 10000L, 1, (java.lang.Object) null)) || ((oAuthTokensInternal = this.getOutputSizes) != null && com.zettle.sdk.core.auth.OAuthTokensKt.isValid$default(oAuthTokensInternal, (java.lang.String[]) null, 10000L, 1, (java.lang.Object) null));
    }

    private static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, java.lang.String[] strArr, boolean z, boolean z2, long j, kotlin.coroutines.Continuation continuation, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            j = 30000;
        }
        return authModuleImpl.getHighSpeedVideoSizes(strArr, z3, z2, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fe, code lost:
    
        if (r0 != r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021a, code lost:
    
        if (r0 != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0264, code lost:
    
        if (r0 != r3) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a7, code lost:
    
        if (r0 != r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x034e, code lost:
    
        if (r14.Camera2StreamConfigurationMap(r0, r2) != r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        if (r0 != r3) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02cc A[Catch: all -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00ac, blocks: (B:25:0x004b, B:26:0x02c6, B:29:0x02cc, B:30:0x02e4, B:34:0x02eb, B:36:0x02f4, B:38:0x02fe, B:43:0x031a, B:45:0x0322, B:48:0x0329, B:53:0x02de, B:54:0x035d, B:55:0x0362, B:57:0x005c, B:59:0x02a9, B:61:0x0074, B:63:0x0266, B:65:0x0082, B:67:0x021c, B:69:0x0098, B:71:0x0200, B:73:0x00a6, B:75:0x01b6, B:84:0x0176, B:86:0x017a, B:88:0x0180, B:89:0x0189, B:91:0x018d, B:93:0x0193, B:94:0x019c, B:97:0x01a2, B:101:0x01c0, B:103:0x01fb, B:107:0x0208, B:111:0x0224, B:113:0x0261, B:117:0x026e, B:119:0x02a4, B:123:0x02b0, B:126:0x0363, B:127:0x0368), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02eb A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #4 {all -> 0x00ac, blocks: (B:25:0x004b, B:26:0x02c6, B:29:0x02cc, B:30:0x02e4, B:34:0x02eb, B:36:0x02f4, B:38:0x02fe, B:43:0x031a, B:45:0x0322, B:48:0x0329, B:53:0x02de, B:54:0x035d, B:55:0x0362, B:57:0x005c, B:59:0x02a9, B:61:0x0074, B:63:0x0266, B:65:0x0082, B:67:0x021c, B:69:0x0098, B:71:0x0200, B:73:0x00a6, B:75:0x01b6, B:84:0x0176, B:86:0x017a, B:88:0x0180, B:89:0x0189, B:91:0x018d, B:93:0x0193, B:94:0x019c, B:97:0x01a2, B:101:0x01c0, B:103:0x01fb, B:107:0x0208, B:111:0x0224, B:113:0x0261, B:117:0x026e, B:119:0x02a4, B:123:0x02b0, B:126:0x0363, B:127:0x0368), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0322 A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:25:0x004b, B:26:0x02c6, B:29:0x02cc, B:30:0x02e4, B:34:0x02eb, B:36:0x02f4, B:38:0x02fe, B:43:0x031a, B:45:0x0322, B:48:0x0329, B:53:0x02de, B:54:0x035d, B:55:0x0362, B:57:0x005c, B:59:0x02a9, B:61:0x0074, B:63:0x0266, B:65:0x0082, B:67:0x021c, B:69:0x0098, B:71:0x0200, B:73:0x00a6, B:75:0x01b6, B:84:0x0176, B:86:0x017a, B:88:0x0180, B:89:0x0189, B:91:0x018d, B:93:0x0193, B:94:0x019c, B:97:0x01a2, B:101:0x01c0, B:103:0x01fb, B:107:0x0208, B:111:0x0224, B:113:0x0261, B:117:0x026e, B:119:0x02a4, B:123:0x02b0, B:126:0x0363, B:127:0x0368), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2 A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #4 {all -> 0x00ac, blocks: (B:25:0x004b, B:26:0x02c6, B:29:0x02cc, B:30:0x02e4, B:34:0x02eb, B:36:0x02f4, B:38:0x02fe, B:43:0x031a, B:45:0x0322, B:48:0x0329, B:53:0x02de, B:54:0x035d, B:55:0x0362, B:57:0x005c, B:59:0x02a9, B:61:0x0074, B:63:0x0266, B:65:0x0082, B:67:0x021c, B:69:0x0098, B:71:0x0200, B:73:0x00a6, B:75:0x01b6, B:84:0x0176, B:86:0x017a, B:88:0x0180, B:89:0x0189, B:91:0x018d, B:93:0x0193, B:94:0x019c, B:97:0x01a2, B:101:0x01c0, B:103:0x01fb, B:107:0x0208, B:111:0x0224, B:113:0x0261, B:117:0x026e, B:119:0x02a4, B:123:0x02b0, B:126:0x0363, B:127:0x0368), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String[] strArr, boolean z, boolean z2, long j, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokensInternal> continuation) {
        com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$1 authModuleImpl$fetchTokens$1;
        ?? r4;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object obj;
        boolean z3;
        java.lang.String[] strArr2;
        long j2;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl;
        boolean z4;
        final com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl2;
        java.lang.String[] strArr3;
        kotlinx.coroutines.sync.Mutex mutex3;
        kotlinx.coroutines.sync.Mutex mutex4;
        boolean z5;
        long j3;
        kotlinx.coroutines.sync.Mutex mutex5;
        long j4;
        com.zettle.sdk.core.auth.TokenProvider tokenProvider;
        com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl3;
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal;
        com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken;
        java.lang.String accessToken;
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal2;
        com.zettle.sdk.core.auth.ConnectionTokenProviderResult connectionTokenProviderResult;
        com.zettle.sdk.core.auth.ConnectionOAuthToken token;
        try {
            if (continuation instanceof com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$1) {
                authModuleImpl$fetchTokens$1 = (com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$1) continuation;
                if ((authModuleImpl$fetchTokens$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                    authModuleImpl$fetchTokens$1.getOutputMinFrameDuration -= 2147483648;
                    java.lang.Object obj2 = authModuleImpl$fetchTokens$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = authModuleImpl$fetchTokens$1.getOutputMinFrameDuration;
                    switch (r4) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.sync.Mutex mutex6 = this.getHighSpeedVideoSizesFor;
                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = this;
                            authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = strArr;
                            authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = mutex6;
                            authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI = z;
                            z3 = z2;
                            authModuleImpl$fetchTokens$1.getOutputFormats = z3;
                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRangesFor = j;
                            authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 1;
                            if (mutex6.lock(null, authModuleImpl$fetchTokens$1) != coroutine_suspended) {
                                strArr2 = strArr;
                                j2 = j;
                                mutex2 = mutex6;
                                authModuleImpl = this;
                                z4 = z;
                                if (z3) {
                                    try {
                                        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal3 = authModuleImpl.getOutputSizes;
                                        if (oAuthTokensInternal3 != null && (oAuthTokensInternal3 instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) && ((com.zettle.sdk.core.auth.ConnectionOAuthToken) oAuthTokensInternal3).getFailedToRetrieveToken()) {
                                            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl, "Clearing cached failed token to retry after 401");
                                            kotlinx.coroutines.sync.Mutex mutex7 = authModuleImpl.getOutputMinFrameDuration;
                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl;
                                            authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = strArr2;
                                            authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = mutex2;
                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = mutex7;
                                            authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI = z4;
                                            authModuleImpl$fetchTokens$1.getOutputFormats = z3;
                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRangesFor = j2;
                                            authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 2;
                                            if (mutex7.lock(null, authModuleImpl$fetchTokens$1) != coroutine_suspended) {
                                                long j5 = j2;
                                                authModuleImpl2 = authModuleImpl;
                                                strArr3 = strArr2;
                                                mutex3 = mutex2;
                                                mutex4 = mutex7;
                                                z5 = z3;
                                                j3 = j5;
                                                try {
                                                    com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Setting tempToken to ".concat("null"));
                                                    authModuleImpl2.getOutputSizes = null;
                                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                    mutex4.unlock(null);
                                                    j4 = j3;
                                                    z3 = z5;
                                                    mutex5 = mutex3;
                                                    strArr2 = strArr3;
                                                    if (!z4 && !z3) {
                                                        oAuthTokensInternal = authModuleImpl2.getOutputSizes;
                                                        if (oAuthTokensInternal == null && com.zettle.sdk.core.auth.OAuthTokensKt.isValid(oAuthTokensInternal, strArr2, j4)) {
                                                            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Returning Temp Token");
                                                        } else {
                                                            oAuthTokensInternal = authModuleImpl2.getHighSpeedVideoFpsRangesFor;
                                                            if (oAuthTokensInternal != null && com.zettle.sdk.core.auth.OAuthTokensKt.isValid(oAuthTokensInternal, strArr2, j4)) {
                                                                com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Returning Active Token");
                                                            }
                                                        }
                                                        mutex5.unlock(null);
                                                        return oAuthTokensInternal;
                                                    }
                                                    tokenProvider = authModuleImpl2.getOutputSizeshNQ4ISI;
                                                    if (!(tokenProvider instanceof com.zettle.sdk.core.auth.TokenProviderSuspending)) {
                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                        authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = mutex5;
                                                        authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                        authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 3;
                                                        obj2 = ((com.zettle.sdk.core.auth.TokenProviderSuspending) tokenProvider).provideTokens(strArr2, authModuleImpl$fetchTokens$1);
                                                        break;
                                                    } else if (!(tokenProvider instanceof com.zettle.sdk.core.auth.TokenProviderAsync)) {
                                                        if (tokenProvider instanceof com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending) {
                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                            authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = mutex5;
                                                            authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                            authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 5;
                                                            obj2 = ((com.zettle.sdk.core.auth.PayPalUatTokenProviderSuspending) tokenProvider).provideTokens(strArr2, z3, authModuleImpl$fetchTokens$1);
                                                            break;
                                                        } else if (!(tokenProvider instanceof com.zettle.sdk.core.auth.PayPalUatTokenProviderAsync)) {
                                                            if (!(tokenProvider instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderAsync)) {
                                                                if (!(tokenProvider instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderSuspending)) {
                                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                                }
                                                                authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                                authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = mutex5;
                                                                authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                                                authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                                authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 8;
                                                                obj2 = ((com.zettle.sdk.core.auth.ConnectionTokenProviderSuspending) tokenProvider).provideTokens(authModuleImpl$fetchTokens$1);
                                                                if (obj2 != coroutine_suspended) {
                                                                    authModuleImpl3 = authModuleImpl2;
                                                                    connectionTokenProviderResult = (com.zettle.sdk.core.auth.ConnectionTokenProviderResult) obj2;
                                                                    if (!(connectionTokenProviderResult instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure)) {
                                                                        token = new com.zettle.sdk.core.auth.ConnectionOAuthToken(null, null, 2, null);
                                                                        com.zettle.sdk.core.auth.OAuthTokensKt.failedToRetrieveToken(token);
                                                                    } else {
                                                                        if (!(connectionTokenProviderResult instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success)) {
                                                                            throw new kotlin.NoWhenBranchMatchedException();
                                                                        }
                                                                        token = ((com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Success) connectionTokenProviderResult).getToken();
                                                                    }
                                                                    connectionOAuthToken = token;
                                                                    authModuleImpl2 = authModuleImpl3;
                                                                    if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) && ((com.zettle.sdk.core.auth.ConnectionOAuthToken) connectionOAuthToken).getFailedToRetrieveToken() && authModuleImpl2.getOutputFormats.has(com.zettle.sdk.core.auth.merchant.MerchantConfigKt.USER_CONFIG_KEY)) {
                                                                        com.zettle.sdk.core.log.LogKt.log(authModuleImpl2, "Performing force no-token login");
                                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = mutex5;
                                                                        authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = connectionOAuthToken;
                                                                        authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                                        authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 9;
                                                                        if (authModuleImpl2.getHighSpeedVideoFpsRanges(authModuleImpl$fetchTokens$1) == coroutine_suspended) {
                                                                        }
                                                                        oAuthTokensInternal2 = connectionOAuthToken;
                                                                        mutex = mutex5;
                                                                    } else {
                                                                        accessToken = connectionOAuthToken.getAccessToken();
                                                                        if (accessToken != null && !kotlin.text.StringsKt.isBlank(accessToken)) {
                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Try persisting token ");
                                                                            sb.append(connectionOAuthToken);
                                                                            com.zettle.sdk.core.log.LogKt.log(authModuleImpl2, sb.toString());
                                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = mutex5;
                                                                            authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = connectionOAuthToken;
                                                                            authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                                            authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 10;
                                                                            break;
                                                                        }
                                                                        oAuthTokensInternal = connectionOAuthToken;
                                                                        mutex5.unlock(null);
                                                                        return oAuthTokensInternal;
                                                                    }
                                                                    mutex5 = mutex;
                                                                    oAuthTokensInternal = oAuthTokensInternal2;
                                                                    mutex5.unlock(null);
                                                                    return oAuthTokensInternal;
                                                                }
                                                            } else {
                                                                authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                                authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = mutex5;
                                                                authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = authModuleImpl$fetchTokens$1;
                                                                authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                                                authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 7;
                                                                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(authModuleImpl$fetchTokens$1), 1);
                                                                cancellableContinuationImpl.initCancellability();
                                                                final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                                                                ((com.zettle.sdk.core.auth.ConnectionTokenProviderAsync) authModuleImpl2.getOutputSizeshNQ4ISI).provideTokens(new com.zettle.sdk.core.auth.ConnectionTokenProviderCallback() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$2$tokens$3$1
                                                                    @Override // com.zettle.sdk.core.auth.ConnectionTokenProviderCallback
                                                                    public final void onSuccess(com.zettle.sdk.core.auth.ConnectionOAuthToken token2) {
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token2, "");
                                                                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.auth.OAuthTokensInternal> cancellableContinuation = cancellableContinuationImpl2;
                                                                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                                                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(token2));
                                                                    }

                                                                    @Override // com.zettle.sdk.core.auth.ConnectionTokenProviderCallback
                                                                    public final void onFailure(com.zettle.sdk.core.auth.TokenRetrievalException exception) {
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
                                                                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.auth.OAuthTokensInternal> cancellableContinuation = cancellableContinuationImpl2;
                                                                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                                                        com.zettle.sdk.core.auth.ConnectionOAuthToken connectionOAuthToken2 = new com.zettle.sdk.core.auth.ConnectionOAuthToken(null, null, 2, null);
                                                                        com.zettle.sdk.core.auth.OAuthTokensKt.failedToRetrieveToken(connectionOAuthToken2);
                                                                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(connectionOAuthToken2));
                                                                    }
                                                                });
                                                                obj2 = cancellableContinuationImpl.getResult();
                                                                if (obj2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(authModuleImpl$fetchTokens$1);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                            authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = strArr2;
                                                            authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = mutex5;
                                                            authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = authModuleImpl$fetchTokens$1;
                                                            authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI = z3;
                                                            authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 6;
                                                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(authModuleImpl$fetchTokens$1), 1);
                                                            cancellableContinuationImpl3.initCancellability();
                                                            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl3;
                                                            com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Getting tokens from provider");
                                                            ((com.zettle.sdk.core.auth.PayPalUatTokenProviderAsync) authModuleImpl2.getOutputSizeshNQ4ISI).provideTokens(strArr2, z3, new kotlin.jvm.functions.Function1<com.zettle.sdk.core.auth.PayPalUatOAuthTokens, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$2$tokens$2$1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.core.auth.PayPalUatOAuthTokens payPalUatOAuthTokens) {
                                                                    getHighResolutionOutputSizeshNQ4ISI(payPalUatOAuthTokens);
                                                                    return kotlin.Unit.INSTANCE;
                                                                }

                                                                public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.core.auth.PayPalUatOAuthTokens payPalUatOAuthTokens) {
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalUatOAuthTokens, "");
                                                                    com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.core.auth.AuthModuleImpl.this, "Got tokens from provider ".concat(java.lang.String.valueOf(payPalUatOAuthTokens)));
                                                                    kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.auth.OAuthTokensInternal> cancellableContinuation = cancellableContinuationImpl4;
                                                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                                                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(payPalUatOAuthTokens));
                                                                }

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(1);
                                                                }
                                                            });
                                                            obj2 = cancellableContinuationImpl3.getResult();
                                                            if (obj2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(authModuleImpl$fetchTokens$1);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = authModuleImpl2;
                                                        authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = strArr2;
                                                        authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = mutex5;
                                                        authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = authModuleImpl$fetchTokens$1;
                                                        authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 4;
                                                        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl5 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(authModuleImpl$fetchTokens$1), 1);
                                                        cancellableContinuationImpl5.initCancellability();
                                                        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl6 = cancellableContinuationImpl5;
                                                        com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Getting tokens from provider");
                                                        ((com.zettle.sdk.core.auth.TokenProviderAsync) authModuleImpl2.getOutputSizeshNQ4ISI).provideTokens(strArr2, new kotlin.jvm.functions.Function1<com.zettle.sdk.core.auth.OAuthTokens, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$2$tokens$1$1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.core.auth.OAuthTokens oAuthTokens) {
                                                                getHighSpeedVideoFpsRangesFor(oAuthTokens);
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.core.auth.OAuthTokens oAuthTokens) {
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
                                                                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.core.auth.AuthModuleImpl.this, "Got tokens from provider ".concat(java.lang.String.valueOf(oAuthTokens)));
                                                                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.auth.OAuthTokensInternal> cancellableContinuation = cancellableContinuationImpl6;
                                                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(oAuthTokens));
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }
                                                        });
                                                        obj2 = cancellableContinuationImpl5.getResult();
                                                        if (obj2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(authModuleImpl$fetchTokens$1);
                                                            break;
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th) {
                                                    mutex4.unlock(null);
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        mutex = mutex2;
                                        obj = null;
                                        mutex.unlock(obj);
                                        throw th;
                                    }
                                }
                                mutex5 = mutex2;
                                j4 = j2;
                                authModuleImpl2 = authModuleImpl;
                                if (!z4) {
                                    oAuthTokensInternal = authModuleImpl2.getOutputSizes;
                                    if (oAuthTokensInternal == null) {
                                    }
                                    oAuthTokensInternal = authModuleImpl2.getHighSpeedVideoFpsRangesFor;
                                    if (oAuthTokensInternal != null) {
                                        com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Returning Active Token");
                                        mutex5.unlock(null);
                                        return oAuthTokensInternal;
                                    }
                                }
                                tokenProvider = authModuleImpl2.getOutputSizeshNQ4ISI;
                                if (!(tokenProvider instanceof com.zettle.sdk.core.auth.TokenProviderSuspending)) {
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            long j6 = authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRangesFor;
                            boolean z6 = authModuleImpl$fetchTokens$1.getOutputFormats;
                            z4 = authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI;
                            mutex2 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap;
                            strArr2 = (java.lang.String[]) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl4 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl = authModuleImpl4;
                            j2 = j6;
                            z3 = z6;
                            if (z3) {
                            }
                            mutex5 = mutex2;
                            j4 = j2;
                            authModuleImpl2 = authModuleImpl;
                            if (!z4) {
                            }
                            tokenProvider = authModuleImpl2.getOutputSizeshNQ4ISI;
                            if (!(tokenProvider instanceof com.zettle.sdk.core.auth.TokenProviderSuspending)) {
                            }
                            return coroutine_suspended;
                        case 2:
                            j3 = authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRangesFor;
                            z5 = authModuleImpl$fetchTokens$1.getOutputFormats;
                            z4 = authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI;
                            mutex4 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap;
                            strArr3 = (java.lang.String[]) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            authModuleImpl2 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                com.zettle.sdk.core.log.LogKt.debug(authModuleImpl2, "Setting tempToken to ".concat("null"));
                                authModuleImpl2.getOutputSizes = null;
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                mutex4.unlock(null);
                                j4 = j3;
                                z3 = z5;
                                mutex5 = mutex3;
                                strArr2 = strArr3;
                                if (!z4) {
                                }
                                tokenProvider = authModuleImpl2.getOutputSizeshNQ4ISI;
                                if (!(tokenProvider instanceof com.zettle.sdk.core.auth.TokenProviderSuspending)) {
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                mutex = mutex3;
                                obj = null;
                                mutex.unlock(obj);
                                throw th;
                            }
                        case 3:
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl5 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl2 = authModuleImpl5;
                            connectionOAuthToken = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj2;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                                break;
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Try persisting token ");
                                sb2.append(connectionOAuthToken);
                                com.zettle.sdk.core.log.LogKt.log(authModuleImpl2, sb2.toString());
                                authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges = mutex5;
                                authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI = connectionOAuthToken;
                                authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap = null;
                                authModuleImpl$fetchTokens$1.getHighSpeedVideoSizes = null;
                                authModuleImpl$fetchTokens$1.getOutputMinFrameDuration = 10;
                                break;
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 4:
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl6 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl2 = authModuleImpl6;
                            connectionOAuthToken = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj2;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 5:
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl7 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl2 = authModuleImpl7;
                            connectionOAuthToken = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj2;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 6:
                            boolean z7 = authModuleImpl$fetchTokens$1.getInputSizeshNQ4ISI;
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.Camera2StreamConfigurationMap;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl8 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl2 = authModuleImpl8;
                            connectionOAuthToken = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj2;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 7:
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl9 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            authModuleImpl2 = authModuleImpl9;
                            connectionOAuthToken = (com.zettle.sdk.core.auth.OAuthTokensInternal) obj2;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 8:
                            mutex5 = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            authModuleImpl3 = (com.zettle.sdk.core.auth.AuthModuleImpl) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            connectionTokenProviderResult = (com.zettle.sdk.core.auth.ConnectionTokenProviderResult) obj2;
                            if (!(connectionTokenProviderResult instanceof com.zettle.sdk.core.auth.ConnectionTokenProviderResult.Failure)) {
                            }
                            connectionOAuthToken = token;
                            authModuleImpl2 = authModuleImpl3;
                            if (!(connectionOAuthToken instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken)) {
                            }
                            accessToken = connectionOAuthToken.getAccessToken();
                            if (accessToken != null) {
                            }
                            oAuthTokensInternal = connectionOAuthToken;
                            mutex5.unlock(null);
                            return oAuthTokensInternal;
                        case 9:
                        case 10:
                            oAuthTokensInternal2 = (com.zettle.sdk.core.auth.OAuthTokensInternal) authModuleImpl$fetchTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                            mutex = (kotlinx.coroutines.sync.Mutex) authModuleImpl$fetchTokens$1.getHighSpeedVideoFpsRanges;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                mutex5 = mutex;
                                oAuthTokensInternal = oAuthTokensInternal2;
                                mutex5.unlock(null);
                                return oAuthTokensInternal;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                obj = null;
                                mutex.unlock(obj);
                                throw th;
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r4) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            mutex = r4;
        }
        authModuleImpl$fetchTokens$1 = new com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$1(this, continuation);
        java.lang.Object obj22 = authModuleImpl$fetchTokens$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = authModuleImpl$fetchTokens$1.getOutputMinFrameDuration;
    }

    public final void initialRefreshers(okhttp3.OkHttpClient client, com.zettle.sdk.core.auth.ServiceProvider serviceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        this.getInputFormats = client;
        this.getInputSizeshNQ4ISI = serviceProvider;
    }

    public static final /* synthetic */ java.lang.Object access$refreshTokens(final com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, okhttp3.Request request, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() { // from class: com.zettle.sdk.core.auth.AuthModuleImpl$refreshTokens$2$callback$1
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.core.auth.AuthModuleImpl.this, "onFailure");
                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.network.HttpPayload<com.zettle.sdk.core.auth.OAuthTokens>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e)));
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[Catch: all -> 0x00b6, LOOP:0: B:10:0x0048->B:12:0x004e, LOOP_END, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0011, B:5:0x0019, B:9:0x0023, B:10:0x0048, B:12:0x004e, B:14:0x0074, B:18:0x0083, B:19:0x00aa, B:26:0x0098), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x0011, B:5:0x0019, B:9:0x0023, B:10:0x0048, B:12:0x004e, B:14:0x0074, B:18:0x0083, B:19:0x00aa, B:26:0x0098), top: B:2:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                java.lang.Object m23436constructorimpl;
                okhttp3.ResponseBody body;
                java.lang.String str;
                java.lang.String string;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.core.auth.AuthModuleImpl.this, "onResponse");
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    body = response.body();
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (body != null && (string = body.string()) != null) {
                    str = string;
                    int code = response.code();
                    java.lang.String message = response.message();
                    java.util.List<kotlin.Pair> list = kotlin.collections.CollectionsKt.toList(response.headers());
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (kotlin.Pair pair : list) {
                        java.lang.Object first = pair.getFirst();
                        java.lang.Object second = pair.getSecond();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(first);
                        sb.append(": ");
                        sb.append(second);
                        arrayList.add(sb.toString());
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    int code2 = response.code();
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.zettle.sdk.core.network.HttpPayload(code, message, arrayList2, str, (200 <= code2 || code2 >= 300) ? code2 != 499 ? com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.auth.OAuthTokens.INSTANCE.serializer(), str) : null : com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.auth.OAuthTokens.INSTANCE.serializer(), str)));
                    cancellableContinuationImpl2.resumeWith(m23436constructorimpl);
                }
                str = "";
                int code3 = response.code();
                java.lang.String message2 = response.message();
                java.util.List<kotlin.Pair> list2 = kotlin.collections.CollectionsKt.toList(response.headers());
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                while (r8.hasNext()) {
                }
                java.util.ArrayList arrayList22 = arrayList3;
                int code22 = response.code();
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.zettle.sdk.core.network.HttpPayload(code3, message2, arrayList22, str, (200 <= code22 || code22 >= 300) ? code22 != 499 ? com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.auth.OAuthTokens.INSTANCE.serializer(), str) : null : com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.auth.OAuthTokens.INSTANCE.serializer(), str)));
                cancellableContinuationImpl2.resumeWith(m23436constructorimpl);
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor();
    }
}
