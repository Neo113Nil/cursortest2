package io.ktor.client.plugins;

/* compiled from: DefaultRequest.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\"\b\u0002\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest;", "", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "Plugin", "DefaultRequestBuilder", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultRequest {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.DefaultRequest.Companion INSTANCE = new io.ktor.client.plugins.DefaultRequest.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> key;
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> block;

    public /* synthetic */ DefaultRequest(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DefaultRequest(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> function1) {
        this.block = function1;
    }

    /* compiled from: DefaultRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/client/plugins/DefaultRequest;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/DefaultRequest;", com.ironsource.M6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/DefaultRequest;Lio/ktor/client/HttpClient;)V", "Lio/ktor/http/Url;", "baseUrl", "Lio/ktor/http/URLBuilder;", com.ironsource.mediationsdk.utils.IronSourceConstants.REQUEST_URL, "mergeUrls", "(Lio/ktor/http/Url;Lio/ktor/http/URLBuilder;)V", "", "", "parent", "child", "concatenatePath", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.DefaultRequest$Plugin, reason: from kotlin metadata */
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, io.ktor.client.plugins.DefaultRequest> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.util.AttributeKey<io.ktor.client.plugins.DefaultRequest> getKey() {
            return io.ktor.client.plugins.DefaultRequest.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public io.ktor.client.plugins.DefaultRequest prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            return new io.ktor.client.plugins.DefaultRequest(block, null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(io.ktor.client.plugins.DefaultRequest plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "plugin");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.DefaultRequest$Plugin$install$1(plugin, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void mergeUrls(io.ktor.http.Url baseUrl, io.ktor.http.URLBuilder requestUrl) {
            if (requestUrl.getProtocolOrNull() == null) {
                requestUrl.setProtocolOrNull(baseUrl.getProtocolOrNull());
            }
            if (requestUrl.getHost().length() > 0) {
                return;
            }
            io.ktor.http.URLBuilder URLBuilder = io.ktor.http.URLUtilsKt.URLBuilder(baseUrl);
            URLBuilder.setProtocolOrNull(requestUrl.getProtocolOrNull());
            if (requestUrl.getPort() != 0) {
                URLBuilder.setPort(requestUrl.getPort());
            }
            URLBuilder.setEncodedPathSegments(io.ktor.client.plugins.DefaultRequest.INSTANCE.concatenatePath(URLBuilder.getEncodedPathSegments(), requestUrl.getEncodedPathSegments()));
            if (requestUrl.getEncodedFragment().length() > 0) {
                URLBuilder.setEncodedFragment(requestUrl.getEncodedFragment());
            }
            io.ktor.http.ParametersBuilder ParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            io.ktor.util.StringValuesKt.appendAll(ParametersBuilder$default, URLBuilder.getEncodedParameters());
            URLBuilder.setEncodedParameters(requestUrl.getEncodedParameters());
            java.util.Iterator<T> it = ParametersBuilder$default.entries().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.util.List list = (java.util.List) entry.getValue();
                if (!URLBuilder.getEncodedParameters().contains(str)) {
                    URLBuilder.getEncodedParameters().appendAll(str, list);
                }
            }
            io.ktor.http.URLUtilsKt.takeFrom(requestUrl, URLBuilder);
        }

        private final java.util.List<java.lang.String> concatenatePath(java.util.List<java.lang.String> parent, java.util.List<java.lang.String> child) {
            if (child.isEmpty()) {
                return parent;
            }
            if (parent.isEmpty() || ((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) child)).length() == 0) {
                return child;
            }
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder((parent.size() + child.size()) - 1);
            int size = parent.size() - 1;
            for (int i = 0; i < size; i++) {
                createListBuilder.add(parent.get(i));
            }
            createListBuilder.addAll(child);
            return kotlin.collections.CollectionsKt.build(createListBuilder);
        }
    }

    /* compiled from: DefaultRequest.kt */
    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJX\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\u0011J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\u0013J&\u0010\u0015\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0015\u0010\nJ-\u0010\u001b\u001a\u00020\u0006\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\r\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0013R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "Lio/ktor/http/HttpMessageBuilder;", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/URLBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "url", "(Lkotlin/jvm/functions/Function1;)V", "", "scheme", "host", "", "port", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "urlString", "(Ljava/lang/String;)V", "Lio/ktor/util/Attributes;", "setAttributes", "", "T", "Lio/ktor/client/engine/HttpClientEngineCapability;", com.ironsource.X3.i.W, "capability", "setCapability", "(Lio/ktor/client/engine/HttpClientEngineCapability;Ljava/lang/Object;)V", "unixSocket", "Lio/ktor/http/HeadersBuilder;", "headers", "Lio/ktor/http/HeadersBuilder;", "getHeaders", "()Lio/ktor/http/HeadersBuilder;", "Lio/ktor/http/URLBuilder;", "getUrl", "()Lio/ktor/http/URLBuilder;", "attributes", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "value", "getHost", "()Ljava/lang/String;", "setHost", "getPort", "()I", "setPort", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultRequestBuilder implements io.ktor.http.HttpMessageBuilder {
        private final io.ktor.http.HeadersBuilder headers = new io.ktor.http.HeadersBuilder(0, 1, null);
        private final io.ktor.http.URLBuilder url = new io.ktor.http.URLBuilder(null, null, 0, null, null, null, null, null, false, androidx.core.app.FrameMetricsAggregator.EVERY_DURATION, null);
        private final io.ktor.util.Attributes attributes = io.ktor.util.AttributesJvmKt.Attributes(true);

        @Override // io.ktor.http.HttpMessageBuilder
        public io.ktor.http.HeadersBuilder getHeaders() {
            return this.headers;
        }

        public final io.ktor.http.URLBuilder getUrl() {
            return this.url;
        }

        public final io.ktor.util.Attributes getAttributes() {
            return this.attributes;
        }

        public final void url(kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
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
                        kotlin.Unit url$lambda$0;
                        url$lambda$0 = io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder.url$lambda$0((io.ktor.http.URLBuilder) obj2);
                        return url$lambda$0;
                    }
                };
            }
            defaultRequestBuilder.url(str, str2, num, str3, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit url$lambda$0(io.ktor.http.URLBuilder uRLBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "<this>");
            return kotlin.Unit.INSTANCE;
        }

        public final void url(java.lang.String scheme, java.lang.String host, java.lang.Integer port, java.lang.String path, kotlin.jvm.functions.Function1<? super io.ktor.http.URLBuilder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            io.ktor.http.URLBuilderKt.set(this.url, scheme, host, port, path, block);
        }

        public final void url(java.lang.String urlString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlString, "urlString");
            io.ktor.http.URLParserKt.takeFrom(this.url, urlString);
        }

        public final java.lang.String getHost() {
            return this.url.getHost();
        }

        public final void setHost(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.url.setHost(value);
        }

        public final int getPort() {
            return this.url.getPort();
        }

        public final void setPort(int i) {
            this.url.setPort(i);
        }

        public final void setAttributes(kotlin.jvm.functions.Function1<? super io.ktor.util.Attributes, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(this.attributes);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.util.Map setCapability$lambda$1() {
            return new java.util.LinkedHashMap();
        }

        public final <T> void setCapability(io.ktor.client.engine.HttpClientEngineCapability<T> key, T capability) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capability, "capability");
            ((java.util.Map) this.attributes.computeIfAbsent(io.ktor.client.engine.HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.DefaultRequest$DefaultRequestBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.Map capability$lambda$1;
                    capability$lambda$1 = io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder.setCapability$lambda$1();
                    return capability$lambda$1;
                }
            })).put(key, capability);
        }

        public final void unixSocket(java.lang.String path) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
            setCapability(io.ktor.client.request.UnixSocketCapability.INSTANCE, new io.ktor.client.request.UnixSocketSettings(path));
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
}
