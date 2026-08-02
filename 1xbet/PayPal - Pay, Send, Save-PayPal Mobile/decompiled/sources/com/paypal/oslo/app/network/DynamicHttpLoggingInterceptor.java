package com.paypal.oslo.app.network;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/network/DynamicHttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelProvider;", "levelProvider", "<init>", "(Lcom/paypal/oslo/app/network/NetworkLoggingLevelProvider;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelProvider;", "getHighSpeedVideoSizes", "Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/logging/HttpLoggingInterceptor;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DynamicHttpLoggingInterceptor implements okhttp3.Interceptor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.app.network.NetworkLoggingLevelProvider getHighSpeedVideoSizes;
    private final okhttp3.logging.HttpLoggingInterceptor getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final okhttp3.logging.HttpLoggingInterceptor getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Authorization", "Cookie", "Set-Cookie", "X-PayPal-ConsumerApp-Context", "paypal-client-metadata-id"});

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public DynamicHttpLoggingInterceptor(com.paypal.oslo.app.network.NetworkLoggingLevelProvider networkLoggingLevelProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoggingLevelProvider, "");
        this.getHighSpeedVideoSizes = networkLoggingLevelProvider;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        int i = 1;
        okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor = new okhttp3.logging.HttpLoggingInterceptor(null, i, 0 == true ? 1 : 0);
        java.util.Iterator<T> it = getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            httpLoggingInterceptor.redactHeader((java.lang.String) it.next());
        }
        this.getHighSpeedVideoFpsRanges = httpLoggingInterceptor;
        this.getHighSpeedVideoFpsRangesFor = new okhttp3.logging.HttpLoggingInterceptor(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        if (this.getHighSpeedVideoSizes.shouldRedactHeaders()) {
            httpLoggingInterceptor = this.getHighSpeedVideoFpsRanges;
        } else {
            httpLoggingInterceptor = this.getHighSpeedVideoFpsRangesFor;
        }
        httpLoggingInterceptor.level(this.getHighSpeedVideoSizes.getCurrentLevel());
        return httpLoggingInterceptor.intercept(chain);
    }
}
