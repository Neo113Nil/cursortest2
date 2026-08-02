package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ!\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010!"}, d2 = {"Lcom/izettle/android/auth/okhttp/ZettleOAuthInterceptor;", "Lokhttp3/Authenticator;", "Lokhttp3/Interceptor;", "Lcom/izettle/android/auth/ZettleAuth;", "zettleAuth", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "Lcom/izettle/android/auth/okhttp/AccessTokenResolver;", "accessTokenResolver", "(Lcom/izettle/android/auth/okhttp/AccessTokenResolver;)V", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "Lokhttp3/Request$Builder;", "requestBuilder", "addTokenToRequest$ext_okhttp_release", "(Ljava/lang/String;Lokhttp3/Request$Builder;)Lokhttp3/Request$Builder;", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "Ljava/lang/Class;", "getInvocationClass$ext_okhttp_release", "()Ljava/lang/Class;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "responseCount", "(Lokhttp3/Response;)I", "Lcom/izettle/android/auth/okhttp/AccessTokenResolver;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ZettleOAuthInterceptor implements okhttp3.Authenticator, okhttp3.Interceptor {
    public static final java.lang.String AUTHORIZATION = "Authorization";
    public static final java.lang.String AUTHORIZATION_NONE = "NONE";
    public static final java.lang.String AUTHORIZATION_VALUE = "Bearer %s";
    public static final int RETRIES = 3;
    private final com.izettle.android.auth.okhttp.AccessTokenResolver accessTokenResolver;

    public ZettleOAuthInterceptor(com.izettle.android.auth.okhttp.AccessTokenResolver accessTokenResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenResolver, "");
        this.accessTokenResolver = accessTokenResolver;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZettleOAuthInterceptor(final com.izettle.android.auth.ZettleAuth zettleAuth) {
        this(new com.izettle.android.auth.okhttp.AccessTokenResolver() { // from class: com.izettle.android.auth.okhttp.ZettleOAuthInterceptor.1
            @Override // com.izettle.android.auth.okhttp.AccessTokenResolver
            public final java.lang.String resolve(java.lang.String... scopes) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
                return com.izettle.android.auth.ZettleAuth.DefaultImpls.getAccessTokenOrNull$default(com.izettle.android.auth.ZettleAuth.this, (java.lang.String[]) java.util.Arrays.copyOf(scopes, scopes.length), false, 2, null);
            }

            @Override // com.izettle.android.auth.okhttp.AccessTokenResolver
            public final java.lang.String refresh() {
                com.izettle.android.auth.model.OAuthTokens oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) com.izettle.android.core.data.result.ResultKt.getOrNull(com.izettle.android.auth.ZettleAuth.this.refreshAccessToken());
                if (oAuthTokens != null) {
                    return oAuthTokens.getAccessToken();
                }
                return null;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
    }

    private final int responseCount(okhttp3.Response response) {
        int i = 1;
        for (okhttp3.Response priorResponse = response != null ? response.priorResponse() : null; priorResponse != null; priorResponse = priorResponse.priorResponse()) {
            i++;
        }
        return i;
    }

    public final java.lang.Class<?> getInvocationClass$ext_okhttp_release() {
        java.lang.Class<?> cls = java.lang.Class.forName("retrofit2.Invocation");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
        return cls;
    }

    public final okhttp3.Request.Builder addTokenToRequest$ext_okhttp_release(java.lang.String accessToken, okhttp3.Request.Builder requestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBuilder, "");
        if (accessToken == null) {
            return requestBuilder;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("Bearer %s", java.util.Arrays.copyOf(new java.lang.Object[]{accessToken}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return requestBuilder.header("Authorization", format);
    }

    @Override // okhttp3.Authenticator
    public final okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) {
        java.lang.String refresh;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (responseCount(response) < 3 && (refresh = this.accessTokenResolver.refresh()) != null) {
            return addTokenToRequest$ext_okhttp_release(refresh, response.request().newBuilder()).build();
        }
        return null;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        okhttp3.Request.Builder addTokenToRequest$ext_okhttp_release;
        java.lang.String[] strArr;
        com.izettle.android.auth.okhttp.RequiresScopes requiresScopes;
        java.lang.Class<?> cls;
        java.lang.reflect.Method declaredMethod;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (kotlin.jvm.internal.Intrinsics.areEqual("NONE", request.headers().get("Authorization"))) {
            return chain.proceed(request.newBuilder().removeHeader("Authorization").build());
        }
        try {
            java.lang.Object tag = request.tag((java.lang.Class<? extends java.lang.Object>) getInvocationClass$ext_okhttp_release());
            java.lang.Object invoke = (tag == null || (cls = tag.getClass()) == null || (declaredMethod = cls.getDeclaredMethod("method", new java.lang.Class[0])) == null) ? null : declaredMethod.invoke(tag, new java.lang.Object[0]);
            java.lang.reflect.Method method = invoke instanceof java.lang.reflect.Method ? (java.lang.reflect.Method) invoke : null;
            if (method == null || (requiresScopes = (com.izettle.android.auth.okhttp.RequiresScopes) method.getAnnotation(com.izettle.android.auth.okhttp.RequiresScopes.class)) == null || (strArr = requiresScopes.value()) == null) {
                strArr = new java.lang.String[0];
            }
            addTokenToRequest$ext_okhttp_release = addTokenToRequest$ext_okhttp_release(this.accessTokenResolver.resolve((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)), request.newBuilder());
        } catch (java.lang.Exception unused) {
            addTokenToRequest$ext_okhttp_release = addTokenToRequest$ext_okhttp_release(this.accessTokenResolver.resolve(new java.lang.String[0]), request.newBuilder());
        }
        return chain.proceed(addTokenToRequest$ext_okhttp_release.build());
    }
}
