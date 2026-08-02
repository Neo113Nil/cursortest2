package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthModule;", "Lcom/zettle/sdk/core/Module;", "Lcom/zettle/sdk/core/auth/AuthStateProvider;", "", "invalidate", "", "clean", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "isRetryAfter401", "", "minimumTtlMillis", "Lcom/zettle/sdk/core/auth/OAuthTokensInternal;", "getAccessToken", "(Lcom/zettle/sdk/commons/network/Scope;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/OkHttpClient;", "client", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lkotlin/Result;", "", "refresh-0E7RQCE", "(Lokhttp3/OkHttpClient;Lcom/zettle/sdk/core/auth/ServiceProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "forced", "verify-0E7RQCE", "(Lcom/zettle/sdk/commons/network/Scope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verify", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/core/auth/LoggedInState;", "getAuthFlow", "()Lkotlinx/coroutines/flow/Flow;", "authFlow", "isLoggedIn", "()Z", "", "getRefreshToken", "()Ljava/lang/String;", "refreshToken", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "getScopeProvider", "()Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AuthModule extends com.zettle.sdk.core.Module, com.zettle.sdk.core.auth.AuthStateProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.AuthModule.Companion INSTANCE = com.zettle.sdk.core.auth.AuthModule.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Object clean(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getAccessToken(com.zettle.sdk.commons.network.Scope scope, boolean z, long j, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.OAuthTokensInternal> continuation);

    kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.LoggedInState> getAuthFlow();

    java.lang.String getRefreshToken();

    com.zettle.sdk.core.auth.ScopeProvider getScopeProvider();

    boolean isLoggedIn();

    /* renamed from: refresh-0E7RQCE, reason: not valid java name */
    java.lang.Object mo23158refresh0E7RQCE(okhttp3.OkHttpClient okHttpClient, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Integer>> continuation);

    /* renamed from: verify-0E7RQCE, reason: not valid java name */
    java.lang.Object mo23159verify0E7RQCE(com.zettle.sdk.commons.network.Scope scope, boolean z, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.auth.AuthModule authModule) {
            com.zettle.sdk.core.Module.DefaultImpls.start(authModule);
        }

        public static void stop(com.zettle.sdk.core.auth.AuthModule authModule) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(authModule);
        }

        public static /* synthetic */ java.lang.Object getAccessToken$default(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.commons.network.Scope scope, boolean z, long j, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccessToken");
            }
            if ((i & 1) != 0) {
                scope = com.zettle.sdk.commons.network.Scope.Payment;
            }
            com.zettle.sdk.commons.network.Scope scope2 = scope;
            if ((i & 4) != 0) {
                j = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
            }
            return authModule.getAccessToken(scope2, z, j, continuation);
        }

        /* renamed from: verify-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m23160verify0E7RQCE$default(com.zettle.sdk.core.auth.AuthModule authModule, com.zettle.sdk.commons.network.Scope scope, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verify-0E7RQCE");
            }
            if ((i & 1) != 0) {
                scope = com.zettle.sdk.commons.network.Scope.Payment;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return authModule.mo23159verify0E7RQCE(scope, z, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthModule$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/auth/AuthModule;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "getScope$core_publicRelease", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.AuthModule.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.core.auth.AuthModule.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.auth.AuthModule> TYPE = com.zettle.sdk.core.auth.AuthModule.class;
        private static final kotlinx.coroutines.CoroutineScope scope = com.zettle.sdk.core.ZettleScopeKt.getAsMonitored(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO()).plus(new kotlinx.coroutines.CoroutineName("zdk:auth"))));

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.auth.AuthModule> getTYPE$core_publicRelease() {
            return TYPE;
        }

        public final kotlinx.coroutines.CoroutineScope getScope$core_publicRelease() {
            return scope;
        }
    }
}
