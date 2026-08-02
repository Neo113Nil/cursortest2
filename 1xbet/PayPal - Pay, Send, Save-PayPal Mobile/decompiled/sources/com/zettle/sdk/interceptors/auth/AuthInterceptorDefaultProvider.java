package com.zettle.sdk.interceptors.auth;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019"}, d2 = {"Lcom/zettle/sdk/interceptors/auth/AuthInterceptorDefaultProvider;", "Lcom/zettle/sdk/interceptors/auth/AuthenticatorInterceptor;", "Lcom/zettle/sdk/core/auth/AuthProvider;", "authProvider", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "<init>", "(Lcom/zettle/sdk/core/auth/AuthProvider;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;)V", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/auth/AuthProvider;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthInterceptorDefaultProvider implements com.zettle.sdk.interceptors.auth.AuthenticatorInterceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.AuthProvider getHighSpeedVideoFpsRanges;

    public AuthInterceptorDefaultProvider(com.zettle.sdk.core.auth.AuthProvider authProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        this.getHighSpeedVideoFpsRanges = authProvider;
        this.getHighSpeedVideoSizes = merchantConfig;
    }

    @Override // okhttp3.Authenticator
    public final okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (response.priorResponse() != null) {
            return null;
        }
        com.izettle.android.core.data.result.Success refreshAccessToken = this.getHighSpeedVideoFpsRanges.refreshAccessToken();
        if (refreshAccessToken instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.auth.model.OAuthTokens oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) ((com.izettle.android.core.data.result.Success) refreshAccessToken).getValue();
            okhttp3.Request.Builder newBuilder = response.request().newBuilder();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String accessToken = oAuthTokens.getAccessToken();
            java.lang.String format = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessToken != null ? getHighResolutionOutputSizeshNQ4ISI(accessToken) : null}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            refreshAccessToken = new com.izettle.android.core.data.result.Success(newBuilder.header("Authorization", format).build());
        } else if (!(refreshAccessToken instanceof com.izettle.android.core.data.result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return (okhttp3.Request) com.izettle.android.core.data.result.ResultKt.getOrNull(refreshAccessToken);
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        com.zettle.sdk.commons.network.Scope scope = (com.zettle.sdk.commons.network.Scope) request.tag(com.zettle.sdk.commons.network.Scope.class);
        if (scope == null) {
            scope = com.zettle.sdk.commons.network.Scope.Payment;
        }
        okhttp3.Request.Builder newBuilder = request.newBuilder();
        java.lang.String accessTokenOrNull$default = com.zettle.sdk.core.auth.AuthProvider.DefaultImpls.getAccessTokenOrNull$default(this.getHighSpeedVideoFpsRanges, scope, false, 2, null);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessTokenOrNull$default != null ? getHighResolutionOutputSizeshNQ4ISI(accessTokenOrNull$default) : null}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        newBuilder.header("Authorization", format);
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format2 = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessTokenOrNull$default != null ? getHighResolutionOutputSizeshNQ4ISI(accessTokenOrNull$default) : null}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
        newBuilder.header(com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt.PAYPAL_AUTHORIZATION, format2);
        return chain.proceed(newBuilder.build());
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String userUUID;
        com.izettle.android.auth.dto.Jwt decodeAsJwtOrNull;
        com.izettle.android.auth.dto.JwtUser user;
        java.lang.String userId;
        java.lang.Object mo23163getUserConfigd1pmJ48 = this.getHighSpeedVideoSizes.mo23163getUserConfigd1pmJ48();
        if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48)) {
            mo23163getUserConfigd1pmJ48 = null;
        }
        com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) mo23163getUserConfigd1pmJ48;
        if (userConfig == null || (userUUID = userConfig.getUserUUID()) == null || (decodeAsJwtOrNull = com.izettle.android.auth.dto.JwtKt.decodeAsJwtOrNull(str)) == null || (user = decodeAsJwtOrNull.getUser()) == null || (userId = user.getUserId()) == null || kotlin.jvm.internal.Intrinsics.areEqual(userUUID, userId)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TSU-3901: Token mismatch with current logged-in user Expected ");
        sb.append(userUUID);
        sb.append(" Actual ");
        sb.append(userId);
        java.io.IOException iOException = new java.io.IOException(sb.toString());
        com.zettle.sdk.interceptors.auth.AuthenticatorInterceptorKt.getAuthInterceptor(com.zettle.sdk.commons.util.Log.INSTANCE).e("TSU-3901: Token mismatch with current logged-in user", new com.zettle.sdk.core.HealthMonitorException("TSU-3901", "TSU-3901: Token mismatch with current logged-in user", iOException));
        throw iOException;
    }
}
