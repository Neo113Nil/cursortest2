package com.paypal.oslo.core.network.graphql.authtype;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/authtype/OkHttpAuthTypeInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkHttpAuthTypeInterceptor implements okhttp3.Interceptor {
    @javax.inject.Inject
    public OkHttpAuthTypeInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        java.lang.String header = request.header(com.paypal.oslo.core.network.graphql.AuthType.AUTH_TYPE_HEADER);
        if (header == null) {
            return chain.proceed(request);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.core.network.graphql.authtype.OkHttpAuthTypeInterceptor okHttpAuthTypeInterceptor = this;
            kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
            companion2.getSerializersModule();
            m23436constructorimpl = kotlin.Result.m23436constructorimpl((com.paypal.oslo.core.network.graphql.AuthType) companion2.decodeFromString(com.paypal.oslo.core.network.graphql.AuthType.INSTANCE.serializer(), header));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        com.paypal.oslo.core.network.graphql.AuthType authType = (com.paypal.oslo.core.network.graphql.AuthType) m23436constructorimpl;
        okhttp3.Request.Builder removeHeader = request.newBuilder().removeHeader(com.paypal.oslo.core.network.graphql.AuthType.AUTH_TYPE_HEADER);
        if (authType != null) {
            if (authType instanceof com.paypal.oslo.core.network.graphql.AuthType.None) {
                removeHeader.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.NoAuthTag.class, (java.lang.Class) com.paypal.oslo.core.identity.NoAuthTag.INSTANCE);
            } else if (authType instanceof com.paypal.oslo.core.network.graphql.AuthType.Client) {
                removeHeader.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.ClientAuthTag.class, (java.lang.Class) new com.paypal.oslo.core.identity.ClientAuthTag(((com.paypal.oslo.core.network.graphql.AuthType.Client) authType).getAuthenticationFlowInfo()));
            } else {
                if (!(authType instanceof com.paypal.oslo.core.network.graphql.AuthType.User)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                removeHeader.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.UserAuthTag.class, (java.lang.Class) new com.paypal.oslo.core.identity.UserAuthTag(((com.paypal.oslo.core.network.graphql.AuthType.User) authType).getAuthenticationContext()));
            }
        }
        return chain.proceed(removeHeader.build());
    }
}
