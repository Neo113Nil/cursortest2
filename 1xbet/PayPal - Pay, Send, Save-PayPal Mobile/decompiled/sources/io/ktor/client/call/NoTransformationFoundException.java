package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/getOutputMinFrameDuration;", "Lio/ktor/client/statement/HttpResponse;", "response", "Lkotlin/reflect/KClass;", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "<init>", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NoTransformationFoundException extends java.lang.UnsupportedOperationException {
    private final java.lang.String message;

    public NoTransformationFoundException(io.ktor.client.statement.HttpResponse httpResponse, kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n        Expected response body of the type '");
        sb.append(kClass2);
        sb.append("' but was '");
        sb.append(kClass);
        sb.append("'\n        In response from `");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getGetHighSpeedVideoFpsRanges());
        sb.append("`\n        Response status `");
        sb.append(httpResponse.getStatus());
        sb.append("`\n        Response header `ContentType: ");
        sb.append(httpResponse.getGetHighSpeedVideoSizesFor().get(io.ktor.http.HttpHeaders.INSTANCE.getContentType()));
        sb.append("` \n        Request header `Accept: ");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getGetHighSpeedVideoSizesFor().get(io.ktor.http.HttpHeaders.INSTANCE.getAccept()));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = kotlin.text.StringsKt.trimIndent(sb.toString());
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }
}
