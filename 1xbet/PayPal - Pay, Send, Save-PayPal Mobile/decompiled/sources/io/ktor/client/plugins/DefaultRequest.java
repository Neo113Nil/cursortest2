package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\"\b\u0002\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest;", "", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Plugin", "DefaultRequestBuilder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultRequest {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.DefaultRequest.Companion INSTANCE = new io.ktor.client.plugins.DefaultRequest.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> key;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    private DefaultRequest(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/client/plugins/DefaultRequest;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/DefaultRequest;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/client/plugins/DefaultRequest;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.DefaultRequest$Plugin, reason: from kotlin metadata */
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, io.ktor.client.plugins.DefaultRequest> {
        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> getKey() {
            return io.ktor.client.plugins.DefaultRequest.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.client.plugins.DefaultRequest prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return new io.ktor.client.plugins.DefaultRequest(block, null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(io.ktor.client.plugins.DefaultRequest plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.DefaultRequest$Plugin$install$1(plugin, null));
        }

        public static final /* synthetic */ void access$mergeUrls(io.ktor.client.plugins.DefaultRequest.Companion companion, io.ktor.http.Url url, io.ktor.http.URLBuilder uRLBuilder) {
            if (uRLBuilder.getProtocolOrNull() == null) {
                uRLBuilder.setProtocolOrNull(url.getProtocolOrNull());
            }
            if (uRLBuilder.getHost().length() <= 0) {
                io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(url);
                URLBuilder.setProtocolOrNull(uRLBuilder.getProtocolOrNull());
                if (uRLBuilder.getPort() != 0) {
                    URLBuilder.setPort(uRLBuilder.getPort());
                }
                io.ktor.client.plugins.DefaultRequest.Companion companion2 = io.ktor.client.plugins.DefaultRequest.INSTANCE;
                java.util.List<java.lang.String> encodedPathSegments = URLBuilder.getEncodedPathSegments();
                java.util.List<java.lang.String> encodedPathSegments2 = uRLBuilder.getEncodedPathSegments();
                if (!encodedPathSegments2.isEmpty()) {
                    if (encodedPathSegments.isEmpty() || ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) encodedPathSegments2)).length() == 0) {
                        encodedPathSegments = encodedPathSegments2;
                    } else {
                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder((encodedPathSegments.size() + encodedPathSegments2.size()) - 1);
                        int size = encodedPathSegments.size();
                        for (int i = 0; i < size - 1; i++) {
                            createListBuilder.add(encodedPathSegments.get(i));
                        }
                        createListBuilder.addAll(encodedPathSegments2);
                        encodedPathSegments = kotlin.collections.CollectionsKt.build(createListBuilder);
                    }
                }
                URLBuilder.setEncodedPathSegments(encodedPathSegments);
                if (uRLBuilder.getEncodedFragment().length() > 0) {
                    URLBuilder.setEncodedFragment(uRLBuilder.getEncodedFragment());
                }
                io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
                io.ktor.util.StringValuesKt.appendAll(ParametersBuilder$default, URLBuilder.getEncodedParameters());
                URLBuilder.setEncodedParameters(uRLBuilder.getEncodedParameters());
                java.util.Iterator<T> it = ParametersBuilder$default.entries().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    if (!URLBuilder.getEncodedParameters().contains(str)) {
                        URLBuilder.getEncodedParameters().appendAll(str, list);
                    }
                }
                io.ktor.http.URLUtilsKt.takeFrom(uRLBuilder, URLBuilder);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJX\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\u0011J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\u0013J&\u0010\u0015\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0015\u0010\nJ-\u0010\u001b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u001e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\r\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0013R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/URLBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "url", "(Lkotlin/jvm/functions/Function1;)V", "", "scheme", com.datadog.android.log.LogAttributes.HOST, "", "port", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "urlString", "(Ljava/lang/String;)V", "Lio/ktor/util/Attributes;", "setAttributes", "", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", "key", "capability", "setCapability", "(Lio/ktor/client/engine/HttpClientEngineCapability;Ljava/lang/Object;)V", "unixSocket", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getHost", "()Ljava/lang/String;", "setHost", "getPort", "()I", "setPort", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultRequestBuilder implements io.ktor.http.HttpMessageBuilder {
        private final io.ktor.http.HeadersBuilder headers = new io.ktor.http.HeadersBuilder(0, 1, null);
        private final io.ktor.http.URLBuilder url = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, 511, null);
        private final io.ktor.util.Attributes attributes = io.ktor.util.AttributesJvmKt.Attributes(true);

        @Override // io.ktor.http.HttpMessageBuilder
        public final io.ktor.http.HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final io.ktor.http.URLBuilder getUrl() {
            return this.url;
        }

        public final io.ktor.util.Attributes getAttributes() {
            return this.attributes;
        }

        public final void url(kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            block.invoke(this.url);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void url$default(io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequestBuilder, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
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
                function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DefaultRequest$DefaultRequestBuilder$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder.m23249$r8$lambda$2ioRI_i7wLJ0DfvBY1RevhfQ3w((io.ktor.http.URLBuilder) obj2);
                    }
                };
            }
            defaultRequestBuilder.url(str, str2, num, str3, function1);
        }

        public final void url(java.lang.String scheme, java.lang.String host, java.lang.Integer port, java.lang.String path, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            io.ktor.http.URLBuilderKt.set(this.url, scheme, host, port, path, block);
        }

        public final void url(java.lang.String urlString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "");
            io.ktor.http.URLParserKt.takeFrom(this.url, urlString);
        }

        public final java.lang.String getHost() {
            return this.url.getHost();
        }

        public final void setHost(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url.setHost(str);
        }

        public final int getPort() {
            return this.url.getPort();
        }

        public final void setPort(int i) {
            this.url.setPort(i);
        }

        public final void setAttributes(kotlin.jvm.functions.Function1<? super io.ktor.util.Attributes, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            block.invoke(this.attributes);
        }

        public final <T> void setCapability(io.ktor.client.engine.HttpClientEngineCapability<T> key, T capability) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "");
            ((java.util.Map) this.attributes.computeIfAbsent(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.DefaultRequest$DefaultRequestBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder.m23248$r8$lambda$2TNr52RR7CZ8AqAgkucIe733SQ();
                }
            })).put(key, capability);
        }

        public final void unixSocket(java.lang.String path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
            setCapability(io.ktor.client.request.UnixSocketCapability.INSTANCE, new io.ktor.client.request.UnixSocketSettings(path));
        }

        /* renamed from: $r8$lambda$2TNr5-2RR7CZ8AqAgkucIe733SQ, reason: not valid java name */
        public static /* synthetic */ java.util.Map m23248$r8$lambda$2TNr52RR7CZ8AqAgkucIe733SQ() {
            return new java.util.LinkedHashMap();
        }

        /* renamed from: $r8$lambda$2ioRI_i7wLJ0Df-vBY1RevhfQ3w, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m23249$r8$lambda$2ioRI_i7wLJ0DfvBY1RevhfQ3w(io.ktor.http.URLBuilder uRLBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.DefaultRequest.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.DefaultRequest.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("DefaultRequest", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public /* synthetic */ DefaultRequest(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }
}
