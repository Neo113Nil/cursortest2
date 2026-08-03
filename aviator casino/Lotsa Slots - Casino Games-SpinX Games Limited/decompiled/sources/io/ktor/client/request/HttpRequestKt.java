package io.ktor.client.request;

/* compiled from: HttpRequest.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\t\u001a\u00020\u0007*\u00020\u000028\b\u0004\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0017\u001a\u00020\u0007*\u00020\u00112\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0019\u001a-\u0010\u001b\u001a\u00020\u0011*\u00020\u001a2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\\\u0010\u0017\u001a\u00020\u0007*\u00020\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0017\u0010\"\u001a_\u0010\u001b\u001a\u00020\u0011*\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\u000eH\u0086\u0002¢\u0006\u0004\b\u001b\u0010#\u001a\u0019\u0010\u0017\u001a\u00020\u0007*\u00020\u00112\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010%\u001a\u0013\u0010'\u001a\u00020&*\u00020\u0000H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010)\u001a\u00020&*\u00020\u0000H\u0007¢\u0006\u0004\b)\u0010(\u001a\u0013\u0010*\u001a\u00020&*\u00020\u0000H\u0007¢\u0006\u0004\b*\u0010(\"&\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"Lio/ktor/client/request/HttpRequestData;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", com.ironsource.X3.i.W, "value", "", "block", "forEachHeader", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/http/HttpMessageBuilder;", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "Lkotlin/ExtensionFunctionType;", "headers", "(Lio/ktor/http/HttpMessageBuilder;Lkotlin/jvm/functions/Function1;)Lio/ktor/http/HeadersBuilder;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequest;", "request", "takeFrom", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/request/HttpRequest;)Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/URLBuilder;", "url", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function1;)V", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "invoke", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;", "scheme", "host", "", "port", "path", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;", "urlString", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", "", "isUpgradeRequest", "(Lio/ktor/client/request/HttpRequestData;)Z", "isSseRequest", "isSseReconnectionRequest", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/request/ResponseAdapter;", "ResponseAdapterAttributeKey", "Lio/ktor/util/AttributeKey;", "getResponseAdapterAttributeKey", "()Lio/ktor/util/AttributeKey;", "getResponseAdapterAttributeKey$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestKt {
    private static final io.ktor.util.AttributeKey<io.ktor.client.request.ResponseAdapter> ResponseAdapterAttributeKey;

    public static /* synthetic */ void getResponseAdapterAttributeKey$annotations() {
    }

    public static final void forEachHeader(io.ktor.client.request.HttpRequestData httpRequestData, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        final boolean z = !io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData.getMethod()) && io.ktor.http.content.OutgoingContentKt.isEmpty(httpRequestData.getBody());
        io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData.getHeaders(), httpRequestData.getBody(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit>() { // from class: io.ktor.client.request.HttpRequestKt$forEachHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str, java.lang.String str2) {
                invoke2(str, str2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String key, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                if (z && kotlin.jvm.internal.Intrinsics.areEqual(key, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                block.invoke(key, value);
            }
        });
    }

    public static final io.ktor.http.HeadersBuilder headers(io.ktor.http.HttpMessageBuilder httpMessageBuilder, kotlin.jvm.functions.Function1<? super io.ktor.http.HeadersBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMessageBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.http.HeadersBuilder headers = httpMessageBuilder.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final io.ktor.client.request.HttpRequestBuilder takeFrom(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.request.HttpRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getContent());
        httpRequestBuilder.setBodyType((io.ktor.util.reflect.TypeInfo) httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey()));
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        io.ktor.util.AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }

    public static final void url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(httpRequestBuilder.getUrl());
    }

    public static final io.ktor.client.request.HttpRequestBuilder takeFrom(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.request.HttpRequestData request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        httpRequestBuilder.setMethod(request.getMethod());
        httpRequestBuilder.setBody(request.getBody());
        httpRequestBuilder.setBodyType((io.ktor.util.reflect.TypeInfo) httpRequestBuilder.getAttributes().getOrNull(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey()));
        io.ktor.http.URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), request.getUrl());
        httpRequestBuilder.getHeaders().appendAll(request.getHeaders());
        io.ktor.util.AttributesKt.putAll(httpRequestBuilder.getAttributes(), request.getAttributes());
        return httpRequestBuilder;
    }

    public static final io.ktor.client.request.HttpRequestBuilder invoke(io.ktor.client.request.HttpRequestBuilder.Companion companion, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        url(httpRequestBuilder, block);
        return httpRequestBuilder;
    }

    public static /* synthetic */ void url$default(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.HttpRequestKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit url$lambda$1;
                    url$lambda$1 = io.ktor.client.request.HttpRequestKt.url$lambda$1((io.ktor.http.URLBuilder) obj2);
                    return url$lambda$1;
                }
            };
        }
        url(httpRequestBuilder, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit url$lambda$1(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final void url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.http.URLBuilderKt.set(httpRequestBuilder.getUrl(), str, str2, num, str3, block);
    }

    public static /* synthetic */ io.ktor.client.request.HttpRequestBuilder invoke$default(io.ktor.client.request.HttpRequestBuilder.Companion companion, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.request.HttpRequestKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit invoke$lambda$2;
                    invoke$lambda$2 = io.ktor.client.request.HttpRequestKt.invoke$lambda$2((io.ktor.http.URLBuilder) obj2);
                    return invoke$lambda$2;
                }
            };
        }
        return invoke(companion, str, str2, num, str3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invoke$lambda$2(io.ktor.http.URLBuilder uRLBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.client.request.HttpRequestBuilder invoke(io.ktor.client.request.HttpRequestBuilder.Companion companion, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        url(httpRequestBuilder, str, str2, num, str3, block);
        return httpRequestBuilder;
    }

    public static final void url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String urlString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), urlString);
    }

    public static final boolean isUpgradeRequest(io.ktor.client.request.HttpRequestData httpRequestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        return httpRequestData.getBody() instanceof io.ktor.client.request.ClientUpgradeContent;
    }

    public static final boolean isSseRequest(io.ktor.client.request.HttpRequestData httpRequestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        return httpRequestData.getBody() instanceof io.ktor.client.plugins.sse.SSEClientContent;
    }

    public static final boolean isSseReconnectionRequest(io.ktor.client.request.HttpRequestData httpRequestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "<this>");
        return kotlin.jvm.internal.Intrinsics.areEqual(httpRequestData.getAttributes().getOrNull(io.ktor.client.plugins.sse.SSEKt.getSSEReconnectionRequestAttr()), (java.lang.Object) true);
    }

    public static final io.ktor.util.AttributeKey<io.ktor.client.request.ResponseAdapter> getResponseAdapterAttributeKey() {
        return ResponseAdapterAttributeKey;
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.request.ResponseAdapter.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.ResponseAdapter.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        ResponseAdapterAttributeKey = new io.ktor.util.AttributeKey<>("ResponseAdapterAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }
}
