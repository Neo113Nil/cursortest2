package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class Ug {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Picasso f6893a;
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);
    public static final ArrayList c = new ArrayList();
    public static final Tg d = new Tg();

    public static final Picasso a(Context context) {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Picasso build = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new OkHttpClient.Builder().addInterceptor(new C3760h9(((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize() * 1024 * 1024)).build())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static Picasso b(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new Qg(context, null), 1, null);
        return (Picasso) runBlocking$default;
    }
}
