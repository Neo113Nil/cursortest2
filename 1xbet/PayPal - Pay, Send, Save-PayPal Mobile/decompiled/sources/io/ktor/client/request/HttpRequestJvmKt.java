package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Ljava/net/URL;", "url", "Lio/ktor/http/URLBuilder;", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/net/URL;)Lio/ktor/http/URLBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "invoke", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/net/URL;)Lio/ktor/client/request/HttpRequestBuilder;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRequestJvmKt {
    public static final io.ktor.http.URLBuilder url(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.net.URL url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return io.ktor.http.URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }

    public static final io.ktor.client.request.HttpRequestBuilder invoke(io.ktor.client.request.HttpRequestBuilder.Companion companion, java.net.URL url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        url(httpRequestBuilder, url);
        return httpRequestBuilder;
    }
}
