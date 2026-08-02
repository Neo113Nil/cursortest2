package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/plugins/ServerResponseException;", "Lio/ktor/client/plugins/ResponseException;", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cachedResponseText", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ServerResponseException extends io.ktor.client.plugins.ResponseException {
    private final java.lang.String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerResponseException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.String str) {
        super(httpResponse, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Server error(");
        sb.append(httpResponse.getCall().getRequest().getMethod().getValue());
        sb.append(' ');
        sb.append(httpResponse.getCall().getRequest().getUrl());
        sb.append(": ");
        sb.append(httpResponse.getStatus());
        sb.append(". Text: \"");
        sb.append(str);
        sb.append('\"');
        this.message = sb.toString();
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.message;
    }
}
