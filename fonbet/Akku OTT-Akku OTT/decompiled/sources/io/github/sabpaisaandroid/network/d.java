package io.github.sabpaisaandroid.network;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n+ 2 RetrofitClientInstance.kt\nio/github/sabpaisaandroid/network/RetrofitClientInstance\n*L\n1#1,1079:1\n424#2,11:1080\n*E\n"})
/* loaded from: classes3.dex */
public final class d implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        return chain.proceed(request.newBuilder().addHeader("Cache-control", "no-cache").method(request.method(), request.body()).build());
    }
}
