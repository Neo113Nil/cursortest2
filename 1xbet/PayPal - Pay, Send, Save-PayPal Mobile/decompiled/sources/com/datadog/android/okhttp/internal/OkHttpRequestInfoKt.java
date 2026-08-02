package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lokhttp3/Request;", "request", "", "identifyRequest", "(Lokhttp3/Request;)Ljava/lang/String;", "", "generateUuid", "Lcom/datadog/android/rum/resource/ResourceId;", "buildResourceId", "(Lokhttp3/Request;Z)Lcom/datadog/android/rum/resource/ResourceId;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OkHttpRequestInfoKt {
    @kotlin.Deprecated(message = "This code will be replaced with RequestExt.kt and OkHttpHttpRequestInfo in the further releases.", replaceWith = @kotlin.ReplaceWith(expression = "rumNetworkInstrumentation.buildResourceId(OkHttpHttpRequestInfo(request).buildResourceId(generateUuid))", imports = {}))
    public static final com.datadog.android.rum.resource.ResourceId buildResourceId(okhttp3.Request request, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.UUID uuid = (java.util.UUID) request.tag(java.util.UUID.class);
        if (uuid == null) {
            uuid = z ? java.util.UUID.randomUUID() : null;
        }
        return new com.datadog.android.rum.resource.ResourceId(identifyRequest(request), uuid != null ? uuid.toString() : null);
    }

    @kotlin.Deprecated(message = "This code will be replaced with RequestExt.kt and OkHttpHttpRequestInfo in the further releases.", replaceWith = @kotlin.ReplaceWith(expression = "rumNetworkInstrumentation.buildResourceId(OkHttpHttpRequestInfo(request).buildResourceId(generateUuid))", imports = {}))
    public static final java.lang.String identifyRequest(okhttp3.Request request) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.String method = request.method();
        okhttp3.HttpUrl url = request.url();
        okhttp3.RequestBody body = request.body();
        if (body == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(method);
            sb.append("•");
            sb.append(url);
            return sb.toString();
        }
        try {
            j = body.getContentLength();
        } catch (java.io.IOException unused) {
            j = 0;
        }
        okhttp3.MediaType contentType = body.getContentType();
        if (contentType != null || j != 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(method);
            sb2.append("•");
            sb2.append(url);
            sb2.append("•");
            sb2.append(j);
            sb2.append("•");
            sb2.append(contentType);
            return sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(method);
        sb3.append("•");
        sb3.append(url);
        return sb3.toString();
    }
}
