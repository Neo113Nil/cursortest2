package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lokhttp3/Request$Builder;", "", com.visa.cbp.sdk.facade.data.Constants.API_KEY, "addStatsigHeaders", "(Lokhttp3/Request$Builder;Ljava/lang/String;)Lokhttp3/Request$Builder;", "Lokhttp3/RequestBody;", "toJsonRequestBody", "(Ljava/lang/String;)Lokhttp3/RequestBody;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HttpUtilsKt {
    public static final /* synthetic */ okhttp3.Request.Builder addStatsigHeaders(okhttp3.Request.Builder builder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        builder.addHeader("Content-Type", com.statsig.androidsdk.HttpUtils.CONTENT_TYPE_HEADER_VALUE).addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_API_HEADER_KEY, str).addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_SDK_TYPE_KEY, "android-client").addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_SDK_VERSION_KEY, com.statsig.androidsdk.BuildConfig.VERSION_NAME).addHeader(com.statsig.androidsdk.HttpUtils.STATSIG_CLIENT_TIME_HEADER_KEY, java.lang.String.valueOf(java.lang.System.currentTimeMillis())).addHeader(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_KEY, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE);
        return builder;
    }

    public static final /* synthetic */ okhttp3.RequestBody toJsonRequestBody(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return okhttp3.RequestBody.INSTANCE.create(str, com.statsig.androidsdk.HttpUtils.INSTANCE.getJSON_MEDIA_TYPE$android_sdk_release());
    }
}
