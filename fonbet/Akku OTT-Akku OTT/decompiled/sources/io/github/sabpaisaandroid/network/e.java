package io.github.sabpaisaandroid.network;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import io.flutter.plugins.firebase.auth.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n+ 2 RetrofitClientInstance.kt\nio/github/sabpaisaandroid/network/RetrofitClientInstance\n*L\n1#1,1079:1\n472#2,13:1080\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        return chain.proceed(request.newBuilder().addHeader(Constants.TOKEN, "").addHeader("Cache-control", "no-cache").addHeader(RtspHeaders.CONTENT_TYPE, "application/json").method(request.method(), request.body()).cacheControl(CacheControl.FORCE_NETWORK).build());
    }
}
