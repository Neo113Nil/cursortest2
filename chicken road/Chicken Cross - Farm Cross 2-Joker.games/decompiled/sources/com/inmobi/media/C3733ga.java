package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3733ga {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f7119a;

    public C3733ga(Interceptor[] interceptors, Interceptor[] networkInterceptors, Dispatcher dispatcher, Cm timeoutConfig) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.f7119a = new Y4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final Deferred a(Nf request) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(request, "request");
        async$default = BuildersKt__Builders_commonKt.async$default(AbstractC3904ma.d, null, null, new C3705fa(this, request, null), 3, null);
        return async$default;
    }
}
