package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u001bB+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/izettle/android/net/Request;", "", "Lcom/izettle/android/net/HttpUrl;", "url", "Lcom/izettle/android/net/HttpMethod;", "method", "Lcom/izettle/android/net/Headers;", "headers", "Lcom/izettle/android/net/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lcom/izettle/android/net/HttpUrl;Lcom/izettle/android/net/HttpMethod;Lcom/izettle/android/net/Headers;Lcom/izettle/android/net/RequestBody;)V", "Lcom/izettle/android/net/Request$Builder;", "newBuilder", "()Lcom/izettle/android/net/Request$Builder;", "Lcom/izettle/android/net/RequestBody;", "getBody", "()Lcom/izettle/android/net/RequestBody;", "Lcom/izettle/android/net/Headers;", "getHeaders", "()Lcom/izettle/android/net/Headers;", "Lcom/izettle/android/net/HttpMethod;", "getMethod", "()Lcom/izettle/android/net/HttpMethod;", "Lcom/izettle/android/net/HttpUrl;", "getUrl", "()Lcom/izettle/android/net/HttpUrl;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Request {
    private final com.izettle.android.net.RequestBody body;
    private final com.izettle.android.net.Headers headers;
    private final com.izettle.android.net.HttpMethod method;
    private final com.izettle.android.net.HttpUrl url;

    public Request(com.izettle.android.net.HttpUrl httpUrl, com.izettle.android.net.HttpMethod httpMethod, com.izettle.android.net.Headers headers, com.izettle.android.net.RequestBody requestBody) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        this.url = httpUrl;
        this.method = httpMethod;
        this.headers = headers;
        this.body = requestBody;
    }

    public final com.izettle.android.net.HttpUrl getUrl() {
        return this.url;
    }

    public final com.izettle.android.net.HttpMethod getMethod() {
        return this.method;
    }

    public final com.izettle.android.net.Headers getHeaders() {
        return this.headers;
    }

    public final com.izettle.android.net.RequestBody getBody() {
        return this.body;
    }

    public final com.izettle.android.net.Request.Builder newBuilder() {
        return new com.izettle.android.net.Request.Builder(this);
    }

    @com.izettle.android.net.RequestDsl
    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0019\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0019\u0010\u0012J&\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u001b\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010 \u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b \u0010\u0012J&\u0010\"\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\"\u0010\u0012J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J&\u0010&\u001a\u00020\u00002\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b&\u0010\u0012J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010$R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u0010\u001d\u001a\u00020\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010(\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;"}, d2 = {"Lcom/izettle/android/net/Request$Builder;", "", "Lcom/izettle/android/net/Request;", "request", "<init>", "(Lcom/izettle/android/net/Request;)V", "()V", "Lcom/izettle/android/net/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "(Lcom/izettle/android/net/RequestBody;)Lcom/izettle/android/net/Request$Builder;", "build", "()Lcom/izettle/android/net/Request;", "Lkotlin/Function1;", "Lcom/izettle/android/net/FormUrlEncodedBody$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "formUrlEncodedBody", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/Request$Builder;", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/net/Request$Builder;", "Lcom/izettle/android/net/Headers;", "headers", "Lcom/izettle/android/net/JsonBody$Builder;", "jsonBody", "Lcom/izettle/android/net/HttpMethod;", "method", "(Lcom/izettle/android/net/HttpMethod;)Lcom/izettle/android/net/Request$Builder;", "Lcom/izettle/android/net/MultiPartBody$Builder$FormData;", "multiPartFormDataBody", "Lcom/izettle/android/net/MultiPartBody$Builder$Related;", "multiPartRelatedBody", "removeHeader", "(Ljava/lang/String;)Lcom/izettle/android/net/Request$Builder;", "Lcom/izettle/android/net/TextBody$Builder;", "textBody", "Lcom/izettle/android/net/HttpUrl;", "url", "(Lcom/izettle/android/net/HttpUrl;)Lcom/izettle/android/net/Request$Builder;", "Lcom/izettle/android/net/RequestBody;", "getBody", "()Lcom/izettle/android/net/RequestBody;", "setBody", "(Lcom/izettle/android/net/RequestBody;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/izettle/android/net/Headers;", "Camera2StreamConfigurationMap", "Lcom/izettle/android/net/HttpMethod;", "getMethod", "()Lcom/izettle/android/net/HttpMethod;", "setMethod", "(Lcom/izettle/android/net/HttpMethod;)V", "Lcom/izettle/android/net/HttpUrl;", "getUrl", "()Lcom/izettle/android/net/HttpUrl;", "setUrl", "(Lcom/izettle/android/net/HttpUrl;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Builder {
        private com.izettle.android.net.RequestBody body;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final com.izettle.android.net.Headers Camera2StreamConfigurationMap;
        private com.izettle.android.net.HttpMethod method;
        private com.izettle.android.net.HttpUrl url;

        public Builder() {
            this.Camera2StreamConfigurationMap = new com.izettle.android.net.Headers();
            this.method = com.izettle.android.net.HttpMethod.GET;
        }

        public final com.izettle.android.net.HttpUrl getUrl() {
            return this.url;
        }

        public final void setUrl(com.izettle.android.net.HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public final com.izettle.android.net.HttpMethod getMethod() {
            return this.method;
        }

        public final void setMethod(com.izettle.android.net.HttpMethod httpMethod) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
            this.method = httpMethod;
        }

        public final com.izettle.android.net.RequestBody getBody() {
            return this.body;
        }

        public final void setBody(com.izettle.android.net.RequestBody requestBody) {
            this.body = requestBody;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(com.izettle.android.net.Request request) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            com.izettle.android.net.Headers headers = this.Camera2StreamConfigurationMap;
            com.izettle.android.net.Headers headers2 = request.getHeaders();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headers2.size()));
            java.util.Iterator<T> it = headers2.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) entry.getValue()));
            }
            headers.putAll(linkedHashMap);
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
        }

        public final com.izettle.android.net.Request.Builder jsonBody(kotlin.jvm.functions.Function1<? super com.izettle.android.net.JsonBody.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.JsonBody.Builder builder = new com.izettle.android.net.JsonBody.Builder();
            block.invoke(builder);
            this.body = builder.build();
            return this;
        }

        public final com.izettle.android.net.Request.Builder formUrlEncodedBody(kotlin.jvm.functions.Function1<? super com.izettle.android.net.FormUrlEncodedBody.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.FormUrlEncodedBody.Builder builder = new com.izettle.android.net.FormUrlEncodedBody.Builder();
            block.invoke(builder);
            this.body = builder.build();
            return this;
        }

        public final com.izettle.android.net.Request.Builder multiPartFormDataBody(kotlin.jvm.functions.Function1<? super com.izettle.android.net.MultiPartBody.Builder.FormData, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.MultiPartBody.Builder.FormData formData = new com.izettle.android.net.MultiPartBody.Builder.FormData();
            block.invoke(formData);
            this.body = formData.build();
            return this;
        }

        public final com.izettle.android.net.Request.Builder multiPartRelatedBody(kotlin.jvm.functions.Function1<? super com.izettle.android.net.MultiPartBody.Builder.Related, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.MultiPartBody.Builder.Related related = new com.izettle.android.net.MultiPartBody.Builder.Related();
            block.invoke(related);
            this.body = related.build();
            return this;
        }

        public final com.izettle.android.net.Request.Builder textBody(kotlin.jvm.functions.Function1<? super com.izettle.android.net.TextBody.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.TextBody.Builder builder = new com.izettle.android.net.TextBody.Builder();
            block.invoke(builder);
            this.body = builder.build();
            return this;
        }

        public final com.izettle.android.net.Request.Builder body(com.izettle.android.net.RequestBody body) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "");
            this.body = body;
            return this;
        }

        public final com.izettle.android.net.Request.Builder method(com.izettle.android.net.HttpMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            this.method = method;
            return this;
        }

        public final com.izettle.android.net.Request.Builder url(com.izettle.android.net.HttpUrl url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            this.url = url;
            return this;
        }

        public final com.izettle.android.net.Request.Builder url(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            this.url = com.izettle.android.net.HttpUrl.INSTANCE.parse(url);
            return this;
        }

        public final com.izettle.android.net.Request.Builder header(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put((com.izettle.android.net.Headers) name2, (java.lang.String) kotlin.collections.CollectionsKt.mutableListOf(value));
            return this;
        }

        public final com.izettle.android.net.Request.Builder removeHeader(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.Camera2StreamConfigurationMap.remove((java.lang.Object) name2);
            return this;
        }

        public final com.izettle.android.net.Request.Builder headers(kotlin.jvm.functions.Function1<? super com.izettle.android.net.Headers, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.izettle.android.net.Headers headers = this.Camera2StreamConfigurationMap;
            com.izettle.android.net.Headers headers2 = new com.izettle.android.net.Headers();
            block.invoke(headers2);
            headers.putAll(headers2);
            return this;
        }

        public final com.izettle.android.net.Request build() {
            final com.izettle.android.net.RequestBody requestBody;
            com.izettle.android.net.HttpUrl httpUrl = this.url;
            if (httpUrl == null) {
                throw new java.lang.IllegalArgumentException("url must not be null".toString());
            }
            if (!this.Camera2StreamConfigurationMap.containsKey((java.lang.Object) "Content-Type") && (requestBody = this.body) != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(requestBody);
                this.Camera2StreamConfigurationMap.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.net.Request$Builder$build$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder) {
                        Camera2StreamConfigurationMap(builder);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void Camera2StreamConfigurationMap(com.izettle.android.net.Header.Builder builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        builder.setName("Content-Type");
                        builder.setValue(com.izettle.android.net.RequestBody.this.getContentType().getDisplayName());
                    }

                    {
                        super(1);
                    }
                });
            }
            if (!this.Camera2StreamConfigurationMap.containsKey((java.lang.Object) "Accept")) {
                this.Camera2StreamConfigurationMap.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.net.Request$Builder$build$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder) {
                        getHighSpeedVideoFpsRangesFor(builder);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.net.Header.Builder builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                        builder.setName("Accept");
                        builder.setValue(com.izettle.android.net.ContentType.INSTANCE.getAPPLICATION_JSON().getDisplayName());
                    }
                });
            }
            return new com.izettle.android.net.Request(httpUrl, this.method, this.Camera2StreamConfigurationMap, this.body);
        }
    }
}
