package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00180\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0015"}, d2 = {"Lcom/datadog/android/okhttp/internal/OkHttpRequestInfo;", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "Lcom/datadog/android/api/instrumentation/network/ExtendedRequestInfo;", "Lcom/datadog/android/api/instrumentation/network/MutableHttpRequestInfo;", "Lokhttp3/Request;", "request", "<init>", "(Lokhttp3/Request;)V", "", "contentLength", "()Ljava/lang/Long;", "Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "newBuilder", "()Lcom/datadog/android/okhttp/internal/OkHttpRequestInfoBuilder;", "T", "Ljava/lang/Class;", "type", "tag", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "getContentType", "()Ljava/lang/String;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "", "getHeaders", "()Ljava/util/Map;", "headers", "getMethod", "method", "Lokhttp3/Request;", "getRequest$dd_sdk_android_okhttp_release", "()Lokhttp3/Request;", "getUrl", "url"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpRequestInfo implements com.datadog.android.api.instrumentation.network.HttpRequestInfo, com.datadog.android.api.instrumentation.network.ExtendedRequestInfo, com.datadog.android.api.instrumentation.network.MutableHttpRequestInfo {
    private final okhttp3.Request request;

    public OkHttpRequestInfo(okhttp3.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        this.request = request;
    }

    /* renamed from: getRequest$dd_sdk_android_okhttp_release, reason: from getter */
    public final okhttp3.Request getRequest() {
        return this.request;
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfo
    public final java.lang.String getMethod() {
        return this.request.method();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfo
    public final java.lang.String getUrl() {
        return this.request.url().toString();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfo
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders() {
        return this.request.headers().toMultimap();
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfo
    public final java.lang.String getContentType() {
        okhttp3.MediaType contentType;
        okhttp3.RequestBody body = this.request.body();
        if (body == null || (contentType = body.getContentType()) == null) {
            return null;
        }
        return contentType.toString();
    }

    @Override // com.datadog.android.api.instrumentation.network.ExtendedRequestInfo
    public final <T> T tag(java.lang.Class<? extends T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return (T) this.request.tag(type);
    }

    @Override // com.datadog.android.api.instrumentation.network.HttpRequestInfo
    public final java.lang.Long contentLength() {
        try {
            okhttp3.RequestBody body = this.request.body();
            if (body != null) {
                return java.lang.Long.valueOf(body.getContentLength());
            }
            return null;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // com.datadog.android.api.instrumentation.network.MutableHttpRequestInfo
    public final com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder newBuilder() {
        return new com.datadog.android.okhttp.internal.OkHttpRequestInfoBuilder(this.request.newBuilder());
    }
}
