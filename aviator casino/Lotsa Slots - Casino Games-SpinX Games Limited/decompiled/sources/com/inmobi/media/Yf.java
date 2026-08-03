package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Yf {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.squareup.picasso.Picasso f5066a;
    public static final kotlinx.coroutines.sync.Mutex b = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    public static final java.util.ArrayList c = new java.util.ArrayList();
    public static final com.inmobi.media.Xf d = new com.inmobi.media.Xf();

    public static final com.squareup.picasso.Picasso a(android.content.Context context) {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        com.squareup.picasso.Picasso build = new com.squareup.picasso.Picasso.Builder(context).downloader(new com.squareup.picasso.OkHttp3Downloader(new okhttp3.OkHttpClient.Builder().addInterceptor(new com.inmobi.media.F8(((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getNative().getAssetConfig().getMaxImageSize() * 1024 * 1024)).build())).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static com.squareup.picasso.Picasso b(android.content.Context context) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.Uf(context, null), 1, null);
        return (com.squareup.picasso.Picasso) runBlocking$default;
    }
}
