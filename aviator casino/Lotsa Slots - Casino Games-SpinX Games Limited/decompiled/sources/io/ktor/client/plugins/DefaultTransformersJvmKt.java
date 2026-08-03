package io.ktor.client.plugins;

/* compiled from: DefaultTransformersJvm.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/HttpClient;", "", "platformResponseDefaultTransformers", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lio/ktor/client/request/HttpRequestBuilder;", "context", "", "body", "Lio/ktor/http/content/OutgoingContent;", "platformRequestDefaultTransform", "(Lio/ktor/http/ContentType;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultTransformersJvmKt {
    public static final void platformResponseDefaultTransformers(io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "<this>");
        httpClient.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getParse(), new io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(null));
    }

    public static final io.ktor.http.content.OutgoingContent platformRequestDefaultTransform(final io.ktor.http.ContentType contentType, final io.ktor.client.request.HttpRequestBuilder context, final java.lang.Object body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        if (body instanceof java.io.InputStream) {
            return new io.ktor.http.content.OutgoingContent.ReadChannelContent(context, contentType, body) { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformRequestDefaultTransform$1
                final /* synthetic */ java.lang.Object $body;
                private final java.lang.Long contentLength;
                private final io.ktor.http.ContentType contentType;

                {
                    this.$body = body;
                    java.lang.String str = context.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                    this.contentLength = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
                    this.contentType = contentType == null ? io.ktor.http.ContentType.Application.INSTANCE.getOctetStream() : contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.contentLength;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public io.ktor.utils.io.ByteReadChannel readFrom() {
                    return io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannelWithArrayPool$default((java.io.InputStream) this.$body, null, null, 3, null);
                }
            };
        }
        return null;
    }
}
