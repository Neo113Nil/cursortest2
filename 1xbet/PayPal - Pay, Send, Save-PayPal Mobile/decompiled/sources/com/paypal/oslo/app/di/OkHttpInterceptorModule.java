package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0013\b\u0001\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/app/di/OkHttpInterceptorModule;", "", "<init>", "()V", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "interceptors", "provideOkHttpInterceptors", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class OkHttpInterceptorModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.OkHttpInterceptorModule INSTANCE = new com.paypal.oslo.app.di.OkHttpInterceptorModule();

    private OkHttpInterceptorModule() {
    }

    @dagger.Provides
    public final java.util.List<okhttp3.Interceptor> provideOkHttpInterceptors(@com.paypal.oslo.app.di.AppOkHttpInterceptors java.util.List<okhttp3.Interceptor> interceptors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "");
        return interceptors;
    }
}
