package com.unity3d.services.core.network.mapper;

/* compiled from: HttpRequestToOkHttpRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0007¨\u0006\u000b"}, d2 = {"generateOkHttpBody", "Lokhttp3/RequestBody;", "body", "", "generateOkHttpProtobufBody", "generateOkHttpHeaders", "Lokhttp3/Headers;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "toOkHttpProtoRequest", "Lokhttp3/Request;", "toOkHttpRequest", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final okhttp3.RequestBody generateOkHttpBody(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            okhttp3.RequestBody create = okhttp3.RequestBody.create(okhttp3.MediaType.parse("text/plain;charset=utf-8"), (byte[]) obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return create;
        }
        if (obj instanceof java.lang.String) {
            okhttp3.RequestBody create2 = okhttp3.RequestBody.create(okhttp3.MediaType.parse("text/plain;charset=utf-8"), (java.lang.String) obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return create2;
        }
        okhttp3.RequestBody create3 = okhttp3.RequestBody.create(okhttp3.MediaType.parse("text/plain;charset=utf-8"), "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create3, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return create3;
    }

    private static final okhttp3.RequestBody generateOkHttpProtobufBody(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            okhttp3.RequestBody create = okhttp3.RequestBody.create(okhttp3.MediaType.parse(com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return create;
        }
        if (obj instanceof java.lang.String) {
            okhttp3.RequestBody create2 = okhttp3.RequestBody.create(okhttp3.MediaType.parse(com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF), (java.lang.String) obj);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return create2;
        }
        okhttp3.RequestBody create3 = okhttp3.RequestBody.create(okhttp3.MediaType.parse(com.unity3d.ads.gatewayclient.CommonGatewayClient.HEADER_PROTOBUF), "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create3, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return create3;
    }

    private static final okhttp3.Headers generateOkHttpHeaders(com.unity3d.services.core.network.model.HttpRequest httpRequest) {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : httpRequest.getHeaders().entrySet()) {
            builder.add(entry.getKey(), kotlin.collections.CollectionsKt.joinToString$default(entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        okhttp3.Headers build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return build;
    }

    public static final okhttp3.Request toOkHttpRequest(com.unity3d.services.core.network.model.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        okhttp3.Request.Builder url = new okhttp3.Request.Builder().url(kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.trim(httpRequest.getBaseURL(), kotlinx.io.files.FileSystemKt.UnixPathSeparator) + kotlinx.io.files.FileSystemKt.UnixPathSeparator + kotlin.text.StringsKt.trim(httpRequest.getPath(), kotlinx.io.files.FileSystemKt.UnixPathSeparator), (java.lang.CharSequence) com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING));
        java.lang.String requestType = httpRequest.getMethod().toString();
        java.lang.Object body = httpRequest.getBody();
        okhttp3.Request build = url.method(requestType, body != null ? generateOkHttpBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return build;
    }

    public static final okhttp3.Request toOkHttpProtoRequest(com.unity3d.services.core.network.model.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "<this>");
        okhttp3.Request.Builder url = new okhttp3.Request.Builder().url(kotlin.text.StringsKt.removeSuffix(kotlin.text.StringsKt.trim(httpRequest.getBaseURL(), kotlinx.io.files.FileSystemKt.UnixPathSeparator) + kotlinx.io.files.FileSystemKt.UnixPathSeparator + kotlin.text.StringsKt.trim(httpRequest.getPath(), kotlinx.io.files.FileSystemKt.UnixPathSeparator), (java.lang.CharSequence) com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING));
        java.lang.String requestType = httpRequest.getMethod().toString();
        java.lang.Object body = httpRequest.getBody();
        okhttp3.Request build = url.method(requestType, body != null ? generateOkHttpProtobufBody(body) : null).headers(generateOkHttpHeaders(httpRequest)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return build;
    }
}
