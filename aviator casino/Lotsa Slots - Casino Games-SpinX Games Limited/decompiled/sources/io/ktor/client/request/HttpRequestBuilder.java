package io.ktor.client.request;

/* compiled from: HttpRequest.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\u00062\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u001b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R*\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00168\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010:\u001a\u0004\u0018\u0001052\b\u0010.\u001a\u0004\u0018\u0001058F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010<\u001a\u00020;2\u0006\u0010.\u001a\u00020;8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010B\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/http/URLBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "url", "(Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/client/request/HttpRequestData;", "build", "()Lio/ktor/client/request/HttpRequestData;", "Lkotlin/Function1;", "Lio/ktor/util/Attributes;", "setAttributes", "(Lkotlin/jvm/functions/Function1;)V", "builder", "takeFromWithExecutionContext", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequestBuilder;", "takeFrom", "", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", com.ironsource.X3.i.W, "capability", "setCapability", "(Lio/ktor/client/engine/HttpClientEngineCapability;Ljava/lang/Object;)V", "getCapabilityOrNull", "(Lio/ktor/client/engine/HttpClientEngineCapability;)Ljava/lang/Object;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "Lio/ktor/http/HttpMethod;", "method", "Lio/ktor/http/HttpMethod;", "getMethod", "()Lio/ktor/http/HttpMethod;", "setMethod", "(Lio/ktor/http/HttpMethod;)V", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "value", "body", "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", "setBody", "(Ljava/lang/Object;)V", "Lio/ktor/util/reflect/TypeInfo;", "getBodyType", "()Lio/ktor/util/reflect/TypeInfo;", "setBodyType", "(Lio/ktor/util/reflect/TypeInfo;)V", "bodyType", "Lkotlinx/coroutines/Job;", "executionContext", "Lkotlinx/coroutines/Job;", "getExecutionContext", "()Lkotlinx/coroutines/Job;", "setExecutionContext$ktor_client_core", "(Lkotlinx/coroutines/Job;)V", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestBuilder implements io.ktor.http.HttpMessageBuilder {
    private final io.ktor.http.URLBuilder url = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null);
    private io.ktor.http.HttpMethod method = io.ktor.http.HttpMethod.INSTANCE.getGet();
    private final io.ktor.http.HeadersBuilder headers = new io.ktor.http.HeadersBuilder(0, 1, null);
    private java.lang.Object body = io.ktor.client.utils.EmptyContent.INSTANCE;
    private kotlinx.coroutines.Job executionContext = kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
    private final io.ktor.util.Attributes attributes = io.ktor.util.AttributesJvmKt.Attributes(true);

    public final io.ktor.http.URLBuilder getUrl() {
        return this.url;
    }

    public final io.ktor.http.HttpMethod getMethod() {
        return this.method;
    }

    public final void setMethod(io.ktor.http.HttpMethod httpMethod) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "<set-?>");
        this.method = httpMethod;
    }

    @Override // io.ktor.http.HttpMessageBuilder
    public io.ktor.http.HeadersBuilder getHeaders() {
        return this.headers;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final void setBody(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.body = obj;
    }

    public final io.ktor.util.reflect.TypeInfo getBodyType() {
        return (io.ktor.util.reflect.TypeInfo) this.attributes.getOrNull(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey());
    }

    public final void setBodyType(io.ktor.util.reflect.TypeInfo typeInfo) {
        if (typeInfo != null) {
            this.attributes.put(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey(), typeInfo);
        } else {
            this.attributes.remove(io.ktor.client.request.RequestBodyKt.getBodyTypeAttributeKey());
        }
    }

    public final kotlinx.coroutines.Job getExecutionContext() {
        return this.executionContext;
    }

    public final void setExecutionContext$ktor_client_core(kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "<set-?>");
        this.executionContext = job;
    }

    public final io.ktor.util.Attributes getAttributes() {
        return this.attributes;
    }

    public final void url(kotlin.jvm.functions.Function2<? super io.ktor.http.URLBuilder, ? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.http.URLBuilder uRLBuilder = this.url;
        block.invoke(uRLBuilder, uRLBuilder);
    }

    public final io.ktor.client.request.HttpRequestData build() {
        io.ktor.http.Url build = this.url.build();
        io.ktor.http.HttpMethod httpMethod = this.method;
        io.ktor.http.Headers build2 = getHeaders().build();
        java.lang.Object obj = this.body;
        io.ktor.http.content.OutgoingContent outgoingContent = obj instanceof io.ktor.http.content.OutgoingContent ? (io.ktor.http.content.OutgoingContent) obj : null;
        if (outgoingContent != null) {
            return new io.ktor.client.request.HttpRequestData(build, httpMethod, build2, outgoingContent, this.executionContext, this.attributes);
        }
        throw new java.lang.IllegalStateException(("No request transformation found: " + this.body).toString());
    }

    public final void setAttributes(kotlin.jvm.functions.Function1<? super io.ktor.util.Attributes, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this.attributes);
    }

    public final io.ktor.client.request.HttpRequestBuilder takeFromWithExecutionContext(io.ktor.client.request.HttpRequestBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.executionContext = builder.executionContext;
        return takeFrom(builder);
    }

    public final io.ktor.client.request.HttpRequestBuilder takeFrom(io.ktor.client.request.HttpRequestBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.method = builder.method;
        this.body = builder.body;
        setBodyType(builder.getBodyType());
        io.ktor.http.URLUtilsKt.takeFrom(this.url, builder.url);
        io.ktor.http.URLBuilder uRLBuilder = this.url;
        uRLBuilder.setEncodedPathSegments(uRLBuilder.getEncodedPathSegments());
        io.ktor.util.StringValuesKt.appendAll(getHeaders(), builder.getHeaders());
        io.ktor.util.AttributesKt.putAll(this.attributes, builder.attributes);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map setCapability$lambda$0() {
        return new java.util.LinkedHashMap();
    }

    public final <T> void setCapability(io.ktor.client.engine.HttpClientEngineCapability<T> key, T capability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "capability");
        ((java.util.Map) this.attributes.computeIfAbsent(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.HttpRequestBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Map capability$lambda$0;
                capability$lambda$0 = io.ktor.client.request.HttpRequestBuilder.setCapability$lambda$0();
                return capability$lambda$0;
            }
        })).put(key, capability);
    }

    public final <T> T getCapabilityOrNull(io.ktor.client.engine.HttpClientEngineCapability<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.util.Map map = (java.util.Map) this.attributes.getOrNull(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }
}
