package com.paypal.oslo.core.network.rest.authtype;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/rest/authtype/OkHttpAuthTypeInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkHttpAuthTypeInterceptor implements okhttp3.Interceptor {
    @javax.inject.Inject
    public OkHttpAuthTypeInterceptor() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        retrofit2.Invocation invocation = (retrofit2.Invocation) request.tag(retrofit2.Invocation.class);
        java.util.Map map = null;
        java.lang.Object[] objArr = 0;
        java.lang.reflect.Method method = invocation != null ? invocation.method() : null;
        okhttp3.Request.Builder newBuilder = request.newBuilder();
        if (method != null && method.isAnnotationPresent(com.paypal.oslo.core.network.rest.noauth.NoAuth.class)) {
            newBuilder.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.NoAuthTag.class, (java.lang.Class) com.paypal.oslo.core.identity.NoAuthTag.INSTANCE);
        } else if (method != null && method.isAnnotationPresent(com.paypal.oslo.core.network.rest.clientauth.ClientAuth.class)) {
            newBuilder.tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.ClientAuthTag.class, (java.lang.Class) new com.paypal.oslo.core.identity.ClientAuthTag(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("rest_".concat(java.lang.String.valueOf(method.getName())), map, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0))));
        }
        return chain.proceed(newBuilder.build());
    }
}
