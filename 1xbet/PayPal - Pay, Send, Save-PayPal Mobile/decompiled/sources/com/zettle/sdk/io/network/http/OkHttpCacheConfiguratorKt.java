package com.zettle.sdk.io.network.http;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/zettle/sdk/io/network/http/OkHttpCacheConfigurator;", "createOkHttpCacheConfigurator", "(Landroid/content/Context;)Lcom/zettle/sdk/io/network/http/OkHttpCacheConfigurator;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpCacheConfiguratorKt {
    public static final com.zettle.sdk.io.network.http.OkHttpCacheConfigurator createOkHttpCacheConfigurator(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.zettle.sdk.io.network.http.OkHttpCacheConfiguratorImpl();
    }
}
