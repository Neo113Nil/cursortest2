package com.apollographql.apollo.network.http;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0013\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/apollographql/apollo/network/http/HttpCall;", "", "Lcom/apollographql/apollo/network/http/HttpEngine;", "engine", "Lcom/apollographql/apollo/api/http/HttpMethod;", "method", "", "url", "<init>", "(Lcom/apollographql/apollo/network/http/HttpEngine;Lcom/apollographql/apollo/api/http/HttpMethod;Ljava/lang/String;)V", "Lcom/apollographql/apollo/api/http/HttpBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lcom/apollographql/apollo/api/http/HttpBody;)Lcom/apollographql/apollo/network/http/HttpCall;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addHeader", "(Ljava/lang/String;Ljava/lang/String;)Lcom/apollographql/apollo/network/http/HttpCall;", "", "Lcom/apollographql/apollo/api/http/HttpHeader;", "headers", "addHeaders", "(Ljava/util/List;)Lcom/apollographql/apollo/network/http/HttpCall;", "Lcom/apollographql/apollo/api/ExecutionContext;", "executionContext", "addExecutionContext", "(Lcom/apollographql/apollo/api/ExecutionContext;)Lcom/apollographql/apollo/network/http/HttpCall;", "Lcom/apollographql/apollo/api/http/HttpResponse;", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/network/http/HttpEngine;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/api/http/HttpRequest$Builder;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpCall {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.HttpRequest.Builder Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.network.http.HttpEngine getHighSpeedVideoFpsRangesFor;

    public HttpCall(com.apollographql.apollo.network.http.HttpEngine httpEngine, com.apollographql.apollo.api.http.HttpMethod httpMethod, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = httpEngine;
        this.Camera2StreamConfigurationMap = new com.apollographql.apollo.api.http.HttpRequest.Builder(httpMethod, str);
    }

    public final com.apollographql.apollo.network.http.HttpCall body(com.apollographql.apollo.api.http.HttpBody body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
        this.Camera2StreamConfigurationMap.body(body);
        return this;
    }

    public final com.apollographql.apollo.network.http.HttpCall addHeader(java.lang.String name2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.Camera2StreamConfigurationMap.addHeader(name2, value);
        return this;
    }

    public final com.apollographql.apollo.network.http.HttpCall addHeaders(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        this.Camera2StreamConfigurationMap.addHeaders(headers);
        return this;
    }

    public final com.apollographql.apollo.network.http.HttpCall addExecutionContext(com.apollographql.apollo.api.ExecutionContext executionContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        this.Camera2StreamConfigurationMap.addExecutionContext(executionContext);
        return this;
    }

    public final com.apollographql.apollo.network.http.HttpCall headers(java.util.List<com.apollographql.apollo.api.http.HttpHeader> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        this.Camera2StreamConfigurationMap.headers(headers);
        return this;
    }

    public final java.lang.Object execute(kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.http.HttpResponse> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.execute(this.Camera2StreamConfigurationMap.build(), continuation);
    }
}
