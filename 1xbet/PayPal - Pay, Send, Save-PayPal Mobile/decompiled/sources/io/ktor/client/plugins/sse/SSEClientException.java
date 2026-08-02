package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/client/plugins/sse/SSEClientException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cause", "", "message", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SSEClientException extends java.lang.IllegalStateException {
    private final java.lang.Throwable cause;
    private final java.lang.String message;
    private final io.ktor.client.statement.HttpResponse response;

    public /* synthetic */ SSEClientException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : httpResponse, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str);
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }

    public SSEClientException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.Throwable th, java.lang.String str) {
        this.response = httpResponse;
        this.cause = th;
        this.message = str;
    }

    public SSEClientException() {
        this(null, null, null, 7, null);
    }
}
