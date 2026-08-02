package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/izettle/android/net/InterceptorChain;", "Lcom/izettle/android/net/Interceptor$Chain;", "", "Lcom/izettle/android/net/Interceptor;", "interceptors", "", "interceptorIndex", "Lcom/izettle/android/net/Request;", "request", "<init>", "(Ljava/util/List;ILcom/izettle/android/net/Request;)V", "Lcom/izettle/android/net/Response;", "", "proceed", "(Lcom/izettle/android/net/Request;)Lcom/izettle/android/net/Response;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/izettle/android/net/Request;", "getRequest", "()Lcom/izettle/android/net/Request;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InterceptorChain implements com.izettle.android.net.Interceptor.Chain {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<com.izettle.android.net.Interceptor> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final com.izettle.android.net.Request request;

    /* JADX WARN: Multi-variable type inference failed */
    public InterceptorChain(java.util.List<? extends com.izettle.android.net.Interceptor> list, int i, com.izettle.android.net.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.request = request;
    }

    public /* synthetic */ InterceptorChain(java.util.List list, int i, com.izettle.android.net.Request request, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i, request);
    }

    @Override // com.izettle.android.net.Interceptor.Chain
    public final com.izettle.android.net.Request getRequest() {
        return this.request;
    }

    @Override // com.izettle.android.net.Interceptor.Chain
    public final com.izettle.android.net.Response<java.lang.String> proceed(com.izettle.android.net.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoFpsRangesFor).intercept(new com.izettle.android.net.InterceptorChain(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor + 1, request));
    }
}
