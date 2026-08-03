package com.unity3d.ads.core.domain;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J#\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J-\u00105\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096Bø\u0001\u0000¢\u0006\u0002\u00106J&\u00107\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u000109H\u0002J\u0010\u0010;\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0018\u0010<\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010=\u001a\u000209H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u00020*ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonInitAwaitingGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetAsyncHeaderBiddingToken;", "getHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "getAwaitInitialization", "()Lcom/unity3d/ads/core/domain/AwaitInitialization;", "didAwaitInit", "", "getGetHeaderBiddingToken", "()Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "getListener", "()Lcom/unity3d/ads/IUnityAdsTokenListener;", "setListener", "(Lcom/unity3d/ads/IUnityAdsTokenListener;)V", "getLogger", "()Lcom/unity3d/ads/core/log/Logger;", "getSafeCallbackInvoke", "()Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "getSendDiagnosticEvent", "()Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "startState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "startTime", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "getStartTime-z9LOYto", "()J", "J", "fetchToken", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/ads/IUnityAdsTokenListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenFailure", "reason", "", "reasonDebug", "tokenStart", "tokenSuccess", "token", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken {
    private final com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private com.unity3d.ads.IUnityAdsTokenListener listener;
    private final com.unity3d.ads.core.log.Logger logger;
    private final com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private com.unity3d.ads.core.data.model.InitializationState startState;
    private final long startTime;

    public CommonInitAwaitingGetHeaderBiddingToken(com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.domain.SafeCallbackInvoke safeCallbackInvoke, com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
    }

    public final com.unity3d.ads.core.domain.GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final com.unity3d.ads.core.domain.SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final com.unity3d.ads.core.domain.GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final com.unity3d.ads.core.domain.AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final com.unity3d.ads.core.data.repository.SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    public final com.unity3d.ads.core.domain.SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final com.unity3d.ads.core.log.Logger getLogger() {
        return this.logger;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name and from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    public final com.unity3d.ads.IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final void setListener(com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(int i, com.unity3d.ads.TokenConfiguration tokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener iUnityAdsTokenListener, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 commonInitAwaitingGetHeaderBiddingToken$invoke$1;
        int i2;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) {
            commonInitAwaitingGetHeaderBiddingToken$invoke$1 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1) continuation;
            if ((commonInitAwaitingGetHeaderBiddingToken$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.listener = iUnityAdsTokenListener;
                    tokenStart(i);
                    if (iUnityAdsTokenListener == null) {
                        tokenFailure(i, "listener_null", "IUnityAdsTokenListener is null");
                        return kotlin.Unit.INSTANCE;
                    }
                    if (!this.sessionRepository.getShouldInitialize()) {
                        tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize");
                        return kotlin.Unit.INSTANCE;
                    }
                    long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
                    com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 commonInitAwaitingGetHeaderBiddingToken$invoke$2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2(this, null);
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = this;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1 = tokenConfiguration;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 1;
                    if (kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(getTokenTimeoutMs, commonInitAwaitingGetHeaderBiddingToken$invoke$2, commonInitAwaitingGetHeaderBiddingToken$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonInitAwaitingGetHeaderBiddingToken = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$invoke$1.I$0;
                    tokenConfiguration = (com.unity3d.ads.TokenConfiguration) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1;
                    commonInitAwaitingGetHeaderBiddingToken = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (commonInitAwaitingGetHeaderBiddingToken.sessionRepository.getShouldInitialize()) {
                    commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, "gateway", "!sessionRepository.shouldInitialize");
                    return kotlin.Unit.INSTANCE;
                }
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$0 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.L$1 = null;
                commonInitAwaitingGetHeaderBiddingToken$invoke$1.label = 2;
                if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$invoke$1 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1(this, continuation);
        java.lang.Object obj2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        if (commonInitAwaitingGetHeaderBiddingToken.sessionRepository.getShouldInitialize()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchToken(int i, com.unity3d.ads.TokenConfiguration tokenConfiguration, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 commonInitAwaitingGetHeaderBiddingToken$fetchToken$1;
        int i2;
        java.lang.String str;
        com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        java.lang.String shortenedStackTrace$default;
        java.lang.String str2;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) {
            commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1) continuation;
            if ((commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label & Integer.MIN_VALUE) != 0) {
                commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
                str = null;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        com.unity3d.ads.core.domain.GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0 = this;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0 = i;
                        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label = 1;
                        obj = getHeaderBiddingToken.invoke(i, tokenConfiguration, commonInitAwaitingGetHeaderBiddingToken$fetchToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        commonInitAwaitingGetHeaderBiddingToken = this;
                    } catch (java.lang.Exception e) {
                        e = e;
                        commonInitAwaitingGetHeaderBiddingToken = this;
                        shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                        str2 = "uncaught_exception";
                        if (str != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.I$0;
                    commonInitAwaitingGetHeaderBiddingToken = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        shortenedStackTrace$default = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                        str2 = "uncaught_exception";
                        if (str != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                str2 = null;
                str = (java.lang.String) obj;
                shortenedStackTrace$default = null;
                if (str != null) {
                    commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str2, shortenedStackTrace$default);
                } else {
                    commonInitAwaitingGetHeaderBiddingToken.tokenSuccess(i, str);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        commonInitAwaitingGetHeaderBiddingToken$fetchToken$1 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1(this, continuation);
        java.lang.Object obj2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonInitAwaitingGetHeaderBiddingToken$fetchToken$1.label;
        str = null;
        if (i2 != 0) {
        }
        str2 = null;
        str = (java.lang.String) obj2;
        shortenedStackTrace$default = null;
        if (str != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void tokenSuccess(int tokenNumber, final java.lang.String token) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.startTime))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", "false"), kotlin.TuplesKt.to("state", java.lang.String.valueOf(this.startState)), kotlin.TuplesKt.to("complete_state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), kotlin.TuplesKt.to("awaited_init", java.lang.String.valueOf(this.didAwaitInit))), null, null, java.lang.Integer.valueOf(tokenNumber), 24, null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.IUnityAdsTokenListener listener = com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(token);
                }
            }
        });
    }

    static /* synthetic */ void tokenFailure$default(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2);
    }

    private final void tokenFailure(int tokenNumber, java.lang.String reason, java.lang.String reasonDebug) {
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        java.lang.Double valueOf = java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(this.startTime)));
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("sync", "false");
        createMapBuilder.put("state", java.lang.String.valueOf(this.startState));
        createMapBuilder.put("complete_state", com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        createMapBuilder.put("awaited_init", java.lang.String.valueOf(this.didAwaitInit));
        if (reason != null) {
        }
        if (reasonDebug != null) {
            createMapBuilder.put("reason_debug", reasonDebug);
        }
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, kotlin.collections.MapsKt.build(createMapBuilder), null, null, java.lang.Integer.valueOf(tokenNumber), 24, null);
        com.unity3d.ads.core.log.Logger.DefaultImpls.error$default(this.logger, "Returned nil token due to: " + reason, null, 2, null);
        this.safeCallbackInvoke.invoke(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.unity3d.ads.IUnityAdsTokenListener listener = com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(null);
                }
            }
        });
    }

    private final void tokenStart(int tokenNumber) {
        this.logger.info("Token generation started");
        this.startState = com.unity3d.ads.core.domain.GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sync", "false"), kotlin.TuplesKt.to("state", java.lang.String.valueOf(this.startState))), null, null, java.lang.Integer.valueOf(tokenNumber), 26, null);
    }
}
