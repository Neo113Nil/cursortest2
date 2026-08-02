package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017"}, d2 = {"Lio/ktor/client/request/HttpResponseData;", "", "Lio/ktor/http/HttpStatusCode;", "statusCode", "Lio/ktor/util/date/GMTDate;", "requestTime", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/HttpProtocolVersion;", "version", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lkotlin/coroutines/CoroutineContext;", "callContext", "<init>", "(Lio/ktor/http/HttpStatusCode;Lio/ktor/util/date/GMTDate;Lio/ktor/http/Headers;Lio/ktor/http/HttpProtocolVersion;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "Ljava/lang/Object;", "getBody", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCallContext", "()Lkotlin/coroutines/CoroutineContext;", "responseTime", "getResponseTime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpResponseData {
    private final java.lang.Object body;
    private final kotlin.coroutines.CoroutineContext callContext;
    private final io.ktor.http.Headers headers;
    private final io.ktor.util.date.GMTDate requestTime;
    private final io.ktor.util.date.GMTDate responseTime;
    private final io.ktor.http.HttpStatusCode statusCode;
    private final io.ktor.http.HttpProtocolVersion version;

    public HttpResponseData(io.ktor.http.HttpStatusCode httpStatusCode, io.ktor.util.date.GMTDate gMTDate, io.ktor.http.Headers headers, io.ktor.http.HttpProtocolVersion httpProtocolVersion, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpStatusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpProtocolVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.statusCode = httpStatusCode;
        this.requestTime = gMTDate;
        this.headers = headers;
        this.version = httpProtocolVersion;
        this.body = obj;
        this.callContext = coroutineContext;
        this.responseTime = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
    }

    public final io.ktor.http.HttpStatusCode getStatusCode() {
        return this.statusCode;
    }

    public final io.ktor.util.date.GMTDate getRequestTime() {
        return this.requestTime;
    }

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final io.ktor.http.HttpProtocolVersion getVersion() {
        return this.version;
    }

    public final java.lang.Object getBody() {
        return this.body;
    }

    public final kotlin.coroutines.CoroutineContext getCallContext() {
        return this.callContext;
    }

    public final io.ktor.util.date.GMTDate getResponseTime() {
        return this.responseTime;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpResponseData=(statusCode=");
        sb.append(this.statusCode);
        sb.append(')');
        return sb.toString();
    }
}
