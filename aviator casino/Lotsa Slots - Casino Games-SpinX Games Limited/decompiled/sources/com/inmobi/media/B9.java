package com.inmobi.media;

/* loaded from: classes5.dex */
public final class B9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.B4 f4618a;

    public B9(okhttp3.Interceptor[] interceptors, okhttp3.Interceptor[] networkInterceptors, okhttp3.Dispatcher dispatcher, com.inmobi.media.Gk timeoutConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f4618a = new com.inmobi.media.B4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final kotlinx.coroutines.Deferred a(com.inmobi.media.Ue request) {
        kotlinx.coroutines.Deferred async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.A9(this, request, null), 3, null);
        return async$default;
    }
}
