package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00188WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0083D¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthInterceptorCustomProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/AuthModule;", "authModule", "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;)V", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/auth/AuthModule;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "", "Ljava/lang/String;", "", "getHighSpeedVideoSizes", "J", "getLogTag", "()Ljava/lang/String;", "logTag", "", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthInterceptorCustomProvider implements com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor, com.zettle.sdk.core.log.Loggable {
    private final /* synthetic */ com.zettle.sdk.core.log.Loggable Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoFpsRangesFor;
    private volatile long getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    public AuthInterceptorCustomProvider(com.zettle.sdk.core.auth.AuthModule authModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
        this.getHighSpeedVideoFpsRangesFor = authModule;
        this.Camera2StreamConfigurationMap = com.zettle.sdk.core.log.LogKt.loggable$default("AuthInterceptor2", null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.Camera2StreamConfigurationMap = 3000;
    }

    @Override // okhttp3.Authenticator
    public final okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (response.priorResponse() != null) {
            com.zettle.sdk.core.log.LogKt.debug(this, "#!# authenticate call - already retried once, give up. In real life, never give up!");
            return null;
        }
        com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider = this;
        com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# authenticate call - ".concat(java.lang.String.valueOf(route != null ? route.address() : null)));
        com.zettle.sdk.commons.network.Scope scope = (com.zettle.sdk.commons.network.Scope) response.request().tag(com.zettle.sdk.commons.network.Scope.class);
        if (scope == null) {
            scope = com.zettle.sdk.commons.network.Scope.Payment;
        }
        com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# authenticate call - scope ".concat(java.lang.String.valueOf(scope)));
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$authenticate$accessToken$1(this, scope, null), 1, null);
        java.lang.String str = (java.lang.String) runBlocking$default;
        okhttp3.Request.Builder newBuilder = response.request().newBuilder();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        okhttp3.Request.Builder header = newBuilder.header("Authorization", format);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format2 = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        return header.header(com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt.PAYPAL_AUTHORIZATION, format2).build();
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        com.zettle.sdk.commons.network.Scope scope = (com.zettle.sdk.commons.network.Scope) request.tag(com.zettle.sdk.commons.network.Scope.class);
        if (scope == null) {
            scope = com.zettle.sdk.commons.network.Scope.Payment;
        }
        com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider authInterceptorCustomProvider = this;
        com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# intercept call - ".concat(java.lang.String.valueOf(request)));
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.zettle.sdk.interceptors.auth.AuthInterceptorCustomProvider$intercept$oAuthToken$1(this, scope, null), 1, null);
        com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal = (com.zettle.sdk.core.auth.OAuthTokensInternal) runBlocking$default;
        java.lang.String accessToken = oAuthTokensInternal.getAccessToken();
        if ((oAuthTokensInternal instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken) && ((com.zettle.sdk.core.auth.ConnectionOAuthToken) oAuthTokensInternal).getFailedToRetrieveToken() && accessToken == null) {
            com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# intercept call - token retrieval failed");
            return new okhttp3.Response.Builder().request(request).protocol(okhttp3.Protocol.HTTP_1_1).code(499).message("Failed to retrieve token").body(okhttp3.ResponseBody.INSTANCE.create("{\"error\":\"Failed to retrieve token\"}", okhttp3.MediaType.INSTANCE.get("application/json"))).build();
        }
        if (accessToken == null) {
            com.zettle.sdk.core.log.LogKt.debug(authInterceptorCustomProvider, "#!# intercept call - null token provided");
            return new okhttp3.Response.Builder().request(request).protocol(okhttp3.Protocol.HTTP_1_1).code(400).message("Null token provided").body(okhttp3.ResponseBody.INSTANCE.create("{\"error\":\"Null token provided\"}", okhttp3.MediaType.INSTANCE.get("application/json"))).build();
        }
        okhttp3.Request.Builder newBuilder = request.newBuilder();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessToken}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        okhttp3.Request.Builder header = newBuilder.header("Authorization", format);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format2 = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessToken}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        return chain.proceed(header.header(com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt.PAYPAL_AUTHORIZATION, format2).build());
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.Camera2StreamConfigurationMap.getGetHighSpeedVideoFpsRangesFor();
    }
}
