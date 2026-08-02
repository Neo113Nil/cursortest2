package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/di/ChuckerModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/app/network/ChuckerConfig;", "chuckerConfig", "Lcom/paypal/oslo/app/network/ChuckerInterceptorProvider;", "provider", "Lokhttp3/Interceptor;", "provideChuckerInterceptor$app_prodRelease", "(Landroid/content/Context;Lcom/paypal/oslo/app/network/ChuckerConfig;Lcom/paypal/oslo/app/network/ChuckerInterceptorProvider;)Lokhttp3/Interceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class ChuckerModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.ChuckerModule INSTANCE = new com.paypal.oslo.app.di.ChuckerModule();

    private ChuckerModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    @com.paypal.oslo.app.di.ChuckerInterceptor
    public final okhttp3.Interceptor provideChuckerInterceptor$app_prodRelease(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.app.network.ChuckerConfig chuckerConfig, com.paypal.oslo.app.network.ChuckerInterceptorProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chuckerConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return com.paypal.oslo.app.network.ChuckerInterceptorProvider.create$default(provider, context, chuckerConfig, null, 4, null);
    }
}
