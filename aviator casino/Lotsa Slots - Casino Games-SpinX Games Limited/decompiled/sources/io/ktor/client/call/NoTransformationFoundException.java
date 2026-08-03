package io.ktor.client.call;

/* compiled from: HttpClientCall.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "Lkotlin/reflect/KClass;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "to", "<init>", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NoTransformationFoundException extends java.lang.UnsupportedOperationException {
    private final java.lang.String message;

    public NoTransformationFoundException(io.ktor.client.statement.HttpResponse response, kotlin.reflect.KClass<?> from, kotlin.reflect.KClass<?> to) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
        this.message = kotlin.text.StringsKt.trimIndent("\n        Expected response body of the type '" + to + "' but was '" + from + "'\n        In response from `" + io.ktor.client.statement.HttpResponseKt.getRequest(response).getUrl() + "`\n        Response status `" + response.getStatus() + "`\n        Response header `ContentType: " + response.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType()) + "` \n        Request header `Accept: " + io.ktor.client.statement.HttpResponseKt.getRequest(response).getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getAccept()) + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.message;
    }
}
