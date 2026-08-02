package com.paypal.oslo.core.network.http.cache;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/network/http/cache/OfflineCachePolicyInterceptor;", "Lokhttp3/Interceptor;", "Lkotlin/Function0;", "", "isOnline", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineCachePolicyInterceptor implements okhttp3.Interceptor {
    public static final int HTTP_504_GATEWAY_TIMEOUT = 504;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private static final okhttp3.CacheControl getHighSpeedVideoSizes = new okhttp3.CacheControl.Builder().onlyIfCached().build();

    public OfflineCachePolicyInterceptor(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (this.getHighSpeedVideoFpsRangesFor.invoke().booleanValue() || !kotlin.jvm.internal.Intrinsics.areEqual(request.method(), "GET")) {
            return chain.proceed(request);
        }
        okhttp3.Request build = request.newBuilder().cacheControl(getHighSpeedVideoSizes).removeHeader(com.google.common.net.HttpHeaders.PRAGMA).build();
        try {
            return chain.proceed(build);
        } catch (java.io.IOException unused) {
            return new okhttp3.Response.Builder().request(build).protocol(okhttp3.Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody.INSTANCE, "", (okhttp3.MediaType) null, 1, (java.lang.Object) null)).build();
        }
    }
}
