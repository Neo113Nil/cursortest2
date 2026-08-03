package io.ktor.http;

/* compiled from: ApplicationResponseProperties.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "", "entityTag", "", "etag", "(Lio/ktor/http/HeadersBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationResponsePropertiesKt {
    public static final void etag(io.ktor.http.HeadersBuilder headersBuilder, java.lang.String entityTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entityTag, "entityTag");
        headersBuilder.set(io.ktor.http.HttpHeaders.INSTANCE.getETag(), entityTag);
    }
}
