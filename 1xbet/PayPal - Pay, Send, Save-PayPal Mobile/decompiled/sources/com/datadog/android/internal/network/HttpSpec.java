package com.datadog.android.internal.network;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/internal/network/HttpSpec;", "", "<init>", "()V", "ContentType", "Header", "Method", "StatusCode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpSpec {
    public static final com.datadog.android.internal.network.HttpSpec INSTANCE = new com.datadog.android.internal.network.HttpSpec();

    private HttpSpec() {
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\r"}, d2 = {"Lcom/datadog/android/internal/network/HttpSpec$Method;", "", "<init>", "()V", "", "method", "", "isMethodWithBody", "(Ljava/lang/String;)Z", "", "values", "()Ljava/util/List;", com.datadog.android.internal.network.HttpSpec.Method.CONNECT, "Ljava/lang/String;", com.datadog.android.internal.network.HttpSpec.Method.DELETE, "GET", com.datadog.android.internal.network.HttpSpec.Method.HEAD, "OPTIONS", "PATCH", "POST", com.datadog.android.internal.network.HttpSpec.Method.PUT, com.datadog.android.internal.network.HttpSpec.Method.TRACE}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Method {
        public static final java.lang.String CONNECT = "CONNECT";
        public static final java.lang.String DELETE = "DELETE";
        public static final java.lang.String GET = "GET";
        public static final java.lang.String HEAD = "HEAD";
        public static final com.datadog.android.internal.network.HttpSpec.Method INSTANCE = new com.datadog.android.internal.network.HttpSpec.Method();
        public static final java.lang.String OPTIONS = "OPTIONS";
        public static final java.lang.String PATCH = "PATCH";
        public static final java.lang.String POST = "POST";
        public static final java.lang.String PUT = "PUT";
        public static final java.lang.String TRACE = "TRACE";

        private Method() {
        }

        public final java.util.List<java.lang.String> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"GET", "POST", "PATCH", PUT, HEAD, DELETE, TRACE, "OPTIONS", CONNECT});
        }

        public final boolean isMethodWithBody(java.lang.String method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return kotlin.jvm.internal.Intrinsics.areEqual("POST", method) || kotlin.jvm.internal.Intrinsics.areEqual(PUT, method) || kotlin.jvm.internal.Intrinsics.areEqual("PATCH", method);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t"}, d2 = {"Lcom/datadog/android/internal/network/HttpSpec$Header;", "", "<init>", "()V", "", "", "values", "()Ljava/util/List;", "CONTENT_LENGTH", "Ljava/lang/String;", "CONTENT_TYPE", com.google.android.gms.stats.CodePackage.LOCATION, "RETRY_AFTER", "WEBSOCKET_ACCEPT_HEADER"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Header {
        public static final java.lang.String CONTENT_LENGTH = "Content-Length";
        public static final java.lang.String CONTENT_TYPE = "Content-Type";
        public static final com.datadog.android.internal.network.HttpSpec.Header INSTANCE = new com.datadog.android.internal.network.HttpSpec.Header();
        public static final java.lang.String LOCATION = "Location";
        public static final java.lang.String RETRY_AFTER = "Retry-After";
        public static final java.lang.String WEBSOCKET_ACCEPT_HEADER = "Sec-WebSocket-Accept";

        private Header() {
        }

        public final java.util.List<java.lang.String> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Content-Type", "Content-Length", "Location", "Retry-After", "Sec-WebSocket-Accept"});
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/datadog/android/internal/network/HttpSpec$StatusCode;", "", "<init>", "()V", "", "", "exclude", "", "clientErrors", "([I)Ljava/util/List;", "serverErrors", "()Ljava/util/List;", "values", "BAD_GATEWAY", com.visa.cbp.getEncExpo.warmup, "BAD_REQUEST", "FORBIDDEN", "FOUND", "GATEWAY_TIMEOUT", "INTERNAL_ERROR", "METHOD_NOT_ALLOWED", "MOVED_PERMANENTLY", "NETWORK_AUTHENTICATION_REQUIRED", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, "PERMANENT_REDIRECT", "REQUEST_TIMEOUT", "SEE_OTHER", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SERVICE_UNAVAILABLE, "TEMPORARY_REDIRECT", "TOO_MANY_REQUESTS", com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse.UNAUTHORIZED}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StatusCode {
        public static final int BAD_GATEWAY = 502;
        public static final int BAD_REQUEST = 400;
        public static final int FORBIDDEN = 403;
        public static final int FOUND = 302;
        public static final int GATEWAY_TIMEOUT = 504;
        public static final com.datadog.android.internal.network.HttpSpec.StatusCode INSTANCE = new com.datadog.android.internal.network.HttpSpec.StatusCode();
        public static final int INTERNAL_ERROR = 500;
        public static final int METHOD_NOT_ALLOWED = 405;
        public static final int MOVED_PERMANENTLY = 301;
        public static final int NETWORK_AUTHENTICATION_REQUIRED = 511;
        public static final int NOT_FOUND = 404;
        public static final int OK = 200;
        public static final int PERMANENT_REDIRECT = 308;
        public static final int REQUEST_TIMEOUT = 408;
        public static final int SEE_OTHER = 303;
        public static final int SERVICE_UNAVAILABLE = 503;
        public static final int TEMPORARY_REDIRECT = 307;
        public static final int TOO_MANY_REQUESTS = 429;
        public static final int UNAUTHORIZED = 401;

        private StatusCode() {
        }

        public final java.util.List<java.lang.Integer> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{200, 301, 302, 303, 307, 308, 400, 401, 403, 404, java.lang.Integer.valueOf(METHOD_NOT_ALLOWED), 408, 429, 500, 502, 503, 504, 511});
        }

        public final java.util.List<java.lang.Integer> clientErrors(int... exclude) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exclude, "");
            java.util.Set<java.lang.Integer> set = kotlin.collections.ArraysKt.toSet(exclude);
            java.util.List<java.lang.Integer> values = values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                if (!set.contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (((java.lang.Number) obj2).intValue() / 100 == 4) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        public final java.util.List<java.lang.Integer> serverErrors() {
            java.util.List<java.lang.Integer> values = values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : values) {
                if (((java.lang.Number) obj).intValue() / 100 == 5) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\r"}, d2 = {"Lcom/datadog/android/internal/network/HttpSpec$ContentType;", "", "<init>", "()V", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "isStream", "(Ljava/lang/String;)Z", "", "values", "()Ljava/util/List;", "APPLICATION_GRPC", "Ljava/lang/String;", "APPLICATION_GRPC_JSON", "APPLICATION_GRPC_PROTO", "APPLICATION_JSON", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "TEXT_EVENT_STREAM", "TEXT_PLAIN"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ContentType {
        public static final java.lang.String APPLICATION_JSON = "application/json";
        public static final java.lang.String TEXT_PLAIN = "text/plain";
        public static final com.datadog.android.internal.network.HttpSpec.ContentType INSTANCE = new com.datadog.android.internal.network.HttpSpec.ContentType();
        public static final java.lang.String TEXT_EVENT_STREAM = "text/event-stream";
        public static final java.lang.String APPLICATION_GRPC = "application/grpc";
        public static final java.lang.String APPLICATION_GRPC_PROTO = "application/grpc+proto";
        public static final java.lang.String APPLICATION_GRPC_JSON = "application/grpc+json";

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{TEXT_EVENT_STREAM, APPLICATION_GRPC, APPLICATION_GRPC_PROTO, APPLICATION_GRPC_JSON});

        private ContentType() {
        }

        public final java.util.List<java.lang.String> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"application/json", "text/plain", TEXT_EVENT_STREAM, APPLICATION_GRPC, APPLICATION_GRPC_PROTO, APPLICATION_GRPC_JSON});
        }

        public final boolean isStream(java.lang.String contentType) {
            return contentType != null && getHighSpeedVideoFpsRangesFor.contains(contentType);
        }
    }
}
