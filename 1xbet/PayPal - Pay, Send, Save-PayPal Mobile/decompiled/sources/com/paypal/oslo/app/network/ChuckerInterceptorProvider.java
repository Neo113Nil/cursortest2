package com.paypal.oslo.app.network;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/app/network/ChuckerInterceptorProvider;", "", "<init>", "()V", "maxContentLengthBytes", "", "create", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "chuckerConfig", "Lcom/paypal/oslo/app/network/ChuckerConfig;", "collector", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "app_prodRelease", "chuckerInterceptor", "Lcom/chuckerteam/chucker/api/ChuckerInterceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChuckerInterceptorProvider {
    public static final int $stable = 0;
    private final long getHighSpeedVideoFpsRanges = 250000;

    @javax.inject.Inject
    public ChuckerInterceptorProvider() {
    }

    public static /* synthetic */ okhttp3.Interceptor create$default(com.paypal.oslo.app.network.ChuckerInterceptorProvider chuckerInterceptorProvider, android.content.Context context, com.paypal.oslo.app.network.ChuckerConfig chuckerConfig, com.chuckerteam.chucker.api.ChuckerCollector chuckerCollector, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            chuckerCollector = null;
        }
        return chuckerInterceptorProvider.create(context, chuckerConfig, chuckerCollector);
    }

    public final okhttp3.Interceptor create(final android.content.Context context, final com.paypal.oslo.app.network.ChuckerConfig chuckerConfig, final com.chuckerteam.chucker.api.ChuckerCollector collector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chuckerConfig, "");
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.network.ChuckerInterceptorProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.app.network.ChuckerInterceptorProvider.$r8$lambda$qUU0WJdEyEOlSr_5gR6HrxJE7kQ(context, collector, this);
            }
        });
        final okhttp3.Interceptor interceptor = new okhttp3.Interceptor() { // from class: com.paypal.oslo.app.network.ChuckerInterceptorProvider$$ExternalSyntheticLambda1
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                return com.paypal.oslo.app.network.ChuckerInterceptorProvider.$r8$lambda$R5dajgqyv7zI1OfzDivp9dI3n1Y(chain);
            }
        };
        return new okhttp3.Interceptor() { // from class: com.paypal.oslo.app.network.ChuckerInterceptorProvider$$ExternalSyntheticLambda2
            @Override // okhttp3.Interceptor
            public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                return com.paypal.oslo.app.network.ChuckerInterceptorProvider.$r8$lambda$QHkhiTv6dLWSiy7ZX0D0s_Qc7WQ(com.paypal.oslo.app.network.ChuckerConfig.this, interceptor, lazy, chain);
            }
        };
    }

    public static /* synthetic */ okhttp3.Response $r8$lambda$QHkhiTv6dLWSiy7ZX0D0s_Qc7WQ(com.paypal.oslo.app.network.ChuckerConfig chuckerConfig, okhttp3.Interceptor interceptor, kotlin.Lazy lazy, okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return chuckerConfig.isEnabled() ? ((com.chuckerteam.chucker.api.ChuckerInterceptor) lazy.getValue()).intercept(chain) : interceptor.intercept(chain);
    }

    public static /* synthetic */ okhttp3.Response $r8$lambda$R5dajgqyv7zI1OfzDivp9dI3n1Y(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        return chain.proceed(chain.request());
    }

    public static /* synthetic */ com.chuckerteam.chucker.api.ChuckerInterceptor $r8$lambda$qUU0WJdEyEOlSr_5gR6HrxJE7kQ(android.content.Context context, com.chuckerteam.chucker.api.ChuckerCollector chuckerCollector, com.paypal.oslo.app.network.ChuckerInterceptorProvider chuckerInterceptorProvider) {
        com.chuckerteam.chucker.api.ChuckerInterceptor.Builder builder = new com.chuckerteam.chucker.api.ChuckerInterceptor.Builder(context);
        if (chuckerCollector == null) {
            chuckerCollector = new com.chuckerteam.chucker.api.ChuckerCollector(context, false, null, 6, null);
        }
        return builder.collector(chuckerCollector).maxContentLength(chuckerInterceptorProvider.getHighSpeedVideoFpsRanges).alwaysReadResponseBody(false).build();
    }
}
