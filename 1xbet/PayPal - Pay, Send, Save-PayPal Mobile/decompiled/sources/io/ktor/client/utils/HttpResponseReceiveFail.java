package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/client/utils/HttpResponseReceiveFail;", "", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cause", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpResponseReceiveFail {
    private final java.lang.Throwable cause;
    private final io.ktor.client.statement.HttpResponse response;

    public HttpResponseReceiveFail(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.response = httpResponse;
        this.cause = th;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }
}
