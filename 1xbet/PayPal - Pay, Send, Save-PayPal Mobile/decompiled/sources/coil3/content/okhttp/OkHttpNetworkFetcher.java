package coil3.content.okhttp;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0005\u001a\u001b\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0001\u0010\u0007\u001a-\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0001\u0010\n\u001aI\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000bH\u0007¢\u0006\u0004\b\u0001\u0010\u0010\u001aW\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0004\b\u0001\u0010\u0013\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcoil3/network/NetworkFetcher$Factory;", "factory", "()Lcoil3/network/NetworkFetcher$Factory;", "Lokhttp3/Call$Factory;", "callFactory", "(Lokhttp3/Call$Factory;)Lcoil3/network/NetworkFetcher$Factory;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/network/CacheStrategy;", "cacheStrategy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcoil3/network/NetworkFetcher$Factory;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "Lcoil3/network/ConnectivityChecker;", "connectivityChecker", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/network/ConcurrentRequestStrategy;", "concurrentRequestStrategy", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcoil3/network/NetworkFetcher$Factory;", "Lcoil3/network/NetworkClient;", "asNetworkClient", "(Lokhttp3/Call$Factory;)Lcoil3/network/NetworkClient;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpNetworkFetcher {
    public static final coil3.network.NetworkFetcher.Factory factory() {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient(new okhttp3.OkHttpClient());
                return asNetworkClient;
            }
        }, null, null, null, 14, null);
    }

    public static final coil3.network.NetworkFetcher.Factory factory(final okhttp3.Call.Factory factory) {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient(okhttp3.Call.Factory.this);
                return asNetworkClient;
            }
        }, null, null, null, 14, null);
    }

    public static final coil3.network.NetworkFetcher.Factory factory(final kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0) {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient((okhttp3.Call.Factory) kotlin.jvm.functions.Function0.this.invoke());
                return asNetworkClient;
            }
        }, null, null, null, 14, null);
    }

    public static /* synthetic */ coil3.network.NetworkFetcher.Factory factory$default(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$4.getHighSpeedVideoFpsRangesFor;
        }
        if ((i & 2) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.content.CacheStrategy cacheStrategy;
                    cacheStrategy = coil3.content.CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            };
        }
        return factory(function0, function02);
    }

    public static final coil3.network.NetworkFetcher.Factory factory(final kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0, kotlin.jvm.functions.Function0<? extends coil3.content.CacheStrategy> function02) {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient((okhttp3.Call.Factory) kotlin.jvm.functions.Function0.this.invoke());
                return asNetworkClient;
            }
        }, function02, null, null, 12, null);
    }

    public static /* synthetic */ coil3.network.NetworkFetcher.Factory factory$default(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$7.getHighSpeedVideoSizes;
        }
        if ((i & 2) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.content.CacheStrategy cacheStrategy;
                    cacheStrategy = coil3.content.CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$9.getHighSpeedVideoFpsRanges;
        }
        return factory(function0, function02, function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ coil3.network.NetworkFetcher.Factory factory(final kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1) {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient((okhttp3.Call.Factory) kotlin.jvm.functions.Function0.this.invoke());
                return asNetworkClient;
            }
        }, function02, function1, null, 8, null);
    }

    public static /* synthetic */ coil3.network.NetworkFetcher.Factory factory$default(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$11.getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.content.CacheStrategy cacheStrategy;
                    cacheStrategy = coil3.content.CacheStrategy.DEFAULT;
                    return cacheStrategy;
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = coil3.content.okhttp.OkHttpNetworkFetcher$OkHttpNetworkFetcherFactory$13.getHighSpeedVideoSizes;
        }
        if ((i & 8) != 0) {
            function03 = new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    coil3.content.ConcurrentRequestStrategy concurrentRequestStrategy;
                    concurrentRequestStrategy = coil3.content.ConcurrentRequestStrategy.UNCOORDINATED;
                    return concurrentRequestStrategy;
                }
            };
        }
        return factory(function0, function02, function1, function03);
    }

    public static final coil3.network.NetworkFetcher.Factory factory(final kotlin.jvm.functions.Function0<? extends okhttp3.Call.Factory> function0, kotlin.jvm.functions.Function0<? extends coil3.content.CacheStrategy> function02, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends coil3.content.ConnectivityChecker> function1, kotlin.jvm.functions.Function0<? extends coil3.content.ConcurrentRequestStrategy> function03) {
        return new coil3.network.NetworkFetcher.Factory(new kotlin.jvm.functions.Function0() { // from class: coil3.network.okhttp.OkHttpNetworkFetcher$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                coil3.content.NetworkClient asNetworkClient;
                asNetworkClient = coil3.content.okhttp.OkHttpNetworkFetcher.asNetworkClient((okhttp3.Call.Factory) kotlin.jvm.functions.Function0.this.invoke());
                return asNetworkClient;
            }
        }, function02, function1, function03);
    }

    public static final coil3.content.NetworkClient asNetworkClient(okhttp3.Call.Factory factory) {
        return coil3.content.okhttp.internal.CallFactoryNetworkClient.m9784boximpl(coil3.content.okhttp.internal.CallFactoryNetworkClient.m9785constructorimpl(factory));
    }
}
