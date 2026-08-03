package io.ktor.client.plugins;

/* compiled from: HttpPlainText.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpPlainTextConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Charsets", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpPlainText", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpPlainText", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpPlainTextKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpPlainText");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpPlainTextConfig> HttpPlainText = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpPlainText", io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpPlainTextKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpPlainText$lambda$6;
            HttpPlainText$lambda$6 = io.ktor.client.plugins.HttpPlainTextKt.HttpPlainText$lambda$6((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpPlainText$lambda$6;
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpPlainTextConfig> getHttpPlainText() {
        return HttpPlainText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpPlainText$lambda$6(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        java.util.List<kotlin.Pair> sortedWith = kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.MapsKt.toList(((io.ktor.client.plugins.HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsetQuality$ktor_client_core()), new java.util.Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Float) ((kotlin.Pair) t2).getSecond(), (java.lang.Float) ((kotlin.Pair) t).getSecond());
            }
        });
        java.nio.charset.Charset responseCharsetFallback = ((io.ktor.client.plugins.HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getResponseCharsetFallback();
        java.util.Set<java.nio.charset.Charset> charsets$ktor_client_core = ((io.ktor.client.plugins.HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsets$ktor_client_core();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : charsets$ktor_client_core) {
            if (!((io.ktor.client.plugins.HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getCharsetQuality$ktor_client_core().containsKey((java.nio.charset.Charset) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List<java.nio.charset.Charset> sortedWith2 = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(io.ktor.utils.io.charsets.CharsetJVMKt.getName((java.nio.charset.Charset) t), io.ktor.utils.io.charsets.CharsetJVMKt.getName((java.nio.charset.Charset) t2));
            }
        });
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.nio.charset.Charset charset : sortedWith2) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset));
        }
        for (kotlin.Pair pair : sortedWith) {
            java.nio.charset.Charset charset2 = (java.nio.charset.Charset) pair.component1();
            float floatValue = ((java.lang.Number) pair.component2()).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d = floatValue;
            if (0.0d > d || d > 1.0d) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            sb.append(io.ktor.utils.io.charsets.CharsetJVMKt.getName(charset2) + ";q=" + (kotlin.math.MathKt.roundToInt(100 * floatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(io.ktor.utils.io.charsets.CharsetJVMKt.getName(responseCharsetFallback));
        }
        java.lang.String sb2 = sb.toString();
        java.nio.charset.Charset sendCharset = ((io.ktor.client.plugins.HttpPlainTextConfig) createClientPlugin.getPluginConfig()).getSendCharset();
        if (sendCharset == null && (sendCharset = (java.nio.charset.Charset) kotlin.collections.CollectionsKt.firstOrNull(sortedWith2)) == null) {
            kotlin.Pair pair2 = (kotlin.Pair) kotlin.collections.CollectionsKt.firstOrNull(sortedWith);
            sendCharset = pair2 != null ? (java.nio.charset.Charset) pair2.getFirst() : null;
            if (sendCharset == null) {
                sendCharset = kotlin.text.Charsets.UTF_8;
            }
        }
        createClientPlugin.on(io.ktor.client.plugins.RenderRequestHook.INSTANCE, new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$1(sb2, sendCharset, null));
        createClientPlugin.transformResponseBody(new io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$2$2(responseCharsetFallback, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.http.content.OutgoingContent HttpPlainText$lambda$6$wrapContent(java.nio.charset.Charset charset, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str, io.ktor.http.ContentType contentType) {
        java.nio.charset.Charset charset2;
        io.ktor.http.ContentType plain = contentType == null ? io.ktor.http.ContentType.Text.INSTANCE.getPlain() : contentType;
        if (contentType != null && (charset2 = io.ktor.http.ContentTypesKt.charset(contentType)) != null) {
            charset = charset2;
        }
        LOGGER.trace("Sending request body to " + httpRequestBuilder.getUrl() + " as text/plain with charset " + charset);
        return new io.ktor.http.content.TextContent(str, io.ktor.http.ContentTypesKt.withCharset(plain, charset), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String HttpPlainText$lambda$6$read(java.nio.charset.Charset charset, io.ktor.client.call.HttpClientCall httpClientCall, kotlinx.io.Source source) {
        java.nio.charset.Charset charset2 = io.ktor.http.HttpMessagePropertiesKt.charset(httpClientCall.getResponse());
        if (charset2 != null) {
            charset = charset2;
        }
        LOGGER.trace("Reading response body for " + httpClientCall.getRequest().getUrl() + " as String with charset " + charset);
        return io.ktor.utils.io.core.StringsKt.readText$default(source, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HttpPlainText$lambda$6$addCharsetHeaders(java.lang.String str, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        if (httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getAcceptCharset()) != null) {
            return;
        }
        LOGGER.trace("Adding Accept-Charset=" + str + " to " + httpRequestBuilder.getUrl());
        httpRequestBuilder.getHeaders().set(io.ktor.http.HttpHeaders.INSTANCE.getAcceptCharset(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Charsets(io.ktor.client.HttpClientConfig<?> httpClientConfig, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpPlainTextConfig, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpPlainText, block);
    }
}
