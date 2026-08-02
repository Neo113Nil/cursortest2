package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/network/http/DefaultHttpInterceptorChain;", "Lcom/apollographql/apollo/network/http/HttpInterceptorChain;", "", "Lcom/apollographql/apollo/network/http/HttpInterceptor;", "interceptors", "", "index", "<init>", "(Ljava/util/List;I)V", "Lcom/apollographql/apollo/api/http/HttpRequest;", "request", "Lcom/apollographql/apollo/api/http/HttpResponse;", "proceed", "(Lcom/apollographql/apollo/api/http/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultHttpInterceptorChain implements com.apollographql.apollo.network.http.HttpInterceptorChain {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.apollographql.apollo.network.http.HttpInterceptor> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultHttpInterceptorChain(java.util.List<? extends com.apollographql.apollo.network.http.HttpInterceptor> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // com.apollographql.apollo.network.http.HttpInterceptorChain
    public final java.lang.Object proceed(com.apollographql.apollo.api.http.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        if (this.getHighSpeedVideoFpsRanges >= this.getHighSpeedVideoSizes.size()) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        return this.getHighSpeedVideoSizes.get(this.getHighSpeedVideoFpsRanges).intercept(httpRequest, new com.apollographql.apollo.network.http.DefaultHttpInterceptorChain(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges + 1), continuation);
    }
}
