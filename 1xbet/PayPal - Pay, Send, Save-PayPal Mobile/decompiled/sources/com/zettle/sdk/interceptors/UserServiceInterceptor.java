package com.zettle.sdk.interceptors;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/interceptors/UserServiceInterceptor;", "Lokhttp3/Interceptor;", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "serviceProvider", "<init>", "(Lcom/zettle/sdk/core/auth/ServiceProvider;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "Lokhttp3/HttpUrl;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "Lcom/zettle/sdk/core/auth/ServiceProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserServiceInterceptor implements okhttp3.Interceptor {
    private final com.zettle.sdk.core.auth.ServiceProvider getHighSpeedVideoSizes;

    public UserServiceInterceptor(com.zettle.sdk.core.auth.ServiceProvider serviceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        this.getHighSpeedVideoSizes = serviceProvider;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        java.lang.Object mo23162getServiceUrlsIoAF18A = this.getHighSpeedVideoSizes.mo23162getServiceUrlsIoAF18A(request.url().host());
        if (kotlin.Result.m23442isSuccessimpl(mo23162getServiceUrlsIoAF18A)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            mo23162getServiceUrlsIoAF18A = getHighSpeedVideoSizes(((com.izettle.android.auth.model.ServiceUrls) mo23162getServiceUrlsIoAF18A).getCurrent().getUrl());
        }
        java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(mo23162getServiceUrlsIoAF18A);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        okhttp3.HttpUrl httpUrl = (okhttp3.HttpUrl) m23436constructorimpl;
        return httpUrl == null ? chain.proceed(request) : chain.proceed(request.newBuilder().url(request.url().newBuilder().scheme(httpUrl.scheme()).host(httpUrl.host()).port(httpUrl.port()).username(httpUrl.username()).password(httpUrl.password()).build()).build());
    }

    private static okhttp3.HttpUrl getHighSpeedVideoSizes(java.lang.String str) {
        try {
            return okhttp3.HttpUrl.INSTANCE.get(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
