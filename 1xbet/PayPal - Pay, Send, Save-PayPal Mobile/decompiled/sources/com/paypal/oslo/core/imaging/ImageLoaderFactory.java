package com.paypal.oslo.core.imaging;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0015\u0010\u0010\u001a\u00020\u000f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;", "", "Lokhttp3/Interceptor;", "datadogInterceptor", "<init>", "(Lokhttp3/Interceptor;)V", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Lcoil3/ImageLoader;", "create", "(Landroid/content/Context;)Lcoil3/ImageLoader;", "getHighSpeedVideoFpsRanges", "Lokhttp3/Interceptor;", "getHighSpeedVideoSizes", "Lokhttp3/OkHttpClient;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageLoaderFactory {
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.Interceptor getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ImageLoaderFactory(@com.paypal.oslo.core.telemetry.di.DatadogInterceptor okhttp3.Interceptor interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        this.getHighSpeedVideoSizes = interceptor;
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.imaging.ImageLoaderFactory$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                okhttp3.OkHttpClient build;
                build = new okhttp3.OkHttpClient.Builder().addInterceptor(com.paypal.oslo.core.imaging.ImageLoaderFactory.this.getHighSpeedVideoSizes).build();
                return build;
            }
        });
    }

    public final coil3.ImageLoader create(final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        coil3.ImageLoader.Builder diskCache = new coil3.ImageLoader.Builder(context).memoryCache(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.imaging.ImageLoaderFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.memory.MemoryCache build;
                build = new coil3.memory.MemoryCache.Builder().maxSizePercent(context, 0.2d).build();
                return build;
            }
        }).diskCache(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.imaging.ImageLoaderFactory$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.imaging.ImageLoaderFactory.$r8$lambda$SvZ52JZXvWaNoAzvBaYMiq1Zbbw(context);
            }
        });
        coil3.ComponentRegistry.Builder builder = new coil3.ComponentRegistry.Builder();
        builder.add(coil3.content.okhttp.OkHttpNetworkFetcher.factory((kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory>) new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.imaging.ImageLoaderFactory$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.imaging.ImageLoaderFactory.$r8$lambda$SrhNuIKeEllOuA_OrTNJ4u0BFAw(com.paypal.oslo.core.imaging.ImageLoaderFactory.this);
            }
        }), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coil3.Uri.class));
        return diskCache.components(builder.build()).build();
    }

    public static /* synthetic */ okhttp3.Call.Factory $r8$lambda$SrhNuIKeEllOuA_OrTNJ4u0BFAw(com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory) {
        return (okhttp3.OkHttpClient) imageLoaderFactory.Camera2StreamConfigurationMap.getValue();
    }

    public static /* synthetic */ coil3.disk.DiskCache $r8$lambda$SvZ52JZXvWaNoAzvBaYMiq1Zbbw(android.content.Context context) {
        coil3.disk.DiskCache.Builder builder = new coil3.disk.DiskCache.Builder();
        java.io.File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        return coil3.disk.DiskCacheKt.directory(builder, kotlin.io.FilesKt.resolve(cacheDir, "image_cache")).maxSizePercent(0.02d).build();
    }
}
