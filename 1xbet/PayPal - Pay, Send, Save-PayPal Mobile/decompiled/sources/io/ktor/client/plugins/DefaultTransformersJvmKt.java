package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/client/HttpClient;", "", "platformResponseDefaultTransformers", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/client/request/HttpRequestBuilder;", "context", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lio/ktor/http/content/OutgoingContent;", "platformRequestDefaultTransform", "(Lio/ktor/http/ContentType;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)Lio/ktor/http/content/OutgoingContent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultTransformersJvmKt {
    public static final void platformResponseDefaultTransformers(io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        httpClient.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getParse(), new io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(null));
    }

    public static final io.ktor.http.content.OutgoingContent platformRequestDefaultTransform(final io.ktor.http.ContentType contentType, final io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, final java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof java.io.InputStream) {
            return new io.ktor.http.content.OutgoingContent.ReadChannelContent(httpRequestBuilder, contentType, obj) { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformRequestDefaultTransform$1
                private final java.lang.Long contentLength;
                private final io.ktor.http.ContentType contentType;
                final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                {
                    this.getHighSpeedVideoFpsRanges = obj;
                    java.lang.String str = httpRequestBuilder.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                    this.contentLength = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
                    this.contentType = contentType == null ? io.ktor.http.ContentType.Application.INSTANCE.getOctetStream() : contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public final java.lang.Long getContentLength() {
                    return this.contentLength;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public final io.ktor.http.ContentType getContentType() {
                    return this.contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                /* renamed from: readFrom */
                public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
                    return io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannelWithArrayPool$default((java.io.InputStream) this.getHighSpeedVideoFpsRanges, null, null, 3, null);
                }
            };
        }
        return null;
    }
}
