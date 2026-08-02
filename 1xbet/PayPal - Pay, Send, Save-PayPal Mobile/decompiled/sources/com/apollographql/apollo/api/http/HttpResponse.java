package com.apollographql.apollo.api.http;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001 B3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse;", "", "", "p0", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "p1", "Lokio/BufferedSource;", "p2", "Lokio/ByteString;", "p3", "<init>", "(ILjava/util/List;Lokio/BufferedSource;Lokio/ByteString;)V", "Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "newBuilder", "()Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "statusCode", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "()I", "headers", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "getHighSpeedVideoSizes", "Lokio/BufferedSource;", "getHighSpeedVideoFpsRanges", "Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "getBody", "()Lokio/BufferedSource;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpResponse {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okio.ByteString getHighResolutionOutputSizeshNQ4ISI;
    private final okio.BufferedSource getHighSpeedVideoSizes;
    private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers;
    private final int statusCode;

    private HttpResponse(int i, java.util.List<com.apollographql.apollo.api.http.HttpHeader> list, okio.BufferedSource bufferedSource, okio.ByteString byteString) {
        this.statusCode = i;
        this.headers = list;
        this.getHighSpeedVideoSizes = bufferedSource;
        this.getHighResolutionOutputSizeshNQ4ISI = byteString;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHeaders() {
        return this.headers;
    }

    public final okio.BufferedSource getBody() {
        okio.BufferedSource bufferedSource = this.getHighSpeedVideoSizes;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        okio.ByteString byteString = this.getHighResolutionOutputSizeshNQ4ISI;
        return byteString != null ? new okio.Buffer().write(byteString) : null;
    }

    public final com.apollographql.apollo.api.http.HttpResponse.Builder newBuilder() {
        com.apollographql.apollo.api.http.HttpResponse.Builder builder = new com.apollographql.apollo.api.http.HttpResponse.Builder(this.statusCode);
        okio.BufferedSource bufferedSource = this.getHighSpeedVideoSizes;
        if (bufferedSource != null) {
            builder.body(bufferedSource);
        }
        okio.ByteString byteString = this.getHighResolutionOutputSizeshNQ4ISI;
        if (byteString != null) {
            builder.body(byteString);
        }
        builder.addHeaders(this.headers);
        return builder;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "", "", "statusCode", "<init>", "(I)V", "Lokio/BufferedSource;", "bodySource", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lokio/BufferedSource;)Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "Lokio/ByteString;", "bodyString", "(Lokio/ByteString;)Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "addHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/api/http/HttpResponse$Builder;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "build", "()Lcom/apollographql/apollo/api/http/HttpResponse;", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lokio/BufferedSource;", "getHighSpeedVideoFpsRanges", "Lokio/ByteString;", "getHighResolutionOutputSizeshNQ4ISI", "", "Camera2StreamConfigurationMap", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.List<com.apollographql.apollo.api.http.HttpHeader> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private okio.ByteString getHighResolutionOutputSizeshNQ4ISI;
        private okio.BufferedSource getHighSpeedVideoFpsRangesFor;
        private final int statusCode;

        public Builder(int i) {
            this.statusCode = i;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final com.apollographql.apollo.api.http.HttpResponse.Builder body(okio.BufferedSource bodySource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodySource, "");
            if (this.getHighSpeedVideoFpsRangesFor != null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
                throw new java.lang.IllegalStateException("body() can only be called once".toString());
            }
            this.getHighSpeedVideoFpsRangesFor = bodySource;
            return this;
        }

        @kotlin.Deprecated(message = "Use body(BufferedSource) instead", replaceWith = @kotlin.ReplaceWith(expression = "Buffer().write(bodyString)", imports = {"okio.Buffer"}))
        public final com.apollographql.apollo.api.http.HttpResponse.Builder body(okio.ByteString bodyString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyString, "");
            if (this.getHighSpeedVideoFpsRangesFor != null || this.getHighResolutionOutputSizeshNQ4ISI != null) {
                throw new java.lang.IllegalStateException("body() can only be called once".toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bodyString;
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpResponse.Builder addHeader(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoFpsRanges.add(new com.apollographql.apollo.api.http.HttpHeader(name2, value));
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpResponse.Builder addHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighSpeedVideoFpsRanges.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpResponse.Builder headers(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
            this.getHighSpeedVideoFpsRanges.clear();
            this.getHighSpeedVideoFpsRanges.addAll(headers);
            return this;
        }

        public final com.apollographql.apollo.api.http.HttpResponse build() {
            return new com.apollographql.apollo.api.http.HttpResponse(this.statusCode, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null);
        }
    }

    public /* synthetic */ HttpResponse(int i, java.util.List list, okio.BufferedSource bufferedSource, okio.ByteString byteString, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, bufferedSource, byteString);
    }
}
