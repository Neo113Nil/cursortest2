package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* renamed from: com.inmobi.media.ea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3676ea {
    public static C3733ga a(Interceptor[] interceptors, Dispatcher dispatcher, Interceptor[] networkInterceptors, Cm timeoutConfig, int i) {
        if ((i & 1) != 0) {
            interceptors = new Interceptor[0];
        }
        if ((i & 2) != 0) {
            dispatcher = AbstractC3904ma.b;
        }
        if ((i & 4) != 0) {
            networkInterceptors = new Interceptor[0];
        }
        if ((i & 8) != 0) {
            timeoutConfig = new Cm(60L, 60L, 60L);
        }
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        return new C3733ga(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
