package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f11900a = new f();
    public static volatile OkHttpClient b;

    public final synchronized OkHttpClient a(PathProvider pathProvider) {
        OkHttpClient okHttpClient;
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        okHttpClient = b;
        if (okHttpClient == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder followSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
            ConfigManager.INSTANCE.getClass();
            long g = ConfigManager.g();
            int f = ConfigManager.f();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long min = Math.min(g, (PathProvider.a(absolutePath) * f) / 100);
            if (min > 0) {
                followSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), min));
            } else {
                boolean z = u.f12190a;
                com.vungle.ads.internal.util.t.c("AssetDownloader", "cache disk capacity size <=0, no clever cache active.");
            }
            okHttpClient = followSslRedirects.build();
            b = okHttpClient;
        }
        return okHttpClient;
    }
}
