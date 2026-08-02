package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "", "entityTag", "", "etag", "(Lio/ktor/http/HeadersBuilder;Ljava/lang/String;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApplicationResponsePropertiesKt {
    public static final void etag(io.ktor.http.HeadersBuilder headersBuilder, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        headersBuilder.set(io.ktor.http.HttpHeaders.INSTANCE.getETag(), str);
    }
}
