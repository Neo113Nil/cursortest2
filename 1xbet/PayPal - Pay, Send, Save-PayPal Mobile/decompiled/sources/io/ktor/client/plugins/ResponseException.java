package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "Lio/ktor/client/statement/HttpResponse;", "response", "", "cachedResponseText", "<init>", "(Lio/ktor/client/statement/HttpResponse;Ljava/lang/String;)V", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class ResponseException extends java.lang.IllegalStateException {
    private final transient io.ktor.client.statement.HttpResponse response;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ResponseException(io.ktor.client.statement.HttpResponse httpResponse, java.lang.String str) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad response: ");
        sb.append(httpResponse);
        sb.append(". Text: \"");
        sb.append(str);
        sb.append('\"');
        this.response = httpResponse;
    }

    public final io.ktor.client.statement.HttpResponse getResponse() {
        return this.response;
    }
}
