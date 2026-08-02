package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001&B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpRequest;", "", "Lcom/apollographql/apollo/api/http/HttpMethod;", "p0", "", "p1", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "p2", "Lcom/apollographql/apollo/api/http/HttpBody;", "p3", "Lcom/apollographql/apollo/api/ExecutionContext;", "p4", "<init>", "(Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/lang/String;Ljava/util/List;Lcom/apollographql/apollo/api/http/HttpBody;Lcom/apollographql/apollo/api/ExecutionContext;)V", "method", "url", "Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "newBuilder", "(Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/lang/String;)Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "Lcom/apollographql/apollo/api/http/HttpMethod;", "getMethod", "()Lcom/apollographql/apollo/api/http/HttpMethod;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "headers", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lcom/apollographql/apollo/api/http/HttpBody;", "getBody", "()Lcom/apollographql/apollo/api/http/HttpBody;", "executionContext", "Lcom/apollographql/apollo/api/ExecutionContext;", "getExecutionContext", "()Lcom/apollographql/apollo/api/ExecutionContext;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequest {
    private final com.apollographql.apollo.api.http.HttpBody body;
    private final com.apollographql.apollo.api.ExecutionContext executionContext;
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers;
    private final com.apollographql.apollo.api.http.HttpMethod method;
    private final java.lang.String url;

    private HttpRequest(com.apollographql.apollo.api.http.HttpMethod httpMethod, java.lang.String str, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, com.apollographql.apollo.api.http.HttpBody httpBody, com.apollographql.apollo.api.ExecutionContext executionContext) {
        this.method = httpMethod;
        this.url = str;
        this.headers = list;
        this.body = httpBody;
        this.executionContext = executionContext;
    }

    public final com.apollographql.apollo.api.http.HttpMethod getMethod() {
        return this.method;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHeaders() {
        return this.headers;
    }

    public final com.apollographql.apollo.api.http.HttpBody getBody() {
        return this.body;
    }

    public final com.apollographql.apollo.api.ExecutionContext getExecutionContext() {
        return this.executionContext;
    }

    public static /* synthetic */ com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder$default(com.apollographql.apollo.api.http.HttpRequest httpRequest, com.apollographql.apollo.api.http.HttpMethod httpMethod, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpMethod = httpRequest.method;
        }
        if ((i & 2) != 0) {
            str = httpRequest.url;
        }
        return httpRequest.newBuilder(httpMethod, str);
    }

    public final com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder(com.apollographql.apollo.api.http.HttpMethod method, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        com.apollographql.apollo.api.http.HttpRequest.Builder builder = new com.apollographql.apollo.api.http.HttpRequest.Builder(method, url);
        com.apollographql.apollo.api.http.HttpBody httpBody = this.body;
        if (httpBody != null) {
            builder.body(httpBody);
        }
        builder.addHeaders(this.headers);
        builder.addExecutionContext(this.executionContext);
        return builder;
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0013J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpMethod;", "method", "", "url", "<init>", "(Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/http/HttpBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lcom/apollographql/apollo/api/http/HttpBody;)Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "addHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "addExecutionContext", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "Lcom/apollographql/apollo/api/http/HttpRequest;", "build", "()Lcom/apollographql/apollo/api/http/HttpRequest;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/api/http/HttpMethod;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/api/http/HttpBody;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "Lcom/apollographql/apollo/api/ExecutionContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private com.apollographql.apollo.api.ExecutionContext getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.apollographql.apollo.api.http.HttpBody getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.apollographql.apollo.api.http.HttpMethod Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoSizes;

        public Builder(com.apollographql.apollo.api.http.HttpMethod httpMethod, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.Camera2StreamConfigurationMap = httpMethod;
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = com.apollographql.apollo.api.ExecutionContext.Empty;
        }

        public final com.apollographql.apollo.api.http.HttpRequest.Builder body(com.apollographql.apollo.api.http.HttpBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            this.getHighSpeedVideoFpsRangesFor = body;
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpRequest.Builder addHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighResolutionOutputSizeshNQ4ISI.add(new com.apollographql.apollo.api.http.HttpHeader(name2, value));
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpRequest.Builder addHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpRequest.Builder addExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.plus(executionContext);
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpRequest.Builder headers(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpRequest build() {
            return new com.apollographql.apollo.api.http.HttpRequest(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null);
        }
    }

    public final com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder(com.apollographql.apollo.api.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        return newBuilder$default(this, httpMethod, null, 2, null);
    }

    public final com.apollographql.apollo.api.http.HttpRequest.Builder newBuilder() {
        return newBuilder$default(this, null, null, 3, null);
    }

    public /* synthetic */ HttpRequest(com.apollographql.apollo.api.http.HttpMethod httpMethod, java.lang.String str, java.util.List list, com.apollographql.apollo.api.http.HttpBody httpBody, com.apollographql.apollo.api.ExecutionContext executionContext, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(httpMethod, str, list, httpBody, executionContext);
    }
}
