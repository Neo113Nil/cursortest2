package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010 \u001a\u00020\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020)8WX\u0096\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+"}, d2 = {"Lio/ktor/client/call/SavedHttpResponse;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/call/SavedHttpCall;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "origin", "<init>", "(Lio/ktor/client/call/SavedHttpCall;[BLio/ktor/client/statement/HttpResponse;)V", "Lio/ktor/client/call/SavedHttpCall;", "getCall", "()Lio/ktor/client/call/SavedHttpCall;", "getHighSpeedVideoSizes", "[B", "Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/http/HttpProtocolVersion;", "getVersion", "()Lio/ktor/http/HttpProtocolVersion;", "Lio/ktor/util/date/GMTDate;", "requestTime", "Lio/ktor/util/date/GMTDate;", "getRequestTime", "()Lio/ktor/util/date/GMTDate;", "responseTime", "getResponseTime", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/utils/io/ByteReadChannel;", "getRawContent", "()Lio/ktor/utils/io/ByteReadChannel;", "getRawContent$annotations", "()V", "rawContent"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SavedHttpResponse extends io.ktor.client.statement.HttpResponse {
    private final io.ktor.client.call.SavedHttpCall call;
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final byte[] getHighSpeedVideoSizes;
    private final io.ktor.http.Headers headers;
    private final io.ktor.util.date.GMTDate requestTime;
    private final io.ktor.util.date.GMTDate responseTime;
    private final io.ktor.http.HttpStatusCode status;
    private final io.ktor.http.HttpProtocolVersion version;

    public static /* synthetic */ void getRawContent$annotations() {
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.client.call.SavedHttpCall getCall() {
        return this.call;
    }

    public SavedHttpResponse(io.ktor.client.call.SavedHttpCall savedHttpCall, byte[] bArr, io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedHttpCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        this.call = savedHttpCall;
        this.getHighSpeedVideoSizes = bArr;
        this.status = httpResponse.getStatus();
        this.version = httpResponse.getVersion();
        this.requestTime = httpResponse.getRequestTime();
        this.responseTime = httpResponse.getResponseTime();
        this.headers = httpResponse.getHeaders();
        this.coroutineContext = httpResponse.getCoroutineContext();
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.http.HttpProtocolVersion getVersion() {
        return this.version;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.util.date.GMTDate getRequestTime() {
        return this.requestTime;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.util.date.GMTDate getResponseTime() {
        return this.responseTime;
    }

    @Override // io.ktor.http.HttpMessage
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.client.statement.HttpResponse
    public final io.ktor.utils.io.ByteReadChannel getRawContent() {
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(this.getHighSpeedVideoSizes, 0, 0, 6, null);
    }
}
