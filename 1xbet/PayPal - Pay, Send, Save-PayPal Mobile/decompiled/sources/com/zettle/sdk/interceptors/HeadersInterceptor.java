package com.zettle.sdk.interceptors;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/interceptors/HeadersInterceptor;", "Lokhttp3/Interceptor;", "", "Lkotlin/Pair;", "", "headers", "<init>", "(Ljava/util/List;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadersInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getHighResolutionOutputSizeshNQ4ISI;

    public HeadersInterceptor(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request.Builder newBuilder = chain.request().newBuilder();
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            newBuilder.header((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
        }
        return chain.proceed(newBuilder.build());
    }
}
