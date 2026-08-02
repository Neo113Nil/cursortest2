package okhttp3.internal.cache;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CacheInterceptorKt {
    public static final /* synthetic */ okhttp3.Request access$requestForCache(okhttp3.Request request) {
        okhttp3.HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        return cacheUrlOverride != null ? (okhttp3.internal.http.HttpMethod.INSTANCE.isCacheable(request.method()) || kotlin.jvm.internal.Intrinsics.areEqual(request.method(), "POST")) ? request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build() : request : request;
    }
}
