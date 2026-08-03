package com.inmobi.media;

/* renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2927z9 {
    public static com.inmobi.media.B9 a(okhttp3.Interceptor[] interceptors, okhttp3.Dispatcher dispatcher, okhttp3.Interceptor[] networkInterceptors, com.inmobi.media.Gk timeoutConfig, int i) {
        if ((i & 1) != 0) {
            interceptors = new okhttp3.Interceptor[0];
        }
        if ((i & 2) != 0) {
            dispatcher = com.inmobi.media.H9.b;
        }
        if ((i & 4) != 0) {
            networkInterceptors = new okhttp3.Interceptor[0];
        }
        if ((i & 8) != 0) {
            timeoutConfig = new com.inmobi.media.Gk(60L, 60L, 60L);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        return new com.inmobi.media.B9(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
