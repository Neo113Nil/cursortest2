package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u0000\"\u0004\b\u0000\u0010\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "Lokhttp3/Request$Builder;", "requestBuilder", "<init>", "(Lokhttp3/Request$Builder;)V", "", "key", "", "values", "addHeader", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "T", "Ljava/lang/Class;", "type", "tag", "addTag", "(Ljava/lang/Class;Ljava/lang/Object;)Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "build", "()Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "removeHeader", "(Ljava/lang/String;)Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "method", "Lcom/datadog/android/api/instrumentation/network/HttpRequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "setMethod", "(Ljava/lang/String;Lcom/datadog/android/api/instrumentation/network/HttpRequestBody;)Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "url", "setUrl", "getHighSpeedVideoFpsRanges", "Lokhttp3/Request$Builder;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkHttpRequestInfoBuilder implements com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.Request.Builder getHighSpeedVideoFpsRangesFor;

    public OkHttpRequestInfoBuilder(okhttp3.Request.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        this.getHighSpeedVideoFpsRangesFor = builder;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final /* bridge */ /* synthetic */ com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder addTag(java.lang.Class cls, java.lang.Object obj) {
        return addTag((java.lang.Class<? super java.lang.Class>) cls, (java.lang.Class) obj);
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder replaceHeader(java.lang.String str, java.lang.String str2) {
        return com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder.DefaultImpls.replaceHeader(this, str, str2);
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder setUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        this.getHighSpeedVideoFpsRangesFor.url(url);
        return this;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder addHeader(java.lang.String key, java.lang.String... values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        for (java.lang.String str : values) {
            this.getHighSpeedVideoFpsRangesFor.addHeader(key, str);
        }
        return this;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder setMethod(java.lang.String method, com.datadog.android.api.instrumentation.network.HttpRequestBody body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        okhttp3.Request.Builder builder = this.getHighSpeedVideoFpsRangesFor;
        com.datadog.android.okhttp.internal.OkHttpRequestBody okHttpRequestBody = body instanceof com.datadog.android.okhttp.internal.OkHttpRequestBody ? (com.datadog.android.okhttp.internal.OkHttpRequestBody) body : null;
        builder.method(method, okHttpRequestBody != null ? okHttpRequestBody.getBody() : null);
        return this;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder removeHeader(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.removeHeader(key);
        return this;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final <T> com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder addTag(java.lang.Class<? super T> type, T tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoFpsRangesFor.tag((java.lang.Class<? super java.lang.Class<? super T>>) type, (java.lang.Class<? super T>) tag);
        return this;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder
    public final com.datadog.android.api.instrumentation.network.HttpRequestInfo build() {
        return new com.datadog.android.okhttp.internal.OkHttpRequestInfo(this.getHighSpeedVideoFpsRangesFor.build());
    }
}
