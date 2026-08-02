package io.ktor.client.statement;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001a8'X¦\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/http/HttpMessage;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "requestTime", "getResponseTime", "responseTime", "Lio/ktor/utils/io/ByteReadChannel;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "getRawContent$annotations", "rawContent"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class HttpResponse implements io.ktor.http.HttpMessage, kotlinx.coroutines.CoroutineScope {
    public static /* synthetic */ void getRawContent$annotations() {
    }

    public abstract io.ktor.client.call.HttpClientCall getCall();

    public abstract io.ktor.utils.io.ByteReadChannel getRawContent();

    public abstract io.ktor.util.date.GMTDate getRequestTime();

    public abstract io.ktor.util.date.GMTDate getResponseTime();

    public abstract io.ktor.http.HttpStatusCode getStatus();

    public abstract io.ktor.http.HttpProtocolVersion getVersion();

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpResponse[");
        sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(this).getUrl());
        sb.append(", ");
        sb.append(getStatus());
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
