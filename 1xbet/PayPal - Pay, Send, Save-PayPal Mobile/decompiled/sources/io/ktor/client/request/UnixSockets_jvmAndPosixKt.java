package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "path", "", "unixSocket", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnixSockets_jvmAndPosixKt {
    public static final void unixSocket(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        httpRequestBuilder.setCapability(io.ktor.client.request.UnixSocketCapability.INSTANCE, new io.ktor.client.request.UnixSocketSettings(str));
    }
}
