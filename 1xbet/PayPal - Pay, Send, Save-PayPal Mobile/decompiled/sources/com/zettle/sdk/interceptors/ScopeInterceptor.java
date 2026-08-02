package com.zettle.sdk.interceptors;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/interceptors/ScopeInterceptor;", "Lokhttp3/Interceptor;", "Lcom/zettle/sdk/commons/network/Scope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/zettle/sdk/commons/network/Scope;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/commons/network/Scope;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScopeInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.Scope getHighSpeedVideoFpsRangesFor;

    public ScopeInterceptor(com.zettle.sdk.commons.network.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        this.getHighSpeedVideoFpsRangesFor = scope;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request().newBuilder().tag((java.lang.Class<? super java.lang.Class>) com.zettle.sdk.commons.network.Scope.class, (java.lang.Class) this.getHighSpeedVideoFpsRangesFor).build());
    }
}
